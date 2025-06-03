package t;

/* loaded from: classes.dex */
public class i implements Cloneable {

    /* renamed from: s, reason: collision with root package name */
    public static final Object f19403s = new Object();

    /* renamed from: o, reason: collision with root package name */
    public boolean f19404o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f19405p;

    /* renamed from: q, reason: collision with root package name */
    public Object[] f19406q;

    /* renamed from: r, reason: collision with root package name */
    public int f19407r;

    public i() {
        this(10);
    }

    public void a(int i7, Object obj) {
        int i8 = this.f19407r;
        if (i8 != 0 && i7 <= this.f19405p[i8 - 1]) {
            n(i7, obj);
            return;
        }
        if (this.f19404o && i8 >= this.f19405p.length) {
            f();
        }
        int i9 = this.f19407r;
        if (i9 >= this.f19405p.length) {
            int e7 = d.e(i9 + 1);
            int[] iArr = new int[e7];
            Object[] objArr = new Object[e7];
            int[] iArr2 = this.f19405p;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f19406q;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f19405p = iArr;
            this.f19406q = objArr;
        }
        this.f19405p[i9] = i7;
        this.f19406q[i9] = obj;
        this.f19407r = i9 + 1;
    }

    public void b() {
        int i7 = this.f19407r;
        Object[] objArr = this.f19406q;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f19407r = 0;
        this.f19404o = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.f19405p = (int[]) this.f19405p.clone();
            iVar.f19406q = (Object[]) this.f19406q.clone();
            return iVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public final void f() {
        int i7 = this.f19407r;
        int[] iArr = this.f19405p;
        Object[] objArr = this.f19406q;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f19403s) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f19404o = false;
        this.f19407r = i8;
    }

    public Object g(int i7) {
        return j(i7, null);
    }

    public Object j(int i7, Object obj) {
        Object obj2;
        int a7 = d.a(this.f19405p, this.f19407r, i7);
        return (a7 < 0 || (obj2 = this.f19406q[a7]) == f19403s) ? obj : obj2;
    }

    public int l(int i7) {
        if (this.f19404o) {
            f();
        }
        return this.f19405p[i7];
    }

    public void n(int i7, Object obj) {
        int a7 = d.a(this.f19405p, this.f19407r, i7);
        if (a7 >= 0) {
            this.f19406q[a7] = obj;
            return;
        }
        int i8 = ~a7;
        int i9 = this.f19407r;
        if (i8 < i9) {
            Object[] objArr = this.f19406q;
            if (objArr[i8] == f19403s) {
                this.f19405p[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f19404o && i9 >= this.f19405p.length) {
            f();
            i8 = ~d.a(this.f19405p, this.f19407r, i7);
        }
        int i10 = this.f19407r;
        if (i10 >= this.f19405p.length) {
            int e7 = d.e(i10 + 1);
            int[] iArr = new int[e7];
            Object[] objArr2 = new Object[e7];
            int[] iArr2 = this.f19405p;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f19406q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f19405p = iArr;
            this.f19406q = objArr2;
        }
        int i11 = this.f19407r;
        if (i11 - i8 != 0) {
            int[] iArr3 = this.f19405p;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr4 = this.f19406q;
            System.arraycopy(objArr4, i8, objArr4, i12, this.f19407r - i8);
        }
        this.f19405p[i8] = i7;
        this.f19406q[i8] = obj;
        this.f19407r++;
    }

    public int o() {
        if (this.f19404o) {
            f();
        }
        return this.f19407r;
    }

    public Object p(int i7) {
        if (this.f19404o) {
            f();
        }
        return this.f19406q[i7];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19407r * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f19407r; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(l(i7));
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

    public i(int i7) {
        this.f19404o = false;
        if (i7 == 0) {
            this.f19405p = d.f19377a;
            this.f19406q = d.f19379c;
        } else {
            int e7 = d.e(i7);
            this.f19405p = new int[e7];
            this.f19406q = new Object[e7];
        }
    }
}
