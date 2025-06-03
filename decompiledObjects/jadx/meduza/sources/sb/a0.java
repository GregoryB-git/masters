package sb;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a0<T> extends d<T> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f14293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14294b;

    /* renamed from: c, reason: collision with root package name */
    public int f14295c;

    /* renamed from: d, reason: collision with root package name */
    public int f14296d;

    public static final class a extends c<T> {

        /* renamed from: c, reason: collision with root package name */
        public int f14297c;

        /* renamed from: d, reason: collision with root package name */
        public int f14298d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a0<T> f14299e;

        public a(a0<T> a0Var) {
            this.f14299e = a0Var;
            this.f14297c = a0Var.a();
            this.f14298d = a0Var.f14295c;
        }
    }

    public a0(Object[] objArr, int i10) {
        this.f14293a = objArr;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(defpackage.f.h("ring buffer filled size should not be negative but it is ", i10).toString());
        }
        if (i10 <= objArr.length) {
            this.f14294b = objArr.length;
            this.f14296d = i10;
        } else {
            StringBuilder n2 = a0.j.n("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
            n2.append(objArr.length);
            throw new IllegalArgumentException(n2.toString().toString());
        }
    }

    @Override // sb.b
    public final int a() {
        return this.f14296d;
    }

    @Override // sb.d, java.util.List
    public final T get(int i10) {
        int a10 = a();
        if (i10 < 0 || i10 >= a10) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", a10));
        }
        return (T) this.f14293a[(this.f14295c + i10) % this.f14294b];
    }

    public final void h(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(defpackage.f.h("n shouldn't be negative but it is ", i10).toString());
        }
        if (!(i10 <= this.f14296d)) {
            StringBuilder n2 = a0.j.n("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            n2.append(this.f14296d);
            throw new IllegalArgumentException(n2.toString().toString());
        }
        if (i10 > 0) {
            int i11 = this.f14295c;
            int i12 = this.f14294b;
            int i13 = (i11 + i10) % i12;
            if (i11 > i13) {
                j.m(this.f14293a, i11, i12);
                j.m(this.f14293a, 0, i13);
            } else {
                j.m(this.f14293a, i11, i13);
            }
            this.f14295c = i13;
            this.f14296d -= i10;
        }
    }

    @Override // sb.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sb.b, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // sb.b, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        ec.i.e(tArr, "array");
        int length = tArr.length;
        int i10 = this.f14296d;
        if (length < i10) {
            tArr = (T[]) Arrays.copyOf(tArr, i10);
            ec.i.d(tArr, "copyOf(...)");
        }
        int i11 = this.f14296d;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = this.f14295c; i13 < i11 && i14 < this.f14294b; i14++) {
            tArr[i13] = this.f14293a[i14];
            i13++;
        }
        while (i13 < i11) {
            tArr[i13] = this.f14293a[i12];
            i13++;
            i12++;
        }
        if (i11 < tArr.length) {
            tArr[i11] = null;
        }
        return tArr;
    }
}
