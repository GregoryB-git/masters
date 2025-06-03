/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.stream.JsonReader
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.gson.ArticlesMapDeserializer
 *  ru.tvrain.core.data.gson.ProgramsMapDeserializer
 *  ru.tvrain.core.utils.PojoHelper$1
 *  ru.tvrain.core.utils.PojoHelper$2
 */
package ru.tvrain.core.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.util.ArrayList;
import java.util.List;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.ArticlesMap;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.data.ProgramsMap;
import ru.tvrain.core.data.gson.ArticlesMapDeserializer;
import ru.tvrain.core.data.gson.ProgramsMapDeserializer;
import ru.tvrain.core.utils.PojoHelper;

public class PojoHelper {
    private static Gson gsonInstance;

    /*
     * WARNING - void declaration
     */
    public static <T> List<T> arrayFromResponse(ResponseBody responseBody, Class<T> jsonReader) {
        block7: {
            void var0_3;
            if (Article.class != jsonReader && Program.class != jsonReader) {
                return null;
            }
            if (Article.class == jsonReader) {
                jsonReader = new JsonReader(responseBody.charStream());
                return new ArrayList(((ArticlesMap)PojoHelper.getGson().fromJson((JsonReader)jsonReader, ArticlesMap.class)).map.values());
            }
            if (Program.class != jsonReader) break block7;
            try {
                jsonReader = new JsonReader(responseBody.charStream());
                responseBody = new ArrayList(((ProgramsMap)PojoHelper.getGson().fromJson((JsonReader)jsonReader, ProgramsMap.class)).map.values());
                return responseBody;
            }
            catch (Exception exception) {
            }
            catch (OutOfMemoryError outOfMemoryError) {
                // empty catch block
            }
            var0_3.printStackTrace();
        }
        return null;
    }

    private static Gson getGson() {
        if (gsonInstance == null) {
            gsonInstance = new GsonBuilder().registerTypeAdapter(new 1().getType(), (Object)new ArticlesMapDeserializer()).registerTypeAdapter(new 2().getType(), (Object)new ProgramsMapDeserializer()).create();
        }
        return gsonInstance;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static <T> T objectFromResponse(ResponseBody object, int n3, Class<T> jsonReader) {
        void var0_3;
        block6: {
            if (Article.class != jsonReader && Program.class != jsonReader) {
                return null;
            }
            if (Article.class == jsonReader) {
                jsonReader = new JsonReader(object.charStream());
                return (T)((ArticlesMap)PojoHelper.getGson().fromJson((JsonReader)jsonReader, ArticlesMap.class)).map.get((Object)String.valueOf((int)n3));
            }
            if (Program.class != jsonReader) return null;
            try {
                jsonReader = new JsonReader(object.charStream());
                object = ((ProgramsMap)PojoHelper.getGson().fromJson((JsonReader)jsonReader, ProgramsMap.class)).map.get((Object)String.valueOf((int)n3));
            }
            catch (Exception exception) {
                break block6;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                // empty catch block
            }
            return (T)object;
        }
        var0_3.printStackTrace();
        return null;
    }
}

