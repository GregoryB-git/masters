/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Map
 *  java.util.concurrent.Callable
 */
package N5;

import N5.h;
import java.util.Map;
import java.util.concurrent.Callable;

public final class g
implements Callable {
    public final /* synthetic */ h o;
    public final /* synthetic */ Map p;

    public /* synthetic */ g(h h8, Map map) {
        this.o = h8;
        this.p = map;
    }

    public final Object call() {
        return h.g(this.o, this.p);
    }
}

