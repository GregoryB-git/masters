// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Iterator;
import java.util.Arrays;
import W2.m;
import java.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;

public abstract class t extends AbstractCollection implements Serializable
{
    public static final Object[] o;
    private static final long serialVersionUID = 912559L;
    
    static {
        o = new Object[0];
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public v a() {
        if (this.isEmpty()) {
            return v.Y();
        }
        return v.s(this.toArray());
    }
    
    @Override
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public abstract boolean contains(final Object p0);
    
    public abstract int d(final Object[] p0, final int p1);
    
    public Object[] f() {
        return null;
    }
    
    public int g() {
        throw new UnsupportedOperationException();
    }
    
    public int i() {
        throw new UnsupportedOperationException();
    }
    
    public abstract boolean k();
    
    public abstract g0 q();
    
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object[] toArray() {
        return this.toArray(t.o);
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        m.j(array);
        final int size = this.size();
        Object[] d;
        if (array.length < size) {
            final Object[] f = this.f();
            if (f != null) {
                return Q.a(f, this.i(), this.g(), array);
            }
            d = O.d(array, size);
        }
        else {
            d = array;
            if (array.length > size) {
                array[size] = null;
                d = array;
            }
        }
        this.d(d, 0);
        return d;
    }
    
    public Object writeReplace() {
        return new v.d(this.toArray());
    }
    
    public abstract static class a extends b
    {
        public Object[] a;
        public int b;
        public boolean c;
        
        public a(final int n) {
            i.b(n, "initialCapacity");
            this.a = new Object[n];
            this.b = 0;
        }
        
        @Override
        public b b(final Iterable iterable) {
            if (iterable instanceof Collection) {
                final Collection collection = (Collection)iterable;
                this.g(this.b + collection.size());
                if (collection instanceof t) {
                    this.b = ((t)collection).d(this.a, this.b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }
        
        public a d(final Object o) {
            m.j(o);
            this.g(this.b + 1);
            this.a[this.b++] = o;
            return this;
        }
        
        public b e(final Object... array) {
            this.f(array, array.length);
            return this;
        }
        
        public final void f(final Object[] array, final int n) {
            O.c(array, n);
            this.g(this.b + n);
            System.arraycopy(array, 0, this.a, this.b, n);
            this.b += n;
        }
        
        public final void g(final int n) {
            final Object[] a = this.a;
            if (a.length < n) {
                this.a = Arrays.copyOf(a, t.b.c(a.length, n));
            }
            else {
                if (!this.c) {
                    return;
                }
                this.a = a.clone();
            }
            this.c = false;
        }
    }
    
    public abstract static class b
    {
        public static int c(int n, int n2) {
            if (n2 >= 0) {
                if ((n = n + (n >> 1) + 1) < n2) {
                    n = Integer.highestOneBit(n2 - 1) << 1;
                }
                if ((n2 = n) < 0) {
                    n2 = Integer.MAX_VALUE;
                }
                return n2;
            }
            throw new AssertionError((Object)"cannot store more than MAX_VALUE elements");
        }
        
        public abstract b a(final Object p0);
        
        public b b(final Iterable iterable) {
            final Iterator<Object> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.a(iterator.next());
            }
            return this;
        }
    }
}
