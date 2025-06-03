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
import h2.b;

public final class j
implements b {
    public final a a;
    public final a b;
    public final a c;

    public j(a a8, a a9, a a10) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
    }

    public static j a(a a8, a a9, a a10) {
        return new j(a8, a9, a10);
    }

    public static i c(Context context, p2.a a8, p2.a a9) {
        return new i(context, a8, a9);
    }

    public i b() {
        return j.c((Context)this.a.get(), (p2.a)this.b.get(), (p2.a)this.c.get());
    }
}

