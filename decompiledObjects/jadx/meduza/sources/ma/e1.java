package ma;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import ma.a0;

/* loaded from: classes.dex */
public final class e1<E> extends c<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final e1<Object> f10945d = new e1<>(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public E[] f10946b;

    /* renamed from: c, reason: collision with root package name */
    public int f10947c;

    public e1(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f10946b = eArr;
        this.f10947c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f10947c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f10947c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        E[] eArr = this.f10946b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f10946b, i10, eArr2, i10 + 1, this.f10947c - i10);
            this.f10946b = eArr2;
        }
        this.f10946b[i10] = e10;
        this.f10947c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ma.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        a();
        int i10 = this.f10947c;
        E[] eArr = this.f10946b;
        if (i10 == eArr.length) {
            this.f10946b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f10946b;
        int i11 = this.f10947c;
        this.f10947c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ma.a0.d
    public final a0.d c(int i10) {
        if (i10 >= this.f10947c) {
            return new e1(Arrays.copyOf(this.f10946b, i10), this.f10947c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        h(i10);
        return this.f10946b[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f10947c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f10947c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // ma.c, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        a();
        h(i10);
        E[] eArr = this.f10946b;
        E e10 = eArr[i10];
        if (i10 < this.f10947c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f10947c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        a();
        h(i10);
        E[] eArr = this.f10946b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10947c;
    }
}
