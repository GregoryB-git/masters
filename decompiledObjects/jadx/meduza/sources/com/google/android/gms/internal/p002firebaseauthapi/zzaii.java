package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

/* loaded from: classes.dex */
public class zzaii implements zzaea<zzaii> {
    private static final String zza = "zzaii";
    private String zzb;
    private String zzc;
    private long zzd;
    private List<zzagz> zze;
    private String zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaii zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            g.a(jSONObject.optString("localId", null));
            g.a(jSONObject.optString(Constants.EMAIL, null));
            g.a(jSONObject.optString("displayName", null));
            this.zzb = g.a(jSONObject.optString(Constants.ID_TOKEN, null));
            g.a(jSONObject.optString("photoUrl", null));
            this.zzc = g.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = zzagz.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzail.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzagz> zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzf);
    }
}
