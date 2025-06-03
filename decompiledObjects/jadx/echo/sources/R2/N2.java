package R2;

import A2.AbstractC0328n;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C0979n6;
import com.google.android.gms.internal.measurement.H6;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class N2 implements InterfaceC0571o3 {

    /* renamed from: I, reason: collision with root package name */
    public static volatile N2 f4903I;

    /* renamed from: A, reason: collision with root package name */
    public volatile Boolean f4904A;

    /* renamed from: B, reason: collision with root package name */
    public Boolean f4905B;

    /* renamed from: C, reason: collision with root package name */
    public Boolean f4906C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f4907D;

    /* renamed from: E, reason: collision with root package name */
    public int f4908E;

    /* renamed from: F, reason: collision with root package name */
    public int f4909F;

    /* renamed from: H, reason: collision with root package name */
    public final long f4911H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4912a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4913b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4914c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4915d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4916e;

    /* renamed from: f, reason: collision with root package name */
    public final C0504f f4917f;

    /* renamed from: g, reason: collision with root package name */
    public final C0511g f4918g;

    /* renamed from: h, reason: collision with root package name */
    public final C0549l2 f4919h;

    /* renamed from: i, reason: collision with root package name */
    public final Y1 f4920i;

    /* renamed from: j, reason: collision with root package name */
    public final G2 f4921j;

    /* renamed from: k, reason: collision with root package name */
    public final C0552l5 f4922k;

    /* renamed from: l, reason: collision with root package name */
    public final S5 f4923l;

    /* renamed from: m, reason: collision with root package name */
    public final X1 f4924m;

    /* renamed from: n, reason: collision with root package name */
    public final E2.e f4925n;

    /* renamed from: o, reason: collision with root package name */
    public final C0620v4 f4926o;

    /* renamed from: p, reason: collision with root package name */
    public final C3 f4927p;

    /* renamed from: q, reason: collision with root package name */
    public final B f4928q;

    /* renamed from: r, reason: collision with root package name */
    public final C0586q4 f4929r;

    /* renamed from: s, reason: collision with root package name */
    public final String f4930s;

    /* renamed from: t, reason: collision with root package name */
    public V1 f4931t;

    /* renamed from: u, reason: collision with root package name */
    public D4 f4932u;

    /* renamed from: v, reason: collision with root package name */
    public C f4933v;

    /* renamed from: w, reason: collision with root package name */
    public S1 f4934w;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f4936y;

    /* renamed from: z, reason: collision with root package name */
    public long f4937z;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4935x = false;

    /* renamed from: G, reason: collision with root package name */
    public AtomicInteger f4910G = new AtomicInteger(0);

    public N2(C0633x3 c0633x3) {
        C0472a2 L6;
        String str;
        Bundle bundle;
        boolean z7 = false;
        AbstractC0328n.i(c0633x3);
        C0504f c0504f = new C0504f(c0633x3.f5599a);
        this.f4917f = c0504f;
        M1.f4896a = c0504f;
        Context context = c0633x3.f5599a;
        this.f4912a = context;
        this.f4913b = c0633x3.f5600b;
        this.f4914c = c0633x3.f5601c;
        this.f4915d = c0633x3.f5602d;
        this.f4916e = c0633x3.f5606h;
        this.f4904A = c0633x3.f5603e;
        this.f4930s = c0633x3.f5608j;
        this.f4907D = true;
        com.google.android.gms.internal.measurement.H0 h02 = c0633x3.f5605g;
        if (h02 != null && (bundle = h02.f10396u) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f4905B = (Boolean) obj;
            }
            Object obj2 = h02.f10396u.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f4906C = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.S2.l(context);
        E2.e d7 = E2.h.d();
        this.f4925n = d7;
        Long l7 = c0633x3.f5607i;
        this.f4911H = l7 != null ? l7.longValue() : d7.a();
        this.f4918g = new C0511g(this);
        C0549l2 c0549l2 = new C0549l2(this);
        c0549l2.p();
        this.f4919h = c0549l2;
        Y1 y12 = new Y1(this);
        y12.p();
        this.f4920i = y12;
        S5 s52 = new S5(this);
        s52.p();
        this.f4923l = s52;
        this.f4924m = new X1(new C0626w3(c0633x3, this));
        this.f4928q = new B(this);
        C0620v4 c0620v4 = new C0620v4(this);
        c0620v4.w();
        this.f4926o = c0620v4;
        C3 c32 = new C3(this);
        c32.w();
        this.f4927p = c32;
        C0552l5 c0552l5 = new C0552l5(this);
        c0552l5.w();
        this.f4922k = c0552l5;
        C0586q4 c0586q4 = new C0586q4(this);
        c0586q4.p();
        this.f4929r = c0586q4;
        G2 g22 = new G2(this);
        g22.p();
        this.f4921j = g22;
        com.google.android.gms.internal.measurement.H0 h03 = c0633x3.f5605g;
        if (h03 != null && h03.f10391p != 0) {
            z7 = true;
        }
        boolean z8 = !z7;
        if (context.getApplicationContext() instanceof Application) {
            C3 H6 = H();
            if (H6.a().getApplicationContext() instanceof Application) {
                Application application = (Application) H6.a().getApplicationContext();
                if (H6.f4568c == null) {
                    H6.f4568c = new C0544k4(H6);
                }
                if (z8) {
                    application.unregisterActivityLifecycleCallbacks(H6.f4568c);
                    application.registerActivityLifecycleCallbacks(H6.f4568c);
                    L6 = H6.j().K();
                    str = "Registered activity lifecycle callback";
                }
            }
            g22.D(new O2(this, c0633x3));
        }
        L6 = j().L();
        str = "Application context is not an Application";
        L6.a(str);
        g22.D(new O2(this, c0633x3));
    }

    public static N2 c(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l7) {
        Bundle bundle;
        if (h02 != null && (h02.f10394s == null || h02.f10395t == null)) {
            h02 = new com.google.android.gms.internal.measurement.H0(h02.f10390o, h02.f10391p, h02.f10392q, h02.f10393r, null, null, h02.f10396u, null);
        }
        AbstractC0328n.i(context);
        AbstractC0328n.i(context.getApplicationContext());
        if (f4903I == null) {
            synchronized (N2.class) {
                try {
                    if (f4903I == null) {
                        f4903I = new N2(new C0633x3(context, h02, l7));
                    }
                } finally {
                }
            }
        } else if (h02 != null && (bundle = h02.f10396u) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC0328n.i(f4903I);
            f4903I.m(h02.f10396u.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC0328n.i(f4903I);
        return f4903I;
    }

    public static void f(AbstractC0506f1 abstractC0506f1) {
        if (abstractC0506f1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC0506f1.z()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC0506f1.getClass()));
    }

    public static /* synthetic */ void g(N2 n22, C0633x3 c0633x3) {
        n22.e().n();
        C c7 = new C(n22);
        c7.p();
        n22.f4933v = c7;
        S1 s12 = new S1(n22, c0633x3.f5604f);
        s12.w();
        n22.f4934w = s12;
        V1 v12 = new V1(n22);
        v12.w();
        n22.f4931t = v12;
        D4 d42 = new D4(n22);
        d42.w();
        n22.f4932u = d42;
        n22.f4923l.q();
        n22.f4919h.q();
        n22.f4934w.x();
        n22.j().J().b("App measurement initialized, version", 82001L);
        n22.j().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String F6 = s12.F();
        if (TextUtils.isEmpty(n22.f4913b)) {
            if (n22.L().F0(F6)) {
                n22.j().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                n22.j().J().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + F6);
            }
        }
        n22.j().F().a("Debug-level message logging enabled");
        if (n22.f4908E != n22.f4910G.get()) {
            n22.j().G().c("Not all components initialized", Integer.valueOf(n22.f4908E), Integer.valueOf(n22.f4910G.get()));
        }
        n22.f4935x = true;
    }

    public static void h(AbstractC0550l3 abstractC0550l3) {
        if (abstractC0550l3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC0550l3.r()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC0550l3.getClass()));
    }

    public static void i(AbstractC0557m3 abstractC0557m3) {
        if (abstractC0557m3 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public final C A() {
        h(this.f4933v);
        return this.f4933v;
    }

    public final S1 B() {
        f(this.f4934w);
        return this.f4934w;
    }

    public final V1 C() {
        f(this.f4931t);
        return this.f4931t;
    }

    public final X1 D() {
        return this.f4924m;
    }

    public final Y1 E() {
        Y1 y12 = this.f4920i;
        if (y12 == null || !y12.r()) {
            return null;
        }
        return this.f4920i;
    }

    public final C0549l2 F() {
        i(this.f4919h);
        return this.f4919h;
    }

    public final G2 G() {
        return this.f4921j;
    }

    public final C3 H() {
        f(this.f4927p);
        return this.f4927p;
    }

    public final C0620v4 I() {
        f(this.f4926o);
        return this.f4926o;
    }

    public final D4 J() {
        f(this.f4932u);
        return this.f4932u;
    }

    public final C0552l5 K() {
        f(this.f4922k);
        return this.f4922k;
    }

    public final S5 L() {
        i(this.f4923l);
        return this.f4923l;
    }

    public final String M() {
        return this.f4913b;
    }

    public final String N() {
        return this.f4914c;
    }

    public final String O() {
        return this.f4915d;
    }

    public final String P() {
        return this.f4930s;
    }

    public final void Q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void R() {
        this.f4910G.incrementAndGet();
    }

    @Override // R2.InterfaceC0571o3
    public final Context a() {
        return this.f4912a;
    }

    @Override // R2.InterfaceC0571o3
    public final E2.e b() {
        return this.f4925n;
    }

    @Override // R2.InterfaceC0571o3
    public final C0504f d() {
        return this.f4917f;
    }

    @Override // R2.InterfaceC0571o3
    public final G2 e() {
        h(this.f4921j);
        return this.f4921j;
    }

    @Override // R2.InterfaceC0571o3
    public final Y1 j() {
        h(this.f4920i);
        return this.f4920i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d8, code lost:
    
        if (r1.z() != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.google.android.gms.internal.measurement.H0 r10) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.N2.k(com.google.android.gms.internal.measurement.H0):void");
    }

    public final /* synthetic */ void l(String str, int i7, Throwable th, byte[] bArr, Map map) {
        if ((i7 != 200 && i7 != 204 && i7 != 304) || th != null) {
            j().L().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i7), th);
            return;
        }
        F().f5403t.a(true);
        if (bArr == null || bArr.length == 0) {
            j().F().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                j().F().a("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (H6.a() && this.f4918g.s(K.f4817Z0)) {
                if (!L().K0(optString)) {
                    j().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                bundle.putString("gbraid", optString3);
            } else if (!L().K0(optString)) {
                j().L().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f4927p.z0("auto", "_cmp", bundle);
            S5 L6 = L();
            if (TextUtils.isEmpty(optString) || !L6.h0(optString, optDouble)) {
                return;
            }
            L6.a().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e7) {
            j().G().b("Failed to parse the Deferred Deep Link response. exception", e7);
        }
    }

    public final void m(boolean z7) {
        this.f4904A = Boolean.valueOf(z7);
    }

    public final void n() {
        this.f4908E++;
    }

    public final boolean o() {
        return this.f4904A != null && this.f4904A.booleanValue();
    }

    public final boolean p() {
        return x() == 0;
    }

    public final boolean q() {
        e().n();
        return this.f4907D;
    }

    public final boolean r() {
        return TextUtils.isEmpty(this.f4913b);
    }

    public final boolean s() {
        if (!this.f4935x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        e().n();
        Boolean bool = this.f4936y;
        if (bool == null || this.f4937z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f4925n.b() - this.f4937z) > 1000)) {
            this.f4937z = this.f4925n.b();
            boolean z7 = true;
            Boolean valueOf = Boolean.valueOf(L().E0("android.permission.INTERNET") && L().E0("android.permission.ACCESS_NETWORK_STATE") && (G2.d.a(this.f4912a).f() || this.f4918g.S() || (S5.c0(this.f4912a) && S5.d0(this.f4912a, false))));
            this.f4936y = valueOf;
            if (valueOf.booleanValue()) {
                if (!L().j0(B().G(), B().E()) && TextUtils.isEmpty(B().E())) {
                    z7 = false;
                }
                this.f4936y = Boolean.valueOf(z7);
            }
        }
        return this.f4936y.booleanValue();
    }

    public final boolean t() {
        return this.f4916e;
    }

    public final boolean u() {
        e().n();
        h(v());
        String F6 = B().F();
        Pair u7 = F().u(F6);
        if (!this.f4918g.P() || ((Boolean) u7.second).booleanValue() || TextUtils.isEmpty((CharSequence) u7.first)) {
            j().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!v().w()) {
            j().L().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        if (C0979n6.a() && this.f4918g.s(K.f4807U0)) {
            C3 H6 = H();
            H6.n();
            C0560n V6 = H6.t().V();
            Bundle bundle = V6 != null ? V6.f5425o : null;
            if (bundle == null) {
                int i7 = this.f4909F;
                this.f4909F = i7 + 1;
                boolean z7 = i7 < 10;
                j().F().b("Failed to retrieve DMA consent from the service, " + (z7 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f4909F));
                return z7;
            }
            C0585q3 d7 = C0585q3.d(bundle, 100);
            sb.append("&gcs=");
            sb.append(d7.w());
            C0643z b7 = C0643z.b(bundle, 100);
            sb.append("&dma=");
            sb.append(b7.g() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(b7.h())) {
                sb.append("&dma_cps=");
                sb.append(b7.h());
            }
            int i8 = C0643z.d(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i8);
            j().K().b("Consent query parameters to Bow", sb);
        }
        S5 L6 = L();
        B();
        URL J6 = L6.J(82001L, F6, (String) u7.first, F().f5404u.a() - 1, sb.toString());
        if (J6 != null) {
            C0586q4 v7 = v();
            InterfaceC0579p4 interfaceC0579p4 = new InterfaceC0579p4() { // from class: R2.P2
                @Override // R2.InterfaceC0579p4
                public final void a(String str, int i9, Throwable th, byte[] bArr, Map map) {
                    N2.this.l(str, i9, th, bArr, map);
                }
            };
            v7.n();
            v7.o();
            AbstractC0328n.i(J6);
            AbstractC0328n.i(interfaceC0579p4);
            v7.e().z(new RunnableC0599s4(v7, F6, J6, null, null, interfaceC0579p4));
        }
        return false;
    }

    public final C0586q4 v() {
        h(this.f4929r);
        return this.f4929r;
    }

    public final void w(boolean z7) {
        e().n();
        this.f4907D = z7;
    }

    public final int x() {
        e().n();
        if (this.f4918g.R()) {
            return 1;
        }
        Boolean bool = this.f4906C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!q()) {
            return 8;
        }
        Boolean M6 = F().M();
        if (M6 != null) {
            return M6.booleanValue() ? 0 : 3;
        }
        Boolean F6 = this.f4918g.F("firebase_analytics_collection_enabled");
        if (F6 != null) {
            return F6.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f4905B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f4904A == null || this.f4904A.booleanValue()) ? 0 : 7;
    }

    public final B y() {
        B b7 = this.f4928q;
        if (b7 != null) {
            return b7;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C0511g z() {
        return this.f4918g;
    }
}
