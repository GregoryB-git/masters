package gb;

import eb.a;
import eb.b0;
import eb.c;
import eb.d;
import eb.d0;
import eb.e;
import eb.g;
import eb.h1;
import eb.k0;
import eb.q;
import eb.u0;
import gb.c3;
import gb.d1;
import gb.g2;
import gb.g3;
import gb.h2;
import gb.i;
import gb.i.a;
import gb.j;
import gb.k0;
import gb.o3;
import gb.q;
import gb.v0;
import gb.x2.b;
import gb.y2;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import n7.g;

/* loaded from: classes.dex */
public final class r1 extends eb.n0 implements eb.e0<Object> {

    /* renamed from: e0, reason: collision with root package name */
    public static final Logger f6702e0 = Logger.getLogger(r1.class.getName());

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f6703f0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: g0, reason: collision with root package name */
    public static final eb.e1 f6704g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final eb.e1 f6705h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final eb.e1 f6706i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final g2 f6707j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final a f6708k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final d f6709l0;
    public boolean A;
    public final HashSet B;
    public Collection<m.e<?, ?>> C;
    public final Object D;
    public final HashSet E;
    public final f0 F;
    public final p G;
    public final AtomicBoolean H;
    public boolean I;
    public boolean J;
    public volatile boolean K;
    public final CountDownLatch L;
    public final t1 M;
    public final gb.m N;
    public final gb.p O;
    public final gb.n P;
    public final eb.c0 Q;
    public final m R;
    public int S;
    public g2 T;
    public boolean U;
    public final boolean V;
    public final y2.s W;
    public final long X;
    public final long Y;
    public final boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public final q.a f6710a0;

    /* renamed from: b, reason: collision with root package name */
    public final eb.f0 f6711b;

    /* renamed from: b0, reason: collision with root package name */
    public final i f6712b0;

    /* renamed from: c, reason: collision with root package name */
    public final String f6713c;

    /* renamed from: c0, reason: collision with root package name */
    public final e f6714c0;

    /* renamed from: d, reason: collision with root package name */
    public final eb.w0 f6715d;

    /* renamed from: d0, reason: collision with root package name */
    public final x2 f6716d0;

    /* renamed from: e, reason: collision with root package name */
    public final u0.a f6717e;
    public final gb.i f;

    /* renamed from: g, reason: collision with root package name */
    public final gb.l f6718g;

    /* renamed from: h, reason: collision with root package name */
    public final n f6719h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f6720i;

    /* renamed from: j, reason: collision with root package name */
    public final j3 f6721j;

    /* renamed from: k, reason: collision with root package name */
    public final h f6722k;

    /* renamed from: l, reason: collision with root package name */
    public final h f6723l;

    /* renamed from: m, reason: collision with root package name */
    public final o3 f6724m;

    /* renamed from: n, reason: collision with root package name */
    public final eb.h1 f6725n;

    /* renamed from: o, reason: collision with root package name */
    public final eb.s f6726o;

    /* renamed from: p, reason: collision with root package name */
    public final eb.m f6727p;

    /* renamed from: q, reason: collision with root package name */
    public final n7.q<n7.p> f6728q;

    /* renamed from: r, reason: collision with root package name */
    public final long f6729r;

    /* renamed from: s, reason: collision with root package name */
    public final y f6730s;
    public final j.a t;

    /* renamed from: u, reason: collision with root package name */
    public final e9.a f6731u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f6732v;

    /* renamed from: w, reason: collision with root package name */
    public s0 f6733w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6734x;

    /* renamed from: y, reason: collision with root package name */
    public k f6735y;

    /* renamed from: z, reason: collision with root package name */
    public volatile k0.j f6736z;

    public class a extends eb.d0 {
        @Override // eb.d0
        public final d0.a a() {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (r1.this.H.get()) {
                return;
            }
            r1 r1Var = r1.this;
            if (r1Var.f6735y == null) {
                return;
            }
            r1Var.L(false);
            r1.I(r1.this);
        }
    }

    public class c implements Thread.UncaughtExceptionHandler {
        public c() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            Logger logger = r1.f6702e0;
            Level level = Level.SEVERE;
            StringBuilder l10 = defpackage.f.l("[");
            l10.append(r1.this.f6711b);
            l10.append("] Uncaught exception in the SynchronizationContext. Panic!");
            logger.log(level, l10.toString(), th);
            r1 r1Var = r1.this;
            if (r1Var.A) {
                return;
            }
            r1Var.A = true;
            r1Var.L(true);
            r1Var.Q(false);
            v1 v1Var = new v1(th);
            r1Var.f6736z = v1Var;
            r1Var.F.i(v1Var);
            r1Var.R.D(null);
            r1Var.P.a(d.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
            r1Var.f6730s.a(eb.n.TRANSIENT_FAILURE);
        }
    }

    public class d extends eb.e<Object, Object> {
        @Override // eb.e
        public final void a(String str, Throwable th) {
        }

        @Override // eb.e
        public final void b() {
        }

        @Override // eb.e
        public final void c(int i10) {
        }

        @Override // eb.e
        public final void d(Object obj) {
        }

        @Override // eb.e
        public final void e(e.a<Object> aVar, eb.s0 s0Var) {
        }
    }

    public final class e implements q.c {

        /* renamed from: a, reason: collision with root package name */
        public volatile y2.b0 f6739a;

        public e() {
        }

        public final u a(s2 s2Var) {
            k0.j jVar = r1.this.f6736z;
            if (!r1.this.H.get()) {
                if (jVar == null) {
                    r1.this.f6725n.execute(new z1(this));
                } else {
                    u e10 = v0.e(jVar.a(s2Var), Boolean.TRUE.equals(s2Var.f6805a.f5041h));
                    if (e10 != null) {
                        return e10;
                    }
                }
            }
            return r1.this.F;
        }
    }

