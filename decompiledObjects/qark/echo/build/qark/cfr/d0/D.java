/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package d0;

import W2.k;
import d0.B;
import d0.C;
import d0.I;
import d0.K;
import d0.L;
import d0.P;
import d0.l;
import d0.p;
import d0.u;
import d0.w;
import d0.x;
import g0.M;
import java.util.List;

public interface D {
    public void A(d0.b var1, boolean var2);

    public boolean B();

    public int C();

    public int D();

    public int E();

    public void F(K var1);

    public boolean G();

    public int H();

    public boolean I();

    public int J();

    public long K();

    public I L();

    public int M();

    public boolean N();

    public K O();

    public long P();

    public boolean Q();

    public int f();

    public void g();

    public C h();

    public void i(int var1);

    public void k(C var1);

    public void l(float var1);

    public B m();

    public void n(boolean var1);

    public boolean o();

    public long p();

    public int q();

    public long r();

    public void s(int var1, long var2);

    public void stop();

    public long t();

    public boolean u();

    public void v(d var1);

    public boolean w();

    public void x(boolean var1);

    public void y();

    public L z();

    public static final class b {
        public static final b b = new a().e();
        public static final String c = M.w0(0);
        public final p a;

        public b(p p8) {
            this.a = p8;
        }

        public /* synthetic */ b(p p8,  a8) {
            this(p8);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            return this.a.equals(object.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public static final class a {
            public static final int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
            public final p.b a = new p.b();

            public a a(int n8) {
                this.a.a(n8);
                return this;
            }

            public a b(b b8) {
                this.a.b(b8.a);
                return this;
            }

            public /* varargs */ a c(int ... arrn) {
                this.a.c(arrn);
                return this;
            }

            public a d(int n8, boolean bl) {
                this.a.d(n8, bl);
                return this;
            }

            public b e() {
                return new b(this.a.e(), null);
            }
        }

    }

    public static final class c {
        public final p a;

        public c(p p8) {
            this.a = p8;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            return this.a.equals(object.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static interface d {
        public void B(int var1);

        public void C(boolean var1, int var2);

        public void D(K var1);

        public void E(B var1);

        public void F(d0.b var1);

        public void G(boolean var1);

        public void H(int var1);

        public void I(w var1);

        public void J(L var1);

        public void O(u var1, int var2);

        public void P(I var1, int var2);

        public void Q(boolean var1);

        public void R();

        public void U(float var1);

        public void V(l var1);

        public void X(int var1);

        public void Y(boolean var1, int var2);

        public void b(P var1);

        public void c(boolean var1);

        public void e0(B var1);

        public void h0(boolean var1);

        public void i0(int var1, int var2);

        public void j(C var1);

        public void j0(b var1);

        public void k(List var1);

        public void k0(e var1, e var2, int var3);

        public void m(int var1);

        public void n0(D var1, c var2);

        public void q0(int var1, boolean var2);

        public void r(f0.b var1);

        public void r0(boolean var1);

        public void x(x var1);
    }

    public static final class e {
        public static final String k = M.w0(0);
        public static final String l = M.w0(1);
        public static final String m = M.w0(2);
        public static final String n = M.w0(3);
        public static final String o = M.w0(4);
        public static final String p = M.w0(5);
        public static final String q = M.w0(6);
        public final Object a;
        public final int b;
        public final int c;
        public final u d;
        public final Object e;
        public final int f;
        public final long g;
        public final long h;
        public final int i;
        public final int j;

        public e(Object object, int n8, u u8, Object object2, int n9, long l8, long l9, int n10, int n11) {
            this.a = object;
            this.b = n8;
            this.c = n8;
            this.d = u8;
            this.e = object2;
            this.f = n9;
            this.g = l8;
            this.h = l9;
            this.i = n10;
            this.j = n11;
        }

        public boolean a(e e8) {
            if (this.c == e8.c && this.f == e8.f && this.g == e8.g && this.h == e8.h && this.i == e8.i && this.j == e8.j && k.a(this.d, e8.d)) {
                return true;
            }
            return false;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (e.class != object.getClass()) {
                    return false;
                }
                if (this.a((e)(object = (e)object)) && k.a(this.a, object.a) && k.a(this.e, object.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return k.b(this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }

}

