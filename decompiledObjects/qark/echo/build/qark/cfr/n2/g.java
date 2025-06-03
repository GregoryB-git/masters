/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package n2;

import h2.b;
import h2.d;
import n2.f;

public final class g
implements b {
    public static g a() {
        return a;
    }

    public static String b() {
        return (String)d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public String c() {
        return g.b();
    }

    public static final abstract class a {
        public static final g a = new g();
    }

}

