package sb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import sb.a0;

/* loaded from: classes.dex */
public abstract class c<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public int f14309a;

    /* renamed from: b, reason: collision with root package name */
    public T f14310b;

    public final boolean a() {
        this.f14309a = 3;
        a0.a aVar = (a0.a) this;
        int i10 = aVar.f14297c;
        if (i10 == 0) {
            aVar.f14309a = 2;
        } else {
            a0<T> a0Var = aVar.f14299e;
            Object[] objArr = a0Var.f14293a;
            int i11 = aVar.f14298d;
            aVar.f14310b = (T) objArr[i11];
            aVar.f14309a = 1;
            aVar.f14298d = (i11 + 1) % a0Var.f14294b;
            aVar.f14297c = i10 - 1;
        }
        return this.f14309a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f14309a;
        if (i10 == 0) {
            return a();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f14309a;
        if (i10 != 1 && (i10 == 2 || !a())) {
            throw new NoSuchElementException();
        }
        this.f14309a = 0;
        return this.f14310b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
