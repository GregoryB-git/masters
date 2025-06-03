/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicReference
 */
package t0;

import java.util.concurrent.atomic.AtomicReference;

public abstract class f {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object object, Object object2) {
        do {
            if (!atomicReference.compareAndSet(object, object2)) continue;
            return true;
        } while (atomicReference.get() == object);
        return false;
    }
}

