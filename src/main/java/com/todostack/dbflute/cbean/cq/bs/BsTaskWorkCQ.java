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
 * The base condition-query of TASK_WORK.
 * @author DBFlute(AutoGenerator)
 */
public class BsTaskWorkCQ extends AbstractBsTaskWorkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TaskWorkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTaskWorkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from TASK_WORK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TaskWorkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TaskWorkCIQ xcreateCIQ() {
        TaskWorkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TaskWorkCIQ xnewCIQ() {
        return new TaskWorkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join TASK_WORK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TaskWorkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TaskWorkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _taskWorkId;
    public ConditionValue xdfgetTaskWorkId()
    { if (_taskWorkId == null) { _taskWorkId = nCV(); }
      return _taskWorkId; }
    protected ConditionValue xgetCValueTaskWorkId() { return xdfgetTaskWorkId(); }

    /** 
     * Add order-by as ascend. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_TaskWorkId_Asc() { regOBA("TASK_WORK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (タスク作業ID)TASK_WORK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_TaskWorkId_Desc() { regOBD("TASK_WORK_ID"); return this; }

    protected ConditionValue _taskId;
    public ConditionValue xdfgetTaskId()
    { if (_taskId == null) { _taskId = nCV(); }
      return _taskId; }
    protected ConditionValue xgetCValueTaskId() { return xdfgetTaskId(); }

    /** 
     * Add order-by as ascend. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_TaskId_Asc() { regOBA("TASK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (タスクID)TASK_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to TASK}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_TaskId_Desc() { regOBD("TASK_ID"); return this; }

    protected ConditionValue _startTm;
    public ConditionValue xdfgetStartTm()
    { if (_startTm == null) { _startTm = nCV(); }
      return _startTm; }
    protected ConditionValue xgetCValueStartTm() { return xdfgetStartTm(); }

    /** 
     * Add order-by as ascend. <br>
     * (開始時間)START_TM: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_StartTm_Asc() { regOBA("START_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * (開始時間)START_TM: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_StartTm_Desc() { regOBD("START_TM"); return this; }

    protected ConditionValue _endTm;
    public ConditionValue xdfgetEndTm()
    { if (_endTm == null) { _endTm = nCV(); }
      return _endTm; }
    protected ConditionValue xgetCValueEndTm() { return xdfgetEndTm(); }

    /** 
     * Add order-by as ascend. <br>
     * (終了時間)END_TM: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_EndTm_Asc() { regOBA("END_TM"); return this; }

    /**
     * Add order-by as descend. <br>
     * (終了時間)END_TM: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_EndTm_Desc() { regOBD("END_TM"); return this; }

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
    public BsTaskWorkCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsTaskWorkCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsTaskWorkCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsTaskWorkCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTaskWorkCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsTaskWorkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTaskWorkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TaskWorkCQ bq = (TaskWorkCQ)bqs;
        TaskWorkCQ uq = (TaskWorkCQ)uqs;
        if (bq.hasConditionQueryTask()) {
            uq.queryTask().reflectRelationOnUnionQuery(bq.queryTask(), uq.queryTask());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (タスク)TASK by my TASK_ID, named 'task'.
     * @return The instance of condition-query. (NotNull)
     */
    public TaskCQ queryTask() {
        return xdfgetConditionQueryTask();
    }
    public TaskCQ xdfgetConditionQueryTask() {
        String prop = "task";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTask()); xsetupOuterJoinTask(); }
        return xgetQueRlMap(prop);
    }
    protected TaskCQ xcreateQueryTask() {
        String nrp = xresolveNRP("TASK_WORK", "task"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TaskCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "task", nrp);
    }
    protected void xsetupOuterJoinTask() { xregOutJo("task"); }
    public boolean hasConditionQueryTask() { return xhasQueRlMap("task"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TaskWorkCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TaskWorkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TaskWorkCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TaskWorkCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TaskWorkCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TaskWorkCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TaskWorkCQ> _myselfExistsMap;
    public Map<String, TaskWorkCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TaskWorkCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TaskWorkCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TaskWorkCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TaskWorkCB.class.getName(); }
    protected String xCQ() { return TaskWorkCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
