package com.todostack.app.web.mypage;

import com.todostack.dbflute.exentity.Task;
import org.lastaflute.web.validation.Required;

/**
 * @author ryohei
 */
public class MyPageTaskBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                            =========
    @Required
    public Long taskId;
    @Required
    public String taskDetail;
    @Required
    public boolean doneFlg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========

    public MyPageTaskBean(Task task) {
        this.taskId = task.getTaskId();
        this.taskDetail = task.getTaskDetail();
        this.doneFlg = task.isDoneFlgTrue();
    }
}
