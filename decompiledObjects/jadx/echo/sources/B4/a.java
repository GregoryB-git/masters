package B4;

import G4.h;
import L4.k;
import M4.g;
import M4.j;
import M4.l;
import N4.m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: F, reason: collision with root package name */
    public static final F4.a f808F = F4.a.e();

    /* renamed from: G, reason: collision with root package name */
    public static volatile a f809G;

    /* renamed from: A, reason: collision with root package name */
    public l f810A;

    /* renamed from: B, reason: collision with root package name */
    public l f811B;

    /* renamed from: C, reason: collision with root package name */
    public N4.d f812C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f813D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f814E;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap f815o;

    /* renamed from: p, reason: collision with root package name */
    public final WeakHashMap f816p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakHashMap f817q;

    /* renamed from: r, reason: collision with root package name */
    public final WeakHashMap f818r;

    /* renamed from: s, reason: collision with root package name */
    public final Map f819s;

    /* renamed from: t, reason: collision with root package name */
    public final Set f820t;

    /* renamed from: u, reason: collision with root package name */
    public Set f821u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicInteger f822v;

    /* renamed from: w, reason: collision with root package name */
    public final k f823w;

    /* renamed from: x, reason: collision with root package name */
    public final C4.a f824x;

    /* renamed from: y, reason: collision with root package name */
    public final M4.a f825y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f826z;

    /* renamed from: B4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0010a {
        void a();
    }

    public interface b {
        void b(N4.d dVar);
    }

    public a(k kVar, M4.a aVar) {
        this(kVar, aVar, C4.a.g(), f());
    }

    public static a b() {
        if (f809G == null) {
            synchronized (a.class) {
                try {
                    if (f809G == null) {
                        f809G = new a(k.l(), new M4.a());
                    }
                } finally {
                }
            }
        }
        return f809G;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    public static boolean f() {
        return d.a();
    }

    public N4.d a() {
        return this.f812C;
    }

    public void d(String str, long j7) {
        synchronized (this.f819s) {
            try {
                Long l7 = (Long) this.f819s.get(str);
                if (l7 == null) {
                    this.f819s.put(str, Long.valueOf(j7));
                } else {
                    this.f819s.put(str, Long.valueOf(l7.longValue() + j7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i7) {
        this.f822v.addAndGet(i7);
    }

    public boolean g() {
        return this.f826z;
    }

    public synchronized void h(Context context) {
        if (this.f813D) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f813D = true;
        }
    }

    public void i(InterfaceC0010a interfaceC0010a) {
        synchronized (this.f821u) {
            this.f821u.add(interfaceC0010a);
        }
    }

    public void j(WeakReference weakReference) {
        synchronized (this.f820t) {
            this.f820t.add(weakReference);
        }
    }

    public final void k() {
        synchronized (this.f821u) {
            try {
                for (InterfaceC0010a interfaceC0010a : this.f821u) {
                    if (interfaceC0010a != null) {
                        interfaceC0010a.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(Activity activity) {
        Trace trace = (Trace) this.f818r.get(activity);
        if (trace == null) {
            return;
        }
        this.f818r.remove(activity);
        g e7 = ((d) this.f816p.get(activity)).e();
        if (!e7.d()) {
            f808F.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            j.a(trace, (h.a) e7.c());
            trace.stop();
        }
    }

    public final void m(String str, l lVar, l lVar2) {
        if (this.f824x.L()) {
            m.b F6 = m.z0().N(str).L(lVar.e()).M(lVar.d(lVar2)).F(SessionManager.getInstance().perfSession().a());
            int andSet = this.f822v.getAndSet(0);
            synchronized (this.f819s) {
                try {
                    F6.H(this.f819s);
                    if (andSet != 0) {
                        F6.J(M4.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f819s.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f823w.D((m) F6.v(), N4.d.FOREGROUND_BACKGROUND);
        }
    }

    public final void n(Activity activity) {
        if (g() && this.f824x.L()) {
            d dVar = new d(activity);
            this.f816p.put(activity, dVar);
            if (activity instanceof e) {
                c cVar = new c(this.f825y, this.f823w, this, dVar);
                this.f817q.put(activity, cVar);
                ((e) activity).n().W0(cVar, true);
            }
        }
    }

    public void o(WeakReference weakReference) {
        synchronized (this.f820t) {
            this.f820t.remove(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        n(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f816p.remove(activity);
        if (this.f817q.containsKey(activity)) {
            ((e) activity).n().m1((n.l) this.f817q.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f815o.isEmpty()) {
                this.f810A = this.f825y.a();
                this.f815o.put(activity, Boolean.TRUE);
                if (this.f814E) {
                    p(N4.d.FOREGROUND);
                    k();
                    this.f814E = false;
                } else {
                    m(M4.c.BACKGROUND_TRACE_NAME.toString(), this.f811B, this.f810A);
                    p(N4.d.FOREGROUND);
                }
            } else {
                this.f815o.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (g() && this.f824x.L()) {
                if (!this.f816p.containsKey(activity)) {
                    n(activity);
                }
                ((d) this.f816p.get(activity)).c();
                Trace trace = new Trace(c(activity), this.f823w, this.f825y, this);
                trace.start();
                this.f818r.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (g()) {
                l(activity);
            }
            if (this.f815o.containsKey(activity)) {
                this.f815o.remove(activity);
                if (this.f815o.isEmpty()) {
                    this.f811B = this.f825y.a();
                    m(M4.c.FOREGROUND_TRACE_NAME.toString(), this.f810A, this.f811B);
                    p(N4.d.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void p(N4.d dVar) {
        this.f812C = dVar;
        synchronized (this.f820t) {
            try {
                Iterator it = this.f820t.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.b(this.f812C);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a(k kVar, M4.a aVar, C4.a aVar2, boolean z7) {
        this.f815o = new WeakHashMap();
        this.f816p = new WeakHashMap();
        this.f817q = new WeakHashMap();
        this.f818r = new WeakHashMap();
        this.f819s = new HashMap();
        this.f820t = new HashSet();
        this.f821u = new HashSet();
        this.f822v = new AtomicInteger(0);
        this.f812C = N4.d.BACKGROUND;
        this.f813D = false;
        this.f814E = true;
        this.f823w = kVar;
        this.f825y = aVar;
        this.f824x = aVar2;
        this.f826z = z7;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
