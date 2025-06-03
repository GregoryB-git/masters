// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.perf.metrics;

import com.google.protobuf.r;
import android.app.Application;
import androidx.lifecycle.o;
import G4.f;
import java.util.ArrayList;
import android.view.View;
import com.google.firebase.perf.session.SessionManager;
import M4.h;
import G4.c;
import G4.b;
import android.view.ViewTreeObserver$OnDrawListener;
import android.os.Bundle;
import android.app.Activity;
import N4.d;
import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.List;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import s3.e;
import s3.n;
import android.os.Build$VERSION;
import java.util.concurrent.TimeUnit;
import java.lang.ref.WeakReference;
import android.content.Context;
import N4.m;
import L4.k;
import J4.a;
import java.util.concurrent.ExecutorService;
import M4.l;
import androidx.lifecycle.g;
import android.app.Application$ActivityLifecycleCallbacks;

public class AppStartTrace implements Application$ActivityLifecycleCallbacks, g
{
    public static final l M;
    public static final long N;
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
    public boolean o;
    public final k p;
    public final M4.a q;
    public final C4.a r;
    public final m.b s;
    public Context t;
    public WeakReference u;
    public WeakReference v;
    public boolean w;
    public final l x;
    public final l y;
    public l z;
    
    static {
        M = new M4.a().a();
        N = TimeUnit.MINUTES.toMicros(1L);
    }
    
    public AppStartTrace(final k p4, final M4.a q, final C4.a r, final ExecutorService p5) {
        this.o = false;
        this.w = false;
        final l l = null;
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
        this.p = p4;
        this.q = q;
        this.r = r;
        AppStartTrace.P = p5;
        this.s = m.z0().N("_experiment_app_start_ttid");
        l f;
        if (Build$VERSION.SDK_INT >= 24) {
            f = M4.l.f(G4.a.a());
        }
        else {
            f = null;
        }
        this.x = f;
        final n n = (n)e.o().k(n.class);
        l f2 = l;
        if (n != null) {
            f2 = M4.l.f(n.b());
        }
        this.y = f2;
    }
    
    public static /* synthetic */ l g(final AppStartTrace appStartTrace) {
        return appStartTrace.z;
    }
    
    public static /* synthetic */ boolean h(final AppStartTrace appStartTrace, final boolean i) {
        return appStartTrace.I = i;
    }
    
    public static /* synthetic */ int i(final AppStartTrace appStartTrace) {
        return appStartTrace.J++;
    }
    
    public static AppStartTrace k() {
        if (AppStartTrace.O != null) {
            return AppStartTrace.O;
        }
        return l(k.l(), new M4.a());
    }
    
