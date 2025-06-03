package gb;

import eb.d;
import eb.h1;
import gb.h2;
import gb.j;
import gb.k0;
import gb.r1;
import gb.t;
import gb.v;
import java.net.SocketAddress;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import n7.g;

/* loaded from: classes.dex */
public final class d1 implements eb.e0<Object>, q3 {

    /* renamed from: a, reason: collision with root package name */
    public final eb.f0 f6252a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6253b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6254c;

    /* renamed from: d, reason: collision with root package name */
    public final j.a f6255d;

    /* renamed from: e, reason: collision with root package name */
    public final c f6256e;
    public final v f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f6257g;

    /* renamed from: h, reason: collision with root package name */
    public final eb.c0 f6258h;

    /* renamed from: i, reason: collision with root package name */
    public final m f6259i;

    /* renamed from: j, reason: collision with root package name */
    public final eb.d f6260j;

    /* renamed from: k, reason: collision with root package name */
    public final List<eb.i> f6261k;

    /* renamed from: l, reason: collision with root package name */
    public final eb.h1 f6262l;

    /* renamed from: m, reason: collision with root package name */
    public final d f6263m;

    /* renamed from: n, reason: collision with root package name */
    public volatile List<eb.u> f6264n;

    /* renamed from: o, reason: collision with root package name */
    public j f6265o;

    /* renamed from: p, reason: collision with root package name */
    public final n7.p f6266p;

    /* renamed from: q, reason: collision with root package name */
    public h1.c f6267q;

    /* renamed from: r, reason: collision with root package name */
    public h1.c f6268r;

    /* renamed from: s, reason: collision with root package name */
    public h2 f6269s;

    /* renamed from: v, reason: collision with root package name */
    public x f6271v;

    /* renamed from: w, reason: collision with root package name */
    public volatile h2 f6272w;

    /* renamed from: y, reason: collision with root package name */
    public eb.e1 f6274y;
    public final ArrayList t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final a f6270u = new a();

    /* renamed from: x, reason: collision with root package name */
    public volatile eb.o f6273x = eb.o.a(eb.n.IDLE);

    public class a extends c1<x> {
        public a() {
        }

        @Override // gb.c1
        public final void a() {
            d1 d1Var = d1.this;
            r1.this.f6712b0.c(d1Var, true);
        }

        @Override // gb.c1
        public final void b() {
            d1 d1Var = d1.this;
            r1.this.f6712b0.c(d1Var, false);
        }
    }

    public static final class b extends p0 {

        /* renamed from: a, reason: collision with root package name */
        public final x f6276a;

        /* renamed from: b, reason: collision with root package name */
        public final m f6277b;

        public class a extends n0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f6278a;

            /* renamed from: gb.d1$b$a$a, reason: collision with other inner class name */
            public class C0099a extends o0 {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ t f6280a;

                public C0099a(t tVar) {
                    this.f6280a = tVar;
                }

                @Override // gb.t
                public final void d(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
                    m mVar = b.this.f6277b;
                    (e1Var.e() ? mVar.f6597c : mVar.f6598d).b();
                    this.f6280a.d(e1Var, aVar, s0Var);
                }
            }

            public a(s sVar) {
                this.f6278a = sVar;
            }

            @Override // gb.s
            public final void l(t tVar) {
                m mVar = b.this.f6277b;
                mVar.f6596b.b();
                mVar.f6595a.a();
                this.f6278a.l(new C0099a(tVar));
            }
        }

        public b(x xVar, m mVar) {
            this.f6276a = xVar;
            this.f6277b = mVar;
        }

        @Override // gb.p0
        public final x a() {
            return this.f6276a;
        }

