package r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import r.g;

/* loaded from: classes.dex */
public final class b<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: p, reason: collision with root package name */
    public a f13464p;

    public b() {
    }

    public b(int i10) {
        super(i10);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f13464p == null) {
            this.f13464p = new a(this);
        }
        a aVar = this.f13464p;
        if (aVar.f13480a == null) {
            aVar.f13480a = new g.b();
        }
        return aVar.f13480a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.f13464p == null) {
            this.f13464p = new a(this);
        }
        a aVar = this.f13464p;
        if (aVar.f13481b == null) {
            aVar.f13481b = new g.c();
        }
        return aVar.f13481b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        c(map.size() + this.f13500c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.f13464p == null) {
            this.f13464p = new a(this);
        }
        a aVar = this.f13464p;
        if (aVar.f13482c == null) {
            aVar.f13482c = new g.e();
        }
        return aVar.f13482c;
    }
}
