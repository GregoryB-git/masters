package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878c4 extends AbstractC0958l3 implements InterfaceC0905f4, S4, RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final C0878c4 f10854r = new C0878c4(new int[0], 0, false);

    /* renamed from: p, reason: collision with root package name */
    public int[] f10855p;

    /* renamed from: q, reason: collision with root package name */
    public int f10856q;

    public C0878c4(int[] iArr, int i7, boolean z7) {
        super(z7);
        this.f10855p = iArr;
        this.f10856q = i7;
    }

    public static C0878c4 f() {
        return f10854r;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i7 < 0 || i7 > (i8 = this.f10856q)) {
            throw new IndexOutOfBoundsException(i(i7));
        }
        int[] iArr = this.f10855p;
        if (i8 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i8 - i7);
        } else {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f10855p, i7, iArr2, i7 + 1, this.f10856q - i7);
            this.f10855p = iArr2;
        }
        this.f10855p[i7] = intValue;
        this.f10856q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        AbstractC0860a4.e(collection);
        if (!(collection instanceof C0878c4)) {
            return super.addAll(collection);
        }
        C0878c4 c0878c4 = (C0878c4) collection;
        int i7 = c0878c4.f10856q;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f10856q;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f10855p;
        if (i9 > iArr.length) {
            this.f10855p = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(c0878c4.f10855p, 0, this.f10855p, this.f10856q, c0878c4.f10856q);
        this.f10856q = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i7) {
        k(i7);
        return this.f10855p[i7];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0878c4)) {
            return super.equals(obj);
        }
        C0878c4 c0878c4 = (C0878c4) obj;
        if (this.f10856q != c0878c4.f10856q) {
            return false;
        }
        int[] iArr = c0878c4.f10855p;
        for (int i7 = 0; i7 < this.f10856q; i7++) {
            if (this.f10855p[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i7) {
        a();
        int i8 = this.f10856q;
        int[] iArr = this.f10855p;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f10855p = iArr2;
        }
        int[] iArr3 = this.f10855p;
        int i9 = this.f10856q;
        this.f10856q = i9 + 1;
        iArr3[i9] = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Integer.valueOf(d(i7));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f10856q; i8++) {
            i7 = (i7 * 31) + this.f10855p[i8];
        }
        return i7;
    }

    public final String i(int i7) {
        return "Index:" + i7 + ", Size:" + this.f10856q;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f10855p[i7] == intValue) {
                return i7;
            }
        }
        return -1;
    }

    public final void k(int i7) {
        if (i7 < 0 || i7 >= this.f10856q) {
            throw new IndexOutOfBoundsException(i(i7));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0923h4
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0905f4 e(int i7) {
        if (i7 >= this.f10856q) {
            return new C0878c4(Arrays.copyOf(this.f10855p, i7), this.f10856q, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        a();
        k(i7);
        int[] iArr = this.f10855p;
        int i8 = iArr[i7];
        if (i7 < this.f10856q - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f10856q--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        a();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f10855p;
        System.arraycopy(iArr, i8, iArr, i7, this.f10856q - i8);
        this.f10856q -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        k(i7);
        int[] iArr = this.f10855p;
        int i8 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10856q;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
