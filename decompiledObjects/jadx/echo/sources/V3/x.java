package V3;

import S3.h;
import Y3.d;
import a4.C0745a;
import a4.C0747c;
import a4.C0748d;
import a4.InterfaceC0749e;
import c4.C0851c;
import d4.C1227b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class x {

    /* renamed from: f, reason: collision with root package name */
    public final s f6689f;

    /* renamed from: g, reason: collision with root package name */
    public final X3.e f6690g;

    /* renamed from: h, reason: collision with root package name */
    public final C0851c f6691h;

    /* renamed from: i, reason: collision with root package name */
    public long f6692i = 1;

    /* renamed from: a, reason: collision with root package name */
    public Y3.d f6684a = Y3.d.d();

    /* renamed from: b, reason: collision with root package name */
    public final F f6685b = new F();

    /* renamed from: c, reason: collision with root package name */
    public final Map f6686c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f6687d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Set f6688e = new HashSet();

    public class a implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ y f6693o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ V3.k f6694p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Map f6695q;

        public a(y yVar, V3.k kVar, Map map) {
            this.f6693o = yVar;
            this.f6694p = kVar;
            this.f6695q = map;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            a4.i S6 = x.this.S(this.f6693o);
            if (S6 == null) {
                return Collections.emptyList();
            }
            V3.k b02 = V3.k.b0(S6.e(), this.f6694p);
            C0663b D7 = C0663b.D(this.f6695q);
            x.this.f6690g.f(this.f6694p, D7);
            return x.this.D(S6, new W3.c(W3.e.a(S6.d()), b02, D7));
        }
    }

    public class b implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ a4.i f6697o;

        public b(a4.i iVar) {
            this.f6697o = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            x.this.f6690g.m(this.f6697o);
            return null;
        }
    }

    public class c implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ AbstractC0669h f6699o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f6700p;

        public c(AbstractC0669h abstractC0669h, boolean z7) {
            this.f6699o = abstractC0669h;
            this.f6700p = z7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            C0745a k7;
            d4.n d7;
            a4.i e7 = this.f6699o.e();
            V3.k e8 = e7.e();
            Y3.d dVar = x.this.f6684a;
            d4.n nVar = null;
            V3.k kVar = e8;
            boolean z7 = false;
            while (!dVar.isEmpty()) {
                v vVar = (v) dVar.getValue();
                if (vVar != null) {
                    if (nVar == null) {
                        nVar = vVar.d(kVar);
                    }
                    z7 = z7 || vVar.h();
                }
                dVar = dVar.D(kVar.isEmpty() ? C1227b.j("") : kVar.Z());
                kVar = kVar.c0();
            }
            v vVar2 = (v) x.this.f6684a.s(e8);
            if (vVar2 == null) {
                vVar2 = new v(x.this.f6690g);
                x xVar = x.this;
                xVar.f6684a = xVar.f6684a.W(e8, vVar2);
            } else {
                z7 = z7 || vVar2.h();
                if (nVar == null) {
                    nVar = vVar2.d(V3.k.Y());
                }
            }
            x.this.f6690g.m(e7);
            if (nVar != null) {
                k7 = new C0745a(d4.i.f(nVar, e7.c()), true, false);
            } else {
                k7 = x.this.f6690g.k(e7);
                if (!k7.f()) {
                    d4.n W6 = d4.g.W();
                    Iterator it = x.this.f6684a.Y(e8).M().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        v vVar3 = (v) ((Y3.d) entry.getValue()).getValue();
                        if (vVar3 != null && (d7 = vVar3.d(V3.k.Y())) != null) {
                            W6 = W6.N((C1227b) entry.getKey(), d7);
                        }
                    }
                    for (d4.m mVar : k7.b()) {
                        if (!W6.Q(mVar.c())) {
                            W6 = W6.N(mVar.c(), mVar.d());
                        }
                    }
                    k7 = new C0745a(d4.i.f(W6, e7.c()), false, false);
                }
            }
            boolean k8 = vVar2.k(e7);
            if (!k8 && !e7.g()) {
                Y3.m.g(!x.this.f6687d.containsKey(e7), "View does not exist but we have a tag");
                y M6 = x.this.M();
                x.this.f6687d.put(e7, M6);
                x.this.f6686c.put(M6, e7);
            }
            List a7 = vVar2.a(this.f6699o, x.this.f6685b.h(e8), k7);
            if (!k8 && !z7 && !this.f6700p) {
                x.this.a0(e7, vVar2.l(e7));
            }
            return a7;
        }
    }

    public class d implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ a4.i f6702o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ AbstractC0669h f6703p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Q3.c f6704q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f6705r;

        public d(a4.i iVar, AbstractC0669h abstractC0669h, Q3.c cVar, boolean z7) {
            this.f6702o = iVar;
            this.f6703p = abstractC0669h;
            this.f6704q = cVar;
            this.f6705r = z7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            boolean z7;
            V3.k e7 = this.f6702o.e();
            v vVar = (v) x.this.f6684a.s(e7);
            List arrayList = new ArrayList();
            if (vVar != null && (this.f6702o.f() || vVar.k(this.f6702o))) {
                Y3.g j7 = vVar.j(this.f6702o, this.f6703p, this.f6704q);
                if (vVar.i()) {
                    x xVar = x.this;
                    xVar.f6684a = xVar.f6684a.U(e7);
                }
                List<a4.i> list = (List) j7.a();
                arrayList = (List) j7.b();
                loop0: while (true) {
                    for (a4.i iVar : list) {
                        x.this.f6690g.i(this.f6702o);
                        z7 = z7 || iVar.g();
                    }
                }
                if (this.f6705r) {
                    return null;
                }
                Y3.d dVar = x.this.f6684a;
                boolean z8 = dVar.getValue() != null && ((v) dVar.getValue()).h();
                Iterator it = e7.iterator();
                while (it.hasNext()) {
                    dVar = dVar.D((C1227b) it.next());
                    z8 = z8 || (dVar.getValue() != null && ((v) dVar.getValue()).h());
                    if (z8 || dVar.isEmpty()) {
                        break;
                    }
                }
                if (z7 && !z8) {
                    Y3.d Y6 = x.this.f6684a.Y(e7);
                    if (!Y6.isEmpty()) {
                        for (a4.j jVar : x.this.K(Y6)) {
                            r rVar = x.this.new r(jVar);
                            x.this.f6689f.b(x.this.R(jVar.h()), rVar.f6748b, rVar, rVar);
                        }
                    }
                }
                if (!z8 && !list.isEmpty() && this.f6704q == null) {
                    if (z7) {
                        x.this.f6689f.a(x.this.R(this.f6702o), null);
                    } else {
                        for (a4.i iVar2 : list) {
                            y b02 = x.this.b0(iVar2);
                            Y3.m.f(b02 != null);
                            x.this.f6689f.a(x.this.R(iVar2), b02);
                        }
                    }
                }
                x.this.Y(list);
            }
            return arrayList;
        }
    }

    public class e implements d.c {
        public e() {
        }

        @Override // Y3.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(V3.k kVar, v vVar, Void r52) {
            if (!kVar.isEmpty() && vVar.h()) {
                a4.i h7 = vVar.e().h();
                x.this.f6689f.a(x.this.R(h7), x.this.b0(h7));
                return null;
            }
            Iterator it = vVar.f().iterator();
            while (it.hasNext()) {
                a4.i h8 = ((a4.j) it.next()).h();
                x.this.f6689f.a(x.this.R(h8), x.this.b0(h8));
            }
            return null;
        }
    }

    public class f extends h.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d4.n f6708a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ G f6709b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ W3.d f6710c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f6711d;

        public f(d4.n nVar, G g7, W3.d dVar, List list) {
            this.f6708a = nVar;
            this.f6709b = g7;
            this.f6710c = dVar;
            this.f6711d = list;
        }

        @Override // S3.h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1227b c1227b, Y3.d dVar) {
            d4.n nVar = this.f6708a;
            d4.n v7 = nVar != null ? nVar.v(c1227b) : null;
            G h7 = this.f6709b.h(c1227b);
            W3.d d7 = this.f6710c.d(c1227b);
            if (d7 != null) {
                this.f6711d.addAll(x.this.w(d7, dVar, v7, h7));
            }
        }
    }

    public class g implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f6713o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ V3.k f6714p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ d4.n f6715q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ long f6716r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d4.n f6717s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f6718t;

        public g(boolean z7, V3.k kVar, d4.n nVar, long j7, d4.n nVar2, boolean z8) {
            this.f6713o = z7;
            this.f6714p = kVar;
            this.f6715q = nVar;
            this.f6716r = j7;
            this.f6717s = nVar2;
            this.f6718t = z8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            if (this.f6713o) {
                x.this.f6690g.e(this.f6714p, this.f6715q, this.f6716r);
            }
            x.this.f6685b.b(this.f6714p, this.f6717s, Long.valueOf(this.f6716r), this.f6718t);
            return !this.f6718t ? Collections.emptyList() : x.this.y(new W3.f(W3.e.f6865d, this.f6714p, this.f6717s));
        }
    }

    public class h implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f6720o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ V3.k f6721p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C0663b f6722q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ long f6723r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C0663b f6724s;

        public h(boolean z7, V3.k kVar, C0663b c0663b, long j7, C0663b c0663b2) {
            this.f6720o = z7;
            this.f6721p = kVar;
            this.f6722q = c0663b;
            this.f6723r = j7;
            this.f6724s = c0663b2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            if (this.f6720o) {
                x.this.f6690g.c(this.f6721p, this.f6722q, this.f6723r);
            }
            x.this.f6685b.a(this.f6721p, this.f6724s, Long.valueOf(this.f6723r));
            return x.this.y(new W3.c(W3.e.f6865d, this.f6721p, this.f6724s));
        }
    }

    public class i implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f6726o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f6727p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f6728q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y3.a f6729r;

        public i(boolean z7, long j7, boolean z8, Y3.a aVar) {
            this.f6726o = z7;
            this.f6727p = j7;
            this.f6728q = z8;
            this.f6729r = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            if (this.f6726o) {
                x.this.f6690g.b(this.f6727p);
            }
            B i7 = x.this.f6685b.i(this.f6727p);
            boolean m7 = x.this.f6685b.m(this.f6727p);
            if (i7.f() && !this.f6728q) {
                Map c7 = V3.s.c(this.f6729r);
                if (i7.e()) {
                    x.this.f6690g.n(i7.c(), V3.s.g(i7.b(), x.this, i7.c(), c7));
                } else {
                    x.this.f6690g.h(i7.c(), V3.s.f(i7.a(), x.this, i7.c(), c7));
                }
            }
            if (!m7) {
                return Collections.emptyList();
            }
            Y3.d d7 = Y3.d.d();
            if (i7.e()) {
                d7 = d7.W(V3.k.Y(), Boolean.TRUE);
            } else {
                Iterator it = i7.a().iterator();
                while (it.hasNext()) {
                    d7 = d7.W((V3.k) ((Map.Entry) it.next()).getKey(), Boolean.TRUE);
                }
            }
            return x.this.y(new W3.a(i7.c(), d7, this.f6728q));
        }
    }

    public class j implements Callable {
        public j() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            x.this.f6690g.a();
            if (x.this.f6685b.k().isEmpty()) {
                return Collections.emptyList();
            }
            return x.this.y(new W3.a(V3.k.Y(), new Y3.d(Boolean.TRUE), true));
        }
    }

    public class k implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ V3.k f6732o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ d4.n f6733p;

        public k(V3.k kVar, d4.n nVar) {
            this.f6732o = kVar;
            this.f6733p = nVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            x.this.f6690g.j(a4.i.a(this.f6732o), this.f6733p);
            return x.this.y(new W3.f(W3.e.f6866e, this.f6732o, this.f6733p));
        }
    }

    public class l implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Map f6735o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ V3.k f6736p;

        public l(Map map, V3.k kVar) {
            this.f6735o = map;
            this.f6736p = kVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            C0663b D7 = C0663b.D(this.f6735o);
            x.this.f6690g.f(this.f6736p, D7);
            return x.this.y(new W3.c(W3.e.f6866e, this.f6736p, D7));
        }
    }

    public class m implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ V3.k f6738o;

        public m(V3.k kVar) {
            this.f6738o = kVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            x.this.f6690g.p(a4.i.a(this.f6738o));
            return x.this.y(new W3.b(W3.e.f6866e, this.f6738o));
        }
    }

    public class n implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ y f6740o;

        public n(y yVar) {
            this.f6740o = yVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            a4.i S6 = x.this.S(this.f6740o);
            if (S6 == null) {
                return Collections.emptyList();
            }
            x.this.f6690g.p(S6);
            return x.this.D(S6, new W3.b(W3.e.a(S6.d()), V3.k.Y()));
        }
    }

    public class o implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ y f6742o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ V3.k f6743p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ d4.n f6744q;

        public o(y yVar, V3.k kVar, d4.n nVar) {
            this.f6742o = yVar;
            this.f6743p = kVar;
            this.f6744q = nVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            a4.i S6 = x.this.S(this.f6742o);
            if (S6 == null) {
                return Collections.emptyList();
            }
            V3.k b02 = V3.k.b0(S6.e(), this.f6743p);
            x.this.f6690g.j(b02.isEmpty() ? S6 : a4.i.a(this.f6743p), this.f6744q);
            return x.this.D(S6, new W3.f(W3.e.a(S6.d()), b02, this.f6744q));
        }
    }

    public interface p {
        List a(Q3.c cVar);
    }

    public class r implements T3.g, p {

        /* renamed from: a, reason: collision with root package name */
        public final a4.j f6747a;

        /* renamed from: b, reason: collision with root package name */
        public final y f6748b;

        public r(a4.j jVar) {
            this.f6747a = jVar;
            this.f6748b = x.this.b0(jVar.h());
        }

        @Override // V3.x.p
        public List a(Q3.c cVar) {
            if (cVar == null) {
                a4.i h7 = this.f6747a.h();
                y yVar = this.f6748b;
                return yVar != null ? x.this.C(yVar) : x.this.v(h7.e());
            }
            x.this.f6691h.i("Listen at " + this.f6747a.h().e() + " failed: " + cVar.toString());
            return x.this.T(this.f6747a.h(), cVar);
        }

        @Override // T3.g
        public T3.a b() {
            d4.d b7 = d4.d.b(this.f6747a.i());
            List e7 = b7.e();
            ArrayList arrayList = new ArrayList(e7.size());
            Iterator it = e7.iterator();
            while (it.hasNext()) {
                arrayList.add(((V3.k) it.next()).S());
            }
            return new T3.a(arrayList, b7.d());
        }

        @Override // T3.g
        public boolean c() {
            return Y3.e.b(this.f6747a.i()) > 1024;
        }

        @Override // T3.g
        public String d() {
            return this.f6747a.i().R();
        }
    }

    public interface s {
        void a(a4.i iVar, y yVar);

        void b(a4.i iVar, y yVar, T3.g gVar, p pVar);
    }

    public x(AbstractC0667f abstractC0667f, X3.e eVar, s sVar) {
        this.f6689f = sVar;
        this.f6690g = eVar;
        this.f6691h = abstractC0667f.q("SyncTree");
    }

    public List A(V3.k kVar, d4.n nVar) {
        return (List) this.f6690g.g(new k(kVar, nVar));
    }

    public List B(V3.k kVar, List list) {
        v vVar = (v) this.f6684a.s(kVar);
        if (vVar == null) {
            return Collections.emptyList();
        }
        a4.j e7 = vVar.e();
        if (e7 == null) {
            return Collections.emptyList();
        }
        d4.n i7 = e7.i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i7 = ((d4.s) it.next()).a(i7);
        }
        return A(kVar, i7);
    }

    public List C(y yVar) {
        return (List) this.f6690g.g(new n(yVar));
    }

    public final List D(a4.i iVar, W3.d dVar) {
        V3.k e7 = iVar.e();
        v vVar = (v) this.f6684a.s(e7);
        Y3.m.g(vVar != null, "Missing sync point for query tag that we're tracking");
        return vVar.b(dVar, this.f6685b.h(e7), null);
    }

    public List E(V3.k kVar, Map map, y yVar) {
        return (List) this.f6690g.g(new a(yVar, kVar, map));
    }

    public List F(V3.k kVar, d4.n nVar, y yVar) {
        return (List) this.f6690g.g(new o(yVar, kVar, nVar));
    }

    public List G(V3.k kVar, List list, y yVar) {
        a4.i S6 = S(yVar);
        if (S6 == null) {
            return Collections.emptyList();
        }
        Y3.m.f(kVar.equals(S6.e()));
        v vVar = (v) this.f6684a.s(S6.e());
        Y3.m.g(vVar != null, "Missing sync point for query tag that we're tracking");
        a4.j l7 = vVar.l(S6);
        Y3.m.g(l7 != null, "Missing view for query tag that we're tracking");
        d4.n i7 = l7.i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i7 = ((d4.s) it.next()).a(i7);
        }
        return F(kVar, i7, yVar);
    }

    public List H(V3.k kVar, C0663b c0663b, C0663b c0663b2, long j7, boolean z7) {
        return (List) this.f6690g.g(new h(z7, kVar, c0663b, j7, c0663b2));
    }

    public List I(V3.k kVar, d4.n nVar, d4.n nVar2, long j7, boolean z7, boolean z8) {
        Y3.m.g(z7 || !z8, "We shouldn't be persisting non-visible writes.");
        return (List) this.f6690g.g(new g(z8, kVar, nVar, j7, nVar2, z7));
    }

    public d4.n J(V3.k kVar, List list) {
        Y3.d dVar = this.f6684a;
        V3.k Y6 = V3.k.Y();
        d4.n nVar = null;
        V3.k kVar2 = kVar;
        do {
            C1227b Z6 = kVar2.Z();
            kVar2 = kVar2.c0();
            Y6 = Y6.U(Z6);
            V3.k b02 = V3.k.b0(Y6, kVar);
            dVar = Z6 != null ? dVar.D(Z6) : Y3.d.d();
            v vVar = (v) dVar.getValue();
            if (vVar != null) {
                nVar = vVar.d(b02);
            }
            if (kVar2.isEmpty()) {
                break;
            }
        } while (nVar == null);
        return this.f6685b.d(kVar, nVar, list, true);
    }

    public final List K(Y3.d dVar) {
        ArrayList arrayList = new ArrayList();
        L(dVar, arrayList);
        return arrayList;
    }

    public final void L(Y3.d dVar, List list) {
        v vVar = (v) dVar.getValue();
        if (vVar != null && vVar.h()) {
            list.add(vVar.e());
            return;
        }
        if (vVar != null) {
            list.addAll(vVar.f());
        }
        Iterator it = dVar.M().iterator();
        while (it.hasNext()) {
            L((Y3.d) ((Map.Entry) it.next()).getValue(), list);
        }
    }

    public final y M() {
        long j7 = this.f6692i;
        this.f6692i = 1 + j7;
        return new y(j7);
    }

    public d4.n N(final a4.i iVar) {
        return (d4.n) this.f6690g.g(new Callable() { // from class: V3.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d4.n P6;
                P6 = x.this.P(iVar);
                return P6;
            }
        });
    }

    public void O(a4.i iVar, boolean z7, boolean z8) {
        if (z7 && !this.f6688e.contains(iVar)) {
            u(new q(iVar), z8);
            this.f6688e.add(iVar);
        } else {
            if (z7 || !this.f6688e.contains(iVar)) {
                return;
            }
            W(new q(iVar), z8);
            this.f6688e.remove(iVar);
        }
    }

    public final /* synthetic */ d4.n P(a4.i iVar) {
        V3.k e7 = iVar.e();
        Y3.d dVar = this.f6684a;
        d4.n nVar = null;
        V3.k kVar = e7;
        boolean z7 = false;
        while (true) {
            if (dVar.isEmpty()) {
                break;
            }
            v vVar = (v) dVar.getValue();
            if (vVar != null) {
                if (nVar == null) {
                    nVar = vVar.d(kVar);
                }
                z7 = z7 || vVar.h();
            }
            dVar = dVar.D(kVar.isEmpty() ? C1227b.j("") : kVar.Z());
            kVar = kVar.c0();
        }
        v vVar2 = (v) this.f6684a.s(e7);
        if (vVar2 == null) {
            vVar2 = new v(this.f6690g);
            this.f6684a = this.f6684a.W(e7, vVar2);
        } else if (nVar == null) {
            nVar = vVar2.d(V3.k.Y());
        }
        return vVar2.g(iVar, this.f6685b.h(e7), new C0745a(d4.i.f(nVar != null ? nVar : d4.g.W(), iVar.c()), nVar != null, false)).d();
    }

    public Q3.b Q(Q3.p pVar) {
        return Q3.k.a(pVar.t(), this.f6690g.k(pVar.u()).a());
    }

    public final a4.i R(a4.i iVar) {
        return (!iVar.g() || iVar.f()) ? iVar : a4.i.a(iVar.e());
    }

    public final a4.i S(y yVar) {
        return (a4.i) this.f6686c.get(yVar);
    }

    public List T(a4.i iVar, Q3.c cVar) {
        return X(iVar, null, cVar, false);
    }

    public List U() {
        return (List) this.f6690g.g(new j());
    }

    public List V(AbstractC0669h abstractC0669h) {
        return X(abstractC0669h.e(), abstractC0669h, null, false);
    }

    public List W(AbstractC0669h abstractC0669h, boolean z7) {
        return X(abstractC0669h.e(), abstractC0669h, null, z7);
    }

    public final List X(a4.i iVar, AbstractC0669h abstractC0669h, Q3.c cVar, boolean z7) {
        return (List) this.f6690g.g(new d(iVar, abstractC0669h, cVar, z7));
    }

    public final void Y(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a4.i iVar = (a4.i) it.next();
            if (!iVar.g()) {
                y b02 = b0(iVar);
                Y3.m.f(b02 != null);
                this.f6687d.remove(iVar);
                this.f6686c.remove(b02);
            }
        }
    }

    public void Z(a4.i iVar) {
        this.f6690g.g(new b(iVar));
    }

    public final void a0(a4.i iVar, a4.j jVar) {
        V3.k e7 = iVar.e();
        y b02 = b0(iVar);
        r rVar = new r(jVar);
        this.f6689f.b(R(iVar), b02, rVar, rVar);
        Y3.d Y6 = this.f6684a.Y(e7);
        if (b02 != null) {
            Y3.m.g(!((v) Y6.getValue()).h(), "If we're adding a query, it shouldn't be shadowed");
        } else {
            Y6.q(new e());
        }
    }

    public y b0(a4.i iVar) {
        return (y) this.f6687d.get(iVar);
    }

    public List s(long j7, boolean z7, boolean z8, Y3.a aVar) {
        return (List) this.f6690g.g(new i(z8, j7, z7, aVar));
    }

    public List t(AbstractC0669h abstractC0669h) {
        return u(abstractC0669h, false);
    }

    public List u(AbstractC0669h abstractC0669h, boolean z7) {
        return (List) this.f6690g.g(new c(abstractC0669h, z7));
    }

    public List v(V3.k kVar) {
        return (List) this.f6690g.g(new m(kVar));
    }

    public final List w(W3.d dVar, Y3.d dVar2, d4.n nVar, G g7) {
        v vVar = (v) dVar2.getValue();
        if (nVar == null && vVar != null) {
            nVar = vVar.d(V3.k.Y());
        }
        ArrayList arrayList = new ArrayList();
        dVar2.M().q(new f(nVar, g7, dVar, arrayList));
        if (vVar != null) {
            arrayList.addAll(vVar.b(dVar, g7, nVar));
        }
        return arrayList;
    }

    public final List x(W3.d dVar, Y3.d dVar2, d4.n nVar, G g7) {
        if (dVar.a().isEmpty()) {
            return w(dVar, dVar2, nVar, g7);
        }
        v vVar = (v) dVar2.getValue();
        if (nVar == null && vVar != null) {
            nVar = vVar.d(V3.k.Y());
        }
        ArrayList arrayList = new ArrayList();
        C1227b Z6 = dVar.a().Z();
        W3.d d7 = dVar.d(Z6);
        Y3.d dVar3 = (Y3.d) dVar2.M().d(Z6);
        if (dVar3 != null && d7 != null) {
            arrayList.addAll(x(d7, dVar3, nVar != null ? nVar.v(Z6) : null, g7.h(Z6)));
        }
        if (vVar != null) {
            arrayList.addAll(vVar.b(dVar, g7, nVar));
        }
        return arrayList;
    }

    public final List y(W3.d dVar) {
        return x(dVar, this.f6684a, null, this.f6685b.h(V3.k.Y()));
    }

    public List z(V3.k kVar, Map map) {
        return (List) this.f6690g.g(new l(map, kVar));
    }

    public static class q extends AbstractC0669h {

        /* renamed from: d, reason: collision with root package name */
        public a4.i f6746d;

        public q(a4.i iVar) {
            this.f6746d = iVar;
        }

        @Override // V3.AbstractC0669h
        public AbstractC0669h a(a4.i iVar) {
            return new q(iVar);
        }

        @Override // V3.AbstractC0669h
        public C0748d b(C0747c c0747c, a4.i iVar) {
            return null;
        }

        @Override // V3.AbstractC0669h
        public a4.i e() {
            return this.f6746d;
        }

        public boolean equals(Object obj) {
            return (obj instanceof q) && ((q) obj).f6746d.equals(this.f6746d);
        }

        @Override // V3.AbstractC0669h
        public boolean f(AbstractC0669h abstractC0669h) {
            return abstractC0669h instanceof q;
        }

        public int hashCode() {
            return this.f6746d.hashCode();
        }

        @Override // V3.AbstractC0669h
        public boolean i(InterfaceC0749e.a aVar) {
            return false;
        }

        @Override // V3.AbstractC0669h
        public void c(Q3.c cVar) {
        }

        @Override // V3.AbstractC0669h
        public void d(C0748d c0748d) {
        }
    }
}
