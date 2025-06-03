package W5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0673c extends AbstractC0671a implements List, h6.a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f6878o = new a(null);

    /* renamed from: W5.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(int i7, int i8) {
            if (i7 < 0 || i7 >= i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        public final void b(int i7, int i8) {
            if (i7 < 0 || i7 > i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        public final void c(int i7, int i8, int i9) {
            if (i7 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
            }
            if (i7 <= i8) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i7 + " > toIndex: " + i8);
        }

        public final int d(int i7, int i8) {
            int i9 = i7 + (i7 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            return i9 - 2147483639 > 0 ? i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i9;
        }

        public final boolean e(Collection c7, Collection other) {
            Intrinsics.checkNotNullParameter(c7, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c7.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c7.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection c7) {
            Intrinsics.checkNotNullParameter(c7, "c");
            Iterator it = c7.iterator();
            int i7 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i7 = (i7 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i7;
        }
    }

    /* renamed from: W5.c$b */
    public class b implements Iterator, h6.a {

        /* renamed from: o, reason: collision with root package name */
        public int f6879o;

        public b() {
        }

        public final int b() {
            return this.f6879o;
        }

        public final void d(int i7) {
            this.f6879o = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6879o < AbstractC0673c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0673c abstractC0673c = AbstractC0673c.this;
            int i7 = this.f6879o;
            this.f6879o = i7 + 1;
            return abstractC0673c.get(i7);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: W5.c$c, reason: collision with other inner class name */
    public class C0118c extends b implements ListIterator, h6.a {
        public C0118c(int i7) {
            super();
            AbstractC0673c.f6878o.b(i7, AbstractC0673c.this.size());
            d(i7);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0673c abstractC0673c = AbstractC0673c.this;
            d(b() - 1);
            return abstractC0673c.get(b());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: W5.c$d */
    public static final class d extends AbstractC0673c implements RandomAccess {

        /* renamed from: p, reason: collision with root package name */
        public final AbstractC0673c f6882p;

        /* renamed from: q, reason: collision with root package name */
        public final int f6883q;

        /* renamed from: r, reason: collision with root package name */
        public int f6884r;

        public d(AbstractC0673c list, int i7, int i8) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f6882p = list;
            this.f6883q = i7;
            AbstractC0673c.f6878o.c(i7, i8, list.size());
            this.f6884r = i8 - i7;
        }

        @Override // W5.AbstractC0671a
        public int a() {
            return this.f6884r;
        }

        @Override // W5.AbstractC0673c, java.util.List
        public Object get(int i7) {
            AbstractC0673c.f6878o.a(i7, this.f6884r);
            return this.f6882p.get(this.f6883q + i7);
        }
    }

    @Override // java.util.List
    public void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f6878o.e(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract Object get(int i7);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f6878o.f(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (Intrinsics.a(it.next(), obj)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C0118c(0);
    }

    @Override // java.util.List
    public Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i7, int i8) {
        return new d(this, i7, i8);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i7) {
        return new C0118c(i7);
    }
}
