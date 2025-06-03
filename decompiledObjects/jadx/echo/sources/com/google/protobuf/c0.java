package com.google.protobuf;

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
public abstract class c0 extends AbstractMap {

    /* renamed from: o, reason: collision with root package name */
    public final int f12022o;

    /* renamed from: p, reason: collision with root package name */
    public List f12023p;

    /* renamed from: q, reason: collision with root package name */
    public Map f12024q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12025r;

    /* renamed from: s, reason: collision with root package name */
    public volatile g f12026s;

    /* renamed from: t, reason: collision with root package name */
    public Map f12027t;

    /* renamed from: u, reason: collision with root package name */
    public volatile c f12028u;

    public class a extends c0 {
        public a(int i7) {
            super(i7, null);
        }

        @Override // com.google.protobuf.c0
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
            return super.r((Comparable) obj, obj2);
        }
    }

    public class b implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public int f12029o;

        /* renamed from: p, reason: collision with root package name */
        public Iterator f12030p;

        public b() {
            this.f12029o = c0.this.f12023p.size();
        }

        public final Iterator b() {
            if (this.f12030p == null) {
                this.f12030p = c0.this.f12027t.entrySet().iterator();
            }
            return this.f12030p;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj;
            if (b().hasNext()) {
                obj = b().next();
            } else {
                List list = c0.this.f12023p;
                int i7 = this.f12029o - 1;
                this.f12029o = i7;
                obj = list.get(i7);
            }
            return (Map.Entry) obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i7 = this.f12029o;
            return (i7 > 0 && i7 <= c0.this.f12023p.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(c0 c0Var, a aVar) {
            this();
        }
    }

    public class c extends g {
        public c() {
            super(c0.this, null);
        }

        @Override // com.google.protobuf.c0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(c0.this, null);
        }

        public /* synthetic */ c(c0 c0Var, a aVar) {
            this();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator f12033a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f12034b = new b();

        public class a implements Iterator {
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

        public class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f12033a;
            }
        }

        public static Iterable b() {
            return f12034b;
        }
    }

    public class e implements Map.Entry, Comparable {

        /* renamed from: o, reason: collision with root package name */
        public final Comparable f12035o;

        /* renamed from: p, reason: collision with root package name */
        public Object f12036p;

        public e(Comparable comparable, Object obj) {
            this.f12035o = comparable;
            this.f12036p = obj;
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
            return e(this.f12035o, entry.getKey()) && e(this.f12036p, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f12036p;
        }

        @Override // java.util.Map.Entry
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f12035o;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f12035o;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f12036p;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            c0.this.g();
            Object obj2 = this.f12036p;
            this.f12036p = obj;
            return obj2;
        }

        public String toString() {
            return this.f12035o + "=" + this.f12036p;
        }

        public e(c0 c0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }
    }

    public class f implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public int f12038o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f12039p;

        /* renamed from: q, reason: collision with root package name */
        public Iterator f12040q;

        public f() {
            this.f12038o = -1;
        }

        public final Iterator b() {
            if (this.f12040q == null) {
                this.f12040q = c0.this.f12024q.entrySet().iterator();
            }
            return this.f12040q;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f12039p = true;
            int i7 = this.f12038o + 1;
            this.f12038o = i7;
            return (Map.Entry) (i7 < c0.this.f12023p.size() ? c0.this.f12023p.get(this.f12038o) : b().next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12038o + 1 >= c0.this.f12023p.size()) {
                return !c0.this.f12024q.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f12039p) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f12039p = false;
            c0.this.g();
            if (this.f12038o >= c0.this.f12023p.size()) {
                b().remove();
                return;
            }
            c0 c0Var = c0.this;
            int i7 = this.f12038o;
            this.f12038o = i7 - 1;
            c0Var.s(i7);
        }

        public /* synthetic */ f(c0 c0Var, a aVar) {
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
            c0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = c0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(c0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            c0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c0.this.size();
        }

        public /* synthetic */ g(c0 c0Var, a aVar) {
            this();
        }
    }

    public c0(int i7) {
        this.f12022o = i7;
        this.f12023p = Collections.emptyList();
        this.f12024q = Collections.emptyMap();
        this.f12027t = Collections.emptyMap();
    }

    public static c0 q(int i7) {
        return new a(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f12023p.isEmpty()) {
            this.f12023p.clear();
        }
        if (this.f12024q.isEmpty()) {
            return;
        }
        this.f12024q.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f12024q.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f12026s == null) {
            this.f12026s = new g(this, null);
        }
        return this.f12026s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        int size = size();
        if (size != c0Var.size()) {
            return false;
        }
        int k7 = k();
        if (k7 != c0Var.k()) {
            return entrySet().equals(c0Var.entrySet());
        }
        for (int i7 = 0; i7 < k7; i7++) {
            if (!j(i7).equals(c0Var.j(i7))) {
                return false;
            }
        }
        if (k7 != size) {
            return this.f12024q.equals(c0Var.f12024q);
        }
        return true;
    }

    public final int f(Comparable comparable) {
        int i7;
        int size = this.f12023p.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((e) this.f12023p.get(i8)).getKey());
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
            int compareTo2 = comparable.compareTo(((e) this.f12023p.get(i10)).getKey());
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
        if (this.f12025r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f7 = f(comparable);
        return f7 >= 0 ? ((e) this.f12023p.get(f7)).getValue() : this.f12024q.get(comparable);
    }

    public Set h() {
        if (this.f12028u == null) {
            this.f12028u = new c(this, null);
        }
        return this.f12028u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k7 = k();
        int i7 = 0;
        for (int i8 = 0; i8 < k7; i8++) {
            i7 += ((e) this.f12023p.get(i8)).hashCode();
        }
        return l() > 0 ? i7 + this.f12024q.hashCode() : i7;
    }

    public final void i() {
        g();
        if (!this.f12023p.isEmpty() || (this.f12023p instanceof ArrayList)) {
            return;
        }
        this.f12023p = new ArrayList(this.f12022o);
    }

    public Map.Entry j(int i7) {
        return (Map.Entry) this.f12023p.get(i7);
    }

    public int k() {
        return this.f12023p.size();
    }

    public int l() {
        return this.f12024q.size();
    }

    public Iterable m() {
        return this.f12024q.isEmpty() ? d.b() : this.f12024q.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f12024q.isEmpty() && !(this.f12024q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12024q = treeMap;
            this.f12027t = treeMap.descendingMap();
        }
        return (SortedMap) this.f12024q;
    }

    public boolean o() {
        return this.f12025r;
    }

    public void p() {
        if (this.f12025r) {
            return;
        }
        this.f12024q = this.f12024q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f12024q);
        this.f12027t = this.f12027t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f12027t);
        this.f12025r = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int f7 = f(comparable);
        if (f7 >= 0) {
            return ((e) this.f12023p.get(f7)).setValue(obj);
        }
        i();
        int i7 = -(f7 + 1);
        if (i7 >= this.f12022o) {
            return n().put(comparable, obj);
        }
        int size = this.f12023p.size();
        int i8 = this.f12022o;
        if (size == i8) {
            e eVar = (e) this.f12023p.remove(i8 - 1);
            n().put(eVar.getKey(), eVar.getValue());
        }
        this.f12023p.add(i7, new e(comparable, obj));
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
        if (this.f12024q.isEmpty()) {
            return null;
        }
        return this.f12024q.remove(comparable);
    }

    public final Object s(int i7) {
        g();
        Object value = ((e) this.f12023p.remove(i7)).getValue();
        if (!this.f12024q.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f12023p.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f12023p.size() + this.f12024q.size();
    }

    public /* synthetic */ c0(int i7, a aVar) {
        this(i7);
    }
}
