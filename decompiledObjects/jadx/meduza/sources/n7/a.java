package n7;

/* loaded from: classes.dex */
public final class a<T> extends h<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final a<Object> f11274a = new a<>();

    @Override // n7.h
    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // n7.h
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
