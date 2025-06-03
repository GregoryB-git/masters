package t6;

import g6.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final q f19617a;

    public /* synthetic */ class a extends kotlin.jvm.internal.j implements q {

        /* renamed from: o, reason: collision with root package name */
        public static final a f19618o = new a();

        public a() {
            super(3, s6.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // g6.q
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object c(s6.c cVar, Object obj, X5.d dVar) {
            return cVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f19618o;
        Intrinsics.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f19617a = (q) y.b(aVar, 3);
    }
}
