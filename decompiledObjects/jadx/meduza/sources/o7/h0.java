package o7;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import o7.d;

/* loaded from: classes.dex */
public final class h0<K, V> extends c<K, V> {
    public transient n7.q<? extends List<V>> f;

    public h0(TreeMap treeMap, g0 g0Var) {
        super(treeMap);
        this.f = g0Var;
    }

    @Override // o7.f
    public final Map<K, Collection<V>> c() {
        Map<K, Collection<V>> map = this.f11945d;
        return map instanceof NavigableMap ? new d.e((NavigableMap) this.f11945d) : map instanceof SortedMap ? new d.h((SortedMap) this.f11945d) : new d.b(this.f11945d);
    }

    @Override // o7.f
    public final Set<K> d() {
        Map<K, Collection<V>> map = this.f11945d;
        return map instanceof NavigableMap ? new d.f((NavigableMap) this.f11945d) : map instanceof SortedMap ? new d.i((SortedMap) this.f11945d) : new d.C0187d(this.f11945d);
    }
}
