package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public g<K, V>.b f13480a;

    /* renamed from: b, reason: collision with root package name */
    public g<K, V>.c f13481b;

    /* renamed from: c, reason: collision with root package name */
    public g<K, V>.e f13482c;

    public final class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f13483a;

        /* renamed from: b, reason: collision with root package name */
        public int f13484b;

        /* renamed from: c, reason: collision with root package name */
        public int f13485c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f13486d = false;

        public a(int i10) {
            this.f13483a = i10;
            this.f13484b = g.this.d();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f13485c < this.f13484b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) g.this.b(this.f13485c, this.f13483a);
            this.f13485c++;
            this.f13486d = true;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f13486d) {
                throw new IllegalStateException();
            }
            int i10 = this.f13485c - 1;
            this.f13485c = i10;
            this.f13484b--;
            this.f13486d = false;
            g.this.h(i10);
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = g.this.d();
            for (Map.Entry<K, V> entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return d10 != g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = g.this.e(entry.getKey());
            if (e10 < 0) {
                return false;
            }
            Object b10 = g.this.b(e10, 1);
            Object value = entry.getValue();
            return b10 == value || (b10 != null && b10.equals(value));
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i10 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                Object b11 = g.this.b(d10, 1);
                i10 += (b10 == null ? 0 : b10.hashCode()) ^ (b11 == null ? 0 : b11.hashCode());
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> c10 = g.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!c10.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i10 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                i10 += b10 == null ? 0 : b10.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int e10 = g.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            g.this.h(e10);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> c10 = g.this.c();
            int size = c10.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                c10.remove(it.next());
            }
            return size != c10.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return g.k(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            g gVar = g.this;
            int d10 = gVar.d();
            Object[] objArr = new Object[d10];
            for (int i10 = 0; i10 < d10; i10++) {
                objArr[i10] = gVar.b(i10, 0);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.l(0, tArr);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public int f13490a;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13492c = false;

        /* renamed from: b, reason: collision with root package name */
        public int f13491b = -1;

        public d() {
            this.f13490a = g.this.d() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f13492c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object b10 = g.this.b(this.f13491b, 0);
            if (!(key == b10 || (key != null && key.equals(b10)))) {
                return false;
            }
            Object value = entry.getValue();
            Object b11 = g.this.b(this.f13491b, 1);
            return value == b11 || (value != null && value.equals(b11));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f13492c) {
                return (K) g.this.b(this.f13491b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f13492c) {
                return (V) g.this.b(this.f13491b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f13491b < this.f13490a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f13492c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object b10 = g.this.b(this.f13491b, 0);
            Object b11 = g.this.b(this.f13491b, 1);
            return (b10 == null ? 0 : b10.hashCode()) ^ (b11 != null ? b11.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f13491b++;
            this.f13492c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f13492c) {
                throw new IllegalStateException();
            }
            g.this.h(this.f13491b);
            this.f13491b--;
            this.f13490a--;
            this.f13492c = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (this.f13492c) {
                return (V) g.this.i(this.f13491b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int f = g.this.f(obj);
            if (f < 0) {
                return false;
            }
            g.this.h(f);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (!collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            g gVar = g.this;
            int d10 = gVar.d();
            Object[] objArr = new Object[d10];
            for (int i10 = 0; i10 < d10; i10++) {
                objArr[i10] = gVar.b(i10, 1);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.l(1, tArr);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i10, int i11);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k10, V v10);

    public abstract void h(int i10);

    public abstract V i(int i10, V v10);

    public final Object[] l(int i10, Object[] objArr) {
        int d10 = d();
        if (objArr.length < d10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        if (objArr.length > d10) {
            objArr[d10] = null;
        }
        return objArr;
    }
}
