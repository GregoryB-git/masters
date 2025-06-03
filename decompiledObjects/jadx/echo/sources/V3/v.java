package V3;

import a4.C0745a;
import a4.C0747c;
import a4.InterfaceC0749e;
import a4.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6680a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final X3.e f6681b;

    public v(X3.e eVar) {
        this.f6681b = eVar;
    }

    public List a(AbstractC0669h abstractC0669h, G g7, C0745a c0745a) {
        a4.i e7 = abstractC0669h.e();
        a4.j g8 = g(e7, g7, c0745a);
        if (!e7.g()) {
            HashSet hashSet = new HashSet();
            Iterator it = g8.f().iterator();
            while (it.hasNext()) {
                hashSet.add(((d4.m) it.next()).c());
            }
            this.f6681b.o(e7, hashSet);
        }
        if (!this.f6680a.containsKey(e7.d())) {
            this.f6680a.put(e7.d(), g8);
        }
        this.f6680a.put(e7.d(), g8);
        g8.a(abstractC0669h);
        return g8.g(abstractC0669h);
    }

    public List b(W3.d dVar, G g7, d4.n nVar) {
        a4.h b7 = dVar.b().b();
        if (b7 != null) {
            a4.j jVar = (a4.j) this.f6680a.get(b7);
            Y3.m.f(jVar != null);
            return c(jVar, dVar, g7, nVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6680a.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(c((a4.j) ((Map.Entry) it.next()).getValue(), dVar, g7, nVar));
        }
        return arrayList;
    }

    public final List c(a4.j jVar, W3.d dVar, G g7, d4.n nVar) {
        j.a b7 = jVar.b(dVar, g7, nVar);
        if (!jVar.h().g()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (C0747c c0747c : b7.f8128b) {
                InterfaceC0749e.a j7 = c0747c.j();
                if (j7 == InterfaceC0749e.a.CHILD_ADDED) {
                    hashSet2.add(c0747c.i());
                } else if (j7 == InterfaceC0749e.a.CHILD_REMOVED) {
                    hashSet.add(c0747c.i());
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f6681b.l(jVar.h(), hashSet2, hashSet);
            }
        }
        return b7.f8127a;
    }

    public d4.n d(k kVar) {
        Iterator it = this.f6680a.values().iterator();
        while (it.hasNext()) {
            d4.n e7 = ((a4.j) it.next()).e(kVar);
            if (e7 != null) {
                return e7;
            }
        }
        return null;
    }

    public a4.j e() {
        Iterator it = this.f6680a.entrySet().iterator();
        while (it.hasNext()) {
            a4.j jVar = (a4.j) ((Map.Entry) it.next()).getValue();
            if (jVar.h().g()) {
                return jVar;
            }
        }
        return null;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6680a.entrySet().iterator();
        while (it.hasNext()) {
            a4.j jVar = (a4.j) ((Map.Entry) it.next()).getValue();
            if (!jVar.h().g()) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public a4.j g(a4.i iVar, G g7, C0745a c0745a) {
        boolean z7;
        a4.j jVar = (a4.j) this.f6680a.get(iVar.d());
        if (jVar != null) {
            return jVar;
        }
        d4.n b7 = g7.b(c0745a.f() ? c0745a.b() : null);
        if (b7 != null) {
            z7 = true;
        } else {
            b7 = g7.e(c0745a.b() != null ? c0745a.b() : d4.g.W());
            z7 = false;
        }
        return new a4.j(iVar, new a4.k(new C0745a(d4.i.f(b7, iVar.c()), z7, false), c0745a));
    }

    public boolean h() {
        return e() != null;
    }

    public boolean i() {
        return this.f6680a.isEmpty();
    }

    public Y3.g j(a4.i iVar, AbstractC0669h abstractC0669h, Q3.c cVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean h7 = h();
        if (iVar.f()) {
            Iterator it = this.f6680a.entrySet().iterator();
            while (it.hasNext()) {
                a4.j jVar = (a4.j) ((Map.Entry) it.next()).getValue();
                arrayList2.addAll(jVar.k(abstractC0669h, cVar));
                if (jVar.j()) {
                    it.remove();
                    if (!jVar.h().g()) {
                        arrayList.add(jVar.h());
                    }
                }
            }
        } else {
            a4.j jVar2 = (a4.j) this.f6680a.get(iVar.d());
            if (jVar2 != null) {
                arrayList2.addAll(jVar2.k(abstractC0669h, cVar));
                if (jVar2.j()) {
                    this.f6680a.remove(iVar.d());
                    if (!jVar2.h().g()) {
                        arrayList.add(jVar2.h());
                    }
                }
            }
        }
        if (h7 && !h()) {
            arrayList.add(a4.i.a(iVar.e()));
        }
        return new Y3.g(arrayList, arrayList2);
    }

    public boolean k(a4.i iVar) {
        return l(iVar) != null;
    }

    public a4.j l(a4.i iVar) {
        return iVar.g() ? e() : (a4.j) this.f6680a.get(iVar.d());
    }
}
