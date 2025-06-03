/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 */
package l5;

import E5.k;
import com.ryanheise.audioservice.a;
import java.util.Map;

public final class k
implements Runnable {
    public final /* synthetic */ a.c o;
    public final /* synthetic */ Map p;
    public final /* synthetic */ k.d q;

    public /* synthetic */ k(a.c c8, Map map, k.d d8) {
        this.o = c8;
        this.p = map;
        this.q = d8;
    }

    public final void run() {
        a.c.O(this.o, this.p, this.q);
    }
}

