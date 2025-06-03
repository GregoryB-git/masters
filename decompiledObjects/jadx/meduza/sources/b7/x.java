package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends j {
    public static final Parcelable.Creator<x> CREATOR = new w0();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2019a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f2020b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2021c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2022d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f2023e;
    public final d0 f;

    /* renamed from: o, reason: collision with root package name */
    public final g1 f2024o;

    /* renamed from: p, reason: collision with root package name */
    public final d f2025p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f2026q;

    public x(byte[] bArr, Double d10, String str, ArrayList arrayList, Integer num, d0 d0Var, String str2, d dVar, Long l10) {
        m6.j.i(bArr);
        this.f2019a = bArr;
        this.f2020b = d10;
        m6.j.i(str);
        this.f2021c = str;
        this.f2022d = arrayList;
        this.f2023e = num;
        this.f = d0Var;
        this.f2026q = l10;
        if (str2 != null) {
            try {
                this.f2024o = g1.f(str2);
            } catch (f1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f2024o = null;
        }
        this.f2025p = dVar;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Arrays.equals(this.f2019a, xVar.f2019a) && m6.h.a(this.f2020b, xVar.f2020b) && m6.h.a(this.f2021c, xVar.f2021c) && (((list = this.f2022d) == null && xVar.f2022d == null) || (list != null && (list2 = xVar.f2022d) != null && list.containsAll(list2) && xVar.f2022d.containsAll(this.f2022d))) && m6.h.a(this.f2023e, xVar.f2023e) && m6.h.a(this.f, xVar.f) && m6.h.a(this.f2024o, xVar.f2024o) && m6.h.a(this.f2025p, xVar.f2025p) && m6.h.a(this.f2026q, xVar.f2026q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f2019a)), this.f2020b, this.f2021c, this.f2022d, this.f2023e, this.f, this.f2024o, this.f2025p, this.f2026q});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.w(parcel, 2, this.f2019a, false);
        b.z.x(parcel, 3, this.f2020b);
        b.z.F(parcel, 4, this.f2021c, false);
        b.z.I(parcel, 5, this.f2022d, false);
        b.z.B(parcel, 6, this.f2023e);
        b.z.E(parcel, 7, this.f, i10, false);
        g1 g1Var = this.f2024o;
        b.z.F(parcel, 8, g1Var == null ? null : g1Var.f1963a, false);
        b.z.E(parcel, 9, this.f2025p, i10, false);
        b.z.D(parcel, 10, this.f2026q);
        b.z.L(J, parcel);
    }
}
