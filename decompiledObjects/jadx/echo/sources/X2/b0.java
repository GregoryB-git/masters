package X2;

/* loaded from: classes.dex */
public final class b0 extends AbstractC0706y {

    /* renamed from: q, reason: collision with root package name */
    public final transient Object f7111q;

    public b0(Object obj) {
        this.f7111q = W2.m.j(obj);
    }

    @Override // X2.AbstractC0706y, X2.AbstractC0701t
    public AbstractC0703v a() {
        return AbstractC0703v.Z(this.f7111q);
    }

    @Override // X2.AbstractC0701t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f7111q.equals(obj);
    }

    @Override // X2.AbstractC0701t
    public int d(Object[] objArr, int i7) {
        objArr[i7] = this.f7111q;
        return i7 + 1;
    }

    @Override // X2.AbstractC0706y, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7111q.hashCode();
    }

    @Override // X2.AbstractC0701t
    public boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q */
    public g0 iterator() {
        return C.s(this.f7111q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f7111q.toString() + ']';
    }

    @Override // X2.AbstractC0706y, X2.AbstractC0701t
    public Object writeReplace() {
        return super.writeReplace();
    }
}
