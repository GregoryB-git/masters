package I5;

import A5.a;
import E5.k;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s3.C1947e;

/* loaded from: classes.dex */
public class n implements FlutterFirebasePlugin, k.c, A5.a {

    /* renamed from: a, reason: collision with root package name */
    public FirebaseAnalytics f2617a;

    /* renamed from: b, reason: collision with root package name */
    public E5.k f2618b;

    public class a extends HashMap {
        public a() {
        }
    }

    public static /* synthetic */ void H(k.d dVar, AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            dVar.a(abstractC0659j.j());
        } else {
            Exception i7 = abstractC0659j.i();
            dVar.b("firebase_analytics", i7 != null ? i7.getMessage() : "An unknown error occurred", null);
        }
    }

    private static Bundle n(Map map) {
        long intValue;
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else {
                if (value instanceof Integer) {
                    intValue = ((Integer) value).intValue();
                } else if (value instanceof Long) {
                    intValue = ((Long) value).longValue();
                } else if (value instanceof Double) {
                    bundle.putDouble(str, ((Double) value).doubleValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) value).booleanValue());
                } else if (value == null) {
                    bundle.putString(str, null);
                } else if (value instanceof Iterable) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (Object obj : (Iterable) value) {
                        if (!(obj instanceof Map)) {
                            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass().getCanonicalName() + " in list at key " + str);
                        }
                        arrayList.add(n((Map) obj));
                    }
                    bundle.putParcelableArrayList(str, arrayList);
                } else {
                    if (!(value instanceof Map)) {
                        throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
                    }
                    bundle.putParcelable(str, n((Map) value));
                }
                bundle.putLong(str, intValue);
            }
        }
        return bundle;
    }

    private void w(E5.c cVar, Context context) {
        this.f2617a = FirebaseAnalytics.getInstance(context);
        E5.k kVar = new E5.k(cVar, "plugins.flutter.io/firebase_analytics");
        this.f2618b = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    public static /* synthetic */ void x(C0660k c0660k) {
        try {
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void A(C0660k c0660k) {
        try {
            c0660k.c((Long) V2.m.a(this.f2617a.b()));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void B(Map map, C0660k c0660k) {
        try {
            Object obj = map.get("eventName");
            Objects.requireNonNull(obj);
            Bundle n7 = n((Map) map.get("parameters"));
            this.f2617a.c((String) obj, n7);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void C(C0660k c0660k) {
        try {
            this.f2617a.d();
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void D(Map map, C0660k c0660k) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            this.f2617a.e(((Boolean) obj).booleanValue());
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void E(Map map, C0660k c0660k) {
        try {
            Objects.requireNonNull(map.get("milliseconds"));
            this.f2617a.h(((Integer) r4).intValue());
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void F(Map map, C0660k c0660k) {
        try {
            this.f2617a.i((String) map.get("userId"));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void G(Map map, C0660k c0660k) {
        try {
            Object obj = map.get("name");
            Objects.requireNonNull(obj);
            String str = (String) map.get("value");
            this.f2617a.j((String) obj, str);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void I(Map map, C0660k c0660k) {
        try {
            Boolean bool = (Boolean) map.get("adStorageConsentGranted");
            Boolean bool2 = (Boolean) map.get("analyticsStorageConsentGranted");
            HashMap hashMap = new HashMap();
            if (bool != null) {
                hashMap.put(FirebaseAnalytics.b.AD_STORAGE, bool.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool2 != null) {
                hashMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, bool2.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            this.f2617a.f(hashMap);
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void J(Map map, C0660k c0660k) {
        try {
            this.f2617a.g(n(map));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final AbstractC0659j K(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.b
            @Override // java.lang.Runnable
            public final void run() {
                n.this.I(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j L(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.d
            @Override // java.lang.Runnable
            public final void run() {
                n.this.J(map, c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j didReinitializeFirebaseCore() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.e
            @Override // java.lang.Runnable
            public final void run() {
                n.x(C0660k.this);
            }
        });
        return c0660k.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j getPluginConstantsForFirebaseApp(C1947e c1947e) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.a
            @Override // java.lang.Runnable
            public final void run() {
                n.this.y(c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j o() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.j
            @Override // java.lang.Runnable
            public final void run() {
                n.this.z(c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        w(bVar.b(), bVar.a());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        E5.k kVar = this.f2618b;
        if (kVar != null) {
            kVar.e(null);
            this.f2618b = null;
        }
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, final k.d dVar) {
        AbstractC0659j o7;
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "Analytics#getAppInstanceId":
                o7 = o();
                break;
            case "Analytics#resetAnalyticsData":
                o7 = r();
                break;
            case "Analytics#setConsent":
                o7 = K((Map) jVar.b());
                break;
            case "Analytics#setAnalyticsCollectionEnabled":
                o7 = s((Map) jVar.b());
                break;
            case "Analytics#setDefaultEventParameters":
                o7 = L((Map) jVar.b());
                break;
            case "Analytics#logEvent":
                o7 = q((Map) jVar.b());
                break;
            case "Analytics#getSessionId":
                o7 = p();
                break;
            case "Analytics#setUserProperty":
                o7 = v((Map) jVar.b());
                break;
            case "Analytics#setSessionTimeoutDuration":
                o7 = t((Map) jVar.b());
                break;
            case "Analytics#setUserId":
                o7 = u((Map) jVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        o7.b(new InterfaceC0654e() { // from class: I5.f
            @Override // V2.InterfaceC0654e
            public final void a(AbstractC0659j abstractC0659j) {
                n.H(k.d.this, abstractC0659j);
            }
        });
    }

    public final AbstractC0659j p() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.g
            @Override // java.lang.Runnable
            public final void run() {
                n.this.A(c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j q(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.i
            @Override // java.lang.Runnable
            public final void run() {
                n.this.B(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j r() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.m
            @Override // java.lang.Runnable
            public final void run() {
                n.this.C(c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j s(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.l
            @Override // java.lang.Runnable
            public final void run() {
                n.this.D(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j t(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.k
            @Override // java.lang.Runnable
            public final void run() {
                n.this.E(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j u(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.c
            @Override // java.lang.Runnable
            public final void run() {
                n.this.F(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j v(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: I5.h
            @Override // java.lang.Runnable
            public final void run() {
                n.this.G(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final /* synthetic */ void y(C0660k c0660k) {
        try {
            c0660k.c(new a());
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void z(C0660k c0660k) {
        try {
            c0660k.c((String) V2.m.a(this.f2617a.a()));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }
}
