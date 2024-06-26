/*
 * This file is generated by jOOQ.
 */
package emented.jooq.main.keys


import emented.jooq.main.tables.Category
import emented.jooq.main.tables.Comment
import emented.jooq.main.tables.Community
import emented.jooq.main.tables.CommunityEvent
import emented.jooq.main.tables.QrtzBlobTriggers
import emented.jooq.main.tables.QrtzCalendars
import emented.jooq.main.tables.QrtzCronTriggers
import emented.jooq.main.tables.QrtzFiredTriggers
import emented.jooq.main.tables.QrtzJobDetails
import emented.jooq.main.tables.QrtzLocks
import emented.jooq.main.tables.QrtzPausedTriggerGrps
import emented.jooq.main.tables.QrtzSchedulerState
import emented.jooq.main.tables.QrtzSimpleTriggers
import emented.jooq.main.tables.QrtzSimpropTriggers
import emented.jooq.main.tables.QrtzTriggers
import emented.jooq.main.tables.Role
import emented.jooq.main.tables.RoleUserRelation
import emented.jooq.main.tables.User
import emented.jooq.main.tables.records.CategoryRecord
import emented.jooq.main.tables.records.CommentRecord
import emented.jooq.main.tables.records.CommunityEventRecord
import emented.jooq.main.tables.records.CommunityRecord
import emented.jooq.main.tables.records.QrtzBlobTriggersRecord
import emented.jooq.main.tables.records.QrtzCalendarsRecord
import emented.jooq.main.tables.records.QrtzCronTriggersRecord
import emented.jooq.main.tables.records.QrtzFiredTriggersRecord
import emented.jooq.main.tables.records.QrtzJobDetailsRecord
import emented.jooq.main.tables.records.QrtzLocksRecord
import emented.jooq.main.tables.records.QrtzPausedTriggerGrpsRecord
import emented.jooq.main.tables.records.QrtzSchedulerStateRecord
import emented.jooq.main.tables.records.QrtzSimpleTriggersRecord
import emented.jooq.main.tables.records.QrtzSimpropTriggersRecord
import emented.jooq.main.tables.records.QrtzTriggersRecord
import emented.jooq.main.tables.records.RoleRecord
import emented.jooq.main.tables.records.RoleUserRelationRecord
import emented.jooq.main.tables.records.UserRecord

