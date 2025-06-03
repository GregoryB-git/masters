package c9;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<T> f2548a = u7.b.class;

    /* renamed from: b, reason: collision with root package name */
    public final T f2549b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(u7.b bVar) {
        this.f2549b = bVar;
    }

    public final String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f2548a, this.f2549b);
    }
}
