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
package com.todostack.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.todostack.dbflute.allcommon.*;
import com.todostack.dbflute.cbean.*;
import com.todostack.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of TASK_WORK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTaskWorkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTaskWorkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "TASK_WORK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskWorkId The value of taskWorkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskWorkId_Equal(Long taskWorkId) {
        doSetTaskWorkId_Equal(taskWorkId);
    }

    protected void doSetTaskWorkId_Equal(Long taskWorkId) {
        regTaskWorkId(CK_EQ, taskWorkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskWorkId The value of taskWorkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskWorkId_NotEqual(Long taskWorkId) {
        doSetTaskWorkId_NotEqual(taskWorkId);
    }

    protected void doSetTaskWorkId_NotEqual(Long taskWorkId) {
        regTaskWorkId(CK_NES, taskWorkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskWorkId The value of taskWorkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskWorkId_GreaterThan(Long taskWorkId) {
        regTaskWorkId(CK_GT, taskWorkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskWorkId The value of taskWorkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskWorkId_LessThan(Long taskWorkId) {
        regTaskWorkId(CK_LT, taskWorkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskWorkId The value of taskWorkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskWorkId_GreaterEqual(Long taskWorkId) {
        regTaskWorkId(CK_GE, taskWorkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskWorkId The value of taskWorkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskWorkId_LessEqual(Long taskWorkId) {
        regTaskWorkId(CK_LE, taskWorkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of taskWorkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of taskWorkId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTaskWorkId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTaskWorkId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of taskWorkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of taskWorkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTaskWorkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaskWorkId(), "TASK_WORK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskWorkIdList The collection of taskWorkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskWorkId_InScope(Collection<Long> taskWorkIdList) {
        doSetTaskWorkId_InScope(taskWorkIdList);
    }

    protected void doSetTaskWorkId_InScope(Collection<Long> taskWorkIdList) {
        regINS(CK_INS, cTL(taskWorkIdList), xgetCValueTaskWorkId(), "TASK_WORK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskWorkIdList The collection of taskWorkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskWorkId_NotInScope(Collection<Long> taskWorkIdList) {
        doSetTaskWorkId_NotInScope(taskWorkIdList);
    }

    protected void doSetTaskWorkId_NotInScope(Collection<Long> taskWorkIdList) {
        regINS(CK_NINS, cTL(taskWorkIdList), xgetCValueTaskWorkId(), "TASK_WORK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTaskWorkId_IsNull() { regTaskWorkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTaskWorkId_IsNotNull() { regTaskWorkId(CK_ISNN, DOBJ); }

    protected void regTaskWorkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskWorkId(), "TASK_WORK_ID"); }
    protected abstract ConditionValue xgetCValueTaskWorkId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param taskId The value of taskId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_Equal(Long taskId) {
        doSetTaskId_Equal(taskId);
    }

    protected void doSetTaskId_Equal(Long taskId) {
        regTaskId(CK_EQ, taskId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param taskId The value of taskId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_NotEqual(Long taskId) {
        doSetTaskId_NotEqual(taskId);
    }

    protected void doSetTaskId_NotEqual(Long taskId) {
        regTaskId(CK_NES, taskId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param taskId The value of taskId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_GreaterThan(Long taskId) {
        regTaskId(CK_GT, taskId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param taskId The value of taskId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_LessThan(Long taskId) {
        regTaskId(CK_LT, taskId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param taskId The value of taskId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_GreaterEqual(Long taskId) {
        regTaskId(CK_GE, taskId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param taskId The value of taskId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_LessEqual(Long taskId) {
        regTaskId(CK_LE, taskId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param minNumber The min number of taskId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of taskId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTaskId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTaskId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param minNumber The min number of taskId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of taskId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTaskId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaskId(), "TASK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param taskIdList The collection of taskId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskId_InScope(Collection<Long> taskIdList) {
        doSetTaskId_InScope(taskIdList);
    }

    protected void doSetTaskId_InScope(Collection<Long> taskIdList) {
        regINS(CK_INS, cTL(taskIdList), xgetCValueTaskId(), "TASK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @param taskIdList The collection of taskId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskId_NotInScope(Collection<Long> taskIdList) {
        doSetTaskId_NotInScope(taskIdList);
    }

    protected void doSetTaskId_NotInScope(Collection<Long> taskIdList) {
        regINS(CK_NINS, cTL(taskIdList), xgetCValueTaskId(), "TASK_ID");
    }

    protected void regTaskId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskId(), "TASK_ID"); }
    protected abstract ConditionValue xgetCValueTaskId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (開始時間)START_TM: {NotNull, DATETIME(19)}
     * @param startTm The value of startTm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTm_Equal(java.time.LocalDateTime startTm) {
        regStartTm(CK_EQ,  startTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (開始時間)START_TM: {NotNull, DATETIME(19)}
     * @param startTm The value of startTm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTm_GreaterThan(java.time.LocalDateTime startTm) {
        regStartTm(CK_GT,  startTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (開始時間)START_TM: {NotNull, DATETIME(19)}
     * @param startTm The value of startTm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTm_LessThan(java.time.LocalDateTime startTm) {
        regStartTm(CK_LT,  startTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (開始時間)START_TM: {NotNull, DATETIME(19)}
     * @param startTm The value of startTm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTm_GreaterEqual(java.time.LocalDateTime startTm) {
        regStartTm(CK_GE,  startTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (開始時間)START_TM: {NotNull, DATETIME(19)}
     * @param startTm The value of startTm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTm_LessEqual(java.time.LocalDateTime startTm) {
        regStartTm(CK_LE, startTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (開始時間)START_TM: {NotNull, DATETIME(19)}
     * <pre>e.g. setStartTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setStartTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setStartTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (開始時間)START_TM: {NotNull, DATETIME(19)}
     * <pre>e.g. setStartTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of startTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setStartTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "START_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueStartTm(), nm, op);
    }

    protected void regStartTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStartTm(), "START_TM"); }
    protected abstract ConditionValue xgetCValueStartTm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (終了時間)END_TM: {NotNull, DATETIME(19)}
     * @param endTm The value of endTm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTm_Equal(java.time.LocalDateTime endTm) {
        regEndTm(CK_EQ,  endTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (終了時間)END_TM: {NotNull, DATETIME(19)}
     * @param endTm The value of endTm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTm_GreaterThan(java.time.LocalDateTime endTm) {
        regEndTm(CK_GT,  endTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (終了時間)END_TM: {NotNull, DATETIME(19)}
     * @param endTm The value of endTm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTm_LessThan(java.time.LocalDateTime endTm) {
        regEndTm(CK_LT,  endTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (終了時間)END_TM: {NotNull, DATETIME(19)}
     * @param endTm The value of endTm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTm_GreaterEqual(java.time.LocalDateTime endTm) {
        regEndTm(CK_GE,  endTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (終了時間)END_TM: {NotNull, DATETIME(19)}
     * @param endTm The value of endTm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTm_LessEqual(java.time.LocalDateTime endTm) {
        regEndTm(CK_LE, endTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (終了時間)END_TM: {NotNull, DATETIME(19)}
     * <pre>e.g. setEndTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setEndTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setEndTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (終了時間)END_TM: {NotNull, DATETIME(19)}
     * <pre>e.g. setEndTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setEndTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "END_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueEndTm(), nm, op);
    }

    protected void regEndTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEndTm(), "END_TM"); }
    protected abstract ConditionValue xgetCValueEndTm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskWorkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TaskWorkCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskWorkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TaskWorkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskWorkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TaskWorkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskWorkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TaskWorkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskWorkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TaskWorkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TaskWorkCB&gt;() {
     *     public void query(TaskWorkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskWorkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TaskWorkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskWorkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TaskWorkCQ sq);

    protected TaskWorkCB xcreateScalarConditionCB() {
        TaskWorkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TaskWorkCB xcreateScalarConditionPartitionByCB() {
        TaskWorkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TaskWorkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskWorkCB cb = new TaskWorkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TASK_WORK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TaskWorkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TaskWorkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TaskWorkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskWorkCB cb = new TaskWorkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TASK_WORK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TaskWorkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TaskWorkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TaskWorkCB cb = new TaskWorkCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TaskWorkCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected TaskWorkCB newMyCB() {
        return new TaskWorkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TaskWorkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
