package gb;

import eb.h1;
import eb.k0;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.g;

/* loaded from: classes.dex */
public final class p2 extends eb.k0 {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f6628o = Logger.getLogger(p2.class.getName());
    public final k0.e f;

    /* renamed from: h, reason: collision with root package name */
    public c f6630h;

    /* renamed from: k, reason: collision with root package name */
    public h1.c f6633k;

    /* renamed from: l, reason: collision with root package name */
    public eb.n f6634l;

    /* renamed from: m, reason: collision with root package name */
    public eb.n f6635m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6636n;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f6629g = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f6631i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6632j = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            p2 p2Var = p2.this;
            p2Var.f6633k = null;
            if (p2Var.f6630h.b()) {
                p2.this.e();
            }
        }
    }

    public final class b implements k0.k {

        /* renamed from: a, reason: collision with root package name */
        public eb.o f6638a = eb.o.a(eb.n.IDLE);

        /* renamed from: b, reason: collision with root package name */
        public g f6639b;

        public b() {
        }

        @Override // eb.k0.k
        public final void a(eb.o oVar) {
            p2.f6628o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{oVar, this.f6639b.f6648a});
            this.f6638a = oVar;
            if (p2.this.f6630h.c()) {
                p2 p2Var = p2.this;
                if (((g) p2Var.f6629g.get(p2Var.f6630h.a())).f6650c == this) {
                    p2.this.j(this.f6639b);
                }
            }
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public List<eb.u> f6641a;

        /* renamed from: b, reason: collision with root package name */
        public int f6642b;

        /* renamed from: c, reason: collision with root package name */
        public int f6643c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
        public c(o7.l0 l0Var) {
            this.f6641a = l0Var == null ? Collections.emptyList() : l0Var;
        }

        public final SocketAddress a() {
            if (c()) {
                return this.f6641a.get(this.f6642b).f5234a.get(this.f6643c);
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        public final boolean b() {
            if (!c()) {
                return false;
            }
            eb.u uVar = this.f6641a.get(this.f6642b);
            int i10 = this.f6643c + 1;
            this.f6643c = i10;
            if (i10 < uVar.f5234a.size()) {
                return true;
            }
            int i11 = this.f6642b + 1;
            this.f6642b = i11;
            this.f6643c = 0;
            return i11 < this.f6641a.size();
        }

        public final boolean c() {
            return this.f6642b < this.f6641a.size();
        }

        public final boolean d(SocketAddress socketAddress) {
            for (int i10 = 0; i10 < this.f6641a.size(); i10++) {
                int indexOf = this.f6641a.get(i10).f5234a.indexOf(socketAddress);
                if (indexOf != -1) {
                    this.f6642b = i10;
                    this.f6643c = indexOf;
                    return true;
                }
            }
            return false;
        }
    }

    public static final class d {
    }

    public static final class e extends k0.j {

        /* renamed from: a, reason: collision with root package name */
        public final k0.f f6644a;

        public e(k0.f fVar) {
            x6.b.y(fVar, "result");
            this.f6644a = fVar;
        }

        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            return this.f6644a;
        }

        public final String toString() {
            g.a aVar = new g.a(e.class.getSimpleName());
            aVar.a(this.f6644a, "result");
            return aVar.toString();
        }
    }

    public final class f extends k0.j {

        /* renamed from: a, reason: collision with root package name */
        public final p2 f6645a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f6646b = new AtomicBoolean(false);

        public f(p2 p2Var) {
            x6.b.y(p2Var, "pickFirstLeafLoadBalancer");
            this.f6645a = p2Var;
        }

        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            if (this.f6646b.compareAndSet(false, true)) {
                eb.h1 d10 = p2.this.f.d();
                p2 p2Var = this.f6645a;
                Objects.requireNonNull(p2Var);
                d10.execute(new b.k(p2Var, 18));
            }
            return k0.f.f5160e;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final k0.i f6648a;

        /* renamed from: b, reason: collision with root package name */
        public eb.n f6649b;

        /* renamed from: c, reason: collision with root package name */
        public final b f6650c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6651d;

        public g(k0.i iVar, b bVar) {
            eb.n nVar = eb.n.IDLE;
            this.f6651d = false;
            this.f6648a = iVar;
            this.f6649b = nVar;
            this.f6650c = bVar;
        }

        public static void a(g gVar, eb.n nVar) {
            boolean z10;
            gVar.f6649b = nVar;
            if (nVar == eb.n.READY || nVar == eb.n.TRANSIENT_FAILURE) {
                z10 = true;
            } else if (nVar != eb.n.IDLE) {
                return;
            } else {
                z10 = false;
            }
            gVar.f6651d = z10;
        }
    }

    public p2(k0.e eVar) {
        boolean z10 = false;
        eb.n nVar = eb.n.IDLE;
        this.f6634l = nVar;
        this.f6635m = nVar;
        Logger logger = v0.f6828a;
        String str = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        str = str == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : str;
        if (!n7.i.a(str) && Boolean.parseBoolean(str)) {
            z10 = true;
        }
        this.f6636n = z10;
        x6.b.y(eVar, "helper");
        this.f = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
    
        if (r7 == eb.n.TRANSIENT_FAILURE) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // eb.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final eb.e1 a(eb.k0.h r7) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.p2.a(eb.k0$h):eb.e1");
    }

    @Override // eb.k0
    public final void c(eb.e1 e1Var) {
        Iterator it = this.f6629g.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).f6648a.g();
        }
        this.f6629g.clear();
        i(eb.n.TRANSIENT_FAILURE, new e(k0.f.a(e1Var)));
    }

    @Override // eb.k0
    public final void e() {
        k0.i iVar;
        c cVar = this.f6630h;
        if (cVar == null || !cVar.c() || this.f6634l == eb.n.SHUTDOWN) {
            return;
        }
        SocketAddress a10 = this.f6630h.a();
        if (this.f6629g.containsKey(a10)) {
            iVar = ((g) this.f6629g.get(a10)).f6648a;
        } else {
            b bVar = new b();
            k0.e eVar = this.f;
            k0.b.a aVar = new k0.b.a();
            aVar.b(o7.c0.c(new eb.u(a10)));
            aVar.a(bVar);
            final k0.i a11 = eVar.a(new k0.b(aVar.f5155a, aVar.f5156b, aVar.f5157c));
            if (a11 == null) {
                f6628o.warning("Was not able to create subchannel for " + a10);
                throw new IllegalStateException("Can't create subchannel");
            }
            g gVar = new g(a11, bVar);
            bVar.f6639b = gVar;
            this.f6629g.put(a10, gVar);
            if (a11.c().a(eb.k0.f5149d) == null) {
                bVar.f6638a = eb.o.a(eb.n.READY);
            }
            a11.h(new k0.k() { // from class: gb.o2
                /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
                @Override // eb.k0.k
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a(eb.o r10) {
                    /*
                        Method dump skipped, instructions count: 393
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gb.o2.a(eb.o):void");
                }
            });
            iVar = a11;
        }
        int ordinal = ((g) this.f6629g.get(a10)).f6649b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                f6628o.warning("Requesting a connection even though we have a READY subchannel");
                return;
            }
            if (ordinal == 2) {
                this.f6630h.b();
                e();
                return;
            } else {
                if (ordinal != 3) {
                    return;
                }
                iVar.f();
                g.a((g) this.f6629g.get(a10), eb.n.CONNECTING);
            }
        } else if (!this.f6636n) {
            iVar.f();
            return;
        }
        h();
    }

    @Override // eb.k0
    public final void f() {
        f6628o.log(Level.FINE, "Shutting down, currently have {} subchannels created", Integer.valueOf(this.f6629g.size()));
        eb.n nVar = eb.n.SHUTDOWN;
        this.f6634l = nVar;
        this.f6635m = nVar;
        g();
        Iterator it = this.f6629g.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).f6648a.g();
        }
        this.f6629g.clear();
    }

    public final void g() {
        h1.c cVar = this.f6633k;
        if (cVar != null) {
            cVar.a();
            this.f6633k = null;
        }
    }

    public final void h() {
        if (this.f6636n) {
            h1.c cVar = this.f6633k;
            if (cVar != null) {
                h1.b bVar = cVar.f5127a;
                if ((bVar.f5126c || bVar.f5125b) ? false : true) {
                    return;
                }
            }
            this.f6633k = this.f.d().c(new a(), 250L, TimeUnit.MILLISECONDS, this.f.c());
        }
    }

    public final void i(eb.n nVar, k0.j jVar) {
        if (nVar == this.f6635m && (nVar == eb.n.IDLE || nVar == eb.n.CONNECTING)) {
            return;
        }
        this.f6635m = nVar;
        this.f.f(nVar, jVar);
    }

    public final void j(g gVar) {
        eb.n nVar = gVar.f6649b;
        eb.n nVar2 = eb.n.READY;
        if (nVar != nVar2) {
            return;
        }
        eb.o oVar = gVar.f6650c.f6638a;
        eb.n nVar3 = oVar.f5184a;
        if (nVar3 == nVar2) {
            i(nVar2, new k0.d(k0.f.b(gVar.f6648a, null)));
            return;
        }
        eb.n nVar4 = eb.n.TRANSIENT_FAILURE;
        if (nVar3 == nVar4) {
            i(nVar4, new e(k0.f.a(oVar.f5185b)));
        } else if (this.f6635m != nVar4) {
            i(nVar3, new e(k0.f.f5160e));
        }
    }
}
