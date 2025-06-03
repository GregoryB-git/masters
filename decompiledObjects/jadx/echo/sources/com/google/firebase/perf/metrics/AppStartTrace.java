package com.google.firebase.perf.metrics;

import L4.k;
import M4.e;
import M4.h;
import M4.l;
import N4.d;
import N4.m;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.o;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s3.C1947e;
import s3.n;

/* loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, g {

    /* renamed from: M, reason: collision with root package name */
    public static final l f11827M = new M4.a().a();

    /* renamed from: N, reason: collision with root package name */
    public static final long f11828N = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: O, reason: collision with root package name */
    public static volatile AppStartTrace f11829O;

    /* renamed from: P, reason: collision with root package name */
    public static ExecutorService f11830P;

    /* renamed from: H, reason: collision with root package name */
    public J4.a f11838H;

    /* renamed from: p, reason: collision with root package name */
    public final k f11844p;

    /* renamed from: q, reason: collision with root package name */
    public final M4.a f11845q;

    /* renamed from: r, reason: collision with root package name */
    public final C4.a f11846r;

    /* renamed from: s, reason: collision with root package name */
    public final m.b f11847s;

    /* renamed from: t, reason: collision with root package name */
    public Context f11848t;

    /* renamed from: u, reason: collision with root package name */
    public WeakReference f11849u;

    /* renamed from: v, reason: collision with root package name */
    public WeakReference f11850v;

    /* renamed from: x, reason: collision with root package name */
    public final l f11852x;

    /* renamed from: y, reason: collision with root package name */
    public final l f11853y;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11843o = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11851w = false;

    /* renamed from: z, reason: collision with root package name */
    public l f11854z = null;

    /* renamed from: A, reason: collision with root package name */
    public l f11831A = null;

    /* renamed from: B, reason: collision with root package name */
    public l f11832B = null;

    /* renamed from: C, reason: collision with root package name */
    public l f11833C = null;

    /* renamed from: D, reason: collision with root package name */
    public l f11834D = null;

    /* renamed from: E, reason: collision with root package name */
    public l f11835E = null;

    /* renamed from: F, reason: collision with root package name */
    public l f11836F = null;

    /* renamed from: G, reason: collision with root package name */
    public l f11837G = null;

    /* renamed from: I, reason: collision with root package name */
    public boolean f11839I = false;

    /* renamed from: J, reason: collision with root package name */
    public int f11840J = 0;

    /* renamed from: K, reason: collision with root package name */
    public final b f11841K = new b();

    /* renamed from: L, reason: collision with root package name */
    public boolean f11842L = false;

    public final class b implements ViewTreeObserver.OnDrawListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.i(AppStartTrace.this);
        }
    }

    public static class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final AppStartTrace f11856o;

        public c(AppStartTrace appStartTrace) {
            this.f11856o = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11856o.f11854z == null) {
                this.f11856o.f11839I = true;
            }
        }
    }

    public AppStartTrace(k kVar, M4.a aVar, C4.a aVar2, ExecutorService executorService) {
        l lVar;
        long startElapsedRealtime;
        this.f11844p = kVar;
        this.f11845q = aVar;
        this.f11846r = aVar2;
        f11830P = executorService;
        this.f11847s = m.z0().N("_experiment_app_start_ttid");
        if (Build.VERSION.SDK_INT >= 24) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            lVar = l.f(startElapsedRealtime);
        } else {
            lVar = null;
        }
        this.f11852x = lVar;
        n nVar = (n) C1947e.o().k(n.class);
        this.f11853y = nVar != null ? l.f(nVar.b()) : null;
    }

    public static /* synthetic */ int i(AppStartTrace appStartTrace) {
        int i7 = appStartTrace.f11840J;
        appStartTrace.f11840J = i7 + 1;
        return i7;
    }

    public static AppStartTrace k() {
        return f11829O != null ? f11829O : l(k.l(), new M4.a());
    }

    public static AppStartTrace l(k kVar, M4.a aVar) {
        if (f11829O == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f11829O == null) {
                        f11829O = new AppStartTrace(kVar, aVar, C4.a.g(), new ThreadPoolExecutor(0, 1, f11828N + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f11829O;
    }

    public static boolean n(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final l j() {
        l lVar = this.f11853y;
        return lVar != null ? lVar : f11827M;
    }

    public final l m() {
        l lVar = this.f11852x;
        return lVar != null ? lVar : j();
    }

    public final /* synthetic */ void o(m.b bVar) {
        this.f11844p.D((m) bVar.v(), d.FOREGROUND_BACKGROUND);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:14:0x001d, B:16:0x003e), top: B:2:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f11839I     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto L42
            M4.l r5 = r3.f11854z     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto La
            goto L42
        La:
            boolean r5 = r3.f11842L     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            if (r5 != 0) goto L1c
            android.content.Context r5 = r3.f11848t     // Catch: java.lang.Throwable -> L1a
            boolean r5 = n(r5)     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L18
            goto L1c
        L18:
            r5 = 0
            goto L1d
        L1a:
            r4 = move-exception
            goto L44
        L1c:
            r5 = r0
        L1d:
            r3.f11842L = r5     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1a
            r3.f11849u = r5     // Catch: java.lang.Throwable -> L1a
            M4.a r4 = r3.f11845q     // Catch: java.lang.Throwable -> L1a
            M4.l r4 = r4.a()     // Catch: java.lang.Throwable -> L1a
            r3.f11854z = r4     // Catch: java.lang.Throwable -> L1a
            M4.l r4 = r3.m()     // Catch: java.lang.Throwable -> L1a
            M4.l r5 = r3.f11854z     // Catch: java.lang.Throwable -> L1a
            long r4 = r4.d(r5)     // Catch: java.lang.Throwable -> L1a
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.f11828N     // Catch: java.lang.Throwable -> L1a
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L40
            r3.f11851w = r0     // Catch: java.lang.Throwable -> L1a
        L40:
            monitor-exit(r3)
            return
        L42:
            monitor-exit(r3)
            return
        L44:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.f11839I || this.f11851w || !this.f11846r.h()) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.f11841K);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.f11839I && !this.f11851w) {
                boolean h7 = this.f11846r.h();
                if (h7) {
                    View findViewById = activity.findViewById(R.id.content);
                    findViewById.getViewTreeObserver().addOnDrawListener(this.f11841K);
                    e.e(findViewById, new Runnable() { // from class: G4.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.this.r();
                        }
                    });
                    h.a(findViewById, new Runnable() { // from class: G4.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.this.s();
                        }
                    }, new Runnable() { // from class: G4.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.this.t();
                        }
                    });
                }
                if (this.f11832B != null) {
                    return;
                }
                this.f11850v = new WeakReference(activity);
                this.f11832B = this.f11845q.a();
                this.f11838H = SessionManager.getInstance().perfSession();
                F4.a.e().a("onResume(): " + activity.getClass().getName() + ": " + j().d(this.f11832B) + " microseconds");
                f11830P.execute(new Runnable() { // from class: G4.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.p();
                    }
                });
                if (!h7) {
                    v();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f11839I && this.f11831A == null && !this.f11851w) {
            this.f11831A = this.f11845q.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @androidx.lifecycle.n(d.b.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.f11839I || this.f11851w || this.f11834D != null) {
            return;
        }
        this.f11834D = this.f11845q.a();
        this.f11847s.G((m) m.z0().N("_experiment_firstBackgrounding").L(m().e()).M(m().d(this.f11834D)).v());
    }

    @androidx.lifecycle.n(d.b.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.f11839I || this.f11851w || this.f11833C != null) {
            return;
        }
        this.f11833C = this.f11845q.a();
        this.f11847s.G((m) m.z0().N("_experiment_firstForegrounding").L(m().e()).M(m().d(this.f11833C)).v());
    }

    public final void p() {
        m.b M6 = m.z0().N(M4.c.APP_START_TRACE_NAME.toString()).L(j().e()).M(j().d(this.f11832B));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((m) m.z0().N(M4.c.ON_CREATE_TRACE_NAME.toString()).L(j().e()).M(j().d(this.f11854z)).v());
        if (this.f11831A != null) {
            m.b z02 = m.z0();
            z02.N(M4.c.ON_START_TRACE_NAME.toString()).L(this.f11854z.e()).M(this.f11854z.d(this.f11831A));
            arrayList.add((m) z02.v());
            m.b z03 = m.z0();
            z03.N(M4.c.ON_RESUME_TRACE_NAME.toString()).L(this.f11831A.e()).M(this.f11831A.d(this.f11832B));
            arrayList.add((m) z03.v());
        }
        M6.E(arrayList).F(this.f11838H.a());
        this.f11844p.D((m) M6.v(), N4.d.FOREGROUND_BACKGROUND);
    }

    public final void q(final m.b bVar) {
        if (this.f11835E == null || this.f11836F == null || this.f11837G == null) {
            return;
        }
        f11830P.execute(new Runnable() { // from class: G4.f
            @Override // java.lang.Runnable
            public final void run() {
                AppStartTrace.this.o(bVar);
            }
        });
        v();
    }

    public final void r() {
        if (this.f11837G != null) {
            return;
        }
        this.f11837G = this.f11845q.a();
        this.f11847s.G((m) m.z0().N("_experiment_onDrawFoQ").L(m().e()).M(m().d(this.f11837G)).v());
        if (this.f11852x != null) {
            this.f11847s.G((m) m.z0().N("_experiment_procStart_to_classLoad").L(m().e()).M(m().d(j())).v());
        }
        this.f11847s.K("systemDeterminedForeground", this.f11842L ? "true" : "false");
        this.f11847s.J("onDrawCount", this.f11840J);
        this.f11847s.F(this.f11838H.a());
        q(this.f11847s);
    }

    public final void s() {
        if (this.f11835E != null) {
            return;
        }
        this.f11835E = this.f11845q.a();
        this.f11847s.L(m().e()).M(m().d(this.f11835E));
        q(this.f11847s);
    }

    public final void t() {
        if (this.f11836F != null) {
            return;
        }
        this.f11836F = this.f11845q.a();
        this.f11847s.G((m) m.z0().N("_experiment_preDrawFoQ").L(m().e()).M(m().d(this.f11836F)).v());
        q(this.f11847s);
    }

    public synchronized void u(Context context) {
        boolean z7;
        try {
            if (this.f11843o) {
                return;
            }
            o.i().g().a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                if (!this.f11842L && !n(applicationContext)) {
                    z7 = false;
                    this.f11842L = z7;
                    this.f11843o = true;
                    this.f11848t = applicationContext;
                }
                z7 = true;
                this.f11842L = z7;
                this.f11843o = true;
                this.f11848t = applicationContext;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void v() {
        if (this.f11843o) {
            o.i().g().c(this);
            ((Application) this.f11848t).unregisterActivityLifecycleCallbacks(this);
            this.f11843o = false;
        }
    }
}
