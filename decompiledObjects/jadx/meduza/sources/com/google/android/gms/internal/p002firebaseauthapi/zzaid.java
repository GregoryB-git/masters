package com.google.android.gms.internal.p002firebaseauthapi;

import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaid implements zzaeb {
    private String zza;
    private String zzb;

    public zzaid(String str, String str2) {
        j.e(str);
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.zza);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
