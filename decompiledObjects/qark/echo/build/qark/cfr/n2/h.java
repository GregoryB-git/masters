/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package n2;

import U5.a;
import android.content.Context;
import h2.b;
import h2.d;
import n2.f;

public final class h
implements b {
    public final a a;

    public h(a a8) {
        this.a = a8;
    }

    public static h a(a a8) {
        return new h(a8);
    }

    public static String c(Context context) {
        return (String)d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public String b() {
        return h.c((Context)this.a.get());
    }
}

