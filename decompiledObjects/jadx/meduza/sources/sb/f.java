package sb;

import java.util.AbstractList;

/* loaded from: classes.dex */
public abstract class f<E> extends AbstractList<E> {
    public abstract int a();

    public abstract E h(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return h(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
