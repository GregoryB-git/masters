package L4;

import B4.a;
import N4.c;
import N4.i;
import N4.m;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import r4.InterfaceC1922b;
import s3.C1947e;

/* loaded from: classes.dex */
public class k implements a.b {

    /* renamed from: F, reason: collision with root package name */
    public static final F4.a f3369F = F4.a.e();

    /* renamed from: G, reason: collision with root package name */
    public static final k f3370G = new k();

    /* renamed from: A, reason: collision with root package name */
    public B4.a f3371A;

    /* renamed from: B, reason: collision with root package name */
    public c.b f3372B;

    /* renamed from: C, reason: collision with root package name */
    public String f3373C;

    /* renamed from: D, reason: collision with root package name */
    public String f3374D;

    /* renamed from: o, reason: collision with root package name */
    public final Map f3376o;

    /* renamed from: r, reason: collision with root package name */
    public C1947e f3379r;

    /* renamed from: s, reason: collision with root package name */
    public A4.e f3380s;

    /* renamed from: t, reason: collision with root package name */
    public s4.i f3381t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1922b f3382u;

    /* renamed from: v, reason: collision with root package name */
    public b f3383v;

    /* renamed from: x, reason: collision with root package name */
    public Context f3385x;

    /* renamed from: y, reason: collision with root package name */
    public C4.a f3386y;

    /* renamed from: z, reason: collision with root package name */
    public d f3387z;

    /* renamed from: p, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3377p = new ConcurrentLinkedQueue();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f3378q = new AtomicBoolean(false);

    /* renamed from: E, reason: collision with root package name */
    public boolean f3375E = false;

    /* renamed from: w, reason: collision with root package name */
    public ExecutorService f3384w = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f3376o = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static k l() {
        return f3370G;
    }

