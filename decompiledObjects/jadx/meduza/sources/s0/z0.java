package s0;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import s0.x;

/* loaded from: classes.dex */
public final class z0<E> extends c<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final z0<Object> f14135d;

    /* renamed from: b, reason: collision with root package name */
    public E[] f14136b;

    /* renamed from: c, reason: collision with root package name */
    public int f14137c;

    static {
        z0<Object> z0Var = new z0<>(new Object[0], 0);
        f14135d = z0Var;
        z0Var.f13948a = false;
    }

    public z0(E[] eArr, int i10) {
        this.f14136b = eArr;
        this.f14137c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f14137c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f14137c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        E[] eArr = this.f14136b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f14136b, i10, eArr2, i10 + 1, this.f14137c - i10);
            this.f14136b = eArr2;
        }
        this.f14136b[i10] = e10;
        this.f14137c++;
        ((AbstractList) this).modCount++;
    }

    @Override // s0.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        a();
        int i10 = this.f14137c;
        E[] eArr = this.f14136b;
        if (i10 == eArr.length) {
            this.f14136b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f14136b;
        int i11 = this.f14137c;
        this.f14137c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // s0.x.c
    public final x.c c(int i10) {
        if (i10 >= this.f14137c) {
            return new z0(Arrays.copyOf(this.f14136b, i10), this.f14137c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        h(i10);
        return this.f14136b[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f14137c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f14137c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        a();
        h(i10);
        E[] eArr = this.f14136b;
        E e10 = eArr[i10];
        if (i10 < this.f14137c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f14137c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        a();
        h(i10);
        E[] eArr = this.f14136b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14137c;
    }
}
