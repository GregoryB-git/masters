/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import R2.C3;
import R2.D4;
import R2.N2;
import R2.m3;
import java.util.concurrent.atomic.AtomicReference;

public final class a4
implements Runnable {
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ C3 t;

    public a4(C3 c32, AtomicReference atomicReference, String string2, String string3, String string4, boolean bl) {
        this.t = c32;
        this.o = atomicReference;
        this.p = null;
        this.q = string3;
        this.r = string4;
        this.s = bl;
    }

    public final void run() {
        this.t.a.J().T(this.o, null, this.q, this.r, this.s);
    }
}

