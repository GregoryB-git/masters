/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 */
package M5;

import E5.d;
import M5.e;
import java.util.ArrayList;

public final class d
implements Runnable {
    public final /* synthetic */ d.b o;
    public final /* synthetic */ ArrayList p;

    public /* synthetic */ d(d.b b8, ArrayList arrayList) {
        this.o = b8;
        this.p = arrayList;
    }

    public final void run() {
        e.c(this.o, this.p);
    }
}

