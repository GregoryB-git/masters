/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.ExecutorService
 */
package P5;

import A5.a;
import E5.k;
import P5.a;
import P5.b;
import P5.c;
import P5.d;
import P5.e;
import P5.f;
import P5.g;
import P5.h;
import P5.i;
import com.google.firebase.perf.metrics.Trace;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class j
implements FlutterFirebasePlugin,
A5.a,
k.c {
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static int d = 0;
    public static int e = 0;
    public k a;

    public static /* synthetic */ void a(E5.j j8, V2.k k8) {
        j.u(j8, k8);
    }

    public static /* synthetic */ void b(V2.k k8) {
        j.n(k8);
    }

    public static /* synthetic */ void c(j j8, V2.k k8) {
        j8.o(k8);
    }

    public static /* synthetic */ void d(V2.k k8) {
        j.r(k8);
    }

    public static /* synthetic */ void e(E5.j j8, V2.k k8) {
        j.q(j8, k8);
    }

    public static /* synthetic */ void f(k.d d8, V2.j j8) {
        j.s(d8, j8);
    }

    public static /* synthetic */ void g(E5.j j8, V2.k k8) {
        j.v(j8, k8);
    }

    public static /* synthetic */ void h(E5.j j8, V2.k k8) {
        j.t(j8, k8);
    }

    public static /* synthetic */ void i(E5.j j8, V2.k k8) {
        j.p(j8, k8);
    }

    private void l(E5.c object) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_performance", this);
        this.a = object = new k((E5.c)object, "plugins.flutter.io/firebase_performance");
        object.e(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void n(V2.k k8) {
        try {
            Iterator iterator = c.values().iterator();
            while (iterator.hasNext()) {
                ((Trace)iterator.next()).stop();
            }
            c.clear();
            iterator = b.values().iterator();
            do {
                if (!iterator.hasNext()) {
                    b.clear();
                    k8.c(null);
                    return;
                }
                ((G4.i)iterator.next()).h();
            } while (true);
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public static /* synthetic */ void p(E5.j object, V2.k k8) {
        try {
            String string2 = (String)object.a("url");
            Objects.requireNonNull((Object)string2);
            object = (String)object.a("httpMethod");
            Objects.requireNonNull((Object)object);
            object = A4.e.c().e(string2, j.w((String)object));
            object.g();
            int n8 = e;
            e = n8 + 1;
            b.put((Object)n8, object);
            k8.c(n8);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void q(E5.j object, V2.k k8) {
        try {
            Integer n8 = (Integer)object.a("handle");
            Objects.requireNonNull((Object)n8);
            Map map = (Map)object.a("attributes");
            Objects.requireNonNull((Object)map);
            Integer n9 = (Integer)object.a("httpResponseCode");
            Object object2 = (Integer)object.a("requestPayloadSize");
            String string2 = (String)object.a("responseContentType");
            Integer n10 = (Integer)object.a("responsePayloadSize");
            object = (G4.i)b.get((Object)n8);
            if (object == null) {
                k8.c(null);
                return;
            }
            if (n9 != null) {
                object.c(n9);
            }
            if (object2 != null) {
                object.d(object2.intValue());
            }
            if (string2 != null) {
                object.e(string2);
            }
            if (n10 != null) {
                object.f(n10.intValue());
            }
            n9 = map.keySet().iterator();
            do {
                if (!n9.hasNext()) {
                    object.h();
                    b.remove((Object)n8);
                    k8.c(null);
                    return;
                }
                object2 = (String)n9.next();
                string2 = (String)map.get(object2);
                if (string2 == null) continue;
                object.b((String)object2, string2);
            } while (true);
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public static /* synthetic */ void r(V2.k k8) {
        try {
            k8.c(A4.e.c().d());
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void s(k.d d8, V2.j object) {
        if (object.n()) {
            d8.a(object.j());
            return;
        }
        object = (object = object.i()) != null ? object.getMessage() : "An unknown error occurred";
        d8.b("firebase_crashlytics", (String)object, null);
    }

    public static /* synthetic */ void t(E5.j j8, V2.k k8) {
        try {
            j8 = (Boolean)j8.a("enable");
            A4.e.c().g((Boolean)j8);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void u(E5.j object, V2.k k8) {
        try {
            object = (String)object.a("name");
            Objects.requireNonNull((Object)object);
            object = A4.e.c().f((String)object);
            object.start();
            int n8 = d;
            d = n8 + 1;
            c.put((Object)n8, object);
            k8.c(n8);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void v(E5.j j8, V2.k k8) {
        try {
            Integer n8 = (Integer)j8.a("handle");
            Objects.requireNonNull((Object)n8);
            Object object = (Map)j8.a("attributes");
            Objects.requireNonNull((Object)object);
            Map map = object;
            j8 = (Map)j8.a("metrics");
            Objects.requireNonNull((Object)j8);
            j8 = (Map)j8;
            object = (Trace)c.get((Object)n8);
            if (object == null) {
                k8.c(null);
                return;
            }
            for (String string2 : map.keySet()) {
                String string3 = (String)map.get((Object)string2);
                if (string3 == null) continue;
                object.putAttribute(string2, string3);
            }
            map = j8.keySet().iterator();
            do {
                String string2;
                if (!map.hasNext()) {
                    object.stop();
                    c.remove((Object)n8);
                    k8.c(null);
                    return;
                }
                String string4 = (String)map.next();
                string2 = (Integer)j8.get((Object)string4);
                if (string2 == null) continue;
                object.putMetric(string4, string2.intValue());
            } while (true);
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public static String w(String string2) {
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 2078049157: {
                if (!string2.equals((Object)"HttpMethod.Connect")) break;
                n9 = 8;
                break;
            }
            case 951258085: {
                if (!string2.equals((Object)"HttpMethod.Post")) break;
                n9 = 7;
                break;
            }
            case 951009573: {
                if (!string2.equals((Object)"HttpMethod.Head")) break;
                n9 = 6;
                break;
            }
            case -122777287: {
                if (!string2.equals((Object)"HttpMethod.Options")) break;
                n9 = 5;
                break;
            }
            case -572004704: {
                if (!string2.equals((Object)"HttpMethod.Trace")) break;
                n9 = 4;
                break;
            }
            case -576186973: {
                if (!string2.equals((Object)"HttpMethod.Patch")) break;
                n9 = 3;
                break;
            }
            case -1022018640: {
                if (!string2.equals((Object)"HttpMethod.Delete")) break;
                n9 = 2;
                break;
            }
            case -2047524054: {
                if (!string2.equals((Object)"HttpMethod.Put")) break;
                n9 = 1;
                break;
            }
            case -2047533199: {
                if (!string2.equals((Object)"HttpMethod.Get")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                throw new IllegalArgumentException(String.format((String)"No HttpMethod for: %s", (Object[])new Object[]{string2}));
            }
            case 8: {
                return "CONNECT";
            }
            case 7: {
                return "POST";
            }
            case 6: {
                return "HEAD";
            }
            case 5: {
                return "OPTIONS";
            }
            case 4: {
                return "TRACE";
            }
            case 3: {
                return "PATCH";
            }
            case 2: {
                return "DELETE";
            }
            case 1: {
                return "PUT";
            }
            case 0: 
        }
        return "GET";
    }

    @Override
    public V2.j didReinitializeFirebaseCore() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new a(k8));
        return k8.a();
    }

    @Override
    public V2.j getPluginConstantsForFirebaseApp(s3.e object) {
        object = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new b(this, (V2.k)object));
        return object.a();
    }

    public final V2.j j(E5.j j8) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new f(j8, k8));
        return k8.a();
    }

    public final V2.j k(E5.j j8) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new e(j8, k8));
        return k8.a();
    }

    public final V2.j m() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new d(k8));
        return k8.a();
    }

    public final /* synthetic */ void o(V2.k k8) {
        try {
            k8.c((Object)new HashMap(){});
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.l(b8.b());
    }

    @Override
    public void onDetachedFromEngine(a.b object) {
        object = this.a;
        if (object != null) {
            object.e(null);
            this.a = null;
        }
    }

    @Override
    public void onMethodCall(E5.j object, k.d d8) {
        String string2 = object.a;
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1015242224: {
                if (!string2.equals((Object)"FirebasePerformance#httpMetricStart")) break;
                n9 = 5;
                break;
            }
            case 844329211: {
                if (!string2.equals((Object)"FirebasePerformance#setPerformanceCollectionEnabled")) break;
                n9 = 4;
                break;
            }
            case 610629367: {
                if (!string2.equals((Object)"FirebasePerformance#isPerformanceCollectionEnabled")) break;
                n9 = 3;
                break;
            }
            case 347240045: {
                if (!string2.equals((Object)"FirebasePerformance#traceStop")) break;
                n9 = 2;
                break;
            }
            case -1491270476: {
                if (!string2.equals((Object)"FirebasePerformance#httpMetricStop")) break;
                n9 = 1;
                break;
            }
            case -2120473769: {
                if (!string2.equals((Object)"FirebasePerformance#traceStart")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                d8.c();
                return;
            }
            case 5: {
                object = this.j((E5.j)object);
                break;
            }
            case 4: {
                object = this.x((E5.j)object);
                break;
            }
            case 3: {
                object = this.m();
                break;
            }
            case 2: {
                object = this.z((E5.j)object);
                break;
            }
            case 1: {
                object = this.k((E5.j)object);
                break;
            }
            case 0: {
                object = this.y((E5.j)object);
            }
        }
        object.b(new c(d8));
    }

    public final V2.j x(E5.j j8) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new h(j8, k8));
        return k8.a();
    }

    public final V2.j y(E5.j j8) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new g(j8, k8));
        return k8.a();
    }

    public final V2.j z(E5.j j8) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new i(j8, k8));
        return k8.a();
    }

}

