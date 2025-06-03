package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b.z;
import m6.j;
import n6.a;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

/* loaded from: classes.dex */
public class zzagw extends a implements zzaea<zzagw> {
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;
    private static final String zza = "zzagw";
    public static final Parcelable.Creator<zzagw> CREATOR = new zzagv();

    public zzagw() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public zzagw(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzagw(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public static zzagw zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzagw zzagwVar = new zzagw();
            zzagwVar.zzb = jSONObject.optString("refresh_token", null);
            zzagwVar.zzc = jSONObject.optString("access_token", null);
            zzagwVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzagwVar.zze = jSONObject.optString("token_type", null);
            zzagwVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzagwVar;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzzp(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagw zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = g.a(jSONObject.optString("refresh_token"));
            this.zzc = g.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = g.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzail.zza(e10, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.F(parcel, 2, this.zzb, false);
        z.F(parcel, 3, this.zzc, false);
        z.D(parcel, 4, Long.valueOf(zza()));
        z.F(parcel, 5, this.zze, false);
        z.D(parcel, 6, Long.valueOf(this.zzf.longValue()));
        z.L(J, parcel);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzc(String str) {
        j.e(str);
        this.zzb = str;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzzp(e10);
        }
    }

    public final boolean zzg() {
        return System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue();
    }
}
