package ec;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T[] f5262a;

    /* renamed from: b, reason: collision with root package name */
    public int f5263b;

    public a(T[] tArr) {
        i.e(tArr, "array");
        this.f5262a = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5263b < this.f5262a.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f5262a;
            int i10 = this.f5263b;
            this.f5263b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f5263b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
