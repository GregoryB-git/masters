/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicReferenceArray
 */
package r6;

import java.util.concurrent.atomic.AtomicReferenceArray;

public abstract class h {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int n8, Object object, Object object2) {
        do {
            if (!atomicReferenceArray.compareAndSet(n8, object, object2)) continue;
            return true;
        } while (atomicReferenceArray.get(n8) == object);
        return false;
    }
}

