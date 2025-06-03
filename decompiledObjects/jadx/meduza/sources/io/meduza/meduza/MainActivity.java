package io.meduza.meduza;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Bundle;
import b1.v;
import dc.p;
import defpackage.g;
import ec.s;
import f8.c;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.meduza.meduza.MainActivity;
import j8.q;
import java.util.Map;
import mobileproxy.Mobileproxy;
import mobileproxy.Proxy;
import mobileproxy.StreamDialer;
import nc.d0;
import rb.f;
import rb.h;
import wb.e;
import wb.i;

/* loaded from: classes.dex */
public final class MainActivity extends FlutterActivity {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f8179r = 0;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f8181b;

    /* renamed from: c, reason: collision with root package name */
    public v f8182c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, ? extends Object> f8183d;

    /* renamed from: e, reason: collision with root package name */
    public ob.b f8184e;
    public ConnectivityManager f;

    /* renamed from: o, reason: collision with root package name */
    public b f8185o;

    /* renamed from: p, reason: collision with root package name */
    public NetworkCapabilities f8186p;

    /* renamed from: a, reason: collision with root package name */
    public final String f8180a = "meduza.meduza.io/mobile_proxy";

    /* renamed from: q, reason: collision with root package name */
    public final b f8187q = new b();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8188a;

        static {
            int[] iArr = new int[ob.b.values().length];
            try {
                ob.b bVar = ob.b.f12136a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ob.b bVar2 = ob.b.f12136a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8188a = iArr;
        }
    }

    public static final class b extends ConnectivityManager.NetworkCallback {

        @e(c = "io.meduza.meduza.MainActivity$networkHandler$1$onCapabilitiesChanged$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends i implements p<d0, ub.e<? super h>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MainActivity f8190a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, ub.e<? super a> eVar) {
                super(2, eVar);
                this.f8190a = mainActivity;
            }

            @Override // wb.a
            public final ub.e<h> create(Object obj, ub.e<?> eVar) {
                return new a(this.f8190a, eVar);
            }

            @Override // dc.p
            public final Object invoke(d0 d0Var, ub.e<? super h> eVar) {
                return ((a) create(d0Var, eVar)).invokeSuspend(h.f13851a);
            }

