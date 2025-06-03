// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import java.util.Iterator;
import B0.b;
import g0.o;
import A0.y;
import x0.Z;
import x0.x;
import d0.I;
import l0.y1;
import g0.a;
import g0.M;
import java.util.HashMap;
import B0.h;

public class r implements x0
{
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
    
    public r(final h a, final int n, final int n2, final int n3, final int n4, final int f, final boolean g, final int n5, final boolean i) {
        k(n3, 0, "bufferForPlaybackMs", "0");
        k(n4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(n, n3, "minBufferMs", "bufferForPlaybackMs");
        k(n, n4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(n2, n, "maxBufferMs", "minBufferMs");
        k(n5, 0, "backBufferDurationMs", "0");
        this.a = a;
        this.b = M.J0(n);
        this.c = M.J0(n2);
        this.d = M.J0(n3);
        this.e = M.J0(n4);
        this.f = f;
        this.g = g;
        this.h = M.J0(n5);
        this.i = i;
        this.j = new HashMap();
        this.k = -1L;
    }
    
    public static void k(final int n, final int n2, final String str, final String str2) {
        final boolean b = n >= n2;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        g0.a.b(b, sb.toString());
    }
    
    public static int n(final int n) {
        switch (n) {
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
            case -2: {
                return 0;
            }
        }
    }
    
    @Override
    public void a(final y1 y1) {
        final long id = Thread.currentThread().getId();
        final long k = this.k;
        g0.a.g(k == -1L || k == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.k = id;
        if (!this.j.containsKey(y1)) {
            this.j.put(y1, new c(null));
        }
        this.p(y1);
    }
    
    @Override
    public void b(final y1 key, final I i, final x.b b, final Y0[] array, final Z z, final y[] array2) {
        final c c = (c)g0.a.e(this.j.get(key));
        int b2;
        if ((b2 = this.f) == -1) {
            b2 = this.l(array, array2);
        }
        c.b = b2;
        this.q();
    }
    
    @Override
    public boolean c(final a a) {
        final c c = (c)a.e(this.j.get(a.a));
        final int f = this.a.f();
        final int m = this.m();
        final boolean b = true;
        final boolean b2 = f >= m;
        final long b3 = this.b;
        final float f2 = a.f;
        long min = b3;
        if (f2 > 1.0f) {
            min = Math.min(M.c0(b3, f2), this.c);
        }
        final long max = Math.max(min, 500000L);
        final long e = a.e;
        if (e < max) {
            boolean a2 = b;
            if (!this.g) {
                a2 = (!b2 && b);
            }
            c.a = a2;
            if (!a2 && e < 500000L) {
                o.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        }
        else if (e >= this.c || b2) {
            c.a = false;
        }
        return c.a;
    }
    
    @Override
    public void d(final y1 y1) {
        this.o(y1);
        if (this.j.isEmpty()) {
            this.k = -1L;
        }
    }
    
    @Override
    public boolean e(final a a) {
        final long h0 = M.h0(a.e, a.f);
        long b;
        if (a.h) {
            b = this.e;
        }
        else {
            b = this.d;
        }
        final long i = a.i;
        long min = b;
        if (i != -9223372036854775807L) {
            min = Math.min(i / 2L, b);
        }
        return min <= 0L || h0 >= min || (!this.g && this.a.f() >= this.m());
    }
    
    @Override
    public boolean f(final y1 y1) {
        return this.i;
    }
    
    @Override
    public void g(final y1 y1) {
        this.o(y1);
    }
    
    @Override
    public long h(final y1 y1) {
        return this.h;
    }
    
    @Override
    public B0.b i() {
        return this.a;
    }
    
    public int l(final Y0[] array, final y[] array2) {
        int i = 0;
        int b = 0;
        while (i < array.length) {
            int n = b;
            if (array2[i] != null) {
                n = b + n(array[i].l());
            }
            ++i;
            b = n;
        }
        return Math.max(13107200, b);
    }
    
    public int m() {
        final Iterator<c> iterator = this.j.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().b;
        }
        return n;
    }
    
    public final void o(final y1 key) {
        if (this.j.remove(key) != null) {
            this.q();
        }
    }
    
    public final void p(final y1 key) {
        final c c = (c)g0.a.e(this.j.get(key));
        int f;
        if ((f = this.f) == -1) {
            f = 13107200;
        }
        c.b = f;
        c.a = false;
    }
    
    public final void q() {
        if (this.j.isEmpty()) {
            this.a.g();
            return;
        }
        this.a.h(this.m());
    }
    
    public static final class b
    {
        public h a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public int h;
        public boolean i;
        public boolean j;
        
        public b() {
            this.b = 50000;
            this.c = 50000;
            this.d = 2500;
            this.e = 5000;
            this.f = -1;
            this.g = false;
            this.h = 0;
            this.i = false;
        }
        
        public r a() {
            g0.a.f(this.j ^ true);
            this.j = true;
            if (this.a == null) {
                this.a = new h(true, 65536);
            }
            return new r(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        
        public b b(final int h, final boolean i) {
            g0.a.f(this.j ^ true);
            k(h, 0, "backBufferDurationMs", "0");
            this.h = h;
            this.i = i;
            return this;
        }
        
        public b c(final int b, final int c, final int d, final int e) {
            g0.a.f(this.j ^ true);
            k(d, 0, "bufferForPlaybackMs", "0");
            k(e, 0, "bufferForPlaybackAfterRebufferMs", "0");
            k(b, d, "minBufferMs", "bufferForPlaybackMs");
            k(b, e, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            k(c, b, "maxBufferMs", "minBufferMs");
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            return this;
        }
        
        public b d(final boolean g) {
            g0.a.f(this.j ^ true);
            this.g = g;
            return this;
        }
        
        public b e(final int f) {
            g0.a.f(this.j ^ true);
            this.f = f;
            return this;
        }
    }
    
    public static class c
    {
        public boolean a;
        public int b;
    }
}
