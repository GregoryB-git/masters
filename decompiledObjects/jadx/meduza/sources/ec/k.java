package ec;

/* loaded from: classes.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f5269a;

    public k(Class cls) {
        i.e(cls, "jClass");
        this.f5269a = cls;
    }

    @Override // ec.c
    public final Class<?> d() {
        return this.f5269a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k) && i.a(this.f5269a, ((k) obj).f5269a);
    }

    public final int hashCode() {
        return this.f5269a.hashCode();
    }

    public final String toString() {
        return this.f5269a + " (Kotlin reflection is not available)";
    }
}
