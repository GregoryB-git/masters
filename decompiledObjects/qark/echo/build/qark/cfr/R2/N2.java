/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.URL
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicInteger
 *  java.util.concurrent.atomic.AtomicReference
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package R2;

import E2.e;
import E2.h;
import G2.d;
import R2.B;
import R2.C;
import R2.C3;
import R2.D4;
import R2.G2;
import R2.K;
import R2.M1;
import R2.M2;
import R2.O2;
import R2.P1;
import R2.P2;
import R2.S1;
import R2.S5;
import R2.V1;
import R2.W1;
import R2.X1;
import R2.X5;
import R2.Y1;
import R2.a2;
import R2.c6;
import R2.f;
import R2.f1;
import R2.g;
import R2.k4;
import R2.l2;
import R2.l3;
import R2.l5;
import R2.m3;
import R2.n;
import R2.n2;
import R2.o2;
import R2.o3;
import R2.p4;
import R2.q2;
import R2.q3;
import R2.q4;
import R2.r2;
import R2.s4;
import R2.t5;
import R2.v4;
import R2.w3;
import R2.x3;
import R2.z;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.t6;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import x.a;

public class N2
implements o3 {
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

    public N2(x3 x32) {
        Object object;
        block7 : {
            Object object2;
            Object object3;
            block8 : {
                block6 : {
                    boolean bl = false;
                    this.x = false;
                    this.G = new AtomicInteger(0);
                    A2.n.i(x32);
                    object3 = new f(x32.a);
                    this.f = object3;
                    M1.a = object3;
                    this.a = object3 = x32.a;
                    this.b = x32.b;
                    this.c = x32.c;
                    this.d = x32.d;
                    this.e = x32.h;
                    this.A = x32.e;
                    this.s = x32.j;
                    this.D = true;
                    object2 = x32.g;
                    if (object2 != null && (object = object2.u) != null) {
                        if ((object = object.get("measurementEnabled")) instanceof Boolean) {
                            this.B = (Boolean)object;
                        }
                        if ((object2 = object2.u.get("measurementDeactivated")) instanceof Boolean) {
                            this.C = (Boolean)object2;
                        }
                    }
                    S2.l((Context)object3);
                    this.n = object2 = h.d();
                    object = x32.i;
                    long l8 = object != null ? object.longValue() : object2.a();
                    this.H = l8;
                    this.g = new g(this);
                    object2 = new l2(this);
                    object2.p();
                    this.h = object2;
                    object2 = new Y1(this);
                    object2.p();
                    this.i = object2;
                    object2 = new S5(this);
                    object2.p();
                    this.l = object2;
                    this.m = new X1(new w3(x32, this));
                    this.q = new B(this);
                    object2 = new v4(this);
                    object2.w();
                    this.o = object2;
                    object2 = new C3(this);
                    object2.w();
                    this.p = object2;
                    object2 = new l5(this);
                    object2.w();
                    this.k = object2;
                    object2 = new q4(this);
                    object2.p();
                    this.r = object2;
                    object = new G2(this);
                    object.p();
                    this.j = object;
                    object2 = x32.g;
                    boolean bl2 = bl;
                    if (object2 != null) {
                        bl2 = bl;
                        if (object2.p != 0L) {
                            bl2 = true;
                        }
                    }
                    if (!(object3.getApplicationContext() instanceof Application)) break block6;
                    object3 = this.H();
                    if (!(object3.a().getApplicationContext() instanceof Application)) break block7;
                    object2 = (Application)object3.a().getApplicationContext();
                    if (object3.c == null) {
                        object3.c = new k4((C3)object3);
                    }
                    if (!(bl2 ^ true)) break block7;
                    object2.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object3.c);
                    object2.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object3.c);
                    object3 = object3.j().K();
                    object2 = "Registered activity lifecycle callback";
                    break block8;
                }
                object3 = this.j().L();
                object2 = "Application context is not an Application";
            }
            object3.a((String)object2);
        }
        object.D(new O2(this, x32));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static N2 c(Context context, H0 h02, Long l8) {
        H0 h03;
        block10 : {
            block11 : {
                h03 = h02;
                if (h02 == null) break block10;
                if (h02.s == null) break block11;
                h03 = h02;
                if (h02.t != null) break block10;
            }
            h03 = new H0(h02.o, h02.p, h02.q, h02.r, null, null, h02.u, null);
        }
        A2.n.i((Object)context);
        A2.n.i((Object)context.getApplicationContext());
        if (I == null) {
            // MONITORENTER : R2.N2.class
            if (I == null) {
                I = new N2(new x3(context, h03, l8));
            }
            // MONITOREXIT : R2.N2.class
        } else if (h03 != null && (context = h03.u) != null && context.containsKey("dataCollectionDefaultEnabled")) {
            A2.n.i(I);
            I.m(h03.u.getBoolean("dataCollectionDefaultEnabled"));
        }
        A2.n.i(I);
        return I;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    public static void f(f1 object) {
        if (object != null) {
            if (object.z()) {
                return;
            }
            object = String.valueOf((Object)object.getClass());
            StringBuilder stringBuilder = new StringBuilder("Component not initialized: ");
            stringBuilder.append((String)object);
            throw new IllegalStateException(stringBuilder.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    public static /* synthetic */ void g(N2 n22, x3 object) {
        n22.e().n();
        Object object2 = new C(n22);
        object2.p();
        n22.v = object2;
        object = new S1(n22, object.f);
        object.w();
        n22.w = object;
        object2 = new V1(n22);
        object2.w();
        n22.t = object2;
        object2 = new D4(n22);
        object2.w();
        n22.u = object2;
        n22.l.q();
        n22.h.q();
        n22.w.x();
        n22.j().J().b("App measurement initialized, version", 82001L);
        n22.j().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        object = object.F();
        if (TextUtils.isEmpty((CharSequence)n22.b)) {
            if (n22.L().F0((String)object)) {
                n22.j().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                object2 = n22.j().J();
                StringBuilder stringBuilder = new StringBuilder("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                stringBuilder.append((String)object);
                object2.a(stringBuilder.toString());
            }
        }
        n22.j().F().a("Debug-level message logging enabled");
        if (n22.E != n22.G.get()) {
            n22.j().G().c("Not all components initialized", n22.E, n22.G.get());
        }
        n22.x = true;
    }

    public static void h(l3 object) {
        if (object != null) {
            if (object.r()) {
                return;
            }
            object = String.valueOf((Object)object.getClass());
            StringBuilder stringBuilder = new StringBuilder("Component not initialized: ");
            stringBuilder.append((String)object);
            throw new IllegalStateException(stringBuilder.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    public static void i(m3 m32) {
        if (m32 != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C A() {
        N2.h(this.v);
        return this.v;
    }

    public final S1 B() {
        N2.f(this.w);
        return this.w;
    }

    public final V1 C() {
        N2.f(this.t);
        return this.t;
    }

    public final X1 D() {
        return this.m;
    }

    public final Y1 E() {
        Y1 y12 = this.i;
        if (y12 != null && y12.r()) {
            return this.i;
        }
        return null;
    }

    public final l2 F() {
        N2.i(this.h);
        return this.h;
    }

    public final G2 G() {
        return this.j;
    }

    public final C3 H() {
        N2.f(this.p);
        return this.p;
    }

    public final v4 I() {
        N2.f(this.o);
        return this.o;
    }

    public final D4 J() {
        N2.f(this.u);
        return this.u;
    }

    public final l5 K() {
        N2.f(this.k);
        return this.k;
    }

    public final S5 L() {
        N2.i(this.l);
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
        N2.h(this.j);
        return this.j;
    }

    @Override
    public final Y1 j() {
        N2.h(this.i);
        return this.i;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void k(H0 var1_1) {
        block31 : {
            block32 : {
                block28 : {
                    block30 : {
                        block29 : {
                            block27 : {
                                this.e().n();
                                if (g7.a() && this.g.s(K.M0) && this.L().V0()) {
                                    var4_2 = this.L();
                                    var4_2.n();
                                    var5_3 = new IntentFilter();
                                    var5_3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    var6_4 = new X5(var4_2.a);
                                    a.h(var4_2.a(), (BroadcastReceiver)var6_4, (IntentFilter)var5_3, 2);
                                    var4_2.j().F().a("Registered app receiver");
                                }
                                var5_3 = this.F().J();
                                var2_5 = var5_3.b();
                                var4_2 = this.g.F("google_analytics_default_allow_ad_storage");
                                var6_4 = this.g.F("google_analytics_default_allow_analytics_storage");
                                if (var4_2 == null && var6_4 == null || !this.F().x(-10)) break block27;
                                var4_2 = new q3((Boolean)var4_2, (Boolean)var6_4, -10);
                                break block28;
                            }
                            if (TextUtils.isEmpty((CharSequence)this.B().G()) || var2_5 != 0 && var2_5 != 30 && var2_5 != 10 && var2_5 != 30 && var2_5 != 30 && var2_5 != 40) break block29;
                            this.H().H(new q3(null, null, -10), this.H);
                            break block30;
                        }
                        if (TextUtils.isEmpty((CharSequence)this.B().G()) && var1_1 != null && var1_1.u != null && this.F().x(30) && (var4_2 = q3.d(var1_1.u, 30)).z()) break block28;
                    }
                    var4_2 = null;
                }
                if (var4_2 != null) {
                    this.H().H((q3)var4_2, this.H);
                    var5_3 = var4_2;
                }
                this.H().G((q3)var5_3);
                if (!n6.a() || !this.g.s(K.S0)) break block31;
                var2_5 = this.F().I().a();
                var5_3 = this.g.F("google_analytics_default_allow_ad_user_data");
                if (var5_3 == null || !q3.k(-10, var2_5)) break block32;
                var4_2 = this.H();
                var1_1 = new z((Boolean)var5_3, -10);
                ** GOTO lbl41
            }
            if (!(TextUtils.isEmpty((CharSequence)this.B().G()) || var2_5 != 0 && var2_5 != 30)) {
                var4_2 = this.H();
                var1_1 = new z(null, -10);
lbl41: // 2 sources:
                var4_2.F((z)var1_1);
            } else {
                if (TextUtils.isEmpty((CharSequence)this.B().G()) && var1_1 != null && var1_1.u != null && q3.k(30, var2_5) && (var4_2 = z.b(var1_1.u, 30)).j()) {
                    this.H().F((z)var4_2);
                }
                if (TextUtils.isEmpty((CharSequence)this.B().G()) && var1_1 != null && var1_1.u != null && this.F().m.a() == null && (var4_2 = z.d(var1_1.u)) != null) {
                    this.H().b0(var1_1.s, "allow_personalized_ads", var4_2.toString(), false);
                }
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
                if (!d.a(this.a).f() && !this.g.S()) {
                    if (!S5.c0(this.a)) {
                        this.j().G().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!S5.d0(this.a, false)) {
                        this.j().G().a("AppMeasurementService not registered/enabled");
                    }
                }
                this.j().G().a("Uploading is not possible. App measurement disabled");
            }
        } else {
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
                var3_6 = this.p();
                if (!this.F().B() && !this.g.R()) {
                    this.F().E(var3_6 ^ true);
                }
                if (var3_6) {
                    this.H().n0();
                }
                this.K().e.a();
                this.J().Q(new AtomicReference());
                this.J().K(this.F().y.a());
            }
        }
        if (g7.a() && this.g.s(K.M0) && this.L().V0()) {
            var1_1 = this.H();
            var1_1.getClass();
            new Thread((Runnable)new M2((C3)var1_1)).start();
        }
        this.F().o.a(true);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void l(String string2, int n8, Throwable object, byte[] object2, Map map) {
        if ((n8 == 200 || n8 == 204 || n8 == 304) && object == null) {
            this.F().t.a(true);
            if (object2 != null && object2.length != 0) {
                string2 = new String((byte[])object2);
                map = new JSONObject(string2);
                string2 = map.optString("deeplink", "");
                object = map.optString("gclid", "");
                object2 = map.optString("gbraid", "");
                double d8 = map.optDouble("timestamp", 0.0);
                if (TextUtils.isEmpty((CharSequence)string2)) {
                    this.j().F().a("Deferred Deep Link is empty.");
                    return;
                }
                map = new Bundle();
                if (H6.a() && this.g.s(K.Z0)) {
                    if (!this.L().K0(string2)) {
                        this.j().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", object, object2, string2);
                        return;
                    }
                    map.putString("gbraid", (String)object2);
                } else if (!this.L().K0(string2)) {
                    this.j().L().c("Deferred Deep Link validation failed. gclid, deep link", object, string2);
                    return;
                }
                map.putString("gclid", (String)object);
                map.putString("_cis", "ddp");
                this.p.z0("auto", "_cmp", (Bundle)map);
                object = this.L();
                if (TextUtils.isEmpty((CharSequence)string2)) return;
                if (!object.h0(string2, d8)) return;
                string2 = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                object.a().sendBroadcast((Intent)string2);
                return;
            }
            this.j().F().a("Deferred Deep Link response empty.");
            return;
        }
        this.j().L().c("Network Request for Deferred Deep Link failed. response, exception", n8, object);
        return;
        catch (JSONException jSONException) {}
        this.j().G().b("Failed to parse the Deferred Deep Link response. exception", (Object)jSONException);
    }

    public final void m(boolean bl) {
        this.A = bl;
    }

    public final void n() {
        ++this.E;
    }

    public final boolean o() {
        if (this.A != null && this.A.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this.x() == 0) {
            return true;
        }
        return false;
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
            Boolean bl = this.y;
            if (bl == null || this.z == 0L || bl != null && !bl.booleanValue() && Math.abs((long)(this.n.b() - this.z)) > 1000L) {
                this.z = this.n.b();
                boolean bl2 = this.L().E0("android.permission.INTERNET");
                boolean bl3 = true;
                bl2 = bl2 && this.L().E0("android.permission.ACCESS_NETWORK_STATE") && (d.a(this.a).f() || this.g.S() || S5.c0(this.a) && S5.d0(this.a, false));
                this.y = bl = Boolean.valueOf((boolean)bl2);
                if (bl.booleanValue()) {
                    bl2 = bl3;
                    if (!this.L().j0(this.B().G(), this.B().E())) {
                        bl2 = !TextUtils.isEmpty((CharSequence)this.B().E()) ? bl3 : false;
                    }
                    this.y = bl2;
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
        N2.h(this.v());
        Object object = this.B().F();
        Object object2 = this.F().u((String)object);
        boolean bl = this.g.P();
        boolean bl2 = false;
        if (bl && !((Boolean)object2.second).booleanValue() && !TextUtils.isEmpty((CharSequence)((CharSequence)object2.first))) {
            Object object3;
            if (!this.v().w()) {
                this.j().L().a("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            Object object4 = new StringBuilder();
            if (n6.a() && this.g.s(K.U0)) {
                object3 = this.H();
                object3.n();
                object3 = object3.t().V();
                object3 = object3 != null ? object3.o : null;
                int n8 = 1;
                if (object3 == null) {
                    int n9 = this.F;
                    this.F = n9 + 1;
                    if (n9 < 10) {
                        bl2 = true;
                    }
                    object = this.j().F();
                    object3 = bl2 ? "Retrying." : "Skipping.";
                    object2 = new StringBuilder("Failed to retrieve DMA consent from the service, ");
                    object2.append((String)object3);
                    object2.append(" retryCount");
                    object.b(object2.toString(), this.F);
                    return bl2;
                }
                Object object5 = q3.d((Bundle)object3, 100);
                object4.append("&gcs=");
                object4.append(object5.w());
                object5 = z.b((Bundle)object3, 100);
                object4.append("&dma=");
                int n10 = object5.g() == Boolean.FALSE ? 0 : 1;
                object4.append(n10);
                if (!TextUtils.isEmpty((CharSequence)object5.h())) {
                    object4.append("&dma_cps=");
                    object4.append(object5.h());
                }
                n10 = n8;
                if (z.d((Bundle)object3) == Boolean.TRUE) {
                    n10 = 0;
                }
                object4.append("&npa=");
                object4.append(n10);
                this.j().K().b("Consent query parameters to Bow", object4);
            }
            object3 = this.L();
            this.B();
            object3 = object3.J(82001L, (String)object, (String)object2.first, this.F().u.a() - 1L, object4.toString());
            if (object3 != null) {
                object2 = this.v();
                object4 = new P2(this);
                object2.n();
                object2.o();
                A2.n.i(object3);
                A2.n.i(object4);
                object2.e().z(new s4((q4)object2, (String)object, (URL)object3, null, null, (p4)object4));
            }
            return false;
        }
        this.j().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    public final q4 v() {
        N2.h(this.r);
        return this.r;
    }

    public final void w(boolean bl) {
        this.e().n();
        this.D = bl;
    }

    public final int x() {
        this.e().n();
        if (this.g.R()) {
            return 1;
        }
        Boolean bl = this.C;
        if (bl != null && bl.booleanValue()) {
            return 2;
        }
        if (!this.q()) {
            return 8;
        }
        bl = this.F().M();
        if (bl != null) {
            if (bl.booleanValue()) {
                return 0;
            }
            return 3;
        }
        bl = this.g.F("firebase_analytics_collection_enabled");
        if (bl != null) {
            if (bl.booleanValue()) {
                return 0;
            }
            return 4;
        }
        bl = this.B;
        if (bl != null) {
            if (bl.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.A != null) {
            if (this.A.booleanValue()) {
                return 0;
            }
            return 7;
        }
        return 0;
    }

    public final B y() {
        B b8 = this.q;
        if (b8 != null) {
            return b8;
        }
        throw new IllegalStateException("Component not created");
    }

    public final g z() {
        return this.g;
    }
}

