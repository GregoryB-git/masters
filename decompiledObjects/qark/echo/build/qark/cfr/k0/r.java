/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 */
package k0;

import A0.y;
import B0.h;
import d0.I;
import g0.M;
import g0.a;
import g0.o;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import k0.Y0;
import k0.x0;
import l0.y1;
import x0.Z;
import x0.x;

public class r
implements x0 {
    public final h a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final HashMap j;
    public long k;

    public r() {
        this(new h(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public r(h h8, int n8, int n9, int n10, int n11, int n12, boolean bl, int n13, boolean bl2) {
        r.k(n10, 0, "bufferForPlaybackMs", "0");
        r.k(n11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        r.k(n8, n10, "minBufferMs", "bufferForPlaybackMs");
        r.k(n8, n11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        r.k(n9, n8, "maxBufferMs", "minBufferMs");
        r.k(n13, 0, "backBufferDurationMs", "0");
        this.a = h8;
        this.b = M.J0(n8);
        this.c = M.J0(n9);
        this.d = M.J0(n10);
        this.e = M.J0(n11);
        this.f = n12;
        this.g = bl;
        this.h = M.J0(n13);
        this.i = bl2;
        this.j = new HashMap();
        this.k = -1L;
    }

    public static void k(int n8, int n9, String string2, String string3) {
        boolean bl = n8 >= n9;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" cannot be less than ");
        stringBuilder.append(string3);
        a.b(bl, stringBuilder.toString());
    }

    public static int n(int n8) {
        switch (n8) {
            default: {
                throw new IllegalArgumentException();
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                return 131072;
            }
            case 2: {
                return 131072000;
            }
            case 1: {
                return 13107200;
            }
            case 0: {
                return 144310272;
            }
            case -2: 
        }
        return 0;
    }

    @Override
    public void a(y1 y12) {
        long l8 = Thread.currentThread().getId();
        long l9 = this.k;
        boolean bl = l9 == -1L || l9 == l8;
        a.g(bl, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.k = l8;
        if (!this.j.containsKey((Object)y12)) {
            this.j.put((Object)y12, (Object)new c(null));
        }
        this.p(y12);
    }

    @Override
    public void b(y1 object, I i8, x.b b8, Y0[] arry0, Z z8, y[] arry) {
        int n8;
        object = (c)a.e((c)this.j.get(object));
        int n9 = n8 = this.f;
        if (n8 == -1) {
            n9 = this.l(arry0, arry);
        }
        object.b = n9;
        this.q();
    }

    @Override
    public boolean c(x0.a a8) {
        c c8 = (c)a.e((c)this.j.get((Object)a8.a));
        int n8 = this.a.f();
        int n9 = this.m();
        boolean bl = true;
        n8 = n8 >= n9 ? 1 : 0;
        long l8 = this.b;
        float f8 = a8.f;
        long l9 = l8;
        if (f8 > 1.0f) {
            l9 = Math.min((long)M.c0(l8, f8), (long)this.c);
        }
        if ((l8 = a8.e) < (l9 = Math.max((long)l9, (long)500000L))) {
            boolean bl2 = bl;
            if (!this.g) {
                bl2 = n8 == 0 ? bl : false;
            }
            c8.a = bl2;
            if (!bl2 && l8 < 500000L) {
                o.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (l8 >= this.c || n8 != 0) {
            c8.a = false;
        }
        return c8.a;
    }

    @Override
    public void d(y1 y12) {
        this.o(y12);
        if (this.j.isEmpty()) {
            this.k = -1L;
        }
    }

    @Override
    public boolean e(x0.a a8) {
        long l8 = M.h0(a8.e, a8.f);
        long l9 = a8.h ? this.e : this.d;
        long l10 = a8.i;
        long l11 = l9;
        if (l10 != -9223372036854775807L) {
            l11 = Math.min((long)(l10 / 2L), (long)l9);
        }
        if (l11 > 0L && l8 < l11 && (this.g || this.a.f() < this.m())) {
            return false;
        }
        return true;
    }

    @Override
    public boolean f(y1 y12) {
        return this.i;
    }

    @Override
    public void g(y1 y12) {
        this.o(y12);
    }

    @Override
    public long h(y1 y12) {
        return this.h;
    }

    @Override
    public B0.b i() {
        return this.a;
    }

    public int l(Y0[] arry0, y[] arry) {
        int n8 = 0;
        for (int i8 = 0; i8 < arry0.length; ++i8) {
            int n9 = n8;
            if (arry[i8] != null) {
                n9 = n8 + r.n(arry0[i8].l());
            }
            n8 = n9;
        }
        return Math.max((int)13107200, (int)n8);
    }

    public int m() {
        Iterator iterator = this.j.values().iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            n8 += ((c)iterator.next()).b;
        }
        return n8;
    }

    public final void o(y1 y12) {
        if (this.j.remove((Object)y12) != null) {
            this.q();
        }
    }

    public final void p(y1 object) {
        int n8;
        object = (c)a.e((c)this.j.get(object));
        int n9 = n8 = this.f;
        if (n8 == -1) {
            n9 = 13107200;
        }
        object.b = n9;
        object.a = false;
    }

    public final void q() {
        if (this.j.isEmpty()) {
            this.a.g();
            return;
        }
        this.a.h(this.m());
    }

    public static final class b {
        public h a;
        public int b = 50000;
        public int c = 50000;
        public int d = 2500;
        public int e = 5000;
        public int f = -1;
        public boolean g = false;
        public int h = 0;
        public boolean i = false;
        public boolean j;

        public r a() {
            a.f(this.j ^ true);
            this.j = true;
            if (this.a == null) {
                this.a = new h(true, 65536);
            }
            return new r(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public b b(int n8, boolean bl) {
            a.f(this.j ^ true);
            r.k(n8, 0, "backBufferDurationMs", "0");
            this.h = n8;
            this.i = bl;
            return this;
        }

        public b c(int n8, int n9, int n10, int n11) {
            a.f(this.j ^ true);
            r.k(n10, 0, "bufferForPlaybackMs", "0");
            r.k(n11, 0, "bufferForPlaybackAfterRebufferMs", "0");
            r.k(n8, n10, "minBufferMs", "bufferForPlaybackMs");
            r.k(n8, n11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            r.k(n9, n8, "maxBufferMs", "minBufferMs");
            this.b = n8;
            this.c = n9;
            this.d = n10;
            this.e = n11;
            return this;
        }

        public b d(boolean bl) {
            a.f(this.j ^ true);
            this.g = bl;
            return this;
        }

        public b e(int n8) {
            a.f(this.j ^ true);
            this.f = n8;
            return this;
        }
    }

    public static class c {
        public boolean a;
        public int b;

        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }
    }

}

