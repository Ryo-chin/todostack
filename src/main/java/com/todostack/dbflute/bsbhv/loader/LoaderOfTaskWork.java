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
import com.todostack.dbflute.exbhv.*;
import com.todostack.dbflute.exentity.*;

/**
 * The referrer loader of (タスク作業)TASK_WORK as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTaskWork {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TaskWork> _selectedList;
    protected BehaviorSelector _selector;
    protected TaskWorkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTaskWork ready(List<TaskWork> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TaskWorkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TaskWorkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTask _foreignTaskLoader;
    public LoaderOfTask pulloutTask() {
        if (_foreignTaskLoader == null)
        { _foreignTaskLoader = new LoaderOfTask().ready(myBhv().pulloutTask(_selectedList), _selector); }
        return _foreignTaskLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TaskWork> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
