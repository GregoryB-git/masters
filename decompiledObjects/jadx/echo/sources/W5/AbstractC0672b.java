package W5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: W5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0672b implements Iterator, h6.a {

    /* renamed from: o, reason: collision with root package name */
    public int f6876o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6877p;

    public abstract void b();

    public final void d() {
        this.f6876o = 2;
    }

    public final void e(Object obj) {
        this.f6877p = obj;
        this.f6876o = 1;
    }

    public final boolean f() {
        this.f6876o = 3;
        b();
        return this.f6876o == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i7 = this.f6876o;
        if (i7 == 0) {
            return f();
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i7 = this.f6876o;
        if (i7 != 1 && (i7 == 2 || !f())) {
            throw new NoSuchElementException();
        }
        this.f6876o = 0;
        return this.f6877p;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
