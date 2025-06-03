package d8;

/* loaded from: classes.dex */
public final class o<T> implements t9.b<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3617c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f3618a = f3617c;

    /* renamed from: b, reason: collision with root package name */
    public volatile t9.b<T> f3619b;

    public o(t9.b<T> bVar) {
        this.f3619b = bVar;
    }

    @Override // t9.b
    public final T get() {
        T t = (T) this.f3618a;
        Object obj = f3617c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f3618a;
                if (t == obj) {
                    t = this.f3619b.get();
                    this.f3618a = t;
                    this.f3619b = null;
                }
            }
        }
        return t;
    }
}
