package Q3;

import A2.AbstractC0327m;
import V2.AbstractC0659j;
import V3.AbstractC0669h;
import V3.C0662a;
import V3.D;
import V3.H;
import d4.C1226a;
import d4.C1227b;
import d4.t;
import d4.u;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final V3.m f4398a;

    /* renamed from: b, reason: collision with root package name */
    public final V3.k f4399b;

    /* renamed from: c, reason: collision with root package name */
    public final a4.h f4400c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4401d;

    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ AbstractC0669h f4402o;

        public a(AbstractC0669h abstractC0669h) {
            this.f4402o = abstractC0669h;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f4398a.b0(this.f4402o);
        }
    }

    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ AbstractC0669h f4404o;

        public b(AbstractC0669h abstractC0669h) {
            this.f4404o = abstractC0669h;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f4398a.D(this.f4404o);
        }
    }

    public class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f4406o;

        public c(boolean z7) {
            this.f4406o = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.f4398a.Q(pVar.u(), this.f4406o);
        }
    }

    public p(V3.m mVar, V3.k kVar) {
        this.f4398a = mVar;
        this.f4399b = kVar;
        this.f4400c = a4.h.f8107i;
        this.f4401d = false;
    }

    public p A() {
        U();
        a4.h w7 = this.f4400c.w(d4.q.j());
        V(w7);
        return new p(this.f4398a, this.f4399b, w7, true);
    }

    public p B() {
        U();
        return new p(this.f4398a, this.f4399b, this.f4400c.w(u.j()), true);
    }

    public void C(Q3.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("listener must not be null");
        }
        E(new C0662a(this.f4398a, aVar, u()));
    }

    public void D(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("listener must not be null");
        }
        E(new D(this.f4398a, sVar, u()));
    }

    public final void E(AbstractC0669h abstractC0669h) {
        H.b().e(abstractC0669h);
        this.f4398a.i0(new a(abstractC0669h));
    }

    public p F(double d7) {
        return N(d7, C1227b.m().e());
    }

    public p G(double d7, String str) {
        return H(new d4.f(Double.valueOf(d7), d4.r.a()), str);
    }

    public final p H(d4.n nVar, String str) {
        return O(nVar, Y3.j.b(str));
    }

    public p I(String str) {
        return (str == null || !this.f4400c.d().equals(d4.j.j())) ? Q(str, C1227b.m().e()) : P(Y3.j.b(str));
    }

    public p J(String str, String str2) {
        if (str != null && this.f4400c.d().equals(d4.j.j())) {
            str = Y3.j.b(str);
        }
        return H(str != null ? new t(str, d4.r.a()) : d4.g.W(), str2);
    }

    public p K(boolean z7) {
        return S(z7, C1227b.m().e());
    }

    public p L(boolean z7, String str) {
        return H(new C1226a(Boolean.valueOf(z7), d4.r.a()), str);
    }

    public p M(double d7) {
        return N(d7, null);
    }

    public p N(double d7, String str) {
        return O(new d4.f(Double.valueOf(d7), d4.r.a()), str);
    }

    public final p O(d4.n nVar, String str) {
        Y3.n.g(str);
        if (!nVar.B() && !nVar.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for startAt() and startAfter()");
        }
        if (this.f4400c.o()) {
            throw new IllegalArgumentException("Can't call startAt(), startAfte(), or equalTo() multiple times");
        }
        a4.h x7 = this.f4400c.x(nVar, str != null ? str.equals("[MIN_NAME]") ? C1227b.n() : str.equals("[MAX_KEY]") ? C1227b.m() : C1227b.j(str) : null);
        T(x7);
        V(x7);
        Y3.m.f(x7.q());
        return new p(this.f4398a, this.f4399b, x7, this.f4401d);
    }

    public p P(String str) {
        return Q(str, null);
    }

    public p Q(String str, String str2) {
        return O(str != null ? new t(str, d4.r.a()) : d4.g.W(), str2);
    }

    public p R(boolean z7) {
        return S(z7, null);
    }

    public p S(boolean z7, String str) {
        return O(new C1226a(Boolean.valueOf(z7), d4.r.a()), str);
    }

    public final void T(a4.h hVar) {
        if (hVar.o() && hVar.m() && hVar.n() && !hVar.l()) {
            throw new IllegalArgumentException("Can't combine startAt(), startAfter(), endAt(), endBefore(), and limit(). Use limitToFirst() or limitToLast() instead");
        }
    }

    public final void U() {
        if (this.f4401d) {
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
    }

    public final void V(a4.h hVar) {
        if (!hVar.d().equals(d4.j.j())) {
            if (hVar.d().equals(d4.q.j())) {
                if ((hVar.o() && !d4.r.b(hVar.h())) || (hVar.m() && !d4.r.b(hVar.f()))) {
                    throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities.");
                }
                return;
            }
            return;
        }
        if (hVar.o()) {
            d4.n h7 = hVar.h();
            if (!AbstractC0327m.a(hVar.g(), C1227b.n()) || !(h7 instanceof t)) {
                throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
            }
        }
        if (hVar.m()) {
            d4.n f7 = hVar.f();
            if (!hVar.e().equals(C1227b.m()) || !(f7 instanceof t)) {
                throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
            }
        }
    }

    public Q3.a a(Q3.a aVar) {
        b(new C0662a(this.f4398a, aVar, u()));
        return aVar;
    }

    public final void b(AbstractC0669h abstractC0669h) {
        H.b().c(abstractC0669h);
        this.f4398a.i0(new b(abstractC0669h));
    }

    public s c(s sVar) {
        b(new D(this.f4398a, sVar, u()));
        return sVar;
    }

    public p d(double d7) {
        return e(d7, null);
    }

    public p e(double d7, String str) {
        return f(new d4.f(Double.valueOf(d7), d4.r.a()), str);
    }

    public final p f(d4.n nVar, String str) {
        Y3.n.g(str);
        if (!nVar.B() && !nVar.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for endAt()");
        }
        C1227b j7 = str != null ? C1227b.j(str) : null;
        if (this.f4400c.m()) {
            throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
        }
        a4.h b7 = this.f4400c.b(nVar, j7);
        T(b7);
        V(b7);
        Y3.m.f(b7.q());
        return new p(this.f4398a, this.f4399b, b7, this.f4401d);
    }

    public p g(String str) {
        return h(str, null);
    }

    public p h(String str, String str2) {
        return f(str != null ? new t(str, d4.r.a()) : d4.g.W(), str2);
    }

    public p i(boolean z7) {
        return j(z7, null);
    }

    public p j(boolean z7, String str) {
        return f(new C1226a(Boolean.valueOf(z7), d4.r.a()), str);
    }

    public p k(double d7) {
        return e(d7, C1227b.n().e());
    }

    public p l(double d7, String str) {
        return m(new d4.f(Double.valueOf(d7), d4.r.a()), str);
    }

    public final p m(d4.n nVar, String str) {
        return f(nVar, Y3.j.a(str));
    }

    public p n(String str) {
        return (str == null || !this.f4400c.d().equals(d4.j.j())) ? h(str, C1227b.n().e()) : g(Y3.j.a(str));
    }

    public p o(String str, String str2) {
        if (str != null && this.f4400c.d().equals(d4.j.j())) {
            str = Y3.j.a(str);
        }
        return m(str != null ? new t(str, d4.r.a()) : d4.g.W(), str2);
    }

    public p p(boolean z7) {
        return j(z7, C1227b.n().e());
    }

    public p q(boolean z7, String str) {
        return m(new C1226a(Boolean.valueOf(z7), d4.r.a()), str);
    }

    public AbstractC0659j r() {
        return this.f4398a.O(this);
    }

    public V3.k s() {
        return this.f4399b;
    }

    public e t() {
        return new e(this.f4398a, s());
    }

    public a4.i u() {
        return new a4.i(this.f4399b, this.f4400c);
    }

    public void v(boolean z7) {
        if (!this.f4399b.isEmpty() && this.f4399b.Z().equals(C1227b.l())) {
            throw new d("Can't call keepSynced() on .info paths.");
        }
        this.f4398a.i0(new c(z7));
    }

    public p w(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        }
        if (this.f4400c.n()) {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
        return new p(this.f4398a, this.f4399b, this.f4400c.s(i7), this.f4401d);
    }

    public p x(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        }
        if (this.f4400c.n()) {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
        return new p(this.f4398a, this.f4399b, this.f4400c.t(i7), this.f4401d);
    }

    public p y(String str) {
        if (str == null) {
            throw new NullPointerException("Key can't be null");
        }
        if (str.equals("$key") || str.equals(".key")) {
            throw new IllegalArgumentException("Can't use '" + str + "' as path, please use orderByKey() instead!");
        }
        if (str.equals("$priority") || str.equals(".priority")) {
            throw new IllegalArgumentException("Can't use '" + str + "' as path, please use orderByPriority() instead!");
        }
        if (str.equals("$value") || str.equals(".value")) {
            throw new IllegalArgumentException("Can't use '" + str + "' as path, please use orderByValue() instead!");
        }
        Y3.n.h(str);
        U();
        V3.k kVar = new V3.k(str);
        if (kVar.size() == 0) {
            throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
        }
        return new p(this.f4398a, this.f4399b, this.f4400c.w(new d4.p(kVar)), true);
    }

    public p z() {
        U();
        a4.h w7 = this.f4400c.w(d4.j.j());
        V(w7);
        return new p(this.f4398a, this.f4399b, w7, true);
    }

    public p(V3.m mVar, V3.k kVar, a4.h hVar, boolean z7) {
        this.f4398a = mVar;
        this.f4399b = kVar;
        this.f4400c = hVar;
        this.f4401d = z7;
        Y3.m.g(hVar.q(), "Validation of queries failed.");
    }
}