        @Override // gb.u
        public final s d(eb.t0<?, ?> t0Var, eb.s0 s0Var, eb.c cVar, eb.h[] hVarArr) {
            return new a(a().d(t0Var, s0Var, cVar, hVarArr));
        }
    }

    public static abstract class c {
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public List<eb.u> f6282a;

        /* renamed from: b, reason: collision with root package name */
        public int f6283b;

        /* renamed from: c, reason: collision with root package name */
        public int f6284c;

        public d(List<eb.u> list) {
            this.f6282a = list;
        }

        public final void a() {
            this.f6283b = 0;
            this.f6284c = 0;
        }
    }

    public class e implements h2.a {

        /* renamed from: a, reason: collision with root package name */
        public final x f6285a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6286b = false;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                d1 d1Var = d1.this;
                d1Var.f6265o = null;
                if (d1Var.f6274y != null) {
                    x6.b.I(d1Var.f6272w == null, "Unexpected non-null activeTransport");
                    e eVar2 = e.this;
                    eVar2.f6285a.c(d1.this.f6274y);
                    return;
                }
                x xVar = d1Var.f6271v;
                x xVar2 = eVar.f6285a;
                if (xVar == xVar2) {
                    d1Var.f6272w = xVar2;
                    d1 d1Var2 = d1.this;
                    d1Var2.f6271v = null;
                    d1.b(d1Var2, eb.n.READY);
                }
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ eb.e1 f6289a;

            public b(eb.e1 e1Var) {
                this.f6289a = e1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (d1.this.f6273x.f5184a == eb.n.SHUTDOWN) {
                    return;
                }
                h2 h2Var = d1.this.f6272w;
                e eVar = e.this;
                x xVar = eVar.f6285a;
                if (h2Var == xVar) {
                    d1.this.f6272w = null;
                    d1.this.f6263m.a();
                    d1.b(d1.this, eb.n.IDLE);
                    return;
                }
                d1 d1Var = d1.this;
                if (d1Var.f6271v == xVar) {
                    x6.b.G(d1.this.f6273x.f5184a, "Expected state is CONNECTING, actual state is %s", d1Var.f6273x.f5184a == eb.n.CONNECTING);
                    d dVar = d1.this.f6263m;
                    eb.u uVar = dVar.f6282a.get(dVar.f6283b);
                    int i10 = dVar.f6284c + 1;
                    dVar.f6284c = i10;
                    if (i10 >= uVar.f5234a.size()) {
                        dVar.f6283b++;
                        dVar.f6284c = 0;
                    }
                    d dVar2 = d1.this.f6263m;
                    if (dVar2.f6283b < dVar2.f6282a.size()) {
                        d1.i(d1.this);
                        return;
                    }
                    d1 d1Var2 = d1.this;
                    d1Var2.f6271v = null;
                    d1Var2.f6263m.a();
                    d1 d1Var3 = d1.this;
                    eb.e1 e1Var = this.f6289a;
                    d1Var3.f6262l.d();
                    x6.b.s("The error status must not be OK", !e1Var.e());
                    d1Var3.j(new eb.o(eb.n.TRANSIENT_FAILURE, e1Var));
                    if (d1Var3.f6265o == null) {
                        ((k0.a) d1Var3.f6255d).getClass();
                        d1Var3.f6265o = new k0();
                    }
                    long a10 = ((k0) d1Var3.f6265o).a();
                    n7.p pVar = d1Var3.f6266p;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a11 = a10 - pVar.a(timeUnit);
                    d1Var3.f6260j.b(d.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", d1.k(e1Var), Long.valueOf(a11));
                    x6.b.I(d1Var3.f6267q == null, "previous reconnectTask is not done");
                    d1Var3.f6267q = d1Var3.f6262l.c(new e1(d1Var3), a11, timeUnit, d1Var3.f6257g);
                }
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                d1.this.t.remove(eVar.f6285a);
                if (d1.this.f6273x.f5184a == eb.n.SHUTDOWN && d1.this.t.isEmpty()) {
                    d1 d1Var = d1.this;
                    d1Var.f6262l.execute(new i1(d1Var));
                }
            }
        }

        public e(b bVar) {
            this.f6285a = bVar;
        }

        @Override // gb.h2.a
        public final void a(eb.e1 e1Var) {
            eb.d dVar = d1.this.f6260j;
            d.a aVar = d.a.INFO;
            d1.this.getClass();
            dVar.b(aVar, "{0} SHUTDOWN with {1}", this.f6285a.f(), d1.k(e1Var));
            this.f6286b = true;
            d1.this.f6262l.execute(new b(e1Var));
        }

        @Override // gb.h2.a
        public final void b() {
            d1.this.f6260j.a(d.a.INFO, "READY");
            d1.this.f6262l.execute(new a());
        }

        @Override // gb.h2.a
        public final eb.a c(eb.a aVar) {
            for (eb.i iVar : d1.this.f6261k) {
                iVar.getClass();
                x6.b.z("Filter %s returned null", aVar, iVar);
            }
            return aVar;
        }

        @Override // gb.h2.a
        public final void d() {
            x6.b.I(this.f6286b, "transportShutdown() must be called before transportTerminated().");
            d1.this.f6260j.b(d.a.INFO, "{0} Terminated", this.f6285a.f());
            eb.c0.b(d1.this.f6258h.f5058c, this.f6285a);
            d1 d1Var = d1.this;
            d1Var.f6262l.execute(new j1(d1Var, this.f6285a, false));
            for (eb.i iVar : d1.this.f6261k) {
                this.f6285a.getAttributes();
                iVar.getClass();
            }
            d1.this.f6262l.execute(new c());
        }

        @Override // gb.h2.a
        public final void e(boolean z10) {
            d1 d1Var = d1.this;
            d1Var.f6262l.execute(new j1(d1Var, this.f6285a, z10));
        }
    }

    public static final class f extends eb.d {

        /* renamed from: a, reason: collision with root package name */
        public eb.f0 f6292a;

        @Override // eb.d
        public final void a(d.a aVar, String str) {
            eb.f0 f0Var = this.f6292a;
            Level c10 = n.c(aVar);
            if (p.f6623c.isLoggable(c10)) {
                p.a(f0Var, c10, str);
            }
        }

        @Override // eb.d
        public final void b(d.a aVar, String str, Object... objArr) {
            eb.f0 f0Var = this.f6292a;
            Level c10 = n.c(aVar);
            if (p.f6623c.isLoggable(c10)) {
                p.a(f0Var, c10, MessageFormat.format(str, objArr));
            }
        }
    }

    public d1(List list, String str, j.a aVar, l lVar, ScheduledExecutorService scheduledExecutorService, n7.q qVar, eb.h1 h1Var, r1.o.a aVar2, eb.c0 c0Var, m mVar, p pVar, eb.f0 f0Var, n nVar, ArrayList arrayList) {
        x6.b.y(list, "addressGroups");
        x6.b.s("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x6.b.y(it.next(), "addressGroups contains null entry");
        }
        List<eb.u> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f6264n = unmodifiableList;
        this.f6263m = new d(unmodifiableList);
        this.f6253b = str;
        this.f6254c = null;
        this.f6255d = aVar;
        this.f = lVar;
        this.f6257g = scheduledExecutorService;
        this.f6266p = (n7.p) qVar.get();
        this.f6262l = h1Var;
        this.f6256e = aVar2;
        this.f6258h = c0Var;
        this.f6259i = mVar;
        x6.b.y(pVar, "channelTracer");
        x6.b.y(f0Var, "logId");
        this.f6252a = f0Var;
        x6.b.y(nVar, "channelLogger");
        this.f6260j = nVar;
        this.f6261k = arrayList;
    }

    public static void b(d1 d1Var, eb.n nVar) {
        d1Var.f6262l.d();
        d1Var.j(eb.o.a(nVar));
    }

    public static void i(d1 d1Var) {
        d1Var.f6262l.d();
        x6.b.I(d1Var.f6267q == null, "Should have no reconnectTask scheduled");
        d dVar = d1Var.f6263m;
        if (dVar.f6283b == 0 && dVar.f6284c == 0) {
            n7.p pVar = d1Var.f6266p;
            pVar.f11309b = false;
            pVar.b();
        }
        d dVar2 = d1Var.f6263m;
        SocketAddress socketAddress = dVar2.f6282a.get(dVar2.f6283b).f5234a.get(dVar2.f6284c);
        eb.a0 a0Var = null;
        if (socketAddress instanceof eb.a0) {
            a0Var = (eb.a0) socketAddress;
            socketAddress = a0Var.f5019b;
        }
        d dVar3 = d1Var.f6263m;
        eb.a aVar = dVar3.f6282a.get(dVar3.f6283b).f5235b;
        String str = (String) aVar.a(eb.u.f5233d);
        v.a aVar2 = new v.a();
        if (str == null) {
            str = d1Var.f6253b;
        }
        x6.b.y(str, "authority");
        aVar2.f6824a = str;
        aVar2.f6825b = aVar;
        aVar2.f6826c = d1Var.f6254c;
        aVar2.f6827d = a0Var;
        f fVar = new f();
        fVar.f6292a = d1Var.f6252a;
        b bVar = new b(d1Var.f.W(socketAddress, aVar2, fVar), d1Var.f6259i);
        fVar.f6292a = bVar.f();
        eb.c0.a(d1Var.f6258h.f5058c, bVar);
        d1Var.f6271v = bVar;
        d1Var.t.add(bVar);
        Runnable g10 = bVar.g(d1Var.new e(bVar));
        if (g10 != null) {
            d1Var.f6262l.b(g10);
        }
        d1Var.f6260j.b(d.a.INFO, "Started transport {0}", fVar.f6292a);
    }

    public static String k(eb.e1 e1Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e1Var.f5081a);
        if (e1Var.f5082b != null) {
            sb2.append("(");
            sb2.append(e1Var.f5082b);
            sb2.append(")");
        }
        if (e1Var.f5083c != null) {
            sb2.append("[");
            sb2.append(e1Var.f5083c);
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // gb.q3
    public final h2 a() {
        h2 h2Var = this.f6272w;
        if (h2Var != null) {
            return h2Var;
        }
        this.f6262l.execute(new f1(this));
        return null;
    }

    @Override // eb.e0
    public final eb.f0 f() {
        return this.f6252a;
    }

    public final void j(eb.o oVar) {
        this.f6262l.d();
        if (this.f6273x.f5184a != oVar.f5184a) {
            x6.b.I(this.f6273x.f5184a != eb.n.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + oVar);
            this.f6273x = oVar;
            r1.o.a aVar = (r1.o.a) this.f6256e;
            x6.b.I(aVar.f6791a != null, "listener is null");
            aVar.f6791a.a(oVar);
        }
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.b("logId", this.f6252a.f5104c);
        b10.a(this.f6264n, "addressGroups");
        return b10.toString();
    }
}
