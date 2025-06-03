package V3;

import a4.C0745a;
import d4.C1227b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class F {

    /* renamed from: d, reason: collision with root package name */
    public static final Y3.i f6486d = new b();

    /* renamed from: a, reason: collision with root package name */
    public C0663b f6487a = C0663b.s();

    /* renamed from: b, reason: collision with root package name */
    public List f6488b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Long f6489c = -1L;

    public class a implements Y3.i {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f6490b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f6491c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f6492d;

        public a(boolean z7, List list, k kVar) {
            this.f6490b = z7;
            this.f6491c = list;
            this.f6492d = kVar;
        }

        @Override // Y3.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(B b7) {
            return (b7.f() || this.f6490b) && !this.f6491c.contains(Long.valueOf(b7.d())) && (b7.c().W(this.f6492d) || this.f6492d.W(b7.c()));
        }
    }

    public class b implements Y3.i {
        @Override // Y3.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(B b7) {
            return b7.f();
        }
    }

    public static C0663b j(List list, Y3.i iVar, k kVar) {
        k b02;
        d4.n b7;
        k b03;
        C0663b s7 = C0663b.s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B b8 = (B) it.next();
            if (iVar.a(b8)) {
                k c7 = b8.c();
                if (!b8.e()) {
                    if (kVar.W(c7)) {
                        b03 = k.b0(kVar, c7);
                    } else if (c7.W(kVar)) {
                        k b04 = k.b0(c7, kVar);
                        if (b04.isEmpty()) {
                            b03 = k.Y();
                        } else {
                            b7 = b8.a().T(b04);
                            if (b7 != null) {
                                b02 = k.Y();
                                s7 = s7.a(b02, b7);
                            }
                        }
                    }
                    s7 = s7.f(b03, b8.a());
                } else if (kVar.W(c7)) {
                    b02 = k.b0(kVar, c7);
                    b7 = b8.b();
                    s7 = s7.a(b02, b7);
                } else if (c7.W(kVar)) {
                    s7 = s7.a(k.Y(), b8.b().A(k.b0(c7, kVar)));
                }
            }
        }
        return s7;
    }

    public void a(k kVar, C0663b c0663b, Long l7) {
        Y3.m.f(l7.longValue() > this.f6489c.longValue());
        this.f6488b.add(new B(l7.longValue(), kVar, c0663b));
        this.f6487a = this.f6487a.f(kVar, c0663b);
        this.f6489c = l7;
    }

    public void b(k kVar, d4.n nVar, Long l7, boolean z7) {
        Y3.m.f(l7.longValue() > this.f6489c.longValue());
        this.f6488b.add(new B(l7.longValue(), kVar, nVar, z7));
        if (z7) {
            this.f6487a = this.f6487a.a(kVar, nVar);
        }
        this.f6489c = l7;
    }

    public d4.n c(k kVar, C1227b c1227b, C0745a c0745a) {
        k U6 = kVar.U(c1227b);
        d4.n T6 = this.f6487a.T(U6);
        if (T6 != null) {
            return T6;
        }
        if (c0745a.c(c1227b)) {
            return this.f6487a.k(U6).g(c0745a.b().v(c1227b));
        }
        return null;
    }

    public d4.n d(k kVar, d4.n nVar, List list, boolean z7) {
        if (list.isEmpty() && !z7) {
            d4.n T6 = this.f6487a.T(kVar);
            if (T6 != null) {
                return T6;
            }
            C0663b k7 = this.f6487a.k(kVar);
            if (k7.isEmpty()) {
                return nVar;
            }
            if (nVar == null && !k7.V(k.Y())) {
                return null;
            }
            if (nVar == null) {
                nVar = d4.g.W();
            }
            return k7.g(nVar);
        }
        C0663b k8 = this.f6487a.k(kVar);
        if (!z7 && k8.isEmpty()) {
            return nVar;
        }
        if (!z7 && nVar == null && !k8.V(k.Y())) {
            return null;
        }
        C0663b j7 = j(this.f6488b, new a(z7, list, kVar), kVar);
        if (nVar == null) {
            nVar = d4.g.W();
        }
        return j7.g(nVar);
    }

    public d4.n e(k kVar, d4.n nVar) {
        d4.n W6 = d4.g.W();
        d4.n<d4.m> T6 = this.f6487a.T(kVar);
        if (T6 != null) {
            if (!T6.B()) {
                for (d4.m mVar : T6) {
                    W6 = W6.N(mVar.c(), mVar.d());
                }
            }
            return W6;
        }
        C0663b k7 = this.f6487a.k(kVar);
        Iterator it = nVar.iterator();
        while (it.hasNext()) {
            d4.m mVar2 = (d4.m) it.next();
            W6 = W6.N(mVar2.c(), k7.k(new k(mVar2.c())).g(mVar2.d()));
        }
        for (d4.m mVar3 : k7.S()) {
            W6 = W6.N(mVar3.c(), mVar3.d());
        }
        return W6;
    }

    public d4.n f(k kVar, k kVar2, d4.n nVar, d4.n nVar2) {
        Y3.m.g((nVar == null && nVar2 == null) ? false : true, "Either existingEventSnap or existingServerSnap must exist");
        k T6 = kVar.T(kVar2);
        if (this.f6487a.V(T6)) {
            return null;
        }
        C0663b k7 = this.f6487a.k(T6);
        return k7.isEmpty() ? nVar2.A(kVar2) : k7.g(nVar2.A(kVar2));
    }

    public d4.m g(k kVar, d4.n nVar, d4.m mVar, boolean z7, d4.h hVar) {
        C0663b k7 = this.f6487a.k(kVar);
        d4.n<d4.m> T6 = k7.T(k.Y());
        d4.m mVar2 = null;
        if (T6 == null) {
            if (nVar != null) {
                T6 = k7.g(nVar);
            }
            return mVar2;
        }
        for (d4.m mVar3 : T6) {
            if (hVar.a(mVar3, mVar, z7) > 0 && (mVar2 == null || hVar.a(mVar3, mVar2, z7) < 0)) {
                mVar2 = mVar3;
            }
        }
        return mVar2;
    }

    public G h(k kVar) {
        return new G(kVar, this);
    }

    public B i(long j7) {
        for (B b7 : this.f6488b) {
            if (b7.d() == j7) {
                return b7;
            }
        }
        return null;
    }

    public List k() {
        ArrayList arrayList = new ArrayList(this.f6488b);
        this.f6487a = C0663b.s();
        this.f6488b = new ArrayList();
        return arrayList;
    }

    public final boolean l(B b7, k kVar) {
        if (b7.e()) {
            return b7.c().W(kVar);
        }
        Iterator it = b7.a().iterator();
        while (it.hasNext()) {
            if (b7.c().T((k) ((Map.Entry) it.next()).getKey()).W(kVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean m(long j7) {
        B b7;
        Iterator it = this.f6488b.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                b7 = null;
                break;
            }
            b7 = (B) it.next();
            if (b7.d() == j7) {
                break;
            }
            i7++;
        }
        Y3.m.g(b7 != null, "removeWrite called with nonexistent writeId");
        this.f6488b.remove(b7);
        boolean f7 = b7.f();
        boolean z7 = false;
        for (int size = this.f6488b.size() - 1; f7 && size >= 0; size--) {
            B b8 = (B) this.f6488b.get(size);
            if (b8.f()) {
                if (size >= i7 && l(b8, b7.c())) {
                    f7 = false;
                } else if (b7.c().W(b8.c())) {
                    z7 = true;
                }
            }
        }
        if (!f7) {
            return false;
        }
        if (z7) {
            n();
            return true;
        }
        if (b7.e()) {
            this.f6487a = this.f6487a.W(b7.c());
        } else {
            Iterator it2 = b7.a().iterator();
            while (it2.hasNext()) {
                this.f6487a = this.f6487a.W(b7.c().T((k) ((Map.Entry) it2.next()).getKey()));
            }
        }
        return true;
    }

    public final void n() {
        long j7;
        this.f6487a = j(this.f6488b, f6486d, k.Y());
        if (this.f6488b.size() > 0) {
            j7 = ((B) this.f6488b.get(r0.size() - 1)).d();
        } else {
            j7 = -1;
        }
        this.f6489c = Long.valueOf(j7);
    }

    public d4.n o(k kVar) {
        return this.f6487a.T(kVar);
    }
}
