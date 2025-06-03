/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package V3;

import V3.x;
import a4.i;
import java.util.concurrent.Callable;

public final class w
implements Callable {
    public final /* synthetic */ x o;
    public final /* synthetic */ i p;

    public /* synthetic */ w(x x8, i i8) {
        this.o = x8;
        this.p = i8;
    }

    public final Object call() {
        return x.a(this.o, this.p);
    }
}

