package X5;

import X5.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface e extends g.b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f7290c = b.f7291o;

    public static final class a {
        public static g.b a(e eVar, g.c key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof X5.b)) {
                if (e.f7290c != key) {
                    return null;
                }
                Intrinsics.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            X5.b bVar = (X5.b) key;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            g.b b7 = bVar.b(eVar);
            if (b7 instanceof g.b) {
                return b7;
            }
            return null;
        }

        public static g b(e eVar, g.c key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof X5.b)) {
                return e.f7290c == key ? h.f7293o : eVar;
            }
            X5.b bVar = (X5.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f7293o;
        }
    }

    public static final class b implements g.c {

        /* renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ b f7291o = new b();
    }

    void C(d dVar);

    d i(d dVar);
}
