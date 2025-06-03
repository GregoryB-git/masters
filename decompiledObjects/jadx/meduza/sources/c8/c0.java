package c8;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p6.a f2420a = new p6.a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map<String, Object> b(String str) {
        m6.j.e(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            f2420a.c(defpackage.f.j("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = zza.get(1);
        try {
            r.b d10 = d(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return d10 == null ? new HashMap() : d10;
        } catch (UnsupportedEncodingException e10) {
            f2420a.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static r.b c(JSONObject jSONObject) {
        r.b bVar = new r.b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            bVar.put(next, obj);
        }
        return bVar;
    }

    public static r.b d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzzp(e10);
        }
    }
}
