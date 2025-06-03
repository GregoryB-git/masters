package qc;

@wb.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
/* loaded from: classes.dex */
public final class v extends wb.c {

    /* renamed from: a, reason: collision with root package name */
    public w f13458a;

    /* renamed from: b, reason: collision with root package name */
    public rc.o f13459b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13460c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w<Object> f13461d;

    /* renamed from: e, reason: collision with root package name */
    public int f13462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w<Object> wVar, ub.e<? super v> eVar) {
        super(eVar);
        this.f13461d = wVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.f13460c = obj;
        this.f13462e |= Integer.MIN_VALUE;
        return this.f13461d.a(this);
    }
}
