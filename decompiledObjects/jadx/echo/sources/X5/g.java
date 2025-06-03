package X5;

import X5.e;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public interface g {

    public static final class a {

        /* renamed from: X5.g$a$a, reason: collision with other inner class name */
        public static final class C0130a extends l implements p {

            /* renamed from: o, reason: collision with root package name */
            public static final C0130a f7292o = new C0130a();

            public C0130a() {
                super(2);
            }

            @Override // g6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                X5.c cVar;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                g x7 = acc.x(element.getKey());
                h hVar = h.f7293o;
                if (x7 == hVar) {
                    return element;
                }
                e.b bVar = e.f7290c;
                e eVar = (e) x7.b(bVar);
                if (eVar == null) {
                    cVar = new X5.c(x7, element);
                } else {
                    g x8 = x7.x(bVar);
                    if (x8 == hVar) {
                        return new X5.c(element, eVar);
                    }
                    cVar = new X5.c(new X5.c(x8, element), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == h.f7293o ? gVar : (g) context.u(gVar, C0130a.f7292o);
        }
    }

    public interface b extends g {

        public static final class a {
            public static Object a(b bVar, Object obj, p operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.a(bVar.getKey(), key)) {
                    return null;
                }
                Intrinsics.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.a(bVar.getKey(), key) ? h.f7293o : bVar;
            }

            public static g d(b bVar, g context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // X5.g
        b b(c cVar);

        c getKey();
    }

    public interface c {
    }

    b b(c cVar);

    g k(g gVar);

    Object u(Object obj, p pVar);

    g x(c cVar);
}
