// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t;

import java.util.NoSuchElementException;
import java.util.AbstractSet;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.Map;

public class a extends h implements Map
{
    public a v;
    public c w;
    public e x;
    
    public a() {
    }
    
    public a(final int n) {
        super(n);
    }
    
    public static boolean n(final Set set, final Object o) {
        if (set == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set2 = (Set)o;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        }
        catch (NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public Set entrySet() {
        a v;
        if ((v = this.v) == null) {
            v = new a();
            this.v = v;
        }
        return v;
    }
    
    @Override
    public Set keySet() {
        c w;
        if ((w = this.w) == null) {
            w = new c();
            this.w = w;
        }
        return w;
    }
    
    public boolean m(final Collection collection) {
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.containsKey(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean o(final Collection collection) {
        final int q = super.q;
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.remove(iterator.next());
        }
        return q != super.q;
    }
    
    public boolean p(final Collection collection) {
        final int q = super.q;
        for (int i = q - 1; i >= 0; --i) {
            if (!collection.contains(this.i(i))) {
                this.j(i);
            }
        }
        return q != super.q;
    }
    
    @Override
    public void putAll(final Map map) {
        this.c(super.q + map.size());
        for (final Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }
    
    public Object[] q(final Object[] array, final int n) {
        final int q = super.q;
        Object[] array2 = array;
        if (array.length < q) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), q);
        }
        for (int i = 0; i < q; ++i) {
            array2[i] = super.p[(i << 1) + n];
        }
        if (array2.length > q) {
            array2[q] = null;
        }
        return array2;
    }
    
    @Override
    public Collection values() {
        e x;
        if ((x = this.x) == null) {
            x = new e();
            this.x = x;
        }
        return x;
    }
    
    public final class a extends AbstractSet
    {
        @Override
        public Iterator iterator() {
            return new d();
        }
        
        @Override
        public int size() {
            return t.a.this.q;
        }
    }
    
    public final class b extends e
    {
        public b() {
            super(a.this.q);
        }
        
        @Override
        public Object b(final int n) {
            return a.this.i(n);
        }
        
        @Override
        public void d(final int n) {
            a.this.j(n);
        }
    }
    
    public final class c implements Set
    {
        @Override
        public boolean add(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public boolean addAll(final Collection collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void clear() {
            a.this.clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            return a.this.containsKey(o);
        }
        
        @Override
        public boolean containsAll(final Collection collection) {
            return a.this.m(collection);
        }
        
        @Override
        public boolean equals(final Object o) {
            return a.n(this, o);
        }
        
        @Override
        public int hashCode() {
            int i = a.this.q - 1;
            int n = 0;
            while (i >= 0) {
                final Object j = a.this.i(i);
                int hashCode;
                if (j == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = j.hashCode();
                }
                n += hashCode;
                --i;
            }
            return n;
        }
        
        @Override
        public boolean isEmpty() {
            return a.this.isEmpty();
        }
        
        @Override
        public Iterator iterator() {
            return new b();
        }
        
        @Override
        public boolean remove(final Object o) {
            final int f = a.this.f(o);
            if (f >= 0) {
                a.this.j(f);
                return true;
            }
            return false;
        }
        
        @Override
        public boolean removeAll(final Collection collection) {
            return a.this.o(collection);
        }
        
        @Override
        public boolean retainAll(final Collection collection) {
            return a.this.p(collection);
        }
        
        @Override
        public int size() {
            return a.this.q;
        }
        
        @Override
        public Object[] toArray() {
            final int q = a.this.q;
            final Object[] array = new Object[q];
            for (int i = 0; i < q; ++i) {
                array[i] = a.this.i(i);
            }
            return array;
        }
        
        @Override
        public Object[] toArray(final Object[] array) {
            return a.this.q(array, 0);
        }
    }
    
    public final class d implements Iterator, Entry
    {
        public int o;
        public int p;
        public boolean q;
        
        public d() {
            this.o = a.this.q - 1;
            this.p = -1;
        }
        
        public Entry b() {
            if (this.hasNext()) {
                ++this.p;
                this.q = true;
                return this;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public boolean equals(final Object o) {
            if (!this.q) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            final boolean b = o instanceof Entry;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final Entry entry = (Entry)o;
            boolean b3 = b2;
            if (t.d.c(entry.getKey(), a.this.i(this.p))) {
                b3 = b2;
                if (t.d.c(entry.getValue(), a.this.l(this.p))) {
                    b3 = true;
                }
            }
            return b3;
        }
        
        @Override
        public Object getKey() {
            if (this.q) {
                return a.this.i(this.p);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public Object getValue() {
            if (this.q) {
                return a.this.l(this.p);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public boolean hasNext() {
            return this.p < this.o;
        }
        
        @Override
        public int hashCode() {
            if (this.q) {
                final Object i = a.this.i(this.p);
                final Object l = a.this.l(this.p);
                int hashCode = 0;
                int hashCode2;
                if (i == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = i.hashCode();
                }
                if (l != null) {
                    hashCode = l.hashCode();
                }
                return hashCode2 ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
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
        
        @Override
        public Object setValue(final Object o) {
            if (this.q) {
                return a.this.k(this.p, o);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getKey());
            sb.append("=");
            sb.append(this.getValue());
            return sb.toString();
        }
    }
    
    public final class e implements Collection
    {
        @Override
        public boolean add(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public boolean addAll(final Collection collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void clear() {
            a.this.clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            return a.this.h(o) >= 0;
        }
        
        @Override
        public boolean containsAll(final Collection collection) {
            final Iterator<Object> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public boolean isEmpty() {
            return a.this.isEmpty();
        }
        
        @Override
        public Iterator iterator() {
            return new f();
        }
        
        @Override
        public boolean remove(final Object o) {
            final int h = a.this.h(o);
            if (h >= 0) {
                a.this.j(h);
                return true;
            }
            return false;
        }
        
        @Override
        public boolean removeAll(final Collection collection) {
            int q = a.this.q;
            int i = 0;
            boolean b = false;
            while (i < q) {
                int n = q;
                int n2 = i;
                if (collection.contains(a.this.l(i))) {
                    a.this.j(i);
                    n2 = i - 1;
                    n = q - 1;
                    b = true;
                }
                i = n2 + 1;
                q = n;
            }
            return b;
        }
        
        @Override
        public boolean retainAll(final Collection collection) {
            int q = a.this.q;
            int i = 0;
            boolean b = false;
            while (i < q) {
                int n = q;
                int n2 = i;
                if (!collection.contains(a.this.l(i))) {
                    a.this.j(i);
                    n2 = i - 1;
                    n = q - 1;
                    b = true;
                }
                i = n2 + 1;
                q = n;
            }
            return b;
        }
        
        @Override
        public int size() {
            return a.this.q;
        }
        
        @Override
        public Object[] toArray() {
            final int q = a.this.q;
            final Object[] array = new Object[q];
            for (int i = 0; i < q; ++i) {
                array[i] = a.this.l(i);
            }
            return array;
        }
        
        @Override
        public Object[] toArray(final Object[] array) {
            return a.this.q(array, 1);
        }
    }
    
    public final class f extends e
    {
        public f() {
            super(a.this.q);
        }
        
        @Override
        public Object b(final int n) {
            return a.this.l(n);
        }
        
        @Override
        public void d(final int n) {
            a.this.j(n);
        }
    }
}
