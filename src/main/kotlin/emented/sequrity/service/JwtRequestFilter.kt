package emented.sequrity.service

import emented.sequrity.bearer.CustomBearerToken
import emented.sequrity.bearer.CustomBearerUser
import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.LoggerFactory
import org.springframework.http.HttpHeaders
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter

@Component
class JwtRequestFilter(
    private val jwtTokenUtil: JwtTokenUtil,
) : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain,
    ) {
        val requestTokenHeader = getTokenHeader(request)
        requestTokenHeader?.let {
            try {
                if (jwtTokenUtil.validateAccessToken(it)) {
                    val (userId, roles) = jwtTokenUtil.getInfoFromAccessToken(it)
                    if (SecurityContextHolder.getContext().authentication == null) {
                        val customBearerToken = CustomBearerToken(CustomBearerUser(userId, roles))
                        SecurityContextHolder.getContext().authentication = customBearerToken
                    }
                }
            } catch (e: UsernameNotFoundException) {
                LOG.error("Username not found: {}", e.message)
            }
        }
        filterChain.doFilter(request, response)
    }

    private fun getTokenHeader(request: HttpServletRequest): String? {
        val requestTokenHeader = request.getHeader(HttpHeaders.AUTHORIZATION)
        return if (requestTokenHeader != null && requestTokenHeader.startsWith(TOKEN_PREFIX)) {
            requestTokenHeader.substring(TOKEN_PREFIX.length)
        } else {
            null
        }
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(JwtRequestFilter::class.java)
        private const val TOKEN_PREFIX = "Bearer "
    }
}
