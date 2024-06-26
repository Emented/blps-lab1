/*
 * This file is generated by jOOQ.
 */
package emented.jooq.main.tables.records


import emented.jooq.main.tables.User

import java.time.LocalDate

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class UserRecord() : UpdatableRecordImpl<UserRecord>(User.USER) {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var email: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var username: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var password: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var birthDate: LocalDate?
        set(value): Unit = set(4, value)
        get(): LocalDate? = get(4) as LocalDate?

    open var activity: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised UserRecord
     */
    constructor(id: Long? = null, email: String? = null, username: String? = null, password: String? = null, birthDate: LocalDate? = null, activity: Long? = null): this() {
        this.id = id
        this.email = email
        this.username = username
        this.password = password
        this.birthDate = birthDate
        this.activity = activity
        resetChangedOnNotNull()
    }
}
