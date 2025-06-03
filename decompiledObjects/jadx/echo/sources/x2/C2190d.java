package x2;

import A2.AbstractC0327m;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: x2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2190d extends B2.a {

    @NonNull
    public static final Parcelable.Creator<C2190d> CREATOR = new C2206t();

    /* renamed from: o, reason: collision with root package name */
    public final String f21175o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21176p;

    /* renamed from: q, reason: collision with root package name */
    public final long f21177q;

    public C2190d(String str, int i7, long j7) {
        this.f21175o = str;
        this.f21176p = i7;
        this.f21177q = j7;
    }

    public String a() {
        return this.f21175o;
    }

    public long d() {
        long j7 = this.f21177q;
        return j7 == -1 ? this.f21176p : j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2190d) {
            C2190d c2190d = (C2190d) obj;
            if (((a() != null && a().equals(c2190d.a())) || (a() == null && c2190d.a() == null)) && d() == c2190d.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0327m.b(a(), Long.valueOf(d()));
    }

    public final String toString() {
        AbstractC0327m.a c7 = AbstractC0327m.c(this);
        c7.a("name", a());
        c7.a("version", Long.valueOf(d()));
        return c7.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.n(parcel, 1, a(), false);
        B2.c.i(parcel, 2, this.f21176p);
        B2.c.k(parcel, 3, d());
        B2.c.b(parcel, a7);
    }

    public C2190d(String str, long j7) {
        this.f21175o = str;
        this.f21177q = j7;
        this.f21176p = -1;
    }
}
