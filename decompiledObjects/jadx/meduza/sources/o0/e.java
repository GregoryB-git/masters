package o0;

import java.util.List;
import o0.h;

@wb.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends wb.i implements dc.p<k<Object>, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11586a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<d<Object>> f11588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends d<Object>> list, ub.e<? super e> eVar) {
        super(2, eVar);
        this.f11588c = list;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        e eVar2 = new e(this.f11588c, eVar);
        eVar2.f11587b = obj;
        return eVar2;
    }

    @Override // dc.p
    public final Object invoke(k<Object> kVar, ub.e<? super rb.h> eVar) {
        return ((e) create(kVar, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f11586a;
        if (i10 == 0) {
            rb.f.b(obj);
            k kVar = (k) this.f11587b;
            h.a aVar2 = h.f11602a;
            List<d<Object>> list = this.f11588c;
            this.f11586a = 1;
            if (h.a.a(aVar2, list, kVar, this) == aVar) {
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
