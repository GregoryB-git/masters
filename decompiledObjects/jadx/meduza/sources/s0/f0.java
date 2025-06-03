package s0;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import s0.x;

/* loaded from: classes.dex */
public final class f0 extends c<Long> implements RandomAccess, x0 {

    /* renamed from: b, reason: collision with root package name */
    public long[] f13964b;

    /* renamed from: c, reason: collision with root package name */
    public int f13965c;

    static {
        new f0(new long[0], 0).f13948a = false;
    }

    public f0() {
        this(new long[10], 0);
    }

    public f0(long[] jArr, int i10) {
        this.f13964b = jArr;
        this.f13965c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f13965c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f13965c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        long[] jArr = this.f13964b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f13964b, i10, jArr2, i10 + 1, this.f13965c - i10);
            this.f13964b = jArr2;
        }
        this.f13964b[i10] = longValue;
        this.f13965c++;
        ((AbstractList) this).modCount++;
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = x.f14119a;
        collection.getClass();
        if (!(collection instanceof f0)) {
            return super.addAll(collection);
        }
        f0 f0Var = (f0) collection;
        int i10 = f0Var.f13965c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f13965c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f13964b;
        if (i12 > jArr.length) {
            this.f13964b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(f0Var.f13964b, 0, this.f13964b, this.f13965c, f0Var.f13965c);
        this.f13965c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // s0.x.c
    public final x.c c(int i10) {
        if (i10 >= this.f13965c) {
            return new f0(Arrays.copyOf(this.f13964b, i10), this.f13965c);
        }
        throw new IllegalArgumentException();
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return super.equals(obj);
        }
        f0 f0Var = (f0) obj;
        if (this.f13965c != f0Var.f13965c) {
            return false;
        }
        long[] jArr = f0Var.f13964b;
        for (int i10 = 0; i10 < this.f13965c; i10++) {
            if (this.f13964b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Long.valueOf(this.f13964b[i10]);
    }

    public final void h(long j10) {
        a();
        int i10 = this.f13965c;
        long[] jArr = this.f13964b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a0.j.d(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f13964b = jArr2;
        }
        long[] jArr3 = this.f13964b;
        int i11 = this.f13965c;
        this.f13965c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f13965c; i11++) {
            i10 = (i10 * 31) + x.b(this.f13964b[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f13965c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f13965c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        long[] jArr = this.f13964b;
        long j10 = jArr[i10];
        if (i10 < this.f13965c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f13965c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f13965c; i10++) {
            if (obj.equals(Long.valueOf(this.f13964b[i10]))) {
                long[] jArr = this.f13964b;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f13965c - i10) - 1);
                this.f13965c--;
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
        long[] jArr = this.f13964b;
        System.arraycopy(jArr, i11, jArr, i10, this.f13965c - i11);
        this.f13965c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        i(i10);
        long[] jArr = this.f13964b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13965c;
    }

    @Override // s0.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }
}
