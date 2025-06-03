package x1;

import G1.h;
import O1.C0438a;
import O1.C0439b;
import O1.C0451n;
import O1.C0458v;
import W5.C0681k;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.F;
import x1.O;
import y1.C2233B;
import y1.C2259p;

/* renamed from: x1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2146B {

    /* renamed from: a, reason: collision with root package name */
    public static final C2146B f20862a = new C2146B();

    /* renamed from: b, reason: collision with root package name */
    public static final String f20863b = C2146B.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f20864c;

    /* renamed from: d, reason: collision with root package name */
    public static Executor f20865d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile String f20866e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile String f20867f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile String f20868g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Boolean f20869h;

    /* renamed from: i, reason: collision with root package name */
    public static AtomicLong f20870i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f20871j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f20872k;

    /* renamed from: l, reason: collision with root package name */
    public static O1.B f20873l;

    /* renamed from: m, reason: collision with root package name */
    public static Context f20874m;

    /* renamed from: n, reason: collision with root package name */
    public static int f20875n;

    /* renamed from: o, reason: collision with root package name */
    public static final ReentrantLock f20876o;

    /* renamed from: p, reason: collision with root package name */
    public static String f20877p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f20878q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f20879r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f20880s;

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicBoolean f20881t;

    /* renamed from: u, reason: collision with root package name */
    public static volatile String f20882u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile String f20883v;

    /* renamed from: w, reason: collision with root package name */
    public static a f20884w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f20885x;

    /* renamed from: x1.B$a */
    public interface a {
        F a(C2148a c2148a, String str, JSONObject jSONObject, F.b bVar);
    }

    /* renamed from: x1.B$b */
    public interface b {
        void a();
    }

    static {
        HashSet c7;
        c7 = W5.K.c(N.DEVELOPER_ERRORS);
        f20864c = c7;
        f20870i = new AtomicLong(65536L);
        f20875n = 64206;
        f20876o = new ReentrantLock();
        f20877p = O1.H.a();
        f20881t = new AtomicBoolean(false);
        f20882u = "instagram.com";
        f20883v = "facebook.com";
        f20884w = new a() { // from class: x1.s
            @Override // x1.C2146B.a
            public final F a(C2148a c2148a, String str, JSONObject jSONObject, F.b bVar) {
                F C7;
                C7 = C2146B.C(c2148a, str, jSONObject, bVar);
                return C7;
            }
        };
    }

    public static final long A() {
        O1.Q.l();
        return f20870i.get();
    }

    public static final String B() {
        return "16.3.0";
    }

    public static final F C(C2148a c2148a, String str, JSONObject jSONObject, F.b bVar) {
        return F.f20890n.A(c2148a, str, jSONObject, bVar);
    }

    public static final boolean D() {
        return f20871j;
    }

    public static final synchronized boolean E() {
        boolean z7;
        synchronized (C2146B.class) {
            z7 = f20885x;
        }
        return z7;
    }

    public static final boolean F() {
        return f20881t.get();
    }

    public static final boolean G() {
        return f20872k;
    }

    public static final boolean H(N behavior) {
        boolean z7;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet hashSet = f20864c;
        synchronized (hashSet) {
            if (D()) {
                z7 = hashSet.contains(behavior);
            }
        }
        return z7;
    }

    public static final void I(Context context) {
        boolean s7;
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f20866e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    s7 = kotlin.text.r.s(lowerCase, "fb", false, 2, null);
                    if (s7) {
                        str = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).substring(startIndex)");
                    }
                    f20866e = str;
                } else if (obj instanceof Number) {
                    throw new C2162o("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f20867f == null) {
                f20867f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f20868g == null) {
                f20868g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f20875n == 64206) {
                f20875n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f20869h == null) {
                f20869h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final void K(Context context, final String applicationId) {
        if (T1.a.d(C2146B.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            t().execute(new Runnable() { // from class: x1.A
                @Override // java.lang.Runnable
                public final void run() {
                    C2146B.L(applicationContext, applicationId);
                }
            });
            C0451n c0451n = C0451n.f3862a;
            if (C0451n.g(C0451n.b.OnDeviceEventProcessing) && I1.c.d()) {
                I1.c.g(applicationId, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th) {
            T1.a.b(th, C2146B.class);
        }
    }

    public static final void L(Context applicationContext, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationContext, "$applicationContext");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        f20862a.J(applicationContext, applicationId);
    }

    public static final synchronized void M(Context applicationContext) {
        synchronized (C2146B.class) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            N(applicationContext, null);
        }
    }

    public static final synchronized void N(Context applicationContext, final b bVar) {
        synchronized (C2146B.class) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            AtomicBoolean atomicBoolean = f20881t;
            if (atomicBoolean.get()) {
                if (bVar != null) {
                    bVar.a();
                }
                return;
            }
            O1.Q.e(applicationContext, false);
            O1.Q.f(applicationContext, false);
            Context applicationContext2 = applicationContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext.applicationContext");
            f20874m = applicationContext2;
            C2259p.f21393b.d(applicationContext);
            Context context = f20874m;
            if (context == null) {
                Intrinsics.n("applicationContext");
                throw null;
            }
            I(context);
            String str = f20866e;
            if (str == null || str.length() == 0) {
                throw new C2162o("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            String str2 = f20868g;
            if (str2 == null || str2.length() == 0) {
                throw new C2162o("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            atomicBoolean.set(true);
            if (o()) {
                j();
            }
            Context context2 = f20874m;
            if (context2 == null) {
                Intrinsics.n("applicationContext");
                throw null;
            }
            if ((context2 instanceof Application) && X.f()) {
                G1.f fVar = G1.f.f2029a;
                Context context3 = f20874m;
                if (context3 == null) {
                    Intrinsics.n("applicationContext");
                    throw null;
                }
                G1.f.x((Application) context3, f20866e);
            }
            C0458v.h();
            O1.E.x();
            C0439b.a aVar = C0439b.f3814b;
            Context context4 = f20874m;
            if (context4 == null) {
                Intrinsics.n("applicationContext");
                throw null;
            }
            aVar.a(context4);
            f20873l = new O1.B(new Callable() { // from class: x1.t
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File O6;
                    O6 = C2146B.O();
                    return O6;
                }
            });
            C0451n c0451n = C0451n.f3862a;
            C0451n.a(C0451n.b.Instrument, new C0451n.a() { // from class: x1.u
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2146B.P(z7);
                }
            });
            C0451n.a(C0451n.b.AppEvents, new C0451n.a() { // from class: x1.v
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2146B.Q(z7);
                }
            });
            C0451n.a(C0451n.b.ChromeCustomTabsPrefetching, new C0451n.a() { // from class: x1.w
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2146B.R(z7);
                }
            });
            C0451n.a(C0451n.b.IgnoreAppSwitchToLoggedOut, new C0451n.a() { // from class: x1.x
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2146B.S(z7);
                }
            });
            C0451n.a(C0451n.b.BypassAppSwitch, new C0451n.a() { // from class: x1.y
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2146B.T(z7);
                }
            });
            t().execute(new FutureTask(new Callable(bVar) { // from class: x1.z
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void U6;
                    U6 = C2146B.U(null);
                    return U6;
                }
            }));
        }
    }

    public static final File O() {
        Context context = f20874m;
        if (context != null) {
            return context.getCacheDir();
        }
        Intrinsics.n("applicationContext");
        throw null;
    }

    public static final void P(boolean z7) {
        if (z7) {
            Q1.g.d();
        }
    }

    public static final void Q(boolean z7) {
        if (z7) {
            C2233B.a();
        }
    }

    public static final void R(boolean z7) {
        if (z7) {
            f20878q = true;
        }
    }

    public static final void S(boolean z7) {
        if (z7) {
            f20879r = true;
        }
    }

    public static final void T(boolean z7) {
        if (z7) {
            f20880s = true;
        }
    }

    public static final Void U(b bVar) {
        C2154g.f21044f.e().j();
        Q.f20972d.a().d();
        if (C2148a.f21014z.g()) {
            O.b bVar2 = O.f20961v;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        C2259p.a aVar = C2259p.f21393b;
        aVar.g(l(), f20866e);
        X.n();
        Context applicationContext = l().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext().applicationContext");
        aVar.h(applicationContext).a();
        return null;
    }

    public static final void V(boolean z7) {
        X.s(z7);
        if (z7) {
            Application application = (Application) l();
            G1.f fVar = G1.f.f2029a;
            G1.f.x(application, m());
        }
    }

    public static final void W(String[] strArr, int i7, int i8) {
        List u7;
        if (T1.a.d(C2146B.class)) {
            return;
        }
        if (strArr == null) {
            try {
                strArr = new String[0];
            } catch (Throwable th) {
                T1.a.b(th, C2146B.class);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            u7 = C0681k.u(strArr);
            jSONObject.put("data_processing_options", new JSONArray((Collection) u7));
            jSONObject.put("data_processing_options_country", i7);
            jSONObject.put("data_processing_options_state", i8);
            Context context = f20874m;
            if (context != null) {
                context.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
            } else {
                Intrinsics.n("applicationContext");
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    public static final void j() {
        f20885x = true;
    }

    public static final boolean k() {
        return X.d();
    }

    public static final Context l() {
        O1.Q.l();
        Context context = f20874m;
        if (context != null) {
            return context;
        }
        Intrinsics.n("applicationContext");
        throw null;
    }

    public static final String m() {
        O1.Q.l();
        String str = f20866e;
        if (str != null) {
            return str;
        }
        throw new C2162o("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        O1.Q.l();
        return f20867f;
    }

    public static final boolean o() {
        return X.e();
    }

    public static final boolean p() {
        return X.f();
    }

    public static final int q() {
        O1.Q.l();
        return f20875n;
    }

    public static final String r() {
        O1.Q.l();
        String str = f20868g;
        if (str != null) {
            return str;
        }
        throw new C2162o("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        return X.g();
    }

    public static final Executor t() {
        ReentrantLock reentrantLock = f20876o;
        reentrantLock.lock();
        try {
            if (f20865d == null) {
                f20865d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            V5.t tVar = V5.t.f6803a;
            reentrantLock.unlock();
            Executor executor = f20865d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String u() {
        return f20883v;
    }

    public static final String v() {
        return "fb.gg";
    }

    public static final String w() {
        O1.P p7 = O1.P.f3756a;
        String str = f20863b;
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f20877p}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        O1.P.j0(str, format);
        return f20877p;
    }

    public static final String x() {
        C2148a e7 = C2148a.f21014z.e();
        return O1.P.E(e7 != null ? e7.h() : null);
    }

    public static final String y() {
        return f20882u;
    }

    public static final boolean z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        O1.Q.l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public final void J(Context context, String str) {
        try {
            if (T1.a.d(this)) {
                return;
            }
            try {
                C0438a e7 = C0438a.f3802f.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String i7 = Intrinsics.i(str, "ping");
                long j7 = sharedPreferences.getLong(i7, 0L);
                try {
                    G1.h hVar = G1.h.f2042a;
                    JSONObject a7 = G1.h.a(h.a.MOBILE_INSTALL_EVENT, e7, C2259p.f21393b.d(context), z(context), context);
                    kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                    String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    F a8 = f20884w.a(null, format, a7, null);
                    if (j7 == 0 && a8.k().b() == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(i7, System.currentTimeMillis());
                        edit.apply();
                    }
                } catch (JSONException e8) {
                    throw new C2162o("An error occurred while publishing install.", e8);
                }
            } catch (Exception e9) {
                O1.P.i0("Facebook-publish", e9);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
