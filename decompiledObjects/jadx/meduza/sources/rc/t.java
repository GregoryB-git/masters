package rc;

import sc.w;

/* loaded from: classes.dex */
public final class t<T> implements qc.f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ub.h f13904a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13905b;

    /* renamed from: c, reason: collision with root package name */
    public final a f13906c;

    @wb.e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    public static final class a extends wb.i implements dc.p<T, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13907a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13908b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qc.f<T> f13909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(qc.f<? super T> fVar, ub.e<? super a> eVar) {
            super(2, eVar);
            this.f13909c = fVar;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            a aVar = new a(this.f13909c, eVar);
            aVar.f13908b = obj;
            return aVar;
        }

        @Override // dc.p
        public final Object invoke(Object obj, ub.e<? super rb.h> eVar) {
            return ((a) create(obj, eVar)).invokeSuspend(rb.h.f13851a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f13907a;
            if (i10 == 0) {
                rb.f.b(obj);
                Object obj2 = this.f13908b;
                qc.f<T> fVar = this.f13909c;
                this.f13907a = 1;
                if (fVar.emit(obj2, this) == aVar) {
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

    public t(qc.f<? super T> fVar, ub.h hVar) {
        this.f13904a = hVar;
        this.f13905b = w.b(hVar);
        this.f13906c = new a(fVar, null);
    }

    @Override // qc.f
    public final Object emit(T t, ub.e<? super rb.h> eVar) {
        Object A0 = x6.b.A0(this.f13904a, t, this.f13905b, this.f13906c, eVar);
        return A0 == vb.a.f16085a ? A0 : rb.h.f13851a;
    }
}
