package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class X extends AbstractC1138c implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final X f12009r;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f12010p;

    /* renamed from: q, reason: collision with root package name */
    public int f12011q;

    static {
        X x7 = new X(new Object[0], 0);
        f12009r = x7;
        x7.j();
    }

    public X(Object[] objArr, int i7) {
        this.f12010p = objArr;
        this.f12011q = i7;
    }

    public static Object[] d(int i7) {
        return new Object[i7];
    }

    public static X f() {
        return f12009r;
    }

    private void g(int i7) {
        if (i7 < 0 || i7 >= this.f12011q) {
            throw new IndexOutOfBoundsException(i(i7));
        }
    }

    private String i(int i7) {
        return "Index:" + i7 + ", Size:" + this.f12011q;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        int i8;
        a();
        if (i7 < 0 || i7 > (i8 = this.f12011q)) {
            throw new IndexOutOfBoundsException(i(i7));
        }
        Object[] objArr = this.f12010p;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] d7 = d(((i8 * 3) / 2) + 1);
            System.arraycopy(this.f12010p, 0, d7, 0, i7);
            System.arraycopy(this.f12010p, i7, d7, i7 + 1, this.f12011q - i7);
            this.f12010p = d7;
        }
        this.f12010p[i7] = obj;
        this.f12011q++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        g(i7);
        return this.f12010p[i7];
    }

    @Override // com.google.protobuf.AbstractC1154t.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public X h(int i7) {
        if (i7 >= this.f12011q) {
            return new X(Arrays.copyOf(this.f12010p, i7), this.f12011q);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.List
    public Object remove(int i7) {
        a();
        g(i7);
        Object[] objArr = this.f12010p;
        Object obj = objArr[i7];
        if (i7 < this.f12011q - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f12011q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        a();
        g(i7);
        Object[] objArr = this.f12010p;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12011q;
    }

    @Override // com.google.protobuf.AbstractC1138c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i7 = this.f12011q;
        Object[] objArr = this.f12010p;
        if (i7 == objArr.length) {
            this.f12010p = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12010p;
        int i8 = this.f12011q;
        this.f12011q = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
