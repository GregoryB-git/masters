package o7;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o7.d;
import o7.d.b.a;
import o7.u0;

/* loaded from: classes.dex */
public final class e0 {

    public static abstract class a<K, V> extends u0.c<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            d.b.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return d.b.this.isEmpty();
        }

        @Override // o7.u0.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                Iterator<?> it = collection.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    z10 |= ((d.b.a) this).remove(it.next());
                }
                return z10;
            }
        }

        @Override // o7.u0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            int ceil;
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    p2.m0.o(size, "expectedSize");
                    ceil = size + 1;
                } else {
                    ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(ceil);
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return d.b.this.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return d.b.this.size();
        }
    }

    public static class b<K, V> extends u0.c<K> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f11975a;

        public b(Map<K, V> map) {
            map.getClass();
            this.f11975a = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f11975a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.f11975a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f11975a.size();
        }
    }

    public static class c<K, V> extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f11976a;

        public c(Map<K, V> map) {
            map.getClass();
            this.f11976a = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f11976a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f11976a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f11976a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new d0(this.f11976a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.f11976a.entrySet()) {
                    if (x6.b.Q(obj, entry.getValue())) {
                        this.f11976a.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f11976a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f11976a.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f11976a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f11976a.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f11976a.size();
        }
    }

    public static abstract class d<K, V> extends AbstractMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public transient d.b.a f11977a;

        /* renamed from: b, reason: collision with root package name */
        public transient c f11978b;

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            d.b.a aVar = this.f11977a;
            if (aVar != null) {
                return aVar;
            }
            d.b.a aVar2 = ((d.b) this).new a();
            this.f11977a = aVar2;
            return aVar2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            c cVar = this.f11978b;
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c(this);
            this.f11978b = cVar2;
            return cVar2;
        }
    }

    public static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
