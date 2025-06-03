// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import java.net.URL;
import android.util.Pair;
import org.json.JSONException;
import android.content.Intent;
import com.google.android.gms.internal.measurement.H6;
import org.json.JSONObject;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.gms.internal.measurement.t6;
import G2.d;
import com.google.android.gms.internal.measurement.n6;
import android.content.BroadcastReceiver;
import x.a;
import android.content.IntentFilter;
import com.google.android.gms.internal.measurement.g7;
import android.text.TextUtils;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.H0;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import E2.h;
import com.google.android.gms.internal.measurement.S2;
import A2.n;
import E2.e;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

public class N2 implements o3
{
    public static volatile N2 I;
    public volatile Boolean A;
    public Boolean B;
    public Boolean C;
    public volatile boolean D;
    public int E;
    public int F;
    public AtomicInteger G;
    public final long H;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final f f;
    public final g g;
    public final l2 h;
    public final Y1 i;
    public final G2 j;
    public final l5 k;
    public final S5 l;
    public final X1 m;
    public final e n;
    public final v4 o;
    public final C3 p;
    public final B q;
    public final q4 r;
    public final String s;
    public V1 t;
    public D4 u;
    public C v;
    public S1 w;
    public boolean x;
    public Boolean y;
    public long z;
    
    public N2(final x3 x3) {
        final boolean b = false;
        this.x = false;
        this.G = new AtomicInteger(0);
        A2.n.i(x3);
        final f f = new f(x3.a);
        this.f = f;
        M1.a = f;
        final Context a = x3.a;
        this.a = a;
        this.b = x3.b;
        this.c = x3.c;
        this.d = x3.d;
        this.e = x3.h;
        this.A = x3.e;
        this.s = x3.j;
        this.D = true;
        final H0 g = x3.g;
        if (g != null) {
            final Bundle u = g.u;
            if (u != null) {
                final Object value = ((BaseBundle)u).get("measurementEnabled");
                if (value instanceof Boolean) {
                    this.B = (Boolean)value;
                }
                final Object value2 = ((BaseBundle)g.u).get("measurementDeactivated");
                if (value2 instanceof Boolean) {
                    this.C = (Boolean)value2;
                }
            }
        }
        S2.l(a);
        final e d = E2.h.d();
        this.n = d;
        final Long i = x3.i;
        long h;
        if (i != null) {
            h = i;
        }
        else {
            h = d.a();
        }
        this.H = h;
        this.g = new g(this);
        final l2 h2 = new l2(this);
        h2.p();
        this.h = h2;
        final Y1 j = new Y1(this);
        j.p();
        this.i = j;
        final S5 l = new S5(this);
        l.p();
        this.l = l;
        this.m = new X1(new w3(x3, this));
        this.q = new B(this);
        final v4 o = new v4(this);
        o.w();
        this.o = o;
        final C3 p = new C3(this);
        p.w();
        this.p = p;
        final l5 k = new l5(this);
        k.w();
        this.k = k;
        final q4 r = new q4(this);
        r.p();
        this.r = r;
        final G2 m = new G2(this);
        m.p();
        this.j = m;
        final H0 g2 = x3.g;
        boolean b2 = b;
        if (g2 != null) {
            b2 = b;
            if (g2.p != 0L) {
                b2 = true;
            }
        }
        Label_0617: {
            a2 a2;
            String s;
            if (a.getApplicationContext() instanceof Application) {
                final C3 h3 = this.H();
                if (!(h3.a().getApplicationContext() instanceof Application)) {
                    break Label_0617;
                }
                final Application application = (Application)h3.a().getApplicationContext();
                if (h3.c == null) {
                    h3.c = new k4(h3);
                }
                if (!(b2 ^ true)) {
                    break Label_0617;
                }
                application.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)h3.c);
                application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)h3.c);
                a2 = h3.j().K();
                s = "Registered activity lifecycle callback";
            }
            else {
                a2 = this.j().L();
                s = "Application context is not an Application";
            }
            a2.a(s);
        }
        m.D(new O2(this, x3));
    }
    
    public static N2 c(final Context context, final H0 h0, final Long n) {
        H0 h2 = h0;
        Label_0053: {
            if (h0 != null) {
                if (h0.s != null) {
                    h2 = h0;
                    if (h0.t != null) {
                        break Label_0053;
                    }
                }
                h2 = new H0(h0.o, h0.p, h0.q, h0.r, null, null, h0.u, null);
            }
        }
        n.i(context);
        n.i(context.getApplicationContext());
        while (true) {
            if (N2.I == null) {
                // monitorenter(N2.class)
                Bundle u;
                Block_9_Outer:Block_7_Outer:
                while (true) {
                    try {
                        if (N2.I == null) {
                            N2.I = new N2(new x3(context, h2, n));
                        }
                        // monitorexit(N2.class)
                        // monitorexit(N2.class)
                        // iftrue(Label_0161:, u == null || !u.containsKey("dataCollectionDefaultEnabled"))
                        while (true) {
                            while (true) {
                                while (true) {
                                    n.i(N2.I);
                                    return N2.I;
                                    n.i(N2.I);
                                    N2.I.m(((BaseBundle)h2.u).getBoolean("dataCollectionDefaultEnabled"));
                                    continue Block_9_Outer;
                                }
                                u = h2.u;
                                continue Block_7_Outer;
                            }
                            continue;
                        }
                    }
                    // iftrue(Label_0161:, h2 == null)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public static void f(final f1 f1) {
        if (f1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (f1.z()) {
            return;
        }
        final String value = String.valueOf(f1.getClass());
        final StringBuilder sb = new StringBuilder("Component not initialized: ");
        sb.append(value);
        throw new IllegalStateException(sb.toString());
    }
    
    public static void h(final l3 l3) {
        if (l3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (l3.r()) {
            return;
        }
        final String value = String.valueOf(l3.getClass());
        final StringBuilder sb = new StringBuilder("Component not initialized: ");
        sb.append(value);
        throw new IllegalStateException(sb.toString());
    }
    
    public static void i(final m3 m3) {
        if (m3 != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }
    
    public final C A() {
        h(this.v);
        return this.v;
    }
    
    public final S1 B() {
        f(this.w);
        return this.w;
    }
    
    public final V1 C() {
        f(this.t);
        return this.t;
    }
    
    public final X1 D() {
        return this.m;
    }
    
    public final Y1 E() {
        final Y1 i = this.i;
        if (i != null && i.r()) {
            return this.i;
        }
        return null;
    }
    
    public final l2 F() {
        i(this.h);
        return this.h;
    }
    
    public final G2 G() {
        return this.j;
    }
    
    public final C3 H() {
        f(this.p);
        return this.p;
    }
    
    public final v4 I() {
        f(this.o);
        return this.o;
    }
    
    public final D4 J() {
        f(this.u);
        return this.u;
    }
    
    public final l5 K() {
        f(this.k);
        return this.k;
    }
    
    public final S5 L() {
        i(this.l);
        return this.l;
    }
    
    public final String M() {
        return this.b;
    }
    
    public final String N() {
        return this.c;
    }
    
    public final String O() {
        return this.d;
    }
    
    public final String P() {
        return this.s;
    }
    
    public final void Q() {
        throw new IllegalStateException("Unexpected call on client side");
    }
    
    public final void R() {
        this.G.incrementAndGet();
    }
    
    @Override
    public final Context a() {
        return this.a;
    }
    
    @Override
    public final e b() {
        return this.n;
    }
    
    @Override
    public final f d() {
        return this.f;
    }
    
    @Override
    public final G2 e() {
        h(this.j);
        return this.j;
    }
    
    @Override
    public final Y1 j() {
        h(this.i);
        return this.i;
    }
    
    public final void k(final H0 h0) {
        this.e().n();
        if (g7.a() && this.g.s(K.M0) && this.L().V0()) {
            final S5 l = this.L();
            l.n();
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            x.a.h(l.a(), new X5(l.a), intentFilter, 2);
            l.j().F().a("Registered app receiver");
        }
        q3 j = this.F().J();
        final int b = j.b();
        final Boolean f = this.g.F("google_analytics_default_allow_ad_storage");
        final Boolean f2 = this.g.F("google_analytics_default_allow_analytics_storage");
        q3 d = null;
        Label_0318: {
            if ((f != null || f2 != null) && this.F().x(-10)) {
                d = new q3(f, f2, -10);
            }
            else {
                if (!TextUtils.isEmpty((CharSequence)this.B().G()) && (b == 0 || b == 30 || b == 10 || b == 30 || b == 30 || b == 40)) {
                    this.H().H(new q3(null, null, -10), this.H);
                }
                else if (TextUtils.isEmpty((CharSequence)this.B().G()) && h0 != null && h0.u != null && this.F().x(30)) {
                    d = q3.d(h0.u, 30);
                    if (d.z()) {
                        break Label_0318;
                    }
                }
                d = null;
            }
        }
        if (d != null) {
            this.H().H(d, this.H);
            j = d;
        }
        this.H().G(j);
        Label_0607: {
            if (n6.a() && this.g.s(K.S0)) {
                final int a = this.F().I().a();
                final Boolean f3 = this.g.F("google_analytics_default_allow_ad_user_data");
                C3 c3;
                z z;
                if (f3 != null && q3.k(-10, a)) {
                    c3 = this.H();
                    z = new z(f3, -10);
                }
                else if (!TextUtils.isEmpty((CharSequence)this.B().G()) && (a == 0 || a == 30)) {
                    c3 = this.H();
                    z = new z((Boolean)null, -10);
                }
                else {
                    if (TextUtils.isEmpty((CharSequence)this.B().G()) && h0 != null && h0.u != null && q3.k(30, a)) {
                        final z b2 = R2.z.b(h0.u, 30);
                        if (b2.j()) {
                            this.H().F(b2);
                        }
                    }
                    if (!TextUtils.isEmpty((CharSequence)this.B().G()) || h0 == null || h0.u == null || this.F().m.a() != null) {
                        break Label_0607;
                    }
                    final Boolean d2 = R2.z.d(h0.u);
                    if (d2 != null) {
                        this.H().b0(h0.s, "allow_personalized_ads", d2.toString(), false);
                    }
                    break Label_0607;
                }
                c3.F(z);
            }
        }
        if (this.F().e.a() == 0L) {
            this.j().K().b("Persisting first open", this.H);
            this.F().e.b(this.H);
        }
        this.H().n.c();
        if (!this.s()) {
            if (this.p()) {
                if (!this.L().E0("android.permission.INTERNET")) {
                    this.j().G().a("App is missing INTERNET permission");
                }
                if (!this.L().E0("android.permission.ACCESS_NETWORK_STATE")) {
                    this.j().G().a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!G2.d.a(this.a).f() && !this.g.S()) {
                    if (!S5.c0(this.a)) {
                        this.j().G().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!S5.d0(this.a, false)) {
                        this.j().G().a("AppMeasurementService not registered/enabled");
                    }
                }
                this.j().G().a("Uploading is not possible. App measurement disabled");
            }
        }
        else {
            if (!TextUtils.isEmpty((CharSequence)this.B().G()) || !TextUtils.isEmpty((CharSequence)this.B().E())) {
                this.L();
                if (S5.l0(this.B().G(), this.F().P(), this.B().E(), this.F().O())) {
                    this.j().J().a("Rechecking which service to use due to a GMP App Id change");
                    this.F().Q();
                    this.C().H();
                    this.u.Z();
                    this.u.Y();
                    this.F().e.b(this.H);
                    this.F().g.b(null);
                }
                this.F().G(this.B().G());
                this.F().D(this.B().E());
            }
            if (!this.F().J().l(q3.a.q)) {
                this.F().g.b(null);
            }
            this.H().T(this.F().g.a());
            if (t6.a() && this.g.s(K.p0) && !this.L().W0() && !TextUtils.isEmpty((CharSequence)this.F().v.a())) {
                this.j().L().a("Remote config removed with active feature rollouts");
                this.F().v.b(null);
            }
            if (!TextUtils.isEmpty((CharSequence)this.B().G()) || !TextUtils.isEmpty((CharSequence)this.B().E())) {
                final boolean p = this.p();
                if (!this.F().B() && !this.g.R()) {
                    this.F().E(p ^ true);
                }
                if (p) {
                    this.H().n0();
                }
                this.K().e.a();
                this.J().Q(new AtomicReference());
                this.J().K(this.F().y.a());
            }
        }
        if (g7.a() && this.g.s(K.M0) && this.L().V0()) {
            final C3 h2 = this.H();
            h2.getClass();
            new Thread(new M2(h2)).start();
        }
        this.F().o.a(true);
    }
    
    public final void m(final boolean b) {
        this.A = b;
    }
    
    public final void n() {
        ++this.E;
    }
    
    public final boolean o() {
        return this.A != null && this.A;
    }
    
    public final boolean p() {
        return this.x() == 0;
    }
    
    public final boolean q() {
        this.e().n();
        return this.D;
    }
    
    public final boolean r() {
        return TextUtils.isEmpty((CharSequence)this.b);
    }
    
    public final boolean s() {
        if (this.x) {
            this.e().n();
            final Boolean y = this.y;
            if (y == null || this.z == 0L || (y != null && !y && Math.abs(this.n.b() - this.z) > 1000L)) {
                this.z = this.n.b();
                final boolean e0 = this.L().E0("android.permission.INTERNET");
                final boolean b = true;
                final Boolean value = e0 && this.L().E0("android.permission.ACCESS_NETWORK_STATE") && (G2.d.a(this.a).f() || this.g.S() || (S5.c0(this.a) && S5.d0(this.a, false)));
                this.y = value;
                if (value) {
                    boolean b2 = b;
                    if (!this.L().j0(this.B().G(), this.B().E())) {
                        b2 = (!TextUtils.isEmpty((CharSequence)this.B().E()) && b);
                    }
                    this.y = b2;
                }
            }
            return this.y;
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }
    
    public final boolean t() {
        return this.e;
    }
    
    public final boolean u() {
        this.e().n();
        h(this.v());
        final String f = this.B().F();
        final Pair u = this.F().u(f);
        final boolean p = this.g.P();
        boolean b = false;
        if (!p || (boolean)u.second || TextUtils.isEmpty((CharSequence)u.first)) {
            this.j().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!this.v().w()) {
            this.j().L().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        if (n6.a() && this.g.s(K.U0)) {
            final C3 h = this.H();
            h.n();
            final R2.n v = h.t().V();
            Bundle o;
            if (v != null) {
                o = v.o;
            }
            else {
                o = null;
            }
            final boolean b2 = true;
            if (o == null) {
                if (this.F++ < 10) {
                    b = true;
                }
                final a2 f2 = this.j().F();
                String str;
                if (b) {
                    str = "Retrying.";
                }
                else {
                    str = "Skipping.";
                }
                final StringBuilder sb2 = new StringBuilder("Failed to retrieve DMA consent from the service, ");
                sb2.append(str);
                sb2.append(" retryCount");
                f2.b(sb2.toString(), this.F);
                return b;
            }
            final q3 d = q3.d(o, 100);
            sb.append("&gcs=");
            sb.append(d.w());
            final z b3 = R2.z.b(o, 100);
            sb.append("&dma=");
            int i;
            if (b3.g() == Boolean.FALSE) {
                i = 0;
            }
            else {
                i = 1;
            }
            sb.append(i);
            if (!TextUtils.isEmpty((CharSequence)b3.h())) {
                sb.append("&dma_cps=");
                sb.append(b3.h());
            }
            int j = b2 ? 1 : 0;
            if (R2.z.d(o) == Boolean.TRUE) {
                j = 0;
            }
            sb.append("&npa=");
            sb.append(j);
            this.j().K().b("Consent query parameters to Bow", sb);
        }
        final S5 l = this.L();
        this.B();
        final URL k = l.J(82001L, f, (String)u.first, this.F().u.a() - 1L, sb.toString());
        if (k != null) {
            final q4 v2 = this.v();
            final P2 p2 = new P2(this);
            v2.n();
            v2.o();
            A2.n.i(k);
            A2.n.i(p2);
            v2.e().z(new s4(v2, f, k, null, null, p2));
        }
        return false;
    }
    
    public final q4 v() {
        h(this.r);
        return this.r;
    }
    
    public final void w(final boolean d) {
        this.e().n();
        this.D = d;
    }
    
    public final int x() {
        this.e().n();
        if (this.g.R()) {
            return 1;
        }
        final Boolean c = this.C;
        if (c != null && c) {
            return 2;
        }
        if (!this.q()) {
            return 8;
        }
        final Boolean m = this.F().M();
        if (m != null) {
            if (m) {
                return 0;
            }
            return 3;
        }
        else {
            final Boolean f = this.g.F("firebase_analytics_collection_enabled");
            if (f != null) {
                if (f) {
                    return 0;
                }
                return 4;
            }
            else {
                final Boolean b = this.B;
                if (b != null) {
                    if (b) {
                        return 0;
                    }
                    return 5;
                }
                else {
                    if (this.A == null) {
                        return 0;
                    }
                    if (this.A) {
                        return 0;
                    }
                    return 7;
                }
            }
        }
    }
    
    public final B y() {
        final B q = this.q;
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("Component not created");
    }
    
    public final g z() {
        return this.g;
    }
}
