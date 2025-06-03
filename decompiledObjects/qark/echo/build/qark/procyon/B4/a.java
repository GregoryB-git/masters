// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B4;

import com.google.protobuf.r;
import android.os.Bundle;
import androidx.fragment.app.n;
import androidx.fragment.app.e;
import M4.b;
import com.google.firebase.perf.session.SessionManager;
import N4.m;
import M4.g;
import M4.j;
import G4.h;
import com.google.firebase.perf.metrics.Trace;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.app.Application;
import android.content.Context;
import android.app.Activity;
import java.util.HashSet;
import java.util.HashMap;
import L4.k;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Set;
import java.util.Map;
import java.util.WeakHashMap;
import N4.d;
import M4.l;
import android.app.Application$ActivityLifecycleCallbacks;

public class a implements Application$ActivityLifecycleCallbacks
{
    public static final a F;
    public static volatile a G;
    public l A;
    public l B;
    public d C;
    public boolean D;
    public boolean E;
    public final WeakHashMap o;
    public final WeakHashMap p;
    public final WeakHashMap q;
    public final WeakHashMap r;
    public final Map s;
    public final Set t;
    public Set u;
    public final AtomicInteger v;
    public final k w;
    public final C4.a x;
    public final M4.a y;
    public final boolean z;
    
    static {
        F = a.e();
    }
    
    public a(final k k, final M4.a a) {
        this(k, a, C4.a.g(), f());
    }
    
    public a(final k w, final M4.a y, final C4.a x, final boolean z) {
        this.o = new WeakHashMap();
        this.p = new WeakHashMap();
        this.q = new WeakHashMap();
        this.r = new WeakHashMap();
        this.s = new HashMap();
        this.t = new HashSet();
        this.u = new HashSet();
        this.v = new AtomicInteger(0);
        this.C = d.r;
        this.D = false;
        this.E = true;
        this.w = w;
        this.y = y;
        this.x = x;
        this.z = z;
    }
    
    public static a b() {
        while (true) {
            if (a.G == null) {
                // monitorenter(a.class)
                while (true) {
                    try {
                        if (a.G == null) {
                            a.G = new a(k.l(), new M4.a());
                        }
                        // monitorexit(a.class)
                        return a.G;
                    }
                    // monitorexit(a.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public static String c(final Activity activity) {
        final StringBuilder sb = new StringBuilder();
        sb.append("_st_");
        sb.append(activity.getClass().getSimpleName());
        return sb.toString();
    }
    
    public static boolean f() {
        return B4.d.a();
    }
    
    public d a() {
        return this.C;
    }
    
    public void d(final String s, final long l) {
        final Map s2 = this.s;
        // monitorenter(s2)
        while (true) {
            try {
                final Long n = this.s.get(s);
                if (n == null) {
                    this.s.put(s, l);
                }
                else {
                    this.s.put(s, n + l);
                }
                // monitorexit(s2)
                return;
                // monitorexit(s2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void e(final int delta) {
        this.v.addAndGet(delta);
    }
    
    public boolean g() {
        return this.z;
    }
    
    public void h(Context applicationContext) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0049: {
            try {
                if (this.D) {
                    // monitorexit(this)
                    return;
                }
                applicationContext = applicationContext.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application)applicationContext).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
                    this.D = true;
                }
            }
            finally {
                break Label_0049;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void i(final a a) {
        synchronized (this.u) {
            this.u.add(a);
        }
    }
    
    public void j(final WeakReference weakReference) {
        synchronized (this.t) {
            this.t.add(weakReference);
        }
    }
    
    public final void k() {
        final Set u = this.u;
        // monitorenter(u)
        while (true) {
            try {
                for (final a a : this.u) {
                    if (a != null) {
                        a.a();
                    }
                }
                // monitorexit(u)
                return;
                // monitorexit(u)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void l(final Activity key) {
        final Trace trace = this.r.get(key);
        if (trace == null) {
            return;
        }
        this.r.remove(key);
        final g e = this.p.get(key).e();
        if (!e.d()) {
            a.F.k("Failed to record frame data for %s.", key.getClass().getSimpleName());
            return;
        }
        j.a(trace, (h.a)e.c());
        trace.stop();
    }
    
    public final void m(String s, final l l, final l i) {
        if (!this.x.L()) {
            return;
        }
        final m.b f = m.z0().N(s).L(l.e()).M(l.d(i)).F(SessionManager.getInstance().perfSession().a());
        final int andSet = this.v.getAndSet(0);
        s = (String)this.s;
        // monitorenter(s)
        while (true) {
            try {
                f.H(this.s);
                if (andSet != 0) {
                    f.J(M4.b.r.toString(), andSet);
                }
                this.s.clear();
                // monitorexit(s)
                this.w.D((m)((r.a)f).v(), d.s);
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
    
    public final void n(final Activity activity) {
        if (this.g() && this.x.L()) {
            final B4.d value = new B4.d(activity);
            this.p.put(activity, value);
            if (activity instanceof e) {
                final c value2 = new c(this.y, this.w, this, value);
                this.q.put(activity, value2);
                ((e)activity).n().W0((n.l)value2, true);
            }
        }
    }
    
    public void o(final WeakReference weakReference) {
        synchronized (this.t) {
            this.t.remove(weakReference);
        }
    }
    
    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.n(activity);
    }
    
    public void onActivityDestroyed(final Activity key) {
        this.p.remove(key);
        if (this.q.containsKey(key)) {
            ((e)key).n().m1((n.l)this.q.remove(key));
        }
    }
    
    public void onActivityPaused(final Activity activity) {
    }
    
    public void onActivityResumed(final Activity activity) {
        // monitorenter(this)
        while (true) {
            try {
                if (this.o.isEmpty()) {
                    this.A = this.y.a();
                    this.o.put(activity, Boolean.TRUE);
                    if (this.E) {
                        this.p(d.q);
                        this.k();
                        this.E = false;
                    }
                    else {
                        this.m(M4.c.u.toString(), this.B, this.A);
                        this.p(d.q);
                    }
                }
                else {
                    this.o.put(activity, Boolean.TRUE);
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
    
    public void onActivityStarted(final Activity key) {
        // monitorenter(this)
        while (true) {
            try {
                if (this.g() && this.x.L()) {
                    if (!this.p.containsKey(key)) {
                        this.n(key);
                    }
                    this.p.get(key).c();
                    final Trace value = new Trace(c(key), this.w, this.y, this);
                    value.start();
                    this.r.put(key, value);
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
    
    public void onActivityStopped(final Activity activity) {
        // monitorenter(this)
        while (true) {
            try {
                if (this.g()) {
                    this.l(activity);
                }
                if (this.o.containsKey(activity)) {
                    this.o.remove(activity);
                    if (this.o.isEmpty()) {
                        this.B = this.y.a();
                        this.m(M4.c.t.toString(), this.A, this.B);
                        this.p(d.r);
                    }
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
    
    public final void p(d t) {
        this.C = t;
        t = (d)this.t;
        // monitorenter(t)
        while (true) {
            try {
                final Iterator<WeakReference<b>> iterator = (Iterator<WeakReference<b>>)this.t.iterator();
                while (iterator.hasNext()) {
                    final b b = iterator.next().get();
                    if (b != null) {
                        b.b(this.C);
                    }
                    else {
                        iterator.remove();
                    }
                }
                // monitorexit(t)
                return;
                // monitorexit(t)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public interface a
    {
        void a();
    }
    
    public interface b
    {
        void b(final d p0);
    }
}
