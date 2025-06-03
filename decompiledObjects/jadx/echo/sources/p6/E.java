package p6;

import X5.g;

/* loaded from: classes.dex */
public abstract class E {

    public static final class a extends kotlin.jvm.internal.l implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f18486o = new a();

        public a() {
            super(2);
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X5.g invoke(X5.g gVar, g.b bVar) {
            return gVar.k(bVar);
        }
    }

    public static final class b extends kotlin.jvm.internal.l implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.u f18487o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f18488p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.u uVar, boolean z7) {
            super(2);
            this.f18487o = uVar;
            this.f18488p = z7;
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X5.g invoke(X5.g gVar, g.b bVar) {
            return gVar.k(bVar);
        }
    }

    public static final class c extends kotlin.jvm.internal.l implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final c f18489o = new c();

        public c() {
            super(2);
        }

        public final Boolean a(boolean z7, g.b bVar) {
            return Boolean.valueOf(z7);
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    public static final X5.g a(X5.g gVar, X5.g gVar2, boolean z7) {
        boolean c7 = c(gVar);
        boolean c8 = c(gVar2);
        if (!c7 && !c8) {
            return gVar.k(gVar2);
        }
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        uVar.f16230o = gVar2;
        X5.h hVar = X5.h.f7293o;
        X5.g gVar3 = (X5.g) gVar.u(hVar, new b(uVar, z7));
        if (c8) {
            uVar.f16230o = ((X5.g) uVar.f16230o).u(hVar, a.f18486o);
        }
        return gVar3.k((X5.g) uVar.f16230o);
    }

    public static final String b(X5.g gVar) {
        return null;
    }

    public static final boolean c(X5.g gVar) {
        return ((Boolean) gVar.u(Boolean.FALSE, c.f18489o)).booleanValue();
    }

    public static final X5.g d(X5.g gVar, X5.g gVar2) {
        return !c(gVar2) ? gVar.k(gVar2) : a(gVar, gVar2, false);
    }

    public static final X5.g e(I i7, X5.g gVar) {
        X5.g a7 = a(i7.f(), gVar, true);
        return (a7 == W.a() || a7.b(X5.e.f7290c) != null) ? a7 : a7.k(W.a());
    }

    public static final N0 f(Z5.e eVar) {
        while (!(eVar instanceof T) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof N0) {
                return (N0) eVar;
            }
        }
        return null;
    }

    public static final N0 g(X5.d dVar, X5.g gVar, Object obj) {
        if (!(dVar instanceof Z5.e) || gVar.b(O0.f18509o) == null) {
            return null;
        }
        N0 f7 = f((Z5.e) dVar);
        if (f7 != null) {
            f7.L0(gVar, obj);
        }
        return f7;
    }
}
