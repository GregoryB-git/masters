package S;

import V5.o;
import V5.t;
import Z5.k;
import g6.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements P.f {

    /* renamed from: a, reason: collision with root package name */
    public final P.f f5805a;

    public static final class a extends k implements p {

        /* renamed from: o, reason: collision with root package name */
        public int f5806o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5807p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ p f5808q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, X5.d dVar) {
            super(2, dVar);
            this.f5808q = pVar;
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, X5.d dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(t.f6803a);
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            a aVar = new a(this.f5808q, dVar);
            aVar.f5807p = obj;
            return aVar;
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Object c7;
            c7 = Y5.d.c();
            int i7 = this.f5806o;
            if (i7 == 0) {
                o.b(obj);
                d dVar = (d) this.f5807p;
                p pVar = this.f5808q;
                this.f5806o = 1;
                obj = pVar.invoke(dVar, this);
                if (obj == c7) {
                    return c7;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            d dVar2 = (d) obj;
            ((S.a) dVar2).f();
            return dVar2;
        }
    }

    public b(P.f delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5805a = delegate;
    }

    @Override // P.f
    public Object a(p pVar, X5.d dVar) {
        return this.f5805a.a(new a(pVar, null), dVar);
    }

    @Override // P.f
    public s6.b b() {
        return this.f5805a.b();
    }
}
