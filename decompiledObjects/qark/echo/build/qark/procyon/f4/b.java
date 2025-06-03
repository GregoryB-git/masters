// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f4;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import java.util.Iterator;
import java.util.Collection;
import org.json.JSONStringer;
import org.json.JSONTokener;
import org.json.JSONException;
import java.io.IOException;
import org.json.JSONObject;
import java.util.Map;

public abstract class b
{
    public static Map a(final String s) {
        try {
            return h(new JSONObject(s));
        }
        catch (JSONException cause) {
            throw new IOException((Throwable)cause);
        }
    }
    
    public static Object b(final String s) {
        try {
            return f(new JSONTokener(s).nextValue());
        }
        catch (JSONException cause) {
            throw new IOException((Throwable)cause);
        }
    }
    
    public static String c(final Map map) {
        return d(map);
    }
    
    public static String d(final Object o) {
        if (o == null) {
            return "null";
        }
        if (o instanceof String) {
            return JSONObject.quote((String)o);
        }
        if (o instanceof Number) {
            try {
                return JSONObject.numberToString((Number)o);
            }
            catch (JSONException cause) {
                throw new IOException("Could not serialize number", (Throwable)cause);
            }
        }
        if (o instanceof Boolean) {
            if (o) {
                return "true";
            }
            return "false";
        }
        else {
            try {
                final JSONStringer jsonStringer = new JSONStringer();
                e(o, jsonStringer);
                return jsonStringer.toString();
            }
            catch (JSONException cause2) {
                throw new IOException("Failed to serialize JSON", (Throwable)cause2);
            }
        }
    }
    
    public static void e(final Object o, final JSONStringer jsonStringer) {
        if (o instanceof Map) {
            jsonStringer.object();
            for (final Map.Entry<String, V> entry : ((Map)o).entrySet()) {
                jsonStringer.key((String)entry.getKey());
                e(entry.getValue(), jsonStringer);
            }
            jsonStringer.endObject();
            return;
        }
        if (o instanceof Collection) {
            final Collection collection = (Collection)o;
            jsonStringer.array();
            final Iterator<Object> iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                e(iterator2.next(), jsonStringer);
            }
            jsonStringer.endArray();
            return;
        }
        jsonStringer.value(o);
    }
    
    public static Object f(final Object o) {
        if (o instanceof JSONObject) {
            return h((JSONObject)o);
        }
        if (o instanceof JSONArray) {
            return g((JSONArray)o);
        }
        Object o2 = o;
        if (o.equals(JSONObject.NULL)) {
            o2 = null;
        }
        return o2;
    }
    
    public static List g(final JSONArray jsonArray) {
        final ArrayList<Object> list = new ArrayList<Object>(jsonArray.length());
        for (int i = 0; i < jsonArray.length(); ++i) {
            list.add(f(jsonArray.get(i)));
        }
        return list;
    }
    
    public static Map h(final JSONObject jsonObject) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>(jsonObject.length());
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            hashMap.put(s, f(jsonObject.get(s)));
        }
        return hashMap;
    }
}
