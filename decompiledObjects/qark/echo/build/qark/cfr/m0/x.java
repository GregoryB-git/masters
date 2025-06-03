/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package m0;

import android.os.Handler;
import g0.M;
import m0.l;
import m0.m;
import m0.n;
import m0.o;
import m0.p;
import m0.q;
import m0.r;
import m0.s;
import m0.t;
import m0.u;
import m0.v;
import m0.w;
import m0.z;

public interface x {
    public void A(k0.o var1);

    public void a(z.a var1);

    public void c(boolean var1);

    public void d(Exception var1);

    public void e(z.a var1);

    public void f(k0.o var1);

    public void l(long var1);

    public void p(Exception var1);

    public void s(String var1);

    public void t(String var1, long var2, long var4);

    public void v(int var1, long var2, long var4);

    public void z(d0.q var1, k0.p var2);

    public static final class a {
        public final Handler a;
        public final x b;

        public a(Handler handler, x x8) {
            handler = x8 != null ? (Handler)g0.a.e((Object)handler) : null;
            this.a = handler;
            this.b = x8;
        }

        public static /* synthetic */ void a(a a8, boolean bl) {
            a8.F(bl);
        }

        public static /* synthetic */ void b(a a8, int n8, long l8, long l9) {
            a8.G(n8, l8, l9);
        }

        public static /* synthetic */ void c(a a8, k0.o o8) {
            a8.C(o8);
        }

        public static /* synthetic */ void d(a a8, k0.o o8) {
            a8.B(o8);
        }

        public static /* synthetic */ void e(a a8, long l8) {
            a8.E(l8);
        }

        public static /* synthetic */ void f(a a8, z.a a9) {
            a8.y(a9);
        }

        public static /* synthetic */ void g(a a8, Exception exception) {
            a8.v(exception);
        }

        public static /* synthetic */ void h(a a8, d0.q q8, k0.p p8) {
            a8.D(q8, p8);
        }

        public static /* synthetic */ void i(a a8, z.a a9) {
            a8.x(a9);
        }

        public static /* synthetic */ void j(a a8, Exception exception) {
            a8.w(exception);
        }

        public static /* synthetic */ void k(a a8, String string2, long l8, long l9) {
            a8.z(string2, l8, l9);
        }

        public static /* synthetic */ void l(a a8, String string2) {
            a8.A(string2);
        }

        public final /* synthetic */ void A(String string2) {
            ((x)M.i(this.b)).s(string2);
        }

        public final /* synthetic */ void B(k0.o o8) {
            o8.c();
            ((x)M.i(this.b)).f(o8);
        }

        public final /* synthetic */ void C(k0.o o8) {
            ((x)M.i(this.b)).A(o8);
        }

        public final /* synthetic */ void D(d0.q q8, k0.p p8) {
            ((x)M.i(this.b)).z(q8, p8);
        }

        public final /* synthetic */ void E(long l8) {
            ((x)M.i(this.b)).l(l8);
        }

        public final /* synthetic */ void F(boolean bl) {
            ((x)M.i(this.b)).c(bl);
        }

        public final /* synthetic */ void G(int n8, long l8, long l9) {
            ((x)M.i(this.b)).v(n8, l8, l9);
        }

        public void H(long l8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new u(this, l8));
            }
        }

        public void I(boolean bl) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new w(this, bl));
            }
        }

        public void J(int n8, long l8, long l9) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new v(this, n8, l8, l9));
            }
        }

        public void m(Exception exception) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new o(this, exception));
            }
        }

        public void n(Exception exception) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new p(this, exception));
            }
        }

        public void o(z.a a8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new m(this, a8));
            }
        }

        public void p(z.a a8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new n(this, a8));
            }
        }

        public void q(String string2, long l8, long l9) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new r(this, string2, l8, l9));
            }
        }

        public void r(String string2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new s(this, string2));
            }
        }

        public void s(k0.o o8) {
            o8.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new t(this, o8));
            }
        }

        public void t(k0.o o8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new l(this, o8));
            }
        }

        public void u(d0.q q8, k0.p p8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new q(this, q8, p8));
            }
        }

        public final /* synthetic */ void v(Exception exception) {
            ((x)M.i(this.b)).p(exception);
        }

        public final /* synthetic */ void w(Exception exception) {
            ((x)M.i(this.b)).d(exception);
        }

        public final /* synthetic */ void x(z.a a8) {
            ((x)M.i(this.b)).a(a8);
        }

        public final /* synthetic */ void y(z.a a8) {
            ((x)M.i(this.b)).e(a8);
        }

        public final /* synthetic */ void z(String string2, long l8, long l9) {
            ((x)M.i(this.b)).t(string2, l8, l9);
        }
    }

}

