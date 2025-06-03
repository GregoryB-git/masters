/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicReferenceArray
 */
package u6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import l6.d;
import org.jetbrains.annotations.NotNull;

public final class A {
    @NotNull
    private volatile AtomicReferenceArray<Object> array;

    public A(int n8) {
        this.array = new AtomicReferenceArray(n8);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int n8) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (n8 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(n8);
        }
        return null;
    }

    public final void c(int n8, Object object) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int n9 = atomicReferenceArray.length();
        if (n8 < n9) {
            atomicReferenceArray.set(n8, object);
            return;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(d.a(n8 + 1, n9 * 2));
        for (int i8 = 0; i8 < n9; ++i8) {
            atomicReferenceArray2.set(i8, atomicReferenceArray.get(i8));
        }
        atomicReferenceArray2.set(n8, object);
        this.array = atomicReferenceArray2;
    }
}

