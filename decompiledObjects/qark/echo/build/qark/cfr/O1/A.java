/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package O1;

import O1.B;
import java.util.concurrent.Callable;

public final class A
implements Callable {
    public final /* synthetic */ B o;
    public final /* synthetic */ Callable p;

    public /* synthetic */ A(B b8, Callable callable) {
        this.o = b8;
        this.p = callable;
    }

    public final Object call() {
        return B.a(this.o, this.p);
    }
}

