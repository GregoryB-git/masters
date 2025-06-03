package A2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: A2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0326l extends B2.a {

    @NonNull
    public static final Parcelable.Creator<C0326l> CREATOR = new F();

    /* renamed from: o, reason: collision with root package name */
    public final int f506o;

    /* renamed from: p, reason: collision with root package name */
    public final int f507p;

    /* renamed from: q, reason: collision with root package name */
    public final int f508q;

    /* renamed from: r, reason: collision with root package name */
    public final long f509r;

    /* renamed from: s, reason: collision with root package name */
    public final long f510s;

    /* renamed from: t, reason: collision with root package name */
    public final String f511t;

    /* renamed from: u, reason: collision with root package name */
    public final String f512u;

    /* renamed from: v, reason: collision with root package name */
    public final int f513v;

    /* renamed from: w, reason: collision with root package name */
    public final int f514w;

    public C0326l(int i7, int i8, int i9, long j7, long j8, String str, String str2, int i10, int i11) {
        this.f506o = i7;
        this.f507p = i8;
        this.f508q = i9;
        this.f509r = j7;
        this.f510s = j8;
        this.f511t = str;
        this.f512u = str2;
        this.f513v = i10;
        this.f514w = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.f506o);
        B2.c.i(parcel, 2, this.f507p);
        B2.c.i(parcel, 3, this.f508q);
        B2.c.k(parcel, 4, this.f509r);
        B2.c.k(parcel, 5, this.f510s);
        B2.c.n(parcel, 6, this.f511t, false);
        B2.c.n(parcel, 7, this.f512u, false);
        B2.c.i(parcel, 8, this.f513v);
        B2.c.i(parcel, 9, this.f514w);
        B2.c.b(parcel, a7);
    }
}
