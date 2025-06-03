package W5;

import java.util.AbstractList;
import java.util.List;

/* renamed from: W5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0674d extends AbstractList implements List, h6.b {
    public abstract int a();

    public abstract Object d(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return d(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
