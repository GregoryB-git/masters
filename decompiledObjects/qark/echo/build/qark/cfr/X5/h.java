/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package X5;

import X5.g;
import g6.p;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class h
implements g,
Serializable {
    public static final h o = new h();
    private static final long serialVersionUID = 0L;

    private final Object readResolve() {
        return o;
    }

    @Override
    public g.b b(g.c c8) {
        Intrinsics.checkNotNullParameter(c8, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override
    public g k(g g8) {
        Intrinsics.checkNotNullParameter(g8, "context");
        return g8;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override
    public Object u(Object object, p p8) {
        Intrinsics.checkNotNullParameter(p8, "operation");
        return object;
    }

    @Override
    public g x(g.c c8) {
        Intrinsics.checkNotNullParameter(c8, "key");
        return this;
    }
}

