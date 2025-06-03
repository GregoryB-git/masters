package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.w4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057w4 extends AbstractC0958l3 implements InterfaceC0932i4, S4, RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final C1057w4 f11205r = new C1057w4(new long[0], 0, false);

    /* renamed from: p, reason: collision with root package name */
    public long[] f11206p;

    /* renamed from: q, reason: collision with root package name */
    public int f11207q;

    public C1057w4(long[] jArr, int i7, boolean z7) {
        super(z7);
        this.f11206p = jArr;
        this.f11207q = i7;
    }

    public static C1057w4 f() {
        return f11205r;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        long longValue = ((Long) obj).longValue();
        a();
        if (i7 < 0 || i7 > (i8 = this.f11207q)) {
            throw new IndexOutOfBoundsException(g(i7));
        }
        long[] jArr = this.f11206p;
        if (i8 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i7 + 1, i8 - i7);
        } else {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            System.arraycopy(this.f11206p, i7, jArr2, i7 + 1, this.f11207q - i7);
            this.f11206p = jArr2;
        }
        this.f11206p[i7] = longValue;
        this.f11207q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        AbstractC0860a4.e(collection);
        if (!(collection instanceof C1057w4)) {
            return super.addAll(collection);
        }
        C1057w4 c1057w4 = (C1057w4) collection;
        int i7 = c1057w4.f11207q;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f11207q;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        long[] jArr = this.f11206p;
        if (i9 > jArr.length) {
            this.f11206p = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(c1057w4.f11206p, 0, this.f11206p, this.f11207q, c1057w4.f11207q);
        this.f11207q = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j7) {
        a();
        int i7 = this.f11207q;
        long[] jArr = this.f11206p;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[((i7 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.f11206p = jArr2;
        }
        long[] jArr3 = this.f11206p;
        int i8 = this.f11207q;
        this.f11207q = i8 + 1;
        jArr3[i8] = j7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1057w4)) {
            return super.equals(obj);
        }
        C1057w4 c1057w4 = (C1057w4) obj;
        if (this.f11207q != c1057w4.f11207q) {
            return false;
        }
        long[] jArr = c1057w4.f11206p;
        for (int i7 = 0; i7 < this.f11207q; i7++) {
            if (this.f11206p[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i7) {
        return "Index:" + i7 + ", Size:" + this.f11207q;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Long.valueOf(l(i7));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f11207q; i8++) {
            i7 = (i7 * 31) + AbstractC0860a4.b(this.f11206p[i8]);
        }
        return i7;
    }

    public final void i(int i7) {
        if (i7 < 0 || i7 >= this.f11207q) {
            throw new IndexOutOfBoundsException(g(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f11206p[i7] == longValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0932i4
    public final long l(int i7) {
        i(i7);
        return this.f11206p[i7];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0923h4
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0932i4 e(int i7) {
        if (i7 >= this.f11207q) {
            return new C1057w4(Arrays.copyOf(this.f11206p, i7), this.f11207q, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        a();
        i(i7);
        long[] jArr = this.f11206p;
        long j7 = jArr[i7];
        if (i7 < this.f11207q - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.f11207q--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        a();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f11206p;
        System.arraycopy(jArr, i8, jArr, i7, this.f11207q - i8);
        this.f11207q -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        i(i7);
        long[] jArr = this.f11206p;
        long j7 = jArr[i7];
        jArr[i7] = longValue;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11207q;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
