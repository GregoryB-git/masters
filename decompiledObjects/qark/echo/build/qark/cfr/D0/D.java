/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package D0;

import D0.E;

public final class D
implements Runnable {
    public final /* synthetic */ E.a o;
    public final /* synthetic */ String p;

    public /* synthetic */ D(E.a a8, String string2) {
        this.o = a8;
        this.p = string2;
    }

    public final void run() {
        E.a.i(this.o, this.p);
    }
}

