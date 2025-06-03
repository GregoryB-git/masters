// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import X5.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.E0;

public abstract class C extends e implements E0
{
    public static final AtomicIntegerFieldUpdater r;
    private volatile int cleanedAndPointers;
    public final long q;
    
    static {
        r = AtomicIntegerFieldUpdater.newUpdater(C.class, "cleanedAndPointers");
    }
    
    public C(final long q, final C c, final int n) {
        super(c);
        this.q = q;
        this.cleanedAndPointers = n << 16;
    }
    
    @Override
    public boolean h() {
        return C.r.get(this) == this.n() && !this.i();
    }
    
    public final boolean m() {
        return C.r.addAndGet(this, -65536) == this.n() && !this.i();
    }
    
    public abstract int n();
    
    public abstract void o(final int p0, final Throwable p1, final g p2);
    
    public final void p() {
        if (C.r.incrementAndGet(this) == this.n()) {
            this.k();
        }
    }
    
    public final boolean q() {
        final AtomicIntegerFieldUpdater r = C.r;
        int value;
        do {
            value = r.get(this);
            if (value == this.n() && !this.i()) {
                return false;
            }
        } while (!r.compareAndSet(this, value, 65536 + value));
        return true;
    }
}
