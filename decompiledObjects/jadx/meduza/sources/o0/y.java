package o0;

import o0.q;

@wb.e(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
/* loaded from: classes.dex */
public final class y extends wb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f11688a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11689b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11690c;

    /* renamed from: d, reason: collision with root package name */
    public ec.s f11691d;

    /* renamed from: e, reason: collision with root package name */
    public q f11692e;
    public /* synthetic */ Object f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q.d f11693o;

    /* renamed from: p, reason: collision with root package name */
    public int f11694p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q.d dVar, ub.e<? super y> eVar) {
        super(eVar);
        this.f11693o = dVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.f11694p |= Integer.MIN_VALUE;
        return this.f11693o.a(null, this);
    }
}
