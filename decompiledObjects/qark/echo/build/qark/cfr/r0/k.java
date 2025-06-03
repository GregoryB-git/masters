/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.IOException
 *  java.lang.Object
 */
package r0;

import B0.m;
import android.net.Uri;
import java.io.IOException;
import r0.f;
import r0.g;
import r0.j;
import x0.E;

public interface k {
    public boolean a();

    public g b();

    public boolean c(Uri var1, long var2);

    public boolean d(Uri var1);

    public void e(Uri var1, E.a var2, e var3);

    public void f();

    public void g(Uri var1);

    public void h(Uri var1);

    public void i(Uri var1);

    public void j(b var1);

    public f k(Uri var1, boolean var2);

    public void l(b var1);

    public long m();

    public void stop();

    public static interface a {
        public k a(q0.g var1, m var2, j var3);
    }

    public static interface b {
        public void a();

        public boolean e(Uri var1, m.c var2, boolean var3);
    }

    public static final class c
    extends IOException {
        public final Uri o;

        public c(Uri uri) {
            this.o = uri;
        }
    }

    public static final class d
    extends IOException {
        public final Uri o;

        public d(Uri uri) {
            this.o = uri;
        }
    }

    public static interface e {
        public void b(f var1);
    }

}

