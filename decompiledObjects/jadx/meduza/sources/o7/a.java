package o7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class a<E> extends x0<Object> implements ListIterator<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final int f11934a;

    /* renamed from: b, reason: collision with root package name */
    public int f11935b;

    public a(int i10, int i11) {
        x6.b.D(i11, i10);
        this.f11934a = i10;
        this.f11935b = i11;
    }

    @Deprecated
    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    public abstract E b(int i10);

    @Deprecated
    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11935b < this.f11934a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11935b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11935b;
        this.f11935b = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11935b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11935b - 1;
        this.f11935b = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11935b - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}
