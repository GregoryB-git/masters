/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package X5;

import X5.g;
import g6.l;
import kotlin.jvm.internal.Intrinsics;

public abstract class b
implements g.c {
    public final l o;
    public final g.c p;

    public b(g.c c8, l object) {
        Intrinsics.checkNotNullParameter(c8, "baseKey");
        Intrinsics.checkNotNullParameter(object, "safeCast");
        this.o = object;
        object = c8;
        if (c8 instanceof b) {
            object = ((b)c8).p;
        }
        this.p = object;
    }

    public final boolean a(g.c c8) {
        Intrinsics.checkNotNullParameter(c8, "key");
        if (c8 != this && this.p != c8) {
            return false;
        }
        return true;
    }

    public final g.b b(g.b b8) {
        Intrinsics.checkNotNullParameter(b8, "element");
        return (g.b)this.o.invoke(b8);
    }
}

