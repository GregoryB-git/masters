package sb;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import sb.d;

/* loaded from: classes.dex */
public final class i<E> extends f<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f14319d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f14320a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f14321b = f14319d;

    /* renamed from: c, reason: collision with root package name */
    public int f14322c;

    @Override // sb.f
    public final int a() {
        return this.f14322c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11 = this.f14322c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
        }
        if (i10 == i11) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            p();
            k(this.f14322c + 1);
            int i12 = this.f14320a;
            if (i12 == 0) {
                Object[] objArr = this.f14321b;
                ec.i.e(objArr, "<this>");
                i12 = objArr.length;
            }
            int i13 = i12 - 1;
            this.f14320a = i13;
            this.f14321b[i13] = e10;
            this.f14322c++;
            return;
        }
        p();
        k(this.f14322c + 1);
        int o10 = o(this.f14320a + i10);
        int i14 = this.f14322c;
        if (i10 < ((i14 + 1) >> 1)) {
            if (o10 == 0) {
                Object[] objArr2 = this.f14321b;
                ec.i.e(objArr2, "<this>");
                o10 = objArr2.length;
            }
            int i15 = o10 - 1;
            int i16 = this.f14320a;
            if (i16 == 0) {
                Object[] objArr3 = this.f14321b;
                ec.i.e(objArr3, "<this>");
                i16 = objArr3.length;
            }
            int i17 = i16 - 1;
            int i18 = this.f14320a;
            Object[] objArr4 = this.f14321b;
            if (i15 >= i18) {
                objArr4[i17] = objArr4[i18];
                j.l(objArr4, i18, objArr4, i18 + 1, i15 + 1);
            } else {
                j.l(objArr4, i18 - 1, objArr4, i18, objArr4.length);
                Object[] objArr5 = this.f14321b;
                objArr5[objArr5.length - 1] = objArr5[0];
                j.l(objArr5, 0, objArr5, 1, i15 + 1);
            }
            this.f14321b[i15] = e10;
            this.f14320a = i17;
        } else {
            int o11 = o(i14 + this.f14320a);
            Object[] objArr6 = this.f14321b;
            if (o10 < o11) {
                j.l(objArr6, o10 + 1, objArr6, o10, o11);
            } else {
                j.l(objArr6, 1, objArr6, 0, o11);
                Object[] objArr7 = this.f14321b;
                objArr7[0] = objArr7[objArr7.length - 1];
                j.l(objArr7, o10 + 1, objArr7, o10, objArr7.length - 1);
            }
            this.f14321b[o10] = e10;
        }
        this.f14322c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        ec.i.e(collection, "elements");
        int i11 = this.f14322c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == this.f14322c) {
            return addAll(collection);
        }
        p();
        k(collection.size() + this.f14322c);
        int o10 = o(this.f14322c + this.f14320a);
        int o11 = o(this.f14320a + i10);
        int size = collection.size();
        if (i10 < ((this.f14322c + 1) >> 1)) {
            int i12 = this.f14320a;
            int i13 = i12 - size;
            if (o11 < i12) {
                Object[] objArr = this.f14321b;
                j.l(objArr, i13, objArr, i12, objArr.length);
                Object[] objArr2 = this.f14321b;
                int length = objArr2.length - size;
                if (size >= o11) {
                    j.l(objArr2, length, objArr2, 0, o11);
                } else {
                    j.l(objArr2, length, objArr2, 0, size);
                    Object[] objArr3 = this.f14321b;
                    j.l(objArr3, 0, objArr3, size, o11);
                }
            } else if (i13 >= 0) {
                Object[] objArr4 = this.f14321b;
                j.l(objArr4, i13, objArr4, i12, o11);
            } else {
                Object[] objArr5 = this.f14321b;
                i13 += objArr5.length;
                int i14 = o11 - i12;
                int length2 = objArr5.length - i13;
                if (length2 >= i14) {
                    j.l(objArr5, i13, objArr5, i12, o11);
                } else {
                    j.l(objArr5, i13, objArr5, i12, i12 + length2);
                    Object[] objArr6 = this.f14321b;
                    j.l(objArr6, 0, objArr6, this.f14320a + length2, o11);
                }
            }
            this.f14320a = i13;
            i(m(o11 - size), collection);
        } else {
            int i15 = o11 + size;
            if (o11 < o10) {
                int i16 = size + o10;
                Object[] objArr7 = this.f14321b;
                if (i16 > objArr7.length) {
                    if (i15 >= objArr7.length) {
                        i15 -= objArr7.length;
                    } else {
                        int length3 = o10 - (i16 - objArr7.length);
                        j.l(objArr7, 0, objArr7, length3, o10);
                        Object[] objArr8 = this.f14321b;
                        j.l(objArr8, i15, objArr8, o11, length3);
                    }
                }
                j.l(objArr7, i15, objArr7, o11, o10);
            } else {
                Object[] objArr9 = this.f14321b;
                j.l(objArr9, size, objArr9, 0, o10);
                Object[] objArr10 = this.f14321b;
                if (i15 >= objArr10.length) {
                    j.l(objArr10, i15 - objArr10.length, objArr10, o11, objArr10.length);
                } else {
                    j.l(objArr10, 0, objArr10, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f14321b;
                    j.l(objArr11, i15, objArr11, o11, objArr11.length - size);
                }
            }
            i(o11, collection);
        }
        return true;
    }

    public final void addLast(E e10) {
        p();
        k(a() + 1);
        this.f14321b[o(a() + this.f14320a)] = e10;
        this.f14322c = a() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            n(this.f14320a, o(a() + this.f14320a));
        }
        this.f14320a = 0;
        this.f14322c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int a10 = a();
        if (i10 < 0 || i10 >= a10) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", a10));
        }
        return (E) this.f14321b[o(this.f14320a + i10)];
    }

    @Override // sb.f
    public final E h(int i10) {
        int i11 = this.f14322c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
        }
        if (i10 == va.a.d(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            p();
            int o10 = o(va.a.d(this) + this.f14320a);
            Object[] objArr = this.f14321b;
            E e10 = (E) objArr[o10];
            objArr[o10] = null;
            this.f14322c--;
            return e10;
        }
        if (i10 == 0) {
            return removeFirst();
        }
        p();
        int o11 = o(this.f14320a + i10);
        Object[] objArr2 = this.f14321b;
        E e11 = (E) objArr2[o11];
        if (i10 < (this.f14322c >> 1)) {
            int i12 = this.f14320a;
            if (o11 >= i12) {
                j.l(objArr2, i12 + 1, objArr2, i12, o11);
            } else {
                j.l(objArr2, 1, objArr2, 0, o11);
                Object[] objArr3 = this.f14321b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i13 = this.f14320a;
                j.l(objArr3, i13 + 1, objArr3, i13, objArr3.length - 1);
            }
            Object[] objArr4 = this.f14321b;
            int i14 = this.f14320a;
            objArr4[i14] = null;
            this.f14320a = l(i14);
        } else {
            int o12 = o(va.a.d(this) + this.f14320a);
            Object[] objArr5 = this.f14321b;
            int i15 = o11 + 1;
            if (o11 <= o12) {
                j.l(objArr5, o11, objArr5, i15, o12 + 1);
            } else {
                j.l(objArr5, o11, objArr5, i15, objArr5.length);
                Object[] objArr6 = this.f14321b;
                objArr6[objArr6.length - 1] = objArr6[0];
                j.l(objArr6, 0, objArr6, 1, o12 + 1);
            }
            this.f14321b[o12] = null;
        }
        this.f14322c--;
        return e11;
    }

    public final void i(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f14321b.length;
        while (i10 < length && it.hasNext()) {
            this.f14321b[i10] = it.next();
            i10++;
        }
        int i11 = this.f14320a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f14321b[i12] = it.next();
        }
        this.f14322c = collection.size() + a();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int o10 = o(a() + this.f14320a);
        int i10 = this.f14320a;
        if (i10 < o10) {
            while (i10 < o10) {
                if (!ec.i.a(obj, this.f14321b[i10])) {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 < o10) {
            return -1;
        }
        int length = this.f14321b.length;
        while (true) {
            if (i10 >= length) {
                for (int i11 = 0; i11 < o10; i11++) {
                    if (ec.i.a(obj, this.f14321b[i11])) {
                        i10 = i11 + this.f14321b.length;
                    }
                }
                return -1;
            }
            if (ec.i.a(obj, this.f14321b[i10])) {
                break;
            }
            i10++;
        }
        return i10 - this.f14320a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f14321b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f14319d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f14321b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        j.l(objArr, 0, objArr2, this.f14320a, objArr.length);
        Object[] objArr3 = this.f14321b;
        int length2 = objArr3.length;
        int i12 = this.f14320a;
        j.l(objArr3, length2 - i12, objArr2, 0, i12);
        this.f14320a = 0;
        this.f14321b = objArr2;
    }

    public final int l(int i10) {
        ec.i.e(this.f14321b, "<this>");
        if (i10 == r0.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int o10 = o(this.f14322c + this.f14320a);
        int i10 = this.f14320a;
        if (i10 < o10) {
            length = o10 - 1;
            if (i10 <= length) {
                while (!ec.i.a(obj, this.f14321b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                return length - this.f14320a;
            }
            return -1;
        }
        if (i10 > o10) {
            int i11 = o10 - 1;
            while (true) {
                if (-1 >= i11) {
                    Object[] objArr = this.f14321b;
                    ec.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f14320a;
                    if (i12 <= length) {
                        while (!ec.i.a(obj, this.f14321b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                    }
                } else {
                    if (ec.i.a(obj, this.f14321b[i11])) {
                        length = i11 + this.f14321b.length;
                        break;
                    }
                    i11--;
                }
            }
            return length - this.f14320a;
        }
        return -1;
    }

    public final int m(int i10) {
        return i10 < 0 ? i10 + this.f14321b.length : i10;
    }

    public final void n(int i10, int i11) {
        Object[] objArr = this.f14321b;
        if (i10 < i11) {
            j.m(objArr, i10, i11);
        } else {
            j.m(objArr, i10, objArr.length);
            j.m(this.f14321b, 0, i11);
        }
    }

    public final int o(int i10) {
        Object[] objArr = this.f14321b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        h(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i10;
        ec.i.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f14321b.length == 0) == false) {
                int o10 = o(this.f14322c + this.f14320a);
                int i11 = this.f14320a;
                if (i11 < o10) {
                    i10 = i11;
                    while (i11 < o10) {
                        Object obj = this.f14321b[i11];
                        if (!collection.contains(obj)) {
                            this.f14321b[i10] = obj;
                            i10++;
                        } else {
                            z10 = true;
                        }
                        i11++;
                    }
                    j.m(this.f14321b, i10, o10);
                } else {
                    int length = this.f14321b.length;
                    boolean z11 = false;
                    int i12 = i11;
                    while (i11 < length) {
                        Object[] objArr = this.f14321b;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (!collection.contains(obj2)) {
                            this.f14321b[i12] = obj2;
                            i12++;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    int o11 = o(i12);
                    for (int i13 = 0; i13 < o10; i13++) {
                        Object[] objArr2 = this.f14321b;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (!collection.contains(obj3)) {
                            this.f14321b[o11] = obj3;
                            o11 = l(o11);
                        } else {
                            z11 = true;
                        }
                    }
                    i10 = o11;
                    z10 = z11;
                }
                if (z10) {
                    p();
                    this.f14322c = m(i10 - this.f14320a);
                }
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        p();
        Object[] objArr = this.f14321b;
        int i10 = this.f14320a;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f14320a = l(i10);
        this.f14322c = a() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d.a.a(i10, i11, this.f14322c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f14322c) {
            clear();
            return;
        }
        if (i12 == 1) {
            h(i10);
            return;
        }
        p();
        if (i10 < this.f14322c - i11) {
            int o10 = o((i10 - 1) + this.f14320a);
            int o11 = o((i11 - 1) + this.f14320a);
            while (i10 > 0) {
                int i13 = o10 + 1;
                int min = Math.min(i10, Math.min(i13, o11 + 1));
                Object[] objArr = this.f14321b;
                int i14 = o11 - min;
                int i15 = o10 - min;
                j.l(objArr, i14 + 1, objArr, i15 + 1, i13);
                o10 = m(i15);
                o11 = m(i14);
                i10 -= min;
            }
            int o12 = o(this.f14320a + i12);
            n(this.f14320a, o12);
            this.f14320a = o12;
        } else {
            int o13 = o(this.f14320a + i11);
            int o14 = o(this.f14320a + i10);
            int i16 = this.f14322c;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f14321b;
                i11 = Math.min(i16, Math.min(objArr2.length - o13, objArr2.length - o14));
                Object[] objArr3 = this.f14321b;
                int i17 = o13 + i11;
                j.l(objArr3, o14, objArr3, o13, i17);
                o13 = o(i17);
                o14 = o(o14 + i11);
            }
            int o15 = o(this.f14322c + this.f14320a);
            n(m(o15 - i12), o15);
        }
        this.f14322c -= i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i10;
        ec.i.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f14321b.length == 0) == false) {
                int o10 = o(this.f14322c + this.f14320a);
                int i11 = this.f14320a;
                if (i11 < o10) {
                    i10 = i11;
                    while (i11 < o10) {
                        Object obj = this.f14321b[i11];
                        if (collection.contains(obj)) {
                            this.f14321b[i10] = obj;
                            i10++;
                        } else {
                            z10 = true;
                        }
                        i11++;
                    }
                    j.m(this.f14321b, i10, o10);
                } else {
                    int length = this.f14321b.length;
                    boolean z11 = false;
                    int i12 = i11;
                    while (i11 < length) {
                        Object[] objArr = this.f14321b;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (collection.contains(obj2)) {
                            this.f14321b[i12] = obj2;
                            i12++;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    int o11 = o(i12);
                    for (int i13 = 0; i13 < o10; i13++) {
                        Object[] objArr2 = this.f14321b;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (collection.contains(obj3)) {
                            this.f14321b[o11] = obj3;
                            o11 = l(o11);
                        } else {
                            z11 = true;
                        }
                    }
                    i10 = o11;
                    z10 = z11;
                }
                if (z10) {
                    p();
                    this.f14322c = m(i10 - this.f14320a);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        int a10 = a();
        if (i10 < 0 || i10 >= a10) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", a10));
        }
        int o10 = o(this.f14320a + i10);
        Object[] objArr = this.f14321b;
        E e11 = (E) objArr[o10];
        objArr[o10] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        ec.i.e(tArr, "array");
        int length = tArr.length;
        int i10 = this.f14322c;
        if (length < i10) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
            ec.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) newInstance);
        }
        int o10 = o(this.f14322c + this.f14320a);
        int i11 = this.f14320a;
        if (i11 < o10) {
            j.l(this.f14321b, 0, tArr, i11, o10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f14321b;
            j.l(objArr, 0, tArr, this.f14320a, objArr.length);
            Object[] objArr2 = this.f14321b;
            j.l(objArr2, objArr2.length - this.f14320a, tArr, 0, o10);
        }
        int i12 = this.f14322c;
        if (i12 < tArr.length) {
            tArr[i12] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        ec.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        p();
        k(collection.size() + a());
        i(o(a() + this.f14320a), collection);
        return true;
    }
}
