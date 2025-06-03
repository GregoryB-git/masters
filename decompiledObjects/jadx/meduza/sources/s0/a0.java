package s0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 extends b0 {

    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Map.Entry<K, a0> f13940a;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f13940a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f13940a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            a0 value = this.f13940a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof o0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            a0 value = this.f13940a.getValue();
            o0 o0Var = value.f13946a;
            value.f13947b = null;
            value.f13946a = (o0) obj;
            return o0Var;
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f13941a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f13941a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f13941a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f13941a.next();
            return next.getValue() instanceof a0 ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f13941a.remove();
        }
    }

    @Override // s0.b0
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // s0.b0
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
