/*
 * This file is generated by jOOQ.
 */
package emented.jooq.main.indexes


import emented.jooq.main.tables.QrtzFiredTriggers
import emented.jooq.main.tables.QrtzJobDetails
import emented.jooq.main.tables.QrtzTriggers

import org.jooq.Index
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// INDEX definitions
// -------------------------------------------------------------------------

val IDX_QRTZ_FT_INST_JOB_REQ_RCVRY: Index = Internal.createIndex(DSL.name("idx_qrtz_ft_inst_job_req_rcvry"), QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS, arrayOf(QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.SCHED_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.INSTANCE_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.REQUESTS_RECOVERY), false)
val IDX_QRTZ_FT_J_G: Index = Internal.createIndex(DSL.name("idx_qrtz_ft_j_g"), QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS, arrayOf(QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.SCHED_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.JOB_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.JOB_GROUP), false)
val IDX_QRTZ_FT_JG: Index = Internal.createIndex(DSL.name("idx_qrtz_ft_jg"), QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS, arrayOf(QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.SCHED_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.JOB_GROUP), false)
val IDX_QRTZ_FT_T_G: Index = Internal.createIndex(DSL.name("idx_qrtz_ft_t_g"), QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS, arrayOf(QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.SCHED_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.TRIGGER_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.TRIGGER_GROUP), false)
val IDX_QRTZ_FT_TG: Index = Internal.createIndex(DSL.name("idx_qrtz_ft_tg"), QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS, arrayOf(QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.SCHED_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.TRIGGER_GROUP), false)
val IDX_QRTZ_FT_TRIG_INST_NAME: Index = Internal.createIndex(DSL.name("idx_qrtz_ft_trig_inst_name"), QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS, arrayOf(QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.SCHED_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.INSTANCE_NAME), false)
val IDX_QRTZ_J_GRP: Index = Internal.createIndex(DSL.name("idx_qrtz_j_grp"), QrtzJobDetails.QRTZ_JOB_DETAILS, arrayOf(QrtzJobDetails.QRTZ_JOB_DETAILS.SCHED_NAME, QrtzJobDetails.QRTZ_JOB_DETAILS.JOB_GROUP), false)
val IDX_QRTZ_J_REQ_RECOVERY: Index = Internal.createIndex(DSL.name("idx_qrtz_j_req_recovery"), QrtzJobDetails.QRTZ_JOB_DETAILS, arrayOf(QrtzJobDetails.QRTZ_JOB_DETAILS.SCHED_NAME, QrtzJobDetails.QRTZ_JOB_DETAILS.REQUESTS_RECOVERY), false)
val IDX_QRTZ_T_C: Index = Internal.createIndex(DSL.name("idx_qrtz_t_c"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.CALENDAR_NAME), false)
val IDX_QRTZ_T_G: Index = Internal.createIndex(DSL.name("idx_qrtz_t_g"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP), false)
val IDX_QRTZ_T_J: Index = Internal.createIndex(DSL.name("idx_qrtz_t_j"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.JOB_NAME, QrtzTriggers.QRTZ_TRIGGERS.JOB_GROUP), false)
val IDX_QRTZ_T_JG: Index = Internal.createIndex(DSL.name("idx_qrtz_t_jg"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.JOB_GROUP), false)
val IDX_QRTZ_T_N_G_STATE: Index = Internal.createIndex(DSL.name("idx_qrtz_t_n_g_state"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_STATE), false)
val IDX_QRTZ_T_N_STATE: Index = Internal.createIndex(DSL.name("idx_qrtz_t_n_state"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_STATE), false)
val IDX_QRTZ_T_NEXT_FIRE_TIME: Index = Internal.createIndex(DSL.name("idx_qrtz_t_next_fire_time"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.NEXT_FIRE_TIME), false)
val IDX_QRTZ_T_NFT_MISFIRE: Index = Internal.createIndex(DSL.name("idx_qrtz_t_nft_misfire"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.MISFIRE_INSTR, QrtzTriggers.QRTZ_TRIGGERS.NEXT_FIRE_TIME), false)
val IDX_QRTZ_T_NFT_ST: Index = Internal.createIndex(DSL.name("idx_qrtz_t_nft_st"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_STATE, QrtzTriggers.QRTZ_TRIGGERS.NEXT_FIRE_TIME), false)
val IDX_QRTZ_T_NFT_ST_MISFIRE: Index = Internal.createIndex(DSL.name("idx_qrtz_t_nft_st_misfire"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.MISFIRE_INSTR, QrtzTriggers.QRTZ_TRIGGERS.NEXT_FIRE_TIME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_STATE), false)
val IDX_QRTZ_T_NFT_ST_MISFIRE_GRP: Index = Internal.createIndex(DSL.name("idx_qrtz_t_nft_st_misfire_grp"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.MISFIRE_INSTR, QrtzTriggers.QRTZ_TRIGGERS.NEXT_FIRE_TIME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_STATE), false)
val IDX_QRTZ_T_STATE: Index = Internal.createIndex(DSL.name("idx_qrtz_t_state"), QrtzTriggers.QRTZ_TRIGGERS, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_STATE), false)