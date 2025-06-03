/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Locale
 */
package F4;

import F4.c;
import java.util.Locale;

public class a {
    public static volatile a c;
    public final c a;
    public boolean b = false;

    public a() {
        this(null);
    }

    public a(c c8) {
        c c9 = c8;
        if (c8 == null) {
            c9 = c.c();
        }
        this.a = c9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a e() {
        if (c != null) return c;
        synchronized (a.class) {
            try {
                if (c != null) return c;
                c = new a();
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void a(String string2) {
        if (this.b) {
            this.a.a(string2);
        }
    }

    public /* varargs */ void b(String string2, Object ... arrobject) {
        if (this.b) {
            this.a.a(String.format((Locale)Locale.ENGLISH, (String)string2, (Object[])arrobject));
        }
    }

    public void c(String string2) {
        if (this.b) {
            this.a.b(string2);
        }
    }

    public /* varargs */ void d(String string2, Object ... arrobject) {
        if (this.b) {
            this.a.b(String.format((Locale)Locale.ENGLISH, (String)string2, (Object[])arrobject));
        }
    }

    public void f(String string2) {
        if (this.b) {
            this.a.d(string2);
        }
    }

    public /* varargs */ void g(String string2, Object ... arrobject) {
        if (this.b) {
            this.a.d(String.format((Locale)Locale.ENGLISH, (String)string2, (Object[])arrobject));
        }
    }

    public boolean h() {
        return this.b;
    }

    public void i(boolean bl) {
        this.b = bl;
    }

    public void j(String string2) {
        if (this.b) {
            this.a.e(string2);
        }
    }

    public /* varargs */ void k(String string2, Object ... arrobject) {
        if (this.b) {
            this.a.e(String.format((Locale)Locale.ENGLISH, (String)string2, (Object[])arrobject));
        }
    }
}

