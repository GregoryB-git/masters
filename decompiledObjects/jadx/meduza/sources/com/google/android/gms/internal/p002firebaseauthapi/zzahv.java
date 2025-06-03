package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahv implements zzahp {
    private final String zza;
    private final String zzb;

    private zzahv(String str, String str2) {
        j.e(str);
        this.zza = str;
        this.zzb = str2;
    }

    public static zzahv zza(String str, String str2) {
        return new zzahv(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("tenantId", this.zzb);
        }
        jSONObject.put("totpEnrollmentInfo", new JSONObject());
        return jSONObject.toString();
    }
}
