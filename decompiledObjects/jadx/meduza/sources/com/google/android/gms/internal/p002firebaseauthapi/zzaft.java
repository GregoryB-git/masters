package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.crashlytics.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaft implements zzaeb {
    private String zza;
    private String zzb;
    private final String zzc;

    public zzaft(String str, String str2) {
        j.e(str);
        this.zza = str;
        this.zzb = "http://localhost";
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.IDENTIFIER, this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
