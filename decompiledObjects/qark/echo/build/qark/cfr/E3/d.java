/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.atomic.AtomicReference
 */
package E3;

import E3.a;
import E3.c;
import E3.f;
import E3.g;
import J3.B;
import J3.D;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import r4.a;

public final class d
implements a {
    public static final g c = new b(null);
    public final r4.a a;
    public final AtomicReference b = new AtomicReference((Object)null);

    public d(r4.a a8) {
        this.a = a8;
        a8.a(new E3.b(this));
    }

    public static /* synthetic */ void e(String string2, String string3, long l8, D d8, r4.b b8) {
        d.h(string2, string3, l8, d8, b8);
    }

    public static /* synthetic */ void f(d d8, r4.b b8) {
        d8.g(b8);
    }

    public static /* synthetic */ void h(String string2, String string3, long l8, D d8, r4.b b8) {
        ((a)b8.get()).c(string2, string3, l8, d8);
    }

    @Override
    public g a(String string2) {
        a a8 = (a)this.b.get();
        if (a8 == null) {
            return c;
        }
        return a8.a(string2);
    }

    @Override
    public boolean b() {
        a a8 = (a)this.b.get();
        if (a8 != null && a8.b()) {
            return true;
        }
        return false;
    }

    @Override
    public void c(String string2, String string3, long l8, D d8) {
        f f8 = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Deferring native open session: ");
        stringBuilder.append(string2);
        f8.i(stringBuilder.toString());
        this.a.a(new c(string2, string3, l8, d8));
    }

    @Override
    public boolean d(String string2) {
        a a8 = (a)this.b.get();
        if (a8 != null && a8.d(string2)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void g(r4.b b8) {
        f.f().b("Crashlytics native component now available.");
        this.b.set((Object)((a)b8.get()));
    }

    public static final class b
    implements g {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public File a() {
            return null;
        }

        @Override
        public File b() {
            return null;
        }

        @Override
        public File c() {
            return null;
        }

        @Override
        public B.a d() {
            return null;
        }

        @Override
        public File e() {
            return null;
        }

        @Override
        public File f() {
            return null;
        }

        @Override
        public File g() {
            return null;
        }
    }

}

