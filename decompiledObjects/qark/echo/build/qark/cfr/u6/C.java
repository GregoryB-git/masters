/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 */
package u6;

import X5.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.E0;
import u6.e;

public abstract class C
extends e
implements E0 {
    public static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(C.class, (String)"cleanedAndPointers");
    private volatile int cleanedAndPointers;
    public final long q;

    public C(long l8, C c8, int n8) {
        super(c8);
        this.q = l8;
        this.cleanedAndPointers = n8 << 16;
    }

    @Override
    public boolean h() {
        if (r.get((Object)this) == this.n() && !this.i()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (r.addAndGet((Object)this, -65536) == this.n() && !this.i()) {
            return true;
        }
        return false;
    }

    public abstract int n();

    public abstract void o(int var1, Throwable var2, g var3);

    public final void p() {
        if (r.incrementAndGet((Object)this) == this.n()) {
            this.k();
        }
    }

    public final boolean q() {
        int n8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r;
        do {
            if ((n8 = atomicIntegerFieldUpdater.get((Object)this)) != this.n() || this.i()) continue;
            return false;
        } while (!atomicIntegerFieldUpdater.compareAndSet((Object)this, n8, 65536 + n8));
        return true;
    }
}

