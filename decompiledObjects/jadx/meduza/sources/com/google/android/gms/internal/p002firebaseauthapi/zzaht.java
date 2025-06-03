package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaht implements zzahp {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzafn zzg;
    private final String zzh;

    private zzaht(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        j.e(str);
        this.zza = str;
        j.e(str2);
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
        this.zze = str6;
        this.zzf = str7;
        this.zzh = null;
    }

    public static zzaht zza(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        j.e(str2);
        return new zzaht(str, Constants.SIGN_IN_METHOD_PHONE, str2, str3, str4, str5, str6, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.zza);
        jSONObject.put("mfaProvider", 1);
        if (this.zzb != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zzb);
            if (!TextUtils.isEmpty(this.zzd)) {
                jSONObject2.put("recaptchaToken", this.zzd);
            }
            if (!TextUtils.isEmpty(this.zze)) {
                jSONObject2.put("playIntegrityToken", this.zze);
            }
            zzafn zzafnVar = this.zzg;
            if (zzafnVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzafnVar.zza());
            }
            String str = this.zzf;
            if (str != null) {
                zzail.zza(jSONObject2, "captchaResponse", str);
            } else {
                zzail.zza(jSONObject2);
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }

    public final void zza(zzafn zzafnVar) {
        this.zzg = zzafnVar;
    }

    public final String zzb() {
        return this.zzc;
    }
}
