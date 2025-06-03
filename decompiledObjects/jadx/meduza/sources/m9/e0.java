package m9;

import g9.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k9.a;
import ka.a0;
import ka.b;
import ka.e0;
import ka.j;
import ka.k;
import ka.n;
import ka.p;
import ka.v;
import ka.z;
import ma.n1;
import ma.x;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final j9.f f10778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10779b;

    public e0(j9.f fVar) {
        this.f10778a = fVar;
        this.f10779b = o(fVar).h();
    }

    public static g9.m a(z.g gVar) {
        ka.d0 d0Var;
        ka.d0 d0Var2;
        l.a aVar = l.a.NOT_EQUAL;
        l.a aVar2 = l.a.EQUAL;
        int ordinal = gVar.M().ordinal();
        int i10 = 1;
        if (ordinal == 0) {
            z.c J = gVar.J();
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = J.J().iterator();
            while (it.hasNext()) {
                arrayList.add(a((z.g) it.next()));
            }
            int ordinal2 = J.K().ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    x6.b.T("Only AND and OR composite filter types are supported.", new Object[0]);
                    throw null;
                }
                i10 = 2;
            }
            return new g9.g(arrayList, i10);
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                x6.b.T("Unrecognized Filter.filterType %d", gVar.M());
                throw null;
            }
            z.j N = gVar.N();
            j9.l t = j9.l.t(N.J().I());
            int ordinal3 = N.K().ordinal();
            if (ordinal3 == 1) {
                d0Var = j9.s.f8707a;
            } else {
                if (ordinal3 != 2) {
                    if (ordinal3 == 3) {
                        d0Var2 = j9.s.f8707a;
                    } else {
                        if (ordinal3 != 4) {
                            x6.b.T("Unrecognized UnaryFilter.operator %d", N.K());
                            throw null;
                        }
                        d0Var2 = j9.s.f8708b;
                    }
                    return g9.l.e(t, aVar, d0Var2);
                }
                d0Var = j9.s.f8708b;
            }
            return g9.l.e(t, aVar2, d0Var);
        }
        z.e L = gVar.L();
        j9.l t10 = j9.l.t(L.K().I());
        z.e.b L2 = L.L();
        switch (L2.ordinal()) {
            case 1:
                aVar = l.a.LESS_THAN;
                break;
            case 2:
                aVar = l.a.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                aVar = l.a.GREATER_THAN;
                break;
            case 4:
                aVar = l.a.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                aVar = aVar2;
                break;
            case 6:
                break;
            case 7:
                aVar = l.a.ARRAY_CONTAINS;
                break;
            case 8:
                aVar = l.a.IN;
                break;
            case 9:
                aVar = l.a.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                aVar = l.a.NOT_IN;
                break;
            default:
                x6.b.T("Unhandled FieldFilter.operator %d", L2);
                throw null;
        }
        return g9.l.e(t10, aVar, L.M());
    }

    public static k9.i d(ka.h0 h0Var, j9.q qVar) {
        j9.q f = f(h0Var.I());
        if (!j9.q.f8701b.equals(f)) {
            qVar = f;
        }
        int H = h0Var.H();
        ArrayList arrayList = new ArrayList(H);
        for (int i10 = 0; i10 < H; i10++) {
            arrayList.add(h0Var.G(i10));
        }
        return new k9.i(qVar, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g9.k0 e(java.lang.String r13, ka.z r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.e0.e(java.lang.String, ka.z):g9.k0");
    }

    public static j9.q f(n1 n1Var) {
        if (n1Var.K() == 0 && n1Var.J() == 0) {
            return j9.q.f8701b;
        }
        return new j9.q(new u7.m(n1Var.J(), n1Var.K()));
    }

    public static z.f h(j9.l lVar) {
        z.f.a J = z.f.J();
        String h10 = lVar.h();
        J.m();
        z.f.G((z.f) J.f11120b, h10);
        return J.k();
    }

    public static z.g i(g9.m mVar) {
        z.c.b bVar;
        Object k10;
        z.j.b bVar2;
        z.g.a O;
        z.e.b bVar3;
        if (!(mVar instanceof g9.l)) {
            if (!(mVar instanceof g9.g)) {
                x6.b.T("Unrecognized filter type %s", mVar.toString());
                throw null;
            }
            g9.g gVar = (g9.g) mVar;
            ArrayList arrayList = new ArrayList(gVar.b().size());
            Iterator<g9.m> it = gVar.b().iterator();
            while (it.hasNext()) {
                arrayList.add(i(it.next()));
            }
            if (arrayList.size() == 1) {
                k10 = arrayList.get(0);
            } else {
                z.c.a L = z.c.L();
                int c10 = q0.g.c(gVar.f5957b);
                if (c10 == 0) {
                    bVar = z.c.b.AND;
                } else {
                    if (c10 != 1) {
                        x6.b.T("Unrecognized composite filter type.", new Object[0]);
                        throw null;
                    }
                    bVar = z.c.b.OR;
                }
                L.m();
                z.c.G((z.c) L.f11120b, bVar);
                L.m();
                z.c.H((z.c) L.f11120b, arrayList);
                z.g.a O2 = z.g.O();
                O2.m();
                z.g.I((z.g) O2.f11120b, L.k());
                k10 = O2.k();
            }
            return (z.g) k10;
        }
        g9.l lVar = (g9.l) mVar;
        l.a aVar = lVar.f6011a;
        l.a aVar2 = l.a.EQUAL;
        if (aVar == aVar2 || aVar == l.a.NOT_EQUAL) {
            z.j.a L2 = z.j.L();
            z.f h10 = h(lVar.f6013c);
            L2.m();
            z.j.H((z.j) L2.f11120b, h10);
            ka.d0 d0Var = lVar.f6012b;
            ka.d0 d0Var2 = j9.s.f8707a;
            if (d0Var != null && Double.isNaN(d0Var.V())) {
                bVar2 = lVar.f6011a == aVar2 ? z.j.b.IS_NAN : z.j.b.IS_NOT_NAN;
            } else {
                ka.d0 d0Var3 = lVar.f6012b;
                if (d0Var3 != null && d0Var3.c0() == 1) {
                    bVar2 = lVar.f6011a == aVar2 ? z.j.b.IS_NULL : z.j.b.IS_NOT_NULL;
                }
            }
            L2.m();
            z.j.G((z.j) L2.f11120b, bVar2);
            O = z.g.O();
            O.m();
            z.g.G((z.g) O.f11120b, L2.k());
            return O.k();
        }
        z.e.a N = z.e.N();
        z.f h11 = h(lVar.f6013c);
        N.m();
        z.e.G((z.e) N.f11120b, h11);
        l.a aVar3 = lVar.f6011a;
        switch (aVar3) {
            case LESS_THAN:
                bVar3 = z.e.b.LESS_THAN;
                break;
            case LESS_THAN_OR_EQUAL:
                bVar3 = z.e.b.LESS_THAN_OR_EQUAL;
                break;
            case EQUAL:
                bVar3 = z.e.b.EQUAL;
                break;
            case NOT_EQUAL:
                bVar3 = z.e.b.NOT_EQUAL;
                break;
            case GREATER_THAN:
                bVar3 = z.e.b.GREATER_THAN;
                break;
            case GREATER_THAN_OR_EQUAL:
                bVar3 = z.e.b.GREATER_THAN_OR_EQUAL;
                break;
            case ARRAY_CONTAINS:
                bVar3 = z.e.b.ARRAY_CONTAINS;
                break;
            case ARRAY_CONTAINS_ANY:
                bVar3 = z.e.b.ARRAY_CONTAINS_ANY;
                break;
            case IN:
                bVar3 = z.e.b.IN;
                break;
            case NOT_IN:
                bVar3 = z.e.b.NOT_IN;
                break;
            default:
                x6.b.T("Unknown operator %d", aVar3);
                throw null;
        }
        N.m();
        z.e.H((z.e) N.f11120b, bVar3);
        ka.d0 d0Var4 = lVar.f6012b;
        N.m();
        z.e.I((z.e) N.f11120b, d0Var4);
        O = z.g.O();
        O.m();
        z.g.F((z.g) O.f11120b, N.k());
        return O.k();
    }

    public static String m(j9.f fVar, j9.o oVar) {
        return o(fVar).g("documents").f(oVar).h();
    }

    public static n1 n(u7.m mVar) {
        n1.a L = n1.L();
        L.p(mVar.f15102a);
        int i10 = mVar.f15103b;
        L.m();
        n1.H((n1) L.f11120b, i10);
        return L.k();
    }

    public static j9.o o(j9.f fVar) {
        List asList = Arrays.asList("projects", fVar.f8678a, "databases", fVar.f8679b);
        j9.o oVar = j9.o.f8700b;
        return asList.isEmpty() ? j9.o.f8700b : new j9.o(asList);
    }

    public static j9.o p(j9.o oVar) {
        x6.b.Z("Tried to deserialize invalid key %s", oVar.q() > 4 && oVar.n(4).equals("documents"), oVar);
        return (j9.o) oVar.r();
    }

    public static boolean q(j9.o oVar) {
        return oVar.q() >= 4 && oVar.n(0).equals("projects") && oVar.n(2).equals("databases");
    }

    public final j9.i b(String str) {
        j9.o t = j9.o.t(str);
        x6.b.Z("Tried to deserialize invalid key %s", q(t), t);
        x6.b.Z("Tried to deserialize key from different project.", t.n(1).equals(this.f10778a.f8678a), new Object[0]);
        x6.b.Z("Tried to deserialize key from different database.", t.n(3).equals(this.f10778a.f8679b), new Object[0]);
        return new j9.i(p(t));
    }

    public final k9.f c(ka.e0 e0Var) {
        k9.m mVar;
        k9.e eVar;
        if (e0Var.U()) {
            ka.v M = e0Var.M();
            int c10 = q0.g.c(M.I());
            if (c10 == 0) {
                mVar = k9.m.a(M.K());
            } else if (c10 == 1) {
                mVar = new k9.m(f(M.L()), null);
            } else {
                if (c10 != 2) {
                    x6.b.T("Unknown precondition", new Object[0]);
                    throw null;
                }
                mVar = k9.m.f9167c;
            }
        } else {
            mVar = k9.m.f9167c;
        }
        k9.m mVar2 = mVar;
        ArrayList arrayList = new ArrayList();
        for (p.b bVar : e0Var.S()) {
            int c11 = q0.g.c(bVar.Q());
            if (c11 == 0) {
                x6.b.Z("Unknown transform setToServerValue: %s", bVar.P() == p.b.EnumC0134b.REQUEST_TIME, bVar.P());
                eVar = new k9.e(j9.l.t(bVar.M()), k9.n.f9170a);
            } else if (c11 == 1) {
                eVar = new k9.e(j9.l.t(bVar.M()), new k9.j(bVar.N()));
            } else if (c11 == 4) {
                eVar = new k9.e(j9.l.t(bVar.M()), new a.b(bVar.L().h()));
            } else {
                if (c11 != 5) {
                    x6.b.T("Unknown FieldTransform proto: %s", bVar);
                    throw null;
                }
                eVar = new k9.e(j9.l.t(bVar.M()), new a.C0132a(bVar.O().h()));
            }
            arrayList.add(eVar);
        }
        int ordinal = e0Var.O().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new k9.c(b(e0Var.N()), mVar2);
            }
            if (ordinal == 2) {
                return new k9.q(b(e0Var.T()), mVar2);
            }
            x6.b.T("Unknown mutation operation: %d", e0Var.O());
            throw null;
        }
        if (!e0Var.X()) {
            return new k9.o(b(e0Var.Q().L()), j9.n.e(e0Var.Q().K()), mVar2, arrayList);
        }
        j9.i b10 = b(e0Var.Q().L());
        j9.n e10 = j9.n.e(e0Var.Q().K());
        ka.n R = e0Var.R();
        int J = R.J();
        HashSet hashSet = new HashSet(J);
        for (int i10 = 0; i10 < J; i10++) {
            hashSet.add(j9.l.t(R.I(i10)));
        }
        return new k9.l(b10, e10, new k9.d(hashSet), mVar2, arrayList);
    }

    public final ka.k g(j9.i iVar, j9.n nVar) {
        k.a N = ka.k.N();
        String m10 = m(this.f10778a, iVar.f8684a);
        N.m();
        ka.k.G((ka.k) N.f11120b, m10);
        Map<String, ka.d0> J = nVar.b().Y().J();
        N.m();
        ka.k.H((ka.k) N.f11120b).putAll(J);
        return N.k();
    }

    public final String j(j9.i iVar) {
        return m(this.f10778a, iVar.f8684a);
    }

    public final ka.e0 k(k9.f fVar) {
        p.b.a R;
        p.b k10;
        e0.a Y = ka.e0.Y();
        if (fVar instanceof k9.o) {
            ka.k g10 = g(fVar.f9150a, ((k9.o) fVar).f9171d);
            Y.m();
            ka.e0.I((ka.e0) Y.f11120b, g10);
        } else if (fVar instanceof k9.l) {
            ka.k g11 = g(fVar.f9150a, ((k9.l) fVar).f9165d);
            Y.m();
            ka.e0.I((ka.e0) Y.f11120b, g11);
            k9.d d10 = fVar.d();
            n.a K = ka.n.K();
            Iterator<j9.l> it = d10.f9147a.iterator();
            while (it.hasNext()) {
                String h10 = it.next().h();
                K.m();
                ka.n.G((ka.n) K.f11120b, h10);
            }
            ka.n k11 = K.k();
            Y.m();
            ka.e0.G((ka.e0) Y.f11120b, k11);
        } else if (fVar instanceof k9.c) {
            String j10 = j(fVar.f9150a);
            Y.m();
            ka.e0.K((ka.e0) Y.f11120b, j10);
        } else {
            if (!(fVar instanceof k9.q)) {
                x6.b.T("unknown mutation type %s", fVar.getClass());
                throw null;
            }
            String j11 = j(fVar.f9150a);
            Y.m();
            ka.e0.L((ka.e0) Y.f11120b, j11);
        }
        for (k9.e eVar : fVar.f9152c) {
            k9.p pVar = eVar.f9149b;
            if (pVar instanceof k9.n) {
                p.b.a R2 = p.b.R();
                String h11 = eVar.f9148a.h();
                R2.m();
                p.b.H((p.b) R2.f11120b, h11);
                R2.m();
                p.b.J((p.b) R2.f11120b);
                k10 = R2.k();
            } else {
                if (pVar instanceof a.b) {
                    R = p.b.R();
                    String h12 = eVar.f9148a.h();
                    R.m();
                    p.b.H((p.b) R.f11120b, h12);
                    b.a M = ka.b.M();
                    List<ka.d0> list = ((a.b) pVar).f9143a;
                    M.m();
                    ka.b.H((ka.b) M.f11120b, list);
                    R.m();
                    p.b.G((p.b) R.f11120b, M.k());
                } else if (pVar instanceof a.C0132a) {
                    R = p.b.R();
                    String h13 = eVar.f9148a.h();
                    R.m();
                    p.b.H((p.b) R.f11120b, h13);
                    b.a M2 = ka.b.M();
                    List<ka.d0> list2 = ((a.C0132a) pVar).f9143a;
                    M2.m();
                    ka.b.H((ka.b) M2.f11120b, list2);
                    R.m();
                    p.b.I((p.b) R.f11120b, M2.k());
                } else {
                    if (!(pVar instanceof k9.j)) {
                        x6.b.T("Unknown transform: %s", pVar);
                        throw null;
                    }
                    R = p.b.R();
                    String h14 = eVar.f9148a.h();
                    R.m();
                    p.b.H((p.b) R.f11120b, h14);
                    ka.d0 d0Var = ((k9.j) pVar).f9164a;
                    R.m();
                    p.b.K((p.b) R.f11120b, d0Var);
                }
                k10 = R.k();
            }
            Y.m();
            ka.e0.H((ka.e0) Y.f11120b, k10);
        }
        k9.m mVar = fVar.f9151b;
        j9.q qVar = mVar.f9168a;
        if (!(qVar == null && mVar.f9169b == null)) {
            x6.b.Z("Can't serialize an empty precondition", !(qVar == null && mVar.f9169b == null), new Object[0]);
            v.a M3 = ka.v.M();
            j9.q qVar2 = mVar.f9168a;
            if (qVar2 != null) {
                n1 n2 = n(qVar2.f8702a);
                M3.m();
                ka.v.H((ka.v) M3.f11120b, n2);
            } else {
                Boolean bool = mVar.f9169b;
                if (bool == null) {
                    x6.b.T("Unknown Precondition", new Object[0]);
                    throw null;
                }
                boolean booleanValue = bool.booleanValue();
                M3.m();
                ka.v.G((ka.v) M3.f11120b, booleanValue);
            }
            ka.v k12 = M3.k();
            Y.m();
            ka.e0.J((ka.e0) Y.f11120b, k12);
        }
        return Y.k();
    }

    public final a0.c l(g9.k0 k0Var) {
        a0.c.a L = a0.c.L();
        z.a Z = ka.z.Z();
        j9.o oVar = k0Var.f6007d;
        if (k0Var.f6008e != null) {
            x6.b.Z("Collection Group queries should be within a document path or root.", oVar.q() % 2 == 0, new Object[0]);
            String m10 = m(this.f10778a, oVar);
            L.m();
            a0.c.H((a0.c) L.f11120b, m10);
            z.b.a K = z.b.K();
            String str = k0Var.f6008e;
            K.m();
            z.b.G((z.b) K.f11120b, str);
            K.m();
            z.b.H((z.b) K.f11120b);
            Z.m();
            ka.z.G((ka.z) Z.f11120b, K.k());
        } else {
            x6.b.Z("Document queries with filters are not supported.", oVar.q() % 2 != 0, new Object[0]);
            String m11 = m(this.f10778a, oVar.s());
            L.m();
            a0.c.H((a0.c) L.f11120b, m11);
            z.b.a K2 = z.b.K();
            String m12 = oVar.m();
            K2.m();
            z.b.G((z.b) K2.f11120b, m12);
            Z.m();
            ka.z.G((ka.z) Z.f11120b, K2.k());
        }
        if (k0Var.f6006c.size() > 0) {
            z.g i10 = i(new g9.g(k0Var.f6006c, 1));
            Z.m();
            ka.z.H((ka.z) Z.f11120b, i10);
        }
        for (g9.e0 e0Var : k0Var.f6005b) {
            z.h.a K3 = z.h.K();
            z.d dVar = q0.g.b(e0Var.f5929a, 1) ? z.d.ASCENDING : z.d.DESCENDING;
            K3.m();
            z.h.H((z.h) K3.f11120b, dVar);
            z.f h10 = h(e0Var.f5930b);
            K3.m();
            z.h.G((z.h) K3.f11120b, h10);
            z.h k10 = K3.k();
            Z.m();
            ka.z.I((ka.z) Z.f11120b, k10);
        }
        if (k0Var.f != -1) {
            x.a J = ma.x.J();
            int i11 = (int) k0Var.f;
            J.m();
            ma.x.G((ma.x) J.f11120b, i11);
            Z.m();
            ka.z.L((ka.z) Z.f11120b, J.k());
        }
        if (k0Var.f6009g != null) {
            j.a K4 = ka.j.K();
            List<ka.d0> list = k0Var.f6009g.f5928b;
            K4.m();
            ka.j.G((ka.j) K4.f11120b, list);
            boolean z10 = k0Var.f6009g.f5927a;
            K4.m();
            ka.j.H((ka.j) K4.f11120b, z10);
            Z.m();
            ka.z.J((ka.z) Z.f11120b, K4.k());
        }
        if (k0Var.f6010h != null) {
            j.a K5 = ka.j.K();
            List<ka.d0> list2 = k0Var.f6010h.f5928b;
            K5.m();
            ka.j.G((ka.j) K5.f11120b, list2);
            boolean z11 = !k0Var.f6010h.f5927a;
            K5.m();
            ka.j.H((ka.j) K5.f11120b, z11);
            Z.m();
            ka.z.K((ka.z) Z.f11120b, K5.k());
        }
        L.m();
        a0.c.F((a0.c) L.f11120b, Z.k());
        return L.k();
    }
}
