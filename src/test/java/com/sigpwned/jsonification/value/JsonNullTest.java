package com.sigpwned.jsonification.value;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.sigpwned.jsonification.Json;
import com.sigpwned.jsonification.JsonValue;
import com.sigpwned.jsonification.exception.NullJsonException;

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
public class JsonNullTest {
    @Test(expected=NullJsonException.class)
    public void addTest1() {
        JsonNull.NULL.add(Json.TRUE);
    }

    @Test(expected=NullJsonException.class)
    public void addTest2() {
        JsonNull.NULL.add(0, Json.TRUE);
    }

    @Test(expected=NullJsonException.class)
    public void addTest3() {
        JsonNull.NULL.add(true);
    }

    @Test(expected=NullJsonException.class)
    public void addTest4() {
        JsonNull.NULL.add(0, true);
    }

    @Test(expected=NullJsonException.class)
    public void addTest5() {
        JsonNull.NULL.add(0L);
    }

    @Test(expected=NullJsonException.class)
    public void addTest6() {
        JsonNull.NULL.add(0, 0L);
    }

    @Test(expected=NullJsonException.class)
    public void addTest7() {
        JsonNull.NULL.add(0.0);
    }

    @Test(expected=NullJsonException.class)
    public void addTest8() {
        JsonNull.NULL.add(0, 0.0);
    }

    @Test(expected=NullJsonException.class)
    public void addTest9() {
        JsonNull.NULL.add("world");
    }

    @Test(expected=NullJsonException.class)
    public void addTest10() {
        JsonNull.NULL.add(0, "world");
    }

    @Test
    public void asArrayTest() {
        JsonNull.NULL.asArray();
    }

    @Test
    public void asBooleanTest() {
        JsonNull.NULL.asBoolean();
    }

    @Test
    public void asNumberTest() {
        JsonNull.NULL.asNumber();
    }

    @Test
    public void asObjectTest() {
        JsonNull.NULL.asObject();
    }

    @Test
    public void asScalarTest() {
        JsonNull.NULL.asScalar();
    }

    @Test
    public void asStringTest() {
        JsonNull.NULL.asString();
    }

    @Test(expected=NullJsonException.class)
    public void booleanValTest() {
        JsonNull.NULL.booleanVal();
    }

    @Test(expected=NullJsonException.class)
    public void doubleValTest() {
        JsonNull.NULL.doubleVal();
    }

    @Test(expected=NullJsonException.class)
    public void entriesTest() {
        JsonNull.NULL.entries();
    }

    @Test(expected=NullJsonException.class)
    public void getTest1() {
        JsonNull.NULL.get(0);
    }

    @Test(expected=NullJsonException.class)
    public void getTest2() {
        JsonNull.NULL.get("hello");
    }

    @Test
    public void getBooleanValueTest() {
        assertThat(JsonNull.NULL.getBooleanValue(), nullValue());
    }

    @Test
    public void getFlavorTest() {
        assertThat(JsonNull.NULL.getFlavor(), is(ScalarJsonValue.Flavor.NULL));
    }

    @Test
    public void getNumberValueTest() {
        assertThat(JsonNull.NULL.getNumberValue(), nullValue());
    }

    @Test
    public void getStringValueTest() {
        assertThat(JsonNull.NULL.getStringValue(), nullValue());
    }

    @Test
    public void getTypeTest() {
        assertThat(JsonNull.NULL.getType(), is(JsonValue.Type.NULL));
    }

    @Test
    public void getValueTest() {
        assertThat(JsonNull.NULL.getValue(), nullValue());
    }

    @Test
    public void isNullTest() {
        assertThat(JsonNull.NULL.isNull(), is(true));
    }

    @Test(expected=NullJsonException.class)
    public void iteratorTest() {
        JsonNull.NULL.iterator();
    }

    @Test(expected=NullJsonException.class)
    public void keysTest() {
        JsonNull.NULL.keys();
    }

    @Test(expected=NullJsonException.class)
    public void longValTest() {
        JsonNull.NULL.longVal();
    }

    @Test(expected=NullJsonException.class)
    public void intValTest() {
        JsonNull.NULL.intVal();
    }

    @Test(expected=NullJsonException.class)
    public void removeTest1() {
        JsonNull.NULL.remove(0);
    }

    @Test(expected=NullJsonException.class)
    public void removeTest2() {
        JsonNull.NULL.remove("hello");
    }

    @Test(expected=NullJsonException.class)
    public void setTest1() {
        JsonNull.NULL.set(0, Json.TRUE);
    }

    @Test(expected=NullJsonException.class)
    public void setTest2() {
        JsonNull.NULL.set("hello", Json.TRUE);
    }

    @Test(expected=NullJsonException.class)
    public void setTest3() {
        JsonNull.NULL.set(0, true);
    }

    @Test(expected=NullJsonException.class)
    public void setTest4() {
        JsonNull.NULL.set("hello", true);
    }

    @Test(expected=NullJsonException.class)
    public void setTest5() {
        JsonNull.NULL.set(0, 0L);
    }

    @Test(expected=NullJsonException.class)
    public void setTest6() {
        JsonNull.NULL.set("hello", 0L);
    }

    @Test(expected=NullJsonException.class)
    public void setTest7() {
        JsonNull.NULL.set(0, 0.0);
    }

    @Test(expected=NullJsonException.class)
    public void setTest8() {
        JsonNull.NULL.set("hello", 0.0);
    }

    @Test(expected=NullJsonException.class)
    public void setTest9() {
        JsonNull.NULL.set(0, "world");
    }

    @Test(expected=NullJsonException.class)
    public void setTest10() {
        JsonNull.NULL.set("hello", "world");
    }

    @Test(expected=NullJsonException.class)
    public void sizeTest() {
        JsonNull.NULL.size();
    }

    @Test(expected=NullJsonException.class)
    public void stringValTest() {
        JsonNull.NULL.stringVal();
    }

    @Test(expected=NullJsonException.class)
    public void valuesTest() {
        JsonNull.NULL.values();
    }
}
