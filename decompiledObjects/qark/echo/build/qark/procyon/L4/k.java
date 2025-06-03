// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L4;

import com.google.protobuf.r;
import java.util.Collections;
import java.lang.ref.WeakReference;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.L;
import android.content.pm.PackageManager$NameNotFoundException;
import N4.j;
import java.text.DecimalFormat;
import java.util.Locale;
import N4.g;
import N4.h;
import N4.m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import r4.b;
import s4.i;
import s3.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import N4.c;
import B4.a;

public class k implements b
{
    public static final F4.a F;
    public static final k G;
    public a A;
    public c.b B;
    public String C;
    public String D;
    public boolean E;
    public final Map o;
    public final ConcurrentLinkedQueue p;
    public final AtomicBoolean q;
    public e r;
    public A4.e s;
    public i t;
    public r4.b u;
    public L4.b v;
    public ExecutorService w;
    public Context x;
    public C4.a y;
    public d z;
    
    static {
        F = F4.a.e();
        G = new k();
    }
    
    public k() {
        this.p = new ConcurrentLinkedQueue();
        this.q = new AtomicBoolean(false);
        this.E = false;
        this.w = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        final ConcurrentHashMap<String, Integer> o = new ConcurrentHashMap<String, Integer>();
        this.o = o;
        final Integer value = 50;
        o.put("KEY_AVAILABLE_TRACES_FOR_CACHING", value);
        o.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", value);
        o.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", value);
    }
    
    public static k l() {
        return k.G;
    }
    
