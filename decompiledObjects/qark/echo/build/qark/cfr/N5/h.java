/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 */
package N5;

import A5.a;
import E5.d;
import E5.k;
import N5.a;
import N5.b;
import N5.c;
import N5.d;
import N5.e;
import N5.f;
import N5.g;
import N5.j;
import V2.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s4.n;

public class h
implements FlutterFirebasePlugin,
A5.a,
k.c {
    public k a;
    public final Map b = new HashMap();
    public E5.c c;

    public static /* synthetic */ String a(h h8, Map map) {
        return h8.s(map);
    }

    public static /* synthetic */ Void b() {
        return h.n();
    }

    public static /* synthetic */ void c(h h8, k.d d8, V2.j j8) {
        h8.r(d8, j8);
    }

    public static /* synthetic */ String d(h h8, Map map) {
        return h8.o(map);
    }

    public static /* synthetic */ String e(h h8, Map map) {
        return h8.q(map);
    }

    public static /* synthetic */ Map f() {
        return h.p();
    }

    public static /* synthetic */ Void g(h h8, Map map) {
        return h8.m(map);
    }

    public static /* synthetic */ Void n() {
        return null;
    }

    public static /* synthetic */ Map p() {
        return null;
    }

    @Override
    public V2.j didReinitializeFirebaseCore() {
        return m.c((Executor)FlutterFirebasePlugin.cachedThreadPool, new b());
    }

    @Override
    public V2.j getPluginConstantsForFirebaseApp(s3.e e8) {
        return m.c((Executor)FlutterFirebasePlugin.cachedThreadPool, new a());
    }

    public final V2.j h(Map map) {
        return m.c((Executor)FlutterFirebasePlugin.cachedThreadPool, new g(this, map));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Map i(Exception object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"code", (Object)"unknown");
        object = object != null ? object.getMessage() : "An unknown error has occurred.";
        hashMap.put((Object)"message", object);
        return hashMap;
    }

    public final V2.j j(Map map) {
        return m.c((Executor)FlutterFirebasePlugin.cachedThreadPool, new d(this, map));
    }

    public final s4.h k(Map object) {
        object = object.get((Object)"appName");
        Objects.requireNonNull((Object)object);
        return s4.h.u(s3.e.p((String)object));
    }

    public final V2.j l(Map map) {
        return m.c((Executor)FlutterFirebasePlugin.cachedThreadPool, new e(this, map));
    }

    public final /* synthetic */ Void m(Map map) {
        return (Void)m.a(this.k(map).k());
    }

    public final /* synthetic */ String o(Map map) {
        return (String)m.a(this.k(map).a());
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.a = this.v(b8.b());
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_app_installations", this);
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.a.e(null);
        this.a = null;
        this.c = null;
        this.u();
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
            case 1737112764: {
                if (!string2.equals((Object)"FirebaseInstallations#delete")) break;
                n9 = 3;
                break;
            }
            case 751549920: {
                if (!string2.equals((Object)"FirebaseInstallations#getId")) break;
                n9 = 2;
                break;
            }
            case -230254828: {
                if (!string2.equals((Object)"FirebaseInstallations#getToken")) break;
                n9 = 1;
                break;
            }
            case -1186391021: {
                if (!string2.equals((Object)"FirebaseInstallations#registerIdChangeListener")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                d8.c();
                return;
            }
            case 3: {
                object = this.h((Map)object.b());
                break;
            }
            case 2: {
                object = this.j((Map)object.b());
                break;
            }
            case 1: {
                object = this.l((Map)object.b());
                break;
            }
            case 0: {
                object = this.t((Map)object.b());
            }
        }
        object.b(new c(this, d8));
    }

    public final /* synthetic */ String q(Map object) {
        s4.h h8 = this.k((Map)object);
        object = object.get((Object)"forceRefresh");
        Objects.requireNonNull((Object)object);
        return ((n)m.a(h8.b((Boolean)object))).b();
    }

    public final /* synthetic */ void r(k.d d8, V2.j object) {
        if (object.n()) {
            d8.a(object.j());
            return;
        }
        Exception exception = object.i();
        object = exception != null ? exception.getMessage() : null;
        d8.b("firebase_app_installations", (String)object, (Object)this.i(exception));
    }

    public final /* synthetic */ String s(Map object) {
        Object object2 = object.get((Object)"appName");
        Objects.requireNonNull((Object)object2);
        object2 = (String)object2;
        object = new j(this.k((Map)object));
        Object object3 = new StringBuilder();
        object3.append("plugins.flutter.io/firebase_app_installations/token/");
        object3.append((String)object2);
        object2 = object3.toString();
        object3 = new E5.d(this.c, (String)object2);
        object3.d((d.d)object);
        this.b.put(object3, object);
        return object2;
    }

    public final V2.j t(Map map) {
        return m.c((Executor)FlutterFirebasePlugin.cachedThreadPool, new f(this, map));
    }

    public final void u() {
        for (E5.d d8 : this.b.keySet()) {
            ((d.d)this.b.get((Object)d8)).a(null);
            d8.d(null);
        }
        this.b.clear();
    }

    public final k v(E5.c c8) {
        k k8 = new k(c8, "plugins.flutter.io/firebase_app_installations");
        k8.e(this);
        this.c = c8;
        return k8;
    }
}

