package P4;

import android.app.Application;
import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import r4.InterfaceC1922b;
import s3.C1947e;
import t0.AbstractC1977f;
import t3.C1991c;
import w3.InterfaceC2100a;
import z2.ComponentCallbacks2C2300c;

/* loaded from: classes.dex */
public class x {

    /* renamed from: j, reason: collision with root package name */
    public static final E2.e f4277j = E2.h.d();

    /* renamed from: k, reason: collision with root package name */
    public static final Random f4278k = new Random();

    /* renamed from: l, reason: collision with root package name */
    public static final Map f4279l = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Map f4280a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4281b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f4282c;

    /* renamed from: d, reason: collision with root package name */
    public final C1947e f4283d;

    /* renamed from: e, reason: collision with root package name */
    public final s4.i f4284e;

    /* renamed from: f, reason: collision with root package name */
    public final C1991c f4285f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1922b f4286g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4287h;

    /* renamed from: i, reason: collision with root package name */
    public Map f4288i;

    public static class a implements ComponentCallbacks2C2300c.a {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicReference f4289a = new AtomicReference();

        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f4289a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (AbstractC1977f.a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C2300c.c(application);
                    ComponentCallbacks2C2300c.b().a(aVar);
                }
            }
        }

        @Override // z2.ComponentCallbacks2C2300c.a
        public void a(boolean z7) {
            x.p(z7);
        }
    }

    public x(Context context, ScheduledExecutorService scheduledExecutorService, C1947e c1947e, s4.i iVar, C1991c c1991c, InterfaceC1922b interfaceC1922b) {
        this(context, scheduledExecutorService, c1947e, iVar, c1991c, interfaceC1922b, true);
    }

    public static com.google.firebase.remoteconfig.internal.d j(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.d(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    public static Q4.r k(C1947e c1947e, String str, InterfaceC1922b interfaceC1922b) {
        if (n(c1947e) && str.equals("firebase")) {
            return new Q4.r(interfaceC1922b);
        }
        return null;
    }

    public static boolean m(C1947e c1947e, String str) {
        return str.equals("firebase") && n(c1947e);
    }

    public static boolean n(C1947e c1947e) {
        return c1947e.q().equals("[DEFAULT]");
    }

    public static /* synthetic */ InterfaceC2100a o() {
        return null;
    }

    public static synchronized void p(boolean z7) {
        synchronized (x.class) {
            Iterator it = f4279l.values().iterator();
            while (it.hasNext()) {
                ((m) it.next()).y(z7);
            }
        }
    }

    public synchronized m c(String str) {
        Q4.e e7;
        Q4.e e8;
        Q4.e e9;
        com.google.firebase.remoteconfig.internal.d j7;
        Q4.l i7;
        try {
            e7 = e(str, "fetch");
            e8 = e(str, "activate");
            e9 = e(str, "defaults");
            j7 = j(this.f4281b, this.f4287h, str);
            i7 = i(e8, e9);
            final Q4.r k7 = k(this.f4283d, str, this.f4286g);
            if (k7 != null) {
                i7.b(new E2.d() { // from class: P4.u
                    @Override // E2.d
                    public final void a(Object obj, Object obj2) {
                        Q4.r.this.a((String) obj, (com.google.firebase.remoteconfig.internal.b) obj2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return d(this.f4283d, str, this.f4284e, this.f4285f, this.f4282c, e7, e8, e9, g(str, e7, j7), i7, j7);
    }

    public synchronized m d(C1947e c1947e, String str, s4.i iVar, C1991c c1991c, Executor executor, Q4.e eVar, Q4.e eVar2, Q4.e eVar3, com.google.firebase.remoteconfig.internal.c cVar, Q4.l lVar, com.google.firebase.remoteconfig.internal.d dVar) {
        try {
            if (!this.f4280a.containsKey(str)) {
                m mVar = new m(this.f4281b, c1947e, iVar, m(c1947e, str) ? c1991c : null, executor, eVar, eVar2, eVar3, cVar, lVar, dVar, l(c1947e, iVar, cVar, eVar2, this.f4281b, str, dVar));
                mVar.B();
                this.f4280a.put(str, mVar);
                f4279l.put(str, mVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (m) this.f4280a.get(str);
    }

    public final Q4.e e(String str, String str2) {
        return Q4.e.h(this.f4282c, Q4.p.c(this.f4281b, String.format("%s_%s_%s_%s.json", "frc", this.f4287h, str, str2)));
    }

    public m f() {
        return c("firebase");
    }

    public synchronized com.google.firebase.remoteconfig.internal.c g(String str, Q4.e eVar, com.google.firebase.remoteconfig.internal.d dVar) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.c(this.f4284e, n(this.f4283d) ? this.f4286g : new InterfaceC1922b() { // from class: P4.w
            @Override // r4.InterfaceC1922b
            public final Object get() {
                InterfaceC2100a o7;
                o7 = x.o();
                return o7;
            }
        }, this.f4282c, f4277j, f4278k, eVar, h(this.f4283d.r().b(), str, dVar), dVar, this.f4288i);
    }

    public ConfigFetchHttpClient h(String str, String str2, com.google.firebase.remoteconfig.internal.d dVar) {
        return new ConfigFetchHttpClient(this.f4281b, this.f4283d.r().c(), str, str2, dVar.b(), dVar.b());
    }

    public final Q4.l i(Q4.e eVar, Q4.e eVar2) {
        return new Q4.l(this.f4282c, eVar, eVar2);
    }

    public synchronized Q4.m l(C1947e c1947e, s4.i iVar, com.google.firebase.remoteconfig.internal.c cVar, Q4.e eVar, Context context, String str, com.google.firebase.remoteconfig.internal.d dVar) {
        return new Q4.m(c1947e, iVar, cVar, eVar, context, str, dVar, this.f4282c);
    }

    public x(Context context, ScheduledExecutorService scheduledExecutorService, C1947e c1947e, s4.i iVar, C1991c c1991c, InterfaceC1922b interfaceC1922b, boolean z7) {
        this.f4280a = new HashMap();
        this.f4288i = new HashMap();
        this.f4281b = context;
        this.f4282c = scheduledExecutorService;
        this.f4283d = c1947e;
        this.f4284e = iVar;
        this.f4285f = c1991c;
        this.f4286g = interfaceC1922b;
        this.f4287h = c1947e.r().c();
        a.c(context);
        if (z7) {
            V2.m.c(scheduledExecutorService, new Callable() { // from class: P4.v
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return x.this.f();
                }
            });
        }
    }
}
