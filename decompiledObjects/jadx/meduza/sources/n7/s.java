package n7;

/* loaded from: classes.dex */
public final class s<T> implements q<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final e0.d f11315c = new e0.d(2);

    /* renamed from: a, reason: collision with root package name */
    public volatile q<T> f11316a;

    /* renamed from: b, reason: collision with root package name */
    public T f11317b;

    public s(q<T> qVar) {
        this.f11316a = qVar;
    }

    @Override // n7.q
    public final T get() {
        q<T> qVar = this.f11316a;
        e0.d dVar = f11315c;
        if (qVar != dVar) {
            synchronized (this) {
                if (this.f11316a != dVar) {
                    T t = this.f11316a.get();
                    this.f11317b = t;
                    this.f11316a = dVar;
                    return t;
                }
            }
        }
        return this.f11317b;
    }

    public final String toString() {
        Object obj = this.f11316a;
        StringBuilder l10 = defpackage.f.l("Suppliers.memoize(");
        if (obj == f11315c) {
            StringBuilder l11 = defpackage.f.l("<supplier that returned ");
            l11.append(this.f11317b);
            l11.append(">");
            obj = l11.toString();
        }
        l10.append(obj);
        l10.append(")");
        return l10.toString();
    }
}
