/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 */
package m0;

import m0.x;

public final class p
implements Runnable {
    public final /* synthetic */ x.a o;
    public final /* synthetic */ Exception p;

    public /* synthetic */ p(x.a a8, Exception exception) {
        this.o = a8;
        this.p = exception;
    }

    public final void run() {
        x.a.j(this.o, this.p);
    }
}

