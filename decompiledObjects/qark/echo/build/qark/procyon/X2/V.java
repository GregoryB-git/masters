// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.List;
import W2.m;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Comparator;

public final class V extends A
{
    public static final V t;
    public final transient v s;
    
    static {
        t = new V(v.Y(), P.d());
    }
    
    public V(final v s, final Comparator comparator) {
        super(comparator);
        this.s = s;
    }
    
    public Comparator A0() {
        return super.q;
    }
    
    @Override
    public v a() {
        return this.s;
    }
    
    @Override
    public Object ceiling(final Object o) {
        final int y0 = this.y0(o, true);
        if (y0 == this.size()) {
            return null;
        }
        return this.s.get(y0);
    }
    
    @Override
    public boolean contains(final Object o) {
        boolean b = false;
        if (o == null) {
            return b;
        }
        try {
            final int z0 = this.z0(o);
            b = b;
            if (z0 >= 0) {
                b = true;
            }
            return b;
        }
        catch (ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        Collection<Object> u = (Collection<Object>)collection;
        if (collection instanceof L) {
            u = (Collection<Object>)((L)collection).u();
        }
        Label_0152: {
            if (!d0.b(this.comparator(), u) || u.size() <= 1) {
                break Label_0152;
            }
            final g0 q = this.q();
            final Iterator<Object> iterator = u.iterator();
            if (!q.hasNext()) {
                return false;
            }
            Object o = iterator.next();
            Object o2 = q.next();
            try {
                while (true) {
                    final int t0 = this.t0(o2, o);
                    if (t0 < 0) {
                        if (!q.hasNext()) {
                            return false;
                        }
                        o2 = q.next();
                    }
                    else if (t0 == 0) {
                        if (!iterator.hasNext()) {
                            return true;
                        }
                        o = iterator.next();
                    }
                    else {
                        if (t0 > 0) {
                            return false;
                        }
                        continue;
                    }
                }
                return super.containsAll(u);
            }
            catch (NullPointerException | ClassCastException ex) {
                return false;
            }
        }
    }
    
    @Override
    public int d(final Object[] array, final int n) {
        return this.s.d(array, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set = (Set)o;
        if (this.size() != set.size()) {
            return false;
        }
        if (this.isEmpty()) {
            return true;
        }
        Label_0115: {
            if (!d0.b(super.q, set)) {
                break Label_0115;
            }
            final Iterator<Object> iterator = set.iterator();
            try {
                final g0 q = this.q();
                while (q.hasNext()) {
                    final Object next = q.next();
                    final Object next2 = iterator.next();
                    if (next2 == null || this.t0(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
                return this.containsAll(set);
            }
            catch (ClassCastException | NoSuchElementException ex) {
                return false;
            }
        }
    }
    
    @Override
    public Object[] f() {
        return this.s.f();
    }
    
    @Override
    public Object first() {
        if (!this.isEmpty()) {
            return this.s.get(0);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public Object floor(final Object o) {
        final int n = this.x0(o, true) - 1;
        if (n == -1) {
            return null;
        }
        return this.s.get(n);
    }
    
    @Override
    public int g() {
        return this.s.g();
    }
    
    @Override
    public A h0() {
        final Comparator<Object> reverseOrder = Collections.reverseOrder((Comparator<Object>)super.q);
        if (this.isEmpty()) {
            return A.j0(reverseOrder);
        }
        return new V(this.s.f0(), reverseOrder);
    }
    
    @Override
    public Object higher(final Object o) {
        final int y0 = this.y0(o, false);
        if (y0 == this.size()) {
            return null;
        }
        return this.s.get(y0);
    }
    
    @Override
    public int i() {
        return this.s.i();
    }
    
    @Override
    public boolean k() {
        return this.s.k();
    }
    
    @Override
    public Object last() {
        if (!this.isEmpty()) {
            return this.s.get(this.size() - 1);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public Object lower(final Object o) {
        final int n = this.x0(o, false) - 1;
        if (n == -1) {
            return null;
        }
        return this.s.get(n);
    }
    
    @Override
    public A m0(final Object o, final boolean b) {
        return this.w0(0, this.x0(o, b));
    }
    
    @Override
    public A p0(final Object o, final boolean b, final Object o2, final boolean b2) {
        return this.s0(o, b).m0(o2, b2);
    }
    
    @Override
    public g0 q() {
        return this.s.q();
    }
    
    @Override
    public A s0(final Object o, final boolean b) {
        return this.w0(this.y0(o, b), this.size());
    }
    
    @Override
    public int size() {
        return this.s.size();
    }
    
    public g0 v0() {
        return this.s.f0().q();
    }
    
    public V w0(final int n, final int n2) {
        if (n == 0 && n2 == this.size()) {
            return this;
        }
        if (n < n2) {
            return new V(this.s.h0(n, n2), super.q);
        }
        return A.j0(super.q);
    }
    
    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
    
    public int x0(final Object o, final boolean b) {
        final int binarySearch = Collections.binarySearch(this.s, m.j(o), this.comparator());
        if (binarySearch >= 0) {
            int n = binarySearch;
            if (b) {
                n = binarySearch + 1;
            }
            return n;
        }
        return binarySearch;
    }
    
    public int y0(final Object o, final boolean b) {
        final int binarySearch = Collections.binarySearch(this.s, m.j(o), this.comparator());
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (b) {
            return binarySearch;
        }
        return binarySearch + 1;
    }
    
    public final int z0(final Object key) {
        return Collections.binarySearch(this.s, key, this.A0());
    }
}
