package nc;

import nc.j1;

/* loaded from: classes.dex */
public abstract class a<T> extends o1 implements ub.e<T>, d0 {

    /* renamed from: c, reason: collision with root package name */
    public final ub.h f11466c;

    public a(ub.h hVar, boolean z10) {
        super(z10);
        J((j1) hVar.get(j1.b.f11509a));
        this.f11466c = hVar.plus(this);
    }

    @Override // nc.o1
    public final void H(n7.w wVar) {
        c0.a(this.f11466c, wVar);
    }

    @Override // nc.o1
    public String N() {
        return super.N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nc.o1
    public final void R(Object obj) {
        if (!(obj instanceof u)) {
            c0(obj);
            return;
        }
        u uVar = (u) obj;
        Throwable th = uVar.f11555a;
        uVar.getClass();
        a0(th, u.f11554b.get(uVar) != 0);
    }

    public void Z(Object obj) {
        p(obj);
    }

    public void a0(Throwable th, boolean z10) {
    }

    public void c0(T t) {
    }

    public final void d0(int i10, a aVar, dc.p pVar) {
        Object a10;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            try {
                b.a0.C(p2.m0.P(p2.m0.u(aVar, this, pVar)), rb.h.f13851a, null);
                return;
            } catch (Throwable th) {
                resumeWith(rb.f.a(th));
                throw th;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                ec.i.e(pVar, "<this>");
                p2.m0.P(p2.m0.u(aVar, this, pVar)).resumeWith(rb.h.f13851a);
                return;
            }
            if (i11 != 3) {
                throw new n7.w();
            }
            try {
                ub.h hVar = this.f11466c;
                Object c10 = sc.w.c(hVar, null);
                try {
                    ec.v.a(2, pVar);
                    a10 = pVar.invoke(aVar, this);
                    if (a10 == vb.a.f16085a) {
                        return;
                    }
                } finally {
                    sc.w.a(hVar, c10);
                }
            } catch (Throwable th2) {
                a10 = rb.f.a(th2);
            }
            resumeWith(a10);
        }
    }

    @Override // nc.d0
    public final ub.h f() {
        return this.f11466c;
    }

    @Override // ub.e
    public final ub.h getContext() {
        return this.f11466c;
    }

    @Override // nc.o1, nc.j1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // ub.e
    public final void resumeWith(Object obj) {
        Throwable a10 = rb.e.a(obj);
        if (a10 != null) {
            obj = new u(a10, false);
        }
        Object L = L(obj);
        if (L == p2.m0.f12899u) {
            return;
        }
        Z(L);
    }

    @Override // nc.o1
    public final String u() {
        return getClass().getSimpleName() + " was cancelled";
    }
}
