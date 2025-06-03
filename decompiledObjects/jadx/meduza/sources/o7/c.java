package o7;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class c<K, V> extends d<K, V> {
    public c(TreeMap treeMap) {
        super(treeMap);
    }

    @Override // o7.f, o7.f0
    public final Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f11981c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c10 = c();
        this.f11981c = c10;
        return c10;
    }

    @Override // o7.f
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
