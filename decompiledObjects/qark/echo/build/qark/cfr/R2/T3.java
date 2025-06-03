/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.C3;

public final class T3
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ long r;
    public final /* synthetic */ C3 s;

    public T3(C3 c32, String string2, String string3, Object object, long l8) {
        this.s = c32;
        this.o = string2;
        this.p = string3;
        this.q = object;
        this.r = l8;
    }

    public final void run() {
        this.s.a0(this.o, this.p, this.q, this.r);
    }
}

