package o7;

/* loaded from: classes.dex */
public final class v0<E> extends x<E> {

    /* renamed from: d, reason: collision with root package name */
    public final transient E f12068d;

    public v0(E e10) {
        e10.getClass();
        this.f12068d = e10;
    }

    @Override // o7.x, o7.r
    public final t<E> a() {
        return t.t(this.f12068d);
    }

    @Override // o7.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12068d.equals(obj);
    }

    @Override // o7.r
    public final int h(int i10, Object[] objArr) {
        objArr[i10] = this.f12068d;
        return i10 + 1;
    }

    @Override // o7.x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12068d.hashCode();
    }

    @Override // o7.r
    public final boolean m() {
        return false;
    }

    @Override // o7.x, o7.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final x0<E> iterator() {
        return new a0(this.f12068d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.f12068d.toString() + ']';
    }
}
