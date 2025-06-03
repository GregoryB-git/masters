/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package P;

import P.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class j
extends n {
    public final Throwable a;

    public j(Throwable throwable) {
        Intrinsics.checkNotNullParameter((Object)throwable, "readException");
        super(null);
        this.a = throwable;
    }

    public final Throwable a() {
        return this.a;
    }
}

