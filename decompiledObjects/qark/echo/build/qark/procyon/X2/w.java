// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Iterator;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Arrays;
import java.util.AbstractMap;
import java.util.Objects;
import java.util.Comparator;
import java.util.Set;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.SortedMap;
import java.util.Collection;
import java.io.Serializable;
import java.util.Map;

public abstract class w implements Map, Serializable
{
    public static final Entry[] r;
    private static final long serialVersionUID = 912559L;
    public transient y o;
    public transient y p;
    public transient t q;
    
    static {
        r = new Entry[0];
    }
    
    public static a a() {
        return new a();
    }
    
    public static w b(final Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection)iterable).size();
        }
        else {
            size = 4;
        }
        final a a = new a(size);
        a.h(iterable);
        return a.a();
    }
    
    public static w c(final Map map) {
        if (map instanceof w && !(map instanceof SortedMap)) {
            final w w = (w)map;
            if (!w.h()) {
                return w;
            }
        }
        return b(map.entrySet());
    }
    
    public static w j() {
        return T.v;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.get(o) != null;
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.k().contains(o);
    }
    
    public abstract y d();
    
    public abstract y e();
    
    @Override
    public boolean equals(final Object o) {
        return G.c(this, o);
    }
    
    public abstract t f();
    
    public y g() {
        y o;
        if ((o = this.o) == null) {
            o = this.d();
            this.o = o;
        }
        return o;
    }
    
    @Override
    public abstract Object get(final Object p0);
    
    @Override
    public final Object getOrDefault(Object value, final Object o) {
        value = this.get(value);
        if (value != null) {
            return value;
        }
        return o;
    }
    
    public abstract boolean h();
    
    @Override
    public int hashCode() {
        return a0.d(this.g());
    }
    
    public y i() {
        y p;
        if ((p = this.p) == null) {
            p = this.e();
            this.p = p;
        }
        return p;
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public t k() {
        t q;
        if ((q = this.q) == null) {
            q = this.f();
            this.q = q;
        }
        return q;
    }
    
    @Override
    public final Object put(final Object o, final Object o2) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void putAll(final Map map) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String toString() {
        return G.k(this);
    }
    
    public Object writeReplace() {
        return new b(this);
    }
    
    public static class a
    {
        public Comparator a;
        public Object[] b;
        public int c;
        public boolean d;
        public w.a.a e;
        
        public a() {
            this(4);
        }
        
        public a(final int n) {
            this.b = new Object[n * 2];
            this.c = 0;
            this.d = false;
        }
        
        public static void i(final Object[] array, final int toIndex, final Comparator comparator) {
            final Entry[] a = new Entry[toIndex];
            final int n = 0;
            for (int i = 0; i < toIndex; ++i) {
                final int n2 = i * 2;
                final Object o = array[n2];
                Objects.requireNonNull(o);
                final Object o2 = array[n2 + 1];
                Objects.requireNonNull(o2);
                a[i] = (Entry)new AbstractMap.SimpleImmutableEntry(o, o2);
            }
            Arrays.sort((Entry[])a, 0, toIndex, P.b(comparator).f(G.l()));
            for (int j = n; j < toIndex; ++j) {
                final int n3 = j * 2;
                array[n3] = a[j].getKey();
                array[n3 + 1] = a[j].getValue();
            }
        }
        
        public w a() {
            return this.c();
        }
        
        public final w b(final boolean b) {
            if (b) {
                final w.a.a e = this.e;
                if (e != null) {
                    throw e.a();
                }
            }
            final int c = this.c;
            Object[] b2;
            int n;
            if (this.a == null) {
                b2 = this.b;
                n = c;
            }
            else {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, c * 2);
                }
                final Object[] b3 = this.b;
                n = c;
                b2 = b3;
                if (!b) {
                    final Object[] e2 = this.e(b3, this.c);
                    n = c;
                    b2 = e2;
                    if (e2.length < this.b.length) {
                        n = e2.length >>> 1;
                        b2 = e2;
                    }
                }
                i(b2, n, this.a);
            }
            this.d = true;
            final T l = T.l(n, b2, this);
            if (!b) {
                return l;
            }
            final w.a.a e3 = this.e;
            if (e3 == null) {
                return l;
            }
            throw e3.a();
        }
        
        public w c() {
            return this.b(true);
        }
        
        public final void d(int n) {
            n *= 2;
            final Object[] b = this.b;
            if (n > b.length) {
                this.b = Arrays.copyOf(b, t.b.c(b.length, n));
                this.d = false;
            }
        }
        
        public final Object[] e(final Object[] array, final int n) {
            final HashSet<Object> set = new HashSet<Object>();
            final BitSet set2 = new BitSet();
            for (int i = n - 1; i >= 0; --i) {
                final Object obj = array[i * 2];
                Objects.requireNonNull(obj);
                if (!set.add(obj)) {
                    set2.set(i);
                }
            }
            if (set2.isEmpty()) {
                return array;
            }
            final Object[] array2 = new Object[(n - set2.cardinality()) * 2];
            int j = 0;
            int n2 = 0;
            while (j < n * 2) {
                if (set2.get(j >>> 1)) {
                    j += 2;
                }
                else {
                    final Object obj2 = array[j];
                    Objects.requireNonNull(obj2);
                    array2[n2] = obj2;
                    final int n3 = n2 + 2;
                    final int n4 = j + 2;
                    final Object obj3 = array[j + 1];
                    Objects.requireNonNull(obj3);
                    array2[n2 + 1] = obj3;
                    j = n4;
                    n2 = n3;
                }
            }
            return array2;
        }
        
        public w.a f(final Object o, final Object o2) {
            this.d(this.c + 1);
            i.a(o, o2);
            final Object[] b = this.b;
            final int c = this.c;
            b[c * 2] = o;
            b[c * 2 + 1] = o2;
            this.c = c + 1;
            return this;
        }
        
        public w.a g(final Entry entry) {
            return this.f(entry.getKey(), entry.getValue());
        }
        
        public w.a h(final Iterable iterable) {
            if (iterable instanceof Collection) {
                this.d(this.c + ((Collection<Entry>)iterable).size());
            }
            final Iterator<Entry> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.g((Entry)iterator.next());
            }
            return this;
        }
        
        public static final class a
        {
            public final Object a;
            public final Object b;
            public final Object c;
            
            public a(final Object a, final Object b, final Object c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
            
            public IllegalArgumentException a() {
                final StringBuilder sb = new StringBuilder();
                sb.append("Multiple entries with same key: ");
                sb.append(this.a);
                sb.append("=");
                sb.append(this.b);
                sb.append(" and ");
                sb.append(this.a);
                sb.append("=");
                sb.append(this.c);
                return new IllegalArgumentException(sb.toString());
            }
        }
    }
    
    public static class b implements Serializable
    {
        private static final long serialVersionUID = 0L;
        public final Object o;
        public final Object p;
        
        public b(final w w) {
            final Object[] o = new Object[w.size()];
            final Object[] p = new Object[w.size()];
            final g0 q = w.g().q();
            int n = 0;
            while (q.hasNext()) {
                final Entry<Object, V> entry = q.next();
                o[n] = entry.getKey();
                p[n] = entry.getValue();
                ++n;
            }
            this.o = o;
            this.p = p;
        }
        
        public final Object a() {
            final Object[] array = (Object[])this.o;
            final Object[] array2 = (Object[])this.p;
            final w.a b = this.b(array.length);
            for (int i = 0; i < array.length; ++i) {
                b.f(array[i], array2[i]);
            }
            return b.c();
        }
        
        public w.a b(final int n) {
            return new w.a(n);
        }
        
        public final Object readResolve() {
            final Object o = this.o;
            if (!(o instanceof y)) {
                return this.a();
            }
            final y y = (y)o;
            final t t = (t)this.p;
            final w.a b = this.b(y.size());
            final g0 q = y.q();
            final g0 q2 = t.q();
            while (q.hasNext()) {
                b.f(q.next(), q2.next());
            }
            return b.c();
        }
    }
}
