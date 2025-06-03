package ma;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import ma.a0;

/* loaded from: classes.dex */
public final class z extends c<Integer> implements a0.c, RandomAccess, c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final z f11143d = new z(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public int[] f11144b;

    /* renamed from: c, reason: collision with root package name */
    public int f11145c;

    public z() {
        this(new int[10], 0, true);
    }

    public z(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f11144b = iArr;
        this.f11145c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f11145c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f11145c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        int[] iArr = this.f11144b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f11144b, i10, iArr2, i10 + 1, this.f11145c - i10);
            this.f11144b = iArr2;
        }
        this.f11144b[i10] = intValue;
        this.f11145c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ma.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        Charset charset = a0.f10909a;
        collection.getClass();
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i10 = zVar.f11145c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11145c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f11144b;
        if (i12 > iArr.length) {
            this.f11144b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(zVar.f11144b, 0, this.f11144b, this.f11145c, zVar.f11145c);
        this.f11145c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ma.a0.d
    public final a0.d<Integer> c(int i10) {
        if (i10 >= this.f11145c) {
            return new z(Arrays.copyOf(this.f11144b, i10), this.f11145c, true);
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
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.f11145c != zVar.f11145c) {
            return false;
        }
        int[] iArr = zVar.f11144b;
        for (int i10 = 0; i10 < this.f11145c; i10++) {
            if (this.f11144b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Integer.valueOf(this.f11144b[i10]);
    }

    public final void h(int i10) {
        a();
        int i11 = this.f11145c;
        int[] iArr = this.f11144b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f11144b = iArr2;
        }
        int[] iArr3 = this.f11144b;
        int i12 = this.f11145c;
        this.f11145c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // ma.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11145c; i11++) {
            i10 = (i10 * 31) + this.f11144b[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f11145c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f11145c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f11145c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f11144b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ma.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        int[] iArr = this.f11144b;
        int i11 = iArr[i10];
        if (i10 < this.f11145c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f11145c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f11144b;
        System.arraycopy(iArr, i11, iArr, i10, this.f11145c - i11);
        this.f11145c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        i(i10);
        int[] iArr = this.f11144b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11145c;
    }

    @Override // ma.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
