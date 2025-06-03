/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package V5;

import V5.n;
import kotlin.jvm.internal.Intrinsics;

public abstract class o {
    public static final Object a(Throwable throwable) {
        Intrinsics.checkNotNullParameter((Object)throwable, "exception");
        return new n.b(throwable);
    }

    public static final void b(Object object) {
        if (!(object instanceof n.b)) {
            return;
        }
        throw ((n.b)object).o;
    }
}

