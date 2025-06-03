/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package x2;

import java.util.concurrent.Callable;
import x2.A;
import x2.E;

public final class v
implements Callable {
    public final /* synthetic */ boolean o;
    public final /* synthetic */ String p;
    public final /* synthetic */ A q;

    public /* synthetic */ v(boolean bl, String string2, A a8) {
        this.o = bl;
        this.p = string2;
        this.q = a8;
    }

    public final Object call() {
        return E.c(this.o, this.p, this.q);
    }
}

