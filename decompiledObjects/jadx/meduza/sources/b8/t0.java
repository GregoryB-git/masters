package b8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.internal.p002firebaseauthapi.zzam;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t0 extends n6.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0();

    /* renamed from: a, reason: collision with root package name */
    public final String f2140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2141b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2142c;

    public t0(String str, String str2, String str3) {
        this.f2140a = str;
        this.f2141b = str2;
        this.f2142c = str3;
    }

    public static final t0 D(JSONObject jSONObject) {
        return new t0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static zzaj<t0> E(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaj.zza(new ArrayList());
        }
        zzam zzg = zzaj.zzg();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzg.zza(new t0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2140a, false);
        b.z.F(parcel, 2, this.f2141b, false);
        b.z.F(parcel, 3, this.f2142c, false);
        b.z.L(J, parcel);
    }
}
