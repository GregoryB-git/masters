package g9;

import eb.e1;
import g9.f;
import i9.k1;
import i9.q;
import m9.h0;

/* loaded from: classes.dex */
public class b0 extends f {

    public class a implements h0.a {
        public a() {
        }

        @Override // m9.h0.a
        public final void a(k9.h hVar) {
            b0.this.i().a(hVar);
        }

        @Override // m9.h0.a
        public final void b(d0 d0Var) {
            b0.this.i().b(d0Var);
        }

        @Override // m9.h0.a
        public final void c(m9.d0 d0Var) {
            b0.this.i().c(d0Var);
        }

        @Override // m9.h0.a
        public final t8.e<j9.i> d(int i10) {
            return b0.this.i().d(i10);
        }

        @Override // m9.h0.a
        public final void e(int i10, e1 e1Var) {
            b0.this.i().e(i10, e1Var);
        }

        @Override // m9.h0.a
        public final void f(int i10, e1 e1Var) {
            b0.this.i().f(i10, e1Var);
        }
    }

    public b0(com.google.firebase.firestore.g gVar) {
        super(gVar);
    }

    @Override // g9.f
    public final k a() {
        return new k(i());
    }

    @Override // g9.f
    public k1 b(f.a aVar) {
        return null;
    }

    @Override // g9.f
    public i9.e c(f.a aVar) {
        return null;
    }

    @Override // g9.f
    public final i9.n d(f.a aVar) {
        e9.a aVar2 = this.f5933c;
        x6.b.a0(aVar2, "persistence not initialized yet", new Object[0]);
        return new i9.n(aVar2, new i9.d0(), aVar.f5942d);
    }

    @Override // g9.f
    public e9.a e(f.a aVar) {
        d9.e0 e0Var = this.f5931a.f3178e;
        if (!((e0Var == null || !(e0Var instanceof d9.f0)) ? false : ((d9.f0) e0Var).f3668a instanceof d9.i0)) {
            i9.w wVar = new i9.w();
            wVar.f7832i = new r3.a0(wVar);
            return wVar;
        }
        m9.e0 e0Var2 = this.f5932b.f10757b;
        x6.b.a0(e0Var2, "remoteSerializer not initialized yet", new Object[0]);
        i9.i iVar = new i9.i(e0Var2);
        q.b bVar = new q.b(this.f5931a.a());
        i9.w wVar2 = new i9.w();
        wVar2.f7832i = new i9.u(wVar2, bVar, iVar);
        return wVar2;
    }

    @Override // g9.f
    public final m9.h0 f(f.a aVar) {
        j9.f fVar = aVar.f5941c.f5964a;
        a aVar2 = new a();
        i9.n h10 = h();
        m9.j jVar = this.f5932b.f10759d;
        x6.b.a0(jVar, "datastore not initialized yet", new Object[0]);
        n9.a aVar3 = aVar.f5940b;
        m9.d dVar = this.f5932b.f10760e;
        x6.b.a0(dVar, "connectivityMonitor not initialized yet", new Object[0]);
        return new m9.h0(fVar, aVar2, h10, jVar, aVar3, dVar);
    }

    @Override // g9.f
    public final j0 g(f.a aVar) {
        i9.n h10 = h();
        m9.h0 h0Var = this.f;
        x6.b.a0(h0Var, "remoteStore not initialized yet", new Object[0]);
        return new j0(h10, h0Var, aVar.f5942d, 100);
    }
}
