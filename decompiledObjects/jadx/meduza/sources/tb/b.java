package tb;

import ec.i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import sb.d;
import sb.j;

/* loaded from: classes.dex */
public final class b<E> extends sb.f<E> implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f14701d;

    /* renamed from: a, reason: collision with root package name */
    public E[] f14702a;

    /* renamed from: b, reason: collision with root package name */
    public int f14703b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14704c;

    public static final class a<E> extends sb.f<E> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public E[] f14705a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14706b;

        /* renamed from: c, reason: collision with root package name */
        public int f14707c;

        /* renamed from: d, reason: collision with root package name */
        public final a<E> f14708d;

        /* renamed from: e, reason: collision with root package name */
        public final b<E> f14709e;

        /* renamed from: tb.b$a$a, reason: collision with other inner class name */
        public static final class C0235a<E> implements ListIterator<E> {

            /* renamed from: a, reason: collision with root package name */
            public final a<E> f14710a;

            /* renamed from: b, reason: collision with root package name */
            public int f14711b;

            /* renamed from: c, reason: collision with root package name */
            public int f14712c;

            /* renamed from: d, reason: collision with root package name */
            public int f14713d;

            public C0235a(a<E> aVar, int i10) {
                i.e(aVar, "list");
                this.f14710a = aVar;
                this.f14711b = i10;
                this.f14712c = -1;
                this.f14713d = ((AbstractList) aVar).modCount;
            }

            public final void a() {
                if (((AbstractList) this.f14710a.f14709e).modCount != this.f14713d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(E e10) {
                a();
                a<E> aVar = this.f14710a;
                int i10 = this.f14711b;
                this.f14711b = i10 + 1;
                aVar.add(i10, e10);
                this.f14712c = -1;
                this.f14713d = ((AbstractList) this.f14710a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f14711b < this.f14710a.f14707c;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f14711b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                a();
                int i10 = this.f14711b;
                a<E> aVar = this.f14710a;
                if (i10 >= aVar.f14707c) {
                    throw new NoSuchElementException();
                }
                this.f14711b = i10 + 1;
                this.f14712c = i10;
                return aVar.f14705a[aVar.f14706b + i10];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f14711b;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                a();
                int i10 = this.f14711b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f14711b = i11;
                this.f14712c = i11;
                a<E> aVar = this.f14710a;
                return aVar.f14705a[aVar.f14706b + i11];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f14711b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i10 = this.f14712c;
                if (!(i10 != -1)) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.f14710a.h(i10);
                this.f14711b = this.f14712c;
                this.f14712c = -1;
                this.f14713d = ((AbstractList) this.f14710a).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e10) {
                a();
                int i10 = this.f14712c;
                if (!(i10 != -1)) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.f14710a.set(i10, e10);
            }
        }

        public a(E[] eArr, int i10, int i11, a<E> aVar, b<E> bVar) {
            i.e(eArr, "backing");
            i.e(bVar, "root");
            this.f14705a = eArr;
            this.f14706b = i10;
            this.f14707c = i11;
            this.f14708d = aVar;
            this.f14709e = bVar;
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }

        @Override // sb.f
        public final int a() {
            m();
            return this.f14707c;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i10, E e10) {
            n();
            m();
            int i11 = this.f14707c;
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
            }
            l(this.f14706b + i10, e10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e10) {
            n();
            m();
            l(this.f14706b + this.f14707c, e10);
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i10, Collection<? extends E> collection) {
            i.e(collection, "elements");
            n();
            m();
            int i11 = this.f14707c;
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
            }
            int size = collection.size();
            k(this.f14706b + i10, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> collection) {
            i.e(collection, "elements");
            n();
            m();
            int size = collection.size();
            k(this.f14706b + this.f14707c, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            n();
            m();
            p(this.f14706b, this.f14707c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            m();
            if (obj != this) {
                if (obj instanceof List) {
                    if (x6.b.a(this.f14705a, this.f14706b, this.f14707c, (List) obj)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i10) {
            m();
            int i11 = this.f14707c;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
            }
            return this.f14705a[this.f14706b + i10];
        }

        @Override // sb.f
        public final E h(int i10) {
            n();
            m();
            int i11 = this.f14707c;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
            }
            return o(this.f14706b + i10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            m();
            E[] eArr = this.f14705a;
            int i10 = this.f14706b;
            int i11 = this.f14707c;
            int i12 = 1;
            for (int i13 = 0; i13 < i11; i13++) {
                E e10 = eArr[i10 + i13];
                i12 = (i12 * 31) + (e10 != null ? e10.hashCode() : 0);
            }
            return i12;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            m();
            for (int i10 = 0; i10 < this.f14707c; i10++) {
                if (i.a(this.f14705a[this.f14706b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            m();
            return this.f14707c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final void k(int i10, Collection<? extends E> collection, int i11) {
            ((AbstractList) this).modCount++;
            a<E> aVar = this.f14708d;
            if (aVar != null) {
                aVar.k(i10, collection, i11);
            } else {
                b<E> bVar = this.f14709e;
                b bVar2 = b.f14701d;
                bVar.k(i10, collection, i11);
            }
            this.f14705a = this.f14709e.f14702a;
            this.f14707c += i11;
        }

        public final void l(int i10, E e10) {
            ((AbstractList) this).modCount++;
            a<E> aVar = this.f14708d;
            if (aVar != null) {
                aVar.l(i10, e10);
            } else {
                b<E> bVar = this.f14709e;
                b bVar2 = b.f14701d;
                bVar.l(i10, e10);
            }
            this.f14705a = this.f14709e.f14702a;
            this.f14707c++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            m();
            for (int i10 = this.f14707c - 1; i10 >= 0; i10--) {
                if (i.a(this.f14705a[this.f14706b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i10) {
            m();
            int i11 = this.f14707c;
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
            }
            return new C0235a(this, i10);
        }

        public final void m() {
            if (((AbstractList) this.f14709e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        public final void n() {
            if (this.f14709e.f14704c) {
                throw new UnsupportedOperationException();
            }
        }

        public final E o(int i10) {
            E o10;
            ((AbstractList) this).modCount++;
            a<E> aVar = this.f14708d;
            if (aVar != null) {
                o10 = aVar.o(i10);
            } else {
                b<E> bVar = this.f14709e;
                b bVar2 = b.f14701d;
                o10 = bVar.o(i10);
            }
            this.f14707c--;
            return o10;
        }

        public final void p(int i10, int i11) {
            if (i11 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.f14708d;
            if (aVar != null) {
                aVar.p(i10, i11);
            } else {
                b<E> bVar = this.f14709e;
                b bVar2 = b.f14701d;
                bVar.p(i10, i11);
            }
            this.f14707c -= i11;
        }

        public final int q(int i10, int i11, Collection<? extends E> collection, boolean z10) {
            int q10;
            a<E> aVar = this.f14708d;
            if (aVar != null) {
                q10 = aVar.q(i10, i11, collection, z10);
            } else {
                b<E> bVar = this.f14709e;
                b bVar2 = b.f14701d;
                q10 = bVar.q(i10, i11, collection, z10);
            }
            if (q10 > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f14707c -= q10;
            return q10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            n();
            m();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                h(indexOf);
            }
            return indexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<? extends Object> collection) {
            i.e(collection, "elements");
            n();
            m();
            return q(this.f14706b, this.f14707c, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<? extends Object> collection) {
            i.e(collection, "elements");
            n();
            m();
            return q(this.f14706b, this.f14707c, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i10, E e10) {
            n();
            m();
            int i11 = this.f14707c;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
            }
            E[] eArr = this.f14705a;
            int i12 = this.f14706b;
            E e11 = eArr[i12 + i10];
            eArr[i12 + i10] = e10;
            return e11;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i10, int i11) {
            d.a.a(i10, i11, this.f14707c);
            return new a(this.f14705a, this.f14706b + i10, i11 - i10, this, this.f14709e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            m();
            E[] eArr = this.f14705a;
            int i10 = this.f14706b;
            int i11 = this.f14707c + i10;
            i.e(eArr, "<this>");
            va.a.b(i11, eArr.length);
            Object[] copyOfRange = Arrays.copyOfRange(eArr, i10, i11);
            i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            m();
            return x6.b.b(this.f14705a, this.f14706b, this.f14707c, this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] tArr) {
            i.e(tArr, "array");
            m();
            int length = tArr.length;
            int i10 = this.f14707c;
            if (length < i10) {
                E[] eArr = this.f14705a;
                int i11 = this.f14706b;
                T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, tArr.getClass());
                i.d(tArr2, "copyOfRange(...)");
                return tArr2;
            }
            E[] eArr2 = this.f14705a;
            int i12 = this.f14706b;
            j.l(eArr2, 0, tArr, i12, i10 + i12);
            int i13 = this.f14707c;
            if (i13 < tArr.length) {
                tArr[i13] = null;
            }
            return tArr;
        }
    }

    /* renamed from: tb.b$b, reason: collision with other inner class name */
    public static final class C0236b<E> implements ListIterator<E> {

        /* renamed from: a, reason: collision with root package name */
        public final b<E> f14714a;

        /* renamed from: b, reason: collision with root package name */
        public int f14715b;

        /* renamed from: c, reason: collision with root package name */
        public int f14716c;

        /* renamed from: d, reason: collision with root package name */
        public int f14717d;

        public C0236b(b<E> bVar, int i10) {
            i.e(bVar, "list");
            this.f14714a = bVar;
            this.f14715b = i10;
            this.f14716c = -1;
            this.f14717d = ((AbstractList) bVar).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f14714a).modCount != this.f14717d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            a();
            b<E> bVar = this.f14714a;
            int i10 = this.f14715b;
            this.f14715b = i10 + 1;
            bVar.add(i10, e10);
            this.f14716c = -1;
            this.f14717d = ((AbstractList) this.f14714a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f14715b < this.f14714a.f14703b;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f14715b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            a();
            int i10 = this.f14715b;
            b<E> bVar = this.f14714a;
            if (i10 >= bVar.f14703b) {
                throw new NoSuchElementException();
            }
            this.f14715b = i10 + 1;
            this.f14716c = i10;
            return bVar.f14702a[i10];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f14715b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            a();
            int i10 = this.f14715b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f14715b = i11;
            this.f14716c = i11;
            return this.f14714a.f14702a[i11];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f14715b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i10 = this.f14716c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f14714a.h(i10);
            this.f14715b = this.f14716c;
            this.f14716c = -1;
            this.f14717d = ((AbstractList) this.f14714a).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            a();
            int i10 = this.f14716c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f14714a.set(i10, e10);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f14704c = true;
        f14701d = bVar;
    }

    public b(int i10) {
        this.f14702a = (E[]) x6.b.g(i10);
    }

    public /* synthetic */ b(Object obj) {
        this(10);
    }

    @Override // sb.f
    public final int a() {
        return this.f14703b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        m();
        int i11 = this.f14703b;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
        }
        ((AbstractList) this).modCount++;
        n(i10, 1);
        this.f14702a[i10] = e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        i.e(collection, "elements");
        m();
        int i11 = this.f14703b;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
        }
        int size = collection.size();
        k(i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        i.e(collection, "elements");
        m();
        int size = collection.size();
        k(this.f14703b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m();
        p(0, this.f14703b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!x6.b.a(this.f14702a, 0, this.f14703b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int i11 = this.f14703b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
        }
        return this.f14702a[i10];
    }

    @Override // sb.f
    public final E h(int i10) {
        m();
        int i11 = this.f14703b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
        }
        return o(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f14702a;
        int i10 = this.f14703b;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            E e10 = eArr[0 + i12];
            i11 = (i11 * 31) + (e10 != null ? e10.hashCode() : 0);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f14703b; i10++) {
            if (i.a(this.f14702a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f14703b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void k(int i10, Collection<? extends E> collection, int i11) {
        ((AbstractList) this).modCount++;
        n(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f14702a[i10 + i12] = it.next();
        }
    }

    public final void l(int i10, E e10) {
        ((AbstractList) this).modCount++;
        n(i10, 1);
        this.f14702a[i10] = e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f14703b - 1; i10 >= 0; i10--) {
            if (i.a(this.f14702a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        int i11 = this.f14703b;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
        }
        return new C0236b(this, i10);
    }

    public final void m() {
        if (this.f14704c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void n(int i10, int i11) {
        int i12 = this.f14703b + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f14702a;
        if (i12 > eArr.length) {
            int length = eArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            E[] eArr2 = (E[]) Arrays.copyOf(eArr, i13);
            i.d(eArr2, "copyOf(...)");
            this.f14702a = eArr2;
        }
        E[] eArr3 = this.f14702a;
        j.l(eArr3, i10 + i11, eArr3, i10, this.f14703b);
        this.f14703b += i11;
    }

    public final E o(int i10) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.f14702a;
        E e10 = eArr[i10];
        j.l(eArr, i10, eArr, i10 + 1, this.f14703b);
        E[] eArr2 = this.f14702a;
        int i11 = this.f14703b - 1;
        i.e(eArr2, "<this>");
        eArr2[i11] = null;
        this.f14703b--;
        return e10;
    }

    public final void p(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.f14702a;
        j.l(eArr, i10, eArr, i10 + i11, this.f14703b);
        E[] eArr2 = this.f14702a;
        int i12 = this.f14703b;
        x6.b.o0(eArr2, i12 - i11, i12);
        this.f14703b -= i11;
    }

    public final int q(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f14702a[i14]) == z10) {
                E[] eArr = this.f14702a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f14702a;
        j.l(eArr2, i10 + i13, eArr2, i11 + i10, this.f14703b);
        E[] eArr3 = this.f14702a;
        int i16 = this.f14703b;
        x6.b.o0(eArr3, i16 - i15, i16);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f14703b -= i15;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            h(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        m();
        return q(0, this.f14703b, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        m();
        return q(0, this.f14703b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        m();
        int i11 = this.f14703b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
        }
        E[] eArr = this.f14702a;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i10, int i11) {
        d.a.a(i10, i11, this.f14703b);
        return new a(this.f14702a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        E[] eArr = this.f14702a;
        int i10 = this.f14703b;
        i.e(eArr, "<this>");
        va.a.b(i10, eArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(eArr, 0, i10);
        i.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return x6.b.b(this.f14702a, 0, this.f14703b, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        i.e(tArr, "array");
        int length = tArr.length;
        int i10 = this.f14703b;
        if (length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(this.f14702a, 0, i10, tArr.getClass());
            i.d(tArr2, "copyOfRange(...)");
            return tArr2;
        }
        j.l(this.f14702a, 0, tArr, 0, i10);
        int i11 = this.f14703b;
        if (i11 < tArr.length) {
            tArr[i11] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        m();
        int i10 = this.f14703b;
        ((AbstractList) this).modCount++;
        n(i10, 1);
        this.f14702a[i10] = e10;
        return true;
    }
}
