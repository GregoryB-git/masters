package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends n6.a {
    public static final Parcelable.Creator<d> CREATOR = new l1();

    /* renamed from: a, reason: collision with root package name */
    public final r f1934a;

    /* renamed from: b, reason: collision with root package name */
    public final a2 f1935b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f1936c;

    /* renamed from: d, reason: collision with root package name */
    public final g2 f1937d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f1938e;
    public final l0 f;

    /* renamed from: o, reason: collision with root package name */
    public final c2 f1939o;

    /* renamed from: p, reason: collision with root package name */
    public final o0 f1940p;

    /* renamed from: q, reason: collision with root package name */
    public final s f1941q;

    /* renamed from: r, reason: collision with root package name */
    public final q0 f1942r;

    public d(r rVar, a2 a2Var, e0 e0Var, g2 g2Var, j0 j0Var, l0 l0Var, c2 c2Var, o0 o0Var, s sVar, q0 q0Var) {
        this.f1934a = rVar;
        this.f1936c = e0Var;
        this.f1935b = a2Var;
        this.f1937d = g2Var;
        this.f1938e = j0Var;
        this.f = l0Var;
        this.f1939o = c2Var;
        this.f1940p = o0Var;
        this.f1941q = sVar;
        this.f1942r = q0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m6.h.a(this.f1934a, dVar.f1934a) && m6.h.a(this.f1935b, dVar.f1935b) && m6.h.a(this.f1936c, dVar.f1936c) && m6.h.a(this.f1937d, dVar.f1937d) && m6.h.a(this.f1938e, dVar.f1938e) && m6.h.a(this.f, dVar.f) && m6.h.a(this.f1939o, dVar.f1939o) && m6.h.a(this.f1940p, dVar.f1940p) && m6.h.a(this.f1941q, dVar.f1941q) && m6.h.a(this.f1942r, dVar.f1942r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1934a, this.f1935b, this.f1936c, this.f1937d, this.f1938e, this.f, this.f1939o, this.f1940p, this.f1941q, this.f1942r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 2, this.f1934a, i10, false);
        b.z.E(parcel, 3, this.f1935b, i10, false);
        b.z.E(parcel, 4, this.f1936c, i10, false);
        b.z.E(parcel, 5, this.f1937d, i10, false);
        b.z.E(parcel, 6, this.f1938e, i10, false);
        b.z.E(parcel, 7, this.f, i10, false);
        b.z.E(parcel, 8, this.f1939o, i10, false);
        b.z.E(parcel, 9, this.f1940p, i10, false);
        b.z.E(parcel, 10, this.f1941q, i10, false);
        b.z.E(parcel, 11, this.f1942r, i10, false);
        b.z.L(J, parcel);
    }
}
