package R2;

import A2.AbstractC0328n;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class I extends B2.a {
    public static final Parcelable.Creator<I> CREATOR = new H();

    /* renamed from: o, reason: collision with root package name */
    public final String f4704o;

    /* renamed from: p, reason: collision with root package name */
    public final D f4705p;

    /* renamed from: q, reason: collision with root package name */
    public final String f4706q;

    /* renamed from: r, reason: collision with root package name */
    public final long f4707r;

    public I(I i7, long j7) {
        AbstractC0328n.i(i7);
        this.f4704o = i7.f4704o;
        this.f4705p = i7.f4705p;
        this.f4706q = i7.f4706q;
        this.f4707r = j7;
    }

    public final String toString() {
        return "origin=" + this.f4706q + ",name=" + this.f4704o + ",params=" + String.valueOf(this.f4705p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.n(parcel, 2, this.f4704o, false);
        B2.c.m(parcel, 3, this.f4705p, i7, false);
        B2.c.n(parcel, 4, this.f4706q, false);
        B2.c.k(parcel, 5, this.f4707r);
        B2.c.b(parcel, a7);
    }

    public I(String str, D d7, String str2, long j7) {
        this.f4704o = str;
        this.f4705p = d7;
        this.f4706q = str2;
        this.f4707r = j7;
    }
}
