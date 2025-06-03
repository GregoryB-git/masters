/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package g2;

import U5.a;
import android.content.Context;
import g2.i;
import g2.k;
import h2.b;

public final class l
implements b {
    public final a a;
    public final a b;

    public l(a a8, a a9) {
        this.a = a8;
        this.b = a9;
    }

    public static l a(a a8, a a9) {
        return new l(a8, a9);
    }

    public static k c(Context context, Object object) {
        return new k(context, (i)object);
    }

    public k b() {
        return l.c((Context)this.a.get(), this.b.get());
    }
}

