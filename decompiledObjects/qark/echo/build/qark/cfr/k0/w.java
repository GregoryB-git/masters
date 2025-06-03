/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.String
 */
package k0;

import B0.e;
import B0.j;
import F0.m;
import W2.g;
import W2.s;
import android.content.Context;
import android.os.Looper;
import g0.M;
import k0.A;
import k0.B;
import k0.C;
import k0.D;
import k0.c1;
import k0.d1;
import k0.f0;
import k0.q;
import k0.t;
import k0.w0;
import k0.x;
import k0.x0;
import k0.y;
import k0.z;
import x0.n;
import x0.x;

public interface w
extends d0.D {
    public void d(boolean var1);

    public void e(x0.x var1);

    public int j();

    public void release();

    public static interface a {
        public void C(boolean var1);

        public void m(boolean var1);
    }

    public static final class b {
        public long A;
        public boolean B;
        public boolean C;
        public Looper D;
        public boolean E;
        public boolean F;
        public String G;
        public boolean H;
        public final Context a;
        public g0.c b;
        public long c;
        public s d;
        public s e;
        public s f;
        public s g;
        public s h;
        public g i;
        public Looper j;
        public int k;
        public d0.b l;
        public boolean m;
        public int n;
        public boolean o;
        public boolean p;
        public boolean q;
        public int r;
        public int s;
        public boolean t;
        public d1 u;
        public long v;
        public long w;
        public long x;
        public w0 y;
        public long z;

        public b(Context context) {
            this(context, new y(context), new z(context));
        }

        public b(Context context, s s8, s s9) {
            this(context, s8, s9, new A(context), new B(), new C(context), new D());
        }

        public b(Context context, s s8, s s9, s s10, s s11, s s12, g g8) {
            this.a = (Context)g0.a.e((Object)context);
            this.d = s8;
            this.e = s9;
            this.f = s10;
            this.g = s11;
            this.h = s12;
            this.i = g8;
            this.j = M.U();
            this.l = d0.b.g;
            this.n = 0;
            this.r = 1;
            this.s = 0;
            this.t = true;
            this.u = d1.g;
            this.v = 5000L;
            this.w = 15000L;
            this.x = 3000L;
            this.y = new q.b().a();
            this.b = g0.c.a;
            this.z = 500L;
            this.A = 2000L;
            this.C = true;
            this.G = "";
            this.k = -1000;
        }

        public static /* synthetic */ c1 a(Context context) {
            return b.g(context);
        }

        public static /* synthetic */ x.a b(Context context) {
            return b.h(context);
        }

        public static /* synthetic */ x0 c(x0 x02) {
            return x02;
        }

        public static /* synthetic */ e d(Context context) {
            return b.j(context);
        }

        public static /* synthetic */ A0.D e(Context context) {
            return b.i(context);
        }

        public static /* synthetic */ c1 g(Context context) {
            return new t(context);
        }

        public static /* synthetic */ x.a h(Context context) {
            return new n(context, (F0.x)new m());
        }

        public static /* synthetic */ A0.D i(Context context) {
            return new A0.n(context);
        }

        public static /* synthetic */ e j(Context context) {
            return j.n(context);
        }

        public w f() {
            g0.a.f(this.E ^ true);
            this.E = true;
            return new f0(this, null);
        }

        public b l(w0 w02) {
            g0.a.f(this.E ^ true);
            this.y = (w0)g0.a.e(w02);
            return this;
        }

        public b m(x0 x02) {
            g0.a.f(this.E ^ true);
            g0.a.e(x02);
            this.g = new x(x02);
            return this;
        }
    }

    public static class c {
        public static final c b = new c(-9223372036854775807L);
        public final long a;

        public c(long l8) {
            this.a = l8;
        }
    }

}

