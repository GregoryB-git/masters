// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P5;

import java.util.Map;
import A4.e;
import java.util.Objects;
import java.util.Iterator;
import G4.i;
import com.google.firebase.perf.metrics.Trace;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import E5.c;
import java.util.HashMap;
import E5.k;
import A5.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;

public class j implements FlutterFirebasePlugin, a, c
{
    public static final HashMap b;
    public static final HashMap c;
    public static int d;
    public static int e;
    public k a;
    
    static {
        b = new HashMap();
        c = new HashMap();
        j.d = 0;
        j.e = 0;
    }
    
    private void l(final E5.c c) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_performance", this);
        (this.a = new k(c, "plugins.flutter.io/firebase_performance")).e((k.c)this);
    }
    
    public static String w(final String s) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2078049157: {
                if (!s.equals("HttpMethod.Connect")) {
                    break;
                }
                n = 8;
                break;
            }
            case 951258085: {
                if (!s.equals("HttpMethod.Post")) {
                    break;
                }
                n = 7;
                break;
            }
            case 951009573: {
                if (!s.equals("HttpMethod.Head")) {
                    break;
                }
                n = 6;
                break;
            }
            case -122777287: {
                if (!s.equals("HttpMethod.Options")) {
                    break;
                }
                n = 5;
                break;
            }
            case -572004704: {
                if (!s.equals("HttpMethod.Trace")) {
                    break;
                }
                n = 4;
                break;
            }
            case -576186973: {
                if (!s.equals("HttpMethod.Patch")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1022018640: {
                if (!s.equals("HttpMethod.Delete")) {
                    break;
                }
                n = 2;
                break;
            }
            case -2047524054: {
                if (!s.equals("HttpMethod.Put")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2047533199: {
                if (!s.equals("HttpMethod.Get")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                throw new IllegalArgumentException(String.format("No HttpMethod for: %s", s));
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
            case 0: {
                return "GET";
            }
        }
    }
    
    @Override
    public V2.j didReinitializeFirebaseCore() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(k));
        return k.a();
    }
    
    @Override
    public V2.j getPluginConstantsForFirebaseApp(final s3.e e) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, k));
        return k.a();
    }
    
    public final V2.j j(final E5.j j) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(j, k));
        return k.a();
    }
    
    public final V2.j k(final E5.j j) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new P5.e(j, k));
        return k.a();
    }
    
    public final V2.j m() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new P5.d(k));
        return k.a();
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.l(b.b());
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        final k a = this.a;
        if (a != null) {
            a.e(null);
            this.a = null;
        }
    }
    
    @Override
    public void onMethodCall(final E5.j j, final d d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1015242224: {
                if (!a.equals("FirebasePerformance#httpMetricStart")) {
                    break;
                }
                n = 5;
                break;
            }
            case 844329211: {
                if (!a.equals("FirebasePerformance#setPerformanceCollectionEnabled")) {
                    break;
                }
                n = 4;
                break;
            }
            case 610629367: {
                if (!a.equals("FirebasePerformance#isPerformanceCollectionEnabled")) {
                    break;
                }
                n = 3;
                break;
            }
            case 347240045: {
                if (!a.equals("FirebasePerformance#traceStop")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1491270476: {
                if (!a.equals("FirebasePerformance#httpMetricStop")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2120473769: {
                if (!a.equals("FirebasePerformance#traceStart")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        V2.j i = null;
        switch (n) {
            default: {
                d.c();
                return;
            }
            case 5: {
                i = this.j(j);
                break;
            }
            case 4: {
                i = this.x(j);
                break;
            }
            case 3: {
                i = this.m();
                break;
            }
            case 2: {
                i = this.z(j);
                break;
            }
            case 1: {
                i = this.k(j);
                break;
            }
            case 0: {
                i = this.y(j);
                break;
            }
        }
        i.b(new P5.c(d));
    }
    
    public final V2.j x(final E5.j j) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(j, k));
        return k.a();
    }
    
    public final V2.j y(final E5.j j) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(j, k));
        return k.a();
    }
    
    public final V2.j z(final E5.j j) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new P5.i(j, k));
        return k.a();
    }
}
