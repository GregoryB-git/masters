/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package G1;

import G1.f;

public final class e
implements Runnable {
    public final /* synthetic */ long o;
    public final /* synthetic */ String p;

    public /* synthetic */ e(long l8, String string2) {
        this.o = l8;
        this.p = string2;
    }

    public final void run() {
        f.b(this.o, this.p);
    }
}

