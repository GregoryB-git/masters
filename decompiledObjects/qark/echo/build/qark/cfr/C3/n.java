/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Callable
 */
package C3;

import C3.o;
import C3.p;
import java.util.concurrent.Callable;

public final class n
implements Runnable {
    public final /* synthetic */ Callable o;
    public final /* synthetic */ p.b p;

    public /* synthetic */ n(Callable callable, p.b b8) {
        this.o = callable;
        this.p = b8;
    }

    public final void run() {
        o.d(this.o, this.p);
    }
}

