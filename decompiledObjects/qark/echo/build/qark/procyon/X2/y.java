// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.io.Serializable;
import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.SortedSet;
import java.util.Collection;
import java.util.Arrays;
import java.util.Objects;
import W2.m;
import java.util.Set;

public abstract class y extends t implements Set
{
    private static final long serialVersionUID = 912559L;
    public transient v p;
    
    public static int M(int a) {
        final int max = Math.max(a, 2);
        boolean b = true;
        if (max < 751619276) {
            for (a = Integer.highestOneBit(max - 1) << 1; a * 0.7 < max; a <<= 1) {}
            return a;
        }
        if (max >= 1073741824) {
            b = false;
        }
        m.e(b, "collection too large");
        return 1073741824;
    }
    
    public static y S(final int toIndex, final Object... array) {
        if (toIndex == 0) {
            return X();
        }
        if (toIndex == 1) {
            final Object obj = array[0];
            Objects.requireNonNull(obj);
            return Y(obj);
        }
        final int m = M(toIndex);
        final Object[] array2 = new Object[m];
        final int n = m - 1;
        final boolean b = false;
        int n3;
        int n2 = n3 = (b ? 1 : 0);
        for (int i = b ? 1 : 0; i < toIndex; ++i) {
            final Object a = O.a(array[i], i);
            final int hashCode = a.hashCode();
            int b2 = s.b(hashCode);
            while (true) {
                final int n4 = b2 & n;
                final Object o = array2[n4];
                if (o == null) {
                    array2[n4] = (array[n2] = a);
                    n3 += hashCode;
                    ++n2;
                    break;
                }
                if (o.equals(a)) {
                    break;
                }
                ++b2;
            }
        }
        Arrays.fill(array, n2, toIndex, null);
        if (n2 == 1) {
            final Object obj2 = array[0];
            Objects.requireNonNull(obj2);
            return new b0(obj2);
        }
        if (M(n2) < m / 2) {
            return S(n2, array);
        }
        Object[] copy = array;
        if (d0(n2, array.length)) {
            copy = Arrays.copyOf(array, n2);
        }
        return new U(copy, n3, array2, n, n2);
    }
    
    public static y T(final Collection collection) {
        if (collection instanceof y && !(collection instanceof SortedSet)) {
            final y y = (y)collection;
            if (!y.k()) {
                return y;
            }
        }
        final Object[] array = collection.toArray();
        return S(array.length, array);
    }
    
    public static y U(final Object[] array) {
        final int length = array.length;
        if (length == 0) {
            return X();
        }
        if (length != 1) {
            return S(array.length, (Object[])array.clone());
        }
        return Y(array[0]);
    }
    
    public static y X() {
        return U.w;
    }
    
    public static y Y(final Object o) {
        return new b0(o);
    }
    
    public static y Z(final Object o, final Object o2) {
        return S(2, o, o2);
    }
    
    public static y a0(final Object o, final Object o2, final Object o3) {
        return S(3, o, o2, o3);
    }
    
    public static y b0(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        return S(5, o, o2, o3, o4, o5);
    }
    
    public static y c0(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object... array) {
        m.e(array.length <= 2147483641, "the total number of elements must fit in an int");
        final int n = array.length + 6;
        final Object[] array2 = new Object[n];
        array2[0] = o;
        array2[1] = o2;
        array2[2] = o3;
        array2[3] = o4;
        array2[4] = o5;
        array2[5] = o6;
        System.arraycopy(array, 0, array2, 6, array.length);
        return S(n, array2);
    }
    
    public static boolean d0(final int n, final int n2) {
        return n < (n2 >> 1) + (n2 >> 2);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public v V() {
        return v.s(this.toArray());
    }
    
    public boolean W() {
        return false;
    }
    
    @Override
    public v a() {
        v p;
        if ((p = this.p) == null) {
            p = this.V();
            this.p = p;
        }
        return p;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || ((!(o instanceof y) || !this.W() || !((y)o).W() || this.hashCode() == o.hashCode()) && a0.a(this, o));
    }
    
    @Override
    public int hashCode() {
        return a0.d(this);
    }
    
    @Override
    public abstract g0 q();
    
    @Override
    public Object writeReplace() {
        return new b(this.toArray());
    }
    
    public static class a extends t.a
    {
        public Object[] d;
        public int e;
        
        public a() {
            super(4);
        }
        
        public a h(final Object o) {
            m.j(o);
            if (this.d != null && y.M(super.b) <= this.d.length) {
                this.k(o);
                return this;
            }
            this.d = null;
            super.d(o);
            return this;
        }
        
        public a i(final Object... array) {
            if (this.d != null) {
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.h(array[i]);
                }
            }
            else {
                super.e(array);
            }
            return this;
        }
        
        public a j(final Iterable iterable) {
            m.j(iterable);
            if (this.d != null) {
                final Iterator<Object> iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    this.h(iterator.next());
                }
            }
            else {
                super.b(iterable);
            }
            return this;
        }
        
        public final void k(final Object obj) {
            Objects.requireNonNull(this.d);
            final int length = this.d.length;
            final int hashCode = obj.hashCode();
            int b = s.b(hashCode);
            while (true) {
                final int n = b & length - 1;
                final Object[] d = this.d;
                final Object o = d[n];
                if (o == null) {
                    d[n] = obj;
                    this.e += hashCode;
                    super.d(obj);
                    return;
                }
                if (o.equals(obj)) {
                    return;
                }
                b = n + 1;
            }
        }
        
        public y l() {
            final int b = super.b;
            if (b == 0) {
                return y.X();
            }
            if (b != 1) {
                y d2;
                if (this.d != null && y.M(b) == this.d.length) {
                    Object[] array;
                    if (d0(super.b, super.a.length)) {
                        array = Arrays.copyOf(super.a, super.b);
                    }
                    else {
                        array = super.a;
                    }
                    final int e = this.e;
                    final Object[] d = this.d;
                    d2 = new U(array, e, d, d.length - 1, super.b);
                }
                else {
                    d2 = S(super.b, super.a);
                    super.b = d2.size();
                }
                super.c = true;
                this.d = null;
                return d2;
            }
            final Object obj = super.a[0];
            Objects.requireNonNull(obj);
            return y.Y(obj);
        }
    }
    
    public static class b implements Serializable
    {
        private static final long serialVersionUID = 0L;
        public final Object[] o;
        
        public b(final Object[] o) {
            this.o = o;
        }
        
        public Object readResolve() {
            return y.U(this.o);
        }
    }
}