    public static String m(N4.g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gVar.g0()), Integer.valueOf(gVar.d0()), Integer.valueOf(gVar.c0()));
    }

    public static String n(N4.h hVar) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", hVar.x0(), hVar.A0() ? String.valueOf(hVar.o0()) : "UNKNOWN", new DecimalFormat("#.####").format((hVar.E0() ? hVar.v0() : 0L) / 1000.0d));
    }

    public static String o(N4.j jVar) {
        return jVar.l() ? p(jVar.n()) : jVar.o() ? n(jVar.p()) : jVar.f() ? m(jVar.g()) : "log";
    }

    public static String p(m mVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", mVar.r0(), new DecimalFormat("#.####").format(mVar.o0() / 1000.0d));
    }

    public static String q(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public final /* synthetic */ void A() {
        this.f3387z.a(this.f3375E);
    }

    public void B(final N4.g gVar, final N4.d dVar) {
        this.f3384w.execute(new Runnable() { // from class: L4.f
            @Override // java.lang.Runnable
            public final void run() {
                k.this.z(gVar, dVar);
            }
        });
    }

    public void C(final N4.h hVar, final N4.d dVar) {
        this.f3384w.execute(new Runnable() { // from class: L4.h
            @Override // java.lang.Runnable
            public final void run() {
                k.this.y(hVar, dVar);
            }
        });
    }

    public void D(final m mVar, final N4.d dVar) {
        this.f3384w.execute(new Runnable() { // from class: L4.g
            @Override // java.lang.Runnable
            public final void run() {
                k.this.x(mVar, dVar);
            }
        });
    }

    public final N4.i E(i.b bVar, N4.d dVar) {
        H();
        c.b H6 = this.f3372B.H(dVar);
        if (bVar.l() || bVar.o()) {
            H6 = ((c.b) H6.clone()).E(k());
        }
        return (N4.i) bVar.D(H6).v();
    }

    public final void F() {
        Context m7 = this.f3379r.m();
        this.f3385x = m7;
        this.f3373C = m7.getPackageName();
        this.f3386y = C4.a.g();
        this.f3387z = new d(this.f3385x, new M4.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f3371A = B4.a.b();
        this.f3383v = new b(this.f3382u, this.f3386y.a());
        i();
    }

    public final void G(i.b bVar, N4.d dVar) {
        if (!v()) {
            if (t(bVar)) {
                f3369F.b("Transport is not initialized yet, %s will be queued for to be dispatched later", o(bVar));
                this.f3377p.add(new c(bVar, dVar));
                return;
            }
            return;
        }
        N4.i E6 = E(bVar, dVar);
        if (u(E6)) {
            h(E6);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H() {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            C4.a r2 = r6.f3386y
            boolean r2 = r2.L()
            if (r2 == 0) goto L72
            N4.c$b r2 = r6.f3372B
            boolean r2 = r2.D()
            if (r2 == 0) goto L17
            boolean r2 = r6.f3375E
            if (r2 != 0) goto L17
            return
        L17:
            s4.i r2 = r6.f3381t     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            V2.j r2 = r2.a()     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = V2.m.b(r2, r4, r3)     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
            goto L5f
        L29:
            r2 = move-exception
            goto L2f
        L2b:
            r2 = move-exception
            goto L3f
        L2d:
            r2 = move-exception
            goto L4f
        L2f:
            F4.a r3 = L4.k.f3369F
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r3.d(r0, r1)
            goto L5e
        L3f:
            F4.a r3 = L4.k.f3369F
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r3.d(r0, r1)
            goto L5e
        L4f:
            F4.a r3 = L4.k.f3369F
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r3.d(r0, r1)
        L5e:
            r2 = 0
        L5f:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L6b
            N4.c$b r0 = r6.f3372B
            r0.G(r2)
            goto L72
        L6b:
            F4.a r0 = L4.k.f3369F
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.k.H():void");
    }

    public final void I() {
        if (this.f3380s == null && v()) {
            this.f3380s = A4.e.c();
        }
    }

    @Override // B4.a.b
    public void b(N4.d dVar) {
        this.f3375E = dVar == N4.d.FOREGROUND;
        if (v()) {
            this.f3384w.execute(new Runnable() { // from class: L4.e
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.A();
                }
            });
        }
    }

    public final void h(N4.i iVar) {
        if (iVar.l()) {
            f3369F.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", o(iVar), j(iVar.n()));
        } else {
            f3369F.g("Logging %s", o(iVar));
        }
        this.f3383v.b(iVar);
    }

    public final void i() {
        this.f3371A.j(new WeakReference(f3370G));
        c.b h02 = N4.c.h0();
        this.f3372B = h02;
        h02.I(this.f3379r.r().c()).F(N4.a.a0().D(this.f3373C).E(A4.a.f544b).F(q(this.f3385x)));
        this.f3378q.set(true);
        while (!this.f3377p.isEmpty()) {
            final c cVar = (c) this.f3377p.poll();
            if (cVar != null) {
                this.f3384w.execute(new Runnable() { // from class: L4.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.this.w(cVar);
                    }
                });
            }
        }
    }

    public final String j(m mVar) {
        String r02 = mVar.r0();
        return r02.startsWith("_st_") ? F4.b.c(this.f3374D, this.f3373C, r02) : F4.b.a(this.f3374D, this.f3373C, r02);
    }

    public final Map k() {
        I();
        A4.e eVar = this.f3380s;
        return eVar != null ? eVar.b() : Collections.emptyMap();
    }

    public final void r(N4.i iVar) {
        B4.a aVar;
        M4.b bVar;
        if (iVar.l()) {
            aVar = this.f3371A;
            bVar = M4.b.TRACE_EVENT_RATE_LIMITED;
        } else {
            if (!iVar.o()) {
                return;
            }
            aVar = this.f3371A;
            bVar = M4.b.NETWORK_TRACE_EVENT_RATE_LIMITED;
        }
        aVar.d(bVar.toString(), 1L);
    }

    public void s(C1947e c1947e, s4.i iVar, InterfaceC1922b interfaceC1922b) {
        this.f3379r = c1947e;
        this.f3374D = c1947e.r().g();
        this.f3381t = iVar;
        this.f3382u = interfaceC1922b;
        this.f3384w.execute(new Runnable() { // from class: L4.i
            @Override // java.lang.Runnable
            public final void run() {
                k.this.F();
            }
        });
    }

    public final boolean t(N4.j jVar) {
        Integer num = (Integer) this.f3376o.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int intValue = num.intValue();
        Integer num2 = (Integer) this.f3376o.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) this.f3376o.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int intValue3 = num3.intValue();
        if (jVar.l() && intValue > 0) {
            this.f3376o.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        }
        if (jVar.o() && intValue2 > 0) {
            this.f3376o.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        }
        if (!jVar.f() || intValue3 <= 0) {
            f3369F.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", o(jVar), num, num2, num3);
            return false;
        }
        this.f3376o.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
        return true;
    }

    public final boolean u(N4.i iVar) {
        if (!this.f3386y.L()) {
            f3369F.g("Performance collection is not enabled, dropping %s", o(iVar));
            return false;
        }
        if (!iVar.Y().d0()) {
            f3369F.k("App Instance ID is null or empty, dropping %s", o(iVar));
            return false;
        }
        if (!H4.e.b(iVar, this.f3385x)) {
            f3369F.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", o(iVar));
            return false;
        }
        if (!this.f3387z.h(iVar)) {
            r(iVar);
            f3369F.g("Event dropped due to device sampling - %s", o(iVar));
            return false;
        }
        if (!this.f3387z.g(iVar)) {
            return true;
        }
        r(iVar);
        f3369F.g("Rate limited (per device) - %s", o(iVar));
        return false;
    }

    public boolean v() {
        return this.f3378q.get();
    }

    public final /* synthetic */ void w(c cVar) {
        G(cVar.f3336a, cVar.f3337b);
    }

    public final /* synthetic */ void x(m mVar, N4.d dVar) {
        G(N4.i.a0().G(mVar), dVar);
    }

    public final /* synthetic */ void y(N4.h hVar, N4.d dVar) {
        G(N4.i.a0().F(hVar), dVar);
    }

    public final /* synthetic */ void z(N4.g gVar, N4.d dVar) {
        G(N4.i.a0().E(gVar), dVar);
    }
}