import org.jooq.ForeignKey
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val CATEGORY_PKEY: UniqueKey<CategoryRecord> = Internal.createUniqueKey(Category.CATEGORY, DSL.name("category_pkey"), arrayOf(Category.CATEGORY.ID), true)
val COMMENT_PKEY: UniqueKey<CommentRecord> = Internal.createUniqueKey(Comment.COMMENT, DSL.name("comment_pkey"), arrayOf(Comment.COMMENT.ID), true)
val COMMUNITY_ADDRESS_KEY: UniqueKey<CommunityRecord> = Internal.createUniqueKey(Community.COMMUNITY, DSL.name("community_address_key"), arrayOf(Community.COMMUNITY.ADDRESS), true)
val COMMUNITY_PKEY: UniqueKey<CommunityRecord> = Internal.createUniqueKey(Community.COMMUNITY, DSL.name("community_pkey"), arrayOf(Community.COMMUNITY.ID), true)
val COMMUNITY_EVENT_ADDRESS_KEY: UniqueKey<CommunityEventRecord> = Internal.createUniqueKey(CommunityEvent.COMMUNITY_EVENT, DSL.name("community_event_address_key"), arrayOf(CommunityEvent.COMMUNITY_EVENT.ADDRESS), true)
val COMMUNITY_EVENT_PKEY: UniqueKey<CommunityEventRecord> = Internal.createUniqueKey(CommunityEvent.COMMUNITY_EVENT, DSL.name("community_event_pkey"), arrayOf(CommunityEvent.COMMUNITY_EVENT.ID), true)
val QRTZ_BLOB_TRIGGERS_PKEY: UniqueKey<QrtzBlobTriggersRecord> = Internal.createUniqueKey(QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS, DSL.name("qrtz_blob_triggers_pkey"), arrayOf(QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.SCHED_NAME, QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.TRIGGER_NAME, QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP), true)
val QRTZ_CALENDARS_PKEY: UniqueKey<QrtzCalendarsRecord> = Internal.createUniqueKey(QrtzCalendars.QRTZ_CALENDARS, DSL.name("qrtz_calendars_pkey"), arrayOf(QrtzCalendars.QRTZ_CALENDARS.SCHED_NAME, QrtzCalendars.QRTZ_CALENDARS.CALENDAR_NAME), true)
val QRTZ_CRON_TRIGGERS_PKEY: UniqueKey<QrtzCronTriggersRecord> = Internal.createUniqueKey(QrtzCronTriggers.QRTZ_CRON_TRIGGERS, DSL.name("qrtz_cron_triggers_pkey"), arrayOf(QrtzCronTriggers.QRTZ_CRON_TRIGGERS.SCHED_NAME, QrtzCronTriggers.QRTZ_CRON_TRIGGERS.TRIGGER_NAME, QrtzCronTriggers.QRTZ_CRON_TRIGGERS.TRIGGER_GROUP), true)
val QRTZ_FIRED_TRIGGERS_PKEY: UniqueKey<QrtzFiredTriggersRecord> = Internal.createUniqueKey(QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS, DSL.name("qrtz_fired_triggers_pkey"), arrayOf(QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.SCHED_NAME, QrtzFiredTriggers.QRTZ_FIRED_TRIGGERS.ENTRY_ID), true)
val QRTZ_JOB_DETAILS_PKEY: UniqueKey<QrtzJobDetailsRecord> = Internal.createUniqueKey(QrtzJobDetails.QRTZ_JOB_DETAILS, DSL.name("qrtz_job_details_pkey"), arrayOf(QrtzJobDetails.QRTZ_JOB_DETAILS.SCHED_NAME, QrtzJobDetails.QRTZ_JOB_DETAILS.JOB_NAME, QrtzJobDetails.QRTZ_JOB_DETAILS.JOB_GROUP), true)
val QRTZ_LOCKS_PKEY: UniqueKey<QrtzLocksRecord> = Internal.createUniqueKey(QrtzLocks.QRTZ_LOCKS, DSL.name("qrtz_locks_pkey"), arrayOf(QrtzLocks.QRTZ_LOCKS.SCHED_NAME, QrtzLocks.QRTZ_LOCKS.LOCK_NAME), true)
val QRTZ_PAUSED_TRIGGER_GRPS_PKEY: UniqueKey<QrtzPausedTriggerGrpsRecord> = Internal.createUniqueKey(QrtzPausedTriggerGrps.QRTZ_PAUSED_TRIGGER_GRPS, DSL.name("qrtz_paused_trigger_grps_pkey"), arrayOf(QrtzPausedTriggerGrps.QRTZ_PAUSED_TRIGGER_GRPS.SCHED_NAME, QrtzPausedTriggerGrps.QRTZ_PAUSED_TRIGGER_GRPS.TRIGGER_GROUP), true)
val QRTZ_SCHEDULER_STATE_PKEY: UniqueKey<QrtzSchedulerStateRecord> = Internal.createUniqueKey(QrtzSchedulerState.QRTZ_SCHEDULER_STATE, DSL.name("qrtz_scheduler_state_pkey"), arrayOf(QrtzSchedulerState.QRTZ_SCHEDULER_STATE.SCHED_NAME, QrtzSchedulerState.QRTZ_SCHEDULER_STATE.INSTANCE_NAME), true)
val QRTZ_SIMPLE_TRIGGERS_PKEY: UniqueKey<QrtzSimpleTriggersRecord> = Internal.createUniqueKey(QrtzSimpleTriggers.QRTZ_SIMPLE_TRIGGERS, DSL.name("qrtz_simple_triggers_pkey"), arrayOf(QrtzSimpleTriggers.QRTZ_SIMPLE_TRIGGERS.SCHED_NAME, QrtzSimpleTriggers.QRTZ_SIMPLE_TRIGGERS.TRIGGER_NAME, QrtzSimpleTriggers.QRTZ_SIMPLE_TRIGGERS.TRIGGER_GROUP), true)
val QRTZ_SIMPROP_TRIGGERS_PKEY: UniqueKey<QrtzSimpropTriggersRecord> = Internal.createUniqueKey(QrtzSimpropTriggers.QRTZ_SIMPROP_TRIGGERS, DSL.name("qrtz_simprop_triggers_pkey"), arrayOf(QrtzSimpropTriggers.QRTZ_SIMPROP_TRIGGERS.SCHED_NAME, QrtzSimpropTriggers.QRTZ_SIMPROP_TRIGGERS.TRIGGER_NAME, QrtzSimpropTriggers.QRTZ_SIMPROP_TRIGGERS.TRIGGER_GROUP), true)
val QRTZ_TRIGGERS_PKEY: UniqueKey<QrtzTriggersRecord> = Internal.createUniqueKey(QrtzTriggers.QRTZ_TRIGGERS, DSL.name("qrtz_triggers_pkey"), arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP), true)
val ROLE_NAME_KEY: UniqueKey<RoleRecord> = Internal.createUniqueKey(Role.ROLE, DSL.name("role_name_key"), arrayOf(Role.ROLE.NAME), true)
val ROLE_PKEY: UniqueKey<RoleRecord> = Internal.createUniqueKey(Role.ROLE, DSL.name("role_pkey"), arrayOf(Role.ROLE.ID), true)
val ROLE_USER_RELATION_USER_ID_ROLE_ID_KEY: UniqueKey<RoleUserRelationRecord> = Internal.createUniqueKey(RoleUserRelation.ROLE_USER_RELATION, DSL.name("role_user_relation_user_id_role_id_key"), arrayOf(RoleUserRelation.ROLE_USER_RELATION.USER_ID, RoleUserRelation.ROLE_USER_RELATION.ROLE_ID), true)
val USER_EMAIL_KEY: UniqueKey<UserRecord> = Internal.createUniqueKey(User.USER, DSL.name("user_email_key"), arrayOf(User.USER.EMAIL), true)
val USER_PKEY: UniqueKey<UserRecord> = Internal.createUniqueKey(User.USER, DSL.name("user_pkey"), arrayOf(User.USER.ID), true)
val USER_USERNAME_KEY: UniqueKey<UserRecord> = Internal.createUniqueKey(User.USER, DSL.name("user_username_key"), arrayOf(User.USER.USERNAME), true)

