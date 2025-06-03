package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

/* loaded from: classes.dex */
public class zzahl implements zzaea<zzahl> {
    private static final String zza = "zzahl";
    private String zzb;
    private zzahb zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahl zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = g.a(jSONObject.optString(Constants.EMAIL, null));
            g.a(jSONObject.optString("passwordHash", null));
            jSONObject.optBoolean("emailVerified", false);
            g.a(jSONObject.optString("displayName", null));
            g.a(jSONObject.optString("photoUrl", null));
            this.zzc = zzahb.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = g.a(jSONObject.optString(Constants.ID_TOKEN, null));
            this.zze = g.a(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzail.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzahc> zze() {
        zzahb zzahbVar = this.zzc;
        if (zzahbVar != null) {
            return zzahbVar.zza();
        }
        return null;
    }
}
