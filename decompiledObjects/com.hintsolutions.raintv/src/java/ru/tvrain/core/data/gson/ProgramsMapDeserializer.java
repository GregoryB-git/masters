/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.HashMap
 */
package ru.tvrain.core.data.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashMap;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.data.ProgramsMap;

public class ProgramsMapDeserializer
implements JsonDeserializer<ProgramsMap> {
    private Gson gson = new GsonBuilder().setDateFormat("yyyy-mm-dd HH:mm:ss").create();

    public ProgramsMap deserialize(JsonElement object, Type type, JsonDeserializationContext jsonDeserializationContext2) throws JsonParseException {
        type = new HashMap();
        for (JsonDeserializationContext jsonDeserializationContext2 : object.getAsJsonObject().entrySet()) {
            type.put((Object)((String)jsonDeserializationContext2.getKey()), (Object)((Program)this.gson.fromJson((JsonElement)jsonDeserializationContext2.getValue(), Program.class)));
        }
        object = new ProgramsMap();
        object.map = type;
        return object;
    }
}

