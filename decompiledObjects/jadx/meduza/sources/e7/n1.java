package e7;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoy;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4499a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f4500b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f4501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f4502d;

    public n1(l1 l1Var, String str) {
        this.f4502d = l1Var;
        m6.j.e(str);
        this.f4499a = str;
        this.f4500b = new Bundle();
    }

    public final Bundle a() {
        if (this.f4501c == null) {
            String string = this.f4502d.v().getString(this.f4499a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            char c10 = 65535;
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode != 115) {
                                        if (hashCode != 3352) {
                                            if (hashCode == 3445 && string3.equals("la")) {
                                                c10 = 4;
                                            }
                                        } else if (string3.equals("ia")) {
                                            c10 = 3;
                                        }
                                    } else if (string3.equals("s")) {
                                        c10 = 0;
                                    }
                                } else if (string3.equals("l")) {
                                    c10 = 2;
                                }
                            } else if (string3.equals("d")) {
                                c10 = 1;
                            }
                            if (c10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c10 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (c10 != 3) {
                                if (c10 != 4) {
                                    this.f4502d.zzj().f4060o.c("Unrecognized persisted bundle type. Type", string3);
                                } else if (zzoy.zza() && this.f4502d.h().x(null, h0.R0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    long[] jArr = new long[length];
                                    for (int i11 = 0; i11 < length; i11++) {
                                        jArr[i11] = jSONArray2.optLong(i11);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            } else if (zzoy.zza() && this.f4502d.h().x(null, h0.R0)) {
                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                int length2 = jSONArray3.length();
                                int[] iArr = new int[length2];
                                for (int i12 = 0; i12 < length2; i12++) {
                                    iArr[i12] = jSONArray3.optInt(i12);
                                }
                                bundle.putIntArray(string2, iArr);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f4502d.zzj().f4060o.b("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f4501c = bundle;
                } catch (JSONException unused2) {
                    this.f4502d.zzj().f4060o.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f4501c == null) {
                this.f4501c = this.f4500b;
            }
        }
        Bundle bundle2 = this.f4501c;
        m6.j.i(bundle2);
        return new Bundle(bundle2);
    }

    public final void b(Bundle bundle) {
        Iterator<String> it;
        JSONObject jSONObject;
        b1 b1Var;
        String str;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences.Editor edit = this.f4502d.v().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.f4499a);
        } else {
            String str2 = this.f4499a;
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                    } catch (JSONException e10) {
                        e = e10;
                        it = it2;
                    }
                    if (zzoy.zza()) {
                        it = it2;
                        try {
                        } catch (JSONException e11) {
                            e = e11;
                            this.f4502d.zzj().f4060o.c("Cannot serialize bundle value to SharedPreferences", e);
                            it2 = it;
                        }
                        if (this.f4502d.h().x(null, h0.R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "s");
                                jSONArray.put(jSONObject);
                                it2 = it;
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                                jSONArray.put(jSONObject);
                                it2 = it;
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
                                    jSONArray.put(jSONObject);
                                    it2 = it;
                                } else {
                                    b1Var = this.f4502d.zzj().f4060o;
                                    b1Var.c("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                                    it2 = it;
                                }
                                jSONObject.put("t", str);
                                jSONArray.put(jSONObject);
                                it2 = it;
                            }
                        }
                    } else {
                        it = it2;
                    }
                    jSONObject.put("v", String.valueOf(obj));
                    if (!(obj instanceof String)) {
                        if (!(obj instanceof Long)) {
                            if (!(obj instanceof Double)) {
                                b1Var = this.f4502d.zzj().f4060o;
                                b1Var.c("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                                it2 = it;
                            }
                            jSONObject.put("t", "d");
                            jSONArray.put(jSONObject);
                            it2 = it;
                        }
                        jSONObject.put("t", "l");
                        jSONArray.put(jSONObject);
                        it2 = it;
                    }
                    jSONObject.put("t", "s");
                    jSONArray.put(jSONObject);
                    it2 = it;
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f4501c = bundle2;
    }
}
