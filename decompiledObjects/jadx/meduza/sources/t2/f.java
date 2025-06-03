package t2;

import dc.q;
import ec.j;
import rc.l;
import t2.b;
import wb.i;

/* loaded from: classes.dex */
public final class f implements qc.e<t2.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qc.e[] f14420a;

    public static final class a extends j implements dc.a<t2.b[]> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qc.e[] f14421a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qc.e[] eVarArr) {
            super(0);
            this.f14421a = eVarArr;
        }

        @Override // dc.a
        public final t2.b[] invoke() {
            return new t2.b[this.f14421a.length];
        }
    }

    @wb.e(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
    public static final class b extends i implements q<qc.f<? super t2.b>, t2.b[], ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14422a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ qc.f f14423b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object[] f14424c;

        public b(ub.e eVar) {
            super(3, eVar);
        }

        @Override // dc.q
        public final Object f(qc.f fVar, Object obj, Object obj2) {
            b bVar = new b((ub.e) obj2);
            bVar.f14423b = fVar;
            bVar.f14424c = (Object[]) obj;
            return bVar.invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            t2.b bVar;
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f14422a;
            if (i10 == 0) {
                rb.f.b(obj);
                qc.f fVar = this.f14423b;
                t2.b[] bVarArr = (t2.b[]) this.f14424c;
                int i11 = 0;
                int length = bVarArr.length;
                while (true) {
                    if (i11 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i11];
                    if (!ec.i.a(bVar, b.a.f14412a)) {
                        break;
                    }
                    i11++;
                }
                if (bVar == null) {
                    bVar = b.a.f14412a;
                }
                this.f14422a = 1;
                if (fVar.emit(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rb.f.b(obj);
            }
            return rb.h.f13851a;
        }
    }

    public f(qc.e[] eVarArr) {
        this.f14420a = eVarArr;
    }

    @Override // qc.e
    public final Object collect(qc.f<? super t2.b> fVar, ub.e eVar) {
        qc.e[] eVarArr = this.f14420a;
        rc.j jVar = new rc.j(null, new a(eVarArr), new b(null), fVar, eVarArr);
        l lVar = new l(eVar, eVar.getContext());
        Object t02 = x6.b.t0(lVar, lVar, jVar);
        vb.a aVar = vb.a.f16085a;
        if (t02 != aVar) {
            t02 = rb.h.f13851a;
        }
        return t02 == aVar ? t02 : rb.h.f13851a;
    }
}
