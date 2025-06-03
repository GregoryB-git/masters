package rc;

@wb.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends wb.i implements dc.p<qc.f<Object>, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f13866a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h<Object, Object> f13868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h<Object, Object> hVar, ub.e<? super g> eVar) {
        super(2, eVar);
        this.f13868c = hVar;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        g gVar = new g(this.f13868c, eVar);
        gVar.f13867b = obj;
        return gVar;
    }

    @Override // dc.p
    public final Object invoke(qc.f<Object> fVar, ub.e<? super rb.h> eVar) {
        return ((g) create(fVar, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = vb.a.f16085a;
        int i10 = this.f13866a;
        if (i10 == 0) {
            rb.f.b(obj);
            qc.f fVar = (qc.f) this.f13867b;
            h<Object, Object> hVar = this.f13868c;
            this.f13866a = 1;
            Object collect = ((i) hVar).f13869d.collect(fVar, this);
            if (collect != obj2) {
                collect = rb.h.f13851a;
            }
            if (collect == obj2) {
                return obj2;
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
