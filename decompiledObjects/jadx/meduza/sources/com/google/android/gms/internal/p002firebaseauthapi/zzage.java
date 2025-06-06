package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzage implements zzaga {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzage(String str, String str2, String str3, String str4, String str5, String str6) {
        j.e(str);
        j.e(str2);
        this.zza = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zzb = str5;
        this.zze = str6;
    }

    public static zzage zza(String str, String str2, String str3, String str4, String str5) {
        j.e(str3);
        j.e(str2);
        return new zzage(Constants.SIGN_IN_METHOD_PHONE, str, str2, str3, str4, str5);
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
        jSONObject.put("mfaProvider", 1);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("tenantId", str4);
        }
        return jSONObject.toString();
    }
}
