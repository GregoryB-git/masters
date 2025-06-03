package ma;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes.dex */
public final class s1 extends AbstractList<String> implements h0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f11076a;

    public class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public ListIterator<String> f11077a;

        public a(s1 s1Var, int i10) {
            this.f11077a = s1Var.f11076a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f11077a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f11077a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f11077a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f11077a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f11077a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f11077a.previousIndex();
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
        public Iterator<String> f11078a;

        public b(s1 s1Var) {
            this.f11078a = s1Var.f11076a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f11078a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f11078a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public s1(h0 h0Var) {
        this.f11076a = h0Var;
    }

    @Override // ma.h0
    public final List<?> d() {
        return this.f11076a.d();
    }

    @Override // ma.h0
    public final h0 e() {
        return this;
    }

    @Override // ma.h0
    public final Object f(int i10) {
        return this.f11076a.f(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f11076a.get(i10);
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
        return this.f11076a.size();
    }

    @Override // ma.h0
    public final void v(h hVar) {
        throw new UnsupportedOperationException();
    }
}
