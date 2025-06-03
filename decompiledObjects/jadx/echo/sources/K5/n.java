package K5;

import A5.a;
import E5.k;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
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
import s3.C1947e;

/* loaded from: classes.dex */
public class n implements FlutterFirebasePlugin, A5.a, k.c {

    /* renamed from: a, reason: collision with root package name */
    public E5.k f3246a;

    public class a extends HashMap {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f3247o;

        public a(boolean z7) {
            this.f3247o = z7;
            put("unsentReports", Boolean.valueOf(z7));
        }
    }

    public class b extends HashMap {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f3249o;

        public b(boolean z7) {
            this.f3249o = z7;
            put("didCrashOnPreviousExecution", Boolean.valueOf(z7));
        }
    }

    public class c extends HashMap {
        public c() {
            put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.v(C1947e.o())));
        }
    }

    public class d extends HashMap {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C1947e f3252o;

        public d(C1947e c1947e) {
            this.f3252o = c1947e;
            if (c1947e.q().equals("[DEFAULT]")) {
                put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.v(C1947e.o())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(C0660k c0660k) {
        try {
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void C(Map map, C0660k c0660k) {
        try {
            Object obj = map.get("message");
            Objects.requireNonNull(obj);
            D3.g.d().f((String) obj);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void D(k.d dVar, AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            dVar.a(abstractC0659j.j());
        } else {
            Exception i7 = abstractC0659j.i();
            dVar.b("firebase_crashlytics", i7 != null ? i7.getMessage() : "An unknown error occurred", null);
        }
    }

    public static /* synthetic */ void F(C0660k c0660k) {
        try {
            D3.g.d().h();
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void H(Map map, C0660k c0660k) {
        try {
            Object obj = map.get("key");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            D3.g.d().k((String) obj, (String) obj2);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void I(Map map, C0660k c0660k) {
        try {
            Object obj = map.get("identifier");
            Objects.requireNonNull(obj);
            D3.g.d().l((String) obj);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void x() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    public static /* synthetic */ void y(C0660k c0660k) {
        try {
            D3.g.d().b();
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void B(C0660k c0660k, C1947e c1947e) {
        try {
            c0660k.c(new d(c1947e));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void E(Map map, C0660k c0660k) {
        FlutterError flutterError;
        try {
            D3.g d7 = D3.g.d();
            Object obj = map.get("exception");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get("reason");
            Object obj2 = map.get("information");
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get("fatal");
            Objects.requireNonNull(obj3);
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get("buildId");
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            if (str4.length() > 0) {
                D3.h.b(str4);
            }
            if (str2 != null) {
                d7.k("flutter_error_reason", "thrown " + str2);
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            d7.k("flutter_error_exception", str);
            ArrayList arrayList = new ArrayList();
            Object obj5 = map.get("stackTraceElements");
            Objects.requireNonNull(obj5);
            Iterator it = ((List) obj5).iterator();
            while (it.hasNext()) {
                StackTraceElement s7 = s((Map) it.next());
                if (s7 != null) {
                    arrayList.add(s7);
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                d7.f(str3);
            }
            if (booleanValue) {
                D3.h.a(flutterError);
            } else {
                d7.g(flutterError);
            }
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void G(Map map, C0660k c0660k) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            D3.g.d().i((Boolean) obj);
            c0660k.c(new c());
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final AbstractC0659j J(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.c
            @Override // java.lang.Runnable
            public final void run() {
                n.C(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j K(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.g
            @Override // java.lang.Runnable
            public final void run() {
                n.this.E(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j L() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.l
            @Override // java.lang.Runnable
            public final void run() {
                n.F(C0660k.this);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j M(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.h
            @Override // java.lang.Runnable
            public final void run() {
                n.this.G(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j N(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.b
            @Override // java.lang.Runnable
            public final void run() {
                n.H(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j O(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.j
            @Override // java.lang.Runnable
            public final void run() {
                n.I(map, c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j didReinitializeFirebaseCore() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.e
            @Override // java.lang.Runnable
            public final void run() {
                n.A(C0660k.this);
            }
        });
        return c0660k.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j getPluginConstantsForFirebaseApp(final C1947e c1947e) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.a
            @Override // java.lang.Runnable
            public final void run() {
                n.this.B(c0660k, c1947e);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j o() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.i
            @Override // java.lang.Runnable
            public final void run() {
                n.this.w(c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        u(bVar.b());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        E5.k kVar = this.f3246a;
        if (kVar != null) {
            kVar.e(null);
            this.f3246a = null;
        }
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, final k.d dVar) {
        AbstractC0659j r7;
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "Crashlytics#didCrashOnPreviousExecution":
                r7 = r();
                break;
            case "Crashlytics#recordError":
                r7 = K((Map) jVar.b());
                break;
            case "Crashlytics#checkForUnsentReports":
                r7 = o();
                break;
            case "Crashlytics#sendUnsentReports":
                r7 = L();
                break;
            case "Crashlytics#setCrashlyticsCollectionEnabled":
                r7 = M((Map) jVar.b());
                break;
            case "Crashlytics#log":
                r7 = J((Map) jVar.b());
                break;
            case "Crashlytics#setCustomKey":
                r7 = N((Map) jVar.b());
                break;
            case "Crashlytics#deleteUnsentReports":
                r7 = q();
                break;
            case "Crashlytics#setUserIdentifier":
                r7 = O((Map) jVar.b());
                break;
            case "Crashlytics#crash":
                p();
                return;
            default:
                dVar.c();
                return;
        }
        r7.b(new InterfaceC0654e() { // from class: K5.f
            @Override // V2.InterfaceC0654e
            public final void a(AbstractC0659j abstractC0659j) {
                n.D(k.d.this, abstractC0659j);
            }
        });
    }

    public final void p() {
        new Handler(Looper.myLooper()).postDelayed(new Runnable() { // from class: K5.d
            @Override // java.lang.Runnable
            public final void run() {
                n.x();
            }
        }, 50L);
    }

    public final AbstractC0659j q() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.k
            @Override // java.lang.Runnable
            public final void run() {
                n.y(C0660k.this);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j r() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: K5.m
            @Override // java.lang.Runnable
            public final void run() {
                n.this.z(c0660k);
            }
        });
        return c0660k.a();
    }

    public final StackTraceElement s(Map map) {
        try {
            String str = (String) map.get("file");
            String str2 = (String) map.get("line");
            String str3 = (String) map.get("class");
            String str4 = (String) map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    public final SharedPreferences t(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public final void u(E5.c cVar) {
        E5.k kVar = new E5.k(cVar, "plugins.flutter.io/firebase_crashlytics");
        this.f3246a = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    public final boolean v(C1947e c1947e) {
        SharedPreferences t7 = t(c1947e.m());
        if (t7.contains("firebase_crashlytics_collection_enabled")) {
            return t7.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (!c1947e.x()) {
            return false;
        }
        D3.g.d().j(true);
        return true;
    }

    public final /* synthetic */ void w(C0660k c0660k) {
        try {
            c0660k.c(new a(((Boolean) V2.m.a(D3.g.d().a())).booleanValue()));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void z(C0660k c0660k) {
        try {
            c0660k.c(new b(D3.g.d().c()));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }
}
