/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 */
package D0;

import D0.E;

public final class z
implements Runnable {
    public final /* synthetic */ E.a o;
    public final /* synthetic */ Exception p;

    public /* synthetic */ z(E.a a8, Exception exception) {
        this.o = a8;
        this.p = exception;
    }

    public final void run() {
        E.a.b(this.o, this.p);
    }
}

