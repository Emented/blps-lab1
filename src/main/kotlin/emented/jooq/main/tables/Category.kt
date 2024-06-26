/*
 * This file is generated by jOOQ.
 */
package emented.jooq.main.tables


import emented.jooq.main.Public
import emented.jooq.main.keys.CATEGORY_PKEY
import emented.jooq.main.keys.COMMUNITY_EVENT__COMMUNITY_EVENT_CATEGORY_ID_FKEY
import emented.jooq.main.keys.COMMUNITY__COMMUNITY_CATEGORY_ID_FKEY
import emented.jooq.main.tables.Community.CommunityPath
import emented.jooq.main.tables.CommunityEvent.CommunityEventPath
import emented.jooq.main.tables.records.CategoryRecord

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Category(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, CategoryRecord>?,
    parentPath: InverseForeignKey<out Record, CategoryRecord>?,
    aliased: Table<CategoryRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<CategoryRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.category</code>
         */
        val CATEGORY: Category = Category()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CategoryRecord> = CategoryRecord::class.java

    /**
     * The column <code>public.category.id</code>.
     */
    val ID: TableField<CategoryRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.category.name</code>.
     */
    val NAME: TableField<CategoryRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<CategoryRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<CategoryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<CategoryRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.category</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.category</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.category</code> table reference
     */
    constructor(): this(DSL.name("category"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CategoryRecord>?, parentPath: InverseForeignKey<out Record, CategoryRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, CATEGORY, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class CategoryPath : Category, Path<CategoryRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CategoryRecord>?, parentPath: InverseForeignKey<out Record, CategoryRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<CategoryRecord>): super(alias, aliased)
        override fun `as`(alias: String): CategoryPath = CategoryPath(DSL.name(alias), this)
        override fun `as`(alias: Name): CategoryPath = CategoryPath(alias, this)
        override fun `as`(alias: Table<*>): CategoryPath = CategoryPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<CategoryRecord, Long?> = super.getIdentity() as Identity<CategoryRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<CategoryRecord> = CATEGORY_PKEY

    private lateinit var _community: CommunityPath

    /**
     * Get the implicit to-many join path to the <code>public.community</code>
     * table
     */
    fun community(): CommunityPath {
        if (!this::_community.isInitialized)
            _community = CommunityPath(this, null, COMMUNITY__COMMUNITY_CATEGORY_ID_FKEY.inverseKey)

        return _community;
    }

    val community: CommunityPath
        get(): CommunityPath = community()

    private lateinit var _communityEvent: CommunityEventPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.community_event</code> table
     */
    fun communityEvent(): CommunityEventPath {
        if (!this::_communityEvent.isInitialized)
            _communityEvent = CommunityEventPath(this, null, COMMUNITY_EVENT__COMMUNITY_EVENT_CATEGORY_ID_FKEY.inverseKey)

        return _communityEvent;
    }

    val communityEvent: CommunityEventPath
        get(): CommunityEventPath = communityEvent()
    override fun `as`(alias: String): Category = Category(DSL.name(alias), this)
    override fun `as`(alias: Name): Category = Category(alias, this)
    override fun `as`(alias: Table<*>): Category = Category(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Category = Category(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Category = Category(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Category = Category(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Category = Category(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Category = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Category = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Category = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Category = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Category = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Category = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Category = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Category = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Category = where(DSL.notExists(select))
}
