/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package O5;

import O5.a;
import O5.z;
import android.content.SharedPreferences;
import com.google.firebase.messaging.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class y {
    public static y c;
    public final String a = ",";
    public SharedPreferences b;

    public static y b() {
        if (c == null) {
            c = new y();
        }
        return c;
    }

    public Map a(String string2) {
        String string3 = this.d(string2, null);
        if (string3 != null) {
            try {
                HashMap hashMap = new HashMap(1);
                string3 = this.f(new JSONObject(string3));
                string3.put((Object)"to", (Object)string2);
                hashMap.put((Object)"message", (Object)string3);
                return hashMap;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        return null;
    }

    public final SharedPreferences c() {
        if (this.b == null) {
            this.b = a.a().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return this.b;
    }

    public String d(String string2, String string3) {
        return this.c().getString(string2, string3);
    }

    public List e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); ++i8) {
            Object object;
            Object object2 = jSONArray.get(i8);
            if (object2 instanceof JSONArray) {
                object = this.e((JSONArray)object2);
            } else {
                object = object2;
                if (object2 instanceof JSONObject) {
                    object = this.f((JSONObject)object2);
                }
            }
            arrayList.add(object);
        }
        return arrayList;
    }

    public final Map f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            Object object;
            String string2 = (String)iterator.next();
            Object object2 = jSONObject.get(string2);
            if (object2 instanceof JSONArray) {
                object = this.e((JSONArray)object2);
            } else {
                object = object2;
                if (object2 instanceof JSONObject) {
                    object = this.f((JSONObject)object2);
                }
            }
            hashMap.put((Object)string2, object);
        }
        return hashMap;
    }

    public void g(String string2) {
        this.c().edit().remove(string2).apply();
        String string3 = this.d("notification_ids", "");
        if (!string3.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(",");
            this.h("notification_ids", string3.replace((CharSequence)stringBuilder.toString(), (CharSequence)""));
        }
    }

    public void h(String string2, String string3) {
        this.c().edit().putString(string2, string3).apply();
    }

    public void i(T object) {
        String string2 = new JSONObject(z.f((T)object)).toString();
        this.h(object.g(), string2);
        string2 = this.d("notification_ids", "");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(object.g());
        stringBuilder.append(",");
        string2 = stringBuilder.toString();
        stringBuilder = new ArrayList((Collection)Arrays.asList((Object[])string2.split(",")));
        object = string2;
        if (stringBuilder.size() > 20) {
            object = (String)stringBuilder.get(0);
            this.c().edit().remove((String)object).apply();
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(",");
            object = string2.replace((CharSequence)stringBuilder.toString(), (CharSequence)"");
        }
        this.h("notification_ids", (String)object);
    }
}

