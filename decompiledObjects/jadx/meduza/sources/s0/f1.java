package s0;

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
public class f1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f13966o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f13967a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13970d;

    /* renamed from: e, reason: collision with root package name */
    public volatile f1<K, V>.d f13971e;

    /* renamed from: b, reason: collision with root package name */
    public List<f1<K, V>.b> f13968b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public Map<K, V> f13969c = Collections.emptyMap();
    public Map<K, V> f = Collections.emptyMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0216a f13972a = new C0216a();

        /* renamed from: b, reason: collision with root package name */
        public static final b f13973b = new b();

        /* renamed from: s0.f1$a$a, reason: collision with other inner class name */
        public static class C0216a implements Iterator<Object> {
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

        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f13972a;
            }
        }
    }

    public class b implements Map.Entry<K, V>, Comparable<f1<K, V>.b> {

        /* renamed from: a, reason: collision with root package name */
        public final K f13974a;

        /* renamed from: b, reason: collision with root package name */
        public V f13975b;

        public b() {
            throw null;
        }

        public b(K k10, V v10) {
            this.f13974a = k10;
            this.f13975b = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f13974a.compareTo(((b) obj).f13974a);
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
            K k10 = this.f13974a;
            Object key = entry.getKey();
            if (k10 == null ? key == null : k10.equals(key)) {
                V v10 = this.f13975b;
                Object value = entry.getValue();
                if (v10 == null ? value == null : v10.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f13974a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f13975b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f13974a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f13975b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            f1 f1Var = f1.this;
            int i10 = f1.f13966o;
            f1Var.c();
            V v11 = this.f13975b;
            this.f13975b = v10;
            return v11;
        }

        public final String toString() {
            return this.f13974a + "=" + this.f13975b;
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f13977a = -1;

        /* renamed from: b, reason: collision with root package name */
        public boolean f13978b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f13979c;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f13979c == null) {
                this.f13979c = f1.this.f13969c.entrySet().iterator();
            }
            return this.f13979c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f13977a + 1 >= f1.this.f13968b.size()) {
                return !f1.this.f13969c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f13978b = true;
            int i10 = this.f13977a + 1;
            this.f13977a = i10;
            return i10 < f1.this.f13968b.size() ? f1.this.f13968b.get(this.f13977a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f13978b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f13978b = false;
            f1 f1Var = f1.this;
            int i10 = f1.f13966o;
            f1Var.c();
            if (this.f13977a >= f1.this.f13968b.size()) {
                a().remove();
                return;
            }
            f1 f1Var2 = f1.this;
            int i11 = this.f13977a;
            this.f13977a = i11 - 1;
            f1Var2.j(i11);
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
            f1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            f1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = f1.this.get(entry.getKey());
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
            f1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return f1.this.size();
        }
    }

    public f1(int i10) {
        this.f13967a = i10;
    }

    public final int b(K k10) {
        int size = this.f13968b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f13968b.get(size).f13974a);
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
            int compareTo2 = k10.compareTo(this.f13968b.get(i11).f13974a);
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
        if (this.f13970d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f13968b.isEmpty()) {
            this.f13968b.clear();
        }
        if (this.f13969c.isEmpty()) {
            return;
        }
        this.f13969c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f13969c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f13968b.get(i10);
    }

    public final int e() {
        return this.f13968b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f13971e == null) {
            this.f13971e = new d();
        }
        return this.f13971e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return super.equals(obj);
        }
        f1 f1Var = (f1) obj;
        int size = size();
        if (size != f1Var.size()) {
            return false;
        }
        int e10 = e();
        if (e10 != f1Var.e()) {
            return entrySet().equals(f1Var.entrySet());
        }
        for (int i10 = 0; i10 < e10; i10++) {
            if (!d(i10).equals(f1Var.d(i10))) {
                return false;
            }
        }
        if (e10 != size) {
            return this.f13969c.equals(f1Var.f13969c);
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        return this.f13969c.isEmpty() ? a.f13973b : this.f13969c.entrySet();
    }

    public final SortedMap<K, V> g() {
        c();
        if (this.f13969c.isEmpty() && !(this.f13969c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13969c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.f13969c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        return b10 >= 0 ? this.f13968b.get(b10).f13975b : this.f13969c.get(comparable);
    }

    public void h() {
        if (this.f13970d) {
            return;
        }
        this.f13969c = this.f13969c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f13969c);
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.f13970d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int e10 = e();
        int i10 = 0;
        for (int i11 = 0; i11 < e10; i11++) {
            i10 += this.f13968b.get(i11).hashCode();
        }
        return this.f13969c.size() > 0 ? i10 + this.f13969c.hashCode() : i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        c();
        int b10 = b(k10);
        if (b10 >= 0) {
            return this.f13968b.get(b10).setValue(v10);
        }
        c();
        if (this.f13968b.isEmpty() && !(this.f13968b instanceof ArrayList)) {
            this.f13968b = new ArrayList(this.f13967a);
        }
        int i10 = -(b10 + 1);
        if (i10 >= this.f13967a) {
            return g().put(k10, v10);
        }
        int size = this.f13968b.size();
        int i11 = this.f13967a;
        if (size == i11) {
            f1<K, V>.b remove = this.f13968b.remove(i11 - 1);
            g().put(remove.f13974a, remove.f13975b);
        }
        this.f13968b.add(i10, new b(k10, v10));
        return null;
    }

    public final V j(int i10) {
        c();
        V v10 = this.f13968b.remove(i10).f13975b;
        if (!this.f13969c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<f1<K, V>.b> list = this.f13968b;
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
        if (this.f13969c.isEmpty()) {
            return null;
        }
        return this.f13969c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13969c.size() + this.f13968b.size();
    }
}
