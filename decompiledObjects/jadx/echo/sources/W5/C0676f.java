package W5;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676f extends AbstractC0674d {

    /* renamed from: r, reason: collision with root package name */
    public static final a f6887r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final Object[] f6888s = new Object[0];

    /* renamed from: o, reason: collision with root package name */
    public int f6889o;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f6890p = f6888s;

    /* renamed from: q, reason: collision with root package name */
    public int f6891q;

    /* renamed from: W5.f$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public final int D(int i7) {
        if (i7 == C0681k.k(this.f6890p)) {
            return 0;
        }
        return i7 + 1;
    }

    public final int M(int i7) {
        return i7 < 0 ? i7 + this.f6890p.length : i7;
    }

    public final void S(int i7, int i8) {
        Object[] objArr = this.f6890p;
        if (i7 < i8) {
            C0680j.e(objArr, null, i7, i8);
        } else {
            C0680j.e(objArr, null, i7, objArr.length);
            C0680j.e(this.f6890p, null, 0, i8);
        }
    }

    public final int T(int i7) {
        Object[] objArr = this.f6890p;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    public final void U() {
        ((AbstractList) this).modCount++;
    }

    public final Object V() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        U();
        Object[] objArr = this.f6890p;
        int i7 = this.f6889o;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f6889o = D(i7);
        this.f6891q = size() - 1;
        return obj;
    }

    public final Object W() {
        if (isEmpty()) {
            return null;
        }
        return V();
    }

    public final Object X() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        U();
        int T6 = T(this.f6889o + o.h(this));
        Object[] objArr = this.f6890p;
        Object obj = objArr[T6];
        objArr[T6] = null;
        this.f6891q = size() - 1;
        return obj;
    }

    public final void Y(int i7, int i8) {
        int T6 = T(this.f6889o + (i7 - 1));
        int T7 = T(this.f6889o + (i8 - 1));
        while (i7 > 0) {
            int i9 = T6 + 1;
            int min = Math.min(i7, Math.min(i9, T7 + 1));
            Object[] objArr = this.f6890p;
            int i10 = T7 - min;
            int i11 = T6 - min;
            C0680j.c(objArr, objArr, i10 + 1, i11 + 1, i9);
            T6 = M(i11);
            T7 = M(i10);
            i7 -= min;
        }
    }

    public final void Z(int i7, int i8) {
        int T6 = T(this.f6889o + i8);
        int T7 = T(this.f6889o + i7);
        int size = size();
        while (true) {
            size -= i8;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f6890p;
            i8 = Math.min(size, Math.min(objArr.length - T6, objArr.length - T7));
            Object[] objArr2 = this.f6890p;
            int i9 = T6 + i8;
            C0680j.c(objArr2, objArr2, T7, T6, i9);
            T6 = T(i9);
            T7 = T(T7 + i8);
        }
    }

    @Override // W5.AbstractC0674d
    public int a() {
        return this.f6891q;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        AbstractC0673c.f6878o.b(i7, size());
        if (i7 == size()) {
            g(obj);
            return;
        }
        if (i7 == 0) {
            f(obj);
            return;
        }
        U();
        s(size() + 1);
        int T6 = T(this.f6889o + i7);
        if (i7 < ((size() + 1) >> 1)) {
            int q7 = q(T6);
            int q8 = q(this.f6889o);
            int i8 = this.f6889o;
            if (q7 >= i8) {
                Object[] objArr = this.f6890p;
                objArr[q8] = objArr[i8];
                C0680j.c(objArr, objArr, i8, i8 + 1, q7 + 1);
            } else {
                Object[] objArr2 = this.f6890p;
                C0680j.c(objArr2, objArr2, i8 - 1, i8, objArr2.length);
                Object[] objArr3 = this.f6890p;
                objArr3[objArr3.length - 1] = objArr3[0];
                C0680j.c(objArr3, objArr3, 0, 1, q7 + 1);
            }
            this.f6890p[q7] = obj;
            this.f6889o = q8;
        } else {
            int T7 = T(this.f6889o + size());
            Object[] objArr4 = this.f6890p;
            if (T6 < T7) {
                C0680j.c(objArr4, objArr4, T6 + 1, T6, T7);
            } else {
                C0680j.c(objArr4, objArr4, 1, 0, T7);
                Object[] objArr5 = this.f6890p;
                objArr5[0] = objArr5[objArr5.length - 1];
                C0680j.c(objArr5, objArr5, T6 + 1, T6, objArr5.length - 1);
            }
            this.f6890p[T6] = obj;
        }
        this.f6891q = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC0673c.f6878o.b(i7, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i7 == size()) {
            return addAll(elements);
        }
        U();
        s(size() + elements.size());
        int T6 = T(this.f6889o + size());
        int T7 = T(this.f6889o + i7);
        int size = elements.size();
        if (i7 < ((size() + 1) >> 1)) {
            int i8 = this.f6889o;
            int i9 = i8 - size;
            if (T7 < i8) {
                Object[] objArr = this.f6890p;
                C0680j.c(objArr, objArr, i9, i8, objArr.length);
                Object[] objArr2 = this.f6890p;
                if (size >= T7) {
                    C0680j.c(objArr2, objArr2, objArr2.length - size, 0, T7);
                } else {
                    C0680j.c(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f6890p;
                    C0680j.c(objArr3, objArr3, 0, size, T7);
                }
            } else if (i9 >= 0) {
                Object[] objArr4 = this.f6890p;
                C0680j.c(objArr4, objArr4, i9, i8, T7);
            } else {
                Object[] objArr5 = this.f6890p;
                i9 += objArr5.length;
                int i10 = T7 - i8;
                int length = objArr5.length - i9;
                if (length >= i10) {
                    C0680j.c(objArr5, objArr5, i9, i8, T7);
                } else {
                    C0680j.c(objArr5, objArr5, i9, i8, i8 + length);
                    Object[] objArr6 = this.f6890p;
                    C0680j.c(objArr6, objArr6, 0, this.f6889o + length, T7);
                }
            }
            this.f6889o = i9;
            i(M(T7 - size), elements);
        } else {
            int i11 = T7 + size;
            if (T7 < T6) {
                int i12 = size + T6;
                Object[] objArr7 = this.f6890p;
                if (i12 > objArr7.length) {
                    if (i11 >= objArr7.length) {
                        i11 -= objArr7.length;
                    } else {
                        int length2 = T6 - (i12 - objArr7.length);
                        C0680j.c(objArr7, objArr7, 0, length2, T6);
                        Object[] objArr8 = this.f6890p;
                        C0680j.c(objArr8, objArr8, i11, T7, length2);
                    }
                }
                C0680j.c(objArr7, objArr7, i11, T7, T6);
            } else {
                Object[] objArr9 = this.f6890p;
                C0680j.c(objArr9, objArr9, size, 0, T6);
                Object[] objArr10 = this.f6890p;
                if (i11 >= objArr10.length) {
                    C0680j.c(objArr10, objArr10, i11 - objArr10.length, T7, objArr10.length);
                } else {
                    C0680j.c(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f6890p;
                    C0680j.c(objArr11, objArr11, i11, T7, objArr11.length - size);
                }
            }
            i(T7, elements);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            U();
            S(this.f6889o, T(this.f6889o + size()));
        }
        this.f6889o = 0;
        this.f6891q = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // W5.AbstractC0674d
    public Object d(int i7) {
        AbstractC0673c.f6878o.a(i7, size());
        if (i7 == o.h(this)) {
            return X();
        }
        if (i7 == 0) {
            return V();
        }
        U();
        int T6 = T(this.f6889o + i7);
        Object obj = this.f6890p[T6];
        if (i7 < (size() >> 1)) {
            int i8 = this.f6889o;
            if (T6 >= i8) {
                Object[] objArr = this.f6890p;
                C0680j.c(objArr, objArr, i8 + 1, i8, T6);
            } else {
                Object[] objArr2 = this.f6890p;
                C0680j.c(objArr2, objArr2, 1, 0, T6);
                Object[] objArr3 = this.f6890p;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i9 = this.f6889o;
                C0680j.c(objArr3, objArr3, i9 + 1, i9, objArr3.length - 1);
            }
            Object[] objArr4 = this.f6890p;
            int i10 = this.f6889o;
            objArr4[i10] = null;
            this.f6889o = D(i10);
        } else {
            int T7 = T(this.f6889o + o.h(this));
            Object[] objArr5 = this.f6890p;
            if (T6 <= T7) {
                C0680j.c(objArr5, objArr5, T6, T6 + 1, T7 + 1);
            } else {
                C0680j.c(objArr5, objArr5, T6, T6 + 1, objArr5.length);
                Object[] objArr6 = this.f6890p;
                objArr6[objArr6.length - 1] = objArr6[0];
                C0680j.c(objArr6, objArr6, 0, 1, T7 + 1);
            }
            this.f6890p[T7] = null;
        }
        this.f6891q = size() - 1;
        return obj;
    }

    public final void f(Object obj) {
        U();
        s(size() + 1);
        int q7 = q(this.f6889o);
        this.f6889o = q7;
        this.f6890p[q7] = obj;
        this.f6891q = size() + 1;
    }

    public final void g(Object obj) {
        U();
        s(size() + 1);
        this.f6890p[T(this.f6889o + size())] = obj;
        this.f6891q = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        AbstractC0673c.f6878o.a(i7, size());
        return this.f6890p[T(this.f6889o + i7)];
    }

    public final void i(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f6890p.length;
        while (i7 < length && it.hasNext()) {
            this.f6890p[i7] = it.next();
            i7++;
        }
        int i8 = this.f6889o;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f6890p[i9] = it.next();
        }
        this.f6891q = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int T6 = T(this.f6889o + size());
        int i7 = this.f6889o;
        if (i7 < T6) {
            while (i7 < T6) {
                if (!Intrinsics.a(obj, this.f6890p[i7])) {
                    i7++;
                }
            }
            return -1;
        }
        if (i7 < T6) {
            return -1;
        }
        int length = this.f6890p.length;
        while (true) {
            if (i7 >= length) {
                for (int i8 = 0; i8 < T6; i8++) {
                    if (Intrinsics.a(obj, this.f6890p[i8])) {
                        i7 = i8 + this.f6890p.length;
                    }
                }
                return -1;
            }
            if (Intrinsics.a(obj, this.f6890p[i7])) {
                break;
            }
            i7++;
        }
        return i7 - this.f6889o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void k(int i7) {
        Object[] objArr = new Object[i7];
        Object[] objArr2 = this.f6890p;
        C0680j.c(objArr2, objArr, 0, this.f6889o, objArr2.length);
        Object[] objArr3 = this.f6890p;
        int length = objArr3.length;
        int i8 = this.f6889o;
        C0680j.c(objArr3, objArr, length - i8, 0, i8);
        this.f6889o = 0;
        this.f6890p = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int k7;
        int T6 = T(this.f6889o + size());
        int i7 = this.f6889o;
        if (i7 < T6) {
            k7 = T6 - 1;
            if (i7 <= k7) {
                while (!Intrinsics.a(obj, this.f6890p[k7])) {
                    if (k7 != i7) {
                        k7--;
                    }
                }
                return k7 - this.f6889o;
            }
            return -1;
        }
        if (i7 > T6) {
            int i8 = T6 - 1;
            while (true) {
                if (-1 >= i8) {
                    k7 = C0681k.k(this.f6890p);
                    int i9 = this.f6889o;
                    if (i9 <= k7) {
                        while (!Intrinsics.a(obj, this.f6890p[k7])) {
                            if (k7 != i9) {
                                k7--;
                            }
                        }
                    }
                } else {
                    if (Intrinsics.a(obj, this.f6890p[i8])) {
                        k7 = i8 + this.f6890p.length;
                        break;
                    }
                    i8--;
                }
            }
        }
        return -1;
    }

    public final int q(int i7) {
        return i7 == 0 ? C0681k.k(this.f6890p) : i7 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int T6;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f6890p.length != 0) {
            int T7 = T(this.f6889o + size());
            int i7 = this.f6889o;
            if (i7 < T7) {
                T6 = i7;
                while (i7 < T7) {
                    Object obj = this.f6890p[i7];
                    if (!elements.contains(obj)) {
                        this.f6890p[T6] = obj;
                        T6++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                C0680j.e(this.f6890p, null, T6, T7);
            } else {
                int length = this.f6890p.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f6890p;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (!elements.contains(obj2)) {
                        this.f6890p[i8] = obj2;
                        i8++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                T6 = T(i8);
                for (int i9 = 0; i9 < T7; i9++) {
                    Object[] objArr2 = this.f6890p;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (!elements.contains(obj3)) {
                        this.f6890p[T6] = obj3;
                        T6 = D(T6);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                U();
                this.f6891q = M(T6 - this.f6889o);
            }
        }
        return z7;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i7, int i8) {
        AbstractC0673c.f6878o.c(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == size()) {
            clear();
            return;
        }
        if (i9 == 1) {
            remove(i7);
            return;
        }
        U();
        if (i7 < size() - i8) {
            Y(i7, i8);
            int T6 = T(this.f6889o + i9);
            S(this.f6889o, T6);
            this.f6889o = T6;
        } else {
            Z(i7, i8);
            int T7 = T(this.f6889o + size());
            S(M(T7 - i9), T7);
        }
        this.f6891q = size() - i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int T6;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f6890p.length != 0) {
            int T7 = T(this.f6889o + size());
            int i7 = this.f6889o;
            if (i7 < T7) {
                T6 = i7;
                while (i7 < T7) {
                    Object obj = this.f6890p[i7];
                    if (elements.contains(obj)) {
                        this.f6890p[T6] = obj;
                        T6++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                C0680j.e(this.f6890p, null, T6, T7);
            } else {
                int length = this.f6890p.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f6890p;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        this.f6890p[i8] = obj2;
                        i8++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                T6 = T(i8);
                for (int i9 = 0; i9 < T7; i9++) {
                    Object[] objArr2 = this.f6890p;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (elements.contains(obj3)) {
                        this.f6890p[T6] = obj3;
                        T6 = D(T6);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                U();
                this.f6891q = M(T6 - this.f6889o);
            }
        }
        return z7;
    }

    public final void s(int i7) {
        int a7;
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f6890p;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr != f6888s) {
            k(AbstractC0673c.f6878o.d(objArr.length, i7));
        } else {
            a7 = l6.f.a(i7, 10);
            this.f6890p = new Object[a7];
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        AbstractC0673c.f6878o.a(i7, size());
        int T6 = T(this.f6889o + i7);
        Object[] objArr = this.f6890p;
        Object obj2 = objArr[T6];
        objArr[T6] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        g(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        U();
        s(size() + elements.size());
        i(T(this.f6889o + size()), elements);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = C0678h.a(array, size());
        }
        int T6 = T(this.f6889o + size());
        int i7 = this.f6889o;
        if (i7 < T6) {
            C0680j.d(this.f6890p, array, 0, i7, T6, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f6890p;
            C0680j.c(objArr, array, 0, this.f6889o, objArr.length);
            Object[] objArr2 = this.f6890p;
            C0680j.c(objArr2, array, objArr2.length - this.f6889o, 0, T6);
        }
        return n.c(size(), array);
    }
}
