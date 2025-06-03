/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package C3;

import C3.b;

public final class a
implements Runnable {
    public final /* synthetic */ b o;
    public final /* synthetic */ Runnable p;

    public /* synthetic */ a(b b8, Runnable runnable) {
        this.o = b8;
        this.p = runnable;
    }

    public final void run() {
        b.a(this.o, this.p);
    }
}

