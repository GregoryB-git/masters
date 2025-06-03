/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.HashMap
 *  java.util.Map
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.twitter.sdk.android.core.models.BindingValues;
import com.twitter.sdk.android.core.models.ImageValue;
import com.twitter.sdk.android.core.models.UserValue;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class BindingValuesAdapter
implements JsonSerializer<BindingValues>,
JsonDeserializer<BindingValues> {
    private static final String BOOLEAN_MEMBER = "boolean_value";
    private static final String BOOLEAN_TYPE = "BOOLEAN";
    private static final String IMAGE_TYPE = "IMAGE";
    private static final String IMAGE_VALUE_MEMBER = "image_value";
    private static final String STRING_TYPE = "STRING";
    private static final String TYPE_MEMBER = "type";
    private static final String TYPE_VALUE_MEMBER = "string_value";
    private static final String USER_TYPE = "USER";
    private static final String USER_VALUE_MEMBER = "user_value";

    public BindingValues deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!jsonElement.isJsonObject()) {
            return new BindingValues();
        }
        type2 = jsonElement.getAsJsonObject().entrySet();
        jsonElement = new HashMap(32);
        for (Type type2 : type2) {
            jsonElement.put((Object)((String)type2.getKey()), this.getValue(((JsonElement)type2.getValue()).getAsJsonObject(), jsonDeserializationContext));
        }
        return new BindingValues((Map<String, Object>)jsonElement);
    }

    public Object getValue(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Object object = jsonObject.get(TYPE_MEMBER);
        if (object != null && object.isJsonPrimitive()) {
            object = object.getAsString();
            object.getClass();
            int n = -1;
            switch (object.hashCode()) {
                default: {
                    break;
                }
                case 782694408: {
                    if (!object.equals((Object)BOOLEAN_TYPE)) break;
                    n = 3;
                    break;
                }
                case 69775675: {
                    if (!object.equals((Object)IMAGE_TYPE)) break;
                    n = 2;
                    break;
                }
                case 2614219: {
                    if (!object.equals((Object)USER_TYPE)) break;
                    n = 1;
                    break;
                }
                case -1838656495: {
                    if (!object.equals((Object)STRING_TYPE)) break;
                    n = 0;
                }
            }
            switch (n) {
                default: {
                    return null;
                }
                case 3: {
                    return jsonDeserializationContext.deserialize(jsonObject.get(BOOLEAN_MEMBER), Boolean.class);
                }
                case 2: {
                    return jsonDeserializationContext.deserialize(jsonObject.get(IMAGE_VALUE_MEMBER), ImageValue.class);
                }
                case 1: {
                    return jsonDeserializationContext.deserialize(jsonObject.get(USER_VALUE_MEMBER), UserValue.class);
                }
                case 0: 
            }
            return jsonDeserializationContext.deserialize(jsonObject.get(TYPE_VALUE_MEMBER), String.class);
        }
        return null;
    }

    public JsonElement serialize(BindingValues bindingValues, Type type, JsonSerializationContext jsonSerializationContext) {
        return null;
    }
}

