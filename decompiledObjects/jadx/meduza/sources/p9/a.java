package p9;

/* loaded from: classes.dex */
public final class a<T> implements qb.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13046c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile qb.a<T> f13047a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f13048b = f13046c;

    public a(b bVar) {
        this.f13047a = bVar;
    }

    public static qb.a a(b bVar) {
        return bVar instanceof a ? bVar : new a(bVar);
    }

    public static void b(Object obj, Object obj2) {
        if (!(obj != f13046c) || obj == obj2) {
            return;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // qb.a
    public final T get() {
        T t = (T) this.f13048b;
        Object obj = f13046c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f13048b;
                if (t == obj) {
                    t = this.f13047a.get();
                    b(this.f13048b, t);
                    this.f13048b = t;
                    this.f13047a = null;
                }
            }
        }
        return t;
    }
}
