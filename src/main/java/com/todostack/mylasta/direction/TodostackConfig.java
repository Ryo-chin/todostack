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

import com.todostack.mylasta.direction.TodostackEnv;
import org.lastaflute.core.direction.exception.ConfigPropertyNotFoundException;

/**
 * @author FreeGen
 */
public interface TodostackConfig extends TodostackEnv {

    /** The key of the configuration. e.g. todostack */
    String DOMAIN_NAME = "domain.name";

    /** The key of the configuration. e.g. Todostack */
    String DOMAIN_TITLE = "domain.title";

    /** The key of the configuration. e.g. / */
    String COOKIE_DEFAULT_PATH = "cookie.default.path";

    /** The key of the configuration. e.g. 31556926 */
    String COOKIE_DEFAULT_EXPIRE = "cookie.default.expire";

    /** The key of the configuration. e.g. 315360000 */
    String COOKIE_ETERNAL_EXPIRE = "cookie.eternal.expire";

    /** The key of the configuration. e.g. TDS */
    String COOKIE_REMEMBER_ME_TODOSTACK_KEY = "cookie.remember.me.todostack.key";

    /**
     * Get the value of property as {@link String}.
     * @param propertyKey The key of the property. (NotNull)
     * @return The value of found property. (NotNull: if not found, exception)
     * @throws ConfigPropertyNotFoundException When the property is not found.
     */
    String get(String propertyKey);

    /**
     * Is the property true?
     * @param propertyKey The key of the property which is boolean type. (NotNull)
     * @return The determination, true or false. (if not found, exception)
     * @throws ConfigPropertyNotFoundException When the property is not found.
     */
    boolean is(String propertyKey);

    /**
     * Get the value for the key 'domain.name'. <br>
     * The value is, e.g. todostack <br>
     * comment: The name of domain (means this application) as identity
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getDomainName();

    /**
     * Get the value for the key 'domain.title'. <br>
     * The value is, e.g. Todostack <br>
     * comment: The title of domain (means this application) for logging
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getDomainTitle();

    /**
     * Get the value for the key 'cookie.default.path'. <br>
     * The value is, e.g. / <br>
     * comment: The default path of cookie (basically '/' if no context path)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getCookieDefaultPath();

    /**
     * Get the value for the key 'cookie.default.expire'. <br>
     * The value is, e.g. 31556926 <br>
     * comment: The default expire of cookie in seconds e.g. 31556926: one year, 86400: one day
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getCookieDefaultExpire();

    /**
     * Get the value for the key 'cookie.default.expire' as {@link Integer}. <br>
     * The value is, e.g. 31556926 <br>
     * comment: The default expire of cookie in seconds e.g. 31556926: one year, 86400: one day
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     * @throws NumberFormatException When the property is not integer.
     */
    Integer getCookieDefaultExpireAsInteger();

    /**
     * Get the value for the key 'cookie.eternal.expire'. <br>
     * The value is, e.g. 315360000 <br>
     * comment: The eternal expire of cookie in seconds e.g. 315360000: ten year, 86400: one day
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getCookieEternalExpire();

    /**
     * Get the value for the key 'cookie.eternal.expire' as {@link Integer}. <br>
     * The value is, e.g. 315360000 <br>
     * comment: The eternal expire of cookie in seconds e.g. 315360000: ten year, 86400: one day
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     * @throws NumberFormatException When the property is not integer.
     */
    Integer getCookieEternalExpireAsInteger();

    /**
     * Get the value for the key 'cookie.remember.me.todostack.key'. <br>
     * The value is, e.g. TDS <br>
     * comment: The cookie key of remember-me for Todostack #change_it_first
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getCookieRememberMeTodostackKey();

    /**
     * The simple implementation for configuration.
     * @author FreeGen
     */
    public static class SimpleImpl extends TodostackEnv.SimpleImpl implements TodostackConfig {

        /** The serial version UID for object serialization. (Default) */
        private static final long serialVersionUID = 1L;

        public String getDomainName() {
            return get(TodostackConfig.DOMAIN_NAME);
        }

        public String getDomainTitle() {
            return get(TodostackConfig.DOMAIN_TITLE);
        }

        public String getCookieDefaultPath() {
            return get(TodostackConfig.COOKIE_DEFAULT_PATH);
        }

        public String getCookieDefaultExpire() {
            return get(TodostackConfig.COOKIE_DEFAULT_EXPIRE);
        }

        public Integer getCookieDefaultExpireAsInteger() {
            return getAsInteger(TodostackConfig.COOKIE_DEFAULT_EXPIRE);
        }

        public String getCookieEternalExpire() {
            return get(TodostackConfig.COOKIE_ETERNAL_EXPIRE);
        }

        public Integer getCookieEternalExpireAsInteger() {
            return getAsInteger(TodostackConfig.COOKIE_ETERNAL_EXPIRE);
        }

        public String getCookieRememberMeTodostackKey() {
            return get(TodostackConfig.COOKIE_REMEMBER_ME_TODOSTACK_KEY);
        }
    }
}
