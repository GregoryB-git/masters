package t;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1958a extends h implements Map {

    /* renamed from: v, reason: collision with root package name */
    public C0269a f19351v;

    /* renamed from: w, reason: collision with root package name */
    public c f19352w;

    /* renamed from: x, reason: collision with root package name */
    public e f19353x;

    /* renamed from: t.a$a, reason: collision with other inner class name */
    public final class C0269a extends AbstractSet {
        public C0269a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C1958a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1958a.this.f19402q;
        }
    }

    /* renamed from: t.a$b */
    public final class b extends t.e {
        public b() {
            super(C1958a.this.f19402q);
        }

        @Override // t.e
        public Object b(int i7) {
            return C1958a.this.i(i7);
        }

        @Override // t.e
        public void d(int i7) {
            C1958a.this.j(i7);
        }
    }

    /* renamed from: t.a$c */
    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C1958a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C1958a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C1958a.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C1958a.n(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i7 = 0;
            for (int i8 = C1958a.this.f19402q - 1; i8 >= 0; i8--) {
                Object i9 = C1958a.this.i(i8);
                i7 += i9 == null ? 0 : i9.hashCode();
            }
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C1958a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C1958a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int f7 = C1958a.this.f(obj);
            if (f7 < 0) {
                return false;
            }
            C1958a.this.j(f7);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C1958a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C1958a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C1958a.this.f19402q;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int i7 = C1958a.this.f19402q;
            Object[] objArr = new Object[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                objArr[i8] = C1958a.this.i(i8);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return C1958a.this.q(objArr, 0);
        }
    }

    /* renamed from: t.a$d */
    public final class d implements Iterator, Map.Entry {

        /* renamed from: o, reason: collision with root package name */
        public int f19357o;

        /* renamed from: p, reason: collision with root package name */
        public int f19358p = -1;

        /* renamed from: q, reason: collision with root package name */
        public boolean f19359q;

        public d() {
            this.f19357o = C1958a.this.f19402q - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f19358p++;
            this.f19359q = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f19359q) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return t.d.c(entry.getKey(), C1958a.this.i(this.f19358p)) && t.d.c(entry.getValue(), C1958a.this.l(this.f19358p));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f19359q) {
                return C1958a.this.i(this.f19358p);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f19359q) {
                return C1958a.this.l(this.f19358p);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19358p < this.f19357o;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f19359q) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object i7 = C1958a.this.i(this.f19358p);
            Object l7 = C1958a.this.l(this.f19358p);
            return (i7 == null ? 0 : i7.hashCode()) ^ (l7 != null ? l7.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f19359q) {
                throw new IllegalStateException();
            }
            C1958a.this.j(this.f19358p);
            this.f19358p--;
            this.f19357o--;
            this.f19359q = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f19359q) {
                return C1958a.this.k(this.f19358p, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: t.a$e */
    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C1958a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C1958a.this.h(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C1958a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C1958a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int h7 = C1958a.this.h(obj);
            if (h7 < 0) {
                return false;
            }
            C1958a.this.j(h7);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int i7 = C1958a.this.f19402q;
            int i8 = 0;
            boolean z7 = false;
            while (i8 < i7) {
                if (collection.contains(C1958a.this.l(i8))) {
                    C1958a.this.j(i8);
                    i8--;
                    i7--;
                    z7 = true;
                }
                i8++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int i7 = C1958a.this.f19402q;
            int i8 = 0;
            boolean z7 = false;
            while (i8 < i7) {
                if (!collection.contains(C1958a.this.l(i8))) {
                    C1958a.this.j(i8);
                    i8--;
                    i7--;
                    z7 = true;
                }
                i8++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public int size() {
            return C1958a.this.f19402q;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int i7 = C1958a.this.f19402q;
            Object[] objArr = new Object[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                objArr[i8] = C1958a.this.l(i8);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return C1958a.this.q(objArr, 1);
        }
    }

    /* renamed from: t.a$f */
    public final class f extends t.e {
        public f() {
            super(C1958a.this.f19402q);
        }

        @Override // t.e
        public Object b(int i7) {
            return C1958a.this.l(i7);
        }

        @Override // t.e
        public void d(int i7) {
            C1958a.this.j(i7);
        }
    }

    public C1958a() {
    }

    public static boolean n(Set set, Object obj) {
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

    @Override // java.util.Map
    public Set entrySet() {
        C0269a c0269a = this.f19351v;
        if (c0269a != null) {
            return c0269a;
        }
        C0269a c0269a2 = new C0269a();
        this.f19351v = c0269a2;
        return c0269a2;
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f19352w;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f19352w = cVar2;
        return cVar2;
    }

    public boolean m(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean o(Collection collection) {
        int i7 = this.f19402q;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i7 != this.f19402q;
    }

    public boolean p(Collection collection) {
        int i7 = this.f19402q;
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (!collection.contains(i(i8))) {
                j(i8);
            }
        }
        return i7 != this.f19402q;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f19402q + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Object[] q(Object[] objArr, int i7) {
        int i8 = this.f19402q;
        if (objArr.length < i8) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i8);
        }
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = this.f19401p[(i9 << 1) + i7];
        }
        if (objArr.length > i8) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f19353x;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f19353x = eVar2;
        return eVar2;
    }

    public C1958a(int i7) {
        super(i7);
    }
}
