/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 */
package K5;

import K5.n;
import V2.k;
import java.util.Map;

public final class c
implements Runnable {
    public final /* synthetic */ Map o;
    public final /* synthetic */ k p;

    public /* synthetic */ c(Map map, k k8) {
        this.o = map;
        this.p = k8;
    }

    public final void run() {
        n.f(this.o, this.p);
    }
}

