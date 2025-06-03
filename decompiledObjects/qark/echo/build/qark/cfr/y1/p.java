/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.util.Arrays
 *  java.util.Currency
 */
package y1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import y1.L;
import y1.d;
import y1.s;

public final class p {
    public static final a b = new a(null);
    public static final String c = p.class.getCanonicalName();
    public final s a;

    public p(Context context, String string2, x1.a a8) {
        this.a = new s(context, string2, a8);
    }

    public /* synthetic */ p(Context context, String string2, x1.a a8, g g8) {
        this(context, string2, a8);
    }

    public final void a() {
        this.a.j();
    }

    public final String b() {
        return this.a.k();
    }

    public final void c(String string2) {
        this.a.l(string2);
    }

    public final void d(String string2, double d8) {
        this.a.m(string2, d8);
    }

    public final void e(String string2, double d8, Bundle bundle) {
        this.a.n(string2, d8, bundle);
    }

    public final void f(String string2, Bundle bundle) {
        this.a.o(string2, bundle);
    }

    public final void g(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        this.a.t(bigDecimal, currency, bundle);
    }

    public final void h(Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)bundle, "payload");
        this.a.w(bundle, null);
    }

    public final void i(Bundle bundle, String string2) {
        Intrinsics.checkNotNullParameter((Object)bundle, "payload");
        this.a.w(bundle, string2);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a(Application application, String string2) {
            Intrinsics.checkNotNullParameter((Object)application, "application");
            s.c.f(application, string2);
        }

        public final void b() {
            L.d();
        }

        public final void c() {
            d.g(null);
        }

        public final String d(Context context) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            return s.c.i(context);
        }

        public final b e() {
            return s.c.j();
        }

        public final String f() {
            return d.c();
        }

        public final void g(Context context, String string2) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            s.c.m(context, string2);
        }

        public final p h(Context context) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            return new p(context, null, null, null);
        }

        public final void i() {
            s.c.s();
        }

        public final void j(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
            L.n(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11);
        }

        public final void k(String string2) {
            d.g(string2);
        }
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o = new b();
        public static final /* enum */ b p = new b();
        public static final /* synthetic */ b[] q;

        static {
            q = b.c();
        }

        public static final /* synthetic */ b[] c() {
            return new b[]{o, p};
        }

        public static b valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            b[] arrb = q;
            return (b[])Arrays.copyOf((Object[])arrb, (int)arrb.length);
        }
    }

}

