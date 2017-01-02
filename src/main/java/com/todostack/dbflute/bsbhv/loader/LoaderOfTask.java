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
package com.todostack.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.todostack.dbflute.exbhv.*;
import com.todostack.dbflute.exentity.*;
import com.todostack.dbflute.cbean.*;

/**
 * The referrer loader of (タスク)TASK as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTask {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Task> _selectedList;
    protected BehaviorSelector _selector;
    protected TaskBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTask ready(List<Task> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TaskBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TaskBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TaskWork> _referrerTaskWork;

    /**
     * Load referrer of taskWorkList by the set-upper of referrer. <br>
     * (タスク作業)TASK_WORK by TASK_ID, named 'taskWorkList'.
     * <pre>
     * <span style="color: #0000C0">taskBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">taskList</span>, <span style="color: #553000">taskLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">taskLoader</span>.<span style="color: #CC4747">loadTaskWork</span>(<span style="color: #553000">workCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">workCB</span>.setupSelect...
     *         <span style="color: #553000">workCB</span>.query().set...
     *         <span style="color: #553000">workCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">workLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    workLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Task task : <span style="color: #553000">taskList</span>) {
     *     ... = task.<span style="color: #CC4747">getTaskWorkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTaskId_InScope(pkList);
     * cb.query().addOrderBy_TaskId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTaskWork> loadTaskWork(ReferrerConditionSetupper<TaskWorkCB> refCBLambda) {
        myBhv().loadTaskWork(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTaskWork = refLs);
        return hd -> hd.handle(new LoaderOfTaskWork().ready(_referrerTaskWork, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new LoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Task> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
