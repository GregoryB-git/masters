package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaij implements zzaeb {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaij(String str, String str2, String str3) {
        j.e(str);
        this.zza = str;
        j.e(str2);
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
