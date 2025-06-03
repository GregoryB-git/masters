/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 */
package p0;

import p0.v;

public final class p
implements Runnable {
    public final /* synthetic */ v.a o;
    public final /* synthetic */ v p;
    public final /* synthetic */ Exception q;

    public /* synthetic */ p(v.a a8, v v8, Exception exception) {
        this.o = a8;
        this.p = v8;
        this.q = exception;
    }

    public final void run() {
        v.a.e(this.o, this.p, this.q);
    }
}

