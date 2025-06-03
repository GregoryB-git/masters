package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import defpackage.f;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagx {
    private Long zza;
    private Long zzb;

    public static zzagx zza(String str) {
        try {
            zzagx zzagxVar = new zzagx();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            zzagxVar.zza = Long.valueOf(jSONObject.optLong("iat"));
            zzagxVar.zzb = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzagxVar;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e10));
            }
            throw new UnsupportedEncodingException(f.j("Failed to read JwtToken from JSONObject. ", String.valueOf(e10)));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    public final Long zzb() {
        return this.zza;
    }
}
