// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.io.Serializable;
import java.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import W2.m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;

public abstract class A extends y implements NavigableSet, c0
{
    private static final long serialVersionUID = 912559L;
    public final transient Comparator q;
    public transient A r;
    
    public A(final Comparator q) {
        this.q = q;
    }
    
    public static A e0(final Comparator c, final int n, final Object... original) {
        if (n == 0) {
            return j0(c);
        }
        O.c(original, n);
        Arrays.sort(original, 0, n, c);
        int i = 1;
        int n2 = 1;
        while (i < n) {
            final Object o = original[i];
            int n3 = n2;
            if (c.compare(o, original[n2 - 1]) != 0) {
                original[n2] = o;
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        Arrays.fill(original, n2, n, null);
        Object[] copy = original;
        if (n2 < original.length / 2) {
            copy = Arrays.copyOf(original, n2);
        }
        return new V(v.D(copy, n2), c);
    }
    
    public static A f0(final Comparator comparator, final Iterable iterable) {
        m.j(comparator);
        if (d0.b(comparator, iterable) && iterable instanceof A) {
            final A a = (A)iterable;
            if (!a.k()) {
                return a;
            }
        }
        final Object[] k = B.k(iterable);
        return e0(comparator, k.length, k);
    }
    
    public static A g0(final Comparator comparator, final Collection collection) {
        return f0(comparator, collection);
    }
    
    public static V j0(final Comparator obj) {
        if (P.d().equals(obj)) {
            return V.t;
        }
        return new V(v.Y(), obj);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public static int u0(final Comparator comparator, final Object o, final Object o2) {
        return comparator.compare(o, o2);
    }
    
    @Override
    public Comparator comparator() {
        return this.q;
    }
    
    public abstract A h0();
    
    public A i0() {
        A r;
        if ((r = this.r) == null) {
            r = this.h0();
            this.r = r;
            r.r = this;
        }
        return r;
    }
    
    public A k0(final Object o) {
        return this.l0(o, false);
    }
    
    public A l0(final Object o, final boolean b) {
        return this.m0(m.j(o), b);
    }
    
    public abstract A m0(final Object p0, final boolean p1);
    
    public A n0(final Object o, final Object o2) {
        return this.o0(o, true, o2, false);
    }
    
    public A o0(final Object o, final boolean b, final Object o2, final boolean b2) {
        m.j(o);
        m.j(o2);
        m.d(this.q.compare(o, o2) <= 0);
        return this.p0(o, b, o2, b2);
    }
    
    public abstract A p0(final Object p0, final boolean p1, final Object p2, final boolean p3);
    
    @Override
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
    
    public A q0(final Object o) {
        return this.r0(o, true);
    }
    
    public A r0(final Object o, final boolean b) {
        return this.s0(m.j(o), b);
    }
    
    public abstract A s0(final Object p0, final boolean p1);
    
    public int t0(final Object o, final Object o2) {
        return u0(this.q, o, o2);
    }
    
    @Override
    public Object writeReplace() {
        return new b(this.q, this.toArray());
    }
    
    public static final class a extends y.a
    {
        public final Comparator f;
        
        public a(final Comparator comparator) {
            this.f = (Comparator)m.j(comparator);
        }
        
        public a m(final Object o) {
            super.h(o);
            return this;
        }
        
        public a n(final Object... array) {
            super.i(array);
            return this;
        }
        
        public a o(final Iterable iterable) {
            super.j(iterable);
            return this;
        }
        
        public A p() {
            final A e0 = A.e0(this.f, super.b, super.a);
            super.b = e0.size();
            super.c = true;
            return e0;
        }
    }
    
    public static class b implements Serializable
    {
        private static final long serialVersionUID = 0L;
        public final Comparator o;
        public final Object[] p;
        
        public b(final Comparator o, final Object[] p2) {
            this.o = o;
            this.p = p2;
        }
        
        public Object readResolve() {
            return new a(this.o).n(this.p).p();
        }
    }
}
