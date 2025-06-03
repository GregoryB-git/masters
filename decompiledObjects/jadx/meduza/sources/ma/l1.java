package ma;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class l1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f11037o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f11038a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11041d;

    /* renamed from: e, reason: collision with root package name */
    public volatile l1<K, V>.d f11042e;

    /* renamed from: b, reason: collision with root package name */
    public List<l1<K, V>.b> f11039b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public Map<K, V> f11040c = Collections.emptyMap();
    public Map<K, V> f = Collections.emptyMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0165a f11043a = new C0165a();

        /* renamed from: b, reason: collision with root package name */
        public static final b f11044b = new b();

        /* renamed from: ma.l1$a$a, reason: collision with other inner class name */
        public class C0165a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f11043a;
            }
        }
    }

    public class b implements Map.Entry<K, V>, Comparable<l1<K, V>.b> {

        /* renamed from: a, reason: collision with root package name */
        public final K f11045a;

        /* renamed from: b, reason: collision with root package name */
        public V f11046b;

        public b() {
            throw null;
        }

        public b(K k10, V v10) {
            this.f11045a = k10;
            this.f11046b = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f11045a.compareTo(((b) obj).f11045a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f11045a;
            Object key = entry.getKey();
            if (k10 == null ? key == null : k10.equals(key)) {
                V v10 = this.f11046b;
                Object value = entry.getValue();
                if (v10 == null ? value == null : v10.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f11045a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f11046b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f11045a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f11046b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            l1 l1Var = l1.this;
            int i10 = l1.f11037o;
            l1Var.c();
            V v11 = this.f11046b;
            this.f11046b = v10;
            return v11;
        }

        public final String toString() {
            return this.f11045a + "=" + this.f11046b;
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f11048a = -1;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11049b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f11050c;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f11050c == null) {
                this.f11050c = l1.this.f11040c.entrySet().iterator();
            }
            return this.f11050c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f11048a + 1 >= l1.this.f11039b.size()) {
                return !l1.this.f11040c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f11049b = true;
            int i10 = this.f11048a + 1;
            this.f11048a = i10;
            return i10 < l1.this.f11039b.size() ? l1.this.f11039b.get(this.f11048a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f11049b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f11049b = false;
            l1 l1Var = l1.this;
            int i10 = l1.f11037o;
            l1Var.c();
            if (this.f11048a >= l1.this.f11039b.size()) {
                a().remove();
                return;
            }
            l1 l1Var2 = l1.this;
            int i11 = this.f11048a;
            this.f11048a = i11 - 1;
            l1Var2.j(i11);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            l1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            l1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = l1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            l1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return l1.this.size();
        }
    }

    public l1(int i10) {
        this.f11038a = i10;
    }

    public final int b(K k10) {
        int size = this.f11039b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f11039b.get(size).f11045a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f11039b.get(i11).f11045a);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    public final void c() {
        if (this.f11041d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f11039b.isEmpty()) {
            this.f11039b.clear();
        }
        if (this.f11040c.isEmpty()) {
            return;
        }
        this.f11040c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f11040c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f11039b.get(i10);
    }

    public final int e() {
        return this.f11039b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f11042e == null) {
            this.f11042e = new d();
        }
        return this.f11042e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return super.equals(obj);
        }
        l1 l1Var = (l1) obj;
        int size = size();
        if (size != l1Var.size()) {
            return false;
        }
        int e10 = e();
        if (e10 != l1Var.e()) {
            return entrySet().equals(l1Var.entrySet());
        }
        for (int i10 = 0; i10 < e10; i10++) {
            if (!d(i10).equals(l1Var.d(i10))) {
                return false;
            }
        }
        if (e10 != size) {
            return this.f11040c.equals(l1Var.f11040c);
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        return this.f11040c.isEmpty() ? a.f11044b : this.f11040c.entrySet();
    }

    public final SortedMap<K, V> g() {
        c();
        if (this.f11040c.isEmpty() && !(this.f11040c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11040c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.f11040c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        return b10 >= 0 ? this.f11039b.get(b10).f11046b : this.f11040c.get(comparable);
    }

    public void h() {
        if (this.f11041d) {
            return;
        }
        this.f11040c = this.f11040c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11040c);
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.f11041d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int e10 = e();
        int i10 = 0;
        for (int i11 = 0; i11 < e10; i11++) {
            i10 += this.f11039b.get(i11).hashCode();
        }
        return this.f11040c.size() > 0 ? i10 + this.f11040c.hashCode() : i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        c();
        int b10 = b(k10);
        if (b10 >= 0) {
            return this.f11039b.get(b10).setValue(v10);
        }
        c();
        if (this.f11039b.isEmpty() && !(this.f11039b instanceof ArrayList)) {
            this.f11039b = new ArrayList(this.f11038a);
        }
        int i10 = -(b10 + 1);
        if (i10 >= this.f11038a) {
            return g().put(k10, v10);
        }
        int size = this.f11039b.size();
        int i11 = this.f11038a;
        if (size == i11) {
            l1<K, V>.b remove = this.f11039b.remove(i11 - 1);
            g().put(remove.f11045a, remove.f11046b);
        }
        this.f11039b.add(i10, new b(k10, v10));
        return null;
    }

    public final V j(int i10) {
        c();
        V v10 = this.f11039b.remove(i10).f11046b;
        if (!this.f11040c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<l1<K, V>.b> list = this.f11039b;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        if (b10 >= 0) {
            return (V) j(b10);
        }
        if (this.f11040c.isEmpty()) {
            return null;
        }
        return this.f11040c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11040c.size() + this.f11039b.size();
    }
}
