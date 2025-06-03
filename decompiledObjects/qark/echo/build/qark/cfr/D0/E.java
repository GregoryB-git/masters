/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.SystemClock
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package D0;

import D0.A;
import D0.B;
import D0.C;
import D0.D;
import D0.u;
import D0.v;
import D0.w;
import D0.x;
import D0.y;
import D0.z;
import android.os.Handler;
import android.os.SystemClock;
import d0.P;
import d0.q;
import g0.M;
import k0.o;
import k0.p;

public interface E {
    public void b(P var1);

    public void g(String var1);

    public void h(Object var1, long var2);

    public void i(String var1, long var2, long var4);

    public void n(o var1);

    public void o(o var1);

    public void q(Exception var1);

    public void u(q var1, p var2);

    public void w(int var1, long var2);

    public void y(long var1, int var3);

    public static final class a {
        public final Handler a;
        public final E b;

        public a(Handler handler, E e8) {
            handler = e8 != null ? (Handler)g0.a.e((Object)handler) : null;
            this.a = handler;
            this.b = e8;
        }

        public static /* synthetic */ void a(a a8, String string2, long l8, long l9) {
            a8.q(string2, l8, l9);
        }

        public static /* synthetic */ void b(a a8, Exception exception) {
            a8.y(exception);
        }

        public static /* synthetic */ void c(a a8, int n8, long l8) {
            a8.t(n8, l8);
        }

        public static /* synthetic */ void d(a a8, o o8) {
            a8.s(o8);
        }

        public static /* synthetic */ void e(a a8, o o8) {
            a8.u(o8);
        }

        public static /* synthetic */ void f(a a8, P p8) {
            a8.z(p8);
        }

        public static /* synthetic */ void g(a a8, long l8, int n8) {
            a8.x(l8, n8);
        }

        public static /* synthetic */ void h(a a8, q q8, p p8) {
            a8.v(q8, p8);
        }

        public static /* synthetic */ void i(a a8, String string2) {
            a8.r(string2);
        }

        public static /* synthetic */ void j(a a8, Object object, long l8) {
            a8.w(object, l8);
        }

        public void A(Object object) {
            if (this.a != null) {
                long l8 = SystemClock.elapsedRealtime();
                this.a.post((Runnable)new x(this, object, l8));
            }
        }

        public void B(long l8, int n8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new y(this, l8, n8));
            }
        }

        public void C(Exception exception) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new z(this, exception));
            }
        }

        public void D(P p8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new v(this, p8));
            }
        }

        public void k(String string2, long l8, long l9) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new u(this, string2, l8, l9));
            }
        }

        public void l(String string2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new D(this, string2));
            }
        }

        public void m(o o8) {
            o8.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new C(this, o8));
            }
        }

        public void n(int n8, long l8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new w(this, n8, l8));
            }
        }

        public void o(o o8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new A(this, o8));
            }
        }

        public void p(q q8, p p8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new B(this, q8, p8));
            }
        }

        public final /* synthetic */ void q(String string2, long l8, long l9) {
            ((E)M.i(this.b)).i(string2, l8, l9);
        }

        public final /* synthetic */ void r(String string2) {
            ((E)M.i(this.b)).g(string2);
        }

        public final /* synthetic */ void s(o o8) {
            o8.c();
            ((E)M.i(this.b)).o(o8);
        }

        public final /* synthetic */ void t(int n8, long l8) {
            ((E)M.i(this.b)).w(n8, l8);
        }

        public final /* synthetic */ void u(o o8) {
            ((E)M.i(this.b)).n(o8);
        }

        public final /* synthetic */ void v(q q8, p p8) {
            ((E)M.i(this.b)).u(q8, p8);
        }

        public final /* synthetic */ void w(Object object, long l8) {
            ((E)M.i(this.b)).h(object, l8);
        }

        public final /* synthetic */ void x(long l8, int n8) {
            ((E)M.i(this.b)).y(l8, n8);
        }

        public final /* synthetic */ void y(Exception exception) {
            ((E)M.i(this.b)).q(exception);
        }

        public final /* synthetic */ void z(P p8) {
            ((E)M.i(this.b)).b(p8);
        }
    }

}