    public static AppStartTrace l(final k k, final M4.a a) {
        while (true) {
            if (AppStartTrace.O == null) {
                // monitorenter(AppStartTrace.class)
                while (true) {
                    try {
                        if (AppStartTrace.O == null) {
                            AppStartTrace.O = new AppStartTrace(k, a, C4.a.g(), new ThreadPoolExecutor(0, 1, AppStartTrace.N + 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>()));
                        }
                        // monitorexit(AppStartTrace.class)
                        return AppStartTrace.O;
                    }
                    // monitorexit(AppStartTrace.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public static boolean n(final Context context) {
        final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        final List runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            final String packageName = context.getPackageName();
            final StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append(":");
            final String string = sb.toString();
            for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                if (activityManager$RunningAppProcessInfo.importance != 100) {
                    continue;
                }
                if (activityManager$RunningAppProcessInfo.processName.equals(packageName) || activityManager$RunningAppProcessInfo.processName.startsWith(string)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Keep
    public static void setLauncherActivityOnCreateTime(final String s) {
    }
    
    @Keep
    public static void setLauncherActivityOnResumeTime(final String s) {
    }
    
    @Keep
    public static void setLauncherActivityOnStartTime(final String s) {
    }
    
    public final l j() {
        final l y = this.y;
        if (y != null) {
            return y;
        }
        return AppStartTrace.M;
    }
    
    public final l m() {
        final l x = this.x;
        if (x != null) {
            return x;
        }
        return this.j();
    }
    
    public void onActivityCreated(Activity referent, final Bundle bundle) {
        while (true) {
            // monitorenter(this)
            while (true) {
                Label_0109: {
                    while (true) {
                        try {
                            if (this.I || this.z != null) {
                                // monitorexit(this)
                                return;
                            }
                            if (!this.L && !n(this.t)) {
                                final boolean l = false;
                                this.L = l;
                                this.u = new WeakReference((T)referent);
                                this.z = this.q.a();
                                if (this.m().d(this.z) > AppStartTrace.N) {
                                    this.w = true;
                                }
                                // monitorexit(this)
                                return;
                            }
                            break Label_0109;
                        }
                        // monitorexit(this)
                        finally {}
                        final Activity activity;
                        referent = activity;
                        continue;
                    }
                }
                final boolean l = true;
                continue;
            }
        }
    }
    
    public void onActivityDestroyed(final Activity activity) {
    }
    
    public void onActivityPaused(final Activity activity) {
        if (!this.I && !this.w) {
            if (!this.r.h()) {
                return;
            }
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener((ViewTreeObserver$OnDrawListener)this.K);
        }
    }
    
    public void onActivityResumed(final Activity referent) {
        // monitorenter(this)
        while (true) {
            try {
                if (this.I || this.w) {
                    // monitorexit(this)
                    return;
                }
                final boolean h = this.r.h();
                if (h) {
                    final View viewById = referent.findViewById(16908290);
                    viewById.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)this.K);
                    M4.e.e(viewById, new G4.b(this));
                    M4.h.a(viewById, new G4.c(this), new G4.d(this));
                }
                if (this.B != null) {
                    // monitorexit(this)
                    return;
                }
                this.v = new WeakReference((T)referent);
                this.B = this.q.a();
                this.H = SessionManager.getInstance().perfSession();
                final F4.a e = F4.a.e();
                final StringBuilder sb = new StringBuilder();
                sb.append("onResume(): ");
                sb.append(referent.getClass().getName());
                sb.append(": ");
                sb.append(this.j().d(this.B));
                sb.append(" microseconds");
                e.a(sb.toString());
                AppStartTrace.P.execute(new G4.e(this));
                if (!h) {
                    this.v();
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public void onActivityStarted(final Activity activity) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0047: {
            try {
                if (!this.I && this.A == null) {
                    if (!this.w) {
                        this.A = this.q.a();
                        // monitorexit(this)
                        return;
                    }
                }
            }
            finally {
                break Label_0047;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void onActivityStopped(final Activity activity) {
    }
    
    @androidx.lifecycle.n(androidx.lifecycle.d.b.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.I && !this.w) {
            if (this.D != null) {
                return;
            }
            this.D = this.q.a();
            this.s.G((m)((r.a)m.z0().N("_experiment_firstBackgrounding").L(this.m().e()).M(this.m().d(this.D))).v());
        }
    }
    
    @androidx.lifecycle.n(androidx.lifecycle.d.b.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.I && !this.w) {
            if (this.C != null) {
                return;
            }
            this.C = this.q.a();
            this.s.G((m)((r.a)m.z0().N("_experiment_firstForegrounding").L(this.m().e()).M(this.m().d(this.C))).v());
        }
    }
    
    public final void p() {
        final m.b m = N4.m.z0().N(M4.c.p.toString()).L(this.j().e()).M(this.j().d(this.B));
        final ArrayList<m> list = new ArrayList<m>(3);
        list.add((m)((r.a)N4.m.z0().N(M4.c.q.toString()).L(this.j().e()).M(this.j().d(this.z))).v());
        if (this.A != null) {
            final m.b z0 = N4.m.z0();
            z0.N(M4.c.r.toString()).L(this.z.e()).M(this.z.d(this.A));
            list.add((m)((r.a)z0).v());
            final m.b z2 = N4.m.z0();
            z2.N(M4.c.s.toString()).L(this.A.e()).M(this.A.d(this.B));
            list.add((m)((r.a)z2).v());
        }
        m.E(list).F(this.H.a());
        this.p.D((m)((r.a)m).v(), d.s);
    }
    
    public final void q(final m.b b) {
        if (this.E != null && this.F != null) {
            if (this.G == null) {
                return;
            }
            AppStartTrace.P.execute(new f(this, b));
            this.v();
        }
    }
    
    public final void r() {
        if (this.G != null) {
            return;
        }
        this.G = this.q.a();
        this.s.G((m)((r.a)m.z0().N("_experiment_onDrawFoQ").L(this.m().e()).M(this.m().d(this.G))).v());
        if (this.x != null) {
            this.s.G((m)((r.a)m.z0().N("_experiment_procStart_to_classLoad").L(this.m().e()).M(this.m().d(this.j()))).v());
        }
        final m.b s = this.s;
        String s2;
        if (this.L) {
            s2 = "true";
        }
        else {
            s2 = "false";
        }
        s.K("systemDeterminedForeground", s2);
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
        this.s.G((m)((r.a)m.z0().N("_experiment_preDrawFoQ").L(this.m().e()).M(this.m().d(this.F))).v());
        this.q(this.s);
    }
    
    public void u(Context applicationContext) {
        while (true) {
            // monitorenter(this)
            while (true) {
                Label_0094: {
                    while (true) {
                        try {
                            if (this.o) {
                                // monitorexit(this)
                                return;
                            }
                            androidx.lifecycle.o.i().g().a(this);
                            applicationContext = ((Context)applicationContext).getApplicationContext();
                            if (applicationContext instanceof Application) {
                                ((Application)applicationContext).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
                                if (this.L || n((Context)applicationContext)) {
                                    break Label_0094;
                                }
                                final boolean l = false;
                                this.L = l;
                                this.o = true;
                                this.t = (Context)applicationContext;
                            }
                            // monitorexit(this)
                            return;
                        }
                        // monitorexit(this)
                        finally {}
                        final Object o;
                        applicationContext = o;
                        continue;
                    }
                }
                final boolean l = true;
                continue;
            }
        }
    }
    
    public void v() {
        synchronized (this) {
            if (!this.o) {
                return;
            }
            androidx.lifecycle.o.i().g().c(this);
            ((Application)this.t).unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
            this.o = false;
        }
    }
    
    public final class b implements ViewTreeObserver$OnDrawListener
    {
        public void onDraw() {
            AppStartTrace.i(AppStartTrace.this);
        }
    }
    
    public static class c implements Runnable
    {
        public final AppStartTrace o;
        
        public c(final AppStartTrace o) {
            this.o = o;
        }
        
        @Override
        public void run() {
            if (AppStartTrace.g(this.o) == null) {
                AppStartTrace.h(this.o, true);
            }
        }
    }
}
