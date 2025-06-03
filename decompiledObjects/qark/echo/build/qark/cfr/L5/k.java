/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 */
package L5;

import L5.w;
import java.util.Map;

public final class k
implements Runnable {
    public final /* synthetic */ w o;
    public final /* synthetic */ Map p;
    public final /* synthetic */ V2.k q;

    public /* synthetic */ k(w w8, Map map, V2.k k8) {
        this.o = w8;
        this.p = map;
        this.q = k8;
    }

    public final void run() {
        w.h(this.o, this.p, this.q);
    }
}

