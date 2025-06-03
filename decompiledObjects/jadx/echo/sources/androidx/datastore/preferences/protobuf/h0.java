package androidx.datastore.preferences.protobuf;

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
public abstract class h0 extends AbstractMap {

    /* renamed from: o, reason: collision with root package name */
    public final int f8986o;

    /* renamed from: p, reason: collision with root package name */
    public List f8987p;

    /* renamed from: q, reason: collision with root package name */
    public Map f8988q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8989r;

    /* renamed from: s, reason: collision with root package name */
    public volatile g f8990s;

    /* renamed from: t, reason: collision with root package name */
    public Map f8991t;

    /* renamed from: u, reason: collision with root package name */
    public volatile c f8992u;

    public static class a extends h0 {
        public a(int i7) {
            super(i7, null);
        }

        @Override // androidx.datastore.preferences.protobuf.h0
        public void p() {
            if (!o()) {
                if (k() > 0) {
                    android.support.v4.media.a.a(j(0).getKey());
                    throw null;
                }
                Iterator it = m().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            return super.r(null, obj2);
        }
    }

    public class b implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public int f8993o;

        /* renamed from: p, reason: collision with root package name */
        public Iterator f8994p;

        public b() {
            this.f8993o = h0.this.f8987p.size();
        }

        public final Iterator b() {
            if (this.f8994p == null) {
                this.f8994p = h0.this.f8991t.entrySet().iterator();
            }
            return this.f8994p;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj;
            if (b().hasNext()) {
                obj = b().next();
            } else {
                List list = h0.this.f8987p;
                int i7 = this.f8993o - 1;
                this.f8993o = i7;
                obj = list.get(i7);
            }
            return (Map.Entry) obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i7 = this.f8993o;
            return (i7 > 0 && i7 <= h0.this.f8987p.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(h0 h0Var, a aVar) {
            this();
        }
    }

    public class c extends g {
        public c() {
            super(h0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.h0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(h0.this, null);
        }

        public /* synthetic */ c(h0 h0Var, a aVar) {
            this();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator f8997a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f8998b = new b();

        public static class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f8997a;
            }
        }

        public static Iterable b() {
            return f8998b;
        }
    }

    public class e implements Map.Entry, Comparable {

        /* renamed from: o, reason: collision with root package name */
        public final Comparable f8999o;

        /* renamed from: p, reason: collision with root package name */
        public Object f9000p;

        public e(Comparable comparable, Object obj) {
            this.f8999o = comparable;
            this.f9000p = obj;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public final boolean e(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e(this.f8999o, entry.getKey()) && e(this.f9000p, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f9000p;
        }

        @Override // java.util.Map.Entry
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f8999o;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f8999o;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f9000p;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            h0.this.g();
            Object obj2 = this.f9000p;
            this.f9000p = obj;
            return obj2;
        }

        public String toString() {
            return this.f8999o + "=" + this.f9000p;
        }

        public e(h0 h0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }
    }

    public class f implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public int f9002o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f9003p;

        /* renamed from: q, reason: collision with root package name */
        public Iterator f9004q;

        public f() {
            this.f9002o = -1;
        }

        public final Iterator b() {
            if (this.f9004q == null) {
                this.f9004q = h0.this.f8988q.entrySet().iterator();
            }
            return this.f9004q;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f9003p = true;
            int i7 = this.f9002o + 1;
            this.f9002o = i7;
            return (Map.Entry) (i7 < h0.this.f8987p.size() ? h0.this.f8987p.get(this.f9002o) : b().next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9002o + 1 >= h0.this.f8987p.size()) {
                return !h0.this.f8988q.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9003p) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f9003p = false;
            h0.this.g();
            if (this.f9002o >= h0.this.f8987p.size()) {
                b().remove();
                return;
            }
            h0 h0Var = h0.this;
            int i7 = this.f9002o;
            this.f9002o = i7 - 1;
            h0Var.s(i7);
        }

        public /* synthetic */ f(h0 h0Var, a aVar) {
            this();
        }
    }

    public class g extends AbstractSet {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            h0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(h0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            h0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h0.this.size();
        }

        public /* synthetic */ g(h0 h0Var, a aVar) {
            this();
        }
    }

    public h0(int i7) {
        this.f8986o = i7;
        this.f8987p = Collections.emptyList();
        this.f8988q = Collections.emptyMap();
        this.f8991t = Collections.emptyMap();
    }

    public static h0 q(int i7) {
        return new a(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f8987p.isEmpty()) {
            this.f8987p.clear();
        }
        if (this.f8988q.isEmpty()) {
            return;
        }
        this.f8988q.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f8988q.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f8990s == null) {
            this.f8990s = new g(this, null);
        }
        return this.f8990s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        int size = size();
        if (size != h0Var.size()) {
            return false;
        }
        int k7 = k();
        if (k7 != h0Var.k()) {
            return entrySet().equals(h0Var.entrySet());
        }
        for (int i7 = 0; i7 < k7; i7++) {
            if (!j(i7).equals(h0Var.j(i7))) {
                return false;
            }
        }
        if (k7 != size) {
            return this.f8988q.equals(h0Var.f8988q);
        }
        return true;
    }

