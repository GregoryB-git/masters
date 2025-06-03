/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 */
package I5;

import I5.n;
import V2.k;
import java.util.Map;

public final class c
implements Runnable {
    public final /* synthetic */ n o;
    public final /* synthetic */ Map p;
    public final /* synthetic */ k q;

    public /* synthetic */ c(n n8, Map map, k k8) {
        this.o = n8;
        this.p = map;
        this.q = k8;
    }

    public final void run() {
        n.e(this.o, this.p, this.q);
    }
}

