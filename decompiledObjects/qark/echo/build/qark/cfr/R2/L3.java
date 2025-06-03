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
import R2.S1;

public final class L3
implements Runnable {
    public /* synthetic */ C3 o;
    public /* synthetic */ String p;

    public /* synthetic */ L3(C3 c32, String string2) {
        this.o = c32;
        this.p = string2;
    }

    public final void run() {
        C3 c32 = this.o;
        String string2 = this.p;
        if (c32.p().K(string2)) {
            c32.p().I();
        }
    }
}

