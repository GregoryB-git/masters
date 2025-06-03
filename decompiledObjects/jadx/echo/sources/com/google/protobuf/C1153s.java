package com.google.protobuf;

import com.google.protobuf.AbstractC1154t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153s extends AbstractC1138c implements AbstractC1154t.d, RandomAccess, U {

    /* renamed from: r, reason: collision with root package name */
    public static final C1153s f12247r;

    /* renamed from: p, reason: collision with root package name */
    public int[] f12248p;

    /* renamed from: q, reason: collision with root package name */
    public int f12249q;

    static {
        C1153s c1153s = new C1153s(new int[0], 0);
        f12247r = c1153s;
        c1153s.j();
    }

    public C1153s(int[] iArr, int i7) {
        this.f12248p = iArr;
        this.f12249q = i7;
    }

    public static C1153s i() {
        return f12247r;
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.List
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i7) {
        a();
        k(i7);
        int[] iArr = this.f12248p;
        int i8 = iArr[i7];
        if (i7 < this.f12249q - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f12249q--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // com.google.protobuf.AbstractC1154t.d
    public int F(int i7) {
        k(i7);
        return this.f12248p[i7];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public Integer set(int i7, Integer num) {
        return Integer.valueOf(S(i7, num.intValue()));
    }

    public int S(int i7, int i8) {
        a();
        k(i7);
        int[] iArr = this.f12248p;
        int i9 = iArr[i7];
        iArr[i7] = i8;
        return i9;
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        AbstractC1154t.a(collection);
        if (!(collection instanceof C1153s)) {
            return super.addAll(collection);
        }
        C1153s c1153s = (C1153s) collection;
        int i7 = c1153s.f12249q;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f12249q;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f12248p;
        if (i9 > iArr.length) {
            this.f12248p = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(c1153s.f12248p, 0, this.f12248p, this.f12249q, c1153s.f12249q);
        this.f12249q = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i7, Integer num) {
        g(i7, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153s)) {
            return super.equals(obj);
        }
        C1153s c1153s = (C1153s) obj;
        if (this.f12249q != c1153s.f12249q) {
            return false;
        }
        int[] iArr = c1153s.f12248p;
        for (int i7 = 0; i7 < this.f12249q; i7++) {
            if (this.f12248p[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        z(num.intValue());
        return true;
    }

    public final void g(int i7, int i8) {
        int i9;
        a();
        if (i7 < 0 || i7 > (i9 = this.f12249q)) {
            throw new IndexOutOfBoundsException(s(i7));
        }
        int[] iArr = this.f12248p;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i9 - i7);
        } else {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f12248p, i7, iArr2, i7 + 1, this.f12249q - i7);
            this.f12248p = iArr2;
        }
        this.f12248p[i7] = i8;
        this.f12249q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1154t.e
    public AbstractC1154t.d h(int i7) {
        if (i7 >= this.f12249q) {
            return new C1153s(Arrays.copyOf(this.f12248p, i7), this.f12249q);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f12249q; i8++) {
            i7 = (i7 * 31) + this.f12248p[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f12248p[i7] == intValue) {
                return i7;
            }
        }
        return -1;
    }

    public final void k(int i7) {
        if (i7 < 0 || i7 >= this.f12249q) {
            throw new IndexOutOfBoundsException(s(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer get(int i7) {
        return Integer.valueOf(F(i7));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i7, int i8) {
        a();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f12248p;
        System.arraycopy(iArr, i8, iArr, i7, this.f12249q - i8);
        this.f12249q -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    public final String s(int i7) {
        return "Index:" + i7 + ", Size:" + this.f12249q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12249q;
    }

    @Override // com.google.protobuf.AbstractC1154t.d
    public void z(int i7) {
        a();
        int i8 = this.f12249q;
        int[] iArr = this.f12248p;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f12248p = iArr2;
        }
        int[] iArr3 = this.f12248p;
        int i9 = this.f12249q;
        this.f12249q = i9 + 1;
        iArr3[i9] = i7;
    }
}
