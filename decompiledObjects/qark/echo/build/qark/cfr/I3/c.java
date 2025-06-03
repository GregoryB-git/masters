/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package I3;

import I3.a;
import I3.f;
import M3.g;
import java.io.File;

public class c {
    public static final b c = new b(null);
    public final g a;
    public a b;

    public c(g g8) {
        this.a = g8;
        this.b = c;
    }

    public c(g g8, String string2) {
        this(g8);
        this.e(string2);
    }

    public void a() {
        this.b.d();
    }

    public byte[] b() {
        return this.b.c();
    }

    public String c() {
        return this.b.b();
    }

    public final File d(String string2) {
        return this.a.o(string2, "userlog");
    }

    public final void e(String string2) {
        this.b.a();
        this.b = c;
        if (string2 == null) {
            return;
        }
        this.f(this.d(string2), 65536);
    }

    public void f(File file, int n8) {
        this.b = new f(file, n8);
    }

    public void g(long l8, String string2) {
        this.b.e(l8, string2);
    }

    public static final class b
    implements a {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public void a() {
        }

        @Override
        public String b() {
            return null;
        }

        @Override
        public byte[] c() {
            return null;
        }

        @Override
        public void d() {
        }

        @Override
        public void e(long l8, String string2) {
        }
    }

}

