package O5;

import android.content.SharedPreferences;
import com.google.firebase.messaging.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y {

    /* renamed from: c, reason: collision with root package name */
    public static y f4089c;

    /* renamed from: a, reason: collision with root package name */
    public final String f4090a = ",";

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f4091b;

    public static y b() {
        if (f4089c == null) {
            f4089c = new y();
        }
        return f4089c;
    }

    public Map a(String str) {
        String d7 = d(str, null);
        if (d7 != null) {
            try {
                HashMap hashMap = new HashMap(1);
                Map f7 = f(new JSONObject(d7));
                f7.put("to", str);
                hashMap.put("message", f7);
                return hashMap;
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
        return null;
    }

    public final SharedPreferences c() {
        if (this.f4091b == null) {
            this.f4091b = AbstractC0460a.a().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return this.f4091b;
    }

    public String d(String str, String str2) {
        return c().getString(str, str2);
    }

    public List e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final Map f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public void g(String str) {
        c().edit().remove(str).apply();
        String d7 = d("notification_ids", "");
        if (d7.isEmpty()) {
            return;
        }
        h("notification_ids", d7.replace(str + ",", ""));
    }

    public void h(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }

    public void i(T t7) {
        h(t7.g(), new JSONObject(z.f(t7)).toString());
        String str = d("notification_ids", "") + t7.g() + ",";
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(",")));
        if (arrayList.size() > 20) {
            String str2 = (String) arrayList.get(0);
            c().edit().remove(str2).apply();
            str = str.replace(str2 + ",", "");
        }
        h("notification_ids", str);
    }
}
