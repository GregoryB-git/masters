package tb;

import ec.i;
import java.util.Map;
import java.util.Map.Entry;

/* loaded from: classes.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends sb.g<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> entry = (Map.Entry) obj;
        i.e(entry, "element");
        return ((d) this).f14737a.f(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "element");
        c<K, V> cVar = ((d) this).f14737a;
        cVar.getClass();
        cVar.c();
        int h10 = cVar.h(entry.getKey());
        if (h10 < 0) {
            return false;
        }
        V[] vArr = cVar.f14720b;
        i.b(vArr);
        if (!i.a(vArr[h10], entry.getValue())) {
            return false;
        }
        cVar.k(h10);
        return true;
    }
}
