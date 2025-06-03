package s0;

import s0.y;

/* loaded from: classes.dex */
public abstract class h1<T, B> {
    public abstract void a(B b10, int i10, int i11);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(int i10, Object obj, Object obj2);

    public abstract void d(B b10, int i10, g gVar);

    public abstract void e(B b10, int i10, long j10);

    public abstract i1 f(Object obj);

    public abstract i1 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract i1 k(Object obj, Object obj2);

    public final boolean l(B b10, b1 b1Var) {
        int p10 = b1Var.p();
        int i10 = p10 >>> 3;
        int i11 = p10 & 7;
        if (i11 == 0) {
            e(b10, i10, b1Var.L());
            return true;
        }
        if (i11 == 1) {
            b(b10, i10, b1Var.d());
            return true;
        }
        if (i11 == 2) {
            d(b10, i10, b1Var.E());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 == 5) {
                a(b10, i10, b1Var.j());
                return true;
            }
            int i12 = y.f14121a;
            throw new y.a();
        }
        i1 m10 = m();
        int i13 = 4 | (i10 << 3);
        while (b1Var.A() != Integer.MAX_VALUE && l(m10, b1Var)) {
        }
        if (i13 != b1Var.p()) {
            throw new y("Protocol message end-group tag did not match expected tag.");
        }
        c(i10, b10, q(m10));
        return true;
    }

    public abstract i1 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t);

    public abstract void p();

    public abstract i1 q(Object obj);

    public abstract void r(Object obj, k kVar);

    public abstract void s(Object obj, k kVar);
}
