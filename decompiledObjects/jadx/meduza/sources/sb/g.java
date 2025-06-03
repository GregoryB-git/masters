package sb;

import java.util.AbstractSet;

/* loaded from: classes.dex */
public abstract class g<E> extends AbstractSet<E> {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
