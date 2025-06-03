package s3;

import A2.AbstractC0327m;
import A2.AbstractC0328n;
import B3.C0342c;
import B3.C0346g;
import B3.o;
import B3.x;
import C3.B;
import E.r;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n4.InterfaceC1730c;
import o4.C1761f;
import r4.InterfaceC1922b;
import t.C1958a;
import t0.AbstractC1977f;
import x4.C2219a;
import z2.ComponentCallbacks2C2300c;

/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1947e {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f19237k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Map f19238l = new C1958a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f19239a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19240b;

    /* renamed from: c, reason: collision with root package name */
    public final m f19241c;

    /* renamed from: d, reason: collision with root package name */
    public final o f19242d;

    /* renamed from: g, reason: collision with root package name */
    public final x f19245g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1922b f19246h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f19243e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f19244f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final List f19247i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final List f19248j = new CopyOnWriteArrayList();

    /* renamed from: s3.e$a */
    public interface a {
        void a(boolean z7);
    }

    /* renamed from: s3.e$b */
    public static class b implements ComponentCallbacks2C2300c.a {

        /* renamed from: a, reason: collision with root package name */
        public static AtomicReference f19249a = new AtomicReference();

        public static void c(Context context) {
            if (E2.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f19249a.get() == null) {
                    b bVar = new b();
                    if (AbstractC1977f.a(f19249a, null, bVar)) {
                        ComponentCallbacks2C2300c.c(application);
                        ComponentCallbacks2C2300c.b().a(bVar);
                    }
                }
            }
        }

        @Override // z2.ComponentCallbacks2C2300c.a
        public void a(boolean z7) {
            synchronized (C1947e.f19237k) {
                try {
                    Iterator it = new ArrayList(C1947e.f19238l.values()).iterator();
                    while (it.hasNext()) {
                        C1947e c1947e = (C1947e) it.next();
                        if (c1947e.f19243e.get()) {
                            c1947e.C(z7);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: s3.e$c */
    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static AtomicReference f19250b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        public final Context f19251a;

        public c(Context context) {
            this.f19251a = context;
        }

        public static void b(Context context) {
            if (f19250b.get() == null) {
                c cVar = new c(context);
                if (AbstractC1977f.a(f19250b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f19251a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C1947e.f19237k) {
                try {
                    Iterator it = C1947e.f19238l.values().iterator();
                    while (it.hasNext()) {
                        ((C1947e) it.next()).t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    public C1947e(final Context context, String str, m mVar) {
        this.f19239a = (Context) AbstractC0328n.i(context);
        this.f19240b = AbstractC0328n.e(str);
        this.f19241c = (m) AbstractC0328n.i(mVar);
        n b7 = FirebaseInitProvider.b();
        U4.c.b("Firebase");
        U4.c.b("ComponentDiscovery");
        List b8 = C0346g.c(context, ComponentDiscoveryService.class).b();
        U4.c.a();
        U4.c.b("Runtime");
        o.b g7 = o.m(B.INSTANCE).d(b8).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C0342c.s(context, Context.class, new Class[0])).b(C0342c.s(this, C1947e.class, new Class[0])).b(C0342c.s(mVar, m.class, new Class[0])).g(new U4.b());
        if (r.a(context) && FirebaseInitProvider.c()) {
            g7.b(C0342c.s(b7, n.class, new Class[0]));
        }
        o e7 = g7.e();
        this.f19242d = e7;
        U4.c.a();
        this.f19245g = new x(new InterfaceC1922b() { // from class: s3.c
            @Override // r4.InterfaceC1922b
            public final Object get() {
                C2219a z7;
                z7 = C1947e.this.z(context);
                return z7;
            }
        });
        this.f19246h = e7.g(C1761f.class);
        g(new a() { // from class: s3.d
            @Override // s3.C1947e.a
            public final void a(boolean z7) {
                C1947e.this.A(z7);
            }
        });
        U4.c.a();
    }

    public static String B(String str) {
        return str.trim();
    }

    public static List l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f19237k) {
            try {
                Iterator it = f19238l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1947e) it.next()).q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List n(Context context) {
        ArrayList arrayList;
        synchronized (f19237k) {
            arrayList = new ArrayList(f19238l.values());
        }
        return arrayList;
    }

    public static C1947e o() {
        C1947e c1947e;
        synchronized (f19237k) {
            try {
                c1947e = (C1947e) f19238l.get("[DEFAULT]");
                if (c1947e == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + E2.m.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C1761f) c1947e.f19246h.get()).l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1947e;
    }

    public static C1947e p(String str) {
        C1947e c1947e;
        String str2;
        synchronized (f19237k) {
            try {
                c1947e = (C1947e) f19238l.get(B(str));
                if (c1947e == null) {
                    List l7 = l();
                    if (l7.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", l7);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((C1761f) c1947e.f19246h.get()).l();
            } finally {
            }
        }
        return c1947e;
    }

    public static C1947e u(Context context) {
        synchronized (f19237k) {
            try {
                if (f19238l.containsKey("[DEFAULT]")) {
                    return o();
                }
                m a7 = m.a(context);
                if (a7 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return v(context, a7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1947e v(Context context, m mVar) {
        return w(context, mVar, "[DEFAULT]");
    }

    public static C1947e w(Context context, m mVar, String str) {
        C1947e c1947e;
        b.c(context);
        String B7 = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f19237k) {
            Map map = f19238l;
            AbstractC0328n.m(!map.containsKey(B7), "FirebaseApp name " + B7 + " already exists!");
            AbstractC0328n.j(context, "Application context cannot be null.");
            c1947e = new C1947e(context, B7, mVar);
            map.put(B7, c1947e);
        }
        c1947e.t();
        return c1947e;
    }

    public final /* synthetic */ void A(boolean z7) {
        if (z7) {
            return;
        }
        ((C1761f) this.f19246h.get()).l();
    }

    public final void C(boolean z7) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f19247i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z7);
        }
    }

    public final void D() {
        Iterator it = this.f19248j.iterator();
        while (it.hasNext()) {
            ((InterfaceC1948f) it.next()).a(this.f19240b, this.f19241c);
        }
    }

    public void E(boolean z7) {
        boolean z8;
        i();
        if (this.f19243e.compareAndSet(!z7, z7)) {
            boolean d7 = ComponentCallbacks2C2300c.b().d();
            if (z7 && d7) {
                z8 = true;
            } else if (z7 || !d7) {
                return;
            } else {
                z8 = false;
            }
            C(z8);
        }
    }

    public void F(Boolean bool) {
        i();
        ((C2219a) this.f19245g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1947e) {
            return this.f19240b.equals(((C1947e) obj).q());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f19243e.get() && ComponentCallbacks2C2300c.b().d()) {
            aVar.a(true);
        }
        this.f19247i.add(aVar);
    }

    public void h(InterfaceC1948f interfaceC1948f) {
        i();
        AbstractC0328n.i(interfaceC1948f);
        this.f19248j.add(interfaceC1948f);
    }

    public int hashCode() {
        return this.f19240b.hashCode();
    }

    public final void i() {
        AbstractC0328n.m(!this.f19244f.get(), "FirebaseApp was deleted");
    }

    public void j() {
        if (this.f19244f.compareAndSet(false, true)) {
            synchronized (f19237k) {
                f19238l.remove(this.f19240b);
            }
            D();
        }
    }

    public Object k(Class cls) {
        i();
        return this.f19242d.a(cls);
    }

    public Context m() {
        i();
        return this.f19239a;
    }

    public String q() {
        i();
        return this.f19240b;
    }

    public m r() {
        i();
        return this.f19241c;
    }

    public String s() {
        return E2.c.a(q().getBytes(Charset.defaultCharset())) + "+" + E2.c.a(r().c().getBytes(Charset.defaultCharset()));
    }

    public final void t() {
        if (!r.a(this.f19239a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f19239a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f19242d.p(y());
        ((C1761f) this.f19246h.get()).l();
    }

    public String toString() {
        return AbstractC0327m.c(this).a("name", this.f19240b).a("options", this.f19241c).toString();
    }

    public boolean x() {
        i();
        return ((C2219a) this.f19245g.get()).b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }

    public final /* synthetic */ C2219a z(Context context) {
        return new C2219a(context, s(), (InterfaceC1730c) this.f19242d.a(InterfaceC1730c.class));
    }
}
