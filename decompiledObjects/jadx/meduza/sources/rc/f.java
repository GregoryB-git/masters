package rc;

import java.util.ArrayList;
import nc.e0;

/* loaded from: classes.dex */
public abstract class f<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ub.h f13863a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13864b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.a f13865c;

    public f(ub.h hVar, int i10, pc.a aVar) {
        this.f13863a = hVar;
        this.f13864b = i10;
        this.f13865c = aVar;
    }

    @Override // rc.m
    public final qc.e<T> a(ub.h hVar, int i10, pc.a aVar) {
        ub.h plus = hVar.plus(this.f13863a);
        if (aVar == pc.a.SUSPEND) {
            int i11 = this.f13864b;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2 && (i11 = i11 + i10) < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
                i10 = i11;
            }
            aVar = this.f13865c;
        }
        return (ec.i.a(plus, this.f13863a) && i10 == this.f13864b && aVar == this.f13865c) ? this : c(plus, i10, aVar);
    }

    public abstract Object b(pc.q<? super T> qVar, ub.e<? super rb.h> eVar);

    public abstract f<T> c(ub.h hVar, int i10, pc.a aVar);

    @Override // qc.e
    public Object collect(qc.f<? super T> fVar, ub.e<? super rb.h> eVar) {
        Object b10 = e0.b(new d(null, fVar, this), eVar);
        return b10 == vb.a.f16085a ? b10 : rb.h.f13851a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        if (this.f13863a != ub.i.f15164a) {
            StringBuilder l10 = defpackage.f.l("context=");
            l10.append(this.f13863a);
            arrayList.add(l10.toString());
        }
        if (this.f13864b != -3) {
            StringBuilder l11 = defpackage.f.l("capacity=");
            l11.append(this.f13864b);
            arrayList.add(l11.toString());
        }
        if (this.f13865c != pc.a.SUSPEND) {
            StringBuilder l12 = defpackage.f.l("onBufferOverflow=");
            l12.append(this.f13865c);
            arrayList.add(l12.toString());
        }
        return getClass().getSimpleName() + '[' + sb.q.p(arrayList, ", ", null, null, null, 62) + ']';
    }
}
