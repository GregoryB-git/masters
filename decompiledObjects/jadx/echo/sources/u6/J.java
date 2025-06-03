package u6;

import X5.g;
import kotlin.jvm.internal.Intrinsics;
import p6.K0;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final F f19961a = new F("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    public static final g6.p f19962b = a.f19965o;

    /* renamed from: c, reason: collision with root package name */
    public static final g6.p f19963c = b.f19966o;

    /* renamed from: d, reason: collision with root package name */
    public static final g6.p f19964d = c.f19967o;

    public static final class a extends kotlin.jvm.internal.l implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f19965o = new a();

        public a() {
            super(2);
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof K0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    public static final class b extends kotlin.jvm.internal.l implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final b f19966o = new b();

        public b() {
            super(2);
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K0 invoke(K0 k02, g.b bVar) {
            if (k02 != null) {
                return k02;
            }
            if (bVar instanceof K0) {
                return (K0) bVar;
            }
            return null;
        }
    }

    public static final class c extends kotlin.jvm.internal.l implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final c f19967o = new c();

        public c() {
            super(2);
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke(N n7, g.b bVar) {
            if (bVar instanceof K0) {
                K0 k02 = (K0) bVar;
                n7.a(k02, k02.B(n7.f19968a));
            }
            return n7;
        }
    }

    public static final void a(X5.g gVar, Object obj) {
        if (obj == f19961a) {
            return;
        }
        if (obj instanceof N) {
            ((N) obj).b(gVar);
            return;
        }
        Object u7 = gVar.u(null, f19963c);
        Intrinsics.c(u7, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((K0) u7).D(gVar, obj);
    }

    public static final Object b(X5.g gVar) {
        Object u7 = gVar.u(0, f19962b);
        Intrinsics.b(u7);
        return u7;
    }

    public static final Object c(X5.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f19961a;
        }
        if (obj instanceof Integer) {
            return gVar.u(new N(gVar, ((Number) obj).intValue()), f19964d);
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((K0) obj).B(gVar);
    }
}
