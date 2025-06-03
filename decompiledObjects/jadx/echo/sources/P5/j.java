package P5;

import A5.a;
import E5.k;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import com.google.firebase.perf.metrics.Trace;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import s3.C1947e;

/* loaded from: classes.dex */
public class j implements FlutterFirebasePlugin, A5.a, k.c {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f4306b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f4307c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static int f4308d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f4309e = 0;

    /* renamed from: a, reason: collision with root package name */
    public k f4310a;

    public class a extends HashMap {
        public a() {
        }
    }

    private void l(E5.c cVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_performance", this);
        k kVar = new k(cVar, "plugins.flutter.io/firebase_performance");
        this.f4310a = kVar;
        kVar.e(this);
    }

    public static /* synthetic */ void n(C0660k c0660k) {
        try {
            Iterator it = f4307c.values().iterator();
            while (it.hasNext()) {
                ((Trace) it.next()).stop();
            }
            f4307c.clear();
            Iterator it2 = f4306b.values().iterator();
            while (it2.hasNext()) {
                ((G4.i) it2.next()).h();
            }
            f4306b.clear();
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void p(E5.j jVar, C0660k c0660k) {
        try {
            String str = (String) jVar.a("url");
            Objects.requireNonNull(str);
            String str2 = (String) jVar.a("httpMethod");
            Objects.requireNonNull(str2);
            G4.i e7 = A4.e.c().e(str, w(str2));
            e7.g();
            int i7 = f4309e;
            f4309e = i7 + 1;
            f4306b.put(Integer.valueOf(i7), e7);
            c0660k.c(Integer.valueOf(i7));
        } catch (Exception e8) {
            c0660k.b(e8);
        }
    }

    public static /* synthetic */ void q(E5.j jVar, C0660k c0660k) {
        try {
            Integer num = (Integer) jVar.a("handle");
            Objects.requireNonNull(num);
            Map map = (Map) jVar.a("attributes");
            Objects.requireNonNull(map);
            Map map2 = map;
            Integer num2 = (Integer) jVar.a("httpResponseCode");
            Integer num3 = (Integer) jVar.a("requestPayloadSize");
            String str = (String) jVar.a("responseContentType");
            Integer num4 = (Integer) jVar.a("responsePayloadSize");
            G4.i iVar = (G4.i) f4306b.get(num);
            if (iVar == null) {
                c0660k.c(null);
                return;
            }
            if (num2 != null) {
                iVar.c(num2.intValue());
            }
            if (num3 != null) {
                iVar.d(num3.intValue());
            }
            if (str != null) {
                iVar.e(str);
            }
            if (num4 != null) {
                iVar.f(num4.intValue());
            }
            for (String str2 : map2.keySet()) {
                String str3 = (String) map2.get(str2);
                if (str3 != null) {
                    iVar.b(str2, str3);
                }
            }
            iVar.h();
            f4306b.remove(num);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void r(C0660k c0660k) {
        try {
            c0660k.c(Boolean.valueOf(A4.e.c().d()));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void s(k.d dVar, AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            dVar.a(abstractC0659j.j());
        } else {
            Exception i7 = abstractC0659j.i();
            dVar.b("firebase_crashlytics", i7 != null ? i7.getMessage() : "An unknown error occurred", null);
        }
    }

    public static /* synthetic */ void t(E5.j jVar, C0660k c0660k) {
        try {
            A4.e.c().g((Boolean) jVar.a("enable"));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void u(E5.j jVar, C0660k c0660k) {
        try {
            String str = (String) jVar.a("name");
            Objects.requireNonNull(str);
            Trace f7 = A4.e.c().f(str);
            f7.start();
            int i7 = f4308d;
            f4308d = i7 + 1;
            f4307c.put(Integer.valueOf(i7), f7);
            c0660k.c(Integer.valueOf(i7));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void v(E5.j jVar, C0660k c0660k) {
        try {
            Integer num = (Integer) jVar.a("handle");
            Objects.requireNonNull(num);
            Map map = (Map) jVar.a("attributes");
            Objects.requireNonNull(map);
            Map map2 = map;
            Map map3 = (Map) jVar.a("metrics");
            Objects.requireNonNull(map3);
            Map map4 = map3;
            Trace trace = (Trace) f4307c.get(num);
            if (trace == null) {
                c0660k.c(null);
                return;
            }
            for (String str : map2.keySet()) {
                String str2 = (String) map2.get(str);
                if (str2 != null) {
                    trace.putAttribute(str, str2);
                }
            }
            for (String str3 : map4.keySet()) {
                if (((Integer) map4.get(str3)) != null) {
                    trace.putMetric(str3, r5.intValue());
                }
            }
            trace.stop();
            f4307c.remove(num);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static String w(String str) {
        str.hashCode();
        switch (str) {
            case "HttpMethod.Get":
                return "GET";
            case "HttpMethod.Put":
                return "PUT";
            case "HttpMethod.Delete":
                return "DELETE";
            case "HttpMethod.Patch":
                return "PATCH";
            case "HttpMethod.Trace":
                return "TRACE";
            case "HttpMethod.Options":
                return "OPTIONS";
            case "HttpMethod.Head":
                return "HEAD";
            case "HttpMethod.Post":
                return "POST";
            case "HttpMethod.Connect":
                return "CONNECT";
            default:
                throw new IllegalArgumentException(String.format("No HttpMethod for: %s", str));
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j didReinitializeFirebaseCore() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.a
            @Override // java.lang.Runnable
            public final void run() {
                j.n(C0660k.this);
            }
        });
        return c0660k.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j getPluginConstantsForFirebaseApp(C1947e c1947e) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.b
            @Override // java.lang.Runnable
            public final void run() {
                j.this.o(c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j j(final E5.j jVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.f
            @Override // java.lang.Runnable
            public final void run() {
                j.p(E5.j.this, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j k(final E5.j jVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.e
            @Override // java.lang.Runnable
            public final void run() {
                j.q(E5.j.this, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j m() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.d
            @Override // java.lang.Runnable
            public final void run() {
                j.r(C0660k.this);
            }
        });
        return c0660k.a();
    }

    public final /* synthetic */ void o(C0660k c0660k) {
        try {
            c0660k.c(new a());
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        l(bVar.b());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        k kVar = this.f4310a;
        if (kVar != null) {
            kVar.e(null);
            this.f4310a = null;
        }
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, final k.d dVar) {
        AbstractC0659j y7;
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "FirebasePerformance#traceStart":
                y7 = y(jVar);
                break;
            case "FirebasePerformance#httpMetricStop":
                y7 = k(jVar);
                break;
            case "FirebasePerformance#traceStop":
                y7 = z(jVar);
                break;
            case "FirebasePerformance#isPerformanceCollectionEnabled":
                y7 = m();
                break;
            case "FirebasePerformance#setPerformanceCollectionEnabled":
                y7 = x(jVar);
                break;
            case "FirebasePerformance#httpMetricStart":
                y7 = j(jVar);
                break;
            default:
                dVar.c();
                return;
        }
        y7.b(new InterfaceC0654e() { // from class: P5.c
            @Override // V2.InterfaceC0654e
            public final void a(AbstractC0659j abstractC0659j) {
                j.s(k.d.this, abstractC0659j);
            }
        });
    }

    public final AbstractC0659j x(final E5.j jVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.h
            @Override // java.lang.Runnable
            public final void run() {
                j.t(E5.j.this, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j y(final E5.j jVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.g
            @Override // java.lang.Runnable
            public final void run() {
                j.u(E5.j.this, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j z(final E5.j jVar) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P5.i
            @Override // java.lang.Runnable
            public final void run() {
                j.v(E5.j.this, c0660k);
            }
        });
        return c0660k.a();
    }
}
