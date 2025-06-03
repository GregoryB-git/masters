// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d1;

import c1.q;
import g0.a;
import c1.k;
import g0.M;
import c1.p;
import j0.j;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import c1.l;

public abstract class e implements l
{
    public final ArrayDeque a;
    public final ArrayDeque b;
    public final PriorityQueue c;
    public b d;
    public long e;
    public long f;
    public long g;
    
    public e() {
        this.a = new ArrayDeque();
        final int n = 0;
        for (int i = 0; i < 10; ++i) {
            this.a.add(new b(null));
        }
        this.b = new ArrayDeque();
        for (int j = n; j < 2; ++j) {
            this.b.add(new c(new d(this)));
        }
        this.c = new PriorityQueue();
        this.g = -9223372036854775807L;
    }
    
    @Override
    public final void c(final long g) {
        this.g = g;
    }
    
    @Override
    public void d(final long e) {
        this.e = e;
    }
    
    @Override
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            this.o((b)M.i(this.c.poll()));
        }
        final b d = this.d;
        if (d != null) {
            this.o(d);
            this.d = null;
        }
    }
    
    public abstract k g();
    
    public abstract void h(final p p0);
    
    public p i() {
        g0.a.f(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        return this.d = this.a.pollFirst();
    }
    
    public q j() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((b)M.i(this.c.peek())).t <= this.e) {
            final b b = (b)M.i(this.c.poll());
            q q;
            if (b.p()) {
                q = (q)M.i(this.b.pollFirst());
                q.l(4);
            }
            else {
                this.h(b);
                if (!this.m()) {
                    this.o(b);
                    continue;
                }
                final k g = this.g();
                q = (q)M.i(this.b.pollFirst());
                q.z(b.t, g, Long.MAX_VALUE);
            }
            this.o(b);
            return q;
        }
        return null;
    }
    
    public final q k() {
        return this.b.pollFirst();
    }
    
    public final long l() {
        return this.e;
    }
    
    public abstract boolean m();
    
    public void n(final p p) {
        g0.a.a(p == this.d);
        final b e = (b)p;
        final long g = this.g;
        if (g != -9223372036854775807L && e.t < g) {
            this.o(e);
        }
        else {
            final long f = this.f;
            this.f = 1L + f;
            d1.e.b.H(e, f);
            this.c.add(e);
        }
        this.d = null;
    }
    
    public final void o(final b e) {
        e.m();
        this.a.add(e);
    }
    
    public void p(final q e) {
        e.m();
        this.b.add(e);
    }
    
    @Override
    public void release() {
    }
    
    public static final class b extends p implements Comparable
    {
        public long y;
        
        public static /* synthetic */ long H(final b b, final long y) {
            return b.y = y;
        }
        
        public int K(final b b) {
            final boolean p = this.p();
            final boolean p2 = b.p();
            int n = -1;
            if (p != p2) {
                if (this.p()) {
                    n = 1;
                }
                return n;
            }
            long n2;
            if ((n2 = super.t - b.t) == 0L && (n2 = this.y - b.y) == 0L) {
                return 0;
            }
            if (n2 > 0L) {
                n = 1;
            }
            return n;
        }
    }
    
    public static final class c extends q
    {
        public a u;
        
        public c(final a u) {
            this.u = u;
        }
        
        @Override
        public final void x() {
            this.u.a(this);
        }
    }
}
