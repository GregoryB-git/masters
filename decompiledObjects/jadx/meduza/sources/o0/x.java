package o0;

@wb.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
/* loaded from: classes.dex */
public final class x extends wb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f11683a;

    /* renamed from: b, reason: collision with root package name */
    public q f11684b;

    /* renamed from: c, reason: collision with root package name */
    public nc.r f11685c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q<Object> f11687e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q<Object> qVar, ub.e<? super x> eVar) {
        super(eVar);
        this.f11687e = qVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.f11686d = obj;
        this.f |= Integer.MIN_VALUE;
        return q.b(this.f11687e, null, this);
    }
}
