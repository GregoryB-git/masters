package sb;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l implements Iterator<Character> {
    public abstract char a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
