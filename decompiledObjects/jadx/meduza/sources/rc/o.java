package rc;

import p2.m0;
import ub.h;

/* loaded from: classes.dex */
public final class o<T> extends wb.c implements qc.f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final qc.f<T> f13892a;

    /* renamed from: b, reason: collision with root package name */
    public final ub.h f13893b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13894c;

    /* renamed from: d, reason: collision with root package name */
    public ub.h f13895d;

    /* renamed from: e, reason: collision with root package name */
    public ub.e<? super rb.h> f13896e;

    public static final class a extends ec.j implements dc.p<Integer, h.b, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13897a = new a();

        public a() {
            super(2);
        }

        @Override // dc.p
        public final Integer invoke(Integer num, h.b bVar) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(qc.f<? super T> fVar, ub.h hVar) {
        super(n.f13891a, ub.i.f15164a);
        this.f13892a = fVar;
        this.f13893b = hVar;
        this.f13894c = ((Number) hVar.fold(0, a.f13897a)).intValue();
    }

    public final Object c(ub.e<? super rb.h> eVar, T t) {
        ub.h context = eVar.getContext();
        m0.C(context);
        ub.h hVar = this.f13895d;
        if (hVar != context) {
            if (hVar instanceof k) {
                StringBuilder l10 = defpackage.f.l("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                l10.append(((k) hVar).f13889a);
                l10.append(", but then emission attempt of value '");
                l10.append(t);
                l10.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(m0.e0(l10.toString()).toString());
            }
            if (((Number) context.fold(0, new q(this))).intValue() != this.f13894c) {
                StringBuilder l11 = defpackage.f.l("Flow invariant is violated:\n\t\tFlow was collected in ");
                l11.append(this.f13893b);
                l11.append(",\n\t\tbut emission happened in ");
                l11.append(context);
                l11.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(l11.toString().toString());
            }
            this.f13895d = context;
        }
        this.f13896e = eVar;
        dc.q<qc.f<Object>, Object, ub.e<? super rb.h>, Object> qVar = p.f13898a;
        qc.f<T> fVar = this.f13892a;
        ec.i.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object f = qVar.f(fVar, t, this);
        if (!ec.i.a(f, vb.a.f16085a)) {
            this.f13896e = null;
        }
        return f;
    }

    @Override // qc.f
    public final Object emit(T t, ub.e<? super rb.h> eVar) {
        try {
            Object c10 = c(eVar, t);
            return c10 == vb.a.f16085a ? c10 : rb.h.f13851a;
        } catch (Throwable th) {
            this.f13895d = new k(eVar.getContext(), th);
            throw th;
        }
    }

    @Override // wb.a, wb.d
    public final wb.d getCallerFrame() {
        ub.e<? super rb.h> eVar = this.f13896e;
        if (eVar instanceof wb.d) {
            return (wb.d) eVar;
        }
        return null;
    }

    @Override // wb.c, ub.e
    public final ub.h getContext() {
        ub.h hVar = this.f13895d;
        return hVar == null ? ub.i.f15164a : hVar;
    }

    @Override // wb.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = rb.e.a(obj);
        if (a10 != null) {
            this.f13895d = new k(getContext(), a10);
        }
        ub.e<? super rb.h> eVar = this.f13896e;
        if (eVar != null) {
            eVar.resumeWith(obj);
        }
        return vb.a.f16085a;
    }

    @Override // wb.c, wb.a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
