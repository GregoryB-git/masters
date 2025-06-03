package ma;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e0 extends f0 {

    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Map.Entry<K, e0> f10943a;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f10943a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f10943a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            e0 value = this.f10943a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof s0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            e0 value = this.f10943a.getValue();
            s0 s0Var = value.f10952a;
            value.f10953b = null;
            value.f10952a = (s0) obj;
            return s0Var;
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f10944a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f10944a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f10944a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f10944a.next();
            return next.getValue() instanceof e0 ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f10944a.remove();
        }
    }

    @Override // ma.f0
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // ma.f0
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
