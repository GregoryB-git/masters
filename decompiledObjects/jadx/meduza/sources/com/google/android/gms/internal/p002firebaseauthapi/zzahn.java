package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahn implements zzaeb {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;

    public zzahn(String str) {
        this.zzc = str;
    }

    public zzahn(String str, String str2, String str3, String str4, String str5, String str6) {
        j.e(str);
        this.zza = str;
        j.e(str2);
        this.zzb = str2;
        this.zzc = str4;
        this.zzd = str5;
        this.zze = str6;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        if (str != null) {
            jSONObject.put(Constants.EMAIL, str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            zzail.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzail.zza(jSONObject);
        }
        String str5 = this.zze;
        if (str5 != null) {
            jSONObject.put(Constants.ID_TOKEN, str5);
        }
        return jSONObject.toString();
    }
}
