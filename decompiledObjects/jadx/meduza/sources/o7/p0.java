package o7;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class p0<T> extends k0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final k0<? super T> f12036a;

    public p0(k0<? super T> k0Var) {
        k0Var.getClass();
        this.f12036a = k0Var;
    }

    @Override // o7.k0
    public final <S extends T> k0<S> a() {
        return this.f12036a;
    }

    @Override // o7.k0, java.util.Comparator
    public final int compare(T t, T t10) {
        return this.f12036a.compare(t10, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            return this.f12036a.equals(((p0) obj).f12036a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f12036a.hashCode();
    }

    public final String toString() {
        return this.f12036a + ".reverse()";
    }
}
