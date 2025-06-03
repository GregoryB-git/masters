package ma;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import ma.a0;

/* loaded from: classes.dex */
public final class m extends c<Double> implements RandomAccess, c1 {

    /* renamed from: b, reason: collision with root package name */
    public double[] f11053b;

    /* renamed from: c, reason: collision with root package name */
    public int f11054c;

    static {
        new m(new double[0], 0, false);
    }

    public m() {
        this(new double[10], 0, true);
    }

    public m(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f11053b = dArr;
        this.f11054c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f11054c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f11054c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        double[] dArr = this.f11053b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f11053b, i10, dArr2, i10 + 1, this.f11054c - i10);
            this.f11053b = dArr2;
        }
        this.f11053b[i10] = doubleValue;
        this.f11054c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ma.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = a0.f10909a;
        collection.getClass();
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i10 = mVar.f11054c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11054c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f11053b;
        if (i12 > dArr.length) {
            this.f11053b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(mVar.f11053b, 0, this.f11053b, this.f11054c, mVar.f11054c);
        this.f11054c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ma.a0.d
    public final a0.d c(int i10) {
        if (i10 >= this.f11054c) {
            return new m(Arrays.copyOf(this.f11053b, i10), this.f11054c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ma.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f11054c != mVar.f11054c) {
            return false;
        }
        double[] dArr = mVar.f11053b;
        for (int i10 = 0; i10 < this.f11054c; i10++) {
            if (Double.doubleToLongBits(this.f11053b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Double.valueOf(this.f11053b[i10]);
    }

    public final void h(double d10) {
        a();
        int i10 = this.f11054c;
        double[] dArr = this.f11053b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a0.j.d(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f11053b = dArr2;
        }
        double[] dArr3 = this.f11053b;
        int i11 = this.f11054c;
        this.f11054c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // ma.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11054c; i11++) {
            i10 = (i10 * 31) + a0.b(Double.doubleToLongBits(this.f11053b[i11]));
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f11054c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f11054c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f11054c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f11053b[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ma.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        double[] dArr = this.f11053b;
        double d10 = dArr[i10];
        if (i10 < this.f11054c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f11054c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f11053b;
        System.arraycopy(dArr, i11, dArr, i10, this.f11054c - i11);
        this.f11054c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        i(i10);
        double[] dArr = this.f11053b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11054c;
    }

    @Override // ma.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }
}
