/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Array
 *  java.util.AbstractSet
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NoSuchElementException
 *  java.util.Set
 */
package t;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import t.h;

public class a
extends h
implements Map {
    public a v;
    public c w;
    public e x;

    public a() {
    }

    public a(int n8) {
        super(n8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean n(Set set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            boolean bl;
            if (set.size() != object.size() || !(bl = set.containsAll((Collection)object))) return false;
            return true;
        }
        catch (ClassCastException | NullPointerException classCastException) {
            return false;
        }
    }

    public Set entrySet() {
        a a8;
        a a9 = a8 = this.v;
        if (a8 == null) {
            this.v = a9 = new a();
        }
        return a9;
    }

    public Set keySet() {
        c c8;
        c c9 = c8 = this.w;
        if (c8 == null) {
            this.w = c9 = new c();
        }
        return c9;
    }

    public boolean m(Collection collection) {
        collection = collection.iterator();
        while (collection.hasNext()) {
            if (this.containsKey(collection.next())) continue;
            return false;
        }
        return true;
    }

    public boolean o(Collection collection) {
        int n8 = this.q;
        collection = collection.iterator();
        while (collection.hasNext()) {
            this.remove(collection.next());
        }
        if (n8 != this.q) {
            return true;
        }
        return false;
    }

    public boolean p(Collection collection) {
        int n8 = this.q;
        for (int i8 = n8 - 1; i8 >= 0; --i8) {
            if (collection.contains(this.i(i8))) continue;
            this.j(i8);
        }
        if (n8 != this.q) {
            return true;
        }
        return false;
    }

    public void putAll(Map map) {
        this.c(this.q + map.size());
        for (Map.Entry entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public Object[] q(Object[] arrobject, int n8) {
        int n9 = this.q;
        Object[] arrobject2 = arrobject;
        if (arrobject.length < n9) {
            arrobject2 = (Object[])Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)n9);
        }
        for (int i8 = 0; i8 < n9; ++i8) {
            arrobject2[i8] = this.p[(i8 << 1) + n8];
        }
        if (arrobject2.length > n9) {
            arrobject2[n9] = null;
        }
        return arrobject2;
    }

    public Collection values() {
        e e8;
        e e9 = e8 = this.x;
        if (e8 == null) {
            this.x = e9 = new e();
        }
        return e9;
    }

    public final class a
    extends AbstractSet {
        public Iterator iterator() {
            return new d();
        }

        public int size() {
            return a.this.q;
        }
    }

    public final class b
    extends t.e {
        public b() {
            super(a.this.q);
        }

        @Override
        public Object b(int n8) {
            return a.this.i(n8);
        }

        @Override
        public void d(int n8) {
            a.this.j(n8);
        }
    }

    public final class c
    implements Set {
        public boolean add(Object object) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            a.this.clear();
        }

        public boolean contains(Object object) {
            return a.this.containsKey(object);
        }

        public boolean containsAll(Collection collection) {
            return a.this.m(collection);
        }

        public boolean equals(Object object) {
            return a.n(this, object);
        }

        public int hashCode() {
            int n8 = 0;
            for (int i8 = a.this.q - 1; i8 >= 0; --i8) {
                Object object = a.this.i(i8);
                int n9 = object == null ? 0 : object.hashCode();
                n8 += n9;
            }
            return n8;
        }

        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        public Iterator iterator() {
            return new b();
        }

        public boolean remove(Object object) {
            int n8 = a.this.f(object);
            if (n8 >= 0) {
                a.this.j(n8);
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection collection) {
            return a.this.o(collection);
        }

        public boolean retainAll(Collection collection) {
            return a.this.p(collection);
        }

        public int size() {
            return a.this.q;
        }

        public Object[] toArray() {
            int n8 = a.this.q;
            Object[] arrobject = new Object[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                arrobject[i8] = a.this.i(i8);
            }
            return arrobject;
        }

        public Object[] toArray(Object[] arrobject) {
            return a.this.q(arrobject, 0);
        }
    }

    public final class d
    implements Iterator,
    Map.Entry {
        public int o;
        public int p;
        public boolean q;

        public d() {
            this.o = a.this.q - 1;
            this.p = -1;
        }

        public Map.Entry b() {
            if (this.hasNext()) {
                ++this.p;
                this.q = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object object) {
            if (this.q) {
                boolean bl = object instanceof Map.Entry;
                boolean bl2 = false;
                if (!bl) {
                    return false;
                }
                object = (Map.Entry)object;
                bl = bl2;
                if (t.d.c(object.getKey(), a.this.i(this.p))) {
                    bl = bl2;
                    if (t.d.c(object.getValue(), a.this.l(this.p))) {
                        bl = true;
                    }
                }
                return bl;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object getKey() {
            if (this.q) {
                return a.this.i(this.p);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object getValue() {
            if (this.q) {
                return a.this.l(this.p);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            if (this.p < this.o) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.q) {
                Object object = a.this.i(this.p);
                Object object2 = a.this.l(this.p);
                int n8 = 0;
                int n9 = object == null ? 0 : object.hashCode();
                if (object2 != null) {
                    n8 = object2.hashCode();
                }
                return n9 ^ n8;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.q) {
                a.this.j(this.p);
                --this.p;
                --this.o;
                this.q = false;
                return;
            }
            throw new IllegalStateException();
        }

        public Object setValue(Object object) {
            if (this.q) {
                return a.this.k(this.p, object);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getKey());
            stringBuilder.append("=");
            stringBuilder.append(this.getValue());
            return stringBuilder.toString();
        }
    }

    public final class e
    implements Collection {
        public boolean add(Object object) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            a.this.clear();
        }

        public boolean contains(Object object) {
            if (a.this.h(object) >= 0) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            collection = collection.iterator();
            while (collection.hasNext()) {
                if (this.contains(collection.next())) continue;
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        public Iterator iterator() {
            return new f();
        }

        public boolean remove(Object object) {
            int n8 = a.this.h(object);
            if (n8 >= 0) {
                a.this.j(n8);
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection collection) {
            int n8 = a.this.q;
            int n9 = 0;
            boolean bl = false;
            while (n9 < n8) {
                int n10 = n8;
                int n11 = n9;
                if (collection.contains(a.this.l(n9))) {
                    a.this.j(n9);
                    n11 = n9 - 1;
                    n10 = n8 - 1;
                    bl = true;
                }
                n9 = n11 + 1;
                n8 = n10;
            }
            return bl;
        }

        public boolean retainAll(Collection collection) {
            int n8 = a.this.q;
            int n9 = 0;
            boolean bl = false;
            while (n9 < n8) {
                int n10 = n8;
                int n11 = n9;
                if (!collection.contains(a.this.l(n9))) {
                    a.this.j(n9);
                    n11 = n9 - 1;
                    n10 = n8 - 1;
                    bl = true;
                }
                n9 = n11 + 1;
                n8 = n10;
            }
            return bl;
        }

        public int size() {
            return a.this.q;
        }

        public Object[] toArray() {
            int n8 = a.this.q;
            Object[] arrobject = new Object[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                arrobject[i8] = a.this.l(i8);
            }
            return arrobject;
        }

        public Object[] toArray(Object[] arrobject) {
            return a.this.q(arrobject, 1);
        }
    }

    public final class f
    extends t.e {
        public f() {
            super(a.this.q);
        }

        @Override
        public Object b(int n8) {
            return a.this.l(n8);
        }

        @Override
        public void d(int n8) {
            a.this.j(n8);
        }
    }

}

