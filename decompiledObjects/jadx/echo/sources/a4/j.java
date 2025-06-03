package a4;

import V3.AbstractC0669h;
import V3.G;
import W3.d;
import Y3.m;
import a4.l;
import b4.C0800b;
import b4.InterfaceC0802d;
import d4.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final i f8122a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8123b;

    /* renamed from: c, reason: collision with root package name */
    public k f8124c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8125d;

    /* renamed from: e, reason: collision with root package name */
    public final C0750f f8126e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f8127a;

        /* renamed from: b, reason: collision with root package name */
        public final List f8128b;

        public a(List list, List list2) {
            this.f8127a = list;
            this.f8128b = list2;
        }
    }

    public j(i iVar, k kVar) {
        this.f8122a = iVar;
        C0800b c0800b = new C0800b(iVar.c());
        InterfaceC0802d j7 = iVar.d().j();
        this.f8123b = new l(j7);
        C0745a d7 = kVar.d();
        C0745a c7 = kVar.c();
        d4.i f7 = d4.i.f(d4.g.W(), iVar.c());
        d4.i f8 = c0800b.f(f7, d7.a(), null);
        d4.i f9 = j7.f(f7, c7.a(), null);
        this.f8124c = new k(new C0745a(f9, c7.f(), j7.d()), new C0745a(f8, d7.f(), c0800b.d()));
        this.f8125d = new ArrayList();
        this.f8126e = new C0750f(iVar);
    }

    public void a(AbstractC0669h abstractC0669h) {
        this.f8125d.add(abstractC0669h);
    }

    public a b(W3.d dVar, G g7, n nVar) {
        if (dVar.c() == d.a.Merge && dVar.b().b() != null) {
            m.g(this.f8124c.b() != null, "We should always have a full cache before handling merges");
            m.g(this.f8124c.a() != null, "Missing event cache, even though we have a server cache");
        }
        k kVar = this.f8124c;
        l.c b7 = this.f8123b.b(kVar, dVar, g7, nVar);
        m.g(b7.f8134a.d().f() || !kVar.d().f(), "Once a server snap is complete, it should never go back");
        k kVar2 = b7.f8134a;
        this.f8124c = kVar2;
        return new a(c(b7.f8135b, kVar2.c().a(), null), b7.f8135b);
    }

    public final List c(List list, d4.i iVar, AbstractC0669h abstractC0669h) {
        return this.f8126e.d(list, iVar, abstractC0669h == null ? this.f8125d : Arrays.asList(abstractC0669h));
    }

    public n d() {
        return this.f8124c.a();
    }

    public n e(V3.k kVar) {
        n b7 = this.f8124c.b();
        if (b7 == null) {
            return null;
        }
        if (this.f8122a.g() || !(kVar.isEmpty() || b7.v(kVar.Z()).isEmpty())) {
            return b7.A(kVar);
        }
        return null;
    }

    public n f() {
        return this.f8124c.c().b();
    }

    public List g(AbstractC0669h abstractC0669h) {
        C0745a c7 = this.f8124c.c();
        ArrayList arrayList = new ArrayList();
        for (d4.m mVar : c7.b()) {
            arrayList.add(C0747c.c(mVar.c(), mVar.d()));
        }
        if (c7.f()) {
            arrayList.add(C0747c.n(c7.a()));
        }
        return c(arrayList, c7.a(), abstractC0669h);
    }

    public i h() {
        return this.f8122a;
    }

    public n i() {
        return this.f8124c.d().b();
    }

    public boolean j() {
        return this.f8125d.isEmpty();
    }

    public List k(AbstractC0669h abstractC0669h, Q3.c cVar) {
        List emptyList;
        int i7 = 0;
        if (cVar != null) {
            emptyList = new ArrayList();
            m.g(abstractC0669h == null, "A cancel should cancel all event registrations");
            V3.k e7 = this.f8122a.e();
            Iterator it = this.f8125d.iterator();
            while (it.hasNext()) {
                emptyList.add(new C0746b((AbstractC0669h) it.next(), cVar, e7));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        if (abstractC0669h != null) {
            int i8 = -1;
            while (true) {
                if (i7 >= this.f8125d.size()) {
                    i7 = i8;
                    break;
                }
                AbstractC0669h abstractC0669h2 = (AbstractC0669h) this.f8125d.get(i7);
                if (abstractC0669h2.f(abstractC0669h)) {
                    if (abstractC0669h2.h()) {
                        break;
                    }
                    i8 = i7;
                }
                i7++;
            }
            if (i7 != -1) {
                AbstractC0669h abstractC0669h3 = (AbstractC0669h) this.f8125d.get(i7);
                this.f8125d.remove(i7);
                abstractC0669h3.l();
            }
        } else {
            Iterator it2 = this.f8125d.iterator();
            while (it2.hasNext()) {
                ((AbstractC0669h) it2.next()).l();
            }
            this.f8125d.clear();
        }
        return emptyList;
    }
}
