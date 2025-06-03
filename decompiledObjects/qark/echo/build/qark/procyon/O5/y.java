// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O5;

import java.util.Collection;
import java.util.Arrays;
import com.google.firebase.messaging.T;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import android.content.SharedPreferences;

public class y
{
    public static y c;
    public final String a;
    public SharedPreferences b;
    
    public y() {
        this.a = ",";
    }
    
    public static y b() {
        if (y.c == null) {
            y.c = new y();
        }
        return y.c;
    }
    
    public Map a(final String s) {
        final String d = this.d(s, null);
        if (d != null) {
            try {
                final HashMap<String, Map<String, String>> hashMap = new HashMap<String, Map<String, String>>(1);
                final Map f = this.f(new JSONObject(d));
                f.put("to", s);
                hashMap.put("message", f);
                return hashMap;
            }
            catch (JSONException ex) {
                ((Throwable)ex).printStackTrace();
            }
        }
        return null;
    }
    
    public final SharedPreferences c() {
        if (this.b == null) {
            this.b = O5.a.a().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return this.b;
    }
    
    public String d(final String s, final String s2) {
        return this.c().getString(s, s2);
    }
    
    public List e(final JSONArray jsonArray) {
        final ArrayList<List> list = new ArrayList<List>();
        for (int i = 0; i < jsonArray.length(); ++i) {
            final Object value = jsonArray.get(i);
            Object o;
            if (value instanceof JSONArray) {
                o = this.e((JSONArray)value);
            }
            else {
                o = value;
                if (value instanceof JSONObject) {
                    o = this.f((JSONObject)value);
                }
            }
            list.add((List)o);
        }
        return list;
    }
    
    public final Map f(final JSONObject jsonObject) {
        final HashMap<String, List> hashMap = new HashMap<String, List>();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            final Object value = jsonObject.get(s);
            Object o;
            if (value instanceof JSONArray) {
                o = this.e((JSONArray)value);
            }
            else {
                o = value;
                if (value instanceof JSONObject) {
                    o = this.f((JSONObject)value);
                }
            }
            hashMap.put(s, (List)o);
        }
        return hashMap;
    }
    
    public void g(final String str) {
        this.c().edit().remove(str).apply();
        final String d = this.d("notification_ids", "");
        if (!d.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(",");
            this.h("notification_ids", d.replace(sb.toString(), ""));
        }
    }
    
    public void h(final String s, final String s2) {
        this.c().edit().putString(s, s2).apply();
    }
    
    public void i(final T t) {
        this.h(t.g(), new JSONObject(z.f(t)).toString());
        final String d = this.d("notification_ids", "");
        final StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(t.g());
        sb.append(",");
        final String string = sb.toString();
        final ArrayList list = new ArrayList<String>(Arrays.asList(string.split(",")));
        String replace = string;
        if (list.size() > 20) {
            final String str = list.get(0);
            this.c().edit().remove(str).apply();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(",");
            replace = string.replace(sb2.toString(), "");
        }
        this.h("notification_ids", replace);
    }
}
