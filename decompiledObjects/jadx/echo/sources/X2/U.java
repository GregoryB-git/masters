package X2;

/* loaded from: classes.dex */
public final class U extends AbstractC0706y {

    /* renamed from: v, reason: collision with root package name */
    public static final Object[] f7085v;

    /* renamed from: w, reason: collision with root package name */
    public static final U f7086w;

    /* renamed from: q, reason: collision with root package name */
    public final transient Object[] f7087q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f7088r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Object[] f7089s;

    /* renamed from: t, reason: collision with root package name */
    public final transient int f7090t;

    /* renamed from: u, reason: collision with root package name */
    public final transient int f7091u;

    static {
        Object[] objArr = new Object[0];
        f7085v = objArr;
        f7086w = new U(objArr, 0, objArr, 0, 0);
    }

    public U(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f7087q = objArr;
        this.f7088r = i7;
        this.f7089s = objArr2;
        this.f7090t = i8;
        this.f7091u = i9;
    }

    @Override // X2.AbstractC0706y
    public AbstractC0703v V() {
        return AbstractC0703v.D(this.f7087q, this.f7091u);
    }

    @Override // X2.AbstractC0706y
    public boolean W() {
        return true;
    }

    @Override // X2.AbstractC0701t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f7089s;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c7 = AbstractC0700s.c(obj);
        while (true) {
            int i7 = c7 & this.f7090t;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c7 = i7 + 1;
        }
    }

    @Override // X2.AbstractC0701t
    public int d(Object[] objArr, int i7) {
        System.arraycopy(this.f7087q, 0, objArr, i7, this.f7091u);
        return i7 + this.f7091u;
    }

    @Override // X2.AbstractC0701t
    public Object[] f() {
        return this.f7087q;
    }

    @Override // X2.AbstractC0701t
    public int g() {
        return this.f7091u;
    }

    @Override // X2.AbstractC0706y, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f7088r;
    }

    @Override // X2.AbstractC0701t
    public int i() {
        return 0;
    }

    @Override // X2.AbstractC0701t
    public boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q */
    public g0 iterator() {
        return a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7091u;
    }

    @Override // X2.AbstractC0706y, X2.AbstractC0701t
    public Object writeReplace() {
        return super.writeReplace();
    }
}
