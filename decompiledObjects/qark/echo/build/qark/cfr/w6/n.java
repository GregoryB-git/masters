/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceArray
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package w6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.u;
import u.b;
import w6.d;
import w6.g;
import w6.h;
import w6.i;
import w6.l;

public final class n {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, (String)"lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(n.class, (String)"producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(n.class, (String)"consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(n.class, (String)"blockingTasksInBuffer");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h h8, boolean bl) {
        if (bl) {
            return this.b(h8);
        }
        if ((h8 = (h)b.getAndSet((Object)this, (Object)h8)) == null) {
            return null;
        }
        return this.b(h8);
    }

    public final h b(h h8) {
        if (this.d() == 127) {
            return h8;
        }
        if (h8.p.b() == 1) {
            e.incrementAndGet((Object)this);
        }
        int n8 = c.get((Object)this) & 127;
        while (this.a.get(n8) != null) {
            Thread.yield();
        }
        this.a.lazySet(n8, (Object)h8);
        c.incrementAndGet((Object)this);
        return null;
    }

    public final void c(h h8) {
        if (h8 != null && h8.p.b() == 1) {
            e.decrementAndGet((Object)this);
        }
    }

    public final int d() {
        return c.get((Object)this) - d.get((Object)this);
    }

    public final int e() {
        if (b.get((Object)this) != null) {
            return this.d() + 1;
        }
        return this.d();
    }

    public final void f(d d8) {
        h h8 = (h)b.getAndSet((Object)this, (Object)null);
        if (h8 != null) {
            d8.a(h8);
        }
        while (this.j(d8)) {
        }
    }

    public final h g() {
        h h8;
        h h9 = h8 = (h)b.getAndSet((Object)this, (Object)null);
        if (h8 == null) {
            h9 = this.i();
        }
        return h9;
    }

    public final h h() {
        return this.k(true);
    }

    public final h i() {
        int n8;
        Object object;
        do {
            if ((n8 = (object = d).get((Object)this)) - c.get((Object)this) != 0) continue;
            return null;
        } while (!object.compareAndSet((Object)this, n8, n8 + 1) || (object = (h)this.a.getAndSet(n8 & 127, (Object)null)) == null);
        this.c((h)object);
        return object;
    }

    public final boolean j(d d8) {
        h h8 = this.i();
        if (h8 == null) {
            return false;
        }
        d8.a(h8);
        return true;
    }

    public final h k(boolean bl) {
        int n8;
        h h8;
        Object object;
        while ((h8 = (h)(object = b).get((Object)this)) != null) {
            n8 = h8.p.b();
            boolean bl2 = true;
            if (n8 != 1) {
                bl2 = false;
            }
            if (bl2 != bl) break;
            if (!b.a((AtomicReferenceFieldUpdater)object, this, h8, null)) continue;
            return h8;
        }
        int n9 = d.get((Object)this);
        n8 = c.get((Object)this);
        while (n9 != n8) {
            if (bl && e.get((Object)this) == 0) {
                return null;
            }
            if ((object = this.m(--n8, bl)) == null) continue;
            return object;
        }
        return null;
    }

    public final h l(int n8) {
        int n9 = d.get((Object)this);
        int n10 = c.get((Object)this);
        boolean bl = true;
        if (n8 == 1) {
            n8 = n9;
        } else {
            bl = false;
            n8 = n9;
        }
        while (n8 != n10) {
            if (bl && e.get((Object)this) == 0) {
                return null;
            }
            h h8 = this.m(n8, bl);
            if (h8 == null) {
                ++n8;
                continue;
            }
            return h8;
        }
        return null;
    }

    public final h m(int n8, boolean bl) {
        h h8 = (h)this.a.get(n8 &= 127);
        if (h8 != null) {
            int n9 = h8.p.b();
            boolean bl2 = true;
            if (n9 != 1) {
                bl2 = false;
            }
            if (bl2 == bl && r6.h.a(this.a, n8, h8, null)) {
                if (bl) {
                    e.decrementAndGet((Object)this);
                }
                return h8;
            }
        }
        return null;
    }

    public final long n(int n8, u u8) {
        h h8 = n8 == 3 ? this.i() : this.l(n8);
        if (h8 != null) {
            u8.o = h8;
            return -1L;
        }
        return this.o(n8, u8);
    }

    public final long o(int n8, u u8) {
        h h8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            long l8;
            if ((h8 = (h)(atomicReferenceFieldUpdater = b).get((Object)this)) == null) {
                return -2L;
            }
            int n9 = h8.p.b();
            int n10 = 1;
            if (n9 != 1) {
                n10 = 2;
            }
            if ((n10 & n8) == 0) {
                return -2L;
            }
            long l9 = l.f.a() - h8.o;
            if (l9 >= (l8 = l.b)) continue;
            return l8 - l9;
        } while (!b.a(atomicReferenceFieldUpdater, this, h8, null));
        u8.o = h8;
        return -1L;
    }
}

