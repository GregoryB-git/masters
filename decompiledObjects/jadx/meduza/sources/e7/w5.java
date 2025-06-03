package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w5 extends n6.a {
    public static final Parcelable.Creator<w5> CREATOR = new y5();

    /* renamed from: a, reason: collision with root package name */
    public final String f4740a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4742c;

    public w5(String str, long j10, int i10) {
        this.f4740a = str;
        this.f4741b = j10;
        this.f4742c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f4740a, false);
        b.z.C(parcel, 2, this.f4741b);
        b.z.z(parcel, 3, this.f4742c);
        b.z.L(J, parcel);
    }
}
