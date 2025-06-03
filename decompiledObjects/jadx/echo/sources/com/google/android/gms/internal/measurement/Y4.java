package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Y4 extends AbstractC0958l3 implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final Y4 f10730r = new Y4(new Object[0], 0, false);

    /* renamed from: p, reason: collision with root package name */
    public Object[] f10731p;

    /* renamed from: q, reason: collision with root package name */
    public int f10732q;

    public Y4(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.f10731p = objArr;
        this.f10732q = i7;
    }

    public static Y4 g() {
        return f10730r;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        a();
        if (i7 < 0 || i7 > (i8 = this.f10732q)) {
            throw new IndexOutOfBoundsException(d(i7));
        }
        Object[] objArr = this.f10731p;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.f10731p, i7, objArr2, i7 + 1, this.f10732q - i7);
            this.f10731p = objArr2;
        }
        this.f10731p[i7] = obj;
        this.f10732q++;
        ((AbstractList) this).modCount++;
    }

    public final String d(int i7) {
        return "Index:" + i7 + ", Size:" + this.f10732q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0923h4
    public final /* synthetic */ InterfaceC0923h4 e(int i7) {
        if (i7 >= this.f10732q) {
            return new Y4(Arrays.copyOf(this.f10731p, i7), this.f10732q, true);
        }
        throw new IllegalArgumentException();
    }

    public final void f(int i7) {
        if (i7 < 0 || i7 >= this.f10732q) {
            throw new IndexOutOfBoundsException(d(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        f(i7);
        return this.f10731p[i7];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        f(i7);
        Object[] objArr = this.f10731p;
        Object obj = objArr[i7];
        if (i7 < this.f10732q - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f10732q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        f(i7);
        Object[] objArr = this.f10731p;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10732q;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0958l3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i7 = this.f10732q;
        Object[] objArr = this.f10731p;
        if (i7 == objArr.length) {
            this.f10731p = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f10731p;
        int i8 = this.f10732q;
        this.f10732q = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
