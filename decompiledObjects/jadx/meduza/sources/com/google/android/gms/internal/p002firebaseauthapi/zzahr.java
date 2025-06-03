package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahr implements zzaeb {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private zzafn zzi;

    private zzahr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        j.e(str);
        this.zza = str;
        j.e(str2);
        this.zzb = str2;
        j.e(str3);
        this.zzc = str3;
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
    }

    public static zzahr zza(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        j.e(str3);
        return new zzahr(Constants.SIGN_IN_METHOD_PHONE, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.getClass();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("playIntegrityToken", this.zzg);
            }
            String str = this.zzh;
            if (str != null) {
                zzail.zza(jSONObject2, "captchaResponse", str);
            } else {
                zzail.zza(jSONObject2);
            }
            zzafn zzafnVar = this.zzi;
            if (zzafnVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzafnVar.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final void zza(zzafn zzafnVar) {
        this.zzi = zzafnVar;
    }

    public final String zzb() {
        return this.zzd;
    }
}
