package com.google.android.gms.internal.p002firebaseauthapi;

import b8.t0;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

/* loaded from: classes.dex */
public class zzagm implements zzaea<zzagm> {
    private static final String zza = "zzagm";
    private zzago zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagm zza(String str) {
        zzago zzagoVar;
        int i10;
        zzagl zzaglVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z10 = false;
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            zzaglVar = new zzagl();
                            i10 = i11;
                        } else {
                            i10 = i11;
                            zzaglVar = new zzagl(g.a(jSONObject2.optString("localId", null)), g.a(jSONObject2.optString(Constants.EMAIL, null)), jSONObject2.optBoolean("emailVerified", z10), g.a(jSONObject2.optString("displayName", null)), g.a(jSONObject2.optString("photoUrl", null)), zzahb.zza(jSONObject2.optJSONArray("providerUserInfo")), g.a(jSONObject2.optString("rawPassword", null)), g.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzagz.zza(jSONObject2.optJSONArray("mfaInfo")), t0.E(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzaglVar);
                        i11 = i10 + 1;
                        z10 = false;
                    }
                    zzagoVar = new zzago(arrayList);
                }
                zzagoVar = new zzago(new ArrayList());
            } else {
                zzagoVar = new zzago();
            }
            this.zzb = zzagoVar;
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzail.zza(e10, zza, str);
        }
    }

    public final List<zzagl> zza() {
        return this.zzb.zza();
    }
}
