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
import java.util.Map;

public final class k
implements Runnable {
    public final /* synthetic */ n o;
    public final /* synthetic */ Map p;
    public final /* synthetic */ V2.k q;

    public /* synthetic */ k(n n8, Map map, V2.k k8) {
        this.o = n8;
        this.p = map;
        this.q = k8;
    }

    public final void run() {
        n.l(this.o, this.p, this.q);
    }
}

