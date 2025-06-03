package X2;

import java.util.NoSuchElementException;

/* renamed from: X2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0683a extends h0 {

    /* renamed from: o, reason: collision with root package name */
    public final int f7097o;

    /* renamed from: p, reason: collision with root package name */
    public int f7098p;

    public AbstractC0683a(int i7, int i8) {
        W2.m.l(i8, i7);
        this.f7097o = i7;
        this.f7098p = i8;
    }

    public abstract Object b(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7098p < this.f7097o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7098p > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f7098p;
        this.f7098p = i7 + 1;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7098p;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f7098p - 1;
        this.f7098p = i7;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7098p - 1;
    }
}
