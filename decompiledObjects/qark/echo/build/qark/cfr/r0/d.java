/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.Runnable
 */
package r0;

import android.net.Uri;
import r0.c;

public final class d
implements Runnable {
    public final /* synthetic */ c.c o;
    public final /* synthetic */ Uri p;

    public /* synthetic */ d(c.c c8, Uri uri) {
        this.o = c8;
        this.p = uri;
    }

    public final void run() {
        c.c.a(this.o, this.p);
    }
}

