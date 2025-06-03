package p6;

import X5.e;
import X5.g;
import kotlin.jvm.internal.Intrinsics;
import u6.AbstractC2044n;
import u6.C2040j;
import u6.C2043m;

/* loaded from: classes.dex */
public abstract class F extends X5.a implements X5.e {

    /* renamed from: p, reason: collision with root package name */
    public static final a f18490p = new a(null);

    public static final class a extends X5.b {

        /* renamed from: p6.F$a$a, reason: collision with other inner class name */
        public static final class C0248a extends kotlin.jvm.internal.l implements g6.l {

            /* renamed from: o, reason: collision with root package name */
            public static final C0248a f18491o = new C0248a();

            public C0248a() {
                super(1);
            }

            @Override // g6.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final F invoke(g.b bVar) {
                if (bVar instanceof F) {
                    return (F) bVar;
                }
                return null;
            }
        }

        public a() {
            super(X5.e.f7290c, C0248a.f18491o);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public F() {
        super(X5.e.f7290c);
    }

    @Override // X5.e
    public final void C(X5.d dVar) {
        Intrinsics.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C2040j) dVar).r();
    }

    public abstract void E(X5.g gVar, Runnable runnable);

    public boolean F(X5.g gVar) {
        return true;
    }

    public F G(int i7) {
        AbstractC2044n.a(i7);
        return new C2043m(this, i7);
    }

    @Override // X5.a, X5.g.b, X5.g
    public g.b b(g.c cVar) {
        return e.a.a(this, cVar);
    }

    @Override // X5.e
    public final X5.d i(X5.d dVar) {
        return new C2040j(this, dVar);
    }

    public String toString() {
        return M.a(this) + '@' + M.b(this);
    }

    @Override // X5.a, X5.g
    public X5.g x(g.c cVar) {
        return e.a.b(this, cVar);
    }
}
