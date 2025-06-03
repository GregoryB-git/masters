package P;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4093b;

    public c(Object obj, int i7) {
        super(null);
        this.f4092a = obj;
        this.f4093b = i7;
    }

    public final void a() {
        Object obj = this.f4092a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f4093b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final Object b() {
        return this.f4092a;
    }
}
