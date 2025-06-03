/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 */
package D5;

import E5.a;
import E5.c;
import E5.i;
import E5.r;
import java.util.Locale;

public class k {
    public b a = null;
    public b b = null;
    public boolean c = true;
    public final a d;

    public k(a a8) {
        this.d = a8;
    }

    public k(w5.a a8) {
        this(new a(a8, "flutter/lifecycle", r.b));
    }

    public void a() {
        this.g(this.a, true);
    }

    public void b() {
        this.g(b.o, this.c);
    }

    public void c() {
        this.g(b.q, this.c);
    }

    public void d() {
        this.g(b.s, this.c);
    }

    public void e() {
        this.g(b.p, this.c);
    }

    public void f() {
        this.g(this.a, false);
    }

    public final void g(b object, boolean bl) {
        b b8 = this.a;
        if (b8 == object && bl == this.c) {
            return;
        }
        if (object == null && b8 == null) {
            this.c = bl;
            return;
        }
        int n8 = .a[object.ordinal()];
        b8 = n8 != 1 ? (n8 != 2 && n8 != 3 && n8 != 4 && n8 != 5 ? null : object) : (bl ? b.p : b.q);
        this.a = object;
        this.c = bl;
        if (b8 == this.b) {
            return;
        }
        object = new StringBuilder();
        object.append("AppLifecycleState.");
        object.append(b8.name().toLowerCase(Locale.ROOT));
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending ");
        stringBuilder.append((String)object);
        stringBuilder.append(" message.");
        t5.b.f("LifecycleChannel", stringBuilder.toString());
        this.d.c(object);
        this.b = b8;
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o = new b();
        public static final /* enum */ b p = new b();
        public static final /* enum */ b q = new b();
        public static final /* enum */ b r = new b();
        public static final /* enum */ b s = new b();
        public static final /* synthetic */ b[] t;

        static {
            t = b.c();
        }

        public static /* synthetic */ b[] c() {
            return new b[]{o, p, q, r, s};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])t.clone();
        }
    }

}

