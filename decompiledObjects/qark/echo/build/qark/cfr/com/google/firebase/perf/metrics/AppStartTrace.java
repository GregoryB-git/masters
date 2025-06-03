/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnDrawListener
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package com.google.firebase.perf.metrics;

import G4.d;
import G4.e;
import G4.f;
import J4.a;
import L4.k;
import M4.h;
import M4.l;
import N4.m;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.o;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s3.n;

public class AppStartTrace
implements Application.ActivityLifecycleCallbacks,
g {
    public static final l M = new M4.a().a();
    public static final long N = TimeUnit.MINUTES.toMicros(1L);
    public static volatile AppStartTrace O;
    public static ExecutorService P;
    public l A;
    public l B;
    public l C;
    public l D;
    public l E;
    public l F;
    public l G;
    public a H;
    public boolean I;
    public int J;
    public final b K;
    public boolean L;
    public boolean o = false;
    public final k p;
    public final M4.a q;
    public final C4.a r;
    public final m.b s;
    public Context t;
    public WeakReference u;
    public WeakReference v;
    public boolean w = false;
    public final l x;
    public final l y;
    public l z;

    public AppStartTrace(k object, M4.a object2, C4.a a8, ExecutorService executorService) {
        Object var5_5 = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = false;
        this.J = 0;
        this.K = new b(null);
        this.L = false;
        this.p = object;
        this.q = object2;
        this.r = a8;
        P = executorService;
        this.s = m.z0().N("_experiment_app_start_ttid");
        object = Build.VERSION.SDK_INT >= 24 ? l.f(G4.a.a()) : null;
        this.x = object;
        object2 = (n)s3.e.o().k(n.class);
        object = var5_5;
        if (object2 != null) {
            object = l.f(object2.b());
        }
        this.y = object;
    }

    public static /* synthetic */ void b(AppStartTrace appStartTrace, m.b b8) {
        appStartTrace.o(b8);
    }

    public static /* synthetic */ void c(AppStartTrace appStartTrace) {
        appStartTrace.p();
    }

    public static /* synthetic */ void d(AppStartTrace appStartTrace) {
        appStartTrace.s();
    }

    public static /* synthetic */ void e(AppStartTrace appStartTrace) {
        appStartTrace.t();
    }

    public static /* synthetic */ void f(AppStartTrace appStartTrace) {
        appStartTrace.r();
    }

    public static /* synthetic */ int i(AppStartTrace appStartTrace) {
        int n8 = appStartTrace.J;
        appStartTrace.J = n8 + 1;
        return n8;
    }

    public static AppStartTrace k() {
        if (O != null) {
            return O;
        }
        return AppStartTrace.l(k.l(), new M4.a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AppStartTrace l(k k8, M4.a a8) {
        if (O != null) return O;
        synchronized (AppStartTrace.class) {
            try {
                if (O != null) return O;
                O = new AppStartTrace(k8, a8, C4.a.g(), (ExecutorService)new ThreadPoolExecutor(0, 1, N + 10L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue()));
                return O;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static boolean n(Context object) {
        ActivityManager activityManager = (ActivityManager)object.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        if ((activityManager = activityManager.getRunningAppProcesses()) != null) {
            object = object.getPackageName();
            Object object2 = new StringBuilder();
            object2.append((String)object);
            object2.append(":");
            object2 = object2.toString();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager) {
                if (runningAppProcessInfo.importance != 100 || !runningAppProcessInfo.processName.equals(object) && !runningAppProcessInfo.processName.startsWith((String)object2)) continue;
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String string2) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String string2) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String string2) {
    }

    public final l j() {
        l l8 = this.y;
        if (l8 != null) {
            return l8;
        }
        return M;
    }

    public final l m() {
        l l8 = this.x;
        if (l8 != null) {
            return l8;
        }
        return this.j();
    }

    public final /* synthetic */ void o(m.b b8) {
        this.p.D((m)b8.v(), N4.d.s);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (this) {
            boolean bl;
            block8 : {
                block7 : {
                    try {
                        if (!this.I && this.z == null) {
                            if (this.L || AppStartTrace.n(this.t)) {
                                break block7;
                            }
                        } else {
                            return;
                        }
                        bl = false;
                        break block8;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
                bl = true;
            }
            this.L = bl;
            this.u = new WeakReference((Object)activity);
            this.z = this.q.a();
            if (this.m().d(this.z) > N) {
                this.w = true;
            }
            return;
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (!this.I && !this.w) {
            if (!this.r.h()) {
                return;
            }
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)this.K);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void onActivityResumed(Activity var1_1) {
        block7 : {
            // MONITORENTER : this
            if (this.I) ** GOTO lbl35
            if (this.w) {
                return;
            }
            var2_3 = this.r.h();
            if (var2_3) {
                var3_4 = var1_1.findViewById(16908290);
                var3_4.getViewTreeObserver().addOnDrawListener((ViewTreeObserver.OnDrawListener)this.K);
                M4.e.e((View)var3_4, new G4.b(this));
                h.a((View)var3_4, new G4.c(this), new d(this));
            }
            if ((var3_4 = this.B) == null) break block7;
            return;
        }
        this.v = new WeakReference((Object)var1_1);
        this.B = this.q.a();
        this.H = SessionManager.getInstance().perfSession();
        var3_4 = F4.a.e();
        var4_5 = new StringBuilder();
        var4_5.append("onResume(): ");
        var4_5.append(var1_1.getClass().getName());
        var4_5.append(": ");
        var4_5.append(this.j().d(this.B));
        var4_5.append(" microseconds");
        var3_4.a(var4_5.toString());
        AppStartTrace.P.execute((Runnable)new e(this));
        if (!var2_3) {
            this.v();
        }
        // MONITOREXIT : this
        return;
lbl35: // 1 sources:
        // MONITOREXIT : this
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (!this.I && this.A == null && !this.w) {
                        this.A = this.q.a();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void onActivityStopped(Activity activity) {
    }

    @androidx.lifecycle.n(value=d.b.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.I && !this.w) {
            if (this.D != null) {
                return;
            }
            this.D = this.q.a();
            this.s.G((m)m.z0().N("_experiment_firstBackgrounding").L(this.m().e()).M(this.m().d(this.D)).v());
        }
    }

    @androidx.lifecycle.n(value=d.b.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.I && !this.w) {
            if (this.C != null) {
                return;
            }
            this.C = this.q.a();
            this.s.G((m)m.z0().N("_experiment_firstForegrounding").L(this.m().e()).M(this.m().d(this.C)).v());
        }
    }

    public final void p() {
        m.b b8 = m.z0().N(M4.c.p.toString()).L(this.j().e()).M(this.j().d(this.B));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((Object)((m)m.z0().N(M4.c.q.toString()).L(this.j().e()).M(this.j().d(this.z)).v()));
        if (this.A != null) {
            m.b b9 = m.z0();
            b9.N(M4.c.r.toString()).L(this.z.e()).M(this.z.d(this.A));
            arrayList.add((Object)((m)b9.v()));
            b9 = m.z0();
            b9.N(M4.c.s.toString()).L(this.A.e()).M(this.A.d(this.B));
            arrayList.add((Object)((m)b9.v()));
        }
        b8.E((Iterable)arrayList).F(this.H.a());
        this.p.D((m)b8.v(), N4.d.s);
    }

    public final void q(m.b b8) {
        if (this.E != null && this.F != null) {
            if (this.G == null) {
                return;
            }
            P.execute((Runnable)new f(this, b8));
            this.v();
        }
    }

    public final void r() {
        if (this.G != null) {
            return;
        }
        this.G = this.q.a();
        this.s.G((m)m.z0().N("_experiment_onDrawFoQ").L(this.m().e()).M(this.m().d(this.G)).v());
        if (this.x != null) {
            this.s.G((m)m.z0().N("_experiment_procStart_to_classLoad").L(this.m().e()).M(this.m().d(this.j())).v());
        }
        m.b b8 = this.s;
        String string2 = this.L ? "true" : "false";
        b8.K("systemDeterminedForeground", string2);
        this.s.J("onDrawCount", this.J);
        this.s.F(this.H.a());
        this.q(this.s);
    }

    public final void s() {
        if (this.E != null) {
            return;
        }
        this.E = this.q.a();
        this.s.L(this.m().e()).M(this.m().d(this.E));
        this.q(this.s);
    }

    public final void t() {
        if (this.F != null) {
            return;
        }
        this.F = this.q.a();
        this.s.G((m)m.z0().N("_experiment_preDrawFoQ").L(this.m().e()).M(this.m().d(this.F)).v());
        this.q(this.s);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void u(Context context) {
        boolean bl;
        block10 : {
            block9 : {
                block8 : {
                    // MONITORENTER : this
                    bl = this.o;
                    if (!bl) break block8;
                    return;
                }
                o.i().g().a(this);
                context = context.getApplicationContext();
                if (context instanceof Application) {
                    ((Application)context).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
                    if (this.L || AppStartTrace.n(context)) {
                        break block9;
                    }
                } else {
                    do {
                        // MONITOREXIT : this
                        return;
                        break;
                    } while (true);
                }
                bl = false;
                break block10;
            }
            bl = true;
        }
        this.L = bl;
        this.o = true;
        this.t = context;
    }

    public void v() {
        synchronized (this) {
            block4 : {
                boolean bl = this.o;
                if (bl) break block4;
                return;
            }
            o.i().g().c(this);
            ((Application)this.t).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
            this.o = false;
            return;
        }
    }

    public final class b
    implements ViewTreeObserver.OnDrawListener {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public void onDraw() {
            AppStartTrace.i(AppStartTrace.this);
        }
    }

    public static class c
    implements Runnable {
        public final AppStartTrace o;

        public c(AppStartTrace appStartTrace) {
            this.o = appStartTrace;
        }

        public void run() {
            if (this.o.z == null) {
                this.o.I = true;
            }
        }
    }

}

