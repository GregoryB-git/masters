package rc;

import nc.y;
import nc.z;
import sc.w;
import ub.f;

/* loaded from: classes.dex */
public abstract class h<S, T> extends f<T> {

    /* renamed from: d, reason: collision with root package name */
    public final qc.e<S> f13869d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(qc.e<? extends S> eVar, ub.h hVar, int i10, pc.a aVar) {
        super(hVar, i10, aVar);
        this.f13869d = eVar;
    }

    @Override // rc.f
    public final Object b(pc.q<? super T> qVar, ub.e<? super rb.h> eVar) {
        Object collect = ((i) this).f13869d.collect(new r(qVar), eVar);
        vb.a aVar = vb.a.f16085a;
        if (collect != aVar) {
            collect = rb.h.f13851a;
        }
        return collect == aVar ? collect : rb.h.f13851a;
    }

    @Override // rc.f, qc.e
    public final Object collect(qc.f<? super T> fVar, ub.e<? super rb.h> eVar) {
        if (this.f13864b == -3) {
            ub.h context = eVar.getContext();
            ub.h hVar = this.f13863a;
            ub.h plus = !((Boolean) hVar.fold(Boolean.FALSE, z.f11579a)).booleanValue() ? context.plus(hVar) : y.a(context, hVar, false);
            if (ec.i.a(plus, context)) {
                Object collect = ((i) this).f13869d.collect(fVar, eVar);
                vb.a aVar = vb.a.f16085a;
                if (collect != aVar) {
                    collect = rb.h.f13851a;
                }
                if (collect == aVar) {
                    return collect;
                }
            } else {
                f.a aVar2 = f.a.f15163a;
                if (ec.i.a(plus.get(aVar2), context.get(aVar2))) {
                    ub.h context2 = eVar.getContext();
                    if (!(fVar instanceof r)) {
                        fVar = new t(fVar, context2);
                    }
                    Object A0 = x6.b.A0(plus, fVar, w.b(plus), new g(this, null), eVar);
                    vb.a aVar3 = vb.a.f16085a;
                    if (A0 != aVar3) {
                        A0 = rb.h.f13851a;
                    }
                    if (A0 == aVar3) {
                        return A0;
                    }
                }
            }
            return rb.h.f13851a;
        }
        Object collect2 = super.collect(fVar, eVar);
        if (collect2 == vb.a.f16085a) {
            return collect2;
        }
        return rb.h.f13851a;
    }

    @Override // rc.f
    public final String toString() {
        return this.f13869d + " -> " + super.toString();
    }
}
