/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReferenceArray
 */
package y6;

import X5.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import u6.C;
import y6.e;

public final class f
extends C {
    public final AtomicReferenceArray s = new AtomicReferenceArray(e.f());

    public f(long l8, f f8, int n8) {
        super(l8, f8, n8);
    }

    @Override
    public int n() {
        return e.f();
    }

    @Override
    public void o(int n8, Throwable object, g g8) {
        object = e.c();
        this.r().set(n8, object);
        this.p();
    }

    public final AtomicReferenceArray r() {
        return this.s;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SemaphoreSegment[id=");
        stringBuilder.append(this.q);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(this.hashCode());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

