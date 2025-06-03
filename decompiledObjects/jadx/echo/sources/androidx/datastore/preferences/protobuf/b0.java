package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b0 extends AbstractC0756c implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final b0 f8940r;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f8941p;

    /* renamed from: q, reason: collision with root package name */
    public int f8942q;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        f8940r = b0Var;
        b0Var.j();
    }

    public b0(Object[] objArr, int i7) {
        this.f8941p = objArr;
        this.f8942q = i7;
    }

    public static Object[] d(int i7) {
        return new Object[i7];
    }

    public static b0 f() {
        return f8940r;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        int i8;
        a();
        if (i7 < 0 || i7 > (i8 = this.f8942q)) {
            throw new IndexOutOfBoundsException(i(i7));
        }
        Object[] objArr = this.f8941p;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] d7 = d(((i8 * 3) / 2) + 1);
            System.arraycopy(this.f8941p, 0, d7, 0, i7);
            System.arraycopy(this.f8941p, i7, d7, i7 + 1, this.f8942q - i7);
            this.f8941p = d7;
        }
        this.f8941p[i7] = obj;
        this.f8942q++;
        ((AbstractList) this).modCount++;
    }

    public final void g(int i7) {
        if (i7 < 0 || i7 >= this.f8942q) {
            throw new IndexOutOfBoundsException(i(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        g(i7);
        return this.f8941p[i7];
    }

    public final String i(int i7) {
        return "Index:" + i7 + ", Size:" + this.f8942q;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0777y.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b0 h(int i7) {
        if (i7 >= this.f8942q) {
            return new b0(Arrays.copyOf(this.f8941p, i7), this.f8942q);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i7) {
        a();
        g(i7);
        Object[] objArr = this.f8941p;
        Object obj = objArr[i7];
        if (i7 < this.f8942q - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f8942q--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        a();
        g(i7);
        Object[] objArr = this.f8941p;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8942q;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0756c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i7 = this.f8942q;
        Object[] objArr = this.f8941p;
        if (i7 == objArr.length) {
            this.f8941p = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8941p;
        int i8 = this.f8942q;
        this.f8942q = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
