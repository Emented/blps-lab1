/*
 * This file is generated by jOOQ.
 */
package emented.jooq.main.tables


import emented.jooq.main.Public
import emented.jooq.main.keys.QRTZ_SIMPROP_TRIGGERS_PKEY
import emented.jooq.main.keys.QRTZ_SIMPROP_TRIGGERS__QRTZ_SIMPROP_TRIGGERS_SCHED_NAME_TRIGGER_NAME_TRIGGER_GROU_FKEY
import emented.jooq.main.tables.QrtzTriggers.QrtzTriggersPath
import emented.jooq.main.tables.records.QrtzSimpropTriggersRecord

import java.math.BigDecimal

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
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
open class QrtzSimpropTriggers(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, QrtzSimpropTriggersRecord>?,
    parentPath: InverseForeignKey<out Record, QrtzSimpropTriggersRecord>?,
    aliased: Table<QrtzSimpropTriggersRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<QrtzSimpropTriggersRecord>(
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
         * The reference instance of <code>public.qrtz_simprop_triggers</code>
         */
        val QRTZ_SIMPROP_TRIGGERS: QrtzSimpropTriggers = QrtzSimpropTriggers()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<QrtzSimpropTriggersRecord> = QrtzSimpropTriggersRecord::class.java

    /**
     * The column <code>public.qrtz_simprop_triggers.sched_name</code>.
     */
    val SCHED_NAME: TableField<QrtzSimpropTriggersRecord, String?> = createField(DSL.name("sched_name"), SQLDataType.VARCHAR(120).nullable(false), this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.trigger_name</code>.
     */
    val TRIGGER_NAME: TableField<QrtzSimpropTriggersRecord, String?> = createField(DSL.name("trigger_name"), SQLDataType.VARCHAR(200).nullable(false), this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.trigger_group</code>.
     */
    val TRIGGER_GROUP: TableField<QrtzSimpropTriggersRecord, String?> = createField(DSL.name("trigger_group"), SQLDataType.VARCHAR(200).nullable(false), this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.str_prop_1</code>.
     */
    val STR_PROP_1: TableField<QrtzSimpropTriggersRecord, String?> = createField(DSL.name("str_prop_1"), SQLDataType.VARCHAR(512), this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.str_prop_2</code>.
     */
    val STR_PROP_2: TableField<QrtzSimpropTriggersRecord, String?> = createField(DSL.name("str_prop_2"), SQLDataType.VARCHAR(512), this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.str_prop_3</code>.
     */
    val STR_PROP_3: TableField<QrtzSimpropTriggersRecord, String?> = createField(DSL.name("str_prop_3"), SQLDataType.VARCHAR(512), this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.int_prop_1</code>.
     */
    val INT_PROP_1: TableField<QrtzSimpropTriggersRecord, Int?> = createField(DSL.name("int_prop_1"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.int_prop_2</code>.
     */
    val INT_PROP_2: TableField<QrtzSimpropTriggersRecord, Int?> = createField(DSL.name("int_prop_2"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.long_prop_1</code>.
     */
    val LONG_PROP_1: TableField<QrtzSimpropTriggersRecord, Long?> = createField(DSL.name("long_prop_1"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.long_prop_2</code>.
     */
    val LONG_PROP_2: TableField<QrtzSimpropTriggersRecord, Long?> = createField(DSL.name("long_prop_2"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.dec_prop_1</code>.
     */
    val DEC_PROP_1: TableField<QrtzSimpropTriggersRecord, BigDecimal?> = createField(DSL.name("dec_prop_1"), SQLDataType.NUMERIC(13, 4), this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.dec_prop_2</code>.
     */
    val DEC_PROP_2: TableField<QrtzSimpropTriggersRecord, BigDecimal?> = createField(DSL.name("dec_prop_2"), SQLDataType.NUMERIC(13, 4), this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.bool_prop_1</code>.
     */
    val BOOL_PROP_1: TableField<QrtzSimpropTriggersRecord, Boolean?> = createField(DSL.name("bool_prop_1"), SQLDataType.BOOLEAN, this, "")

    /**
     * The column <code>public.qrtz_simprop_triggers.bool_prop_2</code>.
     */
    val BOOL_PROP_2: TableField<QrtzSimpropTriggersRecord, Boolean?> = createField(DSL.name("bool_prop_2"), SQLDataType.BOOLEAN, this, "")

    private constructor(alias: Name, aliased: Table<QrtzSimpropTriggersRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<QrtzSimpropTriggersRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<QrtzSimpropTriggersRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.qrtz_simprop_triggers</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.qrtz_simprop_triggers</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.qrtz_simprop_triggers</code> table reference
     */
    constructor(): this(DSL.name("qrtz_simprop_triggers"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, QrtzSimpropTriggersRecord>?, parentPath: InverseForeignKey<out Record, QrtzSimpropTriggersRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, QRTZ_SIMPROP_TRIGGERS, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class QrtzSimpropTriggersPath : QrtzSimpropTriggers, Path<QrtzSimpropTriggersRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, QrtzSimpropTriggersRecord>?, parentPath: InverseForeignKey<out Record, QrtzSimpropTriggersRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<QrtzSimpropTriggersRecord>): super(alias, aliased)
        override fun `as`(alias: String): QrtzSimpropTriggersPath = QrtzSimpropTriggersPath(DSL.name(alias), this)
        override fun `as`(alias: Name): QrtzSimpropTriggersPath = QrtzSimpropTriggersPath(alias, this)
        override fun `as`(alias: Table<*>): QrtzSimpropTriggersPath = QrtzSimpropTriggersPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<QrtzSimpropTriggersRecord> = QRTZ_SIMPROP_TRIGGERS_PKEY
    override fun getReferences(): List<ForeignKey<QrtzSimpropTriggersRecord, *>> = listOf(QRTZ_SIMPROP_TRIGGERS__QRTZ_SIMPROP_TRIGGERS_SCHED_NAME_TRIGGER_NAME_TRIGGER_GROU_FKEY)

    private lateinit var _qrtzTriggers: QrtzTriggersPath

    /**
     * Get the implicit join path to the <code>public.qrtz_triggers</code>
     * table.
     */
    fun qrtzTriggers(): QrtzTriggersPath {
        if (!this::_qrtzTriggers.isInitialized)
            _qrtzTriggers = QrtzTriggersPath(this, QRTZ_SIMPROP_TRIGGERS__QRTZ_SIMPROP_TRIGGERS_SCHED_NAME_TRIGGER_NAME_TRIGGER_GROU_FKEY, null)

        return _qrtzTriggers;
    }

    val qrtzTriggers: QrtzTriggersPath
        get(): QrtzTriggersPath = qrtzTriggers()
    override fun `as`(alias: String): QrtzSimpropTriggers = QrtzSimpropTriggers(DSL.name(alias), this)
    override fun `as`(alias: Name): QrtzSimpropTriggers = QrtzSimpropTriggers(alias, this)
    override fun `as`(alias: Table<*>): QrtzSimpropTriggers = QrtzSimpropTriggers(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): QrtzSimpropTriggers = QrtzSimpropTriggers(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): QrtzSimpropTriggers = QrtzSimpropTriggers(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): QrtzSimpropTriggers = QrtzSimpropTriggers(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): QrtzSimpropTriggers = QrtzSimpropTriggers(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): QrtzSimpropTriggers = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): QrtzSimpropTriggers = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): QrtzSimpropTriggers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): QrtzSimpropTriggers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): QrtzSimpropTriggers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): QrtzSimpropTriggers = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): QrtzSimpropTriggers = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): QrtzSimpropTriggers = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): QrtzSimpropTriggers = where(DSL.notExists(select))
}