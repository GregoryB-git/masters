package Y5;

import V5.o;
import X5.g;
import Z5.h;
import Z5.j;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a extends j {

        /* renamed from: o, reason: collision with root package name */
        public int f7613o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ p f7614p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Object f7615q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(X5.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f7614p = pVar;
            this.f7615q = obj;
            Intrinsics.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Z5.a
        public Object invokeSuspend(Object obj) {
            int i7 = this.f7613o;
            if (i7 == 0) {
                this.f7613o = 1;
                o.b(obj);
                Intrinsics.c(this.f7614p, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) y.b(this.f7614p, 2)).invoke(this.f7615q, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f7613o = 2;
            o.b(obj);
            return obj;
        }
    }

    public static final class b extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public int f7616o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ p f7617p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Object f7618q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(X5.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f7617p = pVar;
            this.f7618q = obj;
            Intrinsics.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Z5.a
        public Object invokeSuspend(Object obj) {
            int i7 = this.f7616o;
            if (i7 == 0) {
                this.f7616o = 1;
                o.b(obj);
                Intrinsics.c(this.f7617p, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) y.b(this.f7617p, 2)).invoke(this.f7618q, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f7616o = 2;
            o.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static X5.d a(p pVar, Object obj, X5.d completion) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        X5.d a7 = h.a(completion);
        if (pVar instanceof Z5.a) {
            return ((Z5.a) pVar).create(obj, a7);
        }
        g context = a7.getContext();
        return context == X5.h.f7293o ? new a(a7, pVar, obj) : new b(a7, context, pVar, obj);
    }

    public static X5.d b(X5.d dVar) {
        X5.d intercepted;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Z5.d dVar2 = dVar instanceof Z5.d ? (Z5.d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
