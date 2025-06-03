/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package s4;

import java.util.concurrent.Callable;
import s4.h;

public final class g
implements Callable {
    public final /* synthetic */ h o;

    public /* synthetic */ g(h h8) {
        this.o = h8;
    }

    public final Object call() {
        return h.c(this.o);
    }
}

