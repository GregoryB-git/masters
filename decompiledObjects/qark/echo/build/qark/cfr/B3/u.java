/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 *  java.util.Map$Entry
 */
package B3;

import B3.v;
import java.util.Map;
import n4.a;

public final class u
implements Runnable {
    public final /* synthetic */ Map.Entry o;
    public final /* synthetic */ a p;

    public /* synthetic */ u(Map.Entry entry, a a8) {
        this.o = entry;
        this.p = a8;
    }

    public final void run() {
        v.e(this.o, this.p);
    }
}

