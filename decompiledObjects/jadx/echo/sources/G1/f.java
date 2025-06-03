package G1;

import O1.C;
import O1.C0451n;
import O1.C0458v;
import O1.P;
import O1.r;
import V5.t;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import x1.N;
import y1.C2259p;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2029a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final String f2030b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f2031c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile ScheduledFuture f2032d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2033e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f2034f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile m f2035g;

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f2036h;

    /* renamed from: i, reason: collision with root package name */
    public static String f2037i;

    /* renamed from: j, reason: collision with root package name */
    public static long f2038j;

    /* renamed from: k, reason: collision with root package name */
    public static int f2039k;

    /* renamed from: l, reason: collision with root package name */
    public static WeakReference f2040l;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C.f3715e.b(N.APP_EVENTS, f.f2030b, "onActivityCreated");
            g.a();
            f.p(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C.f3715e.b(N.APP_EVENTS, f.f2030b, "onActivityDestroyed");
            f.f2029a.r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C.f3715e.b(N.APP_EVENTS, f.f2030b, "onActivityPaused");
            g.a();
            f.f2029a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C.f3715e.b(N.APP_EVENTS, f.f2030b, "onActivityResumed");
            g.a();
            f.v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            C.f3715e.b(N.APP_EVENTS, f.f2030b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            f.f2039k++;
            C.f3715e.b(N.APP_EVENTS, f.f2030b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C.f3715e.b(N.APP_EVENTS, f.f2030b, "onActivityStopped");
            C2259p.f21393b.i();
            f.f2039k--;
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f2030b = canonicalName;
        f2031c = Executors.newSingleThreadScheduledExecutor();
        f2033e = new Object();
        f2034f = new AtomicInteger(0);
        f2036h = new AtomicBoolean(false);
    }

    public static final Activity l() {
        WeakReference weakReference = f2040l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static final UUID m() {
        m mVar;
        if (f2035g == null || (mVar = f2035g) == null) {
            return null;
        }
        return mVar.d();
    }

    public static final boolean o() {
        return f2039k == 0;
    }

    public static final void p(Activity activity) {
        f2031c.execute(new Runnable() { // from class: G1.d
            @Override // java.lang.Runnable
            public final void run() {
                f.q();
            }
        });
    }

    public static final void q() {
        if (f2035g == null) {
            f2035g = m.f2064g.b();
        }
    }

    public static final void t(final long j7, final String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (f2035g == null) {
            f2035g = new m(Long.valueOf(j7), null, null, 4, null);
        }
        m mVar = f2035g;
        if (mVar != null) {
            mVar.k(Long.valueOf(j7));
        }
        if (f2034f.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: G1.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.u(j7, activityName);
                }
            };
            synchronized (f2033e) {
                f2032d = f2031c.schedule(runnable, f2029a.n(), TimeUnit.SECONDS);
                t tVar = t.f6803a;
            }
        }
        long j8 = f2038j;
        i.e(activityName, j8 > 0 ? (j7 - j8) / 1000 : 0L);
        m mVar2 = f2035g;
        if (mVar2 == null) {
            return;
        }
        mVar2.m();
    }

    public static final void u(long j7, String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (f2035g == null) {
            f2035g = new m(Long.valueOf(j7), null, null, 4, null);
        }
        if (f2034f.get() <= 0) {
            n nVar = n.f2071a;
            n.e(activityName, f2035g, f2037i);
            m.f2064g.a();
            f2035g = null;
        }
        synchronized (f2033e) {
            f2032d = null;
            t tVar = t.f6803a;
        }
    }

    public static final void v(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f2040l = new WeakReference(activity);
        f2034f.incrementAndGet();
        f2029a.k();
        final long currentTimeMillis = System.currentTimeMillis();
        f2038j = currentTimeMillis;
        final String t7 = P.t(activity);
        B1.e.l(activity);
        z1.b.d(activity);
        K1.e.h(activity);
        E1.k.b();
        final Context applicationContext = activity.getApplicationContext();
        f2031c.execute(new Runnable() { // from class: G1.b
            @Override // java.lang.Runnable
            public final void run() {
                f.w(currentTimeMillis, t7, applicationContext);
            }
        });
    }

    public static final void w(long j7, String activityName, Context appContext) {
        m mVar;
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        m mVar2 = f2035g;
        Long e7 = mVar2 == null ? null : mVar2.e();
        if (f2035g == null) {
            f2035g = new m(Long.valueOf(j7), null, null, 4, null);
            n nVar = n.f2071a;
            String str = f2037i;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            n.c(activityName, null, str, appContext);
        } else if (e7 != null) {
            long longValue = j7 - e7.longValue();
            if (longValue > f2029a.n() * 1000) {
                n nVar2 = n.f2071a;
                n.e(activityName, f2035g, f2037i);
                String str2 = f2037i;
                Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                n.c(activityName, null, str2, appContext);
                f2035g = new m(Long.valueOf(j7), null, null, 4, null);
            } else if (longValue > 1000 && (mVar = f2035g) != null) {
                mVar.h();
            }
        }
        m mVar3 = f2035g;
        if (mVar3 != null) {
            mVar3.k(Long.valueOf(j7));
        }
        m mVar4 = f2035g;
        if (mVar4 == null) {
            return;
        }
        mVar4.m();
    }

    public static final void x(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (f2036h.compareAndSet(false, true)) {
            C0451n c0451n = C0451n.f3862a;
            C0451n.a(C0451n.b.CodelessEvents, new C0451n.a() { // from class: G1.a
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    f.y(z7);
                }
            });
            f2037i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    public static final void y(boolean z7) {
        if (z7) {
            B1.e.f();
        } else {
            B1.e.e();
        }
    }

    public final void k() {
        ScheduledFuture scheduledFuture;
        synchronized (f2033e) {
            try {
                if (f2032d != null && (scheduledFuture = f2032d) != null) {
                    scheduledFuture.cancel(false);
                }
                f2032d = null;
                t tVar = t.f6803a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int n() {
        C0458v c0458v = C0458v.f3949a;
        r f7 = C0458v.f(C2146B.m());
        return f7 == null ? j.a() : f7.k();
    }

    public final void r(Activity activity) {
        B1.e.j(activity);
    }

    public final void s(Activity activity) {
        AtomicInteger atomicInteger = f2034f;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f2030b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        k();
        final long currentTimeMillis = System.currentTimeMillis();
        final String t7 = P.t(activity);
        B1.e.k(activity);
        f2031c.execute(new Runnable() { // from class: G1.c
            @Override // java.lang.Runnable
            public final void run() {
                f.t(currentTimeMillis, t7);
            }
        });
    }
}
