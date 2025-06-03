/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package i5;

import i5.e;

public final class d
implements Runnable {
    public final /* synthetic */ e.a o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ Object r;

    public /* synthetic */ d(e.a a8, String string2, String string3, Object object) {
        this.o = a8;
        this.p = string2;
        this.q = string3;
        this.r = object;
    }

    public final void run() {
        e.a.e(this.o, this.p, this.q, this.r);
    }
}

