/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package C3;

import C3.o;
import C3.p;
import java.util.concurrent.Callable;

public final class k
implements Callable {
    public final /* synthetic */ o o;
    public final /* synthetic */ Callable p;
    public final /* synthetic */ p.b q;

    public /* synthetic */ k(o o8, Callable callable, p.b b8) {
        this.o = o8;
        this.p = callable;
        this.q = b8;
    }

    public final Object call() {
        return o.g(this.o, this.p, this.q);
    }
}

