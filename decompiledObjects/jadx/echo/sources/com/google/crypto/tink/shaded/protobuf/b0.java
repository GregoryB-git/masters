package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b0 extends AbstractC1088c implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final b0 f11318r;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f11319p;

    /* renamed from: q, reason: collision with root package name */
    public int f11320q;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        f11318r = b0Var;
        b0Var.j();
    }

    public b0(Object[] objArr, int i7) {
        this.f11319p = objArr;
        this.f11320q = i7;
    }

    public static Object[] d(int i7) {
        return new Object[i7];
    }

    public static b0 f() {
        return f11318r;
    }

    private void g(int i7) {
        if (i7 < 0 || i7 >= this.f11320q) {
            throw new IndexOutOfBoundsException(i(i7));
        }
    }

    private String i(int i7) {
        return "Index:" + i7 + ", Size:" + this.f11320q;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        int i8;
        a();
        if (i7 < 0 || i7 > (i8 = this.f11320q)) {
            throw new IndexOutOfBoundsException(i(i7));
        }
        Object[] objArr = this.f11319p;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] d7 = d(((i8 * 3) / 2) + 1);
            System.arraycopy(this.f11319p, 0, d7, 0, i7);
            System.arraycopy(this.f11319p, i7, d7, i7 + 1, this.f11320q - i7);
            this.f11319p = d7;
        }
        this.f11319p[i7] = obj;
        this.f11320q++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        g(i7);
        return this.f11319p[i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1110z.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b0 h(int i7) {
        if (i7 >= this.f11320q) {
            return new b0(Arrays.copyOf(this.f11319p, i7), this.f11320q);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractList, java.util.List
    public Object remove(int i7) {
        a();
        g(i7);
        Object[] objArr = this.f11319p;
        Object obj = objArr[i7];
        if (i7 < this.f11320q - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f11320q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        a();
        g(i7);
        Object[] objArr = this.f11319p;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11320q;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1088c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i7 = this.f11320q;
        Object[] objArr = this.f11319p;
        if (i7 == objArr.length) {
            this.f11319p = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f11319p;
        int i8 = this.f11320q;
        this.f11320q = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
