package vb;

import dc.p;
import ec.i;
import ec.v;
import rb.f;
import ub.e;
import wb.g;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public int f16087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f16088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, e eVar, p pVar) {
        super(eVar);
        this.f16088b = pVar;
        this.f16089c = obj;
        i.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f16087a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f16087a = 2;
            f.b(obj);
            return obj;
        }
        this.f16087a = 1;
        f.b(obj);
        i.c(this.f16088b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        p pVar = this.f16088b;
        v.a(2, pVar);
        return pVar.invoke(this.f16089c, this);
    }
}