    public final int f(Comparable comparable) {
        int i7;
        int size = this.f8987p.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((e) this.f8987p.get(i8)).getKey());
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((e) this.f8987p.get(i10)).getKey());
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        i7 = i9 + 1;
        return -i7;
    }

    public final void g() {
        if (this.f8989r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f7 = f(comparable);
        return f7 >= 0 ? ((e) this.f8987p.get(f7)).getValue() : this.f8988q.get(comparable);
    }

    public Set h() {
        if (this.f8992u == null) {
            this.f8992u = new c(this, null);
        }
        return this.f8992u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k7 = k();
        int i7 = 0;
        for (int i8 = 0; i8 < k7; i8++) {
            i7 += ((e) this.f8987p.get(i8)).hashCode();
        }
        return l() > 0 ? i7 + this.f8988q.hashCode() : i7;
    }

    public final void i() {
        g();
        if (!this.f8987p.isEmpty() || (this.f8987p instanceof ArrayList)) {
            return;
        }
        this.f8987p = new ArrayList(this.f8986o);
    }

    public Map.Entry j(int i7) {
        return (Map.Entry) this.f8987p.get(i7);
    }

    public int k() {
        return this.f8987p.size();
    }

    public int l() {
        return this.f8988q.size();
    }

    public Iterable m() {
        return this.f8988q.isEmpty() ? d.b() : this.f8988q.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f8988q.isEmpty() && !(this.f8988q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8988q = treeMap;
            this.f8991t = treeMap.descendingMap();
        }
        return (SortedMap) this.f8988q;
    }

    public boolean o() {
        return this.f8989r;
    }

    public void p() {
        if (this.f8989r) {
            return;
        }
        this.f8988q = this.f8988q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8988q);
        this.f8991t = this.f8991t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8991t);
        this.f8989r = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int f7 = f(comparable);
        if (f7 >= 0) {
            return ((e) this.f8987p.get(f7)).setValue(obj);
        }
        i();
        int i7 = -(f7 + 1);
        if (i7 >= this.f8986o) {
            return n().put(comparable, obj);
        }
        int size = this.f8987p.size();
        int i8 = this.f8986o;
        if (size == i8) {
            e eVar = (e) this.f8987p.remove(i8 - 1);
            n().put(eVar.getKey(), eVar.getValue());
        }
        this.f8987p.add(i7, new e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f7 = f(comparable);
        if (f7 >= 0) {
            return s(f7);
        }
        if (this.f8988q.isEmpty()) {
            return null;
        }
        return this.f8988q.remove(comparable);
    }

    public final Object s(int i7) {
        g();
        Object value = ((e) this.f8987p.remove(i7)).getValue();
        if (!this.f8988q.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f8987p.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f8987p.size() + this.f8988q.size();
    }

    public /* synthetic */ h0(int i7, a aVar) {
        this(i7);
    }
}
