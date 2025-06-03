package ma;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import ma.a0;

/* loaded from: classes.dex */
public final class j0 extends c<Long> implements RandomAccess, c1 {

    /* renamed from: b, reason: collision with root package name */
    public long[] f11013b;

    /* renamed from: c, reason: collision with root package name */
    public int f11014c;

    static {
        new j0(new long[0], 0, false);
    }

    public j0() {
        this(new long[10], 0, true);
    }

    public j0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f11013b = jArr;
        this.f11014c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f11014c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f11014c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        long[] jArr = this.f11013b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f11013b, i10, jArr2, i10 + 1, this.f11014c - i10);
            this.f11013b = jArr2;
        }
        this.f11013b[i10] = longValue;
        this.f11014c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ma.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = a0.f10909a;
        collection.getClass();
        if (!(collection instanceof j0)) {
            return super.addAll(collection);
        }
        j0 j0Var = (j0) collection;
        int i10 = j0Var.f11014c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11014c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f11013b;
        if (i12 > jArr.length) {
            this.f11013b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(j0Var.f11013b, 0, this.f11013b, this.f11014c, j0Var.f11014c);
        this.f11014c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ma.a0.d
    public final a0.d c(int i10) {
        if (i10 >= this.f11014c) {
            return new j0(Arrays.copyOf(this.f11013b, i10), this.f11014c, true);
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
        if (!(obj instanceof j0)) {
            return super.equals(obj);
        }
        j0 j0Var = (j0) obj;
        if (this.f11014c != j0Var.f11014c) {
            return false;
        }
        long[] jArr = j0Var.f11013b;
        for (int i10 = 0; i10 < this.f11014c; i10++) {
            if (this.f11013b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Long.valueOf(this.f11013b[i10]);
    }

    public final void h(long j10) {
        a();
        int i10 = this.f11014c;
        long[] jArr = this.f11013b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a0.j.d(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f11013b = jArr2;
        }
        long[] jArr3 = this.f11013b;
        int i11 = this.f11014c;
        this.f11014c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // ma.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11014c; i11++) {
            i10 = (i10 * 31) + a0.b(this.f11013b[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f11014c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f11014c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f11014c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f11013b[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ma.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        long[] jArr = this.f11013b;
        long j10 = jArr[i10];
        if (i10 < this.f11014c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f11014c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f11013b;
        System.arraycopy(jArr, i11, jArr, i10, this.f11014c - i11);
        this.f11014c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        i(i10);
        long[] jArr = this.f11013b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11014c;
    }

    @Override // ma.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }
}
