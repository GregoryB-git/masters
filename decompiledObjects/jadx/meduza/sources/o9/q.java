package o9;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {
    public q() {
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static Object a(Object obj) {
        if (obj instanceof Number) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (!(obj instanceof JSONObject)) {
            if (!(obj instanceof JSONArray)) {
                if (obj == JSONObject.NULL) {
                    return null;
                }
                throw new IllegalArgumentException("Object cannot be decoded from JSON: " + obj);
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Object opt = jSONArray.opt(i10);
                ec.i.d(opt, "obj.opt(i)");
                arrayList.add(a(opt));
            }
            return arrayList;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.has("@type")) {
            String optString = jSONObject.optString("@type");
            String optString2 = jSONObject.optString("value");
            if (ec.i.a(optString, "type.googleapis.com/google.protobuf.Int64Value")) {
                try {
                    ec.i.d(optString2, "value");
                    return Long.valueOf(Long.parseLong(optString2));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(defpackage.g.d("Invalid Long format:", optString2));
                }
            }
            if (ec.i.a(optString, "type.googleapis.com/google.protobuf.UInt64Value")) {
                try {
                    ec.i.d(optString2, "value");
                    return Long.valueOf(Long.parseLong(optString2));
                } catch (NumberFormatException unused2) {
                    throw new IllegalArgumentException(defpackage.g.d("Invalid Long format:", optString2));
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt2 = jSONObject.opt(next);
            ec.i.d(opt2, "obj.opt(key)");
            Object a10 = a(opt2);
            ec.i.d(next, Constants.KEY);
            hashMap.put(next, a10);
        }
        return hashMap;
    }

    public static Object b(Object obj) {
        boolean z10;
        boolean z11;
        if (obj == null || obj == JSONObject.NULL) {
            Object obj2 = JSONObject.NULL;
            ec.i.d(obj2, "NULL");
            return obj2;
        }
        if (obj instanceof Long) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@type", "type.googleapis.com/google.protobuf.Int64Value");
                jSONObject.put("value", String.valueOf(((Number) obj).longValue()));
                return jSONObject;
            } catch (JSONException e10) {
                throw new RuntimeException("Error encoding Long.", e10);
            }
        }
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean) || ((z10 = obj instanceof JSONObject)) || ((z11 = obj instanceof JSONArray))) {
            return obj;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject2 = new JSONObject();
            Map map = (Map) obj;
            for (Object obj3 : map.keySet()) {
                if (!(obj3 instanceof String)) {
                    throw new IllegalArgumentException("Object keys must be strings.".toString());
                }
                try {
                    jSONObject2.put((String) obj3, b(map.get(obj3)));
                } catch (JSONException e11) {
                    throw new RuntimeException(e11);
                }
            }
            return jSONObject2;
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next()));
            }
            return jSONArray;
        }
        if (z10) {
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = (JSONObject) obj;
            Iterator<String> keys = jSONObject4.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next == null) {
                    throw new IllegalArgumentException("Object keys cannot be null.");
                }
                try {
                    jSONObject3.put(next, b(jSONObject4.opt(next)));
                } catch (JSONException e12) {
                    throw new RuntimeException(e12);
                }
            }
            return jSONObject3;
        }
        if (!z11) {
            throw new IllegalArgumentException("Object cannot be encoded in JSON: " + obj);
        }
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = (JSONArray) obj;
        int length = jSONArray3.length();
        for (int i10 = 0; i10 < length; i10++) {
            jSONArray2.put(b(jSONArray3.opt(i10)));
        }
        return jSONArray2;
    }
}
