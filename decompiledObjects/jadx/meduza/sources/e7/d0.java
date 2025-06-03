package e7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d0 implements Iterator<String> {

    /* renamed from: a, reason: collision with root package name */
    public Iterator<String> f4141a;

    public d0(a0 a0Var) {
        this.f4141a = a0Var.f4057a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4141a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f4141a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
