package sb;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class d<E> extends sb.b<E> implements List<E> {

    public static final class a {
        public static void a(int i10, int i11, int i12) {
            if (i10 >= 0 && i11 <= i12) {
                if (i10 > i11) {
                    throw new IllegalArgumentException(defpackage.f.i("fromIndex: ", i10, " > toIndex: ", i11));
                }
                return;
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
        }
    }

    public class b implements Iterator<E> {

        /* renamed from: a, reason: collision with root package name */
        public int f14311a;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f14311a < d.this.a();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            int i10 = this.f14311a;
            this.f14311a = i10 + 1;
            return dVar.get(i10);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public class c extends d<E>.b implements ListIterator<E> {
        public c(int i10) {
            super();
            int a10 = d.this.a();
            if (i10 < 0 || i10 > a10) {
                throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", a10));
            }
            this.f14311a = i10;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f14311a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f14311a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            int i10 = this.f14311a - 1;
            this.f14311a = i10;
            return dVar.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f14311a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: sb.d$d, reason: collision with other inner class name */
    public static final class C0224d<E> extends d<E> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final d<E> f14314a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14315b;

        /* renamed from: c, reason: collision with root package name */
        public int f14316c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0224d(d<? extends E> dVar, int i10, int i11) {
            ec.i.e(dVar, "list");
            this.f14314a = dVar;
            this.f14315b = i10;
            a.a(i10, i11, dVar.a());
            this.f14316c = i11 - i10;
        }

        @Override // sb.b
        public final int a() {
            return this.f14316c;
        }

        @Override // sb.d, java.util.List
        public final E get(int i10) {
            int i11 = this.f14316c;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(defpackage.f.i("index: ", i10, ", size: ", i11));
            }
            return this.f14314a.get(this.f14315b + i10);
        }
    }

    @Override // java.util.List
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        ec.i.e(collection, "other");
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!ec.i.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int i10 = 1;
        while (it.hasNext()) {
            E next = it.next();
            i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (ec.i.a(it.next(), e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (ec.i.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }

    @Override // java.util.List
    public final E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<E> subList(int i10, int i11) {
        return new C0224d(this, i10, i11);
    }
}
