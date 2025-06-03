/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.json.JSONStringer
 *  org.json.JSONTokener
 */
package f4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

public abstract class b {
    public static Map a(String string2) {
        try {
            string2 = b.h(new JSONObject(string2));
            return string2;
        }
        catch (JSONException jSONException) {
            throw new IOException((Throwable)jSONException);
        }
    }

    public static Object b(String object) {
        try {
            object = b.f(new JSONTokener((String)object).nextValue());
            return object;
        }
        catch (JSONException jSONException) {
            throw new IOException((Throwable)jSONException);
        }
    }

    public static String c(Map map) {
        return b.d((Object)map);
    }

    public static String d(Object object) {
        if (object == null) {
            return "null";
        }
        if (object instanceof String) {
            return JSONObject.quote((String)((String)object));
        }
        if (object instanceof Number) {
            try {
                object = JSONObject.numberToString((Number)((Number)object));
                return object;
            }
            catch (JSONException jSONException) {
                throw new IOException("Could not serialize number", (Throwable)jSONException);
            }
        }
        if (object instanceof Boolean) {
            if (((Boolean)object).booleanValue()) {
                return "true";
            }
            return "false";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            b.e(object, jSONStringer);
            object = jSONStringer.toString();
            return object;
        }
        catch (JSONException jSONException) {
            throw new IOException("Failed to serialize JSON", (Throwable)jSONException);
        }
    }

    public static void e(Object object, JSONStringer jSONStringer) {
        if (object instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map)object).entrySet()) {
                jSONStringer.key((String)entry.getKey());
                b.e(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
            return;
        }
        if (object instanceof Collection) {
            object = (Collection)object;
            jSONStringer.array();
            object = object.iterator();
            while (object.hasNext()) {
                b.e(object.next(), jSONStringer);
            }
            jSONStringer.endArray();
            return;
        }
        jSONStringer.value(object);
    }

    public static Object f(Object object) {
        if (object instanceof JSONObject) {
            return b.h((JSONObject)object);
        }
        if (object instanceof JSONArray) {
            return b.g((JSONArray)object);
        }
        Object object2 = object;
        if (object.equals(JSONObject.NULL)) {
            object2 = null;
        }
        return object2;
    }

    public static List g(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i8 = 0; i8 < jSONArray.length(); ++i8) {
            arrayList.add(b.f(jSONArray.get(i8)));
        }
        return arrayList;
    }

    public static Map h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            hashMap.put((Object)string2, b.f(jSONObject.get(string2)));
        }
        return hashMap;
    }
}

