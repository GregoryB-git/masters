package S;

import V5.o;
import V5.t;
import Z5.k;
import g6.p;

/* loaded from: classes.dex */
public abstract class g {

    public static final class a extends k implements p {

        /* renamed from: o, reason: collision with root package name */
        public int f5812o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5813p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ p f5814q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, X5.d dVar) {
            super(2, dVar);
            this.f5814q = pVar;
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, X5.d dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(t.f6803a);
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            a aVar = new a(this.f5814q, dVar);
            aVar.f5813p = obj;
            return aVar;
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Object c7;
            c7 = Y5.d.c();
            int i7 = this.f5812o;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S.a aVar = (S.a) this.f5813p;
                o.b(obj);
                return aVar;
            }
            o.b(obj);
            S.a c8 = ((d) this.f5813p).c();
            p pVar = this.f5814q;
            this.f5813p = c8;
            this.f5812o = 1;
            return pVar.invoke(c8, this) == c7 ? c7 : c8;
        }
    }

    public static final Object a(P.f fVar, p pVar, X5.d dVar) {
        return fVar.a(new a(pVar, null), dVar);
    }
}
