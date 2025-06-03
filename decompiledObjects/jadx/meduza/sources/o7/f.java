package o7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f<K, V> implements f0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public transient Set<K> f11979a;

    /* renamed from: b, reason: collision with root package name */
    public transient Collection<V> f11980b;

    /* renamed from: c, reason: collision with root package name */
    public transient Map<K, Collection<V>> f11981c;

    public class a extends AbstractCollection<V> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return f.this.b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return f.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return f.this.size();
        }
    }

    @Override // o7.f0
    public abstract Map<K, Collection<V>> a();

    public boolean b(Object obj) {
        Iterator<Collection<V>> it = a().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> c();

    public abstract Set<K> d();

    public abstract Iterator<V> e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            return a().equals(((f0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
