package t8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c<K, V> implements Iterable<Map.Entry<K, V>> {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e0.e f14649a = new e0.e(24);

        /* renamed from: t8.c$a$a, reason: collision with other inner class name */
        public interface InterfaceC0231a<C, D> {
        }
    }

    public abstract boolean a(K k10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!i().equals(cVar.i()) || size() != cVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract V h(K k10);

    public final int hashCode() {
        int hashCode = i().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().hashCode();
        }
        return hashCode;
    }

    public abstract Comparator<K> i();

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    public abstract K k();

    public abstract K l();

    public abstract int m(j9.g gVar);

    public abstract c<K, V> n(K k10, V v10);

    public abstract Iterator<Map.Entry<K, V>> o(K k10);

    public abstract c<K, V> p(K k10);

    public abstract int size();

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        Iterator<Map.Entry<K, V>> it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append("(");
            sb2.append(next.getKey());
            sb2.append("=>");
            sb2.append(next.getValue());
            sb2.append(")");
        }
        sb2.append("};");
        return sb2.toString();
    }
}
