package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzafx implements zzaea<zzafx> {
    private static final String zza = "zzafx";
    private String zzb;
    private String zzc;
    private boolean zzd;
    private long zze;
    private List<zzagz> zzf;
    private String zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafx zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", null);
            jSONObject.optString(Constants.EMAIL, null);
            this.zzb = jSONObject.optString(Constants.ID_TOKEN, null);
            this.zzc = jSONObject.optString("refreshToken", null);
            this.zzd = jSONObject.optBoolean("isNewUser", false);
            this.zze = jSONObject.optLong("expiresIn", 0L);
            this.zzf = zzagz.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzg = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzail.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzagz> zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzg);
    }

    public final boolean zzg() {
        return this.zzd;
    }
}
