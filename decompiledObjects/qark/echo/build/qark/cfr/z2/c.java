/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.ComponentCallbacks
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package z2;

import E2.l;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c
implements Application.ActivityLifecycleCallbacks,
ComponentCallbacks2 {
    public static final c s = new c();
    public final AtomicBoolean o = new AtomicBoolean();
    public final AtomicBoolean p = new AtomicBoolean();
    public final ArrayList q = new ArrayList();
    public boolean r = false;

    public static c b() {
        return s;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Application application) {
        c c8 = s;
        synchronized (c8) {
            try {
                if (!c8.r) {
                    application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)c8);
                    application.registerComponentCallbacks((ComponentCallbacks)c8);
                    c8.r = true;
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(a a8) {
        c c8 = s;
        synchronized (c8) {
            this.q.add((Object)a8);
            return;
        }
    }

    public boolean d() {
        return this.o.get();
    }

    public boolean e(boolean bl) {
        if (!this.p.get()) {
            if (l.b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)runningAppProcessInfo);
                if (!this.p.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.o.set(true);
                }
            } else {
                return bl;
            }
        }
        return this.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(boolean bl) {
        c c8 = s;
        synchronized (c8) {
            try {
                Iterator iterator = this.q.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    ((a)iterator.next()).a(bl);
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean bl = this.o.compareAndSet(true, false);
        this.p.set(true);
        if (bl) {
            this.f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean bl = this.o.compareAndSet(true, false);
        this.p.set(true);
        if (bl) {
            this.f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int n8) {
        if (n8 == 20 && this.o.compareAndSet(false, true)) {
            this.p.set(true);
            this.f(true);
        }
    }

    public static interface a {
        public void a(boolean var1);
    }

}

