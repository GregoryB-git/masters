package o7;

/* loaded from: classes.dex */
public final class n0<E> extends x<E> {

    /* renamed from: q, reason: collision with root package name */
    public static final Object[] f12029q;

    /* renamed from: r, reason: collision with root package name */
    public static final n0<Object> f12030r;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f12031d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f12032e;
    public final transient Object[] f;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f12033o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int f12034p;

    static {
        Object[] objArr = new Object[0];
        f12029q = objArr;
        f12030r = new n0<>(objArr, 0, objArr, 0, 0);
    }

    public n0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f12031d = objArr;
        this.f12032e = i10;
        this.f = objArr2;
        this.f12033o = i11;
        this.f12034p = i12;
    }

    @Override // o7.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int s02 = x6.b.s0(obj);
        while (true) {
            int i10 = s02 & this.f12033o;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            s02 = i10 + 1;
        }
    }

    @Override // o7.r
    public final int h(int i10, Object[] objArr) {
        System.arraycopy(this.f12031d, 0, objArr, i10, this.f12034p);
        return i10 + this.f12034p;
    }

    @Override // o7.x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12032e;
    }

    @Override // o7.r
    public final Object[] i() {
        return this.f12031d;
    }

    @Override // o7.r
    public final int k() {
        return this.f12034p;
    }

    @Override // o7.r
    public final int l() {
        return 0;
    }

    @Override // o7.r
    public final boolean m() {
        return false;
    }

    @Override // o7.x, o7.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final x0<E> iterator() {
        return a().listIterator(0);
    }

    @Override // o7.x
    public final t<E> r() {
        return t.o(this.f12034p, this.f12031d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12034p;
    }
}
