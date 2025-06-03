package y1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;
import x1.C2148a;

/* renamed from: y1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2259p {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21393b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f21394c = C2259p.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    public final C2262s f21395a;

    /* renamed from: y1.p$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            C2262s.f21401c.f(application, str);
        }

        public final void b() {
            C2243L.d();
        }

        public final void c() {
            C2247d.g(null);
        }

        public final String d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return C2262s.f21401c.i(context);
        }

        public final b e() {
            return C2262s.f21401c.j();
        }

        public final String f() {
            return C2247d.c();
        }

        public final void g(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            C2262s.f21401c.m(context, str);
        }

        public final C2259p h(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C2259p(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void i() {
            C2262s.f21401c.s();
        }

        public final void j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            C2243L.n(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        public final void k(String str) {
            C2247d.g(str);
        }
    }

    /* renamed from: y1.p$b */
    public enum b {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public C2259p(Context context, String str, C2148a c2148a) {
        this.f21395a = new C2262s(context, str, c2148a);
    }

    public final void a() {
        this.f21395a.j();
    }

    public final String b() {
        return this.f21395a.k();
    }

    public final void c(String str) {
        this.f21395a.l(str);
    }

    public final void d(String str, double d7) {
        this.f21395a.m(str, d7);
    }

    public final void e(String str, double d7, Bundle bundle) {
        this.f21395a.n(str, d7, bundle);
    }

    public final void f(String str, Bundle bundle) {
        this.f21395a.o(str, bundle);
    }

    public final void g(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        this.f21395a.t(bigDecimal, currency, bundle);
    }

    public final void h(Bundle payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f21395a.w(payload, null);
    }

    public final void i(Bundle payload, String str) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f21395a.w(payload, str);
    }

    public /* synthetic */ C2259p(Context context, String str, C2148a c2148a, kotlin.jvm.internal.g gVar) {
        this(context, str, c2148a);
    }
}
