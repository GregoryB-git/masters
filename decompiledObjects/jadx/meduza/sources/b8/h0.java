package b8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 extends x {
    public static final Parcelable.Creator<h0> CREATOR = new w0();

    /* renamed from: a, reason: collision with root package name */
    public final String f2085a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2086b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2087c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2088d;

    public h0(long j10, String str, String str2, String str3) {
        m6.j.e(str);
        this.f2085a = str;
        this.f2086b = str2;
        this.f2087c = j10;
        m6.j.e(str3);
        this.f2088d = str3;
    }

    public static h0 G(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
        }
        return new h0(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"));
    }

    @Override // b8.x
    public final long D() {
        return this.f2087c;
    }

    @Override // b8.x
    public final String E() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // b8.x
    public final JSONObject F() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", Constants.SIGN_IN_METHOD_PHONE);
            jSONObject.putOpt("uid", this.f2085a);
            jSONObject.putOpt("displayName", this.f2086b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f2087c));
            jSONObject.putOpt("phoneNumber", this.f2088d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzp(e10);
        }
    }

    @Override // b8.x
    public final String a() {
        return this.f2085a;
    }

    @Override // b8.x
    public final String o() {
        return this.f2086b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2085a, false);
        b.z.F(parcel, 2, this.f2086b, false);
        b.z.C(parcel, 3, this.f2087c);
        b.z.F(parcel, 4, this.f2088d, false);
        b.z.L(J, parcel);
    }
}
