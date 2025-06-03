package V3;

import Q3.e;
import Q3.r;
import T3.h;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import V3.A;
import V3.m;
import V3.u;
import V3.x;
import Y3.k;
import a4.C0751g;
import c4.C0851c;
import d4.C1227b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class m implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final V3.p f6545a;

    /* renamed from: c, reason: collision with root package name */
    public T3.h f6547c;

    /* renamed from: d, reason: collision with root package name */
    public V3.t f6548d;

    /* renamed from: e, reason: collision with root package name */
    public V3.u f6549e;

    /* renamed from: f, reason: collision with root package name */
    public Y3.k f6550f;

    /* renamed from: h, reason: collision with root package name */
    public final C0751g f6552h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0667f f6553i;

    /* renamed from: j, reason: collision with root package name */
    public final C0851c f6554j;

    /* renamed from: k, reason: collision with root package name */
    public final C0851c f6555k;

    /* renamed from: l, reason: collision with root package name */
    public final C0851c f6556l;

    /* renamed from: o, reason: collision with root package name */
    public V3.x f6559o;

    /* renamed from: p, reason: collision with root package name */
    public V3.x f6560p;

    /* renamed from: q, reason: collision with root package name */
    public Q3.h f6561q;

    /* renamed from: b, reason: collision with root package name */
    public final Y3.f f6546b = new Y3.f(new Y3.b(), 0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f6551g = false;

    /* renamed from: m, reason: collision with root package name */
    public long f6557m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f6558n = 1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6562r = false;

    /* renamed from: s, reason: collision with root package name */
    public long f6563s = 0;

    public enum A {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    /* renamed from: V3.m$a, reason: case insensitive filesystem */
    public class C0670a implements T3.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V3.k f6571a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f6572b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e.InterfaceC0084e f6573c;

        public C0670a(V3.k kVar, long j7, e.InterfaceC0084e interfaceC0084e) {
            this.f6571a = kVar;
            this.f6572b = j7;
            this.f6573c = interfaceC0084e;
        }

        @Override // T3.p
        public void a(String str, String str2) {
            Q3.c I6 = m.I(str, str2);
            m.this.q0("updateChildren", this.f6571a, I6);
            m.this.C(this.f6572b, this.f6571a, I6);
            m.this.G(this.f6573c, I6, this.f6571a);
        }
    }

    public class b implements T3.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V3.k f6575a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d4.n f6576b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e.InterfaceC0084e f6577c;

        public b(V3.k kVar, d4.n nVar, e.InterfaceC0084e interfaceC0084e) {
            this.f6575a = kVar;
            this.f6576b = nVar;
            this.f6577c = interfaceC0084e;
        }

        @Override // T3.p
        public void a(String str, String str2) {
            Q3.c I6 = m.I(str, str2);
            m.this.q0("onDisconnect().setValue", this.f6575a, I6);
            if (I6 == null) {
                m.this.f6549e.d(this.f6575a, this.f6576b);
            }
            m.this.G(this.f6577c, I6, this.f6575a);
        }
    }

    public class c implements T3.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V3.k f6579a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f6580b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e.InterfaceC0084e f6581c;

        public c(V3.k kVar, Map map, e.InterfaceC0084e interfaceC0084e) {
            this.f6579a = kVar;
            this.f6580b = map;
            this.f6581c = interfaceC0084e;
        }

        @Override // T3.p
        public void a(String str, String str2) {
            Q3.c I6 = m.I(str, str2);
            m.this.q0("onDisconnect().updateChildren", this.f6579a, I6);
            if (I6 == null) {
                for (Map.Entry entry : this.f6580b.entrySet()) {
                    m.this.f6549e.d(this.f6579a.T((V3.k) entry.getKey()), (d4.n) entry.getValue());
                }
            }
            m.this.G(this.f6581c, I6, this.f6579a);
        }
    }

    public class d implements T3.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V3.k f6583a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e.InterfaceC0084e f6584b;

        public d(V3.k kVar, e.InterfaceC0084e interfaceC0084e) {
            this.f6583a = kVar;
            this.f6584b = interfaceC0084e;
        }

        @Override // T3.p
        public void a(String str, String str2) {
            Q3.c I6 = m.I(str, str2);
            if (I6 == null) {
                m.this.f6549e.c(this.f6583a);
            }
            m.this.G(this.f6584b, I6, this.f6583a);
        }
    }

    public class e implements u.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f6586a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f6587b;

        public e(Map map, List list) {
            this.f6586a = map;
            this.f6587b = list;
        }

        @Override // V3.u.d
        public void a(V3.k kVar, d4.n nVar) {
            this.f6587b.addAll(m.this.f6560p.A(kVar, V3.s.i(nVar, m.this.f6560p.J(kVar, new ArrayList()), this.f6586a)));
            m.this.d0(m.this.g(kVar, -9));
        }
    }

    public class g implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ r.b f6590o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Q3.c f6591p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Q3.b f6592q;

        public g(r.b bVar, Q3.c cVar, Q3.b bVar2) {
            this.f6590o = bVar;
            this.f6591p = cVar;
            this.f6592q = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6590o.b(this.f6591p, false, this.f6592q);
        }
    }

    public class h implements k.c {
        public h() {
        }

        @Override // Y3.k.c
        public void a(Y3.k kVar) {
            m.this.k0(kVar);
        }
    }

    public class i implements T3.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V3.k f6595a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f6596b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f6597c;

        public class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ z f6599o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Q3.b f6600p;

            public a(z zVar, Q3.b bVar) {
                this.f6599o = zVar;
                this.f6600p = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6599o.f6643p.b(null, true, this.f6600p);
            }
        }

        public i(V3.k kVar, List list, m mVar) {
            this.f6595a = kVar;
            this.f6596b = list;
            this.f6597c = mVar;
        }

        @Override // T3.p
        public void a(String str, String str2) {
            Q3.c I6 = m.I(str, str2);
            m.this.q0("Transaction", this.f6595a, I6);
            ArrayList arrayList = new ArrayList();
            if (I6 != null) {
                if (I6.f() == -1) {
                    for (z zVar : this.f6596b) {
                        zVar.f6645r = zVar.f6645r == A.SENT_NEEDS_ABORT ? A.NEEDS_ABORT : A.RUN;
                    }
                } else {
                    for (z zVar2 : this.f6596b) {
                        zVar2.f6645r = A.NEEDS_ABORT;
                        zVar2.f6649v = I6;
                    }
                }
                m.this.d0(this.f6595a);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (z zVar3 : this.f6596b) {
                zVar3.f6645r = A.COMPLETED;
                arrayList.addAll(m.this.f6560p.s(zVar3.f6650w, false, false, m.this.f6546b));
                arrayList2.add(new a(zVar3, Q3.k.a(Q3.k.c(this.f6597c, zVar3.f6642o), d4.i.d(zVar3.f6653z))));
                m mVar = m.this;
                mVar.b0(new D(mVar, zVar3.f6644q, a4.i.a(zVar3.f6642o)));
            }
            m mVar2 = m.this;
            mVar2.Z(mVar2.f6550f.k(this.f6595a));
            m.this.j0();
            this.f6597c.Y(arrayList);
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                m.this.X((Runnable) arrayList2.get(i7));
            }
        }
    }

    public class j implements k.c {
        public j() {
        }

        @Override // Y3.k.c
        public void a(Y3.k kVar) {
            m.this.Z(kVar);
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.H();
        }
    }

    public class l implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ z f6604o;

        public l(z zVar) {
            this.f6604o = zVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            mVar.b0(new D(mVar, this.f6604o.f6644q, a4.i.a(this.f6604o.f6642o)));
        }
    }

    /* renamed from: V3.m$m, reason: collision with other inner class name */
    public class RunnableC0111m implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ z f6606o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Q3.c f6607p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Q3.b f6608q;

        public RunnableC0111m(z zVar, Q3.c cVar, Q3.b bVar) {
            this.f6606o = zVar;
            this.f6607p = cVar;
            this.f6608q = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6606o.f6643p.b(this.f6607p, false, this.f6608q);
        }
    }

    public class n implements k.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f6610a;

        public n(List list) {
            this.f6610a = list;
        }

        @Override // Y3.k.c
        public void a(Y3.k kVar) {
            m.this.E(this.f6610a, kVar);
        }
    }

    public class o implements k.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6612a;

        public o(int i7) {
            this.f6612a = i7;
        }

        @Override // Y3.k.b
        public boolean a(Y3.k kVar) {
            m.this.h(kVar, this.f6612a);
            return false;
        }
    }

    public class p implements k.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6614a;

        public p(int i7) {
            this.f6614a = i7;
        }

        @Override // Y3.k.c
        public void a(Y3.k kVar) {
            m.this.h(kVar, this.f6614a);
        }
    }

    public class q implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ z f6616o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Q3.c f6617p;

        public q(z zVar, Q3.c cVar) {
            this.f6616o = zVar;
            this.f6617p = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6616o.f6643p.b(this.f6617p, false, null);
        }
    }

    public class r implements A.b {
        public r() {
        }
    }

    public class s implements A.b {
        public s() {
        }
    }

    public class u implements x.s {

        public class a implements T3.p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x.p f6626a;

            public a(x.p pVar) {
                this.f6626a = pVar;
            }

            @Override // T3.p
            public void a(String str, String str2) {
                m.this.Y(this.f6626a.a(m.I(str, str2)));
            }
        }

        public u() {
        }

        @Override // V3.x.s
        public void a(a4.i iVar, V3.y yVar) {
            m.this.f6547c.l(iVar.e().S(), iVar.d().k());
        }

        @Override // V3.x.s
        public void b(a4.i iVar, V3.y yVar, T3.g gVar, x.p pVar) {
            m.this.f6547c.k(iVar.e().S(), iVar.d().k(), gVar, yVar != null ? Long.valueOf(yVar.a()) : null, new a(pVar));
        }
    }

    public class v implements T3.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B f6628a;

        public v(B b7) {
            this.f6628a = b7;
        }

        @Override // T3.p
        public void a(String str, String str2) {
            Q3.c I6 = m.I(str, str2);
            m.this.q0("Persisted write", this.f6628a.c(), I6);
            m.this.C(this.f6628a.d(), this.f6628a.c(), I6);
        }
    }

    public class w implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ e.InterfaceC0084e f6630o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Q3.c f6631p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Q3.e f6632q;

        public w(e.InterfaceC0084e interfaceC0084e, Q3.c cVar, Q3.e eVar) {
            this.f6630o = interfaceC0084e;
            this.f6631p = cVar;
            this.f6632q = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6630o.a(this.f6631p, this.f6632q);
        }
    }

    public class x implements T3.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V3.k f6634a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f6635b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e.InterfaceC0084e f6636c;

        public x(V3.k kVar, long j7, e.InterfaceC0084e interfaceC0084e) {
            this.f6634a = kVar;
            this.f6635b = j7;
            this.f6636c = interfaceC0084e;
        }

        @Override // T3.p
        public void a(String str, String str2) {
            Q3.c I6 = m.I(str, str2);
            m.this.q0("setValue", this.f6634a, I6);
            m.this.C(this.f6635b, this.f6634a, I6);
            m.this.G(this.f6636c, I6, this.f6634a);
        }
    }

    public class y implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Q3.p f6638o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C0660k f6639p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ m f6640q;

        public y(Q3.p pVar, C0660k c0660k, m mVar) {
            this.f6638o = pVar;
            this.f6639p = c0660k;
            this.f6640q = mVar;
        }

        public final /* synthetic */ void d(C0660k c0660k, Q3.b bVar, Q3.p pVar, m mVar, AbstractC0659j abstractC0659j) {
            if (c0660k.a().m()) {
                return;
            }
            if (abstractC0659j.n()) {
                d4.n a7 = d4.o.a(abstractC0659j.j());
                a4.i u7 = pVar.u();
                m.this.R(u7, true, true);
                mVar.Y(u7.g() ? m.this.f6560p.A(u7.e(), a7) : m.this.f6560p.F(u7.e(), a7, m.this.N().b0(u7)));
                c0660k.c(Q3.k.a(pVar.t(), d4.i.f(a7, pVar.u().c())));
                m.this.R(u7, false, true);
                return;
            }
            if (bVar.b()) {
                c0660k.c(bVar);
                return;
            }
            Exception i7 = abstractC0659j.i();
            Objects.requireNonNull(i7);
            c0660k.b(i7);
        }

        @Override // java.lang.Runnable
        public void run() {
            d4.n N6 = m.this.f6560p.N(this.f6638o.u());
            if (N6 != null) {
                this.f6639p.c(Q3.k.a(this.f6638o.t(), d4.i.d(N6)));
                return;
            }
            m.this.f6560p.Z(this.f6638o.u());
            final Q3.b Q6 = m.this.f6560p.Q(this.f6638o);
            if (Q6.b()) {
                m mVar = m.this;
                final C0660k c0660k = this.f6639p;
                mVar.h0(new Runnable() { // from class: V3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0660k.this.e(Q6);
                    }
                }, 3000L);
            }
            AbstractC0659j d7 = m.this.f6547c.d(this.f6638o.s().S(), this.f6638o.u().d().k());
            ScheduledExecutorService d8 = ((Y3.c) m.this.f6553i.v()).d();
            final C0660k c0660k2 = this.f6639p;
            final Q3.p pVar = this.f6638o;
            final m mVar2 = this.f6640q;
            d7.c(d8, new InterfaceC0654e() { // from class: V3.o
                @Override // V2.InterfaceC0654e
                public final void a(AbstractC0659j abstractC0659j) {
                    m.y.this.d(c0660k2, Q6, pVar, mVar2, abstractC0659j);
                }
            });
        }
    }

    public static class z implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        public V3.k f6642o;

        /* renamed from: p, reason: collision with root package name */
        public r.b f6643p;

        /* renamed from: q, reason: collision with root package name */
        public Q3.s f6644q;

        /* renamed from: r, reason: collision with root package name */
        public A f6645r;

        /* renamed from: s, reason: collision with root package name */
        public long f6646s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f6647t;

        /* renamed from: u, reason: collision with root package name */
        public int f6648u;

        /* renamed from: v, reason: collision with root package name */
        public Q3.c f6649v;

        /* renamed from: w, reason: collision with root package name */
        public long f6650w;

        /* renamed from: x, reason: collision with root package name */
        public d4.n f6651x;

        /* renamed from: y, reason: collision with root package name */
        public d4.n f6652y;

        /* renamed from: z, reason: collision with root package name */
        public d4.n f6653z;

        public z(V3.k kVar, r.b bVar, Q3.s sVar, A a7, boolean z7, long j7) {
            this.f6642o = kVar;
            this.f6643p = bVar;
            this.f6644q = sVar;
            this.f6645r = a7;
            this.f6648u = 0;
            this.f6647t = z7;
            this.f6646s = j7;
            this.f6649v = null;
            this.f6651x = null;
            this.f6652y = null;
            this.f6653z = null;
        }

        public static /* synthetic */ int u(z zVar) {
            int i7 = zVar.f6648u;
            zVar.f6648u = i7 + 1;
            return i7;
        }

        @Override // java.lang.Comparable
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public int compareTo(z zVar) {
            long j7 = this.f6646s;
            long j8 = zVar.f6646s;
            if (j7 < j8) {
                return -1;
            }
            return j7 == j8 ? 0 : 1;
        }

        public /* synthetic */ z(V3.k kVar, r.b bVar, Q3.s sVar, A a7, boolean z7, long j7, k kVar2) {
            this(kVar, bVar, sVar, a7, z7, j7);
        }
    }

    public m(V3.p pVar, AbstractC0667f abstractC0667f, Q3.h hVar) {
        this.f6545a = pVar;
        this.f6553i = abstractC0667f;
        this.f6561q = hVar;
        this.f6554j = abstractC0667f.q("RepoOperation");
        this.f6555k = abstractC0667f.q("Transaction");
        this.f6556l = abstractC0667f.q("DataOperation");
        this.f6552h = new C0751g(abstractC0667f);
        i0(new k());
    }

    public static Q3.c I(String str, String str2) {
        if (str != null) {
            return Q3.c.d(str, str2);
        }
        return null;
    }

    public final void C(long j7, V3.k kVar, Q3.c cVar) {
        if (cVar == null || cVar.f() != -25) {
            List s7 = this.f6560p.s(j7, !(cVar == null), true, this.f6546b);
            if (s7.size() > 0) {
                d0(kVar);
            }
            Y(s7);
        }
    }

    public void D(AbstractC0669h abstractC0669h) {
        C1227b Z6 = abstractC0669h.e().e().Z();
        Y(((Z6 == null || !Z6.equals(AbstractC0664c.f6509a)) ? this.f6560p : this.f6559o).t(abstractC0669h));
    }

    public final void E(List list, Y3.k kVar) {
        List list2 = (List) kVar.g();
        if (list2 != null) {
            list.addAll(list2);
        }
        kVar.c(new n(list));
    }

    public final List F(Y3.k kVar) {
        ArrayList arrayList = new ArrayList();
        E(arrayList, kVar);
        Collections.sort(arrayList);
        return arrayList;
    }

    public void G(e.InterfaceC0084e interfaceC0084e, Q3.c cVar, V3.k kVar) {
        if (interfaceC0084e != null) {
            C1227b X6 = kVar.X();
            if (X6 != null && X6.s()) {
                kVar = kVar.a0();
            }
            X(new w(interfaceC0084e, cVar, Q3.k.c(this, kVar)));
        }
    }

    public final void H() {
        V3.p pVar = this.f6545a;
        this.f6547c = this.f6553i.E(new T3.f(pVar.f6661a, pVar.f6663c, pVar.f6662b), this);
        this.f6553i.m().b(((Y3.c) this.f6553i.v()).d(), new r());
        this.f6553i.l().b(((Y3.c) this.f6553i.v()).d(), new s());
        this.f6547c.a();
        X3.e t7 = this.f6553i.t(this.f6545a.f6661a);
        this.f6548d = new V3.t();
        this.f6549e = new V3.u();
        this.f6550f = new Y3.k();
        this.f6559o = new V3.x(this.f6553i, new X3.d(), new t());
        this.f6560p = new V3.x(this.f6553i, t7, new u());
        e0(t7);
        C1227b c1227b = AbstractC0664c.f6511c;
        Boolean bool = Boolean.FALSE;
        p0(c1227b, bool);
        p0(AbstractC0664c.f6512d, bool);
    }

    public final Y3.k J(V3.k kVar) {
        Y3.k kVar2 = this.f6550f;
        while (!kVar.isEmpty() && kVar2.g() == null) {
            kVar2 = kVar2.k(new V3.k(kVar.Z()));
            kVar = kVar.c0();
        }
        return kVar2;
    }

    public final d4.n K(V3.k kVar) {
        return L(kVar, new ArrayList());
    }

    public final d4.n L(V3.k kVar, List list) {
        d4.n J6 = this.f6560p.J(kVar, list);
        return J6 == null ? d4.g.W() : J6;
    }

    public final long M() {
        long j7 = this.f6558n;
        this.f6558n = 1 + j7;
        return j7;
    }

    public V3.x N() {
        return this.f6560p;
    }

    public AbstractC0659j O(Q3.p pVar) {
        C0660k c0660k = new C0660k();
        i0(new y(pVar, c0660k, this));
        return c0660k.a();
    }

    public void P() {
        this.f6547c.j("repo_interrupt");
    }

    public void Q(a4.i iVar, boolean z7) {
        R(iVar, z7, false);
    }

    public void R(a4.i iVar, boolean z7, boolean z8) {
        Y3.m.f(iVar.e().isEmpty() || !iVar.e().Z().equals(AbstractC0664c.f6509a));
        this.f6560p.O(iVar, z7, z8);
    }

    public final long S() {
        long j7 = this.f6563s;
        this.f6563s = 1 + j7;
        return j7;
    }

    public void T(V3.k kVar, e.InterfaceC0084e interfaceC0084e) {
        this.f6547c.m(kVar.S(), new d(kVar, interfaceC0084e));
    }

    public void U(V3.k kVar, d4.n nVar, e.InterfaceC0084e interfaceC0084e) {
        this.f6547c.h(kVar.S(), nVar.L(true), new b(kVar, nVar, interfaceC0084e));
    }

    public void V(V3.k kVar, Map map, e.InterfaceC0084e interfaceC0084e, Map map2) {
        this.f6547c.b(kVar.S(), map2, new c(kVar, map, interfaceC0084e));
    }

    public void W(C1227b c1227b, Object obj) {
        p0(c1227b, obj);
    }

    public void X(Runnable runnable) {
        this.f6553i.F();
        this.f6553i.o().b(runnable);
    }

    public final void Y(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f6552h.b(list);
    }

    public final void Z(Y3.k kVar) {
        List list = (List) kVar.g();
        if (list != null) {
            int i7 = 0;
            while (i7 < list.size()) {
                if (((z) list.get(i7)).f6645r == A.COMPLETED) {
                    list.remove(i7);
                } else {
                    i7++;
                }
            }
            if (list.size() <= 0) {
                list = null;
            }
            kVar.j(list);
        }
        kVar.c(new j());
    }

    @Override // T3.h.a
    public void a() {
        W(AbstractC0664c.f6512d, Boolean.TRUE);
    }

    public void a0() {
        if (this.f6554j.f()) {
            this.f6554j.b("Purging writes", new Object[0]);
        }
        Y(this.f6560p.U());
        g(V3.k.Y(), -25);
        this.f6547c.e();
    }

    @Override // T3.h.a
    public void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            p0(C1227b.j((String) entry.getKey()), entry.getValue());
        }
    }

    public void b0(AbstractC0669h abstractC0669h) {
        Y((AbstractC0664c.f6509a.equals(abstractC0669h.e().e().Z()) ? this.f6559o : this.f6560p).V(abstractC0669h));
    }

    @Override // T3.h.a
    public void c(List list, Object obj, boolean z7, Long l7) {
        List A7;
        V3.k kVar = new V3.k(list);
        if (this.f6554j.f()) {
            this.f6554j.b("onDataUpdate: " + kVar, new Object[0]);
        }
        if (this.f6556l.f()) {
            this.f6554j.b("onDataUpdate: " + kVar + " " + obj, new Object[0]);
        }
        this.f6557m++;
        try {
            if (l7 != null) {
                V3.y yVar = new V3.y(l7.longValue());
                if (z7) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new V3.k((String) entry.getKey()), d4.o.a(entry.getValue()));
                    }
                    A7 = this.f6560p.E(kVar, hashMap, yVar);
                } else {
                    A7 = this.f6560p.F(kVar, d4.o.a(obj), yVar);
                }
            } else if (z7) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    hashMap2.put(new V3.k((String) entry2.getKey()), d4.o.a(entry2.getValue()));
                }
                A7 = this.f6560p.z(kVar, hashMap2);
            } else {
                A7 = this.f6560p.A(kVar, d4.o.a(obj));
            }
            if (A7.size() > 0) {
                d0(kVar);
            }
            Y(A7);
        } catch (Q3.d e7) {
            this.f6554j.c("FIREBASE INTERNAL ERROR", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(java.util.List r27, V3.k r28) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.m.c0(java.util.List, V3.k):void");
    }

    @Override // T3.h.a
    public void d() {
        W(AbstractC0664c.f6512d, Boolean.FALSE);
        g0();
    }

    public final V3.k d0(V3.k kVar) {
        Y3.k J6 = J(kVar);
        V3.k f7 = J6.f();
        c0(F(J6), f7);
        return f7;
    }

    @Override // T3.h.a
    public void e(boolean z7) {
        W(AbstractC0664c.f6511c, Boolean.valueOf(z7));
    }

    public final void e0(X3.e eVar) {
        List<B> d7 = eVar.d();
        Map c7 = V3.s.c(this.f6546b);
        long j7 = Long.MIN_VALUE;
        for (B b7 : d7) {
            v vVar = new v(b7);
            if (j7 >= b7.d()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            j7 = b7.d();
            this.f6558n = b7.d() + 1;
            if (b7.e()) {
                if (this.f6554j.f()) {
                    this.f6554j.b("Restoring overwrite with id " + b7.d(), new Object[0]);
                }
                this.f6547c.r(b7.c().S(), b7.b().L(true), vVar);
                this.f6560p.I(b7.c(), b7.b(), V3.s.g(b7.b(), this.f6560p, b7.c(), c7), b7.d(), true, false);
            } else {
                if (this.f6554j.f()) {
                    this.f6554j.b("Restoring merge with id " + b7.d(), new Object[0]);
                }
                this.f6547c.f(b7.c().S(), b7.a().U(true), vVar);
                this.f6560p.H(b7.c(), b7.a(), V3.s.f(b7.a(), this.f6560p, b7.c(), c7), b7.d(), false);
            }
        }
    }

    @Override // T3.h.a
    public void f(List list, List list2, Long l7) {
        V3.k kVar = new V3.k(list);
        if (this.f6554j.f()) {
            this.f6554j.b("onRangeMergeUpdate: " + kVar, new Object[0]);
        }
        if (this.f6556l.f()) {
            this.f6554j.b("onRangeMergeUpdate: " + kVar + " " + list2, new Object[0]);
        }
        this.f6557m++;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new d4.s((T3.o) it.next()));
        }
        V3.x xVar = this.f6560p;
        List G6 = l7 != null ? xVar.G(kVar, arrayList, new V3.y(l7.longValue())) : xVar.B(kVar, arrayList);
        if (G6.size() > 0) {
            d0(kVar);
        }
        Y(G6);
    }

    public void f0() {
        this.f6547c.p("repo_interrupt");
    }

    public final V3.k g(V3.k kVar, int i7) {
        V3.k f7 = J(kVar).f();
        if (this.f6555k.f()) {
            this.f6554j.b("Aborting transactions for path: " + kVar + ". Affected: " + f7, new Object[0]);
        }
        Y3.k k7 = this.f6550f.k(kVar);
        k7.a(new o(i7));
        h(k7, i7);
        k7.d(new p(i7));
        return f7;
    }

    public final void g0() {
        Map c7 = V3.s.c(this.f6546b);
        ArrayList arrayList = new ArrayList();
        this.f6549e.b(V3.k.Y(), new e(c7, arrayList));
        this.f6549e = new V3.u();
        Y(arrayList);
    }

    public final void h(Y3.k kVar, int i7) {
        Q3.c a7;
        List list = (List) kVar.g();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            if (i7 == -9) {
                a7 = Q3.c.c("overriddenBySet");
            } else {
                Y3.m.g(i7 == -25, "Unknown transaction abort reason: " + i7);
                a7 = Q3.c.a(-25);
            }
            int i8 = -1;
            for (int i9 = 0; i9 < list.size(); i9++) {
                z zVar = (z) list.get(i9);
                A a8 = zVar.f6645r;
                A a9 = A.SENT_NEEDS_ABORT;
                if (a8 != a9) {
                    if (zVar.f6645r == A.SENT) {
                        Y3.m.f(i8 == i9 + (-1));
                        zVar.f6645r = a9;
                        zVar.f6649v = a7;
                        i8 = i9;
                    } else {
                        Y3.m.f(zVar.f6645r == A.RUN);
                        b0(new D(this, zVar.f6644q, a4.i.a(zVar.f6642o)));
                        if (i7 == -9) {
                            arrayList.addAll(this.f6560p.s(zVar.f6650w, true, false, this.f6546b));
                        } else {
                            Y3.m.g(i7 == -25, "Unknown transaction abort reason: " + i7);
                        }
                        arrayList2.add(new q(zVar, a7));
                    }
                }
            }
            kVar.j(i8 == -1 ? null : list.subList(0, i8 + 1));
            Y(arrayList);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                X((Runnable) it.next());
            }
        }
    }

    public void h0(Runnable runnable, long j7) {
        this.f6553i.F();
        this.f6553i.v().b(runnable, j7);
    }

    public void i0(Runnable runnable) {
        this.f6553i.F();
        this.f6553i.v().c(runnable);
    }

    public final void j0() {
        Y3.k kVar = this.f6550f;
        Z(kVar);
        k0(kVar);
    }

    public final void k0(Y3.k kVar) {
        if (((List) kVar.g()) == null) {
            if (kVar.h()) {
                kVar.c(new h());
                return;
            }
            return;
        }
        List F6 = F(kVar);
        Y3.m.f(F6.size() > 0);
        Boolean bool = Boolean.TRUE;
        Iterator it = F6.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((z) it.next()).f6645r != A.RUN) {
                bool = Boolean.FALSE;
                break;
            }
        }
        if (bool.booleanValue()) {
            l0(F6, kVar.f());
        }
    }

    public final void l0(List list, V3.k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((z) it.next()).f6650w));
        }
        d4.n L6 = L(kVar, arrayList);
        String R6 = !this.f6551g ? L6.R() : "badhash";
        Iterator it2 = list.iterator();
        while (true) {
            boolean z7 = true;
            if (!it2.hasNext()) {
                this.f6547c.n(kVar.S(), L6.L(true), R6, new i(kVar, list, this));
                return;
            }
            z zVar = (z) it2.next();
            if (zVar.f6645r != A.RUN) {
                z7 = false;
            }
            Y3.m.f(z7);
            zVar.f6645r = A.SENT;
            z.u(zVar);
            L6 = L6.y(V3.k.b0(kVar, zVar.f6642o), zVar.f6652y);
        }
    }

    public void m0(V3.k kVar, d4.n nVar, e.InterfaceC0084e interfaceC0084e) {
        if (this.f6554j.f()) {
            this.f6554j.b("set: " + kVar, new Object[0]);
        }
        if (this.f6556l.f()) {
            this.f6556l.b("set: " + kVar + " " + nVar, new Object[0]);
        }
        d4.n i7 = V3.s.i(nVar, this.f6560p.J(kVar, new ArrayList()), V3.s.c(this.f6546b));
        long M6 = M();
        Y(this.f6560p.I(kVar, nVar, i7, M6, true, true));
        this.f6547c.r(kVar.S(), nVar.L(true), new x(kVar, M6, interfaceC0084e));
        d0(g(kVar, -9));
    }

    public void n0(V3.k kVar, r.b bVar, boolean z7) {
        Q3.c b7;
        r.c a7;
        if (this.f6554j.f()) {
            this.f6554j.b("transaction: " + kVar, new Object[0]);
        }
        if (this.f6556l.f()) {
            this.f6554j.b("transaction: " + kVar, new Object[0]);
        }
        if (this.f6553i.C() && !this.f6562r) {
            this.f6562r = true;
            this.f6555k.e("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
        }
        Q3.e c7 = Q3.k.c(this, kVar);
        f fVar = new f();
        D(new D(this, fVar, c7.u()));
        z zVar = new z(kVar, bVar, fVar, A.INITIALIZING, z7, S(), null);
        d4.n K6 = K(kVar);
        zVar.f6651x = K6;
        try {
            a7 = bVar.a(Q3.k.b(K6));
        } catch (Throwable th) {
            this.f6554j.c("Caught Throwable.", th);
            b7 = Q3.c.b(th);
            a7 = Q3.r.a();
        }
        if (a7 == null) {
            throw new NullPointerException("Transaction returned null as result");
        }
        b7 = null;
        if (!a7.b()) {
            zVar.f6652y = null;
            zVar.f6653z = null;
            X(new g(bVar, b7, Q3.k.a(c7, d4.i.d(zVar.f6651x))));
            return;
        }
        zVar.f6645r = A.RUN;
        Y3.k k7 = this.f6550f.k(kVar);
        List list = (List) k7.g();
        if (list == null) {
            list = new ArrayList();
        }
        list.add(zVar);
        k7.j(list);
        Map c8 = V3.s.c(this.f6546b);
        d4.n a8 = a7.a();
        d4.n i7 = V3.s.i(a8, zVar.f6651x, c8);
        zVar.f6652y = a8;
        zVar.f6653z = i7;
        zVar.f6650w = M();
        Y(this.f6560p.I(kVar, a8, i7, zVar.f6650w, z7, false));
        j0();
    }

    public void o0(V3.k kVar, C0663b c0663b, e.InterfaceC0084e interfaceC0084e, Map map) {
        if (this.f6554j.f()) {
            this.f6554j.b("update: " + kVar, new Object[0]);
        }
        if (this.f6556l.f()) {
            this.f6556l.b("update: " + kVar + " " + map, new Object[0]);
        }
        if (c0663b.isEmpty()) {
            if (this.f6554j.f()) {
                this.f6554j.b("update called with no changes. No-op", new Object[0]);
            }
            G(interfaceC0084e, null, kVar);
            return;
        }
        C0663b f7 = V3.s.f(c0663b, this.f6560p, kVar, V3.s.c(this.f6546b));
        long M6 = M();
        Y(this.f6560p.H(kVar, c0663b, f7, M6, true));
        this.f6547c.f(kVar.S(), map, new C0670a(kVar, M6, interfaceC0084e));
        Iterator it = c0663b.iterator();
        while (it.hasNext()) {
            d0(g(kVar.T((V3.k) ((Map.Entry) it.next()).getKey()), -9));
        }
    }

    public final void p0(C1227b c1227b, Object obj) {
        if (c1227b.equals(AbstractC0664c.f6510b)) {
            this.f6546b.b(((Long) obj).longValue());
        }
        V3.k kVar = new V3.k(AbstractC0664c.f6509a, c1227b);
        try {
            d4.n a7 = d4.o.a(obj);
            this.f6548d.c(kVar, a7);
            Y(this.f6559o.A(kVar, a7));
        } catch (Q3.d e7) {
            this.f6554j.c("Failed to parse info update", e7);
        }
    }

    public final void q0(String str, V3.k kVar, Q3.c cVar) {
        if (cVar == null || cVar.f() == -1 || cVar.f() == -25) {
            return;
        }
        this.f6554j.i(str + " at " + kVar.toString() + " failed: " + cVar.toString());
    }

    public String toString() {
        return this.f6545a.toString();
    }

    public class f implements Q3.s {
        public f() {
        }

        @Override // Q3.s
        public void a(Q3.c cVar) {
        }

        @Override // Q3.s
        public void b(Q3.b bVar) {
        }
    }

    public class t implements x.s {

        public class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ a4.i f6622o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ x.p f6623p;

            public a(a4.i iVar, x.p pVar) {
                this.f6622o = iVar;
                this.f6623p = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d4.n a7 = m.this.f6548d.a(this.f6622o.e());
                if (a7.isEmpty()) {
                    return;
                }
                m.this.Y(m.this.f6559o.A(this.f6622o.e(), a7));
                this.f6623p.a(null);
            }
        }

        public t() {
        }

        @Override // V3.x.s
        public void b(a4.i iVar, V3.y yVar, T3.g gVar, x.p pVar) {
            m.this.i0(new a(iVar, pVar));
        }

        @Override // V3.x.s
        public void a(a4.i iVar, V3.y yVar) {
        }
    }
}
