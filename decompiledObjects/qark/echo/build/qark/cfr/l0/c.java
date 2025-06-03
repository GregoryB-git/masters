/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package l0;

import W2.k;
import android.util.SparseArray;
import d0.B;
import d0.C;
import d0.D;
import d0.I;
import d0.K;
import d0.L;
import d0.P;
import d0.l;
import d0.p;
import d0.q;
import d0.u;
import d0.w;
import java.io.IOException;
import java.util.List;
import k0.o;
import m0.z;
import x0.r;
import x0.x;

public interface c {
    public void A(a var1, Exception var2);

    public void B(a var1, o var2);

    public void C(a var1, B var2);

    public void D(a var1, String var2);

    public void E(a var1, int var2);

    public void F(a var1, u var2, int var3);

    public void G(a var1, boolean var2, int var3);

    public void H(a var1, boolean var2, int var3);

    public void I(a var1, String var2);

    public void J(a var1, r var2, x0.u var3);

    public void K(a var1, x0.u var2);

    public void L(a var1, B var2);

    public void M(a var1, D.b var2);

    public void N(a var1, x0.u var2);

    public void O(D var1, b var2);

    public void P(a var1);

    public void Q(a var1, String var2, long var3);

    public void R(a var1, l var2);

    public void S(a var1, int var2);

    public void T(a var1, P var2);

    public void V(a var1, f0.b var2);

    public void W(a var1, q var2, k0.p var3);

    public void X(a var1, int var2, long var3, long var5);

    public void Y(a var1);

    public void Z(a var1, int var2);

    public void a(a var1, int var2, long var3);

    public void a0(a var1);

    public void b(a var1);

    public void c(a var1, int var2, boolean var3);

    public void c0(a var1, long var2);

    public void d(a var1, boolean var2);

    public void d0(a var1, Exception var2);

    public void e(a var1, Exception var2);

    public void e0(a var1, L var2);

    public void f0(a var1, long var2, int var4);

    public void g(a var1, o var2);

    public void g0(a var1, z.a var2);

    public void h(a var1, int var2, int var3);

    public void h0(a var1, q var2, k0.p var3);

    public void i(a var1, r var2, x0.u var3);

    public void i0(a var1, boolean var2);

    public void j(a var1, boolean var2);

    public void j0(a var1, int var2, int var3, int var4, float var5);

    public void k(a var1, float var2);

    public void k0(a var1, D.e var2, D.e var3, int var4);

    public void l(a var1, o var2);

    public void l0(a var1, boolean var2);

    public void m(a var1, r var2, x0.u var3, IOException var4, boolean var5);

    public void m0(a var1, Exception var2);

    public void n(a var1);

    public void n0(a var1, int var2);

    public void o(a var1, d0.x var2);

    public void o0(a var1, o var2);

    public void p(a var1, d0.b var2);

    public void q(a var1, r var2, x0.u var3);

    public void q0(a var1, w var2);

    public void r(a var1, K var2);

    public void r0(a var1);

    public void s(a var1);

    public void s0(a var1, List var2);

    public void t(a var1, Object var2, long var3);

    public void t0(a var1, boolean var2);

    public void u(a var1, String var2, long var3);

    public void u0(a var1, int var2, long var3, long var5);

    public void v(a var1, String var2, long var3, long var5);

    public void v0(a var1, C var2);

    public void w(a var1, z.a var2);

    public void x(a var1, int var2);

    public void y(a var1, int var2);

    public void z(a var1, String var2, long var3, long var5);

    public static final class a {
        public final long a;
        public final I b;
        public final int c;
        public final x.b d;
        public final long e;
        public final I f;
        public final int g;
        public final x.b h;
        public final long i;
        public final long j;

        public a(long l8, I i8, int n8, x.b b8, long l9, I i9, int n9, x.b b9, long l10, long l11) {
            this.a = l8;
            this.b = i8;
            this.c = n8;
            this.d = b8;
            this.e = l9;
            this.f = i9;
            this.g = n9;
            this.h = b9;
            this.i = l10;
            this.j = l11;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (a.class != object.getClass()) {
                    return false;
                }
                object = (a)object;
                if (this.a == object.a && this.c == object.c && this.e == object.e && this.g == object.g && this.i == object.i && this.j == object.j && k.a(this.b, object.b) && k.a(this.d, object.d) && k.a(this.f, object.f) && k.a(this.h, object.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return k.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }

    public static final class b {
        public final p a;
        public final SparseArray b;

        public b(p p8, SparseArray sparseArray) {
            this.a = p8;
            SparseArray sparseArray2 = new SparseArray(p8.c());
            for (int i8 = 0; i8 < p8.c(); ++i8) {
                int n8 = p8.b(i8);
                sparseArray2.append(n8, (Object)((a)g0.a.e((a)sparseArray.get(n8))));
            }
            this.b = sparseArray2;
        }

        public boolean a(int n8) {
            return this.a.a(n8);
        }

        public int b(int n8) {
            return this.a.b(n8);
        }

        public a c(int n8) {
            return (a)g0.a.e((a)this.b.get(n8));
        }

        public int d() {
            return this.a.c();
        }
    }

}

