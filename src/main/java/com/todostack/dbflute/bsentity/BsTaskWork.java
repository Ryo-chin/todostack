/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.todostack.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.todostack.dbflute.allcommon.EntityDefinedCommonColumn;
import com.todostack.dbflute.allcommon.DBMetaInstanceHandler;
import com.todostack.dbflute.exentity.*;

/**
 * The entity of (タスク作業)TASK_WORK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     TASK_WORK_ID
 *
 * [column]
 *     TASK_WORK_ID, TASK_ID, START_TM, END_TM, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TASK_WORK_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     TASK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     task
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long taskWorkId = entity.getTaskWorkId();
 * Long taskId = entity.getTaskId();
 * java.time.LocalDateTime startTm = entity.getStartTm();
 * java.time.LocalDateTime endTm = entity.getEndTm();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setTaskWorkId(taskWorkId);
 * entity.setTaskId(taskId);
 * entity.setStartTm(startTm);
 * entity.setEndTm(endTm);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTaskWork extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _taskWorkId;

    /** (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK} */
    protected Long _taskId;

    /** (開始時間)START_TM: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _startTm;

    /** (終了時間)END_TM: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _endTm;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TASK_WORK";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_taskWorkId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (タスク)TASK by my TASK_ID, named 'task'. */
    protected OptionalEntity<Task> _task;

    /**
     * [get] (タスク)TASK by my TASK_ID, named 'task'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'task'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Task> getTask() {
        if (_task == null) { _task = OptionalEntity.relationEmpty(this, "task"); }
        return _task;
    }

    /**
     * [set] (タスク)TASK by my TASK_ID, named 'task'.
     * @param task The entity of foreign property 'task'. (NullAllowed)
     */
    public void setTask(OptionalEntity<Task> task) {
        _task = task;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTaskWork) {
            BsTaskWork other = (BsTaskWork)obj;
            if (!xSV(_taskWorkId, other._taskWorkId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _taskWorkId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_task != null && _task.isPresent())
        { sb.append(li).append(xbRDS(_task, "task")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_taskWorkId));
        sb.append(dm).append(xfND(_taskId));
        sb.append(dm).append(xfND(_startTm));
        sb.append(dm).append(xfND(_endTm));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_task != null && _task.isPresent())
        { sb.append(dm).append("task"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TaskWork clone() {
        return (TaskWork)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * タスク作業ID。作業を開始するごとに生まれるのでbigint。
     * @return The value of the column 'TASK_WORK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTaskWorkId() {
        checkSpecifiedProperty("taskWorkId");
        return _taskWorkId;
    }

    /**
     * [set] (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * タスク作業ID。作業を開始するごとに生まれるのでbigint。
     * @param taskWorkId The value of the column 'TASK_WORK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTaskWorkId(Long taskWorkId) {
        registerModifiedProperty("taskWorkId");
        _taskWorkId = taskWorkId;
    }

    /**
     * [get] (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK} <br>
     * タスクID
     * @return The value of the column 'TASK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTaskId() {
        checkSpecifiedProperty("taskId");
        return _taskId;
    }

    /**
     * [set] (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK} <br>
     * タスクID
     * @param taskId The value of the column 'TASK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTaskId(Long taskId) {
        registerModifiedProperty("taskId");
        _taskId = taskId;
    }

    /**
     * [get] (開始時間)START_TM: {NotNull, DATETIME(19)} <br>
     * 開始時間
     * @return The value of the column 'START_TM'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getStartTm() {
        checkSpecifiedProperty("startTm");
        return _startTm;
    }

    /**
     * [set] (開始時間)START_TM: {NotNull, DATETIME(19)} <br>
     * 開始時間
     * @param startTm The value of the column 'START_TM'. (basically NotNull if update: for the constraint)
     */
    public void setStartTm(java.time.LocalDateTime startTm) {
        registerModifiedProperty("startTm");
        _startTm = startTm;
    }

    /**
     * [get] (終了時間)END_TM: {NotNull, DATETIME(19)} <br>
     * 終了時間
     * @return The value of the column 'END_TM'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getEndTm() {
        checkSpecifiedProperty("endTm");
        return _endTm;
    }

    /**
     * [set] (終了時間)END_TM: {NotNull, DATETIME(19)} <br>
     * 終了時間
     * @param endTm The value of the column 'END_TM'. (basically NotNull if update: for the constraint)
     */
    public void setEndTm(java.time.LocalDateTime endTm) {
        registerModifiedProperty("endTm");
        _endTm = endTm;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }
}
