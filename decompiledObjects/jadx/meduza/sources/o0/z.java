package o0;

import java.util.LinkedHashSet;

@wb.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
/* loaded from: classes.dex */
public final class z extends wb.c {

    /* renamed from: a, reason: collision with root package name */
    public q f11695a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11696b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11697c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q<Object> f11699e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(q<Object> qVar, ub.e<? super z> eVar) {
        super(eVar);
        this.f11699e = qVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.f11698d = obj;
        this.f |= Integer.MIN_VALUE;
        q<Object> qVar = this.f11699e;
        LinkedHashSet linkedHashSet = q.f11615k;
        return qVar.i(this, null, null);
    }
}
