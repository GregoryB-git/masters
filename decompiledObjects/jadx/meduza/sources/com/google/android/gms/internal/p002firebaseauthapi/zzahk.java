package com.google.android.gms.internal.p002firebaseauthapi;

import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahk implements zzaeb {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private zzafn zzj;

    public zzahk(String str, long j10, boolean z10, String str2, String str3, String str4, String str5, String str6, boolean z11) {
        j.e(str);
        this.zza = str;
        this.zzb = j10;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = z11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzafn zzafnVar = this.zzj;
        if (zzafnVar != null) {
            jSONObject.put("autoRetrievalInfo", zzafnVar.zza());
        }
        String str3 = this.zzg;
        if (str3 != null) {
            jSONObject.put("playIntegrityToken", str3);
        }
        String str4 = this.zzh;
        if (str4 != null) {
            zzail.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzail.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final void zza(zzafn zzafnVar) {
        this.zzj = zzafnVar;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
