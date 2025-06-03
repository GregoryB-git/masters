/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package y1;

import y1.L;

public final class K
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;

    public /* synthetic */ K(String string2, String string3) {
        this.o = string2;
        this.p = string3;
    }

    public final void run() {
        L.a(this.o, this.p);
    }
}

