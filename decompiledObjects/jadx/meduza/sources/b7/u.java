package b7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends j {
    public static final Parcelable.Creator<u> CREATOR = new s0();

    /* renamed from: a, reason: collision with root package name */
    public final y f2004a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f2005b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2006c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2007d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f2008e;
    public final List f;

    /* renamed from: o, reason: collision with root package name */
    public final k f2009o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f2010p;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f2011q;

    /* renamed from: r, reason: collision with root package name */
    public final c f2012r;

    /* renamed from: s, reason: collision with root package name */
    public final d f2013s;

    public u(y yVar, a0 a0Var, byte[] bArr, ArrayList arrayList, Double d10, ArrayList arrayList2, k kVar, Integer num, d0 d0Var, String str, d dVar) {
        m6.j.i(yVar);
        this.f2004a = yVar;
        m6.j.i(a0Var);
        this.f2005b = a0Var;
        m6.j.i(bArr);
        this.f2006c = bArr;
        m6.j.i(arrayList);
        this.f2007d = arrayList;
        this.f2008e = d10;
        this.f = arrayList2;
        this.f2009o = kVar;
        this.f2010p = num;
        this.f2011q = d0Var;
        if (str != null) {
            try {
                for (c cVar : c.values()) {
                    if (str.equals(cVar.f1929a)) {
                        this.f2012r = cVar;
                    }
                }
                throw new c.a(str);
            } catch (c.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f2012r = null;
        this.f2013s = dVar;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return m6.h.a(this.f2004a, uVar.f2004a) && m6.h.a(this.f2005b, uVar.f2005b) && Arrays.equals(this.f2006c, uVar.f2006c) && m6.h.a(this.f2008e, uVar.f2008e) && this.f2007d.containsAll(uVar.f2007d) && uVar.f2007d.containsAll(this.f2007d) && (((list = this.f) == null && uVar.f == null) || (list != null && (list2 = uVar.f) != null && list.containsAll(list2) && uVar.f.containsAll(this.f))) && m6.h.a(this.f2009o, uVar.f2009o) && m6.h.a(this.f2010p, uVar.f2010p) && m6.h.a(this.f2011q, uVar.f2011q) && m6.h.a(this.f2012r, uVar.f2012r) && m6.h.a(this.f2013s, uVar.f2013s);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2004a, this.f2005b, Integer.valueOf(Arrays.hashCode(this.f2006c)), this.f2007d, this.f2008e, this.f, this.f2009o, this.f2010p, this.f2011q, this.f2012r, this.f2013s});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 2, this.f2004a, i10, false);
        b.z.E(parcel, 3, this.f2005b, i10, false);
        b.z.w(parcel, 4, this.f2006c, false);
        b.z.I(parcel, 5, this.f2007d, false);
        b.z.x(parcel, 6, this.f2008e);
        b.z.I(parcel, 7, this.f, false);
        b.z.E(parcel, 8, this.f2009o, i10, false);
        b.z.B(parcel, 9, this.f2010p);
        b.z.E(parcel, 10, this.f2011q, i10, false);
        c cVar = this.f2012r;
        b.z.F(parcel, 11, cVar == null ? null : cVar.f1929a, false);
        b.z.E(parcel, 12, this.f2013s, i10, false);
        b.z.L(J, parcel);
    }
}
