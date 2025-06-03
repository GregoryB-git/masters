package A2;

import A2.InterfaceC0323i;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import x2.C2188b;

/* loaded from: classes.dex */
public final class I extends B2.a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* renamed from: o, reason: collision with root package name */
    public final int f380o;

    /* renamed from: p, reason: collision with root package name */
    public final IBinder f381p;

    /* renamed from: q, reason: collision with root package name */
    public final C2188b f382q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f383r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f384s;

    public I(int i7, IBinder iBinder, C2188b c2188b, boolean z7, boolean z8) {
        this.f380o = i7;
        this.f381p = iBinder;
        this.f382q = c2188b;
        this.f383r = z7;
        this.f384s = z8;
    }

    public final C2188b a() {
        return this.f382q;
    }

    public final InterfaceC0323i d() {
        IBinder iBinder = this.f381p;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC0323i.a.o(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i7 = (I) obj;
        return this.f382q.equals(i7.f382q) && AbstractC0327m.a(d(), i7.d());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.f380o);
        B2.c.h(parcel, 2, this.f381p, false);
        B2.c.m(parcel, 3, this.f382q, i7, false);
        B2.c.c(parcel, 4, this.f383r);
        B2.c.c(parcel, 5, this.f384s);
        B2.c.b(parcel, a7);
    }
}
