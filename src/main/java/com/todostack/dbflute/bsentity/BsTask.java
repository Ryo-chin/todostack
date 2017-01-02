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
import com.todostack.dbflute.allcommon.CDef;
import com.todostack.dbflute.exentity.*;

/**
 * The entity of (タスク)TASK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     TASK_ID
 *
 * [column]
 *     TASK_ID, MEMBER_ID, TASK_DETAIL, DISPLAY_NUM, DONE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TASK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER
 *
 * [referrer table]
 *     TASK_WORK
 *
 * [foreign property]
 *     member
 *
 * [referrer property]
 *     taskWorkList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long taskId = entity.getTaskId();
 * Long memberId = entity.getMemberId();
 * String taskDetail = entity.getTaskDetail();
 * Long displayNum = entity.getDisplayNum();
 * String doneFlg = entity.getDoneFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setTaskId(taskId);
 * entity.setMemberId(memberId);
 * entity.setTaskDetail(taskDetail);
 * entity.setDisplayNum(displayNum);
 * entity.setDoneFlg(doneFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTask extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)} */
    protected Long _taskId;

    /** (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER} */
    protected Long _memberId;

    /** (タスク詳細)TASK_DETAIL: {NotNull, TEXT(65535)} */
    protected String _taskDetail;

    /** (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)} */
    protected Long _displayNum;

    /** (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} */
    protected String _doneFlg;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TASK";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_taskId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param taskId (タスクID): PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20). (NotNull)
     * @param displayNum (表示順): +UQ, IX, NotNull, BIGINT(19). (NotNull)
     */
    public void uniqueBy(Long taskId, Long displayNum) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("taskId");
        __uniqueDrivenProperties.addPropertyName("displayNum");
        setTaskId(taskId);setDisplayNum(displayNum);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of doneFlg as the classification of Flg. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getDoneFlgAsFlg() {
        return CDef.Flg.codeOf(getDoneFlg());
    }

    /**
     * Set the value of doneFlg as the classification of Flg. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDoneFlgAsFlg(CDef.Flg cdef) {
        setDoneFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Set the value of doneFlg as boolean. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (NullAllowed: if null, null value is set to the column)
     */
    public void setDoneFlgAsBoolean(Boolean determination) {
        setDoneFlgAsFlg(CDef.Flg.codeOf(determination));
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of doneFlg as True (Y). <br>
     * Checked: means yes
     */
    public void setDoneFlg_True() {
        setDoneFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of doneFlg as False (N). <br>
     * Unchecked: means no
     */
    public void setDoneFlg_False() {
        setDoneFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of doneFlg True? <br>
     * Checked: means yes
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoneFlgTrue() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of doneFlg False? <br>
     * Unchecked: means no
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoneFlgFalse() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'doneFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDoneFlgName() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'doneFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getDoneFlgAlias() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (タスク作業)TASK_WORK by TASK_ID, named 'taskWorkList'. */
    protected List<TaskWork> _taskWorkList;

    /**
     * [get] (タスク作業)TASK_WORK by TASK_ID, named 'taskWorkList'.
     * @return The entity list of referrer property 'taskWorkList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TaskWork> getTaskWorkList() {
        if (_taskWorkList == null) { _taskWorkList = newReferrerList(); }
        return _taskWorkList;
    }

    /**
     * [set] (タスク作業)TASK_WORK by TASK_ID, named 'taskWorkList'.
     * @param taskWorkList The entity list of referrer property 'taskWorkList'. (NullAllowed)
     */
    public void setTaskWorkList(List<TaskWork> taskWorkList) {
        _taskWorkList = taskWorkList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTask) {
            BsTask other = (BsTask)obj;
            if (!xSV(_taskId, other._taskId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _taskId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_taskWorkList != null) { for (TaskWork et : _taskWorkList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "taskWorkList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_taskId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_taskDetail));
        sb.append(dm).append(xfND(_displayNum));
        sb.append(dm).append(xfND(_doneFlg));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_taskWorkList != null && !_taskWorkList.isEmpty())
        { sb.append(dm).append("taskWorkList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Task clone() {
        return (Task)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)} <br>
     * タスクID
     * @return The value of the column 'TASK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTaskId() {
        checkSpecifiedProperty("taskId");
        return _taskId;
    }

    /**
     * [set] (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)} <br>
     * タスクID
     * @param taskId The value of the column 'TASK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTaskId(Long taskId) {
        registerModifiedProperty("taskId");
        _taskId = taskId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER} <br>
     * 会員ID
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER} <br>
     * 会員ID
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (タスク詳細)TASK_DETAIL: {NotNull, TEXT(65535)} <br>
     * タスク詳細
     * @return The value of the column 'TASK_DETAIL'. (basically NotNull if selected: for the constraint)
     */
    public String getTaskDetail() {
        checkSpecifiedProperty("taskDetail");
        return convertEmptyToNull(_taskDetail);
    }

    /**
     * [set] (タスク詳細)TASK_DETAIL: {NotNull, TEXT(65535)} <br>
     * タスク詳細
     * @param taskDetail The value of the column 'TASK_DETAIL'. (basically NotNull if update: for the constraint)
     */
    public void setTaskDetail(String taskDetail) {
        registerModifiedProperty("taskDetail");
        _taskDetail = taskDetail;
    }

    /**
     * [get] (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)} <br>
     * 表示順。タスクの数だけあるので、bigint。
     * @return The value of the column 'DISPLAY_NUM'. (basically NotNull if selected: for the constraint)
     */
    public Long getDisplayNum() {
        checkSpecifiedProperty("displayNum");
        return _displayNum;
    }

    /**
     * [set] (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)} <br>
     * 表示順。タスクの数だけあるので、bigint。
     * @param displayNum The value of the column 'DISPLAY_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayNum(Long displayNum) {
        registerModifiedProperty("displayNum");
        _displayNum = displayNum;
    }

    /**
     * [get] (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * 完了フラグ
     * @return The value of the column 'DONE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDoneFlg() {
        checkSpecifiedProperty("doneFlg");
        return convertEmptyToNull(_doneFlg);
    }

    /**
     * [set] (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * 完了フラグ
     * @param doneFlg The value of the column 'DONE_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setDoneFlg(String doneFlg) {
        checkClassificationCode("DONE_FLG", CDef.DefMeta.Flg, doneFlg);
        registerModifiedProperty("doneFlg");
        _doneFlg = doneFlg;
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

    /**
     * [get] (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * 排他制御用、更新されるごとにインクリメントされる
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * 排他制御用、更新されるごとにインクリメントされる
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param doneFlg The value of the column 'DONE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingDoneFlg(String doneFlg) {
        setDoneFlg(doneFlg);
    }
}
