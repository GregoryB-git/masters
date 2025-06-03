/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package n2;

import U5.a;
import android.content.Context;
import h2.b;
import n2.U;

public final class V
implements b {
    public final a a;
    public final a b;
    public final a c;

    public V(a a8, a a9, a a10) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
    }

    public static V a(a a8, a a9, a a10) {
        return new V(a8, a9, a10);
    }

    public static U c(Context context, String string2, int n8) {
        return new U(context, string2, n8);
    }

    public U b() {
        return V.c((Context)this.a.get(), (String)this.b.get(), (Integer)this.c.get());
    }
}

