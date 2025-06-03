/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 */
package p6;

import X5.d;
import X5.g;
import Y5.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.D;
import p6.y0;
import p6.z;
import u6.B;
import u6.k;

public final class T
extends B {
    public static final AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(T.class, (String)"_decision");
    private volatile int _decision;

    public T(g g8, d d8) {
        super(g8, d8);
    }

    private final boolean L0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s;
        do {
            int n8;
            if ((n8 = atomicIntegerFieldUpdater.get((Object)this)) == 0) continue;
            if (n8 == 1) {
                return false;
            }
            throw new IllegalStateException("Already resumed".toString());
        } while (!s.compareAndSet((Object)this, 0, 2));
        return true;
    }

    private final boolean M0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s;
        do {
            int n8;
            if ((n8 = atomicIntegerFieldUpdater.get((Object)this)) == 0) continue;
            if (n8 == 2) {
                return false;
            }
            throw new IllegalStateException("Already suspended".toString());
        } while (!s.compareAndSet((Object)this, 0, 1));
        return true;
    }

    @Override
    public void F(Object object) {
        this.G0(object);
    }

    @Override
    public void G0(Object object) {
        if (this.L0()) {
            return;
        }
        k.c(b.b(this.r), D.a(object, this.r), null, 2, null);
    }

    public final Object K0() {
        if (this.M0()) {
            return b.c();
        }
        Object object = y0.h(this.b0());
        if (!(object instanceof z)) {
            return object;
        }
        throw ((z)object).a;
    }
}

