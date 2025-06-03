package c8;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k implements n6.c {
    public static final Parcelable.Creator<k> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public long f2472a;

    /* renamed from: b, reason: collision with root package name */
    public long f2473b;

    public k(long j10, long j11) {
        this.f2472a = j10;
        this.f2473b = j11;
    }

    public static k a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new k(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.C(parcel, 1, this.f2472a);
        b.z.C(parcel, 2, this.f2473b);
        b.z.L(J, parcel);
    }
}
