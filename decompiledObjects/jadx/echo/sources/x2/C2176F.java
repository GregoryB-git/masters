package x2;

import H2.a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2176F extends B2.a {
    public static final Parcelable.Creator<C2176F> CREATOR = new C2177G();

    /* renamed from: o, reason: collision with root package name */
    public final String f21146o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f21147p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f21148q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f21149r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f21150s;

    public C2176F(String str, boolean z7, boolean z8, IBinder iBinder, boolean z9) {
        this.f21146o = str;
        this.f21147p = z7;
        this.f21148q = z8;
        this.f21149r = (Context) H2.b.v(a.AbstractBinderC0037a.o(iBinder));
        this.f21150s = z9;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [H2.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.n(parcel, 1, this.f21146o, false);
        B2.c.c(parcel, 2, this.f21147p);
        B2.c.c(parcel, 3, this.f21148q);
        B2.c.h(parcel, 4, H2.b.Z0(this.f21149r), false);
        B2.c.c(parcel, 5, this.f21150s);
        B2.c.b(parcel, a7);
    }
}
