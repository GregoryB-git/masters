/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package V3;

import T3.d;
import V3.f;

public final class e
implements Runnable {
    public final /* synthetic */ d.a o;
    public final /* synthetic */ String p;

    public /* synthetic */ e(d.a a8, String string2) {
        this.o = a8;
        this.p = string2;
    }

    public final void run() {
        f.b(this.o, this.p);
    }
}

