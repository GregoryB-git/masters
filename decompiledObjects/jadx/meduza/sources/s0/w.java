package s0;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import s0.x;

/* loaded from: classes.dex */
public final class w extends c<Integer> implements RandomAccess, x0 {

    /* renamed from: b, reason: collision with root package name */
    public int[] f14117b;

    /* renamed from: c, reason: collision with root package name */
    public int f14118c;

    static {
        new w(new int[0], 0).f13948a = false;
    }

    public w() {
        this(new int[10], 0);
    }

    public w(int[] iArr, int i10) {
        this.f14117b = iArr;
        this.f14118c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f14118c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f14118c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        int[] iArr = this.f14117b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f14117b, i10, iArr2, i10 + 1, this.f14118c - i10);
            this.f14117b = iArr2;
        }
        this.f14117b[i10] = intValue;
        this.f14118c++;
        ((AbstractList) this).modCount++;
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        Charset charset = x.f14119a;
        collection.getClass();
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i10 = wVar.f14118c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14118c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f14117b;
        if (i12 > iArr.length) {
            this.f14117b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(wVar.f14117b, 0, this.f14117b, this.f14118c, wVar.f14118c);
        this.f14118c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // s0.x.c
    public final x.c c(int i10) {
        if (i10 >= this.f14118c) {
            return new w(Arrays.copyOf(this.f14117b, i10), this.f14118c);
        }
        throw new IllegalArgumentException();
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f14118c != wVar.f14118c) {
            return false;
        }
        int[] iArr = wVar.f14117b;
        for (int i10 = 0; i10 < this.f14118c; i10++) {
            if (this.f14117b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Integer.valueOf(this.f14117b[i10]);
    }

    public final void h(int i10) {
        a();
        int i11 = this.f14118c;
        int[] iArr = this.f14117b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f14117b = iArr2;
        }
        int[] iArr3 = this.f14117b;
        int i12 = this.f14118c;
        this.f14118c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14118c; i11++) {
            i10 = (i10 * 31) + this.f14117b[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f14118c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f14118c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        int[] iArr = this.f14117b;
        int i11 = iArr[i10];
        if (i10 < this.f14118c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f14118c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f14118c; i10++) {
            if (obj.equals(Integer.valueOf(this.f14117b[i10]))) {
                int[] iArr = this.f14117b;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f14118c - i10) - 1);
                this.f14118c--;
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
        int[] iArr = this.f14117b;
        System.arraycopy(iArr, i11, iArr, i10, this.f14118c - i11);
        this.f14118c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        i(i10);
        int[] iArr = this.f14117b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14118c;
    }

    @Override // s0.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
