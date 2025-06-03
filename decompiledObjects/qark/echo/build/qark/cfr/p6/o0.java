/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 */
package p6;

import V5.t;
import g6.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.s0;

public final class o0
extends s0 {
    public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(o0.class, (String)"_invoked");
    private volatile int _invoked;
    public final l s;

    public o0(l l8) {
        this.s = l8;
    }

    @Override
    public void v(Throwable throwable) {
        if (t.compareAndSet((Object)this, 0, 1)) {
            this.s.invoke((Object)throwable);
        }
    }
}