    public static String m(final g g) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", g.g0(), g.d0(), g.c0());
    }
    
    public static String n(final h h) {
        long v0;
        if (h.E0()) {
            v0 = h.v0();
        }
        else {
            v0 = 0L;
        }
        String value;
        if (h.A0()) {
            value = String.valueOf(h.o0());
        }
        else {
            value = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", h.x0(), value, new DecimalFormat("#.####").format(v0 / 1000.0));
    }
    
    public static String o(final j j) {
        if (j.l()) {
            return p(j.n());
        }
        if (j.o()) {
            return n(j.p());
        }
        if (j.f()) {
            return m(j.g());
        }
        return "log";
    }
    
    public static String p(final m m) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", m.r0(), new DecimalFormat("#.####").format(m.o0() / 1000.0));
    }
    
    public static String q(final Context context) {
        try {
            final String versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (versionName == null) {
                return "";
            }
            return versionName;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return "";
        }
    }
    
    public void B(final g g, final N4.d d) {
        this.w.execute(new f(this, g, d));
    }
    
    public void C(final h h, final N4.d d) {
        this.w.execute(new L4.h(this, h, d));
    }
    
    public void D(final m m, final N4.d d) {
        this.w.execute(new L4.g(this, m, d));
    }
    
    public final N4.i E(final N4.i.b b, final N4.d d) {
        this.H();
        final c.b h = this.B.H(d);
        if (!b.l()) {
            final L e = h;
            if (!b.o()) {
                return (N4.i)((r.a)b.D((c.b)e)).v();
            }
        }
        final L e = ((c.b)((r.a)h).x()).E(this.k());
        return (N4.i)((r.a)b.D((c.b)e)).v();
    }
    
    public final void F() {
        final Context m = this.r.m();
        this.x = m;
        this.C = m.getPackageName();
        this.y = C4.a.g();
        this.z = new d(this.x, new M4.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.A = a.b();
        this.v = new L4.b(this.u, this.y.a());
        this.i();
    }
    
    public final void G(final N4.i.b b, final N4.d d) {
        if (!this.v()) {
            if (this.t(b)) {
                k.F.b("Transport is not initialized yet, %s will be queued for to be dispatched later", o(b));
                this.p.add(new L4.c(b, d));
            }
            return;
        }
        final N4.i e = this.E(b, d);
        if (this.u(e)) {
            this.h(e);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }
    
    public final void H() {
        if (this.y.L()) {
            if (this.B.D() && !this.E) {
                return;
            }
            String s = null;
            Label_0133: {
                Label_0131: {
                    Label_0111: {
                        Label_0088: {
                            try {
                                s = (String)V2.m.b(this.t.a(), 60000L, TimeUnit.MILLISECONDS);
                                break Label_0133;
                            }
                            catch (TimeoutException ex) {}
                            catch (InterruptedException ex2) {
                                break Label_0088;
                            }
                            catch (ExecutionException ex3) {
                                break Label_0111;
                            }
                            final TimeoutException ex;
                            k.F.d("Task to retrieve Installation Id is timed out: %s", ex.getMessage());
                            break Label_0131;
                        }
                        final InterruptedException ex2;
                        k.F.d("Task to retrieve Installation Id is interrupted: %s", ex2.getMessage());
                        break Label_0131;
                    }
                    final ExecutionException ex3;
                    k.F.d("Unable to retrieve Installation Id: %s", ex3.getMessage());
                }
                s = null;
            }
            if (!TextUtils.isEmpty((CharSequence)s)) {
                this.B.G(s);
                return;
            }
            k.F.j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
        }
    }
    
    public final void I() {
        if (this.s == null && this.v()) {
            this.s = A4.e.c();
        }
    }
    
    @Override
    public void b(final N4.d d) {
        this.E = (d == N4.d.q);
        if (this.v()) {
            this.w.execute(new L4.e(this));
        }
    }
    
    public final void h(final N4.i i) {
        if (i.l()) {
            k.F.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", o(i), this.j(i.n()));
        }
        else {
            k.F.g("Logging %s", o(i));
        }
        this.v.b(i);
    }
    
    public final void i() {
        this.A.j(new WeakReference((T)k.G));
        final c.b h0 = c.h0();
        this.B = h0;
        h0.I(this.r.r().c()).F(N4.a.a0().D(this.C).E(A4.a.b).F(q(this.x)));
        this.q.set(true);
        while (!this.p.isEmpty()) {
            final L4.c c = this.p.poll();
            if (c != null) {
                this.w.execute(new L4.j(this, c));
            }
        }
    }
    
    public final String j(final m m) {
        final String r0 = m.r0();
        if (r0.startsWith("_st_")) {
            return F4.b.c(this.D, this.C, r0);
        }
        return F4.b.a(this.D, this.C, r0);
    }
    
    public final Map k() {
        this.I();
        final A4.e s = this.s;
        if (s != null) {
            return s.b();
        }
        return Collections.emptyMap();
    }
    
    public final void r(final N4.i i) {
        a a;
        M4.b b;
        if (i.l()) {
            a = this.A;
            b = M4.b.p;
        }
        else {
            if (!i.o()) {
                return;
            }
            a = this.A;
            b = M4.b.q;
        }
        a.d(b.toString(), 1L);
    }
    
    public void s(final e r, final i t, final r4.b u) {
        this.r = r;
        this.D = r.r().g();
        this.t = t;
        this.u = u;
        this.w.execute(new L4.i(this));
    }
    
    public final boolean t(final j j) {
        final Integer n = this.o.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        final int intValue = n;
        final Integer n2 = this.o.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        final int intValue2 = n2;
        final Integer n3 = this.o.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        final int intValue3 = n3;
        if (j.l() && intValue > 0) {
            this.o.put("KEY_AVAILABLE_TRACES_FOR_CACHING", intValue - 1);
            return true;
        }
        if (j.o() && intValue2 > 0) {
            this.o.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", intValue2 - 1);
            return true;
        }
        if (j.f() && intValue3 > 0) {
            this.o.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", intValue3 - 1);
            return true;
        }
        k.F.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", o(j), n, n2, n3);
        return false;
    }
    
    public final boolean u(final N4.i i) {
        if (!this.y.L()) {
            k.F.g("Performance collection is not enabled, dropping %s", o(i));
            return false;
        }
        if (!i.Y().d0()) {
            k.F.k("App Instance ID is null or empty, dropping %s", o(i));
            return false;
        }
        if (!H4.e.b(i, this.x)) {
            k.F.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", o(i));
            return false;
        }
        if (!this.z.h(i)) {
            this.r(i);
            k.F.g("Event dropped due to device sampling - %s", o(i));
            return false;
        }
        if (this.z.g(i)) {
            this.r(i);
            k.F.g("Rate limited (per device) - %s", o(i));
            return false;
        }
        return true;
    }
    
    public boolean v() {
        return this.q.get();
    }
}
