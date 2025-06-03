/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.List
 */
package A1;

import A1.g;
import java.util.List;

public final class h
implements Runnable {
    public final /* synthetic */ Integer o;
    public final /* synthetic */ List p;

    public /* synthetic */ h(Integer n8, List list) {
        this.o = n8;
        this.p = list;
    }

    public final void run() {
        g.a(this.o, this.p);
    }
}

