/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package p0;

import android.os.Handler;
import g0.M;
import java.util.concurrent.CopyOnWriteArrayList;
import p0.p;
import p0.q;
import p0.r;
import p0.s;
import p0.t;
import p0.u;
import x0.x;

public interface v {
    public void M(int var1, x.b var2, int var3);

    public void S(int var1, x.b var2);

    public void T(int var1, x.b var2);

    public void b0(int var1, x.b var2);

    public void d0(int var1, x.b var2, Exception var3);

    public void g0(int var1, x.b var2);

    public void l0(int var1, x.b var2);

    public static class p0.v$a {
        public final int a;
        public final x.b b;
        public final CopyOnWriteArrayList c;

        public p0.v$a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public p0.v$a(CopyOnWriteArrayList copyOnWriteArrayList, int n8, x.b b8) {
            this.c = copyOnWriteArrayList;
            this.a = n8;
            this.b = b8;
        }

        public static /* synthetic */ void a(p0.v$a a8, v v8) {
            a8.p(v8);
        }

        public static /* synthetic */ void b(p0.v$a a8, v v8) {
            a8.s(v8);
        }

        public static /* synthetic */ void c(p0.v$a a8, v v8, int n8) {
            a8.q(v8, n8);
        }

        public static /* synthetic */ void d(p0.v$a a8, v v8) {
            a8.n(v8);
        }

        public static /* synthetic */ void e(p0.v$a a8, v v8, Exception exception) {
            a8.r(v8, exception);
        }

        public static /* synthetic */ void f(p0.v$a a8, v v8) {
            a8.o(v8);
        }

        public void g(Handler handler, v v8) {
            g0.a.e((Object)handler);
            g0.a.e(v8);
            this.c.add((Object)new a(handler, v8));
        }

        public void h() {
            for (a a8 : this.c) {
                v v8 = a8.b;
                M.S0(a8.a, new u(this, v8));
            }
        }

        public void i() {
            for (a a8 : this.c) {
                v v8 = a8.b;
                M.S0(a8.a, new s(this, v8));
            }
        }

        public void j() {
            for (a a8 : this.c) {
                v v8 = a8.b;
                M.S0(a8.a, new t(this, v8));
            }
        }

        public void k(int n8) {
            for (a a8 : this.c) {
                v v8 = a8.b;
                M.S0(a8.a, new q(this, v8, n8));
            }
        }

        public void l(Exception exception) {
            for (a a8 : this.c) {
                v v8 = a8.b;
                M.S0(a8.a, new p(this, v8, exception));
            }
        }

        public void m() {
            for (a a8 : this.c) {
                v v8 = a8.b;
                M.S0(a8.a, new r(this, v8));
            }
        }

        public final /* synthetic */ void n(v v8) {
            v8.S(this.a, this.b);
        }

        public final /* synthetic */ void o(v v8) {
            v8.g0(this.a, this.b);
        }

        public final /* synthetic */ void p(v v8) {
            v8.l0(this.a, this.b);
        }

        public final /* synthetic */ void q(v v8, int n8) {
            v8.b0(this.a, this.b);
            v8.M(this.a, this.b, n8);
        }

        public final /* synthetic */ void r(v v8, Exception exception) {
            v8.d0(this.a, this.b, exception);
        }

        public final /* synthetic */ void s(v v8) {
            v8.T(this.a, this.b);
        }

        public void t(v v8) {
            for (a a8 : this.c) {
                if (a8.b != v8) continue;
                this.c.remove((Object)a8);
            }
        }

        public p0.v$a u(int n8, x.b b8) {
            return new p0.v$a(this.c, n8, b8);
        }

        public static final class a {
            public Handler a;
            public v b;

            public a(Handler handler, v v8) {
                this.a = handler;
                this.b = v8;
            }
        }

    }

}

