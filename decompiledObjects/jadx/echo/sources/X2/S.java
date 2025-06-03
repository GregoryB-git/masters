package X2;

import java.util.Objects;

/* loaded from: classes.dex */
public class S extends AbstractC0703v {

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC0703v f7068s = new S(new Object[0], 0);

    /* renamed from: q, reason: collision with root package name */
    public final transient Object[] f7069q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f7070r;

    public S(Object[] objArr, int i7) {
        this.f7069q = objArr;
        this.f7070r = i7;
    }

    @Override // X2.AbstractC0703v, X2.AbstractC0701t
    public int d(Object[] objArr, int i7) {
        System.arraycopy(this.f7069q, 0, objArr, i7, this.f7070r);
        return i7 + this.f7070r;
    }

    @Override // X2.AbstractC0701t
    public Object[] f() {
        return this.f7069q;
    }

    @Override // X2.AbstractC0701t
    public int g() {
        return this.f7070r;
    }

    @Override // java.util.List
    public Object get(int i7) {
        W2.m.h(i7, this.f7070r);
        Object obj = this.f7069q[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // X2.AbstractC0701t
    public int i() {
        return 0;
    }

    @Override // X2.AbstractC0701t
    public boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7070r;
    }

    @Override // X2.AbstractC0703v, X2.AbstractC0701t
    public Object writeReplace() {
        return super.writeReplace();
    }
}
