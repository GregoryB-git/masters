/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.TypeAdapter
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  java.io.IOException
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.Map
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class SafeMapAdapter
implements TypeAdapterFactory {
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return new TypeAdapter<T>(this, gson.getDelegateAdapter((TypeAdapterFactory)this, typeToken), typeToken){
            public final SafeMapAdapter this$0;
            public final TypeAdapter val$delegate;
            public final TypeToken val$tokenType;
            {
                this.this$0 = safeMapAdapter;
                this.val$delegate = typeAdapter;
                this.val$tokenType = typeToken;
            }

            public T read(JsonReader object) throws IOException {
                Object object2 = this.val$delegate.read(object);
                object = object2;
                if (Map.class.isAssignableFrom(this.val$tokenType.getRawType())) {
                    if (object2 == null) {
                        return Collections.EMPTY_MAP;
                    }
                    object = Collections.unmodifiableMap((Map)((Map)object2));
                }
                return object;
            }

            public void write(JsonWriter jsonWriter, T t) throws IOException {
                this.val$delegate.write(jsonWriter, t);
            }
        };
    }
}

