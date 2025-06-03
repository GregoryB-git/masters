package t;

/* loaded from: classes.dex */
public class f implements Cloneable {

    /* renamed from: s, reason: collision with root package name */
    public static final Object f19383s = new Object();

    /* renamed from: o, reason: collision with root package name */
    public boolean f19384o;

    /* renamed from: p, reason: collision with root package name */
    public long[] f19385p;

    /* renamed from: q, reason: collision with root package name */
    public Object[] f19386q;

    /* renamed from: r, reason: collision with root package name */
    public int f19387r;

    public f() {
        this(10);
    }

    public void a(long j7, Object obj) {
        int i7 = this.f19387r;
        if (i7 != 0 && j7 <= this.f19385p[i7 - 1]) {
            l(j7, obj);
            return;
        }
        if (this.f19384o && i7 >= this.f19385p.length) {
            d();
        }
        int i8 = this.f19387r;
        if (i8 >= this.f19385p.length) {
            int f7 = d.f(i8 + 1);
            long[] jArr = new long[f7];
            Object[] objArr = new Object[f7];
            long[] jArr2 = this.f19385p;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f19386q;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f19385p = jArr;
            this.f19386q = objArr;
        }
        this.f19385p[i8] = j7;
        this.f19386q[i8] = obj;
        this.f19387r = i8 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f clone() {
        try {
            f fVar = (f) super.clone();
            fVar.f19385p = (long[]) this.f19385p.clone();
            fVar.f19386q = (Object[]) this.f19386q.clone();
            return fVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public final void d() {
        int i7 = this.f19387r;
        long[] jArr = this.f19385p;
        Object[] objArr = this.f19386q;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f19383s) {
                if (i9 != i8) {
                    jArr[i8] = jArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f19384o = false;
        this.f19387r = i8;
    }

    public Object f(long j7) {
        return g(j7, null);
    }

    public Object g(long j7, Object obj) {
        Object obj2;
        int b7 = d.b(this.f19385p, this.f19387r, j7);
        return (b7 < 0 || (obj2 = this.f19386q[b7]) == f19383s) ? obj : obj2;
    }

    public long j(int i7) {
        if (this.f19384o) {
            d();
        }
        return this.f19385p[i7];
    }

    public void l(long j7, Object obj) {
        int b7 = d.b(this.f19385p, this.f19387r, j7);
        if (b7 >= 0) {
            this.f19386q[b7] = obj;
            return;
        }
        int i7 = ~b7;
        int i8 = this.f19387r;
        if (i7 < i8) {
            Object[] objArr = this.f19386q;
            if (objArr[i7] == f19383s) {
                this.f19385p[i7] = j7;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f19384o && i8 >= this.f19385p.length) {
            d();
            i7 = ~d.b(this.f19385p, this.f19387r, j7);
        }
        int i9 = this.f19387r;
        if (i9 >= this.f19385p.length) {
            int f7 = d.f(i9 + 1);
            long[] jArr = new long[f7];
            Object[] objArr2 = new Object[f7];
            long[] jArr2 = this.f19385p;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f19386q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f19385p = jArr;
            this.f19386q = objArr2;
        }
        int i10 = this.f19387r;
        if (i10 - i7 != 0) {
            long[] jArr3 = this.f19385p;
            int i11 = i7 + 1;
            System.arraycopy(jArr3, i7, jArr3, i11, i10 - i7);
            Object[] objArr4 = this.f19386q;
            System.arraycopy(objArr4, i7, objArr4, i11, this.f19387r - i7);
        }
        this.f19385p[i7] = j7;
        this.f19386q[i7] = obj;
        this.f19387r++;
    }

    public void n(long j7) {
        int b7 = d.b(this.f19385p, this.f19387r, j7);
        if (b7 >= 0) {
            Object[] objArr = this.f19386q;
            Object obj = objArr[b7];
            Object obj2 = f19383s;
            if (obj != obj2) {
                objArr[b7] = obj2;
                this.f19384o = true;
            }
        }
    }

    public int o() {
        if (this.f19384o) {
            d();
        }
        return this.f19387r;
    }

    public Object p(int i7) {
        if (this.f19384o) {
            d();
        }
        return this.f19386q[i7];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19387r * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f19387r; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(j(i7));
            sb.append('=');
            Object p7 = p(i7);
            if (p7 != this) {
                sb.append(p7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public f(int i7) {
        this.f19384o = false;
        if (i7 == 0) {
            this.f19385p = d.f19378b;
            this.f19386q = d.f19379c;
        } else {
            int f7 = d.f(i7);
            this.f19385p = new long[f7];
            this.f19386q = new Object[f7];
        }
    }
}
