/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.I;
import R2.R2;

public final class e3
implements Runnable {
    public final /* synthetic */ I o;
    public final /* synthetic */ String p;
    public final /* synthetic */ R2 q;

    public e3(R2 r22, I i8, String string2) {
        this.q = r22;
        this.o = i8;
        this.p = string2;
    }

    public final void run() {
        R2.o(this.q).o0();
        R2.o(this.q).r(this.o, this.p);
    }
}

