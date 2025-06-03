package R2;

import A2.AbstractC0328n;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497e extends B2.a {
    public static final Parcelable.Creator<C0497e> CREATOR = new C0518h();

    /* renamed from: o, reason: collision with root package name */
    public String f5263o;

    /* renamed from: p, reason: collision with root package name */
    public String f5264p;

    /* renamed from: q, reason: collision with root package name */
    public R5 f5265q;

    /* renamed from: r, reason: collision with root package name */
    public long f5266r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5267s;

    /* renamed from: t, reason: collision with root package name */
    public String f5268t;

    /* renamed from: u, reason: collision with root package name */
    public I f5269u;

    /* renamed from: v, reason: collision with root package name */
    public long f5270v;

    /* renamed from: w, reason: collision with root package name */
    public I f5271w;

    /* renamed from: x, reason: collision with root package name */
    public long f5272x;

    /* renamed from: y, reason: collision with root package name */
    public I f5273y;

    public C0497e(C0497e c0497e) {
        AbstractC0328n.i(c0497e);
        this.f5263o = c0497e.f5263o;
        this.f5264p = c0497e.f5264p;
        this.f5265q = c0497e.f5265q;
        this.f5266r = c0497e.f5266r;
        this.f5267s = c0497e.f5267s;
        this.f5268t = c0497e.f5268t;
        this.f5269u = c0497e.f5269u;
        this.f5270v = c0497e.f5270v;
        this.f5271w = c0497e.f5271w;
        this.f5272x = c0497e.f5272x;
        this.f5273y = c0497e.f5273y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.n(parcel, 2, this.f5263o, false);
        B2.c.n(parcel, 3, this.f5264p, false);
        B2.c.m(parcel, 4, this.f5265q, i7, false);
        B2.c.k(parcel, 5, this.f5266r);
        B2.c.c(parcel, 6, this.f5267s);
        B2.c.n(parcel, 7, this.f5268t, false);
        B2.c.m(parcel, 8, this.f5269u, i7, false);
        B2.c.k(parcel, 9, this.f5270v);
        B2.c.m(parcel, 10, this.f5271w, i7, false);
        B2.c.k(parcel, 11, this.f5272x);
        B2.c.m(parcel, 12, this.f5273y, i7, false);
        B2.c.b(parcel, a7);
    }

    public C0497e(String str, String str2, R5 r52, long j7, boolean z7, String str3, I i7, long j8, I i8, long j9, I i9) {
        this.f5263o = str;
        this.f5264p = str2;
        this.f5265q = r52;
        this.f5266r = j7;
        this.f5267s = z7;
        this.f5268t = str3;
        this.f5269u = i7;
        this.f5270v = j8;
        this.f5271w = i8;
        this.f5272x = j9;
        this.f5273y = i9;
    }
}
