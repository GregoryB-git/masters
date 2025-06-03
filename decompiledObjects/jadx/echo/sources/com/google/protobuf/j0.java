package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class j0 extends AbstractList implements InterfaceC1160z, RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1160z f12086o;

    public class a implements ListIterator {

        /* renamed from: o, reason: collision with root package name */
        public ListIterator f12087o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f12088p;

        public a(int i7) {
            this.f12088p = i7;
            this.f12087o = j0.this.f12086o.listIterator(i7);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f12087o.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f12087o.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f12087o.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f12087o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f12087o.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f12087o.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public Iterator f12090o;

        public b() {
            this.f12090o = j0.this.f12086o.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f12090o.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12090o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public j0(InterfaceC1160z interfaceC1160z) {
        this.f12086o = interfaceC1160z;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        return (String) this.f12086o.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i7) {
        return new a(i7);
    }

    @Override // com.google.protobuf.InterfaceC1160z
    public InterfaceC1160z m() {
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1160z
    public Object n(int i7) {
        return this.f12086o.n(i7);
    }

    @Override // com.google.protobuf.InterfaceC1160z
    public List o() {
        return this.f12086o.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12086o.size();
    }

    @Override // com.google.protobuf.InterfaceC1160z
    public void x(AbstractC1141f abstractC1141f) {
        throw new UnsupportedOperationException();
    }
}
