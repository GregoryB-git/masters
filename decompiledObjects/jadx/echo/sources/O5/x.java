package O5;

import A5.a;
import E5.k;
import O5.A;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.T;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s3.C1947e;
import v5.C2071j;

/* loaded from: classes.dex */
public class x implements FlutterFirebasePlugin, k.c, E5.n, A5.a, B5.a {

    /* renamed from: b, reason: collision with root package name */
    public E5.k f4076b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f4077c;

    /* renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.m f4079e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.m f4081g;

    /* renamed from: h, reason: collision with root package name */
    public T f4082h;

    /* renamed from: i, reason: collision with root package name */
    public Map f4083i;

    /* renamed from: j, reason: collision with root package name */
    public A f4084j;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4075a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LiveData f4078d = B.k();

    /* renamed from: f, reason: collision with root package name */
    public final LiveData f4080f = C.k();

    public class a extends HashMap {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f4085o;

        public a(String str) {
            this.f4085o = str;
            put("token", str);
        }
    }

    public class b extends HashMap {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ FirebaseMessaging f4087o;

        public b(FirebaseMessaging firebaseMessaging) {
            this.f4087o = firebaseMessaging;
            put("isAutoInitEnabled", Boolean.valueOf(firebaseMessaging.y()));
        }
    }

    public static /* synthetic */ void C(C1947e c1947e, C0660k c0660k) {
        try {
            HashMap hashMap = new HashMap();
            if (c1947e.q().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.r().y()));
            }
            c0660k.c(hashMap);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void H(Map map, C0660k c0660k, int i7) {
        map.put("authorizationStatus", Integer.valueOf(i7));
        c0660k.c(map);
    }

    public static /* synthetic */ void I(C0660k c0660k, String str) {
        c0660k.b(new Exception(str));
    }

