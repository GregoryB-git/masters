package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import b8.c1;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import m6.j;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

/* loaded from: classes.dex */
public class zzaie implements zzaea<zzaie> {
    private static final String zza = "zzaie";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private List<zzagz> zzp;
    private String zzq;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaie zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = g.a(jSONObject.optString(Constants.ID_TOKEN, null));
            this.zzd = g.a(jSONObject.optString("refreshToken", null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            g.a(jSONObject.optString("localId", null));
            this.zzf = g.a(jSONObject.optString(Constants.EMAIL, null));
            g.a(jSONObject.optString("displayName", null));
            g.a(jSONObject.optString("photoUrl", null));
            this.zzg = g.a(jSONObject.optString(Constants.PROVIDER_ID, null));
            this.zzh = g.a(jSONObject.optString("rawUserInfo", null));
            this.zzi = jSONObject.optBoolean("isNewUser", false);
            this.zzj = jSONObject.optString("oauthAccessToken", null);
            this.zzk = jSONObject.optString("oauthIdToken", null);
            this.zzm = g.a(jSONObject.optString("errorMessage", null));
            this.zzn = g.a(jSONObject.optString("pendingToken", null));
            this.zzo = g.a(jSONObject.optString("tenantId", null));
            this.zzp = zzagz.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzq = g.a(jSONObject.optString("mfaPendingCredential", null));
            this.zzl = g.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzail.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zze;
    }

    public final c1 zzb() {
        if (TextUtils.isEmpty(this.zzj) && TextUtils.isEmpty(this.zzk)) {
            return null;
        }
        String str = this.zzg;
        String str2 = this.zzk;
        String str3 = this.zzj;
        String str4 = this.zzn;
        String str5 = this.zzl;
        j.f("Must specify a non-empty providerId", str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new c1(str, str2, str3, null, str4, str5, null);
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzo;
    }

    public final List<zzagz> zzk() {
        return this.zzp;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzq);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzm);
    }
}
