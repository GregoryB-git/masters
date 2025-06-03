package f9;

import d9.d0;
import g.q;
import g9.f0;
import i9.m1;
import i9.n;
import j9.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import r3.o;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f5484a;

    /* renamed from: b, reason: collision with root package name */
    public final e f5485b;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public h f5489g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5486c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public t8.c<j9.i, m> f5488e = j9.h.f8681a;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5487d = new HashMap();

    public d(n nVar, e eVar) {
        this.f5484a = nVar;
        this.f5485b = eVar;
    }

    public final d0 a(c cVar, long j10) {
        t8.c<j9.i, m> n2;
        x6.b.p("Unexpected bundle metadata element.", !(cVar instanceof e), new Object[0]);
        int size = this.f5488e.size();
        if (cVar instanceof j) {
            this.f5486c.add((j) cVar);
        } else if (cVar instanceof h) {
            h hVar = (h) cVar;
            this.f5487d.put(hVar.f5502a, hVar);
            this.f5489g = hVar;
            if (!hVar.f5504c) {
                t8.c<j9.i, m> cVar2 = this.f5488e;
                j9.i iVar = hVar.f5502a;
                m n10 = m.n(iVar, hVar.f5503b);
                n10.f8696e = hVar.f5503b;
                n2 = cVar2.n(iVar, n10);
                this.f5488e = n2;
                this.f5489g = null;
            }
        } else if (cVar instanceof b) {
            b bVar = (b) cVar;
            h hVar2 = this.f5489g;
            if (hVar2 == null || !bVar.f5483a.f8693b.equals(hVar2.f5502a)) {
                throw new IllegalArgumentException("The document being added does not match the stored metadata.");
            }
            t8.c<j9.i, m> cVar3 = this.f5488e;
            m mVar = bVar.f5483a;
            j9.i iVar2 = mVar.f8693b;
            mVar.f8696e = this.f5489g.f5503b;
            n2 = cVar3.n(iVar2, mVar);
            this.f5488e = n2;
            this.f5489g = null;
        }
        this.f += j10;
        if (size == this.f5488e.size()) {
            return null;
        }
        int size2 = this.f5488e.size();
        e eVar = this.f5485b;
        return new d0(size2, eVar.f5493d, this.f, eVar.f5494e, null, 2);
    }

    public final t8.c<j9.i, j9.g> b() {
        x6.b.p("Bundled documents end with a document metadata element instead of a document.", this.f5489g == null, new Object[0]);
        x6.b.p("Bundle ID must be set", this.f5485b.f5490a != null, new Object[0]);
        int size = this.f5488e.size();
        int i10 = this.f5485b.f5493d;
        x6.b.p("Expected %s documents, but loaded %s.", size == i10, Integer.valueOf(i10), Integer.valueOf(this.f5488e.size()));
        a aVar = this.f5484a;
        t8.c<j9.i, m> cVar = this.f5488e;
        String str = this.f5485b.f5490a;
        n nVar = (n) aVar;
        nVar.getClass();
        t8.c<j9.i, j9.g> cVar2 = (t8.c) nVar.f7743a.x("Apply bundle documents", new o(nVar, cVar, nVar.a(new f0(j9.o.t("__bundle__/docs/" + str), null).i())));
        HashMap hashMap = new HashMap();
        Iterator it = this.f5486c.iterator();
        while (it.hasNext()) {
            hashMap.put(((j) it.next()).f5508a, j9.i.f8683c);
        }
        for (h hVar : this.f5487d.values()) {
            for (String str2 : hVar.f5505d) {
                hashMap.put(str2, ((t8.e) hashMap.get(str2)).a(hVar.f5502a));
            }
        }
        Iterator it2 = this.f5486c.iterator();
        while (it2.hasNext()) {
            final j jVar = (j) it2.next();
            a aVar2 = this.f5484a;
            final t8.e eVar = (t8.e) hashMap.get(jVar.f5508a);
            final n nVar2 = (n) aVar2;
            nVar2.getClass();
            final m1 a10 = nVar2.a(jVar.f5509b.f5506a);
            final int i11 = a10.f7735b;
            nVar2.f7743a.y("Saved named query", new Runnable() { // from class: i9.j
                @Override // java.lang.Runnable
                public final void run() {
                    n nVar3 = n.this;
                    f9.j jVar2 = jVar;
                    m1 m1Var = a10;
                    int i12 = i11;
                    t8.e<j9.i> eVar2 = eVar;
                    nVar3.getClass();
                    if (jVar2.f5510c.compareTo(m1Var.f7738e) > 0) {
                        m1 a11 = m1Var.a(ma.h.f10961b, jVar2.f5510c);
                        nVar3.f7752k.append(i12, a11);
                        nVar3.f7750i.h(a11);
                        nVar3.f7750i.i(i12);
                        nVar3.f7750i.b(eVar2, i12);
                    }
                    nVar3.f7751j.c(jVar2);
                }
            });
        }
        n nVar3 = (n) this.f5484a;
        nVar3.f7743a.y("Save bundle", new q(17, nVar3, this.f5485b));
        return cVar2;
    }
}