    public static /* synthetic */ void K(Map map, C0660k c0660k) {
        try {
            z.a(map).L(z.b(map));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void M(Map map, C0660k c0660k) {
        try {
            FirebaseMessaging a7 = z.a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a7.N(((Boolean) obj).booleanValue());
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void N(Map map, C0660k c0660k) {
        try {
            FirebaseMessaging a7 = z.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            V2.m.a(a7.R((String) obj));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ void O(Map map, C0660k c0660k) {
        try {
            FirebaseMessaging a7 = z.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            V2.m.a(a7.U((String) obj));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    private Map t(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put("message", exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    private void x(E5.c cVar) {
        E5.k kVar = new E5.k(cVar, "plugins.flutter.io/firebase_messaging");
        this.f4076b = kVar;
        kVar.e(this);
        this.f4084j = new A();
        this.f4079e = new androidx.lifecycle.m() { // from class: O5.o
            @Override // androidx.lifecycle.m
            public final void a(Object obj) {
                x.this.E((T) obj);
            }
        };
        this.f4081g = new androidx.lifecycle.m() { // from class: O5.p
            @Override // androidx.lifecycle.m
            public final void a(Object obj) {
                x.this.F((String) obj);
            }
        };
        this.f4078d.e(this.f4079e);
        this.f4080f.e(this.f4081g);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    public static /* synthetic */ void y(C0660k c0660k) {
        try {
            V2.m.a(FirebaseMessaging.r().o());
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void A(C0660k c0660k) {
        Map map;
        try {
            T t7 = this.f4082h;
            if (t7 != null) {
                Map f7 = z.f(t7);
                Map map2 = this.f4083i;
                if (map2 != null) {
                    f7.put("notification", map2);
                }
                c0660k.c(f7);
                this.f4082h = null;
                this.f4083i = null;
                return;
            }
            Activity activity = this.f4077c;
            if (activity == null) {
                c0660k.c(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.f4075a.get(string) == null) {
                    T t8 = (T) FlutterFirebaseMessagingReceiver.f15117a.get(string);
                    if (t8 == null) {
                        Map a7 = y.b().a(string);
                        if (a7 != null) {
                            t8 = z.b(a7);
                            if (a7.get("notification") != null) {
                                map = (Map) a7.get("notification");
                                y.b().g(string);
                            }
                        }
                        map = null;
                        y.b().g(string);
                    } else {
                        map = null;
                    }
                    if (t8 == null) {
                        c0660k.c(null);
                        return;
                    }
                    this.f4075a.put(string, Boolean.TRUE);
                    Map f8 = z.f(t8);
                    if (t8.q() == null && map != null) {
                        f8.put("notification", map);
                    }
                    c0660k.c(f8);
                    return;
                }
                c0660k.c(null);
                return;
            }
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void B(C0660k c0660k) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("authorizationStatus", Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? r().booleanValue() : w.k.b(this.f4077c).a()));
            c0660k.c(hashMap);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void D(C0660k c0660k) {
        try {
            c0660k.c(new a((String) V2.m.a(FirebaseMessaging.r().u())));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void E(T t7) {
        this.f4076b.c("Messaging#onMessage", z.f(t7));
    }

    public final /* synthetic */ void F(String str) {
        this.f4076b.c("Messaging#onTokenRefresh", str);
    }

    public final /* synthetic */ void G(k.d dVar, AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            dVar.a(abstractC0659j.j());
        } else {
            Exception i7 = abstractC0659j.i();
            dVar.b("firebase_messaging", i7 != null ? i7.getMessage() : null, t(i7));
        }
    }

    public final /* synthetic */ void J(final C0660k c0660k) {
        final HashMap hashMap = new HashMap();
        try {
            if (r().booleanValue()) {
                hashMap.put("authorizationStatus", 1);
                c0660k.c(hashMap);
            } else {
                this.f4084j.a(this.f4077c, new A.a() { // from class: O5.m
                    @Override // O5.A.a
                    public final void a(int i7) {
                        x.H(hashMap, c0660k, i7);
                    }
                }, new InterfaceC0461b() { // from class: O5.n
                    @Override // O5.InterfaceC0461b
                    public final void a(String str) {
                        x.I(C0660k.this, str);
                    }
                });
            }
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void L(Map map, C0660k c0660k) {
        try {
            FirebaseMessaging a7 = z.a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a7.M(((Boolean) obj).booleanValue());
            c0660k.c(new b(a7));
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final AbstractC0659j P() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.s
            @Override // java.lang.Runnable
            public final void run() {
                x.this.J(c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j Q(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.t
            @Override // java.lang.Runnable
            public final void run() {
                x.K(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j R(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.k
            @Override // java.lang.Runnable
            public final void run() {
                x.this.L(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j S(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.j
            @Override // java.lang.Runnable
            public final void run() {
                x.M(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j T(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.l
            @Override // java.lang.Runnable
            public final void run() {
                x.N(map, c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j U(final Map map) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.i
            @Override // java.lang.Runnable
            public final void run() {
                x.O(map, c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j didReinitializeFirebaseCore() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.q
            @Override // java.lang.Runnable
            public final void run() {
                C0660k.this.c(null);
            }
        });
        return c0660k.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC0659j getPluginConstantsForFirebaseApp(final C1947e c1947e) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.g
            @Override // java.lang.Runnable
            public final void run() {
                x.C(C1947e.this, c0660k);
            }
        });
        return c0660k.a();
    }

    @Override // B5.a
    public void onAttachedToActivity(B5.c cVar) {
        cVar.g(this);
        cVar.e(this.f4084j);
        Activity c7 = cVar.c();
        this.f4077c = c7;
        if (c7.getIntent() == null || this.f4077c.getIntent().getExtras() == null || (this.f4077c.getIntent().getFlags() & 1048576) == 1048576) {
            return;
        }
        onNewIntent(this.f4077c.getIntent());
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        x(bVar.b());
    }

    @Override // B5.a
    public void onDetachedFromActivity() {
        this.f4077c = null;
    }

    @Override // B5.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f4077c = null;
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f4080f.i(this.f4081g);
        this.f4078d.i(this.f4079e);
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, final k.d dVar) {
        AbstractC0659j u7;
        long intValue;
        long intValue2;
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "Messaging#getInitialMessage":
                u7 = u();
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            case "Messaging#setAutoInitEnabled":
                u7 = R((Map) jVar.b());
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            case "Messaging#deleteToken":
                u7 = s();
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            case "Messaging#unsubscribeFromTopic":
                u7 = U((Map) jVar.b());
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            case "Messaging#subscribeToTopic":
                u7 = T((Map) jVar.b());
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            case "Messaging#setDeliveryMetricsExportToBigQuery":
                u7 = S((Map) jVar.b());
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            case "Messaging#startBackgroundIsolate":
                Map map = (Map) jVar.f1671b;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    intValue = ((Long) obj).longValue();
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    intValue = ((Integer) obj).intValue();
                }
                if (obj2 instanceof Long) {
                    intValue2 = ((Long) obj2).longValue();
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    intValue2 = ((Integer) obj2).intValue();
                }
                Activity activity = this.f4077c;
                C2071j a7 = activity != null ? C2071j.a(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.n(intValue);
                FlutterFirebaseMessagingBackgroundService.o(intValue2);
                FlutterFirebaseMessagingBackgroundService.p(intValue, a7);
                u7 = V2.m.e(null);
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            case "Messaging#sendMessage":
                u7 = Q((Map) jVar.b());
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            case "Messaging#requestPermission":
                if (Build.VERSION.SDK_INT >= 33) {
                    u7 = P();
                    u7.b(new InterfaceC0654e() { // from class: O5.r
                        @Override // V2.InterfaceC0654e
                        public final void a(AbstractC0659j abstractC0659j) {
                            x.this.G(dVar, abstractC0659j);
                        }
                    });
                    return;
                }
            case "Messaging#getNotificationSettings":
                u7 = v();
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            case "Messaging#getToken":
                u7 = w();
                u7.b(new InterfaceC0654e() { // from class: O5.r
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        x.this.G(dVar, abstractC0659j);
                    }
                });
                return;
            default:
                dVar.c();
                return;
        }
    }

    @Override // E5.n
    public boolean onNewIntent(Intent intent) {
        Map map;
        Map map2;
        Map a7;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        T t7 = (T) FlutterFirebaseMessagingReceiver.f15117a.get(string);
        if (t7 != null || (a7 = y.b().a(string)) == null) {
            map = null;
        } else {
            t7 = z.b(a7);
            map = z.c(a7);
        }
        if (t7 == null) {
            return false;
        }
        this.f4082h = t7;
        this.f4083i = map;
        FlutterFirebaseMessagingReceiver.f15117a.remove(string);
        Map f7 = z.f(t7);
        if (t7.q() == null && (map2 = this.f4083i) != null) {
            f7.put("notification", map2);
        }
        this.f4076b.c("Messaging#onMessageOpenedApp", f7);
        this.f4077c.setIntent(intent);
        return true;
    }

    @Override // B5.a
    public void onReattachedToActivityForConfigChanges(B5.c cVar) {
        cVar.g(this);
        this.f4077c = cVar.c();
    }

    public final Boolean r() {
        return Boolean.valueOf(AbstractC0460a.a().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    public final AbstractC0659j s() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.v
            @Override // java.lang.Runnable
            public final void run() {
                x.y(C0660k.this);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j u() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.h
            @Override // java.lang.Runnable
            public final void run() {
                x.this.A(c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j v() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.w
            @Override // java.lang.Runnable
            public final void run() {
                x.this.B(c0660k);
            }
        });
        return c0660k.a();
    }

    public final AbstractC0659j w() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: O5.u
            @Override // java.lang.Runnable
            public final void run() {
                x.this.D(c0660k);
            }
        });
        return c0660k.a();
    }
}
