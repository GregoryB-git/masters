/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.UUID
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicInteger
 */
package G1;

import E1.k;
import G1.a;
import G1.b;
import G1.c;
import G1.d;
import G1.e;
import G1.g;
import G1.i;
import G1.j;
import G1.m;
import G1.n;
import O1.C;
import O1.P;
import O1.n;
import O1.v;
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
import x1.B;
import x1.N;
import y1.p;

public final class f {
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
        String string2;
        a = new f();
        String string3 = string2 = f.class.getCanonicalName();
        if (string2 == null) {
            string3 = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        b = string3;
        c = Executors.newSingleThreadScheduledExecutor();
        e = new Object();
        f = new AtomicInteger(0);
        h = new AtomicBoolean(false);
    }

    public static /* synthetic */ void a(long l8, String string2, Context context) {
        f.w(l8, string2, context);
    }

    public static /* synthetic */ void b(long l8, String string2) {
        f.u(l8, string2);
    }

    public static /* synthetic */ void c() {
        f.q();
    }

    public static /* synthetic */ void d(boolean bl) {
        f.y(bl);
    }

    public static /* synthetic */ void e(long l8, String string2) {
        f.t(l8, string2);
    }

    public static final /* synthetic */ void j(int n8) {
        k = n8;
    }

    public static final Activity l() {
        WeakReference weakReference = l;
        Activity activity = null;
        if (weakReference != null) {
            if (weakReference == null) {
                return null;
            }
            activity = (Activity)weakReference.get();
        }
        return activity;
    }

    public static final UUID m() {
        m m8 = g;
        m m9 = null;
        if (m8 != null) {
            m9 = g;
            if (m9 == null) {
                return null;
            }
            m9 = m9.d();
        }
        return m9;
    }

    public static final boolean o() {
        if (k == 0) {
            return true;
        }
        return false;
    }

    public static final void p(Activity activity) {
        c.execute((Runnable)new d());
    }

    public static final void q() {
        if (g == null) {
            g = m.g.b();
        }
    }

    public static final void t(long l8, String object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "$activityName");
        if (g == null) {
            g = new m(l8, null, null, 4, null);
        }
        if ((object2 = g) != null) {
            object2.k(l8);
        }
        if (f.get() <= 0) {
            Object object3 = new e(l8, (String)object);
            object2 = e;
            synchronized (object2) {
                d = c.schedule((Runnable)object3, (long)a.n(), TimeUnit.SECONDS);
                object3 = t.a;
            }
        }
        long l9 = j;
        long l10 = 0L;
        if (l9 > 0L) {
            l10 = (l8 - l9) / (long)1000;
        }
        i.e((String)object, l10);
        object = g;
        if (object == null) {
            return;
        }
        object.m();
    }

    public static final void u(long l8, String object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "$activityName");
        if (g == null) {
            g = new m(l8, null, null, 4, null);
        }
        if (f.get() <= 0) {
            object2 = n.a;
            n.e((String)object, g, i);
            m.g.a();
            g = null;
        }
        object = e;
        synchronized (object) {
            d = null;
            object2 = t.a;
            return;
        }
    }

    public static final void v(Activity object) {
        long l8;
        Intrinsics.checkNotNullParameter(object, "activity");
        l = new WeakReference(object);
        f.incrementAndGet();
        a.k();
        j = l8 = System.currentTimeMillis();
        String string2 = P.t((Context)object);
        B1.e.l((Activity)object);
        z1.b.d((Activity)object);
        K1.e.h((Activity)object);
        k.b();
        object = new b(l8, string2, object.getApplicationContext());
        c.execute((Runnable)object);
    }

    public static final void w(long l8, String object, Context context) {
        Intrinsics.checkNotNullParameter(object, "$activityName");
        Object object2 = g;
        object2 = object2 == null ? null : object2.e();
        if (g == null) {
            g = new m(l8, null, null, 4, null);
            object2 = n.a;
            object2 = i;
            Intrinsics.checkNotNullExpressionValue((Object)context, "appContext");
            n.c((String)object, null, (String)object2, context);
        } else if (object2 != null) {
            long l9 = l8 - object2.longValue();
            if (l9 > (long)(a.n() * 1000)) {
                object2 = n.a;
                n.e((String)object, g, i);
                object2 = i;
                Intrinsics.checkNotNullExpressionValue((Object)context, "appContext");
                n.c((String)object, null, (String)object2, context);
                g = new m(l8, null, null, 4, null);
            } else if (l9 > 1000L && (object = g) != null) {
                object.h();
            }
        }
        object = g;
        if (object != null) {
            object.k(l8);
        }
        object = g;
        if (object == null) {
            return;
        }
        object.m();
    }

    public static final void x(Application application, String string2) {
        Intrinsics.checkNotNullParameter((Object)application, "application");
        if (!h.compareAndSet(false, true)) {
            return;
        }
        O1.n n8 = O1.n.a;
        O1.n.a(n.b.t, new a());
        i = string2;
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(){

            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                C.e.b(N.s, b, "onActivityCreated");
                g.a();
                f.p(activity);
            }

            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                C.e.b(N.s, b, "onActivityDestroyed");
                f.a.r(activity);
            }

            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                C.e.b(N.s, b, "onActivityPaused");
                g.a();
                f.a.s(activity);
            }

            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                C.e.b(N.s, b, "onActivityResumed");
                g.a();
                f.v(activity);
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                Intrinsics.checkNotNullParameter((Object)bundle, "outState");
                C.e.b(N.s, b, "onActivitySaveInstanceState");
            }

            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                f.j(k + 1);
                C.e.b(N.s, b, "onActivityStarted");
            }

            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                C.e.b(N.s, b, "onActivityStopped");
                p.b.i();
                f.j(k - 1);
            }
        });
    }

    public static final void y(boolean bl) {
        if (bl) {
            B1.e.f();
            return;
        }
        B1.e.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        Object object = e;
        synchronized (object) {
            try {
                Object object2;
                if (d != null && (object2 = d) != null) {
                    object2.cancel(false);
                }
                d = null;
                object2 = t.a;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final int n() {
        Object object = v.a;
        object = v.f(B.m());
        if (object == null) {
            return j.a();
        }
        return object.k();
    }

    public final void r(Activity activity) {
        B1.e.j(activity);
    }

    public final void s(Activity object) {
        Object object2 = f;
        if (object2.decrementAndGet() < 0) {
            object2.set(0);
            Log.w((String)b, (String)"Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        this.k();
        long l8 = System.currentTimeMillis();
        object2 = P.t((Context)object);
        B1.e.k((Activity)object);
        object = new c(l8, (String)object2);
        c.execute((Runnable)object);
    }

}

