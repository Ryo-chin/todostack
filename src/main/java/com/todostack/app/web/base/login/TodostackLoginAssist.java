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
package com.todostack.app.web.base.login;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;
import org.dbflute.optional.OptionalThing;
import com.todostack.app.web.signin.SigninAction;
import com.todostack.dbflute.cbean.MemberCB;
import com.todostack.dbflute.exbhv.MemberBhv;
import com.todostack.dbflute.exentity.Member;
import com.todostack.mylasta.action.TodostackUserBean;
import com.todostack.mylasta.direction.TodostackConfig;
import org.lastaflute.core.magic.async.AsyncManager;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.web.login.PrimaryLoginManager;
import org.lastaflute.web.login.TypicalLoginAssist;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.login.option.LoginSpecifiedOption;

/**
 * @author jflute
 */
public class TodostackLoginAssist extends TypicalLoginAssist<String, TodostackUserBean, Member> // #change_it also UserBean
        implements PrimaryLoginManager { // #app_customize

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TimeManager timeManager;
    @Resource
    private AsyncManager asyncManager;
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private TodostackConfig config;
    @Resource
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                           Find User
    //                                                                           =========
    @Override
    protected void checkCredential(CredentialChecker checker) {
        checker.check(UserPasswordCredential.class, credential -> {
            return memberBhv.selectCount(cb -> arrangeLoginByCredential(cb, credential)) > 0;
        });
    }

    @Override
    protected void resolveCredential(CredentialResolver resolver) {
        resolver.resolve(UserPasswordCredential.class, credential -> {
            return memberBhv.selectEntity(cb -> arrangeLoginByCredential(cb, credential));
        });
    }

    private void arrangeLoginByCredential(MemberCB cb, UserPasswordCredential credential) {
        cb.query().arrangeLogin(credential.getUser(), encryptPassword(credential.getPassword()));
    }

    @Override
    protected OptionalEntity<Member> doFindLoginUser(String email) {
        return memberBhv.selectEntity(cb -> cb.query().arrangeLoginByIdentity(email));
    }

    // ===================================================================================
    //                                                                       Login Process
    //                                                                       =============
    @Override
    protected TodostackUserBean createUserBean(Member userEntity) {
        return new TodostackUserBean(userEntity);
    }

    @Override
    protected OptionalThing<String> getCookieRememberMeKey() {
        return OptionalThing.of(config.getCookieRememberMeTodostackKey());
    }

    @Override
    protected String toTypedUserId(String userKey) {
        return userKey;
    }

    @Override
    protected Class<TodostackUserBean> getUserBeanType() {
        return TodostackUserBean.class;
    }

    @Override
    protected void saveLoginHistory(Member member, TodostackUserBean userBean, LoginSpecifiedOption option) {
        asyncManager.async(() -> {
            transactionStage.requiresNew(tx -> {
                // TODO: 2017/01/02 make login history table
//                insertLogin(member);
            });
        });
    }

//    protected void insertLogin(Member member) {
//        MemberLogin login = new MemberLogin();
//        login.setMemberId(member.getMemberId());
//        login.setLoginMemberStatusCodeAsMemberStatus(member.getMemberStatusCodeAsMemberStatus());
//        login.setLoginDatetime(timeManager.currentDateTime());
//        login.setMobileLoginFlg_False(); // mobile unsupported for now
//        memberLoginBhv.insert(login);
//    }

    // ===================================================================================
    //                                                                      Login Resource
    //                                                                      ==============

    @Override
    protected Class<?> getLoginActionType() {
        return SigninAction.class;
    }
}
