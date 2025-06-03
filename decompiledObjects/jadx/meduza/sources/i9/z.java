package i9;

import java.util.HashMap;
import java.util.Iterator;
import t8.e;

/* loaded from: classes.dex */
public final class z implements l1 {

    /* renamed from: c, reason: collision with root package name */
    public int f7865c;
    public final w f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7863a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final l3.l f7864b = new l3.l(6);

    /* renamed from: d, reason: collision with root package name */
    public j9.q f7866d = j9.q.f8701b;

    /* renamed from: e, reason: collision with root package name */
    public long f7867e = 0;

    public z(w wVar) {
        this.f = wVar;
    }

    @Override // i9.l1
    public final m1 a(g9.k0 k0Var) {
        return (m1) this.f7863a.get(k0Var);
    }

    @Override // i9.l1
    public final void b(t8.e<j9.i> eVar, int i10) {
        l3.l lVar = this.f7864b;
        lVar.getClass();
        Iterator<j9.i> it = eVar.iterator();
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            c cVar = new c(i10, (j9.i) aVar.next());
            lVar.f9559a = ((t8.e) lVar.f9559a).a(cVar);
            lVar.f9560b = ((t8.e) lVar.f9560b).a(cVar);
        }
        f0 f0Var = this.f.f7832i;
        Iterator<j9.i> it2 = eVar.iterator();
        while (true) {
            e.a aVar2 = (e.a) it2;
            if (!aVar2.hasNext()) {
                return;
            } else {
                f0Var.e((j9.i) aVar2.next());
            }
        }
    }

    @Override // i9.l1
    public final void c(m1 m1Var) {
        this.f7863a.put(m1Var.f7734a, m1Var);
        int i10 = m1Var.f7735b;
        if (i10 > this.f7865c) {
            this.f7865c = i10;
        }
        long j10 = m1Var.f7736c;
        if (j10 > this.f7867e) {
            this.f7867e = j10;
        }
    }

    @Override // i9.l1
    public final int d() {
        return this.f7865c;
    }

    @Override // i9.l1
    public final void e(t8.e<j9.i> eVar, int i10) {
        l3.l lVar = this.f7864b;
        lVar.getClass();
        Iterator<j9.i> it = eVar.iterator();
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            c cVar = new c(i10, (j9.i) aVar.next());
            lVar.f9559a = ((t8.e) lVar.f9559a).i(cVar);
            lVar.f9560b = ((t8.e) lVar.f9560b).i(cVar);
        }
        f0 f0Var = this.f.f7832i;
        Iterator<j9.i> it2 = eVar.iterator();
        while (true) {
            e.a aVar2 = (e.a) it2;
            if (!aVar2.hasNext()) {
                return;
            } else {
                f0Var.c((j9.i) aVar2.next());
            }
        }
    }

    @Override // i9.l1
    public final t8.e<j9.i> f(int i10) {
        return this.f7864b.c(i10);
    }

    @Override // i9.l1
    public final j9.q g() {
        return this.f7866d;
    }

    @Override // i9.l1
    public final void h(m1 m1Var) {
        c(m1Var);
    }

    @Override // i9.l1
    public final void i(int i10) {
        this.f7864b.d(i10);
    }

    @Override // i9.l1
    public final void j(j9.q qVar) {
        this.f7866d = qVar;
    }
}
