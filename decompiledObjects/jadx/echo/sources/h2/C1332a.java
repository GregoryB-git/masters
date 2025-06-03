package h2;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332a implements U5.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14577c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile U5.a f14578a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f14579b = f14577c;

    public C1332a(U5.a aVar) {
        this.f14578a = aVar;
    }

    public static U5.a a(U5.a aVar) {
        d.b(aVar);
        return aVar instanceof C1332a ? aVar : new C1332a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f14577c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // U5.a
    public Object get() {
        Object obj = this.f14579b;
        Object obj2 = f14577c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f14579b;
                    if (obj == obj2) {
                        obj = this.f14578a.get();
                        this.f14579b = b(this.f14579b, obj);
                        this.f14578a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
