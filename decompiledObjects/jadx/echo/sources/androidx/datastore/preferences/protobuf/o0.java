package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class o0 extends AbstractList implements D, RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    public final D f9039o;

    public class a implements ListIterator {

        /* renamed from: o, reason: collision with root package name */
        public ListIterator f9040o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f9041p;

        public a(int i7) {
            this.f9041p = i7;
            this.f9040o = o0.this.f9039o.listIterator(i7);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f9040o.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f9040o.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f9040o.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f9040o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f9040o.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f9040o.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public Iterator f9043o;

        public b() {
            this.f9043o = o0.this.f9039o.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f9043o.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9043o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o0(D d7) {
        this.f9039o = d7;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void H(AbstractC0760g abstractC0760g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        return (String) this.f9039o.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i7) {
        return new a(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public D m() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public Object n(int i7) {
        return this.f9039o.n(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List o() {
        return this.f9039o.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9039o.size();
    }
}
