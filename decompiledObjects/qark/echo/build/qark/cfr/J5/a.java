/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package J5;

import J5.i;
import V2.k;

public final class a
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ k p;

    public /* synthetic */ a(String string2, k k8) {
        this.o = string2;
        this.p = k8;
    }

    public final void run() {
        i.k(this.o, this.p);
    }
}

