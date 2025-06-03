package y1;

import O1.C0451n;
import O1.C0454q;
import O1.C0458v;
import O1.P;
import O1.Q;
import O1.y;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.C2148a;
import x1.C2162o;
import x1.N;
import y1.C2259p;
import y1.C2262s;

/* renamed from: y1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2262s {

    /* renamed from: c, reason: collision with root package name */
    public static final a f21401c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f21402d;

    /* renamed from: e, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f21403e;

    /* renamed from: f, reason: collision with root package name */
    public static C2259p.b f21404f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f21405g;

    /* renamed from: h, reason: collision with root package name */
    public static String f21406h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f21407i;

    /* renamed from: j, reason: collision with root package name */
    public static String f21408j;

    /* renamed from: a, reason: collision with root package name */
    public final String f21409a;

    /* renamed from: b, reason: collision with root package name */
    public C2244a f21410b;

    /* renamed from: y1.s$a */
    public static final class a {

        /* renamed from: y1.s$a$a, reason: collision with other inner class name */
        public static final class C0300a implements y.a {
            @Override // O1.y.a
            public void a(String str) {
                C2262s.f21401c.t(str);
            }
        }

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static final void n(Context context, C2262s logger) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = i7 + 1;
                String str = strArr[i7];
                String str2 = strArr2[i7];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i8 |= 1 << i7;
                } catch (ClassNotFoundException unused) {
                }
                if (i9 > 10) {
                    break;
                } else {
                    i7 = i9;
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i8) {
                sharedPreferences.edit().putInt("kitsBitmask", i8).apply();
                logger.r("fb_sdk_initialize", null, bundle);
            }
        }

        public static final void p() {
            HashSet hashSet = new HashSet();
            Iterator it = C2257n.p().iterator();
            while (it.hasNext()) {
                hashSet.add(((C2244a) it.next()).b());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C0458v.q((String) it2.next(), true);
            }
        }

        public final void f(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (!C2146B.F()) {
                throw new C2162o("The Facebook sdk must be initialized before calling activateApp");
            }
            C2247d.e();
            C2243L.i();
            if (str == null) {
                str = C2146B.m();
            }
            C2146B.K(application, str);
            G1.f.x(application, str);
        }

        public final void g() {
            if (j() != C2259p.b.EXPLICIT_ONLY) {
                C2257n c2257n = C2257n.f21384a;
                C2257n.l(EnumC2234C.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor h() {
            if (C2262s.b() == null) {
                o();
            }
            ScheduledThreadPoolExecutor b7 = C2262s.b();
            if (b7 != null) {
                return b7;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String i(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C2262s.a() == null) {
                synchronized (C2262s.e()) {
                    try {
                        if (C2262s.a() == null) {
                            C2262s.h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (C2262s.a() == null) {
                                UUID randomUUID = UUID.randomUUID();
                                Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
                                C2262s.h(Intrinsics.i("XZ", randomUUID));
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C2262s.a()).apply();
                            }
                        }
                        V5.t tVar = V5.t.f6803a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            String a7 = C2262s.a();
            if (a7 != null) {
                return a7;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final C2259p.b j() {
            C2259p.b c7;
            synchronized (C2262s.e()) {
                c7 = C2262s.c();
            }
            return c7;
        }

        public final String k() {
            O1.y yVar = O1.y.f3967a;
            O1.y.d(new C0300a());
            return C2146B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final String l() {
            String d7;
            synchronized (C2262s.e()) {
                d7 = C2262s.d();
            }
            return d7;
        }

        public final void m(final Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C2146B.p()) {
                final C2262s c2262s = new C2262s(context, str, (C2148a) null);
                ScheduledThreadPoolExecutor b7 = C2262s.b();
                if (b7 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                b7.execute(new Runnable() { // from class: y1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2262s.a.n(context, c2262s);
                    }
                });
            }
        }

        public final void o() {
            synchronized (C2262s.e()) {
                if (C2262s.b() != null) {
                    return;
                }
                C2262s.i(new ScheduledThreadPoolExecutor(1));
                V5.t tVar = V5.t.f6803a;
                Runnable runnable = new Runnable() { // from class: y1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2262s.a.p();
                    }
                };
                ScheduledThreadPoolExecutor b7 = C2262s.b();
                if (b7 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                b7.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        public final void q(C2248e c2248e, C2244a c2244a) {
            C2257n.g(c2244a, c2248e);
            C0451n c0451n = C0451n.f3862a;
            if (C0451n.g(C0451n.b.OnDevicePostInstallEventProcessing) && I1.c.d()) {
                I1.c.e(c2244a.b(), c2248e);
            }
            if (c2248e.c() || C2262s.f()) {
                return;
            }
            if (Intrinsics.a(c2248e.f(), "fb_mobile_activate_app")) {
                C2262s.g(true);
            } else {
                O1.C.f3715e.b(N.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        public final void r(String str) {
            O1.C.f3715e.b(N.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void s() {
            C2257n.s();
        }

        public final void t(String str) {
            SharedPreferences sharedPreferences = C2146B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }
    }

    static {
        String canonicalName = C2262s.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f21402d = canonicalName;
        f21404f = C2259p.b.AUTO;
        f21405g = new Object();
    }

    public C2262s(Context context, String str, C2148a c2148a) {
        this(P.t(context), str, c2148a);
    }

    public static final /* synthetic */ String a() {
        if (T1.a.d(C2262s.class)) {
            return null;
        }
        try {
            return f21406h;
        } catch (Throwable th) {
            T1.a.b(th, C2262s.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (T1.a.d(C2262s.class)) {
            return null;
        }
        try {
            return f21403e;
        } catch (Throwable th) {
            T1.a.b(th, C2262s.class);
            return null;
        }
    }

    public static final /* synthetic */ C2259p.b c() {
        if (T1.a.d(C2262s.class)) {
            return null;
        }
        try {
            return f21404f;
        } catch (Throwable th) {
            T1.a.b(th, C2262s.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (T1.a.d(C2262s.class)) {
            return null;
        }
        try {
            return f21408j;
        } catch (Throwable th) {
            T1.a.b(th, C2262s.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (T1.a.d(C2262s.class)) {
            return null;
        }
        try {
            return f21405g;
        } catch (Throwable th) {
            T1.a.b(th, C2262s.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (T1.a.d(C2262s.class)) {
            return false;
        }
        try {
            return f21407i;
        } catch (Throwable th) {
            T1.a.b(th, C2262s.class);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z7) {
        if (T1.a.d(C2262s.class)) {
            return;
        }
        try {
            f21407i = z7;
        } catch (Throwable th) {
            T1.a.b(th, C2262s.class);
        }
    }

    public static final /* synthetic */ void h(String str) {
        if (T1.a.d(C2262s.class)) {
            return;
        }
        try {
            f21406h = str;
        } catch (Throwable th) {
            T1.a.b(th, C2262s.class);
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (T1.a.d(C2262s.class)) {
            return;
        }
        try {
            f21403e = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            T1.a.b(th, C2262s.class);
        }
    }

    public final void j() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            C2257n c2257n = C2257n.f21384a;
            C2257n.l(EnumC2234C.EXPLICIT);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final String k() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.f21410b.b();
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void l(String str) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            o(str, null);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void m(String str, double d7) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            n(str, d7, null);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void n(String str, double d7, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            p(str, Double.valueOf(d7), bundle, false, G1.f.m());
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void o(String str, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            p(str, null, bundle, false, G1.f.m());
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void p(String str, Double d7, Bundle bundle, boolean z7, UUID uuid) {
        if (T1.a.d(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            C0454q c0454q = C0454q.f3908a;
            if (C0454q.d("app_events_killswitch", C2146B.m(), false)) {
                O1.C.f3715e.c(N.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                F1.b.h(bundle, str);
                F1.c.e(bundle);
                f21401c.q(new C2248e(this.f21409a, str, d7, bundle, z7, G1.f.o(), uuid), this.f21410b);
            } catch (JSONException e7) {
                O1.C.f3715e.c(N.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e7.toString());
            } catch (C2162o e8) {
                O1.C.f3715e.c(N.APP_EVENTS, "AppEvents", "Invalid app event: %s", e8.toString());
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void q(String str, String str2) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            o(str, bundle);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void r(String str, Double d7, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            p(str, d7, bundle, true, G1.f.m());
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void s(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                P p7 = P.f3756a;
                P.j0(f21402d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            p(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, G1.f.m());
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void t(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (G1.i.c()) {
                Log.w(f21402d, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
            }
            u(bigDecimal, currency, bundle, false);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void u(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z7) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f21401c.r("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f21401c.r("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            p("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z7, G1.f.m());
            f21401c.g();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void v(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            u(bigDecimal, currency, bundle, true);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void w(Bundle payload, String str) {
        String str2;
        String string;
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                string = payload.getString("fb_push_payload");
            } catch (JSONException unused) {
                str2 = null;
            }
            if (P.c0(string)) {
                return;
            }
            str2 = new JSONObject(string).getString("campaign");
            if (str2 == null) {
                O1.C.f3715e.b(N.DEVELOPER_ERRORS, f21402d, "Malformed payload specified for logging a push notification open.");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_push_campaign", str2);
            if (str != null) {
                bundle.putString("fb_push_action", str);
            }
            o("fb_mobile_push_opened", bundle);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public C2262s(String activityName, String str, C2148a c2148a) {
        C2244a c2244a;
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Q.l();
        this.f21409a = activityName;
        c2148a = c2148a == null ? C2148a.f21014z.e() : c2148a;
        if (c2148a == null || c2148a.n() || !(str == null || Intrinsics.a(str, c2148a.c()))) {
            if (str == null) {
                P p7 = P.f3756a;
                str = P.J(C2146B.l());
            }
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            c2244a = new C2244a(null, str);
        } else {
            c2244a = new C2244a(c2148a);
        }
        this.f21410b = c2244a;
        f21401c.o();
    }
}
