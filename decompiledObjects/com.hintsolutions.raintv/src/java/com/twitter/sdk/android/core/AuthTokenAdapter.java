/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.twitter.sdk.android.core.internal.oauth.GuestAuthToken
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.twitter.sdk.android.core;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.twitter.sdk.android.core.AuthToken;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class AuthTokenAdapter
implements JsonSerializer<AuthToken>,
JsonDeserializer<AuthToken> {
    private static final String AUTH_TOKEN = "auth_token";
    private static final String AUTH_TYPE = "auth_type";
    public static final Map<String, Class<? extends AuthToken>> authTypeRegistry;
    private final Gson gson = new Gson();

    static {
        HashMap hashMap;
        authTypeRegistry = hashMap = new HashMap();
        hashMap.put((Object)"oauth1a", TwitterAuthToken.class);
        hashMap.put((Object)"oauth2", OAuth2Token.class);
        hashMap.put((Object)"guest", GuestAuthToken.class);
    }

    public static String getAuthTypeString(Class<? extends AuthToken> clazz) {
        for (Map.Entry entry : authTypeRegistry.entrySet()) {
            if (!((Class)entry.getValue()).equals(clazz)) continue;
            return (String)entry.getKey();
        }
        return "";
    }

    public AuthToken deserialize(JsonElement object, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        type = object.getAsJsonObject();
        object = type.getAsJsonPrimitive(AUTH_TYPE).getAsString();
        type = type.get(AUTH_TOKEN);
        return (AuthToken)this.gson.fromJson((JsonElement)type, (Class)authTypeRegistry.get(object));
    }

    public JsonElement serialize(AuthToken authToken, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(AUTH_TYPE, AuthTokenAdapter.getAuthTypeString((Class<? extends AuthToken>)authToken.getClass()));
        type.add(AUTH_TOKEN, this.gson.toJsonTree((Object)authToken));
        return type;
    }
}