    public static final class f<ReqT, RespT> extends eb.x<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        public final eb.d0 f6741a;

        /* renamed from: b, reason: collision with root package name */
        public final e9.a f6742b;

        /* renamed from: c, reason: collision with root package name */
        public final Executor f6743c;

        /* renamed from: d, reason: collision with root package name */
        public final eb.t0<ReqT, RespT> f6744d;

        /* renamed from: e, reason: collision with root package name */
        public final eb.p f6745e;
        public eb.c f;

        /* renamed from: g, reason: collision with root package name */
        public eb.e<ReqT, RespT> f6746g;

        public f(eb.d0 d0Var, m.a aVar, Executor executor, eb.t0 t0Var, eb.c cVar) {
            this.f6741a = d0Var;
            this.f6742b = aVar;
            this.f6744d = t0Var;
            Executor executor2 = cVar.f5036b;
            executor = executor2 != null ? executor2 : executor;
            this.f6743c = executor;
            c.a b10 = eb.c.b(cVar);
            b10.f5045b = executor;
            this.f = new eb.c(b10);
            this.f6745e = eb.p.b();
        }

        @Override // eb.x0, eb.e
        public final void a(String str, Throwable th) {
            eb.e<ReqT, RespT> eVar = this.f6746g;
            if (eVar != null) {
                eVar.a(str, th);
            }
        }

        @Override // eb.x, eb.e
        public final void e(e.a<RespT> aVar, eb.s0 s0Var) {
            eb.t0<ReqT, RespT> t0Var = this.f6744d;
            eb.c cVar = this.f;
            x6.b.y(t0Var, Constants.METHOD);
            x6.b.y(s0Var, "headers");
            x6.b.y(cVar, "callOptions");
            d0.a a10 = this.f6741a.a();
            eb.e1 e1Var = a10.f5066a;
            if (!e1Var.e()) {
                this.f6743c.execute(new b2(this, aVar, v0.g(e1Var)));
                this.f6746g = r1.f6709l0;
                return;
            }
            eb.f fVar = a10.f5068c;
            g2 g2Var = (g2) a10.f5067b;
            eb.t0<ReqT, RespT> t0Var2 = this.f6744d;
            g2.a aVar2 = g2Var.f6435b.get(t0Var2.f5217b);
            if (aVar2 == null) {
                aVar2 = g2Var.f6436c.get(t0Var2.f5218c);
            }
            if (aVar2 == null) {
                aVar2 = g2Var.f6434a;
            }
            if (aVar2 != null) {
                this.f = this.f.c(g2.a.f6439g, aVar2);
            }
            eb.e<ReqT, RespT> a11 = fVar != null ? fVar.a() : this.f6742b.v(this.f6744d, this.f);
            this.f6746g = a11;
            a11.e(aVar, s0Var);
        }

