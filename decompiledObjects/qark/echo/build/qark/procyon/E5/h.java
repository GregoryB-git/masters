// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E5;

import java.util.Iterator;
import java.util.Map;
import java.lang.reflect.Array;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class h
{
    public static Object a(final Object o) {
        if (o == null) {
            return JSONObject.NULL;
        }
        Object o2 = o;
        if (o instanceof JSONArray) {
            return o2;
        }
        if (o instanceof JSONObject) {
            return o;
        }
        if (o.equals(JSONObject.NULL)) {
            return o;
        }
        JSONArray jsonArray;
        try {
            if (o instanceof Collection) {
                jsonArray = new JSONArray();
                final Iterator<Object> iterator = (Iterator<Object>)((Collection)o).iterator();
                while (iterator.hasNext()) {
                    jsonArray.put(a(iterator.next()));
                }
            }
            else {
                if (o.getClass().isArray()) {
                    final JSONArray jsonArray2 = new JSONArray();
                    for (int length = Array.getLength(o), i = 0; i < length; ++i) {
                        jsonArray2.put(a(Array.get(o, i)));
                    }
                    return jsonArray2;
                }
                if (o instanceof Map) {
                    final JSONObject jsonObject = new JSONObject();
                    for (final Map.Entry<String, V> entry : ((Map)o).entrySet()) {
                        jsonObject.put((String)entry.getKey(), a(entry.getValue()));
                    }
                    return jsonObject;
                }
                Object string = o;
                if (!(o instanceof Boolean)) {
                    string = o;
                    if (!(o instanceof Byte)) {
                        string = o;
                        if (!(o instanceof Character)) {
                            string = o;
                            if (!(o instanceof Double)) {
                                string = o;
                                if (!(o instanceof Float)) {
                                    string = o;
                                    if (!(o instanceof Integer)) {
                                        string = o;
                                        if (!(o instanceof Long)) {
                                            string = o;
                                            if (!(o instanceof Short)) {
                                                if (o instanceof String) {
                                                    return o;
                                                }
                                                if (!o.getClass().getPackage().getName().startsWith("java.")) {
                                                    o2 = null;
                                                    return o2;
                                                }
                                                string = o.toString();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return string;
            }
        }
        catch (Exception ex) {
            return null;
        }
        return jsonArray;
    }
}
