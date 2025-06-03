package ma;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r1 extends p1<q1, q1> {
    @Override // ma.p1
    public final void a(q1 q1Var, int i10, int i11) {
        q1Var.c((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // ma.p1
    public final void b(q1 q1Var, int i10, long j10) {
        q1Var.c((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // ma.p1
    public final void c(int i10, Object obj, Object obj2) {
        ((q1) obj).c((i10 << 3) | 3, (q1) obj2);
    }

    @Override // ma.p1
    public final void d(q1 q1Var, int i10, h hVar) {
        q1Var.c((i10 << 3) | 2, hVar);
    }

    @Override // ma.p1
    public final void e(q1 q1Var, int i10, long j10) {
        q1Var.c((i10 << 3) | 0, Long.valueOf(j10));
    }

    @Override // ma.p1
    public final q1 f(Object obj) {
        w wVar = (w) obj;
        q1 q1Var = wVar.unknownFields;
        if (q1Var != q1.f) {
            return q1Var;
        }
        q1 q1Var2 = new q1();
        wVar.unknownFields = q1Var2;
        return q1Var2;
    }

    @Override // ma.p1
    public final q1 g(Object obj) {
        return ((w) obj).unknownFields;
    }

    @Override // ma.p1
    public final int h(q1 q1Var) {
        return q1Var.b();
    }

    @Override // ma.p1
    public final int i(q1 q1Var) {
        q1 q1Var2 = q1Var;
        int i10 = q1Var2.f11068d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < q1Var2.f11065a; i12++) {
            int i13 = q1Var2.f11066b[i12] >>> 3;
            i11 += k.w(3, (h) q1Var2.f11067c[i12]) + k.O(2, i13) + (k.N(1) * 2);
        }
        q1Var2.f11068d = i11;
        return i11;
    }

    @Override // ma.p1
    public final void j(Object obj) {
        q1 q1Var = ((w) obj).unknownFields;
        if (q1Var.f11069e) {
            q1Var.f11069e = false;
        }
    }

    @Override // ma.p1
    public final q1 k(Object obj, Object obj2) {
        q1 q1Var = (q1) obj;
        q1 q1Var2 = (q1) obj2;
        q1 q1Var3 = q1.f;
        if (q1Var3.equals(q1Var2)) {
            return q1Var;
        }
        if (q1Var3.equals(q1Var)) {
            int i10 = q1Var.f11065a + q1Var2.f11065a;
            int[] copyOf = Arrays.copyOf(q1Var.f11066b, i10);
            System.arraycopy(q1Var2.f11066b, 0, copyOf, q1Var.f11065a, q1Var2.f11065a);
            Object[] copyOf2 = Arrays.copyOf(q1Var.f11067c, i10);
            System.arraycopy(q1Var2.f11067c, 0, copyOf2, q1Var.f11065a, q1Var2.f11065a);
            return new q1(i10, copyOf, copyOf2, true);
        }
        q1Var.getClass();
        if (q1Var2.equals(q1Var3)) {
            return q1Var;
        }
        if (!q1Var.f11069e) {
            throw new UnsupportedOperationException();
        }
        int i11 = q1Var.f11065a + q1Var2.f11065a;
        q1Var.a(i11);
        System.arraycopy(q1Var2.f11066b, 0, q1Var.f11066b, q1Var.f11065a, q1Var2.f11065a);
        System.arraycopy(q1Var2.f11067c, 0, q1Var.f11067c, q1Var.f11065a, q1Var2.f11065a);
        q1Var.f11065a = i11;
        return q1Var;
    }

    @Override // ma.p1
    public final q1 m() {
        return new q1();
    }

    @Override // ma.p1
    public final void n(Object obj, q1 q1Var) {
        ((w) obj).unknownFields = q1Var;
    }

    @Override // ma.p1
    public final void o(Object obj, q1 q1Var) {
        ((w) obj).unknownFields = q1Var;
    }

    @Override // ma.p1
    public final void p() {
    }

    @Override // ma.p1
    public final q1 q(Object obj) {
        q1 q1Var = (q1) obj;
        if (q1Var.f11069e) {
            q1Var.f11069e = false;
        }
        return q1Var;
    }

    @Override // ma.p1
    public final void r(Object obj, l lVar) {
        q1 q1Var = (q1) obj;
        q1Var.getClass();
        lVar.getClass();
        for (int i10 = 0; i10 < q1Var.f11065a; i10++) {
            lVar.l(q1Var.f11066b[i10] >>> 3, q1Var.f11067c[i10]);
        }
    }

    @Override // ma.p1
    public final void s(Object obj, l lVar) {
        ((q1) obj).d(lVar);
    }
}
