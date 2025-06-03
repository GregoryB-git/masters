/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Package
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package E5;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class h {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object a(Object object) {
        block23 : {
            Object object2;
            block22 : {
                if (object == null) {
                    return JSONObject.NULL;
                }
                object2 = object;
                if (object instanceof JSONArray) return object2;
                if (object instanceof JSONObject) {
                    return object;
                }
                if (object.equals(JSONObject.NULL)) {
                    return object;
                }
                if (object instanceof Collection) {
                    object2 = new JSONArray();
                    object = ((Collection)object).iterator();
                    while (object.hasNext()) {
                        object2.put(h.a(object.next()));
                    }
                    return object2;
                }
                if (!object.getClass().isArray()) break block22;
                object2 = new JSONArray();
                int n8 = Array.getLength((Object)object);
                int n9 = 0;
                while (n9 < n8) {
                    object2.put(h.a(Array.get((Object)object, (int)n9)));
                    ++n9;
                }
                return object2;
            }
            try {
                if (object instanceof Map) {
                    object2 = new JSONObject();
                    object = ((Map)object).entrySet().iterator();
                    while (object.hasNext()) {
                        Map.Entry entry = (Map.Entry)object.next();
                        object2.put((String)entry.getKey(), h.a(entry.getValue()));
                    }
                    return object2;
                }
                object2 = object;
            }
            catch (Exception exception) {
                return null;
            }
            if (object instanceof Boolean) return object2;
            object2 = object;
            if (object instanceof Byte) return object2;
            object2 = object;
            if (object instanceof Character) return object2;
            object2 = object;
            if (object instanceof Double) return object2;
            object2 = object;
            if (object instanceof Float) return object2;
            object2 = object;
            if (object instanceof Integer) return object2;
            object2 = object;
            if (object instanceof Long) return object2;
            object2 = object;
            if (object instanceof Short) return object2;
            if (!(object instanceof String)) break block23;
            return object;
        }
        if (!object.getClass().getPackage().getName().startsWith("java.")) return null;
        return object.toString();
    }
}

