/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package Q4;

import E2.d;
import Q4.l;
import com.google.firebase.remoteconfig.internal.b;

public final class k
implements Runnable {
    public final /* synthetic */ d o;
    public final /* synthetic */ String p;
    public final /* synthetic */ b q;

    public /* synthetic */ k(d d8, String string2, b b8) {
        this.o = d8;
        this.p = string2;
        this.q = b8;
    }

    public final void run() {
        l.a(this.o, this.p, this.q);
    }
}

