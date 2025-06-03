/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractMap
 *  java.util.AbstractSet
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NavigableMap
 *  java.util.NoSuchElementException
 *  java.util.Set
 *  java.util.SortedMap
 *  java.util.TreeMap
 */
package androidx.datastore.preferences.protobuf;

import android.support.v4.media.a;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class h0
extends AbstractMap {
    public final int o;
    public List p;
    public Map q;
    public boolean r;
    public volatile g s;
    public Map t;
    public volatile c u;

    public h0(int n8) {
        this.o = n8;
        this.p = Collections.emptyList();
        this.q = Collections.emptyMap();
        this.t = Collections.emptyMap();
    }

    public /* synthetic */ h0(int n8,  a8) {
        this(n8);
    }

    public static h0 q(int n8) {
        return new h0(n8){

            @Override
            public void p() {
                if (!this.o()) {
                    if (this.k() <= 0) {
                        Iterator iterator = this.m().iterator();
                        if (iterator.hasNext()) {
                            a.a(((Map.Entry)iterator.next()).getKey());
                            throw null;
                        }
                    } else {
                        a.a(this.j(0).getKey());
                        throw null;
                    }
                }
                super.p();
            }
        };
    }

    public void clear() {
        this.g();
        if (!this.p.isEmpty()) {
            this.p.clear();
        }
        if (!this.q.isEmpty()) {
            this.q.clear();
        }
    }

    public boolean containsKey(Object object) {
        if (this.f((Comparable)(object = (Comparable)object)) < 0 && !this.q.containsKey(object)) {
            return false;
        }
        return true;
    }

    public Set entrySet() {
        if (this.s == null) {
            this.s = new g(null);
        }
        return this.s;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h0)) {
            return super.equals(object);
        }
        object = (h0)((Object)object);
        int n8 = this.size();
        if (n8 != object.size()) {
            return false;
        }
        int n9 = this.k();
        if (n9 != object.k()) {
            return this.entrySet().equals((Object)object.entrySet());
        }
        for (int i8 = 0; i8 < n9; ++i8) {
            if (this.j(i8).equals((Object)object.j(i8))) continue;
            return false;
        }
        if (n9 != n8) {
            return this.q.equals((Object)object.q);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int f(Comparable comparable) {
        int n8;
        int n9 = this.p.size();
        int n10 = n9 - 1;
        if (n10 >= 0) {
            n8 = comparable.compareTo((Object)((e)this.p.get(n10)).h());
            if (n8 > 0) {
                n10 = n9 + 1;
                do {
                    return - n10;
                    break;
                } while (true);
            }
            if (n8 == 0) {
                return n10;
            }
        }
        n9 = 0;
        while (n9 <= n10) {
            n8 = (n9 + n10) / 2;
            int n11 = comparable.compareTo((Object)((e)this.p.get(n8)).h());
            if (n11 < 0) {
                n10 = n8 - 1;
                continue;
            }
            if (n11 <= 0) return n8;
            n9 = n8 + 1;
        }
        n10 = n9 + 1;
        return - n10;
    }

    public final void g() {
        if (!this.r) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public Object get(Object object) {
        int n8 = this.f((Comparable)(object = (Comparable)object));
        if (n8 >= 0) {
            return ((e)this.p.get(n8)).getValue();
        }
        return this.q.get(object);
    }

    public Set h() {
        if (this.u == null) {
            this.u = new c(null);
        }
        return this.u;
    }

    public int hashCode() {
        int n8;
        int n9 = this.k();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n10 += ((e)this.p.get(n8)).hashCode();
        }
        n8 = n10;
        if (this.l() > 0) {
            n8 = n10 + this.q.hashCode();
        }
        return n8;
    }

    public final void i() {
        this.g();
        if (this.p.isEmpty() && !(this.p instanceof ArrayList)) {
            this.p = new ArrayList(this.o);
        }
    }

    public Map.Entry j(int n8) {
        return (Map.Entry)this.p.get(n8);
    }

    public int k() {
        return this.p.size();
    }

    public int l() {
        return this.q.size();
    }

    public Iterable m() {
        if (this.q.isEmpty()) {
            return d.b();
        }
        return this.q.entrySet();
    }

    public final SortedMap n() {
        this.g();
        if (this.q.isEmpty() && !(this.q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.q = treeMap;
            this.t = treeMap.descendingMap();
        }
        return (SortedMap)this.q;
    }

    public boolean o() {
        return this.r;
    }

    public void p() {
        if (!this.r) {
            Map map = this.q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap((Map)this.q);
            this.q = map;
            map = this.t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap((Map)this.t);
            this.t = map;
            this.r = true;
        }
    }

    public Object r(Comparable comparable, Object object) {
        int n8;
        this.g();
        int n9 = this.f(comparable);
        if (n9 >= 0) {
            return ((e)this.p.get(n9)).setValue(object);
        }
        this.i();
        n9 = - n9 + 1;
        if (n9 >= this.o) {
            return this.n().put((Object)comparable, object);
        }
        int n10 = this.p.size();
        if (n10 == (n8 = this.o)) {
            e e8 = (e)this.p.remove(n8 - 1);
            this.n().put((Object)e8.h(), e8.getValue());
        }
        this.p.add(n9, (Object)new e(comparable, object));
        return null;
    }

    public Object remove(Object object) {
        this.g();
        object = (Comparable)object;
        int n8 = this.f((Comparable)object);
        if (n8 >= 0) {
            return this.s(n8);
        }
        if (this.q.isEmpty()) {
            return null;
        }
        return this.q.remove(object);
    }

    public final Object s(int n8) {
        this.g();
        Object object = ((e)this.p.remove(n8)).getValue();
        if (!this.q.isEmpty()) {
            Iterator iterator = this.n().entrySet().iterator();
            this.p.add((Object)new e((Map.Entry)iterator.next()));
            iterator.remove();
        }
        return object;
    }

    public int size() {
        return this.p.size() + this.q.size();
    }

    public class b
    implements Iterator {
        public int o;
        public Iterator p;

        public b() {
            this.o = h0.this.p.size();
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public final Iterator b() {
            if (this.p == null) {
                this.p = h0.this.t.entrySet().iterator();
            }
            return this.p;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public Map.Entry d() {
            int n8;
            Object object;
            if (this.b().hasNext()) {
                object = this.b().next();
                do {
                    return (Map.Entry)object;
                    break;
                } while (true);
            }
            object = h0.this.p;
            this.o = n8 = this.o - 1;
            object = object.get(n8);
            return (Map.Entry)object;
        }

        public boolean hasNext() {
            int n8 = this.o;
            if (n8 > 0 && n8 <= h0.this.p.size() || this.b().hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class c
    extends g {
        public c() {
            super(null);
        }

        public /* synthetic */ c( a8) {
            this();
        }

        @Override
        public Iterator iterator() {
            return new b(null);
        }
    }

    public static abstract class d {
        public static final Iterator a = new Iterator(){

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        public static final Iterable b = new Iterable(){

            public Iterator iterator() {
                return a;
            }
        };

        public static Iterable b() {
            return b;
        }

    }

    public class e
    implements Map.Entry,
    Comparable {
        public final Comparable o;
        public Object p;

        public e(Comparable comparable, Object object) {
            this.o = comparable;
            this.p = object;
        }

        public e(Map.Entry entry) {
            this((Comparable)entry.getKey(), entry.getValue());
        }

        public int c(e e8) {
            return this.h().compareTo((Object)e8.h());
        }

        public final boolean e(Object object, Object object2) {
            if (object == null) {
                if (object2 == null) {
                    return true;
                }
                return false;
            }
            return object.equals(object2);
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            if (this.e((Object)this.o, (object = (Map.Entry)object).getKey()) && this.e(this.p, object.getValue())) {
                return true;
            }
            return false;
        }

        public Object getValue() {
            return this.p;
        }

        public Comparable h() {
            return this.o;
        }

        public int hashCode() {
            Object object = this.o;
            int n8 = 0;
            int n9 = object == null ? 0 : object.hashCode();
            object = this.p;
            if (object != null) {
                n8 = object.hashCode();
            }
            return n9 ^ n8;
        }

        public Object setValue(Object object) {
            h0.this.g();
            Object object2 = this.p;
            this.p = object;
            return object2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)this.o);
            stringBuilder.append("=");
            stringBuilder.append(this.p);
            return stringBuilder.toString();
        }
    }

    public class f
    implements Iterator {
        public int o;
        public boolean p;
        public Iterator q;

        public f() {
            this.o = -1;
        }

        public /* synthetic */ f( a8) {
            this();
        }

        public final Iterator b() {
            if (this.q == null) {
                this.q = h0.this.q.entrySet().iterator();
            }
            return this.q;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public Map.Entry d() {
            int n8;
            Object object;
            this.p = true;
            this.o = n8 = this.o + 1;
            if (n8 < h0.this.p.size()) {
                object = h0.this.p.get(this.o);
                do {
                    return (Map.Entry)object;
                    break;
                } while (true);
            }
            object = this.b().next();
            return (Map.Entry)object;
        }

        public boolean hasNext() {
            int n8 = this.o;
            boolean bl = true;
            if (n8 + 1 >= h0.this.p.size()) {
                if (!h0.this.q.isEmpty() && this.b().hasNext()) {
                    return true;
                }
                bl = false;
            }
            return bl;
        }

        public void remove() {
            if (this.p) {
                this.p = false;
                h0.this.g();
                if (this.o < h0.this.p.size()) {
                    h0 h02 = h0.this;
                    int n8 = this.o;
                    this.o = n8 - 1;
                    h02.s(n8);
                    return;
                }
                this.b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    public class g
    extends AbstractSet {
        public g() {
        }

        public /* synthetic */ g( a8) {
            this();
        }

        public boolean a(Map.Entry entry) {
            if (!this.contains((Object)entry)) {
                h0.this.r((Comparable)entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        public void clear() {
            h0.this.clear();
        }

        public boolean contains(Object object) {
            Object object2 = (Map.Entry)object;
            object = h0.this.get(object2.getKey());
            if (!(object == (object2 = object2.getValue()) || object != null && object.equals(object2))) {
                return false;
            }
            return true;
        }

        public Iterator iterator() {
            return new f(null);
        }

        public boolean remove(Object object) {
            if (this.contains(object = (Map.Entry)object)) {
                h0.this.remove(object.getKey());
                return true;
            }
            return false;
        }

        public int size() {
            return h0.this.size();
        }
    }

}

