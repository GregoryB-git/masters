package com.google.android.gms.internal.p002firebaseauthapi;

import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagf implements zzagc {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzagf(String str, String str2, String str3, String str4, String str5) {
        j.e(str);
        j.e(str2);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
    }

    public static zzagf zza(String str, String str2, String str3, String str4) {
        j.e(str2);
        j.e(str4);
        return new zzagf("totp", str, str2, str3, str4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzb;
        if (str != null) {
            jSONObject2.put("verificationCode", str);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zza);
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("mfaEnrollmentId", str3);
        }
        return jSONObject.toString();
    }
}
