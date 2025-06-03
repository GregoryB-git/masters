// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G1;

import android.util.Log;
import O1.r;
import x1.B;
import O1.v;
import y1.p;
import x1.N;
import O1.C;
import android.os.Bundle;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import E1.k;
import z1.b;
import O1.P;
import V5.t;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import java.util.UUID;
import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Executors;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

public final class f
{
    public static final f a;
    public static final String b;
    public static final ScheduledExecutorService c;
    public static volatile ScheduledFuture d;
    public static final Object e;
    public static final AtomicInteger f;
    public static volatile m g;
    public static final AtomicBoolean h;
    public static String i;
    public static long j;
    public static int k;
    public static WeakReference l;
    
    static {
        a = new f();
        String canonicalName;
        if ((canonicalName = f.class.getCanonicalName()) == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        b = canonicalName;
        c = Executors.newSingleThreadScheduledExecutor();
        e = new Object();
        f = new AtomicInteger(0);
        h = new AtomicBoolean(false);
    }
    
    public static final /* synthetic */ int f() {
        return G1.f.k;
    }
    
    public static final /* synthetic */ String g() {
        return G1.f.b;
    }
    
    public static final /* synthetic */ void j(final int k) {
        G1.f.k = k;
    }
    
    public static final Activity l() {
        final WeakReference l = G1.f.l;
        Activity activity = null;
        if (l != null) {
            if (l == null) {
                return null;
            }
            activity = l.get();
        }
        return activity;
    }
    
    public static final UUID m() {
        final m g = G1.f.g;
        UUID d = null;
        if (g != null) {
            final m g2 = G1.f.g;
            if (g2 == null) {
                return null;
            }
            d = g2.d();
        }
        return d;
    }
    
    public static final boolean o() {
        return G1.f.k == 0;
    }
    
    public static final void p(final Activity activity) {
        G1.f.c.execute(new d());
    }
    
    public static final void q() {
        if (G1.f.g == null) {
            G1.f.g = m.g.b();
        }
    }
    
    public static final void t(final long n, final String s) {
        Intrinsics.checkNotNullParameter(s, "$activityName");
        if (G1.f.g == null) {
            G1.f.g = new m(n, null, null, 4, null);
        }
        final m g = G1.f.g;
        if (g != null) {
            g.k(n);
        }
        if (G1.f.f.get() <= 0) {
            final e e = new e(n, s);
            synchronized (G1.f.e) {
                G1.f.d = G1.f.c.schedule(e, G1.f.a.n(), TimeUnit.SECONDS);
                final t a = t.a;
            }
        }
        final long j = G1.f.j;
        long n2 = 0L;
        if (j > 0L) {
            n2 = (n - j) / 1000;
        }
        G1.i.e(s, n2);
        final m g2 = G1.f.g;
        if (g2 == null) {
            return;
        }
        g2.m();
    }
    
    public static final void u(final long l, final String s) {
        Intrinsics.checkNotNullParameter(s, "$activityName");
        if (G1.f.g == null) {
            G1.f.g = new m(l, null, null, 4, null);
        }
        if (G1.f.f.get() <= 0) {
            final n a = n.a;
            n.e(s, G1.f.g, G1.f.i);
            m.g.a();
            G1.f.g = null;
        }
        synchronized (G1.f.e) {
            G1.f.d = null;
            final t a2 = t.a;
        }
    }
    
    public static final void v(final Activity referent) {
        Intrinsics.checkNotNullParameter(referent, "activity");
        G1.f.l = new WeakReference((T)referent);
        G1.f.f.incrementAndGet();
        G1.f.a.k();
        final long n = G1.f.j = System.currentTimeMillis();
        final String t = P.t((Context)referent);
        B1.e.l(referent);
        z1.b.d(referent);
        K1.e.h(referent);
        E1.k.b();
        G1.f.c.execute(new G1.b(n, t, ((Context)referent).getApplicationContext()));
    }
    
    public static final void w(final long l, final String s, final Context context) {
        Intrinsics.checkNotNullParameter(s, "$activityName");
        final m g = G1.f.g;
        Long e;
        if (g == null) {
            e = null;
        }
        else {
            e = g.e();
        }
        if (G1.f.g == null) {
            G1.f.g = new m(l, null, null, 4, null);
            final n a = n.a;
            final String i = G1.f.i;
            Intrinsics.checkNotNullExpressionValue(context, "appContext");
            n.c(s, null, i, context);
        }
        else if (e != null) {
            final long n = l - e;
            if (n > G1.f.a.n() * 1000) {
                final n a2 = G1.n.a;
                G1.n.e(s, G1.f.g, G1.f.i);
                final String j = G1.f.i;
                Intrinsics.checkNotNullExpressionValue(context, "appContext");
                G1.n.c(s, null, j, context);
                G1.f.g = new m(l, null, null, 4, null);
            }
            else if (n > 1000L) {
                final m g2 = G1.f.g;
                if (g2 != null) {
                    g2.h();
                }
            }
        }
        final m g3 = G1.f.g;
        if (g3 != null) {
            g3.k(l);
        }
        final m g4 = G1.f.g;
        if (g4 == null) {
            return;
        }
        g4.m();
    }
    
    public static final void x(final Application application, final String i) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (!G1.f.h.compareAndSet(false, true)) {
            return;
        }
        final O1.n a = O1.n.a;
        O1.n.a(O1.n.b.t, (O1.n.a)new a());
        G1.f.i = i;
        application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new Application$ActivityLifecycleCallbacks() {
            public void onActivityCreated(final Activity activity, final Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                C.e.b(N.s, G1.f.g(), "onActivityCreated");
                G1.g.a();
                G1.f.p(activity);
            }
            
            public void onActivityDestroyed(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                C.e.b(N.s, G1.f.g(), "onActivityDestroyed");
                G1.f.a.r(activity);
            }
            
            public void onActivityPaused(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                C.e.b(N.s, G1.f.g(), "onActivityPaused");
                G1.g.a();
                G1.f.a.s(activity);
            }
            
            public void onActivityResumed(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                C.e.b(N.s, G1.f.g(), "onActivityResumed");
                G1.g.a();
                G1.f.v(activity);
            }
            
            public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(bundle, "outState");
                C.e.b(N.s, G1.f.g(), "onActivitySaveInstanceState");
            }
            
            public void onActivityStarted(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                G1.f.j(G1.f.f() + 1);
                C.e.b(N.s, G1.f.g(), "onActivityStarted");
            }
            
            public void onActivityStopped(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                C.e.b(N.s, G1.f.g(), "onActivityStopped");
                p.b.i();
                G1.f.j(G1.f.f() - 1);
            }
        });
    }
    
    public static final void y(final boolean b) {
        if (b) {
            B1.e.f();
            return;
        }
        B1.e.e();
    }
    
    public final void k() {
        final Object e = G1.f.e;
        // monitorenter(e)
        while (true) {
            try {
                if (G1.f.d != null) {
                    final ScheduledFuture d = G1.f.d;
                    if (d != null) {
                        d.cancel(false);
                    }
                }
                G1.f.d = null;
                final t a = t.a;
                // monitorexit(e)
                return;
                // monitorexit(e)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final int n() {
        final v a = v.a;
        final r f = v.f(B.m());
        if (f == null) {
            return G1.j.a();
        }
        return f.k();
    }
    
    public final void r(final Activity activity) {
        B1.e.j(activity);
    }
    
    public final void s(final Activity activity) {
        final AtomicInteger f = G1.f.f;
        if (f.decrementAndGet() < 0) {
            f.set(0);
            Log.w(G1.f.b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        this.k();
        final long currentTimeMillis = System.currentTimeMillis();
        final String t = P.t((Context)activity);
        B1.e.k(activity);
        G1.f.c.execute(new c(currentTimeMillis, t));
    }
}
