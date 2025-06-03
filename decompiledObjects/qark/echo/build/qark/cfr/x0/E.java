/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.io.IOException
 *  java.lang.Object
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package x0;

import android.os.Handler;
import d0.q;
import g0.M;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import x0.A;
import x0.B;
import x0.C;
import x0.D;
import x0.r;
import x0.u;
import x0.x;
import x0.y;
import x0.z;

public interface E {
    public void K(int var1, x.b var2, r var3, u var4);

    public void W(int var1, x.b var2, u var3);

    public void Z(int var1, x.b var2, u var3);

    public void a0(int var1, x.b var2, r var3, u var4, IOException var5, boolean var6);

    public void m0(int var1, x.b var2, r var3, u var4);

    public void p0(int var1, x.b var2, r var3, u var4);

    public static class x0.E$a {
        public final int a;
        public final x.b b;
        public final CopyOnWriteArrayList c;

        public x0.E$a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public x0.E$a(CopyOnWriteArrayList copyOnWriteArrayList, int n8, x.b b8) {
            this.c = copyOnWriteArrayList;
            this.a = n8;
            this.b = b8;
        }

        public static /* synthetic */ void a(x0.E$a a8, E e8, r r8, u u8) {
            a8.k(e8, r8, u8);
        }

        public static /* synthetic */ void b(x0.E$a a8, E e8, x.b b8, u u8) {
            a8.o(e8, b8, u8);
        }

        public static /* synthetic */ void c(x0.E$a a8, E e8, r r8, u u8) {
            a8.n(e8, r8, u8);
        }

        public static /* synthetic */ void d(x0.E$a a8, E e8, r r8, u u8) {
            a8.l(e8, r8, u8);
        }

        public static /* synthetic */ void e(x0.E$a a8, E e8, u u8) {
            a8.j(e8, u8);
        }

        public static /* synthetic */ void f(x0.E$a a8, E e8, r r8, u u8, IOException iOException, boolean bl) {
            a8.m(e8, r8, u8, iOException, bl);
        }

        public void A(r r8, u u8) {
            for (a a8 : this.c) {
                E e8 = a8.b;
                M.S0(a8.a, new y(this, e8, r8, u8));
            }
        }

        public void B(E e8) {
            for (a a8 : this.c) {
                if (a8.b != e8) continue;
                this.c.remove((Object)a8);
            }
        }

        public void C(int n8, long l8, long l9) {
            this.D(new u(1, n8, null, 3, null, M.i1(l8), M.i1(l9)));
        }

        public void D(u u8) {
            x.b b8 = (x.b)g0.a.e(this.b);
            for (a a8 : this.c) {
                E e8 = a8.b;
                M.S0(a8.a, new A(this, e8, b8, u8));
            }
        }

        public x0.E$a E(int n8, x.b b8) {
            return new x0.E$a(this.c, n8, b8);
        }

        public void g(Handler handler, E e8) {
            g0.a.e((Object)handler);
            g0.a.e(e8);
            this.c.add((Object)new a(handler, e8));
        }

        public void h(int n8, q q8, int n9, Object object, long l8) {
            this.i(new u(1, n8, q8, n9, object, M.i1(l8), -9223372036854775807L));
        }

        public void i(u u8) {
            for (a a8 : this.c) {
                E e8 = a8.b;
                M.S0(a8.a, new z(this, e8, u8));
            }
        }

        public final /* synthetic */ void j(E e8, u u8) {
            e8.W(this.a, this.b, u8);
        }

        public final /* synthetic */ void k(E e8, r r8, u u8) {
            e8.p0(this.a, this.b, r8, u8);
        }

        public final /* synthetic */ void l(E e8, r r8, u u8) {
            e8.m0(this.a, this.b, r8, u8);
        }

        public final /* synthetic */ void m(E e8, r r8, u u8, IOException iOException, boolean bl) {
            e8.a0(this.a, this.b, r8, u8, iOException, bl);
        }

        public final /* synthetic */ void n(E e8, r r8, u u8) {
            e8.K(this.a, this.b, r8, u8);
        }

        public final /* synthetic */ void o(E e8, x.b b8, u u8) {
            e8.Z(this.a, b8, u8);
        }

        public void p(r r8, int n8) {
            this.q(r8, n8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void q(r r8, int n8, int n9, q q8, int n10, Object object, long l8, long l9) {
            this.r(r8, new u(n8, n9, q8, n10, object, M.i1(l8), M.i1(l9)));
        }

        public void r(r r8, u u8) {
            for (a a8 : this.c) {
                E e8 = a8.b;
                M.S0(a8.a, new D(this, e8, r8, u8));
            }
        }

        public void s(r r8, int n8) {
            this.t(r8, n8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void t(r r8, int n8, int n9, q q8, int n10, Object object, long l8, long l9) {
            this.u(r8, new u(n8, n9, q8, n10, object, M.i1(l8), M.i1(l9)));
        }

        public void u(r r8, u u8) {
            for (a a8 : this.c) {
                E e8 = a8.b;
                M.S0(a8.a, new B(this, e8, r8, u8));
            }
        }

        public void v(r r8, int n8, int n9, q q8, int n10, Object object, long l8, long l9, IOException iOException, boolean bl) {
            this.x(r8, new u(n8, n9, q8, n10, object, M.i1(l8), M.i1(l9)), iOException, bl);
        }

        public void w(r r8, int n8, IOException iOException, boolean bl) {
            this.v(r8, n8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, bl);
        }

        public void x(r r8, u u8, IOException iOException, boolean bl) {
            for (a a8 : this.c) {
                E e8 = a8.b;
                M.S0(a8.a, new C(this, e8, r8, u8, iOException, bl));
            }
        }

        public void y(r r8, int n8) {
            this.z(r8, n8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void z(r r8, int n8, int n9, q q8, int n10, Object object, long l8, long l9) {
            this.A(r8, new u(n8, n9, q8, n10, object, M.i1(l8), M.i1(l9)));
        }

        public static final class a {
            public Handler a;
            public E b;

            public a(Handler handler, E e8) {
                this.a = handler;
                this.b = e8;
            }
        }

    }

}

