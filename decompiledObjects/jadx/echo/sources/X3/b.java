package X3;

import V3.AbstractC0667f;
import V3.C0663b;
import V3.k;
import Y3.m;
import a4.C0745a;
import c4.C0851c;
import d4.C1227b;
import d4.n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final f f7227a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7228b;

    /* renamed from: c, reason: collision with root package name */
    public final C0851c f7229c;

    /* renamed from: d, reason: collision with root package name */
    public final a f7230d;

    /* renamed from: e, reason: collision with root package name */
    public long f7231e;

    public b(AbstractC0667f abstractC0667f, f fVar, a aVar) {
        this(abstractC0667f, fVar, aVar, new Y3.b());
    }

    @Override // X3.e
    public void a() {
        this.f7227a.a();
    }

    @Override // X3.e
    public void b(long j7) {
        this.f7227a.b(j7);
    }

    @Override // X3.e
    public void c(k kVar, C0663b c0663b, long j7) {
        this.f7227a.c(kVar, c0663b, j7);
    }

    @Override // X3.e
    public List d() {
        return this.f7227a.d();
    }

    @Override // X3.e
    public void e(k kVar, n nVar, long j7) {
        this.f7227a.e(kVar, nVar, j7);
    }

    @Override // X3.e
    public void f(k kVar, C0663b c0663b) {
        this.f7227a.o(kVar, c0663b);
        q();
    }

    @Override // X3.e
    public Object g(Callable callable) {
        this.f7227a.g();
        try {
            Object call = callable.call();
            this.f7227a.p();
            return call;
        } finally {
        }
    }

    @Override // X3.e
    public void h(k kVar, C0663b c0663b) {
        Iterator it = c0663b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n(kVar.T((k) entry.getKey()), (n) entry.getValue());
        }
    }

    @Override // X3.e
    public void i(a4.i iVar) {
        this.f7228b.x(iVar);
    }

    @Override // X3.e
    public void j(a4.i iVar, n nVar) {
        if (iVar.g()) {
            this.f7227a.t(iVar.e(), nVar);
        } else {
            this.f7227a.s(iVar.e(), nVar);
        }
        p(iVar);
        q();
    }

    @Override // X3.e
    public C0745a k(a4.i iVar) {
        Set<C1227b> j7;
        boolean z7;
        if (this.f7228b.n(iVar)) {
            h i7 = this.f7228b.i(iVar);
            j7 = (iVar.g() || i7 == null || !i7.f7244d) ? null : this.f7227a.i(i7.f7241a);
            z7 = true;
        } else {
            j7 = this.f7228b.j(iVar.e());
            z7 = false;
        }
        n q7 = this.f7227a.q(iVar.e());
        if (j7 == null) {
            return new C0745a(d4.i.f(q7, iVar.c()), z7, false);
        }
        n W6 = d4.g.W();
        for (C1227b c1227b : j7) {
            W6 = W6.N(c1227b, q7.v(c1227b));
        }
        return new C0745a(d4.i.f(W6, iVar.c()), z7, true);
    }

    @Override // X3.e
    public void l(a4.i iVar, Set set, Set set2) {
        m.g(!iVar.g(), "We should only track keys for filtered queries.");
        h i7 = this.f7228b.i(iVar);
        m.g(i7 != null && i7.f7245e, "We only expect tracked keys for currently-active queries.");
        this.f7227a.r(i7.f7241a, set, set2);
    }

    @Override // X3.e
    public void m(a4.i iVar) {
        this.f7228b.u(iVar);
    }

    @Override // X3.e
    public void n(k kVar, n nVar) {
        if (this.f7228b.l(kVar)) {
            return;
        }
        this.f7227a.t(kVar, nVar);
        this.f7228b.g(kVar);
    }

    @Override // X3.e
    public void o(a4.i iVar, Set set) {
        m.g(!iVar.g(), "We should only track keys for filtered queries.");
        h i7 = this.f7228b.i(iVar);
        m.g(i7 != null && i7.f7245e, "We only expect tracked keys for currently-active queries.");
        this.f7227a.k(i7.f7241a, set);
    }

    @Override // X3.e
    public void p(a4.i iVar) {
        if (iVar.g()) {
            this.f7228b.t(iVar.e());
        } else {
            this.f7228b.w(iVar);
        }
    }

    public final void q() {
        long j7 = this.f7231e + 1;
        this.f7231e = j7;
        if (this.f7230d.d(j7)) {
            if (this.f7229c.f()) {
                this.f7229c.b("Reached prune check threshold.", new Object[0]);
            }
            this.f7231e = 0L;
            long l7 = this.f7227a.l();
            if (this.f7229c.f()) {
                this.f7229c.b("Cache size: " + l7, new Object[0]);
            }
            boolean z7 = true;
            while (z7 && this.f7230d.a(l7, this.f7228b.f())) {
                g p7 = this.f7228b.p(this.f7230d);
                if (p7.e()) {
                    this.f7227a.m(k.Y(), p7);
                } else {
                    z7 = false;
                }
                l7 = this.f7227a.l();
                if (this.f7229c.f()) {
                    this.f7229c.b("Cache size after prune: " + l7, new Object[0]);
                }
            }
        }
    }

    public b(AbstractC0667f abstractC0667f, f fVar, a aVar, Y3.a aVar2) {
        this.f7231e = 0L;
        this.f7227a = fVar;
        C0851c q7 = abstractC0667f.q("Persistence");
        this.f7229c = q7;
        this.f7228b = new i(fVar, q7, aVar2);
        this.f7230d = aVar;
    }
}