// -------------------------------------------------------------------------
// FOREIGN KEY definitions
// -------------------------------------------------------------------------

val COMMENT__COMMENT_COMMUNITY_ID_FKEY: ForeignKey<CommentRecord, CommunityRecord> = Internal.createForeignKey(Comment.COMMENT, DSL.name("comment_community_id_fkey"), arrayOf(Comment.COMMENT.COMMUNITY_ID), emented.jooq.main.keys.COMMUNITY_PKEY, arrayOf(Community.COMMUNITY.ID), true)
val COMMENT__COMMENT_USER_ID_FKEY: ForeignKey<CommentRecord, UserRecord> = Internal.createForeignKey(Comment.COMMENT, DSL.name("comment_user_id_fkey"), arrayOf(Comment.COMMENT.USER_ID), emented.jooq.main.keys.USER_PKEY, arrayOf(User.USER.ID), true)
val COMMUNITY__COMMUNITY_CATEGORY_ID_FKEY: ForeignKey<CommunityRecord, CategoryRecord> = Internal.createForeignKey(Community.COMMUNITY, DSL.name("community_category_id_fkey"), arrayOf(Community.COMMUNITY.CATEGORY_ID), emented.jooq.main.keys.CATEGORY_PKEY, arrayOf(Category.CATEGORY.ID), true)
val COMMUNITY__COMMUNITY_USER_ID_FKEY: ForeignKey<CommunityRecord, UserRecord> = Internal.createForeignKey(Community.COMMUNITY, DSL.name("community_user_id_fkey"), arrayOf(Community.COMMUNITY.USER_ID), emented.jooq.main.keys.USER_PKEY, arrayOf(User.USER.ID), true)
val COMMUNITY_EVENT__COMMUNITY_EVENT_CATEGORY_ID_FKEY: ForeignKey<CommunityEventRecord, CategoryRecord> = Internal.createForeignKey(CommunityEvent.COMMUNITY_EVENT, DSL.name("community_event_category_id_fkey"), arrayOf(CommunityEvent.COMMUNITY_EVENT.CATEGORY_ID), emented.jooq.main.keys.CATEGORY_PKEY, arrayOf(Category.CATEGORY.ID), true)
val COMMUNITY_EVENT__COMMUNITY_EVENT_USER_ID_FKEY: ForeignKey<CommunityEventRecord, UserRecord> = Internal.createForeignKey(CommunityEvent.COMMUNITY_EVENT, DSL.name("community_event_user_id_fkey"), arrayOf(CommunityEvent.COMMUNITY_EVENT.USER_ID), emented.jooq.main.keys.USER_PKEY, arrayOf(User.USER.ID), true)
val QRTZ_BLOB_TRIGGERS__QRTZ_BLOB_TRIGGERS_SCHED_NAME_TRIGGER_NAME_TRIGGER_GROUP_FKEY: ForeignKey<QrtzBlobTriggersRecord, QrtzTriggersRecord> = Internal.createForeignKey(QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS, DSL.name("qrtz_blob_triggers_sched_name_trigger_name_trigger_group_fkey"), arrayOf(QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.SCHED_NAME, QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.TRIGGER_NAME, QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP), emented.jooq.main.keys.QRTZ_TRIGGERS_PKEY, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP), true)
val QRTZ_CRON_TRIGGERS__QRTZ_CRON_TRIGGERS_SCHED_NAME_TRIGGER_NAME_TRIGGER_GROUP_FKEY: ForeignKey<QrtzCronTriggersRecord, QrtzTriggersRecord> = Internal.createForeignKey(QrtzCronTriggers.QRTZ_CRON_TRIGGERS, DSL.name("qrtz_cron_triggers_sched_name_trigger_name_trigger_group_fkey"), arrayOf(QrtzCronTriggers.QRTZ_CRON_TRIGGERS.SCHED_NAME, QrtzCronTriggers.QRTZ_CRON_TRIGGERS.TRIGGER_NAME, QrtzCronTriggers.QRTZ_CRON_TRIGGERS.TRIGGER_GROUP), emented.jooq.main.keys.QRTZ_TRIGGERS_PKEY, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP), true)
val QRTZ_SIMPLE_TRIGGERS__QRTZ_SIMPLE_TRIGGERS_SCHED_NAME_TRIGGER_NAME_TRIGGER_GROUP_FKEY: ForeignKey<QrtzSimpleTriggersRecord, QrtzTriggersRecord> = Internal.createForeignKey(QrtzSimpleTriggers.QRTZ_SIMPLE_TRIGGERS, DSL.name("qrtz_simple_triggers_sched_name_trigger_name_trigger_group_fkey"), arrayOf(QrtzSimpleTriggers.QRTZ_SIMPLE_TRIGGERS.SCHED_NAME, QrtzSimpleTriggers.QRTZ_SIMPLE_TRIGGERS.TRIGGER_NAME, QrtzSimpleTriggers.QRTZ_SIMPLE_TRIGGERS.TRIGGER_GROUP), emented.jooq.main.keys.QRTZ_TRIGGERS_PKEY, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP), true)
val QRTZ_SIMPROP_TRIGGERS__QRTZ_SIMPROP_TRIGGERS_SCHED_NAME_TRIGGER_NAME_TRIGGER_GROU_FKEY: ForeignKey<QrtzSimpropTriggersRecord, QrtzTriggersRecord> = Internal.createForeignKey(QrtzSimpropTriggers.QRTZ_SIMPROP_TRIGGERS, DSL.name("qrtz_simprop_triggers_sched_name_trigger_name_trigger_grou_fkey"), arrayOf(QrtzSimpropTriggers.QRTZ_SIMPROP_TRIGGERS.SCHED_NAME, QrtzSimpropTriggers.QRTZ_SIMPROP_TRIGGERS.TRIGGER_NAME, QrtzSimpropTriggers.QRTZ_SIMPROP_TRIGGERS.TRIGGER_GROUP), emented.jooq.main.keys.QRTZ_TRIGGERS_PKEY, arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_NAME, QrtzTriggers.QRTZ_TRIGGERS.TRIGGER_GROUP), true)
val QRTZ_TRIGGERS__QRTZ_TRIGGERS_SCHED_NAME_JOB_NAME_JOB_GROUP_FKEY: ForeignKey<QrtzTriggersRecord, QrtzJobDetailsRecord> = Internal.createForeignKey(QrtzTriggers.QRTZ_TRIGGERS, DSL.name("qrtz_triggers_sched_name_job_name_job_group_fkey"), arrayOf(QrtzTriggers.QRTZ_TRIGGERS.SCHED_NAME, QrtzTriggers.QRTZ_TRIGGERS.JOB_NAME, QrtzTriggers.QRTZ_TRIGGERS.JOB_GROUP), emented.jooq.main.keys.QRTZ_JOB_DETAILS_PKEY, arrayOf(QrtzJobDetails.QRTZ_JOB_DETAILS.SCHED_NAME, QrtzJobDetails.QRTZ_JOB_DETAILS.JOB_NAME, QrtzJobDetails.QRTZ_JOB_DETAILS.JOB_GROUP), true)
val ROLE_USER_RELATION__FK_ROLE_USER_RELATION_ROLE_ID: ForeignKey<RoleUserRelationRecord, RoleRecord> = Internal.createForeignKey(RoleUserRelation.ROLE_USER_RELATION, DSL.name("fk_role_user_relation_role_id"), arrayOf(RoleUserRelation.ROLE_USER_RELATION.ROLE_ID), emented.jooq.main.keys.ROLE_PKEY, arrayOf(Role.ROLE.ID), true)
val ROLE_USER_RELATION__FK_ROLE_USER_RELATION_USER_ID: ForeignKey<RoleUserRelationRecord, UserRecord> = Internal.createForeignKey(RoleUserRelation.ROLE_USER_RELATION, DSL.name("fk_role_user_relation_user_id"), arrayOf(RoleUserRelation.ROLE_USER_RELATION.USER_ID), emented.jooq.main.keys.USER_PKEY, arrayOf(User.USER.ID), true)
