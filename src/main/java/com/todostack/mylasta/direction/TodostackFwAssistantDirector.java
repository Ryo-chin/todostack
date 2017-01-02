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
package com.todostack.mylasta.direction;

import javax.annotation.Resource;

import com.todostack.mylasta.direction.sponsor.TodostackActionAdjustmentProvider;
import com.todostack.mylasta.direction.sponsor.TodostackApiFailureHook;
import com.todostack.mylasta.direction.sponsor.TodostackCookieResourceProvider;
import com.todostack.mylasta.direction.sponsor.TodostackCurtainBeforeHook;
import com.todostack.mylasta.direction.sponsor.TodostackJsonResourceProvider;
import com.todostack.mylasta.direction.sponsor.TodostackListedClassificationProvider;
import com.todostack.mylasta.direction.sponsor.TodostackMailDeliveryDepartmentCreator;
import com.todostack.mylasta.direction.sponsor.TodostackSecurityResourceProvider;
import com.todostack.mylasta.direction.sponsor.TodostackTimeResourceProvider;
import com.todostack.mylasta.direction.sponsor.TodostackUserLocaleProcessProvider;
import com.todostack.mylasta.direction.sponsor.TodostackUserTimeZoneProcessProvider;
import org.lastaflute.core.direction.CachedFwAssistantDirector;
import org.lastaflute.core.direction.FwAssistDirection;
import org.lastaflute.core.direction.FwCoreDirection;
import org.lastaflute.core.security.InvertibleCryptographer;
import org.lastaflute.core.security.OneWayCryptographer;
import org.lastaflute.db.dbflute.classification.ListedClassificationProvider;
import org.lastaflute.db.direction.FwDbDirection;
import org.lastaflute.thymeleaf.ThymeleafRenderingProvider;
import org.lastaflute.web.direction.FwWebDirection;
import org.lastaflute.web.ruts.renderer.HtmlRenderingProvider;

/**
 * @author jflute
 */
public class TodostackFwAssistantDirector extends CachedFwAssistantDirector {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TodostackConfig config;

    // ===================================================================================
    //                                                                              Assist
    //                                                                              ======
    @Override
    protected void prepareAssistDirection(FwAssistDirection direction) {
        direction.directConfig(nameList -> nameList.add("todostack_config.properties"), "todostack_env.properties");
    }

    // ===================================================================================
    //                                                                               Core
    //                                                                              ======
    @Override
    protected void prepareCoreDirection(FwCoreDirection direction) {
        // this configuration is on todostack_env.properties because this is true only when development
        direction.directDevelopmentHere(config.isDevelopmentHere());

        // titles of the application for logging are from configurations
        direction.directLoggingTitle(config.getDomainTitle(), config.getEnvironmentTitle());

        // this configuration is on sea_env.properties because it has no influence to production
        // even if you set true manually and forget to set false back
        direction.directFrameworkDebug(config.isFrameworkDebug()); // basically false

        // you can add your own process when your application is booting
        direction.directCurtainBefore(createCurtainBeforeHook());

        direction.directSecurity(createSecurityResourceProvider());
        direction.directTime(createTimeResourceProvider());
        direction.directJson(createJsonResourceProvider());
        direction.directMail(createMailDeliveryDepartmentCreator().create());
    }

    protected TodostackCurtainBeforeHook createCurtainBeforeHook() {
        return new TodostackCurtainBeforeHook();
    }

    protected TodostackSecurityResourceProvider createSecurityResourceProvider() { // #change_it_first
        final InvertibleCryptographer inver = InvertibleCryptographer.createAesCipher("todostack:dockside:");
        final OneWayCryptographer oneWay = OneWayCryptographer.createSha256Cryptographer();
        return new TodostackSecurityResourceProvider(inver, oneWay);
    }

    protected TodostackTimeResourceProvider createTimeResourceProvider() {
        return new TodostackTimeResourceProvider(config);
    }

    protected TodostackJsonResourceProvider createJsonResourceProvider() {
        return new TodostackJsonResourceProvider();
    }

    protected TodostackMailDeliveryDepartmentCreator createMailDeliveryDepartmentCreator() {
        return new TodostackMailDeliveryDepartmentCreator(config);
    }

    // ===================================================================================
    //                                                                                 DB
    //                                                                                ====
    @Override
    protected void prepareDbDirection(FwDbDirection direction) {
        direction.directClassification(createListedClassificationProvider());
    }

    protected ListedClassificationProvider createListedClassificationProvider() {
        return new TodostackListedClassificationProvider();
    }

    // ===================================================================================
    //                                                                                Web
    //                                                                               =====
    @Override
    protected void prepareWebDirection(FwWebDirection direction) {
        direction.directRequest(createUserLocaleProcessProvider(), createUserTimeZoneProcessProvider());
        direction.directCookie(createCookieResourceProvider());
        direction.directAdjustment(createActionAdjustmentProvider());
        direction.directMessage(nameList -> nameList.add("todostack_message"), "todostack_label");
        direction.directApiCall(createApiFailureHook());
        direction.directHtmlRendering(createHtmlRenderingProvider());
    }

    protected TodostackUserLocaleProcessProvider createUserLocaleProcessProvider() {
        return new TodostackUserLocaleProcessProvider();
    }

    protected TodostackUserTimeZoneProcessProvider createUserTimeZoneProcessProvider() {
        return new TodostackUserTimeZoneProcessProvider();
    }

    protected TodostackCookieResourceProvider createCookieResourceProvider() { // #change_it_first
        // TODO: 2017/01/02 暗号方式の決定
        final InvertibleCryptographer cr = InvertibleCryptographer.createAesCipher("bakibaki:hakiba:");
        return new TodostackCookieResourceProvider(config, cr);
    }

    protected TodostackActionAdjustmentProvider createActionAdjustmentProvider() {
        return new TodostackActionAdjustmentProvider();
    }

    protected TodostackApiFailureHook createApiFailureHook() {
        return new TodostackApiFailureHook();
    }

    protected HtmlRenderingProvider createHtmlRenderingProvider() {
        return new ThymeleafRenderingProvider().asDevelopment(config.isDevelopmentHere());
    }
}
