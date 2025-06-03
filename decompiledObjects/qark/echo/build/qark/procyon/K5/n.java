// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K5;

import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import android.content.SharedPreferences;
import android.content.Context;
import android.util.Log;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import D3.h;
import java.util.HashMap;
import io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash;
import s3.e;
import V2.j;
import D3.g;
import java.util.Objects;
import java.util.Map;
import E5.k;
import A5.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;

public class n implements FlutterFirebasePlugin, a, c
{
    public k a;
    
    public final j J(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new K5.c(map, k));
        return k.a();
    }
    
    public final j K(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new K5.g(this, map, k));
        return k.a();
    }
    
    public final j L() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(k));
        return k.a();
    }
    
    public final j M(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new K5.h(this, map, k));
        return k.a();
    }
    
    public final j N(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(map, k));
        return k.a();
    }
    
    public final j O(final Map map) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new K5.j(map, k));
        return k.a();
    }
    
    @Override
    public j didReinitializeFirebaseCore() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new K5.e(k));
        return k.a();
    }
    
    @Override
    public j getPluginConstantsForFirebaseApp(final e e) {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, k, e));
        return k.a();
    }
    
    public final j o() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, k));
        return k.a();
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.u(b.b());
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
            case 1219454365: {
                if (!a.equals("Crashlytics#crash")) {
                    break;
                }
                n = 9;
                break;
            }
            case 679831756: {
                if (!a.equals("Crashlytics#setUserIdentifier")) {
                    break;
                }
                n = 8;
                break;
            }
            case 213629529: {
                if (!a.equals("Crashlytics#deleteUnsentReports")) {
                    break;
                }
                n = 7;
                break;
            }
            case 108415030: {
                if (!a.equals("Crashlytics#setCustomKey")) {
                    break;
                }
                n = 6;
                break;
            }
            case 28093114: {
                if (!a.equals("Crashlytics#log")) {
                    break;
                }
                n = 5;
                break;
            }
            case -108157790: {
                if (!a.equals("Crashlytics#setCrashlyticsCollectionEnabled")) {
                    break;
                }
                n = 4;
                break;
            }
            case -424770276: {
                if (!a.equals("Crashlytics#sendUnsentReports")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1025128541: {
                if (!a.equals("Crashlytics#checkForUnsentReports")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1437158995: {
                if (!a.equals("Crashlytics#recordError")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2094964816: {
                if (!a.equals("Crashlytics#didCrashOnPreviousExecution")) {
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
            case 9: {
                this.p();
                return;
            }
            case 8: {
                i = this.O((Map)j.b());
                break;
            }
            case 7: {
                i = this.q();
                break;
            }
            case 6: {
                i = this.N((Map)j.b());
                break;
            }
            case 5: {
                i = this.J((Map)j.b());
                break;
            }
            case 4: {
                i = this.M((Map)j.b());
                break;
            }
            case 3: {
                i = this.L();
                break;
            }
            case 2: {
                i = this.o();
                break;
            }
            case 1: {
                i = this.K((Map)j.b());
                break;
            }
            case 0: {
                i = this.r();
                break;
            }
        }
        i.b(new f(d));
    }
    
    public final void p() {
        new Handler(Looper.myLooper()).postDelayed((Runnable)new K5.d(), 50L);
    }
    
    public final j q() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new K5.k(k));
        return k.a();
    }
    
    public final j r() {
        final V2.k k = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(this, k));
        return k.a();
    }
    
    public final StackTraceElement s(final Map map) {
        while (true) {
            try {
                final String fileName = map.get("file");
                final String s = map.get("line");
                final String s2 = map.get("class");
                final String methodName = map.get("method");
                String declaringClass = s2;
                if (s2 == null) {
                    declaringClass = "";
                }
                Objects.requireNonNull(s);
                return new StackTraceElement(declaringClass, methodName, fileName, Integer.parseInt(s));
                Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
                return null;
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final SharedPreferences t(final Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }
    
    public final void u(final E5.c c) {
        (this.a = new k(c, "plugins.flutter.io/firebase_crashlytics")).e((k.c)this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }
    
    public final boolean v(final e e) {
        final SharedPreferences t = this.t(e.m());
        if (t.contains("firebase_crashlytics_collection_enabled")) {
            return t.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (e.x()) {
            g.d().j(true);
            return true;
        }
        return false;
    }
}
