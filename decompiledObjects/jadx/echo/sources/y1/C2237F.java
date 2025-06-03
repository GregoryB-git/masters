package y1;

import android.content.Context;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import x1.C2148a;
import y1.C2259p;

/* renamed from: y1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2237F {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21324b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C2262s f21325a;

    /* renamed from: y1.F$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C2237F a(String activityName, String str, C2148a c2148a) {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            return new C2237F(activityName, str, c2148a);
        }

        public final Executor b() {
            return C2262s.f21401c.h();
        }

        public final C2259p.b c() {
            return C2262s.f21401c.j();
        }

        public final String d() {
            return C2262s.f21401c.l();
        }

        public final void e(Map ud) {
            Intrinsics.checkNotNullParameter(ud, "ud");
            C2243L.l(ud);
        }
    }

    public C2237F(Context context) {
        this(new C2262s(context, (String) null, (C2148a) null));
    }

    public final void a() {
        this.f21325a.j();
    }

    public final void b(Bundle parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (((parameters.getInt("previous") & 2) != 0) || C2146B.p()) {
            this.f21325a.r("fb_sdk_settings_changed", null, parameters);
        }
    }

    public final void c(String str, double d7, Bundle bundle) {
        if (C2146B.p()) {
            this.f21325a.n(str, d7, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (C2146B.p()) {
            this.f21325a.o(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.f21325a.q(str, str2);
    }

    public final void f(String str) {
        if (C2146B.p()) {
            this.f21325a.r(str, null, null);
        }
    }

    public final void g(String str, Bundle bundle) {
        if (C2146B.p()) {
            this.f21325a.r(str, null, bundle);
        }
    }

    public final void h(String str, Double d7, Bundle bundle) {
        if (C2146B.p()) {
            this.f21325a.r(str, d7, bundle);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C2146B.p()) {
            this.f21325a.s(str, bigDecimal, currency, bundle);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C2146B.p()) {
            this.f21325a.v(bigDecimal, currency, bundle);
        }
    }

    public C2237F(Context context, String str) {
        this(new C2262s(context, str, (C2148a) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2237F(String activityName, String str, C2148a c2148a) {
        this(new C2262s(activityName, str, c2148a));
        Intrinsics.checkNotNullParameter(activityName, "activityName");
    }

    public C2237F(C2262s loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.f21325a = loggerImpl;
    }
}
