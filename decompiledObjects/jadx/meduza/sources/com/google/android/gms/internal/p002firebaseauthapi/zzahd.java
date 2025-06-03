package com.google.android.gms.internal.p002firebaseauthapi;

import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahd implements zzaeb {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzahd(String str, String str2, String str3) {
        j.e(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.zza);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }

    public final String zzb() {
        return this.zzb;
    }
}
