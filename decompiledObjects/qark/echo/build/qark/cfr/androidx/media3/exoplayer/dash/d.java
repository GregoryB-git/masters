/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 */
package androidx.media3.exoplayer.dash;

import F0.S;
import F0.T;
import android.os.Handler;
import android.os.Message;
import d0.A;
import d0.i;
import d0.q;
import d0.x;
import g0.M;
import g0.z;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import k0.v0;
import x0.P;
import y0.e;

public final class d
implements Handler.Callback {
    public final B0.b o;
    public final b p;
    public final Q0.b q;
    public final Handler r;
    public final TreeMap s;
    public o0.c t;
    public long u;
    public boolean v;
    public boolean w;
    public boolean x;

    public d(o0.c c8, b b8, B0.b b9) {
        this.t = c8;
        this.p = b8;
        this.o = b9;
        this.s = new TreeMap();
        this.r = M.B(this);
        this.q = new Q0.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long f(Q0.a a8) {
        try {
            return M.Q0(M.H(a8.s));
        }
        catch (A a9) {
            return -9223372036854775807L;
        }
    }

    public static boolean h(String string2, String string3) {
        if ("urn:mpeg:dash:event:2012".equals((Object)string2) && ("1".equals((Object)string3) || "2".equals((Object)string3) || "3".equals((Object)string3))) {
            return true;
        }
        return false;
    }

    public final Map.Entry e(long l8) {
        return this.s.ceilingEntry((Object)l8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g(long l8, long l9) {
        Long l10 = (Long)this.s.get((Object)l9);
        if (l10 != null && l10 <= l8) {
            return;
        }
        this.s.put((Object)l9, (Object)l8);
    }

    public boolean handleMessage(Message object) {
        if (this.x) {
            return true;
        }
        if (object.what != 1) {
            return false;
        }
        object = (a)object.obj;
        this.g(object.a, object.b);
        return true;
    }

    public final void i() {
        if (!this.v) {
            return;
        }
        this.w = true;
        this.v = false;
        this.p.a();
    }

    public boolean j(long l8) {
        o0.c c8 = this.t;
        boolean bl = c8.d;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (this.w) {
            return true;
        }
        c8 = this.e(c8.h);
        bl = bl2;
        if (c8 != null) {
            bl = bl2;
            if ((Long)c8.getValue() < l8) {
                this.u = (Long)c8.getKey();
                this.l();
                bl = true;
            }
        }
        if (bl) {
            this.i();
        }
        return bl;
    }

    public c k() {
        return new c(this.o);
    }

    public final void l() {
        this.p.b(this.u);
    }

    public void m(e e8) {
        this.v = true;
    }

    public boolean n(boolean bl) {
        if (!this.t.d) {
            return false;
        }
        if (this.w) {
            return true;
        }
        if (bl) {
            this.i();
            return true;
        }
        return false;
    }

    public void o() {
        this.x = true;
        this.r.removeCallbacksAndMessages((Object)null);
    }

    public final void p() {
        Iterator iterator = this.s.entrySet().iterator();
        while (iterator.hasNext()) {
            if ((Long)((Map.Entry)iterator.next()).getKey() >= this.t.h) continue;
            iterator.remove();
        }
    }

    public void q(o0.c c8) {
        this.w = false;
        this.u = -9223372036854775807L;
        this.t = c8;
        this.p();
    }

    public static final class a {
        public final long a;
        public final long b;

        public a(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }
    }

    public static interface b {
        public void a();

        public void b(long var1);
    }

    public final class c
    implements T {
        public final P a;
        public final v0 b;
        public final O0.b c;
        public long d;

        public c(B0.b b8) {
            this.a = P.l(b8);
            this.b = new v0();
            this.c = new O0.b();
            this.d = -9223372036854775807L;
        }

        @Override
        public void a(z z8, int n8, int n9) {
            this.a.e(z8, n8);
        }

        @Override
        public void b(long l8, int n8, int n9, int n10, T.a a8) {
            this.a.b(l8, n8, n9, n10, a8);
            this.l();
        }

        @Override
        public int c(i i8, int n8, boolean bl, int n9) {
            return this.a.f(i8, n8, bl);
        }

        @Override
        public void d(q q8) {
            this.a.d(q8);
        }

        @Override
        public /* synthetic */ void e(z z8, int n8) {
            S.b(this, z8, n8);
        }

        @Override
        public /* synthetic */ int f(i i8, int n8, boolean bl) {
            return S.a(this, i8, n8, bl);
        }

        public final O0.b g() {
            this.c.m();
            if (this.a.T(this.b, this.c, 0, false) == -4) {
                this.c.C();
                return this.c;
            }
            return null;
        }

        public boolean h(long l8) {
            return d.this.j(l8);
        }

        public void i(e e8) {
            long l8 = this.d;
            if (l8 == -9223372036854775807L || e8.h > l8) {
                this.d = e8.h;
            }
            d.this.m(e8);
        }

        public boolean j(e e8) {
            long l8 = this.d;
            boolean bl = l8 != -9223372036854775807L && l8 < e8.g;
            return d.this.n(bl);
        }

        public final void k(long l8, long l9) {
            a a8 = new a(l8, l9);
            d.this.r.sendMessage(d.this.r.obtainMessage(1, (Object)a8));
        }

        public final void l() {
            while (this.a.L(false)) {
                Object object = this.g();
                if (object == null) continue;
                long l8 = object.t;
                object = d.this.q.a((O0.b)object);
                if (object == null) continue;
                object = (Q0.a)object.d(0);
                if (!d.h(object.o, object.p)) continue;
                this.m(l8, (Q0.a)object);
            }
            this.a.s();
        }

        public final void m(long l8, Q0.a a8) {
            long l9 = d.f(a8);
            if (l9 == -9223372036854775807L) {
                return;
            }
            this.k(l8, l9);
        }

        public void n() {
            this.a.U();
        }
    }

}

