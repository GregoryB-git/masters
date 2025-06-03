package o0;

/* loaded from: classes.dex */
public final class c<T> extends b0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f11583a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11584b;

    public c(T t, int i10) {
        this.f11583a = t;
        this.f11584b = i10;
    }

    public final void a() {
        T t = this.f11583a;
        if (!((t != null ? t.hashCode() : 0) == this.f11584b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
