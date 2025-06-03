// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w6;

import kotlin.jvm.internal.u;
import u.b;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n
{
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicIntegerFieldUpdater c;
    public static final AtomicIntegerFieldUpdater d;
    public static final AtomicIntegerFieldUpdater e;
    public final AtomicReferenceArray a;
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;
    
    static {
        b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");
        c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");
        d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");
        e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");
    }
    
    public n() {
        this.a = new AtomicReferenceArray(128);
    }
    
    public final h a(h newValue, final boolean b) {
        if (b) {
            return this.b(newValue);
        }
        newValue = n.b.getAndSet(this, newValue);
        if (newValue == null) {
            return null;
        }
        return this.b(newValue);
    }
    
    public final h b(final h newValue) {
        if (this.d() == 127) {
            return newValue;
        }
        if (newValue.p.b() == 1) {
            n.e.incrementAndGet(this);
        }
        final int n = w6.n.c.get(this) & 0x7F;
        while (this.a.get(n) != null) {
            Thread.yield();
        }
        this.a.lazySet(n, newValue);
        w6.n.c.incrementAndGet(this);
        return null;
    }
    
    public final void c(final h h) {
        if (h != null && h.p.b() == 1) {
            n.e.decrementAndGet(this);
        }
    }
    
    public final int d() {
        return n.c.get(this) - n.d.get(this);
    }
    
    public final int e() {
        if (n.b.get(this) != null) {
            return this.d() + 1;
        }
        return this.d();
    }
    
    public final void f(final d d) {
        final h h = n.b.getAndSet(this, null);
        if (h != null) {
            d.a(h);
        }
        while (this.j(d)) {}
    }
    
    public final h g() {
        h i;
        if ((i = n.b.getAndSet(this, null)) == null) {
            i = this.i();
        }
        return i;
    }
    
    public final h h() {
        return this.k(true);
    }
    
    public final h i() {
        while (true) {
            final AtomicIntegerFieldUpdater d = n.d;
            final int value = d.get(this);
            if (value - n.c.get(this) == 0) {
                return null;
            }
            if (!d.compareAndSet(this, value, value + 1)) {
                continue;
            }
            final h h = this.a.getAndSet(value & 0x7F, null);
            if (h == null) {
                continue;
            }
            this.c(h);
            return h;
        }
    }
    
    public final boolean j(final d d) {
        final h i = this.i();
        if (i == null) {
            return false;
        }
        d.a(i);
        return true;
    }
    
    public final h k(final boolean b) {
        AtomicReferenceFieldUpdater b2;
        h h;
        do {
            b2 = n.b;
            h = b2.get(this);
            if (h != null) {
                final int b3 = h.p.b();
                boolean b4 = true;
                if (b3 != 1) {
                    b4 = false;
                }
                if (b4 == b) {
                    continue;
                }
            }
            final int i = n.d.get(this);
            int value = n.c.get(this);
            while (i != value) {
                if (b && n.e.get(this) == 0) {
                    return null;
                }
                --value;
                final h m = this.m(value, b);
                if (m != null) {
                    return m;
                }
            }
            return null;
        } while (!b.a(b2, this, h, null));
        return h;
    }
    
    public final h l(int i) {
        final int value = n.d.get(this);
        final int value2 = n.c.get(this);
        boolean b = true;
        if (i == 1) {
            i = value;
        }
        else {
            b = false;
            i = value;
        }
        while (i != value2) {
            if (b && n.e.get(this) == 0) {
                return null;
            }
            final h m = this.m(i, b);
            if (m != null) {
                return m;
            }
            ++i;
        }
        return null;
    }
    
    public final h m(int i, final boolean b) {
        i &= 0x7F;
        final h h = this.a.get(i);
        if (h != null) {
            final int b2 = h.p.b();
            boolean b3 = true;
            if (b2 != 1) {
                b3 = false;
            }
            if (b3 == b && r6.h.a(this.a, i, h, null)) {
                if (b) {
                    n.e.decrementAndGet(this);
                }
                return h;
            }
        }
        return null;
    }
    
    public final long n(final int n, final u u) {
        h o;
        if (n == 3) {
            o = this.i();
        }
        else {
            o = this.l(n);
        }
        if (o != null) {
            u.o = o;
            return -1L;
        }
        return this.o(n, u);
    }
    
    public final long o(final int n, final u u) {
        AtomicReferenceFieldUpdater b;
        h o;
        do {
            b = n.b;
            o = b.get(this);
            if (o == null) {
                return -2L;
            }
            final int b2 = o.p.b();
            int n2 = 1;
            if (b2 != 1) {
                n2 = 2;
            }
            if ((n2 & n) == 0x0) {
                return -2L;
            }
            final long n3 = l.f.a() - o.o;
            final long b3 = l.b;
            if (n3 < b3) {
                return b3 - n3;
            }
        } while (!u.b.a(b, this, o, null));
        u.o = o;
        return -1L;
    }
}
