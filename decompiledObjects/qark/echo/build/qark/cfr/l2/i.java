/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package l2;

import U5.a;
import android.content.Context;
import h2.b;
import l2.h;
import m2.f;
import m2.x;
import n2.d;

public final class i
implements b {
    public final a a;
    public final a b;
    public final a c;
    public final a d;

    public i(a a8, a a9, a a10, a a11) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
    }

    public static i a(a a8, a a9, a a10, a a11) {
        return new i(a8, a9, a10, a11);
    }

    public static x c(Context context, d d8, f f8, p2.a a8) {
        return (x)h2.d.c(h.a(context, d8, f8, a8), "Cannot return null from a non-@Nullable @Provides method");
    }

    public x b() {
        return i.c((Context)this.a.get(), (d)this.b.get(), (f)this.c.get(), (p2.a)this.d.get());
    }
}

