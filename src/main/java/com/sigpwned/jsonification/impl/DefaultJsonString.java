package com.sigpwned.jsonification.impl;

import com.sigpwned.jsonification.value.ScalarJsonValue;
import com.sigpwned.jsonification.value.scalar.JsonString;

/**
 * Copyright 2015 Andy Boothe
 *     
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public final class DefaultJsonString extends AbstractScalarJsonValue implements JsonString {
    public static DefaultJsonString valueOf(String value) {
        return new DefaultJsonString(value);
    }
    
    public DefaultJsonString(String value) {
        super(value);
    }
    
    @Override
    public JsonString asString() {
        return this;
    }

    @Override
    public ScalarJsonValue.Flavor getFlavor() {
        return ScalarJsonValue.Flavor.STRING;
    }

    @Override
    public String getStringValue() {
        return (String) getValue();
    }

    @Override
    public String stringVal() {
        return getStringValue();
    }
}