            @Override // wb.a
            public final Object invokeSuspend(Object obj) {
                vb.a aVar = vb.a.f16085a;
                f.b(obj);
                MainActivity mainActivity = this.f8190a;
                mainActivity.b(mainActivity.f8183d);
                return h.f13851a;
            }
        }

        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
        @Override // android.net.ConnectivityManager.NetworkCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onCapabilitiesChanged(android.net.Network r5, android.net.NetworkCapabilities r6) {
            /*
                r4 = this;
                java.lang.String r0 = "network"
                ec.i.e(r5, r0)
                java.lang.String r0 = "networkCapabilities"
                ec.i.e(r6, r0)
                super.onCapabilitiesChanged(r5, r6)
                io.meduza.meduza.MainActivity r5 = io.meduza.meduza.MainActivity.this
                android.net.NetworkCapabilities r5 = r5.f8186p
                r0 = 0
                r1 = 1
                if (r5 == 0) goto L21
                boolean r5 = r5.hasTransport(r1)
                boolean r2 = r6.hasTransport(r1)
                if (r5 != r2) goto L21
                r5 = r1
                goto L22
            L21:
                r5 = r0
            L22:
                if (r5 == 0) goto L3c
                io.meduza.meduza.MainActivity r5 = io.meduza.meduza.MainActivity.this
                android.net.NetworkCapabilities r5 = r5.f8186p
                if (r5 == 0) goto L36
                boolean r5 = r5.hasTransport(r0)
                boolean r2 = r6.hasTransport(r0)
                if (r5 != r2) goto L36
                r5 = r1
                goto L37
            L36:
                r5 = r0
            L37:
                if (r5 != 0) goto L3a
                goto L3c
            L3a:
                r5 = r0
                goto L3d
            L3c:
                r5 = r1
            L3d:
                io.meduza.meduza.MainActivity r2 = io.meduza.meduza.MainActivity.this
                android.net.NetworkCapabilities r2 = r2.f8186p
                if (r2 == 0) goto L4b
                boolean r2 = r2.hasTransport(r1)
                if (r2 != r1) goto L4b
                r2 = r1
                goto L4c
            L4b:
                r2 = r0
            L4c:
                if (r2 == 0) goto L69
                boolean r2 = r6.hasTransport(r1)
                if (r2 != r1) goto L69
                io.meduza.meduza.MainActivity r2 = io.meduza.meduza.MainActivity.this
                android.net.NetworkCapabilities r3 = r2.f8186p
                java.lang.String r2 = io.meduza.meduza.MainActivity.a(r2, r3)
                io.meduza.meduza.MainActivity r3 = io.meduza.meduza.MainActivity.this
                java.lang.String r3 = io.meduza.meduza.MainActivity.a(r3, r6)
                boolean r2 = ec.i.a(r2, r3)
                if (r2 != 0) goto L69
                r0 = r1
            L69:
                if (r5 != 0) goto L6d
                if (r0 == 0) goto L7f
            L6d:
                io.meduza.meduza.MainActivity r5 = io.meduza.meduza.MainActivity.this
                r5.f8186p = r6
                nc.d1 r6 = nc.d1.f11485a
                tc.b r0 = nc.r0.f11546b
                io.meduza.meduza.MainActivity$b$a r1 = new io.meduza.meduza.MainActivity$b$a
                r2 = 0
                r1.<init>(r5, r2)
                r5 = 2
                x6.b.g0(r6, r0, r1, r5)
            L7f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.meduza.meduza.MainActivity.b.onCapabilitiesChanged(android.net.Network, android.net.NetworkCapabilities):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:17:0x0006, B:19:0x0015, B:4:0x001d, B:6:0x0021, B:8:0x0027), top: B:16:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:17:0x0006, B:19:0x0015, B:4:0x001d, B:6:0x0021, B:8:0x0027), top: B:16:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(io.meduza.meduza.MainActivity r4, android.net.NetworkCapabilities r5) {
        /*
            r4.getClass()
            r4 = 0
            if (r5 == 0) goto L1c
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "getTransportInfo"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L2b
            java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Exception -> L2b
            goto L1d
        L1c:
            r5 = r4
        L1d:
            boolean r0 = r5 instanceof android.net.wifi.WifiInfo     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L24
            android.net.wifi.WifiInfo r5 = (android.net.wifi.WifiInfo) r5     // Catch: java.lang.Exception -> L2b
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 == 0) goto L2b
            java.lang.String r4 = r5.getSSID()     // Catch: java.lang.Exception -> L2b
        L2b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.meduza.meduza.MainActivity.a(io.meduza.meduza.MainActivity, android.net.NetworkCapabilities):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Map<String, ? extends Object> map) {
        T t = 0;
        t = 0;
        Object obj = map != null ? map.get("config") : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map != null ? map.get("domains") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        s sVar = new s();
        try {
            ob.b bVar = this.f8184e;
            int i10 = bVar == null ? -1 : a.f8188a[bVar.ordinal()];
            if (i10 == 1) {
                v vVar = this.f8182c;
                if (vVar != null) {
                    ec.i.b(str);
                    ec.i.b(str2);
                    t = vVar.k(str, str2);
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("Invalid mode: " + this.f8184e);
                }
                v vVar2 = this.f8182c;
                if (vVar2 != null) {
                    ec.i.b(str);
                    Proxy runProxy = Mobileproxy.runProxy("localhost:0", new StreamDialer(str));
                    vVar2.f1801a = runProxy;
                    ec.i.b(runProxy);
                    String address = runProxy.address();
                    ec.i.d(address, "address(...)");
                    t = address;
                }
            }
            sVar.f5272a = t;
        } catch (Exception e10) {
            c a10 = c.a();
            String str3 = "mobile-proxy-[" + this.f8184e + "]: failed to start";
            j8.s sVar2 = a10.f5482a;
            sVar2.getClass();
            sVar2.f8639p.f9140a.a(new q(sVar2, System.currentTimeMillis() - sVar2.f8628d, str3));
            c.a().b(e10);
        }
        runOnUiThread(new io.flutter.plugins.firebase.firestore.streamhandler.b(2, this, sVar));
    }

    @Override // io.flutter.embedding.android.FlutterActivity, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public final void configureFlutterEngine(FlutterEngine flutterEngine) {
        ec.i.e(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        this.f8181b = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), this.f8180a);
        this.f8182c = new v(9);
        MethodChannel methodChannel = this.f8181b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: ob.a
                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    Map<String, ? extends Object> map;
                    b bVar;
                    Proxy proxy;
                    ConnectivityManager connectivityManager;
                    Proxy proxy2;
                    MainActivity mainActivity = MainActivity.this;
                    int i10 = MainActivity.f8179r;
                    ec.i.e(methodCall, "call");
                    ec.i.e(result, "result");
                    String str = methodCall.method;
                    c a10 = c.a();
                    String e10 = g.e("Android native code log configureFlutterEngine ", str, " method called");
                    j8.s sVar = a10.f5482a;
                    sVar.getClass();
                    sVar.f8639p.f9140a.a(new q(sVar, System.currentTimeMillis() - sVar.f8628d, e10));
                    if (ec.i.a(str, "start_outline")) {
                        v vVar = mainActivity.f8182c;
                        if (vVar != null && (proxy2 = (Proxy) vVar.f1801a) != null) {
                            proxy2.stop(2L);
                        }
                        if (((String) methodCall.argument("config")) == null) {
                            result.error("INVALID_ARGUMENTS", "config are required", null);
                        }
                        map = (Map) methodCall.arguments();
                        mainActivity.f8183d = map;
                        bVar = b.f12136a;
                    } else {
                        if (!ec.i.a(str, "start_smart")) {
                            c.a().b(new Exception(g.e("Android native code log proxyChannel ", str, " method not implemented")));
                            result.notImplemented();
                            return;
                        }
                        v vVar2 = mainActivity.f8182c;
                        if (vVar2 != null && (proxy = (Proxy) vVar2.f1801a) != null) {
                            proxy.stop(2L);
                        }
                        String str2 = (String) methodCall.argument("config");
                        String str3 = (String) methodCall.argument("domains");
                        if (str2 == null && str3 == null) {
                            result.error("INVALID_ARGUMENTS", "config and domains are required", null);
                        }
                        map = (Map) methodCall.arguments();
                        mainActivity.f8183d = map;
                        bVar = b.f12137b;
                    }
                    mainActivity.f8184e = bVar;
                    mainActivity.b(map);
                    NetworkRequest.Builder builder = new NetworkRequest.Builder();
                    MainActivity.b bVar2 = mainActivity.f8185o;
                    if (bVar2 != null && (connectivityManager = mainActivity.f) != null) {
                        connectivityManager.unregisterNetworkCallback(bVar2);
                    }
                    ConnectivityManager connectivityManager2 = mainActivity.f;
                    if (connectivityManager2 != null) {
                        connectivityManager2.registerNetworkCallback(builder.build(), mainActivity.f8187q);
                        h hVar = h.f13851a;
                    }
                    mainActivity.f8185o = mainActivity.f8187q;
                    result.success(null);
                }
            });
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object systemService = getSystemService("connectivity");
        ec.i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
    }

    @Override // io.flutter.embedding.android.FlutterActivity, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
    public final FlutterEngine provideFlutterEngine(Context context) {
        ec.i.e(context, "context");
        return com.ryanheise.audioservice.b.i(context);
    }
}
