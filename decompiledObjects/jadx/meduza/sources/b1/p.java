package b1;

import b1.k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n.b;

/* loaded from: classes.dex */
public final class p extends k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1769a;

    /* renamed from: b, reason: collision with root package name */
    public n.a<n, a> f1770b;

    /* renamed from: c, reason: collision with root package name */
    public k.b f1771c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference<o> f1772d;

    /* renamed from: e, reason: collision with root package name */
    public int f1773e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1774g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<k.b> f1775h;

    /* renamed from: i, reason: collision with root package name */
    public final qc.t f1776i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public k.b f1777a;

        /* renamed from: b, reason: collision with root package name */
        public m f1778b;

        public a(n nVar, k.b bVar) {
            m b0Var;
            ec.i.b(nVar);
            HashMap hashMap = s.f1788a;
            boolean z10 = nVar instanceof m;
            boolean z11 = nVar instanceof d;
            if (z10 && z11) {
                b0Var = new e((d) nVar, (m) nVar);
            } else if (z11) {
                b0Var = new e((d) nVar, null);
            } else if (z10) {
                b0Var = (m) nVar;
            } else {
                Class<?> cls = nVar.getClass();
                if (s.c(cls) == 2) {
                    Object obj = s.f1789b.get(cls);
                    ec.i.b(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        b0Var = new n0(s.a((Constructor) list.get(0), nVar));
                    } else {
                        int size = list.size();
                        g[] gVarArr = new g[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            HashMap hashMap2 = s.f1788a;
                            gVarArr[i10] = s.a((Constructor) list.get(i10), nVar);
                        }
                        b0Var = new c(gVarArr);
                    }
                } else {
                    b0Var = new b0(nVar);
                }
            }
            this.f1778b = b0Var;
            this.f1777a = bVar;
        }

        public final void a(o oVar, k.a aVar) {
            k.b f = aVar.f();
            k.b bVar = this.f1777a;
            ec.i.e(bVar, "state1");
            if (f.compareTo(bVar) < 0) {
                bVar = f;
            }
            this.f1777a = bVar;
            this.f1778b.a(oVar, aVar);
            this.f1777a = f;
        }
    }

    public p(o oVar) {
        ec.i.e(oVar, "provider");
        this.f1769a = true;
        this.f1770b = new n.a<>();
        k.b bVar = k.b.INITIALIZED;
        this.f1771c = bVar;
        this.f1775h = new ArrayList<>();
        this.f1772d = new WeakReference<>(oVar);
        this.f1776i = new qc.t(bVar);
    }

    @Override // b1.k
    public final void a(n nVar) {
        o oVar;
        ec.i.e(nVar, "observer");
        e("addObserver");
        k.b bVar = this.f1771c;
        k.b bVar2 = k.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = k.b.INITIALIZED;
        }
        a aVar = new a(nVar, bVar2);
        if (this.f1770b.h(nVar, aVar) == null && (oVar = this.f1772d.get()) != null) {
            boolean z10 = this.f1773e != 0 || this.f;
            k.b d10 = d(nVar);
            this.f1773e++;
            while (aVar.f1777a.compareTo(d10) < 0 && this.f1770b.f11163e.containsKey(nVar)) {
                this.f1775h.add(aVar.f1777a);
                k.a.C0029a c0029a = k.a.Companion;
                k.b bVar3 = aVar.f1777a;
                c0029a.getClass();
                k.a b10 = k.a.C0029a.b(bVar3);
                if (b10 == null) {
                    StringBuilder l10 = defpackage.f.l("no event up from ");
                    l10.append(aVar.f1777a);
                    throw new IllegalStateException(l10.toString());
                }
                aVar.a(oVar, b10);
                this.f1775h.remove(r3.size() - 1);
                d10 = d(nVar);
            }
            if (!z10) {
                i();
            }
            this.f1773e--;
        }
    }

    @Override // b1.k
    public final k.b b() {
        return this.f1771c;
    }

    @Override // b1.k
    public final void c(n nVar) {
        ec.i.e(nVar, "observer");
        e("removeObserver");
        this.f1770b.i(nVar);
    }

    public final k.b d(n nVar) {
        a aVar;
        n.a<n, a> aVar2 = this.f1770b;
        k.b bVar = null;
        b.c<n, a> cVar = aVar2.f11163e.containsKey(nVar) ? aVar2.f11163e.get(nVar).f11171d : null;
        k.b bVar2 = (cVar == null || (aVar = cVar.f11169b) == null) ? null : aVar.f1777a;
        if (!this.f1775h.isEmpty()) {
            bVar = this.f1775h.get(r0.size() - 1);
        }
        k.b bVar3 = this.f1771c;
        ec.i.e(bVar3, "state1");
        if (bVar2 == null || bVar2.compareTo(bVar3) >= 0) {
            bVar2 = bVar3;
        }
        return (bVar == null || bVar.compareTo(bVar2) >= 0) ? bVar2 : bVar;
    }

    public final void e(String str) {
        if (this.f1769a && !m.c.v().w()) {
            throw new IllegalStateException(defpackage.g.e("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void f(k.a aVar) {
        ec.i.e(aVar, "event");
        e("handleLifecycleEvent");
        g(aVar.f());
    }

    public final void g(k.b bVar) {
        k.b bVar2 = k.b.DESTROYED;
        k.b bVar3 = this.f1771c;
        if (bVar3 == bVar) {
            return;
        }
        if (!((bVar3 == k.b.INITIALIZED && bVar == bVar2) ? false : true)) {
            StringBuilder l10 = defpackage.f.l("no event down from ");
            l10.append(this.f1771c);
            l10.append(" in component ");
            l10.append(this.f1772d.get());
            throw new IllegalStateException(l10.toString().toString());
        }
        this.f1771c = bVar;
        if (this.f || this.f1773e != 0) {
            this.f1774g = true;
            return;
        }
        this.f = true;
        i();
        this.f = false;
        if (this.f1771c == bVar2) {
            this.f1770b = new n.a<>();
        }
    }

    public final void h(k.b bVar) {
        ec.i.e(bVar, "state");
        e("setCurrentState");
        g(bVar);
    }

    public final void i() {
        o oVar = this.f1772d.get();
        if (oVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            n.a<n, a> aVar = this.f1770b;
            boolean z10 = true;
            if (aVar.f11167d != 0) {
                b.c<n, a> cVar = aVar.f11164a;
                ec.i.b(cVar);
                k.b bVar = cVar.f11169b.f1777a;
                b.c<n, a> cVar2 = this.f1770b.f11165b;
                ec.i.b(cVar2);
                k.b bVar2 = cVar2.f11169b.f1777a;
                if (bVar != bVar2 || this.f1771c != bVar2) {
                    z10 = false;
                }
            }
            this.f1774g = false;
            if (z10) {
                this.f1776i.setValue(this.f1771c);
                return;
            }
            k.b bVar3 = this.f1771c;
            b.c<n, a> cVar3 = this.f1770b.f11164a;
            ec.i.b(cVar3);
            if (bVar3.compareTo(cVar3.f11169b.f1777a) < 0) {
                n.a<n, a> aVar2 = this.f1770b;
                b.C0167b c0167b = new b.C0167b(aVar2.f11165b, aVar2.f11164a);
                aVar2.f11166c.put(c0167b, Boolean.FALSE);
                while (c0167b.hasNext() && !this.f1774g) {
                    Map.Entry entry = (Map.Entry) c0167b.next();
                    ec.i.d(entry, "next()");
                    n nVar = (n) entry.getKey();
                    a aVar3 = (a) entry.getValue();
                    while (aVar3.f1777a.compareTo(this.f1771c) > 0 && !this.f1774g && this.f1770b.f11163e.containsKey(nVar)) {
                        k.a.C0029a c0029a = k.a.Companion;
                        k.b bVar4 = aVar3.f1777a;
                        c0029a.getClass();
                        k.a a10 = k.a.C0029a.a(bVar4);
                        if (a10 == null) {
                            StringBuilder l10 = defpackage.f.l("no event down from ");
                            l10.append(aVar3.f1777a);
                            throw new IllegalStateException(l10.toString());
                        }
                        this.f1775h.add(a10.f());
                        aVar3.a(oVar, a10);
                        this.f1775h.remove(r4.size() - 1);
                    }
                }
            }
            b.c<n, a> cVar4 = this.f1770b.f11165b;
            if (!this.f1774g && cVar4 != null && this.f1771c.compareTo(cVar4.f11169b.f1777a) > 0) {
                n.a<n, a> aVar4 = this.f1770b;
                aVar4.getClass();
                b.d dVar = new b.d();
                aVar4.f11166c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext() && !this.f1774g) {
                    Map.Entry entry2 = (Map.Entry) dVar.next();
                    n nVar2 = (n) entry2.getKey();
                    a aVar5 = (a) entry2.getValue();
                    while (aVar5.f1777a.compareTo(this.f1771c) < 0 && !this.f1774g && this.f1770b.f11163e.containsKey(nVar2)) {
                        this.f1775h.add(aVar5.f1777a);
                        k.a.C0029a c0029a2 = k.a.Companion;
                        k.b bVar5 = aVar5.f1777a;
                        c0029a2.getClass();
                        k.a b10 = k.a.C0029a.b(bVar5);
                        if (b10 == null) {
                            StringBuilder l11 = defpackage.f.l("no event up from ");
                            l11.append(aVar5.f1777a);
                            throw new IllegalStateException(l11.toString());
                        }
                        aVar5.a(oVar, b10);
                        this.f1775h.remove(r4.size() - 1);
                    }
                }
            }
        }
    }
}
