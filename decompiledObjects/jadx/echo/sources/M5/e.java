package M5;

import A5.a;
import E5.d;
import E5.j;
import E5.k;
import P4.m;
import P4.o;
import P4.s;
import P4.t;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s3.C1947e;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class e implements FlutterFirebasePlugin, k.c, A5.a, d.InterfaceC0024d {

    /* renamed from: a, reason: collision with root package name */
    public k f3572a;

    /* renamed from: c, reason: collision with root package name */
    public E5.d f3574c;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3573b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3575d = new Handler(Looper.getMainLooper());

    public class a implements P4.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d.b f3576a;

        public a(d.b bVar) {
            this.f3576a = bVar;
        }

        @Override // P4.c
        public void a(o oVar) {
            this.f3576a.b("firebase_remote_config", oVar.getMessage(), null);
        }

        @Override // P4.c
        public void b(P4.b bVar) {
            final ArrayList arrayList = new ArrayList(bVar.b());
            Handler handler = e.this.f3575d;
            final d.b bVar2 = this.f3576a;
            handler.post(new Runnable() { // from class: M5.d
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.this.a(arrayList);
                }
            });
        }
    }

    public static /* synthetic */ void j(C0660k c0660k) {
        try {
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void l(E5.k.d r4, V2.AbstractC0659j r5) {
        /*
            boolean r0 = r5.n()
            if (r0 == 0) goto Le
            java.lang.Object r5 = r5.j()
            r4.a(r5)
            goto L75
        Le:
            java.lang.Exception r5 = r5.i()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = r5 instanceof P4.p
            java.lang.String r2 = "message"
            java.lang.String r3 = "code"
            if (r1 == 0) goto L2a
            java.lang.String r1 = "throttled"
            r0.put(r3, r1)
            java.lang.String r1 = "frequency of requests exceeds throttled limits"
        L26:
            r0.put(r2, r1)
            goto L68
        L2a:
            boolean r1 = r5 instanceof P4.n
            if (r1 == 0) goto L36
            java.lang.String r1 = "internal"
            r0.put(r3, r1)
            java.lang.String r1 = "internal remote config fetch error"
            goto L26
        L36:
            boolean r1 = r5 instanceof P4.r
            if (r1 == 0) goto L60
            java.lang.String r1 = "remote-config-server-error"
            r0.put(r3, r1)
            java.lang.String r1 = r5.getMessage()
            r0.put(r2, r1)
            java.lang.Throwable r1 = r5.getCause()
            if (r1 == 0) goto L68
            java.lang.String r1 = r1.getMessage()
            if (r1 == 0) goto L68
            java.lang.String r2 = "Forbidden"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L68
            java.lang.String r1 = "forbidden"
            r0.put(r3, r1)
            goto L68
        L60:
            java.lang.String r1 = "unknown"
            r0.put(r3, r1)
            java.lang.String r1 = "unknown remote config error"
            goto L26
        L68:
            if (r5 == 0) goto L6f
            java.lang.String r5 = r5.getMessage()
            goto L70
        L6f:
            r5 = 0
        L70:
            java.lang.String r1 = "firebase_remote_config"
            r4.b(r1, r5, r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.e.l(E5.k$d, V2.j):void");
    }

    @Override // E5.d.InterfaceC0024d
    public void a(Object obj) {
        Object obj2 = ((Map) obj).get("appName");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        P4.d dVar = (P4.d) this.f3573b.get(str);
        if (dVar != null) {
            dVar.remove();
            this.f3573b.remove(str);
        }
    }

    @Override // E5.d.InterfaceC0024d
    public void b(Object obj, d.b bVar) {
        Map map = (Map) obj;
        m i7 = i(map);
        Object obj2 = map.get("appName");
        Objects.requireNonNull(obj2);
        this.f3573b.put((String) obj2, i7.i(new a(bVar)));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j didReinitializeFirebaseCore() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M5.a
            @Override // java.lang.Runnable
            public final void run() {
                e.j(C0660k.this);
            }
        });
        return c0660k.a();
    }

    public final Map g(t tVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", tVar.e());
        hashMap.put("source", n(tVar.f()));
        return hashMap;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j getPluginConstantsForFirebaseApp(final C1947e c1947e) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: M5.b
            @Override // java.lang.Runnable
            public final void run() {
                e.this.k(c1947e, c0660k);
            }
        });
        return c0660k.a();
    }

    public final Map h(m mVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("fetchTimeout", Long.valueOf(mVar.n().b().a()));
        hashMap.put("minimumFetchInterval", Long.valueOf(mVar.n().b().b()));
        hashMap.put("lastFetchTime", Long.valueOf(mVar.n().a()));
        hashMap.put("lastFetchStatus", m(mVar.n().c()));
        AbstractC1995b.a("FRCPlugin", "Sending fetchTimeout: " + hashMap.get("fetchTimeout"));
        return hashMap;
    }

    public final m i(Map map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return m.o(C1947e.p((String) obj));
    }

    public final /* synthetic */ void k(C1947e c1947e, C0660k c0660k) {
        try {
            m o7 = m.o(c1947e);
            HashMap hashMap = new HashMap(h(o7));
            hashMap.put("parameters", o(o7.m()));
            c0660k.c(hashMap);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final String m(int i7) {
        return i7 != -1 ? i7 != 0 ? i7 != 2 ? "failure" : "throttled" : "noFetchYet" : "success";
    }

    public final String n(int i7) {
        return i7 != 1 ? i7 != 2 ? "static" : "remote" : "default";
    }

    public final Map o(Map map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            t tVar = (t) map.get(str);
            Objects.requireNonNull(tVar);
            hashMap.put(str, g(tVar));
        }
        return hashMap;
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        p(bVar.b());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        q();
    }

    @Override // E5.k.c
    public void onMethodCall(j jVar, final k.d dVar) {
        m i7;
        AbstractC0659j g7;
        Map h7;
        i7 = i((Map) jVar.b());
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "RemoteConfig#ensureInitialized":
                g7 = V2.m.g(i7.j());
                g7.b(new InterfaceC0654e() { // from class: M5.c
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        e.l(k.d.this, abstractC0659j);
                    }
                });
                break;
            case "RemoteConfig#setConfigSettings":
                Integer num = (Integer) jVar.a("fetchTimeout");
                Objects.requireNonNull(num);
                int intValue = num.intValue();
                Objects.requireNonNull((Integer) jVar.a("minimumFetchInterval"));
                g7 = i7.x(new s.b().d(intValue).e(r7.intValue()).c());
                g7.b(new InterfaceC0654e() { // from class: M5.c
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        e.l(k.d.this, abstractC0659j);
                    }
                });
                break;
            case "RemoteConfig#getProperties":
                h7 = h(i7);
                g7 = V2.m.e(h7);
                g7.b(new InterfaceC0654e() { // from class: M5.c
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        e.l(k.d.this, abstractC0659j);
                    }
                });
                break;
            case "RemoteConfig#fetch":
                g7 = i7.k();
                g7.b(new InterfaceC0654e() { // from class: M5.c
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        e.l(k.d.this, abstractC0659j);
                    }
                });
                break;
            case "RemoteConfig#activate":
                g7 = i7.h();
                g7.b(new InterfaceC0654e() { // from class: M5.c
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        e.l(k.d.this, abstractC0659j);
                    }
                });
                break;
            case "RemoteConfig#getAll":
                h7 = o(i7.m());
                g7 = V2.m.e(h7);
                g7.b(new InterfaceC0654e() { // from class: M5.c
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        e.l(k.d.this, abstractC0659j);
                    }
                });
                break;
            case "RemoteConfig#fetchAndActivate":
                g7 = i7.l();
                g7.b(new InterfaceC0654e() { // from class: M5.c
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        e.l(k.d.this, abstractC0659j);
                    }
                });
                break;
            case "RemoteConfig#setDefaults":
                Map map = (Map) jVar.a("defaults");
                Objects.requireNonNull(map);
                g7 = i7.z(map);
                g7.b(new InterfaceC0654e() { // from class: M5.c
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        e.l(k.d.this, abstractC0659j);
                    }
                });
                break;
            default:
                dVar.c();
                break;
        }
    }

    public final void p(E5.c cVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_remote_config", this);
        k kVar = new k(cVar, "plugins.flutter.io/firebase_remote_config");
        this.f3572a = kVar;
        kVar.e(this);
        E5.d dVar = new E5.d(cVar, "plugins.flutter.io/firebase_remote_config_updated");
        this.f3574c = dVar;
        dVar.d(this);
    }

    public final void q() {
        this.f3572a.e(null);
        this.f3572a = null;
        this.f3574c.d(null);
        this.f3574c = null;
    }
}
