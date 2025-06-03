package ma;

import ma.b0;

/* loaded from: classes.dex */
public abstract class p1<T, B> {
    public abstract void a(B b10, int i10, int i11);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(int i10, Object obj, Object obj2);

    public abstract void d(B b10, int i10, h hVar);

    public abstract void e(B b10, int i10, long j10);

    public abstract q1 f(Object obj);

    public abstract q1 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract q1 k(Object obj, Object obj2);

    public final boolean l(B b10, g1 g1Var) {
        j jVar = (j) g1Var;
        int i10 = jVar.f11010b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            jVar.w(0);
            e(b10, i11, jVar.f11009a.q());
            return true;
        }
        if (i12 == 1) {
            jVar.w(1);
            b(b10, i11, jVar.f11009a.n());
            return true;
        }
        if (i12 == 2) {
            d(b10, i11, jVar.e());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                int i13 = b0.f10916c;
                throw new b0.a();
            }
            jVar.w(5);
            a(b10, i11, jVar.f11009a.m());
            return true;
        }
        q1 m10 = m();
        int i14 = (i11 << 3) | 4;
        while (jVar.a() != Integer.MAX_VALUE && l(m10, jVar)) {
        }
        if (i14 != jVar.f11010b) {
            throw b0.a();
        }
        c(i11, b10, q(m10));
        return true;
    }

    public abstract q1 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t);

    public abstract void p();

    public abstract q1 q(Object obj);

    public abstract void r(Object obj, l lVar);

    public abstract void s(Object obj, l lVar);
}
