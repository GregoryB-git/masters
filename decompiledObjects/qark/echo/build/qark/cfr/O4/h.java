/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package O4;

import B3.c;
import B3.e;
import B3.r;
import O4.f;
import O4.g;
import android.content.Context;

public abstract class h {
    public static /* synthetic */ f a(String string2, a a8, e e8) {
        return h.d(string2, a8, e8);
    }

    public static c b(String string2, String string3) {
        return c.l(f.a(string2, string3), f.class);
    }

    public static c c(String string2, a a8) {
        return c.m(f.class).b(r.k(Context.class)).f(new g(string2, a8)).d();
    }

    public static /* synthetic */ f d(String string2, a a8, e e8) {
        return f.a(string2, a8.a((Object)((Context)e8.a(Context.class))));
    }

    public static interface a {
        public String a(Object var1);
    }

}

