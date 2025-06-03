// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import p6.H;
import X5.h;
import X5.g;
import p6.O;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.S;
import p6.F;

public final class m extends F implements S
{
    public static final AtomicIntegerFieldUpdater v;
    public final F q;
    public final int r;
    private volatile int runningWorkers;
    public final /* synthetic */ S s;
    public final r t;
    public final Object u;
    
    static {
        v = AtomicIntegerFieldUpdater.newUpdater(m.class, "runningWorkers");
    }
    
    public m(final F q, final int r) {
        this.q = q;
        this.r = r;
        S s;
        if (q instanceof S) {
            s = (S)q;
        }
        else {
            s = null;
        }
        S a = s;
        if (s == null) {
            a = O.a();
        }
        this.s = a;
        this.t = new r(false);
        this.u = new Object();
    }
    
    public static final /* synthetic */ F H(final m m) {
        return m.q;
    }
    
    @Override
    public void E(final g g, final Runnable runnable) {
        this.t.a(runnable);
        if (m.v.get(this) < this.r && this.K()) {
            final Runnable j = this.J();
            if (j == null) {
                return;
            }
            this.q.E(this, new a(j));
        }
    }
    
    public final Runnable J() {
        Runnable runnable;
        while (true) {
            runnable = (Runnable)this.t.d();
            if (runnable == null) {
                synchronized (this.u) {
                    final AtomicIntegerFieldUpdater v = m.v;
                    v.decrementAndGet(this);
                    if (this.t.c() == 0) {
                        return null;
                    }
                    v.incrementAndGet(this);
                    continue;
                }
                break;
            }
            break;
        }
        return runnable;
    }
    
    public final boolean K() {
        synchronized (this.u) {
            final AtomicIntegerFieldUpdater v = m.v;
            if (v.get(this) >= this.r) {
                return false;
            }
            v.incrementAndGet(this);
            return true;
        }
    }
    
    public final class a implements Runnable
    {
        public Runnable o;
        
        public a(final Runnable o) {
            this.o = o;
        }
        
        @Override
        public void run() {
            int n = 0;
            while (true) {
                try {
                    this.o.run();
                }
                finally {
                    final Throwable t;
                    H.a(h.o, t);
                }
                final Runnable i = m.this.J();
                if (i == null) {
                    return;
                }
                this.o = i;
                final int n2 = n + 1;
                if ((n = n2) < 16) {
                    continue;
                }
                n = n2;
                if (m.H(m.this).F(m.this)) {
                    m.H(m.this).E(m.this, this);
                }
            }
        }
    }
}
