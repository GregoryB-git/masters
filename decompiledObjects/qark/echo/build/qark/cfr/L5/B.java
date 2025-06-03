/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 */
package L5;

import L5.C;
import java.util.Map;

public final class B
implements Runnable {
    public final /* synthetic */ C o;
    public final /* synthetic */ Map p;

    public /* synthetic */ B(C c8, Map map) {
        this.o = c8;
        this.p = map;
    }

    public final void run() {
        C.a(this.o, this.p);
    }
}

