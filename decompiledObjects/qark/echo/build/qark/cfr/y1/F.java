/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.util.Currency
 *  java.util.Map
 *  java.util.concurrent.Executor
 */
package y1;

import android.content.Context;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.B;
import y1.L;
import y1.p;
import y1.s;

public final class F {
    public static final a b = new a(null);
    public final s a;

    public F(Context context) {
        this(new s(context, null, null));
    }

    public F(Context context, String string2) {
        this(new s(context, string2, null));
    }

    public F(String string2, String string3, x1.a a8) {
        Intrinsics.checkNotNullParameter(string2, "activityName");
        this(new s(string2, string3, a8));
    }

    public F(s s8) {
        Intrinsics.checkNotNullParameter(s8, "loggerImpl");
        this.a = s8;
    }

    public final void a() {
        this.a.j();
    }

    public final void b(Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)bundle, "parameters");
        boolean bl = (bundle.getInt("previous") & 2) != 0;
        if (bl || B.p()) {
            this.a.r("fb_sdk_settings_changed", null, bundle);
        }
    }

    public final void c(String string2, double d8, Bundle bundle) {
        if (B.p()) {
            this.a.n(string2, d8, bundle);
        }
    }

    public final void d(String string2, Bundle bundle) {
        if (B.p()) {
            this.a.o(string2, bundle);
        }
    }

    public final void e(String string2, String string3) {
        this.a.q(string2, string3);
    }

    public final void f(String string2) {
        if (B.p()) {
            this.a.r(string2, null, null);
        }
    }

    public final void g(String string2, Bundle bundle) {
        if (B.p()) {
            this.a.r(string2, null, bundle);
        }
    }

    public final void h(String string2, Double d8, Bundle bundle) {
        if (B.p()) {
            this.a.r(string2, d8, bundle);
        }
    }

    public final void i(String string2, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (B.p()) {
            this.a.s(string2, bigDecimal, currency, bundle);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (B.p()) {
            this.a.v(bigDecimal, currency, bundle);
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final F a(String string2, String string3, x1.a a8) {
            Intrinsics.checkNotNullParameter(string2, "activityName");
            return new F(string2, string3, a8);
        }

        public final Executor b() {
            return s.c.h();
        }

        public final p.b c() {
            return s.c.j();
        }

        public final String d() {
            return s.c.l();
        }

        public final void e(Map map) {
            Intrinsics.checkNotNullParameter((Object)map, "ud");
            L.l(map);
        }
    }

}

