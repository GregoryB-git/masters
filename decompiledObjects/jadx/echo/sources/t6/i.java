package t6;

import V5.n;
import V5.t;
import X5.g;
import g6.p;
import g6.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.u0;

/* loaded from: classes.dex */
public final class i extends Z5.d implements s6.c, Z5.e {

    /* renamed from: o, reason: collision with root package name */
    public final s6.c f19611o;

    /* renamed from: p, reason: collision with root package name */
    public final X5.g f19612p;

    /* renamed from: q, reason: collision with root package name */
    public final int f19613q;

    /* renamed from: r, reason: collision with root package name */
    public X5.g f19614r;

    /* renamed from: s, reason: collision with root package name */
    public X5.d f19615s;

    public static final class a extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f19616o = new a();

        public a() {
            super(2);
        }

        public final Integer a(int i7, g.b bVar) {
            return Integer.valueOf(i7 + 1);
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public i(s6.c cVar, X5.g gVar) {
        super(g.f19606o, X5.h.f7293o);
        this.f19611o = cVar;
        this.f19612p = gVar;
        this.f19613q = ((Number) gVar.u(0, a.f19616o)).intValue();
    }

    public final void a(X5.g gVar, X5.g gVar2, Object obj) {
        if (gVar2 instanceof e) {
            h((e) gVar2, obj);
        }
        k.a(this, gVar);
    }

    public final Object b(X5.d dVar, Object obj) {
        q qVar;
        Object c7;
        X5.g context = dVar.getContext();
        u0.d(context);
        X5.g gVar = this.f19614r;
        if (gVar != context) {
            a(context, gVar, obj);
            this.f19614r = context;
        }
        this.f19615s = dVar;
        qVar = j.f19617a;
        s6.c cVar = this.f19611o;
        Intrinsics.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object c8 = qVar.c(cVar, obj, this);
        c7 = Y5.d.c();
        if (!Intrinsics.a(c8, c7)) {
            this.f19615s = null;
        }
        return c8;
    }

    @Override // s6.c
    public Object emit(Object obj, X5.d dVar) {
        Object c7;
        Object c8;
        try {
            Object b7 = b(dVar, obj);
            c7 = Y5.d.c();
            if (b7 == c7) {
                Z5.h.c(dVar);
            }
            c8 = Y5.d.c();
            return b7 == c8 ? b7 : t.f6803a;
        } catch (Throwable th) {
            this.f19614r = new e(th, dVar.getContext());
            throw th;
        }
    }

    @Override // Z5.a, Z5.e
    public Z5.e getCallerFrame() {
        X5.d dVar = this.f19615s;
        if (dVar instanceof Z5.e) {
            return (Z5.e) dVar;
        }
        return null;
    }

    @Override // Z5.d, X5.d
    public X5.g getContext() {
        X5.g gVar = this.f19614r;
        return gVar == null ? X5.h.f7293o : gVar;
    }

    @Override // Z5.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void h(e eVar, Object obj) {
        String e7;
        e7 = kotlin.text.k.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + eVar.f19604o + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(e7.toString());
    }

    @Override // Z5.a
    public Object invokeSuspend(Object obj) {
        Object c7;
        Throwable b7 = n.b(obj);
        if (b7 != null) {
            this.f19614r = new e(b7, getContext());
        }
        X5.d dVar = this.f19615s;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        c7 = Y5.d.c();
        return c7;
    }

    @Override // Z5.d, Z5.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
