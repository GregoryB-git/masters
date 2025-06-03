package L5;

import A5.a;
import E5.d;
import E5.k;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import android.util.Log;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import s3.C1947e;

/* loaded from: classes.dex */
public class w implements FlutterFirebasePlugin, A5.a, k.c {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f3455e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f3456a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3457b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public E5.k f3458c;

    /* renamed from: d, reason: collision with root package name */
    public E5.c f3459d;

    public static /* synthetic */ void E(C0660k c0660k) {
        try {
            c0660k.c(new HashMap());
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void J(k.d dVar, E5.j jVar, AbstractC0659j abstractC0659j) {
        y c7;
        if (abstractC0659j.n()) {
            dVar.a(abstractC0659j.j());
            return;
        }
        Exception i7 = abstractC0659j.i();
        if (i7 instanceof y) {
            c7 = (y) i7;
        } else if (i7 instanceof Q3.d) {
            c7 = y.b((Q3.d) i7);
        } else {
            Log.e("firebase_database", "An unknown error occurred handling native method call " + jVar.f1670a, i7);
            c7 = y.c(i7);
        }
        dVar.b(c7.e(), c7.getMessage(), c7.d());
    }

    public static void b0(Q3.h hVar, String str) {
        HashMap hashMap = f3455e;
        synchronized (hashMap) {
            try {
                if (((Q3.h) hashMap.get(str)) == null) {
                    hashMap.put(str, hVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Q3.h v(String str) {
        Q3.h hVar;
        HashMap hashMap = f3455e;
        synchronized (hashMap) {
            hVar = (Q3.h) hashMap.get(str);
        }
        return hVar;
    }

    public final AbstractC0659j A(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.u
            @Override // java.lang.Runnable
            public final void run() {
                w.this.G(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final void B(E5.c cVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_database", this);
        this.f3459d = cVar;
        E5.k kVar = new E5.k(cVar, "plugins.flutter.io/firebase_database");
        this.f3458c = kVar;
        kVar.e(this);
    }

    public final /* synthetic */ void C(Map map, C0660k c0660k) {
        try {
            V2.m.a(y(map).Z().c());
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void D(C0660k c0660k) {
        try {
            u();
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void F(Map map, C0660k c0660k) {
        try {
            w(map).h();
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void G(Map map, C0660k c0660k) {
        try {
            w(map).i();
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void I(Map map, C0660k c0660k) {
        try {
            Q3.p x7 = x(map);
            String str = (String) map.get("eventChannelNamePrefix");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            int i7 = this.f3456a;
            this.f3456a = i7 + 1;
            sb.append(i7);
            String sb2 = sb.toString();
            final E5.d dVar = new E5.d(this.f3459d, sb2);
            C0434b c0434b = new C0434b(x7, new z() { // from class: L5.m
                @Override // L5.z
                public final void run() {
                    E5.d.this.d(null);
                }
            });
            dVar.d(c0434b);
            this.f3457b.put(dVar, c0434b);
            c0660k.c(sb2);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void K(Map map, C0660k c0660k) {
        try {
            w(map).j();
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void L(Map map, C0660k c0660k) {
        try {
            c0660k.c(new x((Q3.b) V2.m.a(x(map).r())).a());
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void M(Map map, C0660k c0660k) {
        try {
            Q3.p x7 = x(map);
            Object obj = map.get("value");
            Objects.requireNonNull(obj);
            x7.v(((Boolean) obj).booleanValue());
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void N(Map map, C0660k c0660k) {
        try {
            Q3.e y7 = y(map);
            Object obj = map.get("transactionKey");
            Objects.requireNonNull(obj);
            int intValue = ((Integer) obj).intValue();
            Object obj2 = map.get("transactionApplyLocally");
            Objects.requireNonNull(obj2);
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            D d7 = new D(this.f3458c, intValue);
            y7.a0(d7, booleanValue);
            c0660k.c((Map) V2.m.a(d7.c()));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void O(Map map, C0660k c0660k) {
        try {
            V2.m.a(y(map).Z().f(map.get("value")));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void P(Map map, C0660k c0660k) {
        try {
            V2.m.a(y(map).b0(map.get("priority")));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void Q(Map map, C0660k c0660k) {
        try {
            V2.m.a(y(map).d0(map.get("value")));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void R(Map map, C0660k c0660k) {
        try {
            V2.m.a(y(map).e0(map.get("value"), map.get("priority")));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void S(Map map, C0660k c0660k) {
        AbstractC0659j h7;
        try {
            Object obj = map.get("value");
            Object obj2 = map.get("priority");
            Q3.n Z6 = y(map).Z();
            if (obj2 instanceof Double) {
                h7 = Z6.g(obj, ((Number) obj2).doubleValue());
            } else if (obj2 instanceof String) {
                h7 = Z6.h(obj, (String) obj2);
            } else {
                if (obj2 != null) {
                    throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                }
                h7 = Z6.h(obj, null);
            }
            V2.m.a(h7);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void T(Map map, C0660k c0660k) {
        try {
            Q3.e y7 = y(map);
            Object obj = map.get("value");
            Objects.requireNonNull(obj);
            V2.m.a(y7.g0((Map) obj));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void U(Map map, C0660k c0660k) {
        try {
            Q3.e y7 = y(map);
            Object obj = map.get("value");
            Objects.requireNonNull(obj);
            V2.m.a(y7.Z().i((Map) obj));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final AbstractC0659j V(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.g
            @Override // java.lang.Runnable
            public final void run() {
                w.this.I(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j W(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.q
            @Override // java.lang.Runnable
            public final void run() {
                w.this.K(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j X(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.k
            @Override // java.lang.Runnable
            public final void run() {
                w.this.L(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j Y(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.f
            @Override // java.lang.Runnable
            public final void run() {
                w.this.M(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final void Z() {
        for (E5.d dVar : this.f3457b.keySet()) {
            d.InterfaceC0024d interfaceC0024d = (d.InterfaceC0024d) this.f3457b.get(dVar);
            if (interfaceC0024d != null) {
                interfaceC0024d.a(null);
                dVar.d(null);
            }
        }
        this.f3457b.clear();
    }

    public final AbstractC0659j a0(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.s
            @Override // java.lang.Runnable
            public final void run() {
                w.this.N(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j c0(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.v
            @Override // java.lang.Runnable
            public final void run() {
                w.this.O(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j d0(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.j
            @Override // java.lang.Runnable
            public final void run() {
                w.this.P(map, c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j didReinitializeFirebaseCore() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.n
            @Override // java.lang.Runnable
            public final void run() {
                w.this.D(c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j e0(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.i
            @Override // java.lang.Runnable
            public final void run() {
                w.this.Q(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j f0(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.t
            @Override // java.lang.Runnable
            public final void run() {
                w.this.R(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j g0(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.r
            @Override // java.lang.Runnable
            public final void run() {
                w.this.S(map, c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j getPluginConstantsForFirebaseApp(C1947e c1947e) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.d
            @Override // java.lang.Runnable
            public final void run() {
                w.E(C0660k.this);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j h0(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.l
            @Override // java.lang.Runnable
            public final void run() {
                w.this.T(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j i0(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.p
            @Override // java.lang.Runnable
            public final void run() {
                w.this.U(map, c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        B(bVar.b());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f3458c.e(null);
        u();
    }

    @Override // E5.k.c
    public void onMethodCall(final E5.j jVar, final k.d dVar) {
        Map map;
        AbstractC0659j a02;
        map = (Map) jVar.b();
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "DatabaseReference#runTransaction":
                a02 = a0(map);
                break;
            case "DatabaseReference#setPriority":
                a02 = d0(map);
                break;
            case "FirebaseDatabase#purgeOutstandingWrites":
                a02 = W(map);
                break;
            case "DatabaseReference#setWithPriority":
                a02 = f0(map);
                break;
            case "DatabaseReference#update":
                a02 = h0(map);
                break;
            case "FirebaseDatabase#goOffline":
                a02 = z(map);
                break;
            case "OnDisconnect#set":
                a02 = c0(map);
                break;
            case "OnDisconnect#cancel":
                a02 = t(map);
                break;
            case "Query#get":
                a02 = X(map);
                break;
            case "Query#keepSynced":
                a02 = Y(map);
                break;
            case "OnDisconnect#update":
                a02 = i0(map);
                break;
            case "DatabaseReference#set":
                a02 = e0(map);
                break;
            case "OnDisconnect#setWithPriority":
                a02 = g0(map);
                break;
            case "FirebaseDatabase#goOnline":
                a02 = A(map);
                break;
            case "Query#observe":
                a02 = V(map);
                break;
            default:
                dVar.c();
                return;
        }
        a02.b(new InterfaceC0654e() { // from class: L5.o
            @Override // V2.InterfaceC0654e
            public final void a(AbstractC0659j abstractC0659j) {
                w.J(k.d.this, jVar, abstractC0659j);
            }
        });
    }

    public final AbstractC0659j t(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.e
            @Override // java.lang.Runnable
            public final void run() {
                w.this.C(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final void u() {
        Z();
        f3455e.clear();
    }

    public Q3.h w(Map map) {
        long intValue;
        String str = (String) map.get("appName");
        if (str == null) {
            str = "[DEFAULT]";
        }
        String str2 = (String) map.get("databaseURL");
        if (str2 == null) {
            str2 = "";
        }
        String concat = str.concat(str2);
        Q3.h v7 = v(concat);
        if (v7 != null) {
            return v7;
        }
        C1947e p7 = C1947e.p(str);
        Q3.h e7 = !str2.isEmpty() ? Q3.h.e(p7, str2) : Q3.h.d(p7);
        Boolean bool = (Boolean) map.get("loggingEnabled");
        Boolean bool2 = (Boolean) map.get("persistenceEnabled");
        String str3 = (String) map.get("emulatorHost");
        Integer num = (Integer) map.get("emulatorPort");
        Object obj = map.get("cacheSizeBytes");
        if (bool != null) {
            try {
                e7.k(bool.booleanValue() ? Q3.l.DEBUG : Q3.l.NONE);
            } catch (Q3.d e8) {
                String message = e8.getMessage();
                if (message == null) {
                    throw e8;
                }
                if (!message.contains("must be made before any other usage of FirebaseDatabase")) {
                    throw e8;
                }
            }
        }
        if (str3 != null && num != null) {
            e7.n(str3, num.intValue());
        }
        if (bool2 != null) {
            e7.m(bool2.booleanValue());
        }
        if (obj != null) {
            if (obj instanceof Long) {
                intValue = ((Long) obj).longValue();
            } else if (obj instanceof Integer) {
                intValue = ((Integer) obj).intValue();
            }
            e7.l(intValue);
        }
        b0(e7, concat);
        return e7;
    }

    public final Q3.p x(Map map) {
        Q3.e y7 = y(map);
        Object obj = map.get("modifiers");
        Objects.requireNonNull(obj);
        return new A(y7, (List) obj).a();
    }

    public final Q3.e y(Map map) {
        Q3.h w7 = w(map);
        Object obj = map.get("path");
        Objects.requireNonNull(obj);
        return w7.f((String) obj);
    }

    public final AbstractC0659j z(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: L5.h
            @Override // java.lang.Runnable
            public final void run() {
                w.this.F(map, c0660k);
            }
        });
        return c0660k.a();
    }
}
