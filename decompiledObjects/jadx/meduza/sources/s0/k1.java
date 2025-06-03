package s0;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class k1 extends AbstractList<String> implements d0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f14033a;

    public class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public ListIterator<String> f14034a;

        public a(k1 k1Var, int i10) {
            this.f14034a = k1Var.f14033a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f14034a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f14034a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f14034a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f14034a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f14034a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f14034a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<String> f14035a;

        public b(k1 k1Var) {
            this.f14035a = k1Var.f14033a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f14035a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f14035a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public k1(d0 d0Var) {
        this.f14033a = d0Var;
    }

    @Override // s0.d0
    public final List<?> d() {
        return this.f14033a.d();
    }

    @Override // s0.d0
    public final d0 e() {
        return this;
    }

    @Override // s0.d0
    public final Object f(int i10) {
        return this.f14033a.f(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f14033a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14033a.size();
    }

    @Override // s0.d0
    public final void w(g gVar) {
        throw new UnsupportedOperationException();
    }
}
