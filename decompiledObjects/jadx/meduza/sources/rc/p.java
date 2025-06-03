package rc;

import ec.v;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final dc.q<qc.f<Object>, Object, ub.e<? super rb.h>, Object> f13898a;

    public /* synthetic */ class a extends ec.h implements dc.q<qc.f<? super Object>, Object, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13899a = new a();

        public a() {
            super(3, qc.f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // dc.q
        public final Object f(qc.f fVar, Object obj, Object obj2) {
            return fVar.emit(obj, (ub.e) obj2);
        }
    }

    static {
        a aVar = a.f13899a;
        ec.i.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        v.a(3, aVar);
        f13898a = aVar;
    }
}
