/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.k4;
import android.net.Uri;

public final class o4
implements Runnable {
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Uri p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ k4 s;

    public o4(k4 k42, boolean bl, Uri uri, String string2, String string3) {
        this.s = k42;
        this.o = bl;
        this.p = uri;
        this.q = string2;
        this.r = string3;
    }

    public final void run() {
        k4.a(this.s, this.o, this.p, this.q, this.r);
    }
}

