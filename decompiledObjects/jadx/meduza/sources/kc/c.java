package kc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c<T> extends d<T> implements Iterator<T>, ub.e<rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public int f9244a;

    /* renamed from: b, reason: collision with root package name */
    public T f9245b;

    /* renamed from: c, reason: collision with root package name */
    public ub.e<? super rb.h> f9246c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kc.d
    public final void a(Object obj, ub.e eVar) {
        this.f9245b = obj;
        this.f9244a = 3;
        this.f9246c = eVar;
        vb.a aVar = vb.a.f16085a;
        ec.i.e(eVar, "frame");
    }

    public final RuntimeException c() {
        int i10 = this.f9244a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder l10 = defpackage.f.l("Unexpected state of the iterator: ");
        l10.append(this.f9244a);
        return new IllegalStateException(l10.toString());
    }

    @Override // ub.e
    public final ub.h getContext() {
        return ub.i.f15164a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f9244a;
            if (i10 != 0) {
                break;
            }
            this.f9244a = 5;
            ub.e<? super rb.h> eVar = this.f9246c;
            ec.i.b(eVar);
            this.f9246c = null;
            eVar.resumeWith(rb.h.f13851a);
        }
        if (i10 == 1) {
            ec.i.b(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw c();
    }

    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f9244a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f9244a = 1;
            ec.i.b(null);
            throw null;
        }
        if (i10 != 3) {
            throw c();
        }
        this.f9244a = 0;
        T t = this.f9245b;
        this.f9245b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ub.e
    public final void resumeWith(Object obj) {
        rb.f.b(obj);
        this.f9244a = 4;
    }
}
