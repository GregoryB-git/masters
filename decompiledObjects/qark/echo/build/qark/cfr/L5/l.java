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
import V2.k;
import java.util.Map;

public final class l
implements Runnable {
    public final /* synthetic */ w o;
    public final /* synthetic */ Map p;
    public final /* synthetic */ k q;

    public /* synthetic */ l(w w8, Map map, k k8) {
        this.o = w8;
        this.p = map;
        this.q = k8;
    }

    public final void run() {
        w.m(this.o, this.p, this.q);
    }
}

