/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.CopyOnWriteArraySet
 */
package g0;

import g0.n;
import java.util.concurrent.CopyOnWriteArraySet;

public final class m
implements Runnable {
    public final /* synthetic */ CopyOnWriteArraySet o;
    public final /* synthetic */ int p;
    public final /* synthetic */ n.a q;

    public /* synthetic */ m(CopyOnWriteArraySet copyOnWriteArraySet, int n8, n.a a8) {
        this.o = copyOnWriteArraySet;
        this.p = n8;
        this.q = a8;
    }

    public final void run() {
        n.a(this.o, this.p, this.q);
    }
}

