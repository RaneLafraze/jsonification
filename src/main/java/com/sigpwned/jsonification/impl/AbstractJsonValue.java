package com.sigpwned.jsonification.impl;

import com.sigpwned.jsonification.JsonValue;
import com.sigpwned.jsonification.exception.IllegalCastJsonException;
import com.sigpwned.jsonification.value.JsonArray;
import com.sigpwned.jsonification.value.JsonObject;
import com.sigpwned.jsonification.value.ScalarJsonValue;

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
/* default */ abstract class AbstractJsonValue implements JsonValue {
    public AbstractJsonValue() {
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public JsonObject asObject() {
        throw new IllegalCastJsonException(getType(), JsonValue.Type.OBJECT);
    }

    @Override
    public JsonArray asArray() {
        throw new IllegalCastJsonException(getType(), JsonValue.Type.ARRAY);
    }

    @Override
    public ScalarJsonValue asScalar() {
        throw new IllegalCastJsonException(getType(), JsonValue.Type.SCALAR);
    }
}