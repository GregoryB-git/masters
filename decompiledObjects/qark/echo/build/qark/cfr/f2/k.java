/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package f2;

import f2.j;
import h2.b;
import h2.d;
import java.util.concurrent.Executor;

public final class k
implements b {
    public static k a() {
        return a;
    }

    public static Executor b() {
        return (Executor)d.c((Object)j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Executor c() {
        return k.b();
    }

    public static final abstract class a {
        public static final k a = new k();
    }

}

