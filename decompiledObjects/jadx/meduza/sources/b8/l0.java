package b8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l0 extends x {
    public static final Parcelable.Creator<l0> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    public final String f2107a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2108b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2109c;

    /* renamed from: d, reason: collision with root package name */
    public final zzaia f2110d;

    public l0(String str, String str2, long j10, zzaia zzaiaVar) {
        m6.j.e(str);
        this.f2107a = str;
        this.f2108b = str2;
        this.f2109c = j10;
        if (zzaiaVar == null) {
            throw new NullPointerException("totpInfo cannot be null.");
        }
        this.f2110d = zzaiaVar;
    }

    public static l0 G(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long optLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new l0(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzaia());
    }

    @Override // b8.x
    public final long D() {
        return this.f2109c;
    }

    @Override // b8.x
    public final String E() {
        return "totp";
    }

    @Override // b8.x
    public final JSONObject F() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f2107a);
            jSONObject.putOpt("displayName", this.f2108b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f2109c));
            jSONObject.putOpt("totpInfo", this.f2110d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzp(e10);
        }
    }

    @Override // b8.x
    public final String a() {
        return this.f2107a;
    }

    @Override // b8.x
    public final String o() {
        return this.f2108b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2107a, false);
        b.z.F(parcel, 2, this.f2108b, false);
        b.z.C(parcel, 3, this.f2109c);
        b.z.E(parcel, 4, this.f2110d, i10, false);
        b.z.L(J, parcel);
    }
}
