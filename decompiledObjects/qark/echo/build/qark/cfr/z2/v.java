/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package z2;

import z2.w;
import z2.x;

public final class v
implements Runnable {
    public final /* synthetic */ w o;

    public v(w w8) {
        this.o = w8;
    }

    public final void run() {
        x x8 = this.o.a;
        x.s(x8).f(x.s(x8).getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

