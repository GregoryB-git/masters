package s0;

import s0.n1;

/* loaded from: classes.dex */
public final class h0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V> f14006a;

    /* renamed from: b, reason: collision with root package name */
    public final K f14007b = "";

    /* renamed from: c, reason: collision with root package name */
    public final V f14008c;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final n1 f14009a;

        /* renamed from: b, reason: collision with root package name */
        public final K f14010b = "";

        /* renamed from: c, reason: collision with root package name */
        public final n1 f14011c;

        /* renamed from: d, reason: collision with root package name */
        public final V f14012d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n1.a aVar, n1.c cVar, q0.f fVar) {
            this.f14009a = aVar;
            this.f14011c = cVar;
            this.f14012d = fVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(n1.a aVar, n1.c cVar, q0.f fVar) {
        this.f14006a = new a<>(aVar, cVar, fVar);
        this.f14008c = fVar;
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v10) {
        return r.c(aVar.f14011c, 2, v10) + r.c(aVar.f14009a, 1, k10);
    }

    public static <K, V> void b(j jVar, a<K, V> aVar, K k10, V v10) {
        r.p(jVar, aVar.f14009a, 1, k10);
        r.p(jVar, aVar.f14011c, 2, v10);
    }
}
