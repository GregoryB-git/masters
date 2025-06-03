/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package J5;

import J5.i;
import V2.k;

public final class e
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ Boolean p;
    public final /* synthetic */ k q;

    public /* synthetic */ e(String string2, Boolean bl, k k8) {
        this.o = string2;
        this.p = bl;
        this.q = k8;
    }

    public final void run() {
        i.i(this.o, this.p, this.q);
    }
}

