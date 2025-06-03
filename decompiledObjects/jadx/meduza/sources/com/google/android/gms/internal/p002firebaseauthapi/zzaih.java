package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaih implements zzaeb {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaih() {
    }

    public static zzaih zza(String str, String str2, boolean z10) {
        zzaih zzaihVar = new zzaih();
        j.e(str);
        zzaihVar.zzb = str;
        j.e(str2);
        zzaihVar.zzc = str2;
        zzaihVar.zzf = z10;
        return zzaihVar;
    }

    public static zzaih zzb(String str, String str2, boolean z10) {
        zzaih zzaihVar = new zzaih();
        j.e(str);
        zzaihVar.zza = str;
        j.e(str2);
        zzaihVar.zzd = str2;
        zzaihVar.zzf = z10;
        return zzaihVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("sessionInfo", this.zzb);
            str = this.zzc;
            str2 = "code";
        } else {
            jSONObject.put("phoneNumber", this.zza);
            str = this.zzd;
            str2 = "temporaryProof";
        }
        jSONObject.put(str2, str);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put(Constants.ID_TOKEN, str3);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
