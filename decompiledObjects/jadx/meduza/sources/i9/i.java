package i9;

import ia.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ka.a0;
import ka.e0;
import ka.k;
import ka.p;
import l9.a;
import l9.b;
import l9.c;
import l9.d;
import l9.e;
import ma.n1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final m9.e0 f7695a;

    public i(m9.e0 e0Var) {
        this.f7695a = e0Var;
    }

    public static ArrayList a(ia.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (a.b bVar : aVar.I()) {
            j9.l t = j9.l.t(bVar.J());
            int i10 = 2;
            if (q0.g.b(bVar.L(), 2)) {
                i10 = 3;
            } else if (bVar.K().equals(a.b.c.ASCENDING)) {
                i10 = 1;
            }
            arrayList.add(new j9.d(t, i10));
        }
        return arrayList;
    }

    public final j9.m b(l9.a aVar) {
        int c10 = q0.g.c(aVar.L());
        if (c10 == 0) {
            l9.b N = aVar.N();
            boolean M = aVar.M();
            j9.i b10 = this.f7695a.b(N.J());
            m9.e0 e0Var = this.f7695a;
            n1 K = N.K();
            e0Var.getClass();
            j9.m n2 = j9.m.n(b10, m9.e0.f(K));
            if (M) {
                n2.f8697g = 2;
            }
            return n2;
        }
        if (c10 == 1) {
            ka.k K2 = aVar.K();
            boolean M2 = aVar.M();
            j9.i b11 = this.f7695a.b(K2.L());
            m9.e0 e0Var2 = this.f7695a;
            n1 M3 = K2.M();
            e0Var2.getClass();
            j9.q f = m9.e0.f(M3);
            j9.n e10 = j9.n.e(K2.K());
            j9.m mVar = new j9.m(b11);
            mVar.k(f, e10);
            if (M2) {
                mVar.f8697g = 2;
            }
            return mVar;
        }
        if (c10 != 2) {
            x6.b.T("Unknown MaybeDocument %s", aVar);
            throw null;
        }
        l9.d O = aVar.O();
        j9.i b12 = this.f7695a.b(O.J());
        m9.e0 e0Var3 = this.f7695a;
        n1 K3 = O.K();
        e0Var3.getClass();
        j9.q f10 = m9.e0.f(K3);
        j9.m mVar2 = new j9.m(b12);
        mVar2.f8695d = f10;
        mVar2.f8694c = 4;
        mVar2.f = new j9.n();
        mVar2.f8697g = 2;
        return mVar2;
    }

    public final k9.g c(l9.e eVar) {
        int M = eVar.M();
        m9.e0 e0Var = this.f7695a;
        n1 N = eVar.N();
        e0Var.getClass();
        u7.m mVar = new u7.m(N.J(), N.K());
        int L = eVar.L();
        ArrayList arrayList = new ArrayList(L);
        for (int i10 = 0; i10 < L; i10++) {
            arrayList.add(this.f7695a.c(eVar.K(i10)));
        }
        ArrayList arrayList2 = new ArrayList(eVar.P());
        int i11 = 0;
        while (i11 < eVar.P()) {
            ka.e0 O = eVar.O(i11);
            int i12 = i11 + 1;
            if (i12 < eVar.P() && eVar.O(i12).V()) {
                x6.b.Z("TransformMutation should be preceded by a patch or set mutation", eVar.O(i11).W(), new Object[0]);
                e0.a Z = ka.e0.Z(O);
                for (p.b bVar : eVar.O(i12).P().H()) {
                    Z.m();
                    ka.e0.H((ka.e0) Z.f11120b, bVar);
                }
                arrayList2.add(this.f7695a.c(Z.k()));
                i11 = i12;
            } else {
                arrayList2.add(this.f7695a.c(O));
            }
            i11++;
        }
        return new k9.g(M, mVar, arrayList, arrayList2);
    }

    public final m1 d(l9.c cVar) {
        g9.k0 e10;
        int U = cVar.U();
        m9.e0 e0Var = this.f7695a;
        n1 T = cVar.T();
        e0Var.getClass();
        j9.q f = m9.e0.f(T);
        m9.e0 e0Var2 = this.f7695a;
        n1 P = cVar.P();
        e0Var2.getClass();
        j9.q f10 = m9.e0.f(P);
        ma.h S = cVar.S();
        long Q = cVar.Q();
        int ordinal = cVar.V().ordinal();
        if (ordinal == 0) {
            m9.e0 e0Var3 = this.f7695a;
            a0.c R = cVar.R();
            e0Var3.getClass();
            e10 = m9.e0.e(R.J(), R.K());
        } else {
            if (ordinal != 1) {
                x6.b.T("Unknown targetType %d", cVar.V());
                throw null;
            }
            m9.e0 e0Var4 = this.f7695a;
            a0.b O = cVar.O();
            e0Var4.getClass();
            int J = O.J();
            x6.b.Z("DocumentsTarget contained other than 1 document %d", J == 1, Integer.valueOf(J));
            j9.o t = j9.o.t(O.I());
            x6.b.Z("Tried to deserialize invalid key %s", m9.e0.q(t), t);
            e10 = new g9.f0(t.q() == 4 ? j9.o.f8700b : m9.e0.p(t), null).i();
        }
        return new m1(e10, U, Q, e0.LISTEN, f, f10, S, null);
    }

    public final l9.a e(j9.g gVar) {
        a.C0145a P = l9.a.P();
        if (gVar.h()) {
            b.a L = l9.b.L();
            String j10 = this.f7695a.j(gVar.getKey());
            L.m();
            l9.b.G((l9.b) L.f11120b, j10);
            m9.e0 e0Var = this.f7695a;
            u7.m mVar = gVar.j().f8702a;
            e0Var.getClass();
            n1 n2 = m9.e0.n(mVar);
            L.m();
            l9.b.H((l9.b) L.f11120b, n2);
            l9.b k10 = L.k();
            P.m();
            l9.a.H((l9.a) P.f11120b, k10);
        } else if (gVar.b()) {
            k.a N = ka.k.N();
            String j11 = this.f7695a.j(gVar.getKey());
            N.m();
            ka.k.G((ka.k) N.f11120b, j11);
            Map<String, ka.d0> J = gVar.getData().b().Y().J();
            N.m();
            ka.k.H((ka.k) N.f11120b).putAll(J);
            u7.m mVar2 = gVar.j().f8702a;
            this.f7695a.getClass();
            n1 n10 = m9.e0.n(mVar2);
            N.m();
            ka.k.I((ka.k) N.f11120b, n10);
            ka.k k11 = N.k();
            P.m();
            l9.a.I((l9.a) P.f11120b, k11);
        } else {
            if (!gVar.i()) {
                x6.b.T("Cannot encode invalid document %s", gVar);
                throw null;
            }
            d.a L2 = l9.d.L();
            String j12 = this.f7695a.j(gVar.getKey());
            L2.m();
            l9.d.G((l9.d) L2.f11120b, j12);
            m9.e0 e0Var2 = this.f7695a;
            u7.m mVar3 = gVar.j().f8702a;
            e0Var2.getClass();
            n1 n11 = m9.e0.n(mVar3);
            L2.m();
            l9.d.H((l9.d) L2.f11120b, n11);
            l9.d k12 = L2.k();
            P.m();
            l9.a.J((l9.a) P.f11120b, k12);
        }
        boolean c10 = gVar.c();
        P.m();
        l9.a.G((l9.a) P.f11120b, c10);
        return P.k();
    }

    public final l9.e f(k9.g gVar) {
        e.a Q = l9.e.Q();
        int i10 = gVar.f9153a;
        Q.m();
        l9.e.G((l9.e) Q.f11120b, i10);
        m9.e0 e0Var = this.f7695a;
        u7.m mVar = gVar.f9154b;
        e0Var.getClass();
        n1 n2 = m9.e0.n(mVar);
        Q.m();
        l9.e.J((l9.e) Q.f11120b, n2);
        Iterator<k9.f> it = gVar.f9155c.iterator();
        while (it.hasNext()) {
            ka.e0 k10 = this.f7695a.k(it.next());
            Q.m();
            l9.e.H((l9.e) Q.f11120b, k10);
        }
        Iterator<k9.f> it2 = gVar.f9156d.iterator();
        while (it2.hasNext()) {
            ka.e0 k11 = this.f7695a.k(it2.next());
            Q.m();
            l9.e.I((l9.e) Q.f11120b, k11);
        }
        return Q.k();
    }

    public final l9.c g(m1 m1Var) {
        e0 e0Var = e0.LISTEN;
        x6.b.Z("Only queries with purpose %s may be stored, got %s", e0Var.equals(m1Var.f7737d), e0Var, m1Var.f7737d);
        c.a W = l9.c.W();
        int i10 = m1Var.f7735b;
        W.m();
        l9.c.K((l9.c) W.f11120b, i10);
        long j10 = m1Var.f7736c;
        W.m();
        l9.c.N((l9.c) W.f11120b, j10);
        m9.e0 e0Var2 = this.f7695a;
        j9.q qVar = m1Var.f;
        e0Var2.getClass();
        n1 n2 = m9.e0.n(qVar.f8702a);
        W.m();
        l9.c.I((l9.c) W.f11120b, n2);
        m9.e0 e0Var3 = this.f7695a;
        j9.q qVar2 = m1Var.f7738e;
        e0Var3.getClass();
        n1 n10 = m9.e0.n(qVar2.f8702a);
        W.m();
        l9.c.L((l9.c) W.f11120b, n10);
        ma.h hVar = m1Var.f7739g;
        W.m();
        l9.c.M((l9.c) W.f11120b, hVar);
        g9.k0 k0Var = m1Var.f7734a;
        if (k0Var.e()) {
            m9.e0 e0Var4 = this.f7695a;
            e0Var4.getClass();
            a0.b.a K = a0.b.K();
            String m10 = m9.e0.m(e0Var4.f10778a, k0Var.f6007d);
            K.m();
            a0.b.G((a0.b) K.f11120b, m10);
            a0.b k10 = K.k();
            W.m();
            l9.c.H((l9.c) W.f11120b, k10);
        } else {
            a0.c l10 = this.f7695a.l(k0Var);
            W.m();
            l9.c.G((l9.c) W.f11120b, l10);
        }
        return W.k();
    }
}
