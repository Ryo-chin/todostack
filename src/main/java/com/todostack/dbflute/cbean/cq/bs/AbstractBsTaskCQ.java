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
 * The abstract condition-query of TASK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTaskCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTaskCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "TASK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
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
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
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
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     * @param taskId The value of taskId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_GreaterThan(Long taskId) {
        regTaskId(CK_GT, taskId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     * @param taskId The value of taskId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_LessThan(Long taskId) {
        regTaskId(CK_LT, taskId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     * @param taskId The value of taskId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_GreaterEqual(Long taskId) {
        regTaskId(CK_GE, taskId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     * @param taskId The value of taskId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_LessEqual(Long taskId) {
        regTaskId(CK_LE, taskId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
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
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of taskId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of taskId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTaskId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaskId(), "TASK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
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
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     * @param taskIdList The collection of taskId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskId_NotInScope(Collection<Long> taskIdList) {
        doSetTaskId_NotInScope(taskIdList);
    }

    protected void doSetTaskId_NotInScope(Collection<Long> taskIdList) {
        regINS(CK_NINS, cTL(taskIdList), xgetCValueTaskId(), "TASK_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TASK_ID from TASK_WORK where ...)} <br>
     * (タスク作業)TASK_WORK by TASK_ID, named 'taskWorkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTaskWork</span>(workCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     workCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TaskWorkList for 'exists'. (NotNull)
     */
    public void existsTaskWork(SubQuery<TaskWorkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TaskWorkCB cb = new TaskWorkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTaskId_ExistsReferrer_TaskWorkList(cb.query());
        registerExistsReferrer(cb.query(), "TASK_ID", "TASK_ID", pp, "taskWorkList");
    }
    public abstract String keepTaskId_ExistsReferrer_TaskWorkList(TaskWorkCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TASK_ID from TASK_WORK where ...)} <br>
     * (タスク作業)TASK_WORK by TASK_ID, named 'taskWorkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTaskWork</span>(workCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     workCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TaskId_NotExistsReferrer_TaskWorkList for 'not exists'. (NotNull)
     */
    public void notExistsTaskWork(SubQuery<TaskWorkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TaskWorkCB cb = new TaskWorkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTaskId_NotExistsReferrer_TaskWorkList(cb.query());
        registerNotExistsReferrer(cb.query(), "TASK_ID", "TASK_ID", pp, "taskWorkList");
    }
    public abstract String keepTaskId_NotExistsReferrer_TaskWorkList(TaskWorkCQ sq);

    public void xsderiveTaskWorkList(String fn, SubQuery<TaskWorkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskWorkCB cb = new TaskWorkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTaskId_SpecifyDerivedReferrer_TaskWorkList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TASK_ID", "TASK_ID", pp, "taskWorkList", al, op);
    }
    public abstract String keepTaskId_SpecifyDerivedReferrer_TaskWorkList(TaskWorkCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TASK_WORK where ...)} <br>
     * (タスク作業)TASK_WORK by TASK_ID, named 'taskWorkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTaskWork()</span>.<span style="color: #CC4747">max</span>(workCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     workCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     workCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TaskWorkCB> derivedTaskWork() {
        return xcreateQDRFunctionTaskWorkList();
    }
    protected HpQDRFunction<TaskWorkCB> xcreateQDRFunctionTaskWorkList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTaskWorkList(fn, sq, rd, vl, op));
    }
    public void xqderiveTaskWorkList(String fn, SubQuery<TaskWorkCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskWorkCB cb = new TaskWorkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTaskId_QueryDerivedReferrer_TaskWorkList(cb.query()); String prpp = keepTaskId_QueryDerivedReferrer_TaskWorkListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TASK_ID", "TASK_ID", sqpp, "taskWorkList", rd, vl, prpp, op);
    }
    public abstract String keepTaskId_QueryDerivedReferrer_TaskWorkList(TaskWorkCQ sq);
    public abstract String keepTaskId_QueryDerivedReferrer_TaskWorkListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setTaskId_IsNull() { regTaskId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setTaskId_IsNotNull() { regTaskId(CK_ISNN, DOBJ); }

    protected void regTaskId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskId(), "TASK_ID"); }
    protected abstract ConditionValue xgetCValueTaskId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param memberId The value of memberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_Equal(Long memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Long memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_NotEqual(Long memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Long memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Long memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Long memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Long memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Long memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Long> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Long> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Long> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Long> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (タスク詳細)TASK_DETAIL: {NotNull, TEXT(65535)}
     * @param taskDetail The value of taskDetail as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskDetail_Equal(String taskDetail) {
        doSetTaskDetail_Equal(fRES(taskDetail));
    }

    protected void doSetTaskDetail_Equal(String taskDetail) {
        regTaskDetail(CK_EQ, taskDetail);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (タスク詳細)TASK_DETAIL: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setTaskDetail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param taskDetail The value of taskDetail as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTaskDetail_LikeSearch(String taskDetail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTaskDetail_LikeSearch(taskDetail, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (タスク詳細)TASK_DETAIL: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setTaskDetail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param taskDetail The value of taskDetail as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTaskDetail_LikeSearch(String taskDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(taskDetail), xgetCValueTaskDetail(), "TASK_DETAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (タスク詳細)TASK_DETAIL: {NotNull, TEXT(65535)}
     * @param taskDetail The value of taskDetail as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTaskDetail_NotLikeSearch(String taskDetail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTaskDetail_NotLikeSearch(taskDetail, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (タスク詳細)TASK_DETAIL: {NotNull, TEXT(65535)}
     * @param taskDetail The value of taskDetail as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTaskDetail_NotLikeSearch(String taskDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(taskDetail), xgetCValueTaskDetail(), "TASK_DETAIL", likeSearchOption);
    }

    protected void regTaskDetail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskDetail(), "TASK_DETAIL"); }
    protected abstract ConditionValue xgetCValueTaskDetail();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param displayNum The value of displayNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayNum_Equal(Long displayNum) {
        doSetDisplayNum_Equal(displayNum);
    }

    protected void doSetDisplayNum_Equal(Long displayNum) {
        regDisplayNum(CK_EQ, displayNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param displayNum The value of displayNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayNum_NotEqual(Long displayNum) {
        doSetDisplayNum_NotEqual(displayNum);
    }

    protected void doSetDisplayNum_NotEqual(Long displayNum) {
        regDisplayNum(CK_NES, displayNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param displayNum The value of displayNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayNum_GreaterThan(Long displayNum) {
        regDisplayNum(CK_GT, displayNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param displayNum The value of displayNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayNum_LessThan(Long displayNum) {
        regDisplayNum(CK_LT, displayNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param displayNum The value of displayNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayNum_GreaterEqual(Long displayNum) {
        regDisplayNum(CK_GE, displayNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param displayNum The value of displayNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayNum_LessEqual(Long displayNum) {
        regDisplayNum(CK_LE, displayNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param minNumber The min number of displayNum. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayNum. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayNum_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayNum_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param minNumber The min number of displayNum. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayNum. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDisplayNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayNum(), "DISPLAY_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param displayNumList The collection of displayNum as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayNum_InScope(Collection<Long> displayNumList) {
        doSetDisplayNum_InScope(displayNumList);
    }

    protected void doSetDisplayNum_InScope(Collection<Long> displayNumList) {
        regINS(CK_INS, cTL(displayNumList), xgetCValueDisplayNum(), "DISPLAY_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @param displayNumList The collection of displayNum as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayNum_NotInScope(Collection<Long> displayNumList) {
        doSetDisplayNum_NotInScope(displayNumList);
    }

    protected void doSetDisplayNum_NotInScope(Collection<Long> displayNumList) {
        regINS(CK_NINS, cTL(displayNumList), xgetCValueDisplayNum(), "DISPLAY_NUM");
    }

    protected void regDisplayNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayNum(), "DISPLAY_NUM"); }
    protected abstract ConditionValue xgetCValueDisplayNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param doneFlg The value of doneFlg as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setDoneFlg_Equal(String doneFlg) {
        doSetDoneFlg_Equal(fRES(doneFlg));
    }

    /**
     * Equal(=). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDoneFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetDoneFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As boolean for Flg. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoneFlg_Equal_AsBoolean(Boolean determination) {
        setDoneFlg_Equal_AsFlg(CDef.Flg.codeOf(determination));
    }

    /**
     * Equal(=). As True (Y). And OnlyOnceRegistered. <br>
     * Checked: means yes
     */
    public void setDoneFlg_Equal_True() {
        setDoneFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (N). And OnlyOnceRegistered. <br>
     * Unchecked: means no
     */
    public void setDoneFlg_Equal_False() {
        setDoneFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetDoneFlg_Equal(String doneFlg) {
        regDoneFlg(CK_EQ, doneFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param doneFlg The value of doneFlg as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setDoneFlg_NotEqual(String doneFlg) {
        doSetDoneFlg_NotEqual(fRES(doneFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDoneFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetDoneFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As True (Y). And OnlyOnceRegistered. <br>
     * Checked: means yes
     */
    public void setDoneFlg_NotEqual_True() {
        setDoneFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (N). And OnlyOnceRegistered. <br>
     * Unchecked: means no
     */
    public void setDoneFlg_NotEqual_False() {
        setDoneFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetDoneFlg_NotEqual(String doneFlg) {
        regDoneFlg(CK_NES, doneFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param doneFlgList The collection of doneFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoneFlg_InScope(Collection<String> doneFlgList) {
        doSetDoneFlg_InScope(doneFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As Flg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setDoneFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetDoneFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDoneFlg_InScope(Collection<String> doneFlgList) {
        regINS(CK_INS, cTL(doneFlgList), xgetCValueDoneFlg(), "DONE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param doneFlgList The collection of doneFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDoneFlg_NotInScope(Collection<String> doneFlgList) {
        doSetDoneFlg_NotInScope(doneFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Flg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setDoneFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetDoneFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDoneFlg_NotInScope(Collection<String> doneFlgList) {
        regINS(CK_NINS, cTL(doneFlgList), xgetCValueDoneFlg(), "DONE_FLG");
    }

    protected void regDoneFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoneFlg(), "DONE_FLG"); }
    protected abstract ConditionValue xgetCValueDoneFlg();

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

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

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
    public HpSLCFunction<TaskCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TaskCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TaskCB&gt;() {
     *     public void query(TaskCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TaskCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TaskCQ sq);

    protected TaskCB xcreateScalarConditionCB() {
        TaskCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TaskCB xcreateScalarConditionPartitionByCB() {
        TaskCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TaskCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = new TaskCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TASK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TaskCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TaskCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TaskCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = new TaskCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TASK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TaskCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TaskCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TaskCB cb = new TaskCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TaskCQ sq);

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
    protected TaskCB newMyCB() {
        return new TaskCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TaskCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
