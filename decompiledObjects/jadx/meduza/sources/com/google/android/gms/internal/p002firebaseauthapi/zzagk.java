package com.google.android.gms.internal.p002firebaseauthapi;

import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagk implements zzaeb {
    private String zza = zzagi.REFRESH_TOKEN.toString();
    private String zzb;

    public zzagk(String str) {
        j.e(str);
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
