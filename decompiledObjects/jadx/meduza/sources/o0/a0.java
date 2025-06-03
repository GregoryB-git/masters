package o0;

import nc.d0;

@wb.e(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends wb.i implements dc.p<d0, ub.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dc.p<Object, ub.e<Object>, Object> f11581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Object obj, ub.e eVar, dc.p pVar) {
        super(2, eVar);
        this.f11581b = pVar;
        this.f11582c = obj;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new a0(this.f11582c, eVar, this.f11581b);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<Object> eVar) {
        return ((a0) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f11580a;
        if (i10 == 0) {
            rb.f.b(obj);
            dc.p<Object, ub.e<Object>, Object> pVar = this.f11581b;
            Object obj2 = this.f11582c;
            this.f11580a = 1;
            obj = pVar.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rb.f.b(obj);
        }
        return obj;
    }
}
