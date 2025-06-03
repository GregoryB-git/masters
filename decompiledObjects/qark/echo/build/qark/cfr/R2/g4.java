/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.C3;

public final class g4
implements Runnable {
    public final /* synthetic */ Boolean o;
    public final /* synthetic */ C3 p;

    public g4(C3 c32, Boolean bl) {
        this.p = c32;
        this.o = bl;
    }

    public final void run() {
        C3.M(this.p, this.o, true);
    }
}

