package ma;

import ma.v1;

/* loaded from: classes.dex */
public final class l0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V> f11030a;

    /* renamed from: b, reason: collision with root package name */
    public final K f11031b = "";

    /* renamed from: c, reason: collision with root package name */
    public final V f11032c;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final v1 f11033a;

        /* renamed from: b, reason: collision with root package name */
        public final K f11034b = "";

        /* renamed from: c, reason: collision with root package name */
        public final v1 f11035c;

        /* renamed from: d, reason: collision with root package name */
        public final V f11036d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(v1.a aVar, v1 v1Var, Object obj) {
            this.f11033a = aVar;
            this.f11035c = v1Var;
            this.f11036d = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(v1.a aVar, v1 v1Var, Object obj) {
        this.f11030a = new a<>(aVar, v1Var, obj);
        this.f11032c = obj;
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v10) {
        return s.c(aVar.f11035c, 2, v10) + s.c(aVar.f11033a, 1, k10);
    }

    public static <K, V> void b(k kVar, a<K, V> aVar, K k10, V v10) {
        s.q(kVar, aVar.f11033a, 1, k10);
        s.q(kVar, aVar.f11035c, 2, v10);
    }
}
