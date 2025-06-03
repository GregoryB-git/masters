// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import g6.l;
import u6.k;
import Y5.b;
import X5.d;
import X5.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import u6.B;

public final class T extends B
{
    public static final AtomicIntegerFieldUpdater s;
    private volatile int _decision;
    
    static {
        s = AtomicIntegerFieldUpdater.newUpdater(T.class, "_decision");
    }
    
    public T(final g g, final d d) {
        super(g, d);
    }
    
    private final boolean L0() {
        final AtomicIntegerFieldUpdater s = T.s;
        do {
            final int value = s.get(this);
            if (value != 0) {
                if (value == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!T.s.compareAndSet(this, 0, 2));
        return true;
    }
    
    private final boolean M0() {
        final AtomicIntegerFieldUpdater s = T.s;
        do {
            final int value = s.get(this);
            if (value != 0) {
                if (value == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!T.s.compareAndSet(this, 0, 1));
        return true;
    }
    
    @Override
    public void F(final Object o) {
        this.G0(o);
    }
    
    @Override
    public void G0(final Object o) {
        if (this.L0()) {
            return;
        }
        k.c(b.b(super.r), D.a(o, super.r), null, 2, null);
    }
    
    public final Object K0() {
        if (this.M0()) {
            return b.c();
        }
        final Object h = y0.h(this.b0());
        if (!(h instanceof z)) {
            return h;
        }
        throw ((z)h).a;
    }
}
