/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 */
package x1;

import java.util.ArrayList;
import x1.F;
import x1.J;

public final class H
implements Runnable {
    public final /* synthetic */ ArrayList o;
    public final /* synthetic */ J p;

    public /* synthetic */ H(ArrayList arrayList, J j8) {
        this.o = arrayList;
        this.p = j8;
    }

    public final void run() {
        F.c.a(this.o, this.p);
    }
}

