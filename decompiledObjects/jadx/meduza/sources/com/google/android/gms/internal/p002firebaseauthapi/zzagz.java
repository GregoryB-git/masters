package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import m6.j;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagz {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzaia zze;

    private zzagz(String str, String str2, String str3, long j10, zzaia zzaiaVar) {
        if (!TextUtils.isEmpty(str) && zzaiaVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        j.e(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
        this.zze = zzaiaVar;
    }

    private static long zza(String str) {
        try {
            return zzanp.zza(zzanp.zza(str));
        } catch (ParseException e10) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e10);
            return 0L;
        }
    }

    public static zzagz zza(JSONObject jSONObject) {
        zzagz zzagzVar = new zzagz(jSONObject.optString("phoneInfo", null), jSONObject.optString("mfaEnrollmentId", null), jSONObject.optString("displayName", null), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzaia() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzagzVar;
    }

    public static List<zzagz> zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(zza(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzaia zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }
}
