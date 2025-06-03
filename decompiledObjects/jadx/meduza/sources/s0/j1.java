package s0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j1 extends h1<i1, i1> {
    @Override // s0.h1
    public final void a(i1 i1Var, int i10, int i11) {
        i1Var.b((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // s0.h1
    public final void b(i1 i1Var, int i10, long j10) {
        i1Var.b((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // s0.h1
    public final void c(int i10, Object obj, Object obj2) {
        ((i1) obj).b((i10 << 3) | 3, (i1) obj2);
    }

    @Override // s0.h1
    public final void d(i1 i1Var, int i10, g gVar) {
        i1Var.b((i10 << 3) | 2, gVar);
    }

    @Override // s0.h1
    public final void e(i1 i1Var, int i10, long j10) {
        i1Var.b((i10 << 3) | 0, Long.valueOf(j10));
    }

    @Override // s0.h1
    public final i1 f(Object obj) {
        v vVar = (v) obj;
        i1 i1Var = vVar.unknownFields;
        if (i1Var != i1.f) {
            return i1Var;
        }
        i1 i1Var2 = new i1();
        vVar.unknownFields = i1Var2;
        return i1Var2;
    }

    @Override // s0.h1
    public final i1 g(Object obj) {
        return ((v) obj).unknownFields;
    }

    @Override // s0.h1
    public final int h(i1 i1Var) {
        return i1Var.a();
    }

    @Override // s0.h1
    public final int i(i1 i1Var) {
        i1 i1Var2 = i1Var;
        int i10 = i1Var2.f14022d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i1Var2.f14019a; i12++) {
            int i13 = i1Var2.f14020b[i12] >>> 3;
            i11 += j.w(3, (g) i1Var2.f14021c[i12]) + j.O(2, i13) + (j.N(1) * 2);
        }
        i1Var2.f14022d = i11;
        return i11;
    }

    @Override // s0.h1
    public final void j(Object obj) {
        ((v) obj).unknownFields.f14023e = false;
    }

    @Override // s0.h1
    public final i1 k(Object obj, Object obj2) {
        i1 i1Var = (i1) obj;
        i1 i1Var2 = (i1) obj2;
        if (i1Var2.equals(i1.f)) {
            return i1Var;
        }
        int i10 = i1Var.f14019a + i1Var2.f14019a;
        int[] copyOf = Arrays.copyOf(i1Var.f14020b, i10);
        System.arraycopy(i1Var2.f14020b, 0, copyOf, i1Var.f14019a, i1Var2.f14019a);
        Object[] copyOf2 = Arrays.copyOf(i1Var.f14021c, i10);
        System.arraycopy(i1Var2.f14021c, 0, copyOf2, i1Var.f14019a, i1Var2.f14019a);
        return new i1(i10, copyOf, copyOf2, true);
    }

    @Override // s0.h1
    public final i1 m() {
        return new i1();
    }

    @Override // s0.h1
    public final void n(Object obj, i1 i1Var) {
        ((v) obj).unknownFields = i1Var;
    }

    @Override // s0.h1
    public final void o(Object obj, i1 i1Var) {
        ((v) obj).unknownFields = i1Var;
    }

    @Override // s0.h1
    public final void p() {
    }

    @Override // s0.h1
    public final i1 q(Object obj) {
        i1 i1Var = (i1) obj;
        i1Var.f14023e = false;
        return i1Var;
    }

    @Override // s0.h1
    public final void r(Object obj, k kVar) {
        i1 i1Var = (i1) obj;
        i1Var.getClass();
        kVar.getClass();
        for (int i10 = 0; i10 < i1Var.f14019a; i10++) {
            kVar.l(i1Var.f14020b[i10] >>> 3, i1Var.f14021c[i10]);
        }
    }

    @Override // s0.h1
    public final void s(Object obj, k kVar) {
        ((i1) obj).c(kVar);
    }
}
