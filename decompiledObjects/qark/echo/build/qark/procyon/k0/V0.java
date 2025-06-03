// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import java.util.concurrent.TimeoutException;
import g0.a;
import android.os.Looper;
import d0.I;
import g0.c;

public final class V0
{
    public final b a;
    public final a b;
    public final c c;
    public final I d;
    public int e;
    public Object f;
    public Looper g;
    public int h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    
    public V0(final a b, final b a, final I d, final int h, final c c, final Looper g) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.g = g;
        this.c = c;
        this.h = h;
        this.i = -9223372036854775807L;
        this.j = true;
    }
    
    public boolean a(final long n) {
        // monitorenter(this)
        while (true) {
            try {
                g0.a.f(this.k);
                g0.a.f(this.g.getThread() != Thread.currentThread());
                final long b = this.c.b();
                long n2 = n;
                boolean m;
                while (true) {
                    m = this.m;
                    if (m || n2 <= 0L) {
                        break;
                    }
                    this.c.f();
                    this.wait(n2);
                    n2 = b + n - this.c.b();
                }
                if (m) {
                    // monitorexit(this)
                    return this.l;
                }
                throw new TimeoutException("Message delivery timed out.");
            }
            // monitorexit(this)
            finally {}
            continue;
        }
    }
    
    public boolean b() {
        return this.j;
    }
    
    public Looper c() {
        return this.g;
    }
    
    public int d() {
        return this.h;
    }
    
    public Object e() {
        return this.f;
    }
    
    public long f() {
        return this.i;
    }
    
    public b g() {
        return this.a;
    }
    
    public I h() {
        return this.d;
    }
    
    public int i() {
        return this.e;
    }
    
    public boolean j() {
        synchronized (this) {
            return this.n;
        }
    }
    
    public void k(final boolean b) {
        synchronized (this) {
            this.l |= b;
            this.m = true;
            this.notifyAll();
        }
    }
    
    public V0 l() {
        g0.a.f(this.k ^ true);
        if (this.i == -9223372036854775807L) {
            g0.a.a(this.j);
        }
        this.k = true;
        this.b.c(this);
        return this;
    }
    
    public V0 m(final Object f) {
        g0.a.f(this.k ^ true);
        this.f = f;
        return this;
    }
    
    public V0 n(final int e) {
        g0.a.f(this.k ^ true);
        this.e = e;
        return this;
    }
    
    public interface a
    {
        void c(final V0 p0);
    }
    
    public interface b
    {
        void t(final int p0, final Object p1);
    }
}
