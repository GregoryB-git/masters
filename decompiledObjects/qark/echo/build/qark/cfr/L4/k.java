/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.text.DecimalFormat
 *  java.util.Collections
 *  java.util.Locale
 *  java.util.Map
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package L4;

import B4.a;
import L4.b;
import L4.c;
import L4.d;
import L4.e;
import L4.f;
import L4.g;
import L4.h;
import L4.i;
import L4.j;
import N4.a;
import N4.c;
import N4.i;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.r;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.m;

public class k
implements a.b {
    public static final F4.a F = F4.a.e();
    public static final k G = new k();
    public B4.a A;
    public c.b B;
    public String C;
    public String D;
    public boolean E = false;
    public final Map o;
    public final ConcurrentLinkedQueue p = new ConcurrentLinkedQueue();
    public final AtomicBoolean q = new AtomicBoolean(false);
    public s3.e r;
    public A4.e s;
    public s4.i t;
    public r4.b u;
    public b v;
    public ExecutorService w = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue());
    public Context x;
    public C4.a y;
    public d z;

    public k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.o = concurrentHashMap;
        Integer n8 = 50;
        concurrentHashMap.put((Object)"KEY_AVAILABLE_TRACES_FOR_CACHING", (Object)n8);
        concurrentHashMap.put((Object)"KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", (Object)n8);
        concurrentHashMap.put((Object)"KEY_AVAILABLE_GAUGES_FOR_CACHING", (Object)n8);
    }

    public static /* synthetic */ void a(k k8) {
        k8.F();
    }

    public static /* synthetic */ void c(k k8, c c8) {
        k8.w(c8);
    }

    public static /* synthetic */ void d(k k8, N4.m m8, N4.d d8) {
        k8.x(m8, d8);
    }

    public static /* synthetic */ void e(k k8, N4.h h8, N4.d d8) {
        k8.y(h8, d8);
    }

    public static /* synthetic */ void f(k k8) {
        k8.A();
    }

    public static /* synthetic */ void g(k k8, N4.g g8, N4.d d8) {
        k8.z(g8, d8);
    }

    public static k l() {
        return G;
    }

    public static String m(N4.g g8) {
        return String.format((Locale)Locale.ENGLISH, (String)"gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", (Object[])new Object[]{g8.g0(), g8.d0(), g8.c0()});
    }

    public static String n(N4.h h8) {
        long l8 = h8.E0() ? h8.v0() : 0L;
        String string2 = h8.A0() ? String.valueOf((int)h8.o0()) : "UNKNOWN";
        return String.format((Locale)Locale.ENGLISH, (String)"network request trace: %s (responseCode: %s, responseTime: %sms)", (Object[])new Object[]{h8.x0(), string2, new DecimalFormat("#.####").format((double)l8 / 1000.0)});
    }

    public static String o(N4.j j8) {
        if (j8.l()) {
            return k.p(j8.n());
        }
        if (j8.o()) {
            return k.n(j8.p());
        }
        if (j8.f()) {
            return k.m(j8.g());
        }
        return "log";
    }

    public static String p(N4.m m8) {
        long l8 = m8.o0();
        return String.format((Locale)Locale.ENGLISH, (String)"trace metric: %s (duration: %sms)", (Object[])new Object[]{m8.r0(), new DecimalFormat("#.####").format((double)l8 / 1000.0)});
    }

    public static String q(Context object) {
        try {
            object = object.getPackageManager().getPackageInfo((String)object.getPackageName(), (int)0).versionName;
            if (object == null) {
                return "";
            }
            return object;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return "";
        }
    }

    public final /* synthetic */ void A() {
        this.z.a(this.E);
    }

    public void B(N4.g g8, N4.d d8) {
        this.w.execute((Runnable)new f(this, g8, d8));
    }

    public void C(N4.h h8, N4.d d8) {
        this.w.execute((Runnable)new h(this, h8, d8));
    }

    public void D(N4.m m8, N4.d d8) {
        this.w.execute((Runnable)new g(this, m8, d8));
    }

    public final N4.i E(i.b b8, N4.d object) {
        block3 : {
            c.b b9;
            block2 : {
                this.H();
                b9 = this.B.H((N4.d)object);
                if (b8.l()) break block2;
                object = b9;
                if (!b8.o()) break block3;
            }
            object = ((c.b)b9.x()).E(this.k());
        }
        return (N4.i)b8.D((c.b)object).v();
    }

    public final void F() {
        Context context;
        this.x = context = this.r.m();
        this.C = context.getPackageName();
        this.y = C4.a.g();
        this.z = new d(this.x, new M4.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.A = B4.a.b();
        this.v = new b(this.u, this.y.a());
        this.i();
    }

    public final void G(i.b j8, N4.d d8) {
        if (!this.v()) {
            if (this.t(j8)) {
                F.b("Transport is not initialized yet, %s will be queued for to be dispatched later", k.o(j8));
                this.p.add((Object)new c((i.b)j8, d8));
            }
            return;
        }
        if (this.u((N4.i)(j8 = this.E((i.b)j8, d8)))) {
            this.h((N4.i)j8);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    public final void H() {
        block9 : {
            String string2;
            block6 : {
                block10 : {
                    ExecutionException executionException2;
                    block8 : {
                        InterruptedException interruptedException2;
                        block7 : {
                            if (!this.y.L()) break block9;
                            if (this.B.D() && !this.E) {
                                return;
                            }
                            try {
                                string2 = (String)V2.m.b(this.t.a(), 60000L, TimeUnit.MILLISECONDS);
                                break block6;
                            }
                            catch (TimeoutException timeoutException) {
                            }
                            catch (InterruptedException interruptedException2) {
                                break block7;
                            }
                            catch (ExecutionException executionException2) {
                                break block8;
                            }
                            F.d("Task to retrieve Installation Id is timed out: %s", timeoutException.getMessage());
                            break block10;
                        }
                        F.d("Task to retrieve Installation Id is interrupted: %s", interruptedException2.getMessage());
                        break block10;
                    }
                    F.d("Unable to retrieve Installation Id: %s", executionException2.getMessage());
                }
                string2 = null;
            }
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                this.B.G(string2);
                return;
            }
            F.j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
        }
    }

    public final void I() {
        if (this.s == null && this.v()) {
            this.s = A4.e.c();
        }
    }

    @Override
    public void b(N4.d d8) {
        boolean bl = d8 == N4.d.q;
        this.E = bl;
        if (this.v()) {
            this.w.execute((Runnable)new e(this));
        }
    }

    public final void h(N4.i i8) {
        if (i8.l()) {
            F.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", k.o(i8), this.j(i8.n()));
        } else {
            F.g("Logging %s", k.o(i8));
        }
        this.v.b(i8);
    }

    public final void i() {
        this.A.j(new WeakReference((Object)G));
        Object object = N4.c.h0();
        this.B = object;
        object.I(this.r.r().c()).F(a.a0().D(this.C).E(A4.a.b).F(k.q(this.x)));
        this.q.set(true);
        while (!this.p.isEmpty()) {
            object = (c)this.p.poll();
            if (object == null) continue;
            this.w.execute((Runnable)new j(this, (c)object));
        }
    }

    public final String j(N4.m object) {
        if ((object = object.r0()).startsWith("_st_")) {
            return F4.b.c(this.D, this.C, (String)object);
        }
        return F4.b.a(this.D, this.C, (String)object);
    }

    public final Map k() {
        this.I();
        A4.e e8 = this.s;
        if (e8 != null) {
            return e8.b();
        }
        return Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void r(N4.i object) {
        B4.a a8;
        if (object.l()) {
            a8 = this.A;
            object = M4.b.p;
        } else {
            if (!object.o()) {
                return;
            }
            a8 = this.A;
            object = M4.b.q;
        }
        a8.d(object.toString(), 1L);
    }

    public void s(s3.e e8, s4.i i8, r4.b b8) {
        this.r = e8;
        this.D = e8.r().g();
        this.t = i8;
        this.u = b8;
        this.w.execute((Runnable)new i(this));
    }

    public final boolean t(N4.j j8) {
        Integer n8 = (Integer)this.o.get((Object)"KEY_AVAILABLE_TRACES_FOR_CACHING");
        int n9 = n8;
        Integer n10 = (Integer)this.o.get((Object)"KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int n11 = n10;
        Integer n12 = (Integer)this.o.get((Object)"KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int n13 = n12;
        if (j8.l() && n9 > 0) {
            this.o.put((Object)"KEY_AVAILABLE_TRACES_FOR_CACHING", (Object)(n9 - 1));
            return true;
        }
        if (j8.o() && n11 > 0) {
            this.o.put((Object)"KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", (Object)(n11 - 1));
            return true;
        }
        if (j8.f() && n13 > 0) {
            this.o.put((Object)"KEY_AVAILABLE_GAUGES_FOR_CACHING", (Object)(n13 - 1));
            return true;
        }
        F.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", new Object[]{k.o(j8), n8, n10, n12});
        return false;
    }

    public final boolean u(N4.i i8) {
        if (!this.y.L()) {
            F.g("Performance collection is not enabled, dropping %s", k.o(i8));
            return false;
        }
        if (!i8.Y().d0()) {
            F.k("App Instance ID is null or empty, dropping %s", k.o(i8));
            return false;
        }
        if (!H4.e.b(i8, this.x)) {
            F.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", k.o(i8));
            return false;
        }
        if (!this.z.h(i8)) {
            this.r(i8);
            F.g("Event dropped due to device sampling - %s", k.o(i8));
            return false;
        }
        if (this.z.g(i8)) {
            this.r(i8);
            F.g("Rate limited (per device) - %s", k.o(i8));
            return false;
        }
        return true;
    }

    public boolean v() {
        return this.q.get();
    }

    public final /* synthetic */ void w(c c8) {
        this.G(c8.a, c8.b);
    }

    public final /* synthetic */ void x(N4.m m8, N4.d d8) {
        this.G(N4.i.a0().G(m8), d8);
    }

    public final /* synthetic */ void y(N4.h h8, N4.d d8) {
        this.G(N4.i.a0().F(h8), d8);
    }

    public final /* synthetic */ void z(N4.g g8, N4.d d8) {
        this.G(N4.i.a0().E(g8), d8);
    }
}

