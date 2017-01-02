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

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.todostack.dbflute.cbean.cq.ciq.*;
import com.todostack.dbflute.cbean.*;
import com.todostack.dbflute.cbean.cq.*;

/**
 * The base condition-query of TASK.
 * @author DBFlute(AutoGenerator)
 */
public class BsTaskCQ extends AbstractBsTaskCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TaskCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTaskCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from TASK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TaskCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TaskCIQ xcreateCIQ() {
        TaskCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TaskCIQ xnewCIQ() {
        return new TaskCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join TASK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TaskCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TaskCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _taskId;
    public ConditionValue xdfgetTaskId()
    { if (_taskId == null) { _taskId = nCV(); }
      return _taskId; }
    protected ConditionValue xgetCValueTaskId() { return xdfgetTaskId(); }

    public Map<String, TaskWorkCQ> xdfgetTaskId_ExistsReferrer_TaskWorkList() { return xgetSQueMap("taskId_ExistsReferrer_TaskWorkList"); }
    public String keepTaskId_ExistsReferrer_TaskWorkList(TaskWorkCQ sq) { return xkeepSQue("taskId_ExistsReferrer_TaskWorkList", sq); }

    public Map<String, TaskWorkCQ> xdfgetTaskId_NotExistsReferrer_TaskWorkList() { return xgetSQueMap("taskId_NotExistsReferrer_TaskWorkList"); }
    public String keepTaskId_NotExistsReferrer_TaskWorkList(TaskWorkCQ sq) { return xkeepSQue("taskId_NotExistsReferrer_TaskWorkList", sq); }

    public Map<String, TaskWorkCQ> xdfgetTaskId_SpecifyDerivedReferrer_TaskWorkList() { return xgetSQueMap("taskId_SpecifyDerivedReferrer_TaskWorkList"); }
    public String keepTaskId_SpecifyDerivedReferrer_TaskWorkList(TaskWorkCQ sq) { return xkeepSQue("taskId_SpecifyDerivedReferrer_TaskWorkList", sq); }

    public Map<String, TaskWorkCQ> xdfgetTaskId_QueryDerivedReferrer_TaskWorkList() { return xgetSQueMap("taskId_QueryDerivedReferrer_TaskWorkList"); }
    public String keepTaskId_QueryDerivedReferrer_TaskWorkList(TaskWorkCQ sq) { return xkeepSQue("taskId_QueryDerivedReferrer_TaskWorkList", sq); }
    public Map<String, Object> xdfgetTaskId_QueryDerivedReferrer_TaskWorkListParameter() { return xgetSQuePmMap("taskId_QueryDerivedReferrer_TaskWorkList"); }
    public String keepTaskId_QueryDerivedReferrer_TaskWorkListParameter(Object pm) { return xkeepSQuePm("taskId_QueryDerivedReferrer_TaskWorkList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_TaskId_Asc() { regOBA("TASK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (タスクID)TASK_ID: {PK, ID, UQ+, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_TaskId_Desc() { regOBD("TASK_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /** 
     * Add order-by as ascend. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _taskDetail;
    public ConditionValue xdfgetTaskDetail()
    { if (_taskDetail == null) { _taskDetail = nCV(); }
      return _taskDetail; }
    protected ConditionValue xgetCValueTaskDetail() { return xdfgetTaskDetail(); }

    protected ConditionValue _displayNum;
    public ConditionValue xdfgetDisplayNum()
    { if (_displayNum == null) { _displayNum = nCV(); }
      return _displayNum; }
    protected ConditionValue xgetCValueDisplayNum() { return xdfgetDisplayNum(); }

    /** 
     * Add order-by as ascend. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_DisplayNum_Asc() { regOBA("DISPLAY_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * (表示順)DISPLAY_NUM: {+UQ, IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_DisplayNum_Desc() { regOBD("DISPLAY_NUM"); return this; }

    protected ConditionValue _doneFlg;
    public ConditionValue xdfgetDoneFlg()
    { if (_doneFlg == null) { _doneFlg = nCV(); }
      return _doneFlg; }
    protected ConditionValue xgetCValueDoneFlg() { return xdfgetDoneFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_DoneFlg_Asc() { regOBA("DONE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (完了フラグ)DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_DoneFlg_Desc() { regOBD("DONE_FLG"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTaskCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTaskCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTaskCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TaskCQ bq = (TaskCQ)bqs;
        TaskCQ uq = (TaskCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public MemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("TASK", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TaskCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TaskCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TaskCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TaskCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TaskCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TaskCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TaskCQ> _myselfExistsMap;
    public Map<String, TaskCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TaskCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TaskCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TaskCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TaskCB.class.getName(); }
    protected String xCQ() { return TaskCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
