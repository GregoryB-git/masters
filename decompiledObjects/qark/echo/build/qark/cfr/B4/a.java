/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.WeakHashMap
 *  java.util.concurrent.atomic.AtomicInteger
 */
package B4;

import B4.c;
import B4.d;
import G4.h;
import M4.g;
import M4.j;
import M4.l;
import N4.k;
import N4.m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.r;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class a
implements Application.ActivityLifecycleCallbacks {
    public static final F4.a F = F4.a.e();
    public static volatile a G;
    public l A;
    public l B;
    public N4.d C = N4.d.r;
    public boolean D = false;
    public boolean E = true;
    public final WeakHashMap o = new WeakHashMap();
    public final WeakHashMap p = new WeakHashMap();
    public final WeakHashMap q = new WeakHashMap();
    public final WeakHashMap r = new WeakHashMap();
    public final Map s = new HashMap();
    public final Set t = new HashSet();
    public Set u = new HashSet();
    public final AtomicInteger v = new AtomicInteger(0);
    public final L4.k w;
    public final C4.a x;
    public final M4.a y;
    public final boolean z;

    public a(L4.k k8, M4.a a8) {
        this(k8, a8, C4.a.g(), a.f());
    }

    public a(L4.k k8, M4.a a8, C4.a a9, boolean bl) {
        this.w = k8;
        this.y = a8;
        this.x = a9;
        this.z = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b() {
        if (G != null) return G;
        synchronized (a.class) {
            try {
                if (G != null) return G;
                G = new a(L4.k.l(), new M4.a());
                return G;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static String c(Activity activity) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("_st_");
        stringBuilder.append(activity.getClass().getSimpleName());
        return stringBuilder.toString();
    }

    public static boolean f() {
        return d.a();
    }

    public N4.d a() {
        return this.C;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(String string2, long l8) {
        Map map = this.s;
        synchronized (map) {
            try {
                Long l9 = (Long)this.s.get((Object)string2);
                if (l9 == null) {
                    this.s.put((Object)string2, (Object)l8);
                } else {
                    this.s.put((Object)string2, (Object)(l9 + l8));
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void e(int n8) {
        this.v.addAndGet(n8);
    }

    public boolean g() {
        return this.z;
    }

    public void h(Context context) {
        synchronized (this) {
            Throwable throwable2;
            block6 : {
                block5 : {
                    block4 : {
                        try {
                            boolean bl = this.D;
                            if (!bl) break block4;
                        }
                        catch (Throwable throwable2) {}
                        return;
                    }
                    context = context.getApplicationContext();
                    if (!(context instanceof Application)) break block5;
                    ((Application)context).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
                    this.D = true;
                    break block5;
                    break block6;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i(a a8) {
        Set set = this.u;
        synchronized (set) {
            this.u.add((Object)a8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j(WeakReference weakReference) {
        Set set = this.t;
        synchronized (set) {
            this.t.add((Object)weakReference);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        Set set = this.u;
        synchronized (set) {
            try {
                Iterator iterator = this.u.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    a a8 = (a)iterator.next();
                    if (a8 == null) continue;
                    a8.a();
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void l(Activity activity) {
        Trace trace = (Trace)this.r.get((Object)activity);
        if (trace == null) {
            return;
        }
        this.r.remove((Object)activity);
        g g8 = ((d)this.p.get((Object)activity)).e();
        if (!g8.d()) {
            F.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
            return;
        }
        j.a(trace, (h.a)g8.c());
        trace.stop();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void m(String string2, l object, l l8) {
        if (!this.x.L()) {
            return;
        }
        object = m.z0().N(string2).L(object.e()).M(object.d(l8)).F(SessionManager.getInstance().perfSession().a());
        int n8 = this.v.getAndSet(0);
        string2 = this.s;
        // MONITORENTER : string2
        object.H(this.s);
        if (n8 != 0) {
            object.J(M4.b.r.toString(), n8);
        }
        this.s.clear();
        // MONITOREXIT : string2
        this.w.D((m)object.v(), N4.d.s);
    }

    public final void n(Activity activity) {
        if (this.g() && this.x.L()) {
            Object object = new d(activity);
            this.p.put((Object)activity, object);
            if (activity instanceof e) {
                object = new c(this.y, this.w, this, (d)object);
                this.q.put((Object)activity, object);
                ((e)activity).n().W0((n.l)object, true);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void o(WeakReference weakReference) {
        Set set = this.t;
        synchronized (set) {
            this.t.remove((Object)weakReference);
            return;
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.n(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        this.p.remove((Object)activity);
        if (this.q.containsKey((Object)activity)) {
            ((e)activity).n().m1((n.l)this.q.remove((Object)activity));
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityResumed(Activity activity) {
        synchronized (this) {
            try {
                if (this.o.isEmpty()) {
                    this.A = this.y.a();
                    this.o.put((Object)activity, (Object)Boolean.TRUE);
                    if (this.E) {
                        this.p(N4.d.q);
                        this.k();
                        this.E = false;
                    } else {
                        this.m(M4.c.u.toString(), this.B, this.A);
                        this.p(N4.d.q);
                    }
                } else {
                    this.o.put((Object)activity, (Object)Boolean.TRUE);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityStarted(Activity activity) {
        synchronized (this) {
            try {
                if (this.g() && this.x.L()) {
                    if (!this.p.containsKey((Object)activity)) {
                        this.n(activity);
                    }
                    ((d)this.p.get((Object)activity)).c();
                    Trace trace = new Trace(a.c(activity), this.w, this.y, this);
                    trace.start();
                    this.r.put((Object)activity, (Object)trace);
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
    public void onActivityStopped(Activity activity) {
        synchronized (this) {
            try {
                if (this.g()) {
                    this.l(activity);
                }
                if (this.o.containsKey((Object)activity)) {
                    this.o.remove((Object)activity);
                    if (this.o.isEmpty()) {
                        this.B = this.y.a();
                        this.m(M4.c.t.toString(), this.A, this.B);
                        this.p(N4.d.r);
                    }
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
    public final void p(N4.d d8) {
        this.C = d8;
        d8 = this.t;
        synchronized (d8) {
            try {
                Iterator iterator = this.t.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    b b8 = (b)((WeakReference)iterator.next()).get();
                    if (b8 != null) {
                        b8.b(this.C);
                        continue;
                    }
                    iterator.remove();
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static interface a {
        public void a();
    }

    public static interface b {
        public void b(N4.d var1);
    }

}

