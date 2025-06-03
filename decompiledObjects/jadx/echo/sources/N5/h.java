package N5;

import A5.a;
import E5.d;
import E5.k;
import V2.AbstractC0659j;
import V2.InterfaceC0654e;
import V2.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import s3.C1947e;
import s4.n;

/* loaded from: classes.dex */
public class h implements FlutterFirebasePlugin, A5.a, k.c {

    /* renamed from: a, reason: collision with root package name */
    public k f3704a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3705b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public E5.c f3706c;

    public static /* synthetic */ Void n() {
        return null;
    }

    public static /* synthetic */ Map p() {
        return null;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j didReinitializeFirebaseCore() {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: N5.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void n7;
                n7 = h.n();
                return n7;
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j getPluginConstantsForFirebaseApp(C1947e c1947e) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: N5.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map p7;
                p7 = h.p();
                return p7;
            }
        });
    }

    public final AbstractC0659j h(final Map map) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: N5.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m7;
                m7 = h.this.m(map);
                return m7;
            }
        });
    }

    public final Map i(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put("message", exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    public final AbstractC0659j j(final Map map) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: N5.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String o7;
                o7 = h.this.o(map);
                return o7;
            }
        });
    }

    public final s4.h k(Map map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return s4.h.u(C1947e.p((String) obj));
    }

    public final AbstractC0659j l(final Map map) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: N5.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String q7;
                q7 = h.this.q(map);
                return q7;
            }
        });
    }

    public final /* synthetic */ Void m(Map map) {
        return (Void) m.a(k(map).k());
    }

    public final /* synthetic */ String o(Map map) {
        return (String) m.a(k(map).a());
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        this.f3704a = v(bVar.b());
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_app_installations", this);
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f3704a.e(null);
        this.f3704a = null;
        this.f3706c = null;
        u();
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, final k.d dVar) {
        AbstractC0659j t7;
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "FirebaseInstallations#registerIdChangeListener":
                t7 = t((Map) jVar.b());
                break;
            case "FirebaseInstallations#getToken":
                t7 = l((Map) jVar.b());
                break;
            case "FirebaseInstallations#getId":
                t7 = j((Map) jVar.b());
                break;
            case "FirebaseInstallations#delete":
                t7 = h((Map) jVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        t7.b(new InterfaceC0654e() { // from class: N5.c
            @Override // V2.InterfaceC0654e
            public final void a(AbstractC0659j abstractC0659j) {
                h.this.r(dVar, abstractC0659j);
            }
        });
    }

    public final /* synthetic */ String q(Map map) {
        s4.h k7 = k(map);
        Object obj = map.get("forceRefresh");
        Objects.requireNonNull(obj);
        return ((n) m.a(k7.b(((Boolean) obj).booleanValue()))).b();
    }

    public final /* synthetic */ void r(k.d dVar, AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            dVar.a(abstractC0659j.j());
        } else {
            Exception i7 = abstractC0659j.i();
            dVar.b("firebase_app_installations", i7 != null ? i7.getMessage() : null, i(i7));
        }
    }

    public final /* synthetic */ String s(Map map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        j jVar = new j(k(map));
        String str = "plugins.flutter.io/firebase_app_installations/token/" + ((String) obj);
        E5.d dVar = new E5.d(this.f3706c, str);
        dVar.d(jVar);
        this.f3705b.put(dVar, jVar);
        return str;
    }

    public final AbstractC0659j t(final Map map) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: N5.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String s7;
                s7 = h.this.s(map);
                return s7;
            }
        });
    }

    public final void u() {
        for (E5.d dVar : this.f3705b.keySet()) {
            ((d.InterfaceC0024d) this.f3705b.get(dVar)).a(null);
            dVar.d(null);
        }
        this.f3705b.clear();
    }

    public final k v(E5.c cVar) {
        k kVar = new k(cVar, "plugins.flutter.io/firebase_app_installations");
        kVar.e(this);
        this.f3706c = cVar;
        return kVar;
    }
}
