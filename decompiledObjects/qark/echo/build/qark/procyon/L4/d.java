// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L4;

import java.util.concurrent.TimeUnit;
import M4.c;
import N4.l;
import N4.k;
import java.util.List;
import java.util.Random;
import android.content.Context;
import M4.o;
import M4.i;
import C4.a;

public final class d
{
    public final C4.a a;
    public final double b;
    public final double c;
    public a d;
    public a e;
    public boolean f;
    
    public d(final i i, final long n, final M4.a a, final double b, final double c, final C4.a a2) {
        this.d = null;
        this.e = null;
        final boolean b2 = false;
        this.f = false;
        o.a(0.0 <= b && b < 1.0, "Sampling bucket ID should be in range [0.0, 1.0).");
        boolean b3 = b2;
        if (0.0 <= c) {
            b3 = b2;
            if (c < 1.0) {
                b3 = true;
            }
        }
        o.a(b3, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.b = b;
        this.c = c;
        this.a = a2;
        this.d = new a(i, n, a, a2, "Trace", this.f);
        this.e = new a(i, n, a, a2, "Network", this.f);
    }
    
    public d(final Context context, final i i, final long n) {
        this(i, n, new M4.a(), b(), b(), C4.a.g());
        this.f = o.b(context);
    }
    
    public static double b() {
        return new Random().nextDouble();
    }
    
    public void a(final boolean b) {
        this.d.a(b);
        this.e.a(b);
    }
    
    public final boolean c(final List list) {
        final int size = list.size();
        boolean b2;
        final boolean b = b2 = false;
        if (size > 0) {
            b2 = b;
            if (list.get(0).Z() > 0) {
                b2 = b;
                if (list.get(0).Y(0) == l.q) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final boolean d() {
        return this.c < this.a.f();
    }
    
    public final boolean e() {
        return this.b < this.a.s();
    }
    
    public final boolean f() {
        return this.b < this.a.G();
    }
    
    public boolean g(final N4.i i) {
        if (!this.j(i)) {
            return false;
        }
        if (i.o()) {
            return this.e.b(i) ^ true;
        }
        return !i.l() || (this.d.b(i) ^ true);
    }
    
    public boolean h(final N4.i i) {
        return (!i.l() || this.f() || this.c(i.n().s0())) && (!this.i(i) || this.d() || this.c(i.n().s0())) && (!i.o() || this.e() || this.c(i.p().q0()));
    }
    
    public boolean i(final N4.i i) {
        return i.l() && i.n().r0().startsWith("_st_") && i.n().h0("Hosting_activity");
    }
    
    public boolean j(final N4.i i) {
        return (!i.l() || (!i.n().r0().equals(M4.c.t.toString()) && !i.n().r0().equals(M4.c.u.toString())) || i.n().k0() <= 0) && !i.f();
    }
    
    public static class a
    {
        public static final F4.a k;
        public static final long l;
        public final M4.a a;
        public final boolean b;
        public M4.l c;
        public i d;
        public long e;
        public double f;
        public i g;
        public i h;
        public long i;
        public long j;
        
        static {
            k = F4.a.e();
            l = TimeUnit.SECONDS.toMicros(1L);
        }
        
        public a(final i d, final long e, final M4.a a, final C4.a a2, final String s, final boolean b) {
            this.a = a;
            this.e = e;
            this.d = d;
            this.f = (double)e;
            this.c = a.a();
            this.g(a2, s, b);
            this.b = b;
        }
        
        public static long c(final C4.a a, final String s) {
            if (s == "Trace") {
                return a.E();
            }
            return a.q();
        }
        
        public static long d(final C4.a a, final String s) {
            if (s == "Trace") {
                return a.t();
            }
            return a.t();
        }
        
        public static long e(final C4.a a, final String s) {
            if (s == "Trace") {
                return a.F();
            }
            return a.r();
        }
        
        public static long f(final C4.a a, final String s) {
            if (s == "Trace") {
                return a.t();
            }
            return a.t();
        }
        
        public void a(final boolean b) {
            // monitorenter(this)
            Label_0015: {
                if (!b) {
                    break Label_0015;
                }
                while (true) {
                    try {
                        i d = this.g;
                        // monitorexit(this)
                        while (true) {
                            this.d = d;
                            long e;
                            if (b) {
                                e = this.i;
                            }
                            else {
                                e = this.j;
                            }
                            this.e = e;
                            return;
                            d = this.h;
                            continue;
                        }
                        // monitorexit(this)
                        throw;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
        
        public boolean b(final N4.i i) {
            // monitorenter(this)
            while (true) {
                try {
                    final M4.l a = this.a.a();
                    final double n = this.c.d(a) * this.d.a() / L4.d.a.l;
                    if (n > 0.0) {
                        this.f = Math.min(this.f + n, (double)this.e);
                        this.c = a;
                    }
                    final double f = this.f;
                    if (f >= 1.0) {
                        this.f = f - 1.0;
                        // monitorexit(this)
                        return true;
                    }
                    if (this.b) {
                        L4.d.a.k.j("Exceeded log rate limit, dropping the log.");
                    }
                    // monitorexit(this)
                    return false;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public final void g(final C4.a a, final String s, final boolean b) {
            final long f = f(a, s);
            final long e = e(a, s);
            final TimeUnit seconds = TimeUnit.SECONDS;
            final i g = new i(e, f, seconds);
            this.g = g;
            this.i = e;
            if (b) {
                L4.d.a.k.b("Foreground %s logging rate:%f, burst capacity:%d", s, g, e);
            }
            final long d = d(a, s);
            final long c = c(a, s);
            final i h = new i(c, d, seconds);
            this.h = h;
            this.j = c;
            if (b) {
                L4.d.a.k.b("Background %s logging rate:%f, capacity:%d", s, h, c);
            }
        }
    }
}
