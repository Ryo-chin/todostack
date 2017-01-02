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
package com.todostack.app.web.mypage;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import com.todostack.dbflute.exbhv.TaskBhv;
import com.todostack.dbflute.exentity.Task;
import com.todostack.mylasta.action.TodostackUserBean;
import org.dbflute.cbean.result.ListResultBean;
import com.todostack.app.web.base.TodostackBaseAction;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

/**
 * @author jflute
 */
public class MypageAction extends TodostackBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    TaskBhv taskBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public HtmlResponse index() {
        // TODO: 2017/01/02 セッションからユーザー情報を取得できないときの処理
        TodostackUserBean userBean = getUserBean().get();

        return asHtml(path_Mypage_MypageHtml).renderWith(data -> {
            List<MyPageTaskBean> myPageTaskBeen = mappingToTasks(selectTaskList(userBean.getMemberId()));
            data.register("taskList", mappingToTasks(selectTaskList(userBean.getMemberId())));
        });
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private ListResultBean<Task> selectTaskList(Long memberId) {
        return taskBhv.selectList(cb -> {
            cb.query().setMemberId_Equal(memberId);
            cb.query().addOrderBy_DisplayNum_Asc();
        });
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private List<MyPageTaskBean> mappingToTasks(List<Task> taskList) {
        return taskList.stream().map(MyPageTaskBean::new).collect(Collectors.toList());
    }
}
