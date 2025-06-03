/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Set
 */
package y2;

import A2.c;
import A2.i;
import A2.n;
import android.content.Context;
import android.os.Looper;
import java.util.Set;
import y2.e;
import z2.j;

public final class a {
    public final a a;
    public final g b;
    public final String c;

    public a(String string2, a a8, g g8) {
        n.j(a8, "Cannot construct an Api with a null ClientBuilder");
        n.j(g8, "Cannot construct an Api with a null ClientKey");
        this.c = string2;
        this.a = a8;
        this.b = g8;
    }

    public final a a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public static abstract class a
    extends e {
        public f a(Context context, Looper looper, A2.d d8, Object object, e.a a8, e.b b8) {
            return this.b(context, looper, d8, object, a8, b8);
        }

        public f b(Context context, Looper looper, A2.d d8, Object object, z2.d d9, j j8) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public static interface b {
    }

    public static abstract class c {
    }

    public static interface d {
    }

    public static abstract class e {
    }

    public static interface f
    extends b {
        public boolean a();

        public void b(c.e var1);

        public void c();

        public Set e();

        public void f(String var1);

        public boolean g();

        public int h();

        public boolean i();

        public x2.d[] j();

        public String k();

        public String l();

        public boolean m();

        public void o(i var1, Set var2);

        public void p(c.c var1);
    }

    public static final class g
    extends c {
    }

}

