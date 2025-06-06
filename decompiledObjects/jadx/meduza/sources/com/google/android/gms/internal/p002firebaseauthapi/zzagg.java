package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagg implements zzaga {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzagg(String str, String str2, String str3, String str4, String str5) {
        j.e(str);
        this.zza = str;
        j.e(str2);
        this.zzb = str2;
        j.e(str3);
        this.zzc = str3;
        j.e(str4);
        this.zzd = str4;
        this.zze = str5;
    }

    public static zzagg zza(String str, String str2, String str3, String str4, String str5) {
        return new zzagg(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaga
    public final /* synthetic */ zzaga zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("displayName", this.zzb);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject2.put("sessionInfo", this.zzc);
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject2.put("verificationCode", this.zzd);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(this.zze)) {
            jSONObject.put("tenantId", this.zze);
        }
        return jSONObject.toString();
    }
}
