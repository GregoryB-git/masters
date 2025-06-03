/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Runnable
 */
package Y1;

import Y1.c;
import Y1.u;
import android.os.Bundle;

public final class b
implements Runnable {
    public final /* synthetic */ c o;
    public final /* synthetic */ u.e p;
    public final /* synthetic */ Bundle q;

    public /* synthetic */ b(c c8, u.e e8, Bundle bundle) {
        this.o = c8;
        this.p = e8;
        this.q = bundle;
    }

    public final void run() {
        c.x(this.o, this.p, this.q);
    }
}

