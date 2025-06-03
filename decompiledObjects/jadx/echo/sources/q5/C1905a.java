package q5;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1905a implements U5.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18891c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile U5.a f18892a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f18893b = f18891c;

    public C1905a(U5.a aVar) {
        this.f18892a = aVar;
    }

    public static U5.a a(U5.a aVar) {
        AbstractC1906b.b(aVar);
        return aVar instanceof C1905a ? aVar : new C1905a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f18891c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // U5.a
    public Object get() {
        Object obj = this.f18893b;
        Object obj2 = f18891c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f18893b;
                    if (obj == obj2) {
                        obj = this.f18892a.get();
                        this.f18893b = b(this.f18893b, obj);
                        this.f18892a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
