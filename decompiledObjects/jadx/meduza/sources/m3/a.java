package m3;

/* loaded from: classes.dex */
public final class a<T> implements qb.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9874c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile qb.a<T> f9875a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f9876b = f9874c;

    public a(b bVar) {
        this.f9875a = bVar;
    }

    public static qb.a a(b bVar) {
        return bVar instanceof a ? bVar : new a(bVar);
    }

    public static void b(Object obj, Object obj2) {
        if (!(obj != f9874c) || obj == obj2) {
            return;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // qb.a
    public final T get() {
        T t = (T) this.f9876b;
        Object obj = f9874c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f9876b;
                if (t == obj) {
                    t = this.f9875a.get();
                    b(this.f9876b, t);
                    this.f9876b = t;
                    this.f9875a = null;
                }
            }
        }
        return t;
    }
}
