package vb;

import dc.p;
import ec.i;
import ec.v;
import rb.f;
import ub.e;
import ub.h;

/* loaded from: classes.dex */
public final class c extends wb.c {

    /* renamed from: a, reason: collision with root package name */
    public int f16090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f16091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, h hVar, p pVar, Object obj) {
        super(eVar, hVar);
        this.f16091b = pVar;
        this.f16092c = obj;
        i.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f16090a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f16090a = 2;
            f.b(obj);
            return obj;
        }
        this.f16090a = 1;
        f.b(obj);
        i.c(this.f16091b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        p pVar = this.f16091b;
        v.a(2, pVar);
        return pVar.invoke(this.f16092c, this);
    }
}
