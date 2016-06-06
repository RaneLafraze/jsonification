package com.sigpwned.jsonification.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.sigpwned.jsonification.Json;
import com.sigpwned.jsonification.JsonValue;
import com.sigpwned.jsonification.exception.IndexOutOfBoundsJsonException;
import com.sigpwned.jsonification.value.JsonArray;

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
public final class DefaultJsonArray extends AbstractJsonValue implements JsonArray {
    private final List<JsonValue> values;
    
    public DefaultJsonArray() {
        this(new ArrayList<JsonValue>());
    }
    
    private DefaultJsonArray(List<JsonValue> values) {
        if(values == null)
            throw new NullPointerException();
        this.values = values;
    }
    
    @Override
    public DefaultJsonArray asArray() {
        return this;
    }

    @Override
    public JsonValue.Type getType() {
        return JsonValue.Type.ARRAY;
    }

    @Override
    public Iterator<JsonValue> iterator() {
        return Collections.unmodifiableList(values).iterator();
    }

    @Override
    public JsonValue get(int index) {
        JsonValue result;
        try {
            result = values.get(index);
        }
        catch(IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsJsonException(this, index);
        }
        return result;
    }

    @Override
    public JsonValue set(int index, JsonValue value) {
        JsonValue result;
        try {
            result = values.set(index, value!=null ? value : Json.NULL);
        }
        catch(IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsJsonException(this, index);
        }
        return result;
    }

    @Override
    public JsonValue set(int index, boolean value) {
        return set(index, DefaultJsonBoolean.valueOf(value));
    }

    @Override
    public JsonValue set(int index, long value) {
        return set(index, DefaultJsonNumber.valueOf(value));
    }

    @Override
    public JsonValue set(int index, double value) {
        return set(index, DefaultJsonNumber.valueOf(value));
    }

    @Override
    public JsonValue set(int index, String value) {
        return set(index, DefaultJsonString.valueOf(value));
    }
    
    @Override
    public DefaultJsonArray add(JsonValue value) {
        values.add(value!=null ? value : Json.NULL);
        return this;
    }

    @Override
    public DefaultJsonArray add(boolean value) {
        return add(DefaultJsonBoolean.valueOf(value));
    }

    @Override
    public DefaultJsonArray add(long value) {
        return add(DefaultJsonNumber.valueOf(value));
    }

    @Override
    public DefaultJsonArray add(double value) {
        return add(DefaultJsonNumber.valueOf(value));
    }

    @Override
    public DefaultJsonArray add(String value) {
        return add(DefaultJsonString.valueOf(value));
    }

    @Override
    public void add(int index, JsonValue value) {
        values.add(index, value!=null ? value : Json.NULL);
    }

    @Override
    public void add(int index, boolean value) {
        add(index, DefaultJsonBoolean.valueOf(value));
    }

    @Override
    public void add(int index, long value) {
        add(index, DefaultJsonNumber.valueOf(value));
    }

    @Override
    public void add(int index, double value) {
        add(index, DefaultJsonNumber.valueOf(value));
    }

    @Override
    public void add(int index, String value) {
        add(index, DefaultJsonString.valueOf(value));
    }

    @Override
    public JsonValue remove(int index) {
        JsonValue result;
        try {
            result = values.remove(index);
        }
        catch(IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsJsonException(this, index);
        }
        return result;
    }

    @Override
    public int size() {
        return values.size();
    }
}