        @Override // eb.x0
        public final eb.e<ReqT, RespT> f() {
            return this.f6746g;
        }
    }

    public final class g implements h2.a {
        public g() {
        }

        @Override // gb.h2.a
        public final void a(eb.e1 e1Var) {
            x6.b.I(r1.this.H.get(), "Channel must have been shut down");
        }

        @Override // gb.h2.a
        public final void b() {
        }

        @Override // gb.h2.a
        public final eb.a c(eb.a aVar) {
            return aVar;
        }

        @Override // gb.h2.a
        public final void d() {
            x6.b.I(r1.this.H.get(), "Channel must have been shut down");
            r1 r1Var = r1.this;
            r1Var.J = true;
            r1Var.Q(false);
            r1.J(r1.this);
            r1.K(r1.this);
        }

        @Override // gb.h2.a
        public final void e(boolean z10) {
            r1 r1Var = r1.this;
            r1Var.f6712b0.c(r1Var.F, z10);
        }
    }

    public static final class h implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final m2<? extends Executor> f6748a;

        /* renamed from: b, reason: collision with root package name */
        public Executor f6749b;

        public h(j3 j3Var) {
            this.f6748a = j3Var;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Executor executor;
            synchronized (this) {
                if (this.f6749b == null) {
                    Executor b10 = this.f6748a.b();
                    x6.b.z("%s.getObject()", b10, this.f6749b);
                    this.f6749b = b10;
                }
                executor = this.f6749b;
            }
            executor.execute(runnable);
        }
    }

    public final class i extends c1<Object> {
        public i() {
        }

        @Override // gb.c1
        public final void a() {
            r1.this.M();
        }

        @Override // gb.c1
        public final void b() {
            if (r1.this.H.get()) {
                return;
            }
            r1.this.O();
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r1 r1Var = r1.this;
            if (r1Var.f6735y == null) {
                return;
            }
            r1.I(r1Var);
        }
    }

    public final class k extends k0.e {

        /* renamed from: a, reason: collision with root package name */
        public i.a f6752a;

        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                r1 r1Var = r1.this;
                r1Var.f6725n.d();
                if (r1Var.f6734x) {
                    r1Var.f6733w.b();
                }
            }
        }

        public final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k0.j f6755a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ eb.n f6756b;

            public b(k0.j jVar, eb.n nVar) {
                this.f6755a = jVar;
                this.f6756b = nVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k kVar = k.this;
                r1 r1Var = r1.this;
                if (kVar != r1Var.f6735y) {
                    return;
                }
                k0.j jVar = this.f6755a;
                r1Var.f6736z = jVar;
                r1Var.F.i(jVar);
                eb.n nVar = this.f6756b;
                if (nVar != eb.n.SHUTDOWN) {
                    r1.this.P.b(d.a.INFO, "Entering {0} state with picker: {1}", nVar, this.f6755a);
                    r1.this.f6730s.a(this.f6756b);
                }
            }
        }

        public k() {
        }

        @Override // eb.k0.e
        public final k0.i a(k0.b bVar) {
            r1.this.f6725n.d();
            x6.b.I(!r1.this.J, "Channel is being terminated");
            return r1.this.new o(bVar);
        }

        @Override // eb.k0.e
        public final eb.d b() {
            return r1.this.P;
        }

        @Override // eb.k0.e
        public final ScheduledExecutorService c() {
            return r1.this.f6719h;
        }

        @Override // eb.k0.e
        public final eb.h1 d() {
            return r1.this.f6725n;
        }

        @Override // eb.k0.e
        public final void e() {
            r1.this.f6725n.d();
            r1.this.f6725n.execute(new a());
        }

        @Override // eb.k0.e
        public final void f(eb.n nVar, k0.j jVar) {
            r1.this.f6725n.d();
            x6.b.y(nVar, "newState");
            x6.b.y(jVar, "newPicker");
            r1.this.f6725n.execute(new b(jVar, nVar));
        }
    }

    public final class l extends u0.d {

        /* renamed from: a, reason: collision with root package name */
        public final k f6758a;

        /* renamed from: b, reason: collision with root package name */
        public final eb.u0 f6759b;

        public final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ eb.e1 f6761a;

            public a(eb.e1 e1Var) {
                this.f6761a = e1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l lVar = l.this;
                eb.e1 e1Var = this.f6761a;
                lVar.getClass();
                r1.f6702e0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{r1.this.f6711b, e1Var});
                m mVar = r1.this.R;
                if (mVar.f6765b.get() == r1.f6708k0) {
                    mVar.D(null);
                }
                r1 r1Var = r1.this;
                if (r1Var.S != 3) {
                    r1Var.P.b(d.a.WARNING, "Failed to resolve name: {0}", e1Var);
                    r1.this.S = 3;
                }
                k kVar = lVar.f6758a;
                if (kVar != r1.this.f6735y) {
                    return;
                }
                kVar.f6752a.f6468b.c(e1Var);
            }
        }

        public final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u0.e f6763a;

            public b(u0.e eVar) {
                this.f6763a = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g2 g2Var;
                eb.e1 e1Var;
                Object obj;
                d.a aVar = d.a.DEBUG;
                d.a aVar2 = d.a.INFO;
                l lVar = l.this;
                r1 r1Var = r1.this;
                if (r1Var.f6733w != lVar.f6759b) {
                    return;
                }
                u0.e eVar = this.f6763a;
                List<eb.u> list = eVar.f5246a;
                r1Var.P.b(aVar, "Resolved address: {0}, config={1}", list, eVar.f5247b);
                r1 r1Var2 = r1.this;
                if (r1Var2.S != 2) {
                    r1Var2.P.b(aVar2, "Address resolved: {0}", list);
                    r1.this.S = 2;
                }
                u0.e eVar2 = this.f6763a;
                u0.b bVar = eVar2.f5248c;
                c3.b bVar2 = (c3.b) eVar2.f5247b.a(c3.f6209d);
                eb.d0 d0Var = (eb.d0) this.f6763a.f5247b.a(eb.d0.f5065a);
                g2 g2Var2 = (bVar == null || (obj = bVar.f5245b) == null) ? null : (g2) obj;
                eb.e1 e1Var2 = bVar != null ? bVar.f5244a : null;
                r1 r1Var3 = r1.this;
                if (r1Var3.V) {
                    if (g2Var2 != null) {
                        if (d0Var != null) {
                            r1Var3.R.D(d0Var);
                            if (g2Var2.b() != null) {
                                r1.this.P.a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            r1Var3.R.D(g2Var2.b());
                        }
                    } else if (e1Var2 == null) {
                        g2Var2 = r1.f6707j0;
                        r1Var3.R.D(null);
                    } else {
                        if (!r1Var3.U) {
                            r1Var3.P.a(aVar2, "Fallback to error due to invalid first service config without default config");
                            l.this.a(bVar.f5244a);
                            if (bVar2 != null) {
                                bVar2.a(bVar.f5244a);
                                return;
                            }
                            return;
                        }
                        g2Var2 = r1Var3.T;
                    }
                    if (!g2Var2.equals(r1.this.T)) {
                        gb.n nVar = r1.this.P;
                        Object[] objArr = new Object[1];
                        objArr[0] = g2Var2 == r1.f6707j0 ? " to empty" : "";
                        nVar.b(aVar2, "Service config changed{0}", objArr);
                        r1 r1Var4 = r1.this;
                        r1Var4.T = g2Var2;
                        r1Var4.f6714c0.f6739a = g2Var2.f6437d;
                    }
                    try {
                        r1.this.U = true;
                    } catch (RuntimeException e10) {
                        Logger logger = r1.f6702e0;
                        Level level = Level.WARNING;
                        StringBuilder l10 = defpackage.f.l("[");
                        l10.append(r1.this.f6711b);
                        l10.append("] Unexpected exception from parsing service config");
                        logger.log(level, l10.toString(), (Throwable) e10);
                    }
                    g2Var = g2Var2;
                } else {
                    if (g2Var2 != null) {
                        r1Var3.P.a(aVar2, "Service config from name resolver discarded by channel settings");
                    }
                    r1.this.getClass();
                    g2Var = r1.f6707j0;
                    if (d0Var != null) {
                        r1.this.P.a(aVar2, "Config selector from name resolver discarded by channel settings");
                    }
                    r1.this.R.D(g2Var.b());
                }
                eb.a aVar3 = this.f6763a.f5247b;
                l lVar2 = l.this;
                if (lVar2.f6758a == r1.this.f6735y) {
                    aVar3.getClass();
                    a.C0073a c0073a = new a.C0073a(aVar3);
                    c0073a.b(eb.d0.f5065a);
                    Map<String, ?> map = g2Var.f;
                    if (map != null) {
                        c0073a.c(eb.k0.f5147b, map);
                        c0073a.a();
                    }
                    eb.a a10 = c0073a.a();
                    i.a aVar4 = l.this.f6758a.f6752a;
                    eb.a aVar5 = eb.a.f5012b;
                    Object obj2 = g2Var.f6438e;
                    x6.b.y(list, "addresses");
                    List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
                    x6.b.y(a10, "attributes");
                    aVar4.getClass();
                    g3.b bVar3 = (g3.b) obj2;
                    if (bVar3 == null) {
                        try {
                            gb.i iVar = gb.i.this;
                            bVar3 = new g3.b(gb.i.a(iVar, iVar.f6466b), null);
                        } catch (i.e e11) {
                            aVar4.f6467a.f(eb.n.TRANSIENT_FAILURE, new i.c(eb.e1.f5077m.g(e11.getMessage())));
                            aVar4.f6468b.f();
                            aVar4.f6469c = null;
                            aVar4.f6468b = new i.d();
                            e1Var = eb.e1.f5070e;
                        }
                    }
                    if (aVar4.f6469c == null || !bVar3.f6448a.b().equals(aVar4.f6469c.b())) {
                        aVar4.f6467a.f(eb.n.CONNECTING, new i.b());
                        aVar4.f6468b.f();
                        eb.l0 l0Var = bVar3.f6448a;
                        aVar4.f6469c = l0Var;
                        eb.k0 k0Var = aVar4.f6468b;
                        aVar4.f6468b = l0Var.a(aVar4.f6467a);
                        aVar4.f6467a.b().b(aVar2, "Load balancer changed from {0} to {1}", k0Var.getClass().getSimpleName(), aVar4.f6468b.getClass().getSimpleName());
                    }
                    Object obj3 = bVar3.f6449b;
                    if (obj3 != null) {
                        aVar4.f6467a.b().b(aVar, "Load-balancing config: {0}", bVar3.f6449b);
                    }
                    e1Var = aVar4.f6468b.a(new k0.h(unmodifiableList, a10, obj3));
                    if (bVar2 != null) {
                        bVar2.a(e1Var);
                    }
                }
            }
        }

        public l(k kVar, eb.u0 u0Var) {
            this.f6758a = kVar;
            x6.b.y(u0Var, "resolver");
            this.f6759b = u0Var;
        }

        @Override // eb.u0.d
        public final void a(eb.e1 e1Var) {
            x6.b.s("the error status must not be OK", !e1Var.e());
            r1.this.f6725n.execute(new a(e1Var));
        }

        @Override // eb.u0.d
        public final void b(u0.e eVar) {
            r1.this.f6725n.execute(new b(eVar));
        }
    }

    public class m extends e9.a {

        /* renamed from: c, reason: collision with root package name */
        public final String f6766c;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<eb.d0> f6765b = new AtomicReference<>(r1.f6708k0);

        /* renamed from: d, reason: collision with root package name */
        public final a f6767d = new a();

        public class a extends e9.a {
            public a() {
            }

            @Override // e9.a
            public final String b() {
                return m.this.f6766c;
            }

            @Override // e9.a
            public final <RequestT, ResponseT> eb.e<RequestT, ResponseT> v(eb.t0<RequestT, ResponseT> t0Var, eb.c cVar) {
                r1 r1Var = r1.this;
                Logger logger = r1.f6702e0;
                r1Var.getClass();
                Executor executor = cVar.f5036b;
                Executor executor2 = executor == null ? r1Var.f6720i : executor;
                r1 r1Var2 = r1.this;
                q qVar = new q(t0Var, executor2, cVar, r1Var2.f6714c0, r1Var2.K ? null : r1.this.f6718g.p0(), r1.this.N);
                r1.this.getClass();
                qVar.f6671q = false;
                r1 r1Var3 = r1.this;
                qVar.f6672r = r1Var3.f6726o;
                qVar.f6673s = r1Var3.f6727p;
                return qVar;
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                r1.this.M();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        public class c<ReqT, RespT> extends eb.e<ReqT, RespT> {
            @Override // eb.e
            public final void a(String str, Throwable th) {
            }

            @Override // eb.e
            public final void b() {
            }

            @Override // eb.e
            public final void c(int i10) {
            }

            @Override // eb.e
            public final void d(ReqT reqt) {
            }

            @Override // eb.e
            public final void e(e.a<RespT> aVar, eb.s0 s0Var) {
                aVar.a(new eb.s0(), r1.f6705h0);
            }
        }

        public class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f6771a;

            public d(e eVar) {
                this.f6771a = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (m.this.f6765b.get() != r1.f6708k0) {
                    this.f6771a.j();
                    return;
                }
                r1 r1Var = r1.this;
                if (r1Var.C == null) {
                    r1Var.C = new LinkedHashSet();
                    r1 r1Var2 = r1.this;
                    r1Var2.f6712b0.c(r1Var2.D, true);
                }
                r1.this.C.add(this.f6771a);
            }
        }

        public final class e<ReqT, RespT> extends d0<ReqT, RespT> {

            /* renamed from: k, reason: collision with root package name */
            public final eb.p f6773k;

            /* renamed from: l, reason: collision with root package name */
            public final eb.t0<ReqT, RespT> f6774l;

            /* renamed from: m, reason: collision with root package name */
            public final eb.c f6775m;

            /* renamed from: n, reason: collision with root package name */
            public final long f6776n;

            public class a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Runnable f6778a;

                public a(b0 b0Var) {
                    this.f6778a = b0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f6778a.run();
                    e eVar = e.this;
                    r1.this.f6725n.execute(new b());
                }
            }

            public final class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    Collection<e<?, ?>> collection = r1.this.C;
                    if (collection != null) {
                        collection.remove(eVar);
                        if (r1.this.C.isEmpty()) {
                            r1 r1Var = r1.this;
                            r1Var.f6712b0.c(r1Var.D, false);
                            r1 r1Var2 = r1.this;
                            r1Var2.C = null;
                            if (r1Var2.H.get()) {
                                r1.this.G.a(r1.f6705h0);
                            }
                        }
                    }
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public e(eb.p r5, eb.t0<ReqT, RespT> r6, eb.c r7) {
                /*
                    r3 = this;
                    gb.r1.m.this = r4
                    gb.r1 r0 = gb.r1.this
                    java.util.logging.Logger r1 = gb.r1.f6702e0
                    r0.getClass()
                    java.util.concurrent.Executor r1 = r7.f5036b
                    if (r1 != 0) goto Lf
                    java.util.concurrent.Executor r1 = r0.f6720i
                Lf:
                    gb.r1 r0 = gb.r1.this
                    gb.r1$n r0 = r0.f6719h
                    eb.q r2 = r7.f5035a
                    r3.<init>(r1, r0, r2)
                    r3.f6773k = r5
                    r3.f6774l = r6
                    r3.f6775m = r7
                    gb.r1 r4 = gb.r1.this
                    eb.q$a r4 = r4.f6710a0
                    r4.getClass()
                    long r4 = java.lang.System.nanoTime()
                    r3.f6776n = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: gb.r1.m.e.<init>(gb.r1$m, eb.p, eb.t0, eb.c):void");
            }

            @Override // gb.d0
            public final void f() {
                r1.this.f6725n.execute(new b());
            }

            public final void j() {
                b0 b0Var;
                eb.p a10 = this.f6773k.a();
                try {
                    eb.c cVar = this.f6775m;
                    c.b<Long> bVar = eb.h.f5112b;
                    r1.this.f6710a0.getClass();
                    eb.e<ReqT, RespT> C = m.this.C(this.f6774l, cVar.c(bVar, Long.valueOf(System.nanoTime() - this.f6776n)));
                    synchronized (this) {
                        try {
                            eb.e<ReqT, RespT> eVar = this.f;
                            if (eVar != null) {
                                b0Var = null;
                            } else {
                                x6.b.G(eVar, "realCall already set to %s", eVar == null);
                                ScheduledFuture<?> scheduledFuture = this.f6223a;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                this.f = C;
                                b0Var = new b0(this, this.f6225c);
                            }
                        } finally {
                        }
                    }
                    if (b0Var == null) {
                        r1.this.f6725n.execute(new b());
                        return;
                    }
                    r1 r1Var = r1.this;
                    eb.c cVar2 = this.f6775m;
                    r1Var.getClass();
                    Executor executor = cVar2.f5036b;
                    if (executor == null) {
                        executor = r1Var.f6720i;
                    }
                    executor.execute(new a(b0Var));
                } finally {
                    this.f6773k.c(a10);
                }
            }
        }

        public m(String str) {
            x6.b.y(str, "authority");
            this.f6766c = str;
        }

        public final <ReqT, RespT> eb.e<ReqT, RespT> C(eb.t0<ReqT, RespT> t0Var, eb.c cVar) {
            eb.d0 d0Var = this.f6765b.get();
            if (d0Var != null) {
                if (!(d0Var instanceof g2.b)) {
                    return new f(d0Var, this.f6767d, r1.this.f6720i, t0Var, cVar);
                }
                g2 g2Var = ((g2.b) d0Var).f6445b;
                g2.a aVar = g2Var.f6435b.get(t0Var.f5217b);
                if (aVar == null) {
                    aVar = g2Var.f6436c.get(t0Var.f5218c);
                }
                if (aVar == null) {
                    aVar = g2Var.f6434a;
                }
                if (aVar != null) {
                    cVar = cVar.c(g2.a.f6439g, aVar);
                }
            }
            return this.f6767d.v(t0Var, cVar);
        }

        public final void D(eb.d0 d0Var) {
            Collection<e<?, ?>> collection;
            eb.d0 d0Var2 = this.f6765b.get();
            this.f6765b.set(d0Var);
            if (d0Var2 != r1.f6708k0 || (collection = r1.this.C) == null) {
                return;
            }
            Iterator<e<?, ?>> it = collection.iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        }

        @Override // e9.a
        public final String b() {
            return this.f6766c;
        }

        @Override // e9.a
        public final <ReqT, RespT> eb.e<ReqT, RespT> v(eb.t0<ReqT, RespT> t0Var, eb.c cVar) {
            eb.d0 d0Var = this.f6765b.get();
            a aVar = r1.f6708k0;
            if (d0Var != aVar) {
                return C(t0Var, cVar);
            }
            r1.this.f6725n.execute(new b());
            if (this.f6765b.get() != aVar) {
                return C(t0Var, cVar);
            }
            if (r1.this.H.get()) {
                return new c();
            }
            e eVar = new e(this, eb.p.b(), t0Var, cVar);
            r1.this.f6725n.execute(new d(eVar));
            return eVar;
        }
    }

    public static final class n implements ScheduledExecutorService {

        /* renamed from: a, reason: collision with root package name */
        public final ScheduledExecutorService f6781a;

        public n(ScheduledExecutorService scheduledExecutorService) {
            x6.b.y(scheduledExecutorService, "delegate");
            this.f6781a = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f6781a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f6781a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f6781a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return this.f6781a.invokeAll(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f6781a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return (T) this.f6781a.invokeAny(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f6781a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f6781a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f6781a.schedule(runnable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            return this.f6781a.schedule(callable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f6781a.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f6781a.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future<?> submit(Runnable runnable) {
            return this.f6781a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Runnable runnable, T t) {
            return this.f6781a.submit(runnable, t);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Callable<T> callable) {
            return this.f6781a.submit(callable);
        }
    }

    public final class o extends gb.e {

        /* renamed from: a, reason: collision with root package name */
        public final k0.b f6782a;

        /* renamed from: b, reason: collision with root package name */
        public final eb.f0 f6783b;

        /* renamed from: c, reason: collision with root package name */
        public final gb.n f6784c;

        /* renamed from: d, reason: collision with root package name */
        public final gb.p f6785d;

        /* renamed from: e, reason: collision with root package name */
        public List<eb.u> f6786e;
        public d1 f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6787g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f6788h;

        /* renamed from: i, reason: collision with root package name */
        public h1.c f6789i;

        public final class a extends d1.c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k0.k f6791a;

            public a(k0.k kVar) {
                this.f6791a = kVar;
            }
        }

        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                d1 d1Var = o.this.f;
                d1Var.f6262l.execute(new h1(d1Var, r1.f6706i0));
            }
        }

        public o(k0.b bVar) {
            this.f6786e = bVar.f5152a;
            Logger logger = r1.f6702e0;
            r1.this.getClass();
            this.f6782a = bVar;
            eb.f0 f0Var = new eb.f0(eb.f0.f5101d.incrementAndGet(), "Subchannel", r1.this.b());
            this.f6783b = f0Var;
            long a10 = r1.this.f6724m.a();
            StringBuilder l10 = defpackage.f.l("Subchannel for ");
            l10.append(bVar.f5152a);
            gb.p pVar = new gb.p(f0Var, a10, l10.toString());
            this.f6785d = pVar;
            this.f6784c = new gb.n(pVar, r1.this.f6724m);
        }

        @Override // eb.k0.i
        public final List<eb.u> b() {
            r1.this.f6725n.d();
            x6.b.I(this.f6787g, "not started");
            return this.f6786e;
        }

        @Override // eb.k0.i
        public final eb.a c() {
            return this.f6782a.f5153b;
        }

        @Override // eb.k0.i
        public final eb.d d() {
            return this.f6784c;
        }

        @Override // eb.k0.i
        public final Object e() {
            x6.b.I(this.f6787g, "Subchannel is not started");
            return this.f;
        }

        @Override // eb.k0.i
        public final void f() {
            r1.this.f6725n.d();
            x6.b.I(this.f6787g, "not started");
            this.f.a();
        }

        @Override // eb.k0.i
        public final void g() {
            h1.c cVar;
            r1.this.f6725n.d();
            if (this.f == null) {
                this.f6788h = true;
                return;
            }
            if (!this.f6788h) {
                this.f6788h = true;
            } else {
                if (!r1.this.J || (cVar = this.f6789i) == null) {
                    return;
                }
                cVar.a();
                this.f6789i = null;
            }
            r1 r1Var = r1.this;
            if (!r1Var.J) {
                this.f6789i = r1Var.f6725n.c(new p1(new b()), 5L, TimeUnit.SECONDS, r1.this.f6718g.p0());
            } else {
                d1 d1Var = this.f;
                d1Var.f6262l.execute(new h1(d1Var, r1.f6705h0));
            }
        }

        @Override // eb.k0.i
        public final void h(k0.k kVar) {
            r1.this.f6725n.d();
            x6.b.I(!this.f6787g, "already started");
            x6.b.I(!this.f6788h, "already shutdown");
            x6.b.I(!r1.this.J, "Channel is being terminated");
            this.f6787g = true;
            List<eb.u> list = this.f6782a.f5152a;
            String b10 = r1.this.b();
            r1.this.getClass();
            r1 r1Var = r1.this;
            j.a aVar = r1Var.t;
            gb.l lVar = r1Var.f6718g;
            ScheduledExecutorService p02 = lVar.p0();
            r1 r1Var2 = r1.this;
            d1 d1Var = new d1(list, b10, aVar, lVar, p02, r1Var2.f6728q, r1Var2.f6725n, new a(kVar), r1Var2.Q, new gb.m(r1Var2.M.f6813a), this.f6785d, this.f6783b, this.f6784c, r1.this.f6732v);
            r1 r1Var3 = r1.this;
            gb.p pVar = r1Var3.O;
            b0.a aVar2 = b0.a.CT_INFO;
            Long valueOf = Long.valueOf(r1Var3.f6724m.a());
            x6.b.y(valueOf, "timestampNanos");
            pVar.b(new eb.b0("Child Subchannel started", aVar2, valueOf.longValue(), d1Var));
            this.f = d1Var;
            eb.c0.a(r1.this.Q.f5057b, d1Var);
            r1.this.B.add(d1Var);
        }

        @Override // eb.k0.i
        public final void i(List<eb.u> list) {
            r1.this.f6725n.d();
            this.f6786e = list;
            r1.this.getClass();
            d1 d1Var = this.f;
            d1Var.getClass();
            Iterator<eb.u> it = list.iterator();
            while (it.hasNext()) {
                x6.b.y(it.next(), "newAddressGroups contains null entry");
            }
            x6.b.s("newAddressGroups is empty", !list.isEmpty());
            d1Var.f6262l.execute(new g1(d1Var, Collections.unmodifiableList(new ArrayList(list))));
        }

        public final String toString() {
            return this.f6783b.toString();
        }
    }

    public final class p {

        /* renamed from: a, reason: collision with root package name */
        public final Object f6794a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public HashSet f6795b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public eb.e1 f6796c;

        public p() {
        }

        public final void a(eb.e1 e1Var) {
            synchronized (this.f6794a) {
                if (this.f6796c != null) {
                    return;
                }
                this.f6796c = e1Var;
                boolean isEmpty = this.f6795b.isEmpty();
                if (isEmpty) {
                    r1.this.F.c(e1Var);
                }
            }
        }
    }

    static {
        eb.e1 e1Var = eb.e1.f5078n;
        f6704g0 = e1Var.g("Channel shutdownNow invoked");
        f6705h0 = e1Var.g("Channel shutdown invoked");
        f6706i0 = e1Var.g("Subchannel shutdown invoked");
        f6707j0 = new g2(null, new HashMap(), new HashMap(), null, null, null);
        f6708k0 = new a();
        f6709l0 = new d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [eb.g$b] */
    public r1(e2 e2Var, v vVar, k0.a aVar, j3 j3Var, v0.d dVar, ArrayList arrayList) {
        o3.a aVar2 = o3.f6622a;
        eb.h1 h1Var = new eb.h1(new c());
        this.f6725n = h1Var;
        this.f6730s = new y();
        this.B = new HashSet(16, 0.75f);
        this.D = new Object();
        this.E = new HashSet(1, 0.75f);
        this.G = new p();
        this.H = new AtomicBoolean(false);
        this.L = new CountDownLatch(1);
        this.S = 1;
        this.T = f6707j0;
        this.U = false;
        this.W = new y2.s();
        this.f6710a0 = eb.q.f5189d;
        g gVar = new g();
        this.f6712b0 = new i();
        this.f6714c0 = new e();
        String str = e2Var.f;
        x6.b.y(str, "target");
        this.f6713c = str;
        eb.f0 f0Var = new eb.f0(eb.f0.f5101d.incrementAndGet(), "Channel", str);
        this.f6711b = f0Var;
        this.f6724m = aVar2;
        j3 j3Var2 = e2Var.f6303a;
        x6.b.y(j3Var2, "executorPool");
        this.f6721j = j3Var2;
        Executor executor = (Executor) j3Var2.b();
        x6.b.y(executor, "executor");
        this.f6720i = executor;
        j3 j3Var3 = e2Var.f6304b;
        x6.b.y(j3Var3, "offloadExecutorPool");
        h hVar = new h(j3Var3);
        this.f6723l = hVar;
        gb.l lVar = new gb.l(vVar, e2Var.f6308g, hVar);
        this.f6718g = lVar;
        n nVar = new n(lVar.p0());
        this.f6719h = nVar;
        gb.p pVar = new gb.p(f0Var, aVar2.a(), defpackage.g.e("Channel for '", str, "'"));
        this.O = pVar;
        gb.n nVar2 = new gb.n(pVar, aVar2);
        this.P = nVar2;
        t2 t2Var = v0.f6839m;
        boolean z10 = e2Var.f6317p;
        this.Z = z10;
        gb.i iVar = new gb.i(e2Var.f6309h);
        this.f = iVar;
        eb.w0 w0Var = e2Var.f6306d;
        this.f6715d = w0Var;
        d3 d3Var = new d3(z10, e2Var.f6313l, e2Var.f6314m, iVar);
        Integer valueOf = Integer.valueOf(e2Var.f6325y.a());
        t2Var.getClass();
        u0.a aVar3 = new u0.a(valueOf, t2Var, h1Var, d3Var, nVar, nVar2, hVar, null);
        this.f6717e = aVar3;
        this.f6733w = N(str, w0Var, aVar3, lVar.y0());
        this.f6722k = new h(j3Var);
        f0 f0Var2 = new f0(executor, h1Var);
        this.F = f0Var2;
        f0Var2.g(gVar);
        this.t = aVar;
        this.V = e2Var.f6319r;
        m mVar = new m(this.f6733w.a());
        this.R = mVar;
        int i10 = eb.g.f5107a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mVar = new g.b(mVar, (eb.f) it.next());
        }
        this.f6731u = mVar;
        this.f6732v = new ArrayList(e2Var.f6307e);
        x6.b.y(dVar, "stopwatchSupplier");
        this.f6728q = dVar;
        long j10 = e2Var.f6312k;
        if (j10 != -1) {
            x6.b.m(j10, "invalid idleTimeoutMillis %s", j10 >= e2.B);
            j10 = e2Var.f6312k;
        }
        this.f6729r = j10;
        this.f6716d0 = new x2(new j(), this.f6725n, this.f6718g.p0(), new n7.p());
        eb.s sVar = e2Var.f6310i;
        x6.b.y(sVar, "decompressorRegistry");
        this.f6726o = sVar;
        eb.m mVar2 = e2Var.f6311j;
        x6.b.y(mVar2, "compressorRegistry");
        this.f6727p = mVar2;
        this.Y = e2Var.f6315n;
        this.X = e2Var.f6316o;
        this.M = new t1();
        this.N = new gb.m(o3.f6622a);
        eb.c0 c0Var = e2Var.f6318q;
        c0Var.getClass();
        this.Q = c0Var;
        eb.c0.a(c0Var.f5056a, this);
        if (this.V) {
            return;
        }
        this.U = true;
    }

    public static void I(r1 r1Var) {
        boolean z10 = true;
        r1Var.Q(true);
        r1Var.F.i(null);
        r1Var.P.a(d.a.INFO, "Entering IDLE state");
        r1Var.f6730s.a(eb.n.IDLE);
        i iVar = r1Var.f6712b0;
        Object[] objArr = {r1Var.D, r1Var.F};
        iVar.getClass();
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                z10 = false;
                break;
            } else if (iVar.f6207a.contains(objArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            r1Var.M();
        }
    }

    public static void J(r1 r1Var) {
        if (r1Var.I) {
            Iterator it = r1Var.B.iterator();
            while (it.hasNext()) {
                d1 d1Var = (d1) it.next();
                eb.e1 e1Var = f6704g0;
                d1Var.f6262l.execute(new h1(d1Var, e1Var));
                d1Var.f6262l.execute(new k1(d1Var, e1Var));
            }
            Iterator it2 = r1Var.E.iterator();
            if (it2.hasNext()) {
                ((n2) it2.next()).getClass();
                throw null;
            }
        }
    }

    public static void K(r1 r1Var) {
        if (!r1Var.K && r1Var.H.get() && r1Var.B.isEmpty() && r1Var.E.isEmpty()) {
            r1Var.P.a(d.a.INFO, "Terminated");
            eb.c0.b(r1Var.Q.f5056a, r1Var);
            r1Var.f6721j.a(r1Var.f6720i);
            h hVar = r1Var.f6722k;
            synchronized (hVar) {
                Executor executor = hVar.f6749b;
                if (executor != null) {
                    hVar.f6748a.a(executor);
                    hVar.f6749b = null;
                }
            }
            h hVar2 = r1Var.f6723l;
            synchronized (hVar2) {
                Executor executor2 = hVar2.f6749b;
                if (executor2 != null) {
                    hVar2.f6748a.a(executor2);
                    hVar2.f6749b = null;
                }
            }
            r1Var.f6718g.close();
            r1Var.K = true;
            r1Var.L.countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static gb.s0 N(java.lang.String r7, eb.w0 r8, eb.u0.a r9, java.util.Collection r10) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.r1.N(java.lang.String, eb.w0, eb.u0$a, java.util.Collection):gb.s0");
    }

    @Override // eb.n0
    public final boolean C(long j10, TimeUnit timeUnit) {
        return this.L.await(j10, timeUnit);
    }

    @Override // eb.n0
    public final void D() {
        this.f6725n.execute(new b());
    }

    @Override // eb.n0
    public final eb.n E() {
        eb.n nVar = this.f6730s.f6900b;
        if (nVar == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        if (nVar == eb.n.IDLE) {
            this.f6725n.execute(new w1(this));
        }
        return nVar;
    }

    @Override // eb.n0
    public final void F(eb.n nVar, x0.f fVar) {
        this.f6725n.execute(new u1(this, fVar, nVar));
    }

    @Override // eb.n0
    public final /* bridge */ /* synthetic */ eb.n0 G() {
        P();
        return this;
    }

    @Override // eb.n0
    public final eb.n0 H() {
        this.P.a(d.a.DEBUG, "shutdownNow() called");
        P();
        m mVar = this.R;
        r1.this.f6725n.execute(new d2(mVar));
        this.f6725n.execute(new y1(this));
        return this;
    }

    public final void L(boolean z10) {
        ScheduledFuture<?> scheduledFuture;
        x2 x2Var = this.f6716d0;
        x2Var.f = false;
        if (!z10 || (scheduledFuture = x2Var.f6896g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        x2Var.f6896g = null;
    }

    public final void M() {
        this.f6725n.d();
        if (this.H.get() || this.A) {
            return;
        }
        if (!this.f6712b0.f6207a.isEmpty()) {
            L(false);
        } else {
            O();
        }
        if (this.f6735y != null) {
            return;
        }
        this.P.a(d.a.INFO, "Exiting idle mode");
        k kVar = new k();
        gb.i iVar = this.f;
        iVar.getClass();
        kVar.f6752a = iVar.new a(kVar);
        this.f6735y = kVar;
        this.f6733w.d(new l(kVar, this.f6733w));
        this.f6734x = true;
    }

    public final void O() {
        long j10 = this.f6729r;
        if (j10 == -1) {
            return;
        }
        x2 x2Var = this.f6716d0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x2Var.getClass();
        long nanos = timeUnit.toNanos(j10);
        n7.p pVar = x2Var.f6894d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long a10 = pVar.a(timeUnit2) + nanos;
        x2Var.f = true;
        if (a10 - x2Var.f6895e < 0 || x2Var.f6896g == null) {
            ScheduledFuture<?> scheduledFuture = x2Var.f6896g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            x2Var.f6896g = x2Var.f6891a.schedule(x2Var.new b(), nanos, timeUnit2);
        }
        x2Var.f6895e = a10;
    }

    public final void P() {
        this.P.a(d.a.DEBUG, "shutdown() called");
        if (this.H.compareAndSet(false, true)) {
            this.f6725n.execute(new x1(this));
            m mVar = this.R;
            r1.this.f6725n.execute(new c2(mVar));
            this.f6725n.execute(new s1(this));
        }
    }

    public final void Q(boolean z10) {
        this.f6725n.d();
        if (z10) {
            x6.b.I(this.f6734x, "nameResolver is not started");
            x6.b.I(this.f6735y != null, "lbHelper is null");
        }
        s0 s0Var = this.f6733w;
        if (s0Var != null) {
            s0Var.c();
            this.f6734x = false;
            if (z10) {
                this.f6733w = N(this.f6713c, this.f6715d, this.f6717e, this.f6718g.y0());
            } else {
                this.f6733w = null;
            }
        }
        k kVar = this.f6735y;
        if (kVar != null) {
            i.a aVar = kVar.f6752a;
            aVar.f6468b.f();
            aVar.f6468b = null;
            this.f6735y = null;
        }
        this.f6736z = null;
    }

    @Override // e9.a
    public final String b() {
        return this.f6731u.b();
    }

    @Override // eb.e0
    public final eb.f0 f() {
        return this.f6711b;
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.b("logId", this.f6711b.f5104c);
        b10.a(this.f6713c, "target");
        return b10.toString();
    }

    @Override // e9.a
    public final <ReqT, RespT> eb.e<ReqT, RespT> v(eb.t0<ReqT, RespT> t0Var, eb.c cVar) {
        return this.f6731u.v(t0Var, cVar);
    }
}
