package R2;

import A2.AbstractC0328n;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0917g7;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: R2.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563n2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5428a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f5429b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f5430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0549l2 f5431d;

    public C0563n2(C0549l2 c0549l2, String str, Bundle bundle) {
        this.f5431d = c0549l2;
        AbstractC0328n.e(str);
        this.f5428a = str;
        this.f5429b = new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120 A[Catch: NumberFormatException | JSONException -> 0x0128, NumberFormatException | JSONException -> 0x0128, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0128, blocks: (B:13:0x0025, B:31:0x0091, B:31:0x0091, B:34:0x00a2, B:34:0x00a2, B:36:0x00a8, B:36:0x00a8, B:38:0x00b6, B:38:0x00b6, B:40:0x00c8, B:40:0x00c8, B:42:0x00d1, B:42:0x00d1, B:46:0x00d5, B:46:0x00d5, B:48:0x00db, B:48:0x00db, B:50:0x00e9, B:50:0x00e9, B:52:0x00fb, B:52:0x00fb, B:54:0x0104, B:54:0x0104, B:58:0x0108, B:58:0x0108, B:60:0x0114, B:60:0x0114, B:62:0x0120, B:62:0x0120, B:64:0x0052, B:67:0x005c, B:70:0x0066, B:73:0x0070, B:76:0x007a), top: B:12:0x0025, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0563n2.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f5431d.F().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f5428a);
        } else {
            edit.putString(this.f5428a, c(bundle));
        }
        edit.apply();
        this.f5430c = bundle;
    }

    public final String c(Bundle bundle) {
        C0472a2 G6;
        Class<?> cls;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str2);
                    if (!C0917g7.a() || !this.f5431d.f().s(K.f4791M0)) {
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            G6 = this.f5431d.j().G();
                            cls = obj.getClass();
                            G6.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                        }
                    } else if (obj instanceof String) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "s");
                    } else if (obj instanceof Long) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "l");
                    } else {
                        if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            str = "ia";
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            str = "la";
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "d");
                        } else {
                            G6 = this.f5431d.j().G();
                            cls = obj.getClass();
                            G6.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                        }
                        jSONObject.put("t", str);
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e7) {
                    this.f5431d.j().G().b("Cannot serialize bundle value to SharedPreferences", e7);
                }
            }
        }
        return jSONArray.toString();
    }
}
