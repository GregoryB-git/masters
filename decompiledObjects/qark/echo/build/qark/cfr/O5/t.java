/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 */
package O5;

import O5.x;
import V2.k;
import java.util.Map;

public final class t
implements Runnable {
    public final /* synthetic */ Map o;
    public final /* synthetic */ k p;

    public /* synthetic */ t(Map map, k k8) {
        this.o = map;
        this.p = k8;
    }

    public final void run() {
        x.a(this.o, this.p);
    }
}

