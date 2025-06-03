// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import java.util.Iterator;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import E2.l;
import android.content.ComponentCallbacks;
import android.app.Application;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.ComponentCallbacks2;
import android.app.Application$ActivityLifecycleCallbacks;

public final class c implements Application$ActivityLifecycleCallbacks, ComponentCallbacks2
{
    public static final c s;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final ArrayList q;
    public boolean r;
    
    static {
        s = new c();
    }
    
    public c() {
        this.o = new AtomicBoolean();
        this.p = new AtomicBoolean();
        this.q = new ArrayList();
        this.r = false;
    }
    
    public static c b() {
        return c.s;
    }
    
    public static void c(final Application application) {
        final c s = c.s;
        // monitorenter(s)
        while (true) {
            try {
                if (!s.r) {
                    application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)s);
                    application.registerComponentCallbacks((ComponentCallbacks)s);
                    s.r = true;
                }
                // monitorexit(s)
                return;
                // monitorexit(s)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void a(final a e) {
        synchronized (c.s) {
            this.q.add(e);
        }
    }
    
    public boolean d() {
        return this.o.get();
    }
    
    public boolean e(final boolean b) {
        if (!this.p.get()) {
            if (!l.b()) {
                return b;
            }
            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
            if (!this.p.getAndSet(true) && activityManager$RunningAppProcessInfo.importance > 100) {
                this.o.set(true);
            }
        }
        return this.d();
    }
    
    public final void f(final boolean b) {
        final c s = c.s;
        // monitorenter(s)
        while (true) {
            try {
                final Iterator<a> iterator = this.q.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(b);
                }
                // monitorexit(s)
                return;
                // monitorexit(s)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        final boolean compareAndSet = this.o.compareAndSet(true, false);
        this.p.set(true);
        if (compareAndSet) {
            this.f(false);
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        final boolean compareAndSet = this.o.compareAndSet(true, false);
        this.p.set(true);
        if (compareAndSet) {
            this.f(false);
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(final int n) {
        if (n == 20 && this.o.compareAndSet(false, true)) {
            this.p.set(true);
            this.f(true);
        }
    }
    
    public interface a
    {
        void a(final boolean p0);
    }
}
