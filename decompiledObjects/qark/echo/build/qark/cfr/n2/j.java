/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package n2;

import h2.b;
import h2.d;
import n2.e;
import n2.f;

public final class j
implements b {
    public static j a() {
        return a;
    }

    public static e c() {
        return (e)d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public e b() {
        return j.c();
    }

    public static final abstract class a {
        public static final j a = new j();
    }

}

