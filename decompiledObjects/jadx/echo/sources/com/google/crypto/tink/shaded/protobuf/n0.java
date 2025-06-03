package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class n0 extends AbstractList implements D, RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    public final D f11394o;

    public class a implements ListIterator {

        /* renamed from: o, reason: collision with root package name */
        public ListIterator f11395o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f11396p;

        public a(int i7) {
            this.f11396p = i7;
            this.f11395o = n0.this.f11394o.listIterator(i7);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f11395o.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f11395o.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f11395o.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f11395o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f11395o.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f11395o.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public Iterator f11398o;

        public b() {
            this.f11398o = n0.this.f11394o.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f11398o.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11398o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public n0(D d7) {
        this.f11394o = d7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public void C(AbstractC1093h abstractC1093h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        return (String) this.f11394o.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i7) {
        return new a(i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public D m() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public Object n(int i7) {
        return this.f11394o.n(i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public List o() {
        return this.f11394o.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11394o.size();
    }
}
