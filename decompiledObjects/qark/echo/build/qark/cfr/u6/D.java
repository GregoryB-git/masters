/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package u6;

import kotlin.jvm.internal.Intrinsics;
import u6.C;
import u6.d;

public abstract class D {
    public static Object a(Object object) {
        return object;
    }

    public static final C b(Object object) {
        if (object != d.a()) {
            Intrinsics.c(object, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (C)object;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object object) {
        if (object == d.a()) {
            return true;
        }
        return false;
    }
}

