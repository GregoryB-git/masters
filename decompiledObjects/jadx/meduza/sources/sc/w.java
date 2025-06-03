package sc;

import d2.h0;
import nc.b2;
import ub.h;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f14370a = new h0("NO_THREAD_ELEMENTS", 9);

    /* renamed from: b, reason: collision with root package name */
    public static final a f14371b = a.f14374a;

    /* renamed from: c, reason: collision with root package name */
    public static final b f14372c = b.f14375a;

    /* renamed from: d, reason: collision with root package name */
    public static final c f14373d = c.f14376a;

    public static final class a extends ec.j implements dc.p<Object, h.b, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14374a = new a();

        public a() {
            super(2);
        }

        @Override // dc.p
        public final Object invoke(Object obj, h.b bVar) {
            h.b bVar2 = bVar;
            if (!(bVar2 instanceof b2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar2 : Integer.valueOf(intValue + 1);
        }
    }

    public static final class b extends ec.j implements dc.p<b2<?>, h.b, b2<?>> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14375a = new b();

        public b() {
            super(2);
        }

        @Override // dc.p
        public final b2<?> invoke(b2<?> b2Var, h.b bVar) {
            b2<?> b2Var2 = b2Var;
            h.b bVar2 = bVar;
            if (b2Var2 != null) {
                return b2Var2;
            }
            if (bVar2 instanceof b2) {
                return (b2) bVar2;
            }
            return null;
        }
    }

    public static final class c extends ec.j implements dc.p<z, h.b, z> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14376a = new c();

        public c() {
            super(2);
        }

        @Override // dc.p
        public final z invoke(z zVar, h.b bVar) {
            z zVar2 = zVar;
            h.b bVar2 = bVar;
            if (bVar2 instanceof b2) {
                b2<Object> b2Var = (b2) bVar2;
                String M = b2Var.M(zVar2.f14379a);
                Object[] objArr = zVar2.f14380b;
                int i10 = zVar2.f14382d;
                objArr[i10] = M;
                b2<Object>[] b2VarArr = zVar2.f14381c;
                zVar2.f14382d = i10 + 1;
                b2VarArr[i10] = b2Var;
            }
            return zVar2;
        }
    }

    public static final void a(ub.h hVar, Object obj) {
        if (obj == f14370a) {
            return;
        }
        if (!(obj instanceof z)) {
            Object fold = hVar.fold(null, f14372c);
            ec.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((b2) fold).k0(obj);
            return;
        }
        z zVar = (z) obj;
        int length = zVar.f14381c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            b2<Object> b2Var = zVar.f14381c[length];
            ec.i.b(b2Var);
            b2Var.k0(zVar.f14380b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    public static final Object b(ub.h hVar) {
        Object fold = hVar.fold(0, f14371b);
        ec.i.b(fold);
        return fold;
    }

    public static final Object c(ub.h hVar, Object obj) {
        if (obj == null) {
            obj = b(hVar);
        }
        return obj == 0 ? f14370a : obj instanceof Integer ? hVar.fold(new z(hVar, ((Number) obj).intValue()), f14373d) : ((b2) obj).M(hVar);
    }
}
