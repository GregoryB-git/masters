package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i1 implements b8.e {
    public static final Parcelable.Creator<i1> CREATOR = new h1();

    /* renamed from: a, reason: collision with root package name */
    public final String f2464a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2465b;

    /* renamed from: c, reason: collision with root package name */
    public r.b f2466c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2467d;

    public i1(String str, String str2, boolean z10) {
        m6.j.e(str);
        m6.j.e(str2);
        this.f2464a = str;
        this.f2465b = str2;
        this.f2466c = c0.d(str2);
        this.f2467d = z10;
    }

    public i1(boolean z10) {
        this.f2467d = z10;
        this.f2465b = null;
        this.f2464a = null;
        this.f2466c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2464a, false);
        b.z.F(parcel, 2, this.f2465b, false);
        b.z.t(parcel, 3, this.f2467d);
        b.z.L(J, parcel);
    }
}
