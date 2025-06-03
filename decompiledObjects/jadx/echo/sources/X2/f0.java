package X2;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class f0 extends e0 implements ListIterator {
    public f0(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator d() {
        return (ListIterator) this.f7144o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return d().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return d().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b(d().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return d().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
