/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 */
package p6;

import X5.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.z;

public final class p
extends z {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(p.class, (String)"_resumed");
    private volatile int _resumed;

    public p(d d8, Throwable throwable, boolean bl) {
        Throwable throwable2 = throwable;
        if (throwable == null) {
            throwable = new StringBuilder();
            throwable.append("Continuation ");
            throwable.append((Object)d8);
            throwable.append(" was cancelled normally");
            throwable2 = new CancellationException(throwable.toString());
        }
        super(throwable2, bl);
        this._resumed = 0;
    }

    public final boolean c() {
        return c.compareAndSet((Object)this, 0, 1);
    }
}

