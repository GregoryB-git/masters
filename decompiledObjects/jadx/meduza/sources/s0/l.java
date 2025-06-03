package s0;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import s0.x;

/* loaded from: classes.dex */
public final class l extends c<Double> implements RandomAccess, x0 {

    /* renamed from: b, reason: collision with root package name */
    public double[] f14036b;

    /* renamed from: c, reason: collision with root package name */
    public int f14037c;

    static {
        new l(new double[0], 0).f13948a = false;
    }

    public l() {
        this(new double[10], 0);
    }

    public l(double[] dArr, int i10) {
        this.f14036b = dArr;
        this.f14037c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f14037c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f14037c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        double[] dArr = this.f14036b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f14036b, i10, dArr2, i10 + 1, this.f14037c - i10);
            this.f14036b = dArr2;
        }
        this.f14036b[i10] = doubleValue;
        this.f14037c++;
        ((AbstractList) this).modCount++;
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = x.f14119a;
        collection.getClass();
        if (!(collection instanceof l)) {
            return super.addAll(collection);
        }
        l lVar = (l) collection;
        int i10 = lVar.f14037c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14037c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f14036b;
        if (i12 > dArr.length) {
            this.f14036b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(lVar.f14036b, 0, this.f14036b, this.f14037c, lVar.f14037c);
        this.f14037c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // s0.x.c
    public final x.c c(int i10) {
        if (i10 >= this.f14037c) {
            return new l(Arrays.copyOf(this.f14036b, i10), this.f14037c);
        }
        throw new IllegalArgumentException();
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return super.equals(obj);
        }
        l lVar = (l) obj;
        if (this.f14037c != lVar.f14037c) {
            return false;
        }
        double[] dArr = lVar.f14036b;
        for (int i10 = 0; i10 < this.f14037c; i10++) {
            if (Double.doubleToLongBits(this.f14036b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Double.valueOf(this.f14036b[i10]);
    }

    public final void h(double d10) {
        a();
        int i10 = this.f14037c;
        double[] dArr = this.f14036b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a0.j.d(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f14036b = dArr2;
        }
        double[] dArr3 = this.f14036b;
        int i11 = this.f14037c;
        this.f14037c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14037c; i11++) {
            i10 = (i10 * 31) + x.b(Double.doubleToLongBits(this.f14036b[i11]));
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f14037c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f14037c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        double[] dArr = this.f14036b;
        double d10 = dArr[i10];
        if (i10 < this.f14037c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f14037c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f14037c; i10++) {
            if (obj.equals(Double.valueOf(this.f14036b[i10]))) {
                double[] dArr = this.f14036b;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f14037c - i10) - 1);
                this.f14037c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f14036b;
        System.arraycopy(dArr, i11, dArr, i10, this.f14037c - i11);
        this.f14037c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        i(i10);
        double[] dArr = this.f14036b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14037c;
    }

    @Override // s0.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }
}
