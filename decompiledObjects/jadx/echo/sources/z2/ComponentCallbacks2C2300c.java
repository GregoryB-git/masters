package z2;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: z2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C2300c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: s, reason: collision with root package name */
    public static final ComponentCallbacks2C2300c f21709s = new ComponentCallbacks2C2300c();

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f21710o = new AtomicBoolean();

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f21711p = new AtomicBoolean();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f21712q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f21713r = false;

    /* renamed from: z2.c$a */
    public interface a {
        void a(boolean z7);
    }

    public static ComponentCallbacks2C2300c b() {
        return f21709s;
    }

    public static void c(Application application) {
        ComponentCallbacks2C2300c componentCallbacks2C2300c = f21709s;
        synchronized (componentCallbacks2C2300c) {
            try {
                if (!componentCallbacks2C2300c.f21713r) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C2300c);
                    application.registerComponentCallbacks(componentCallbacks2C2300c);
                    componentCallbacks2C2300c.f21713r = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f21709s) {
            this.f21712q.add(aVar);
        }
    }

    public boolean d() {
        return this.f21710o.get();
    }

    public boolean e(boolean z7) {
        if (!this.f21711p.get()) {
            if (!E2.l.b()) {
                return z7;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f21711p.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f21710o.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z7) {
        synchronized (f21709s) {
            try {
                Iterator it = this.f21712q.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f21710o.compareAndSet(true, false);
        this.f21711p.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f21710o.compareAndSet(true, false);
        this.f21711p.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f21710o.compareAndSet(false, true)) {
            this.f21711p.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
