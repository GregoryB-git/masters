/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.ExecutorService
 */
package K5;

import A5.a;
import E5.k;
import K5.a;
import K5.b;
import K5.c;
import K5.d;
import K5.e;
import K5.f;
import K5.g;
import K5.h;
import K5.i;
import K5.j;
import K5.k;
import K5.l;
import K5.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

public class n
implements FlutterFirebasePlugin,
A5.a,
k.c {
    public E5.k a;

    private static /* synthetic */ void A(V2.k k8) {
        try {
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void C(Map object, V2.k k8) {
        try {
            object = object.get((Object)"message");
            Objects.requireNonNull((Object)object);
            object = (String)object;
            D3.g.d().f((String)object);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void D(k.d d8, V2.j object) {
        if (object.n()) {
            d8.a(object.j());
            return;
        }
        object = (object = object.i()) != null ? object.getMessage() : "An unknown error occurred";
        d8.b("firebase_crashlytics", (String)object, null);
    }

    public static /* synthetic */ void F(V2.k k8) {
        try {
            D3.g.d().h();
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void H(Map object, V2.k k8) {
        try {
            Object object2 = object.get((Object)"key");
            Objects.requireNonNull((Object)object2);
            object2 = (String)object2;
            object = object.get((Object)"value");
            Objects.requireNonNull((Object)object);
            object = (String)object;
            D3.g.d().k((String)object2, (String)object);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void I(Map object, V2.k k8) {
        try {
            object = object.get((Object)"identifier");
            Objects.requireNonNull((Object)object);
            object = (String)object;
            D3.g.d().l((String)object);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void a(n n8, V2.k k8, s3.e e8) {
        n8.B(k8, e8);
    }

    public static /* synthetic */ void b(V2.k k8) {
        n.F(k8);
    }

    public static /* synthetic */ void c(V2.k k8) {
        n.A(k8);
    }

    public static /* synthetic */ void d() {
        n.x();
    }

    public static /* synthetic */ void e(n n8, Map map, V2.k k8) {
        n8.E(map, k8);
    }

    public static /* synthetic */ void f(Map map, V2.k k8) {
        n.C(map, k8);
    }

    public static /* synthetic */ void g(n n8, V2.k k8) {
        n8.w(k8);
    }

    public static /* synthetic */ void h(k.d d8, V2.j j8) {
        n.D(d8, j8);
    }

    public static /* synthetic */ void i(n n8, Map map, V2.k k8) {
        n8.G(map, k8);
    }

    public static /* synthetic */ void j(n n8, V2.k k8) {
        n8.z(k8);
    }

    public static /* synthetic */ void k(Map map, V2.k k8) {
        n.I(map, k8);
    }

    public static /* synthetic */ void l(V2.k k8) {
        n.y(k8);
    }

    public static /* synthetic */ void m(Map map, V2.k k8) {
        n.H(map, k8);
    }

    public static /* synthetic */ void x() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    public static /* synthetic */ void y(V2.k k8) {
        try {
            D3.g.d().b();
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void B(V2.k k8, final s3.e e8) {
        try {
            k8.c((Object)new HashMap(){
                {
                    if (e82.q().equals((Object)"[DEFAULT]")) {
                        this.put((Object)"isCrashlyticsCollectionEnabled", (Object)n.this.v(s3.e.o()));
                    }
                }
            });
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
    public final /* synthetic */ void E(Map object, V2.k k8) {
        try {
            D3.g g8 = D3.g.d();
            Object object2 = object.get((Object)"exception");
            Objects.requireNonNull((Object)object2);
            String string2 = (String)object2;
            object2 = (String)object.get((Object)"reason");
            Object object3 = object.get((Object)"information");
            Objects.requireNonNull((Object)object3);
            object3 = (String)object3;
            Object object4 = object.get((Object)"fatal");
            Objects.requireNonNull((Object)object4);
            boolean bl = (Boolean)object4;
            object4 = object.get((Object)"buildId");
            Objects.requireNonNull((Object)object4);
            object4 = (String)object4;
            if (object4.length() > 0) {
                D3.h.b((String)object4);
            }
            if (object2 != null) {
                object4 = new StringBuilder();
                object4.append("thrown ");
                object4.append((String)object2);
                g8.k("flutter_error_reason", object4.toString());
                object4 = new StringBuilder();
                object4.append(string2);
                object4.append(". Error thrown ");
                object4.append((String)object2);
                object4.append(".");
                object2 = new FlutterError(object4.toString());
            } else {
                object2 = new FlutterError(string2);
            }
            g8.k("flutter_error_exception", string2);
            string2 = new ArrayList();
            object = object.get((Object)"stackTraceElements");
            Objects.requireNonNull((Object)object);
            object = ((List)object).iterator();
            while (object.hasNext()) {
                object4 = this.s((Map)object.next());
                if (object4 == null) continue;
                string2.add(object4);
            }
            object2.setStackTrace((StackTraceElement[])string2.toArray((Object[])new StackTraceElement[0]));
            if (!object3.isEmpty()) {
                g8.f((String)object3);
            }
            if (bl) {
                D3.h.a((Throwable)object2);
            } else {
                g8.g((Throwable)object2);
            }
            k8.c(null);
            return;
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public final /* synthetic */ void G(Map object, V2.k k8) {
        try {
            object = object.get((Object)"enabled");
            Objects.requireNonNull((Object)object);
            object = (Boolean)object;
            D3.g.d().i((Boolean)object);
            k8.c((Object)new HashMap(){
                {
                    this.put((Object)"isCrashlyticsCollectionEnabled", (Object)n.this.v(s3.e.o()));
                }
            });
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final V2.j J(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new c(map, k8));
        return k8.a();
    }

    public final V2.j K(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new g(this, map, k8));
        return k8.a();
    }

    public final V2.j L() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new l(k8));
        return k8.a();
    }

    public final V2.j M(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new h(this, map, k8));
        return k8.a();
    }

    public final V2.j N(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new b(map, k8));
        return k8.a();
    }

    public final V2.j O(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new j(map, k8));
        return k8.a();
    }

    @Override
    public V2.j didReinitializeFirebaseCore() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new e(k8));
        return k8.a();
    }

    @Override
    public V2.j getPluginConstantsForFirebaseApp(s3.e e8) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new a(this, k8, e8));
        return k8.a();
    }

    public final V2.j o() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new i(this, k8));
        return k8.a();
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.u(b8.b());
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
            case 1219454365: {
                if (!string2.equals((Object)"Crashlytics#crash")) break;
                n9 = 9;
                break;
            }
            case 679831756: {
                if (!string2.equals((Object)"Crashlytics#setUserIdentifier")) break;
                n9 = 8;
                break;
            }
            case 213629529: {
                if (!string2.equals((Object)"Crashlytics#deleteUnsentReports")) break;
                n9 = 7;
                break;
            }
            case 108415030: {
                if (!string2.equals((Object)"Crashlytics#setCustomKey")) break;
                n9 = 6;
                break;
            }
            case 28093114: {
                if (!string2.equals((Object)"Crashlytics#log")) break;
                n9 = 5;
                break;
            }
            case -108157790: {
                if (!string2.equals((Object)"Crashlytics#setCrashlyticsCollectionEnabled")) break;
                n9 = 4;
                break;
            }
            case -424770276: {
                if (!string2.equals((Object)"Crashlytics#sendUnsentReports")) break;
                n9 = 3;
                break;
            }
            case -1025128541: {
                if (!string2.equals((Object)"Crashlytics#checkForUnsentReports")) break;
                n9 = 2;
                break;
            }
            case -1437158995: {
                if (!string2.equals((Object)"Crashlytics#recordError")) break;
                n9 = 1;
                break;
            }
            case -2094964816: {
                if (!string2.equals((Object)"Crashlytics#didCrashOnPreviousExecution")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                d8.c();
                return;
            }
            case 9: {
                this.p();
                return;
            }
            case 8: {
                object = this.O((Map)object.b());
                break;
            }
            case 7: {
                object = this.q();
                break;
            }
            case 6: {
                object = this.N((Map)object.b());
                break;
            }
            case 5: {
                object = this.J((Map)object.b());
                break;
            }
            case 4: {
                object = this.M((Map)object.b());
                break;
            }
            case 3: {
                object = this.L();
                break;
            }
            case 2: {
                object = this.o();
                break;
            }
            case 1: {
                object = this.K((Map)object.b());
                break;
            }
            case 0: {
                object = this.r();
            }
        }
        object.b(new f(d8));
    }

    public final void p() {
        new Handler(Looper.myLooper()).postDelayed((Runnable)new d(), 50L);
    }

    public final V2.j q() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new k(k8));
        return k8.a();
    }

    public final V2.j r() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new m(this, k8));
        return k8.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final StackTraceElement s(Map object) {
        try {
            String string2 = (String)object.get((Object)"file");
            String string3 = (String)object.get((Object)"line");
            String string4 = (String)object.get((Object)"class");
            String string5 = (String)object.get((Object)"method");
            object = string4;
            if (string4 == null) {
                object = "";
            }
            Objects.requireNonNull((Object)string3);
            return new StackTraceElement((String)object, string5, string2, Integer.parseInt((String)string3));
        }
        catch (Exception exception) {}
        Log.e((String)"FLTFirebaseCrashlytics", (String)"Unable to generate stack trace element from Dart error.");
        return null;
    }

    public final SharedPreferences t(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public final void u(E5.c object) {
        this.a = object = new E5.k((E5.c)object, "plugins.flutter.io/firebase_crashlytics");
        object.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    public final boolean v(s3.e e8) {
        SharedPreferences sharedPreferences = this.t(e8.m());
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            return sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (e8.x()) {
            D3.g.d().j(true);
            return true;
        }
        return false;
    }

    public final /* synthetic */ void w(V2.k k8) {
        try {
            k8.c((Object)new HashMap((Boolean)V2.m.a(D3.g.d().a())){
                public final /* synthetic */ boolean o;
                {
                    this.o = bl;
                    this.put((Object)"unsentReports", (Object)bl);
                }
            });
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void z(V2.k k8) {
        try {
            k8.c((Object)new HashMap(D3.g.d().c()){
                public final /* synthetic */ boolean o;
                {
                    this.o = bl;
                    this.put((Object)"didCrashOnPreviousExecution", (Object)bl);
                }
            });
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

}

