package o7;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b<T> extends x0<T> {

    /* renamed from: a, reason: collision with root package name */
    public int f11938a = 2;

    /* renamed from: b, reason: collision with root package name */
    public T f11939b;

    public abstract T a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        x6.b.J(this.f11938a != 4);
        int c10 = q0.g.c(this.f11938a);
        if (c10 == 0) {
            return true;
        }
        if (c10 == 2) {
            return false;
        }
        this.f11938a = 4;
        this.f11939b = a();
        if (this.f11938a == 3) {
            return false;
        }
        this.f11938a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11938a = 2;
        T t = this.f11939b;
        this.f11939b = null;
        return t;
    }
}
