package x1;

import O1.C0438a;
import O1.C0458v;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import y1.C2237F;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public static final X f20996a = new X();

    /* renamed from: b, reason: collision with root package name */
    public static final String f20997b = X.class.getName();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f20998c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f20999d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final a f21000e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f, reason: collision with root package name */
    public static final a f21001f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g, reason: collision with root package name */
    public static final a f21002g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h, reason: collision with root package name */
    public static final a f21003h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i, reason: collision with root package name */
    public static final a f21004i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j, reason: collision with root package name */
    public static SharedPreferences f21005j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21006a;

        /* renamed from: b, reason: collision with root package name */
        public String f21007b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f21008c;

        /* renamed from: d, reason: collision with root package name */
        public long f21009d;

        public a(boolean z7, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f21006a = z7;
            this.f21007b = key;
        }

        public final boolean a() {
            return this.f21006a;
        }

        public final String b() {
            return this.f21007b;
        }

        public final long c() {
            return this.f21009d;
        }

        public final Boolean d() {
            return this.f21008c;
        }

        public final boolean e() {
            Boolean bool = this.f21008c;
            return bool == null ? this.f21006a : bool.booleanValue();
        }

        public final void f(long j7) {
            this.f21009d = j7;
        }

        public final void g(Boolean bool) {
            this.f21008c = bool;
        }
    }

    public static final boolean d() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            f20996a.j();
            return f21002g.e();
        } catch (Throwable th) {
            T1.a.b(th, X.class);
            return false;
        }
    }

    public static final boolean e() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            f20996a.j();
            return f21000e.e();
        } catch (Throwable th) {
            T1.a.b(th, X.class);
            return false;
        }
    }

    public static final boolean f() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            X x7 = f20996a;
            x7.j();
            return x7.b();
        } catch (Throwable th) {
            T1.a.b(th, X.class);
            return false;
        }
    }

    public static final boolean g() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            f20996a.j();
            return f21003h.e();
        } catch (Throwable th) {
            T1.a.b(th, X.class);
            return false;
        }
    }

    public static final void i(long j7) {
        if (T1.a.d(X.class)) {
            return;
        }
        try {
            if (f21002g.e()) {
                C0458v c0458v = C0458v.f3949a;
                O1.r q7 = C0458v.q(C2146B.m(), false);
                if (q7 != null && q7.b()) {
                    C0438a e7 = C0438a.f3802f.e(C2146B.l());
                    String h7 = (e7 == null || e7.h() == null) ? null : e7.h();
                    if (h7 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", h7);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        F x7 = F.f20890n.x(null, "app", null);
                        x7.G(bundle);
                        JSONObject c7 = x7.k().c();
                        if (c7 != null) {
                            a aVar = f21003h;
                            aVar.g(Boolean.valueOf(c7.optBoolean("auto_event_setup_enabled", false)));
                            aVar.f(j7);
                            f20996a.u(aVar);
                        }
                    }
                }
            }
            f20999d.set(false);
        } catch (Throwable th) {
            T1.a.b(th, X.class);
        }
    }

    public static final void n() {
        if (T1.a.d(X.class)) {
            return;
        }
        try {
            Context l7 = C2146B.l();
            ApplicationInfo applicationInfo = l7.getPackageManager().getApplicationInfo(l7.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            C2237F c2237f = new C2237F(l7);
            Bundle bundle2 = new Bundle();
            if (!O1.P.U()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f20997b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            c2237f.d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            T1.a.b(th, X.class);
        }
    }

    public static final Boolean q() {
        SharedPreferences sharedPreferences;
        String str = "";
        if (T1.a.d(X.class)) {
            return null;
        }
        try {
            f20996a.t();
            try {
                sharedPreferences = f21005j;
            } catch (JSONException e7) {
                O1.P p7 = O1.P.f3756a;
                O1.P.i0(f20997b, e7);
            }
            if (sharedPreferences == null) {
                Intrinsics.n("userSettingPref");
                throw null;
            }
            String string = sharedPreferences.getString(f21001f.b(), "");
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, X.class);
            return null;
        }
    }

    public static final void s(boolean z7) {
        if (T1.a.d(X.class)) {
            return;
        }
        try {
            a aVar = f21001f;
            aVar.g(Boolean.valueOf(z7));
            aVar.f(System.currentTimeMillis());
            if (f20998c.get()) {
                f20996a.u(aVar);
            } else {
                f20996a.j();
            }
        } catch (Throwable th) {
            T1.a.b(th, X.class);
        }
    }

    public final boolean b() {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            Map g7 = C0458v.g();
            if (g7 != null && !g7.isEmpty()) {
                Boolean bool = (Boolean) g7.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) g7.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean c7 = c();
                if (c7 != null) {
                    return c7.booleanValue();
                }
                if (bool2 == null) {
                    return true;
                }
                return bool2.booleanValue();
            }
            return f21001f.e();
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final Boolean c() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Boolean q7 = q();
            if (q7 != null) {
                return q7;
            }
            Boolean l7 = l();
            if (l7 == null) {
                return null;
            }
            return l7;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            a aVar = f21003h;
            r(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.d() == null || currentTimeMillis - aVar.c() >= 604800000) {
                aVar.g(null);
                aVar.f(0L);
                if (f20999d.compareAndSet(false, true)) {
                    C2146B.t().execute(new Runnable() { // from class: x1.W
                        @Override // java.lang.Runnable
                        public final void run() {
                            X.i(currentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void j() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (C2146B.F() && f20998c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = C2146B.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                f21005j = sharedPreferences;
                k(f21001f, f21002g, f21000e);
                h();
                p();
                o();
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void k(a... aVarArr) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            int length = aVarArr.length;
            int i7 = 0;
            while (i7 < length) {
                a aVar = aVarArr[i7];
                i7++;
                if (aVar == f21003h) {
                    h();
                } else if (aVar.d() == null) {
                    r(aVar);
                    if (aVar.d() == null) {
                        m(aVar);
                    }
                } else {
                    u(aVar);
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final Boolean l() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            t();
            try {
                Context l7 = C2146B.l();
                ApplicationInfo applicationInfo = l7.getPackageManager().getApplicationInfo(l7.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = f21001f;
                    if (bundle.containsKey(aVar.b())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e7) {
                O1.P p7 = O1.P.f3756a;
                O1.P.i0(f20997b, e7);
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void m(a aVar) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            t();
            try {
                Context l7 = C2146B.l();
                ApplicationInfo applicationInfo = l7.getPackageManager().getApplicationInfo(l7.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(aVar.b())) {
                    return;
                }
                aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
            } catch (PackageManager.NameNotFoundException e7) {
                O1.P p7 = O1.P.f3756a;
                O1.P.i0(f20997b, e7);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void o() {
        int i7;
        int i8;
        ApplicationInfo applicationInfo;
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (f20998c.get() && C2146B.F()) {
                Context l7 = C2146B.l();
                int i9 = 0;
                int i10 = (f21000e.e() ? 1 : 0) | ((f21001f.e() ? 1 : 0) << 1) | ((f21002g.e() ? 1 : 0) << 2) | ((f21004i.e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f21005j;
                if (sharedPreferences == null) {
                    Intrinsics.n("userSettingPref");
                    throw null;
                }
                int i11 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i11 != i10) {
                    SharedPreferences sharedPreferences2 = f21005j;
                    if (sharedPreferences2 == null) {
                        Intrinsics.n("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i10).apply();
                    try {
                        applicationInfo = l7.getPackageManager().getApplicationInfo(l7.getPackageName(), 128);
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                    } catch (PackageManager.NameNotFoundException unused) {
                        i7 = 0;
                    }
                    if (applicationInfo.metaData == null) {
                        i8 = 0;
                        C2237F c2237f = new C2237F(l7);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i9);
                        bundle.putInt("initial", i8);
                        bundle.putInt("previous", i11);
                        bundle.putInt("current", i10);
                        c2237f.b(bundle);
                    }
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    i7 = 0;
                    i8 = 0;
                    while (true) {
                        int i12 = i9 + 1;
                        try {
                            i7 |= (applicationInfo.metaData.containsKey(strArr[i9]) ? 1 : 0) << i9;
                            i8 |= (applicationInfo.metaData.getBoolean(strArr[i9], zArr[i9]) ? 1 : 0) << i9;
                            if (i12 > 3) {
                                break;
                            } else {
                                i9 = i12;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i9 = i8;
                            i8 = i9;
                            i9 = i7;
                            C2237F c2237f2 = new C2237F(l7);
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("usage", i9);
                            bundle2.putInt("initial", i8);
                            bundle2.putInt("previous", i11);
                            bundle2.putInt("current", i10);
                            c2237f2.b(bundle2);
                        }
                    }
                    i9 = i7;
                    C2237F c2237f22 = new C2237F(l7);
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("usage", i9);
                    bundle22.putInt("initial", i8);
                    bundle22.putInt("previous", i11);
                    bundle22.putInt("current", i10);
                    c2237f22.b(bundle22);
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void p() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Context l7 = C2146B.l();
            ApplicationInfo applicationInfo = l7.getPackageManager().getApplicationInfo(l7.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f20997b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (d()) {
                    return;
                }
                Log.w(f20997b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void r(a aVar) {
        String str = "";
        if (T1.a.d(this)) {
            return;
        }
        try {
            t();
            try {
                SharedPreferences sharedPreferences = f21005j;
                if (sharedPreferences == null) {
                    Intrinsics.n("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e7) {
                O1.P p7 = O1.P.f3756a;
                O1.P.i0(f20997b, e7);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void t() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (f20998c.get()) {
            } else {
                throw new C2147C("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void u(a aVar) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            t();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = f21005j;
                if (sharedPreferences == null) {
                    Intrinsics.n("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                o();
            } catch (Exception e7) {
                O1.P p7 = O1.P.f3756a;
                O1.P.i0(f20997b, e7);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
