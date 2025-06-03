package i9;

import j9.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t8.e;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public h f7658a;

    /* renamed from: b, reason: collision with root package name */
    public f f7659b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7660c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7661d = false;

    public static t8.e b(g9.f0 f0Var, t8.c cVar) {
        t8.e eVar = new t8.e(Collections.emptyList(), f0Var.a());
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            j9.g gVar = (j9.g) ((Map.Entry) it.next()).getValue();
            if (f0Var.g(gVar)) {
                eVar = eVar.a(gVar);
            }
        }
        return eVar;
    }

    public static boolean c(g9.f0 f0Var, int i10, t8.e eVar, j9.q qVar) {
        if (!(f0Var.f5951h != -1)) {
            return false;
        }
        if (i10 != eVar.size()) {
            return true;
        }
        j9.g gVar = (j9.g) (f0Var.f5952i == 1 ? eVar.f14652a.k() : eVar.f14652a.l());
        if (gVar == null) {
            return false;
        }
        return gVar.e() || gVar.j().f8702a.compareTo(qVar.f8702a) > 0;
    }

    public final t8.c a(t8.e eVar, g9.f0 f0Var, k.a aVar) {
        t8.c<j9.i, j9.g> d10 = this.f7658a.d(f0Var, aVar, null);
        Iterator it = eVar.iterator();
        while (true) {
            e.a aVar2 = (e.a) it;
            if (!aVar2.hasNext()) {
                return d10;
            }
            j9.g gVar = (j9.g) aVar2.next();
            d10 = d10.n(gVar.getKey(), gVar);
        }
    }

    public final t8.c<j9.i, j9.g> d(g9.f0 f0Var) {
        if (f0Var.h()) {
            return null;
        }
        g9.k0 i10 = f0Var.i();
        int k10 = this.f7659b.k(i10);
        if (q0.g.b(k10, 1)) {
            return null;
        }
        if (!(f0Var.f5951h != -1) || !q0.g.b(k10, 2)) {
            List<j9.i> l10 = this.f7659b.l(i10);
            x6.b.Z("index manager must return results for partial and full indexes.", l10 != null, new Object[0]);
            t8.c<j9.i, j9.g> b10 = this.f7658a.b(l10);
            j9.b b11 = this.f7659b.b(i10);
            t8.e b12 = b(f0Var, b10);
            if (!c(f0Var, l10.size(), b12, b11.f8670c)) {
                return a(b12, f0Var, b11);
            }
        }
        return d(f0Var.f(-1L));
    }
}
