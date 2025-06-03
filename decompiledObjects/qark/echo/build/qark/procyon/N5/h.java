// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N5;

import java.util.Iterator;
import s4.n;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.Objects;
import s3.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import V2.m;
import V2.j;
import java.util.HashMap;
import E5.c;
import java.util.Map;
import E5.k;
import A5.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;

public class h implements FlutterFirebasePlugin, a, c
{
    public k a;
    public final Map b;
    public E5.c c;
    
    public h() {
        this.b = new HashMap();
    }
    
    @Override
    public j didReinitializeFirebaseCore() {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new b());
    }
    
    @Override
    public j getPluginConstantsForFirebaseApp(final e e) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new a());
    }
    
    public final j h(final Map map) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new g(this, map));
    }
    
    public final Map i(final Exception ex) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("code", "unknown");
        String message;
        if (ex != null) {
            message = ex.getMessage();
        }
        else {
            message = "An unknown error has occurred.";
        }
        hashMap.put("message", message);
        return hashMap;
    }
    
    public final j j(final Map map) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new N5.d(this, map));
    }
    
    public final s4.h k(final Map map) {
        final String value = map.get("appName");
        Objects.requireNonNull(value);
        return s4.h.u(e.p(value));
    }
    
    public final j l(final Map map) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new N5.e(this, map));
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.a = this.v(b.b());
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_app_installations", this);
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.a.e(null);
        this.a = null;
        this.c = null;
        this.u();
    }
    
    @Override
    public void onMethodCall(final E5.j j, final d d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1737112764: {
                if (!a.equals("FirebaseInstallations#delete")) {
                    break;
                }
                n = 3;
                break;
            }
            case 751549920: {
                if (!a.equals("FirebaseInstallations#getId")) {
                    break;
                }
                n = 2;
                break;
            }
            case -230254828: {
                if (!a.equals("FirebaseInstallations#getToken")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1186391021: {
                if (!a.equals("FirebaseInstallations#registerIdChangeListener")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        j i = null;
        switch (n) {
            default: {
                d.c();
                return;
            }
            case 3: {
                i = this.h((Map)j.b());
                break;
            }
            case 2: {
                i = this.j((Map)j.b());
                break;
            }
            case 1: {
                i = this.l((Map)j.b());
                break;
            }
            case 0: {
                i = this.t((Map)j.b());
                break;
            }
        }
        i.b(new N5.c(this, d));
    }
    
    public final j t(final Map map) {
        return m.c(FlutterFirebasePlugin.cachedThreadPool, new f(this, map));
    }
    
    public final void u() {
        for (final E5.d d : this.b.keySet()) {
            ((E5.d.d)this.b.get(d)).a(null);
            d.d(null);
        }
        this.b.clear();
    }
    
    public final k v(final E5.c c) {
        final k k = new k(c, "plugins.flutter.io/firebase_app_installations");
        k.e((k.c)this);
        this.c = c;
        return k;
    }
}
