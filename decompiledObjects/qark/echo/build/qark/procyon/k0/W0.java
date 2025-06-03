// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.M;
import java.util.Arrays;
import java.util.List;
import x0.p;
import java.util.Iterator;
import x0.T;
import java.util.Collection;
import java.util.HashMap;
import d0.I;

public final class W0 extends a
{
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final I[] l;
    public final Object[] m;
    public final HashMap n;
    
    public W0(final Collection collection, final T t) {
        this(G(collection), H(collection), t);
    }
    
    public W0(final I[] l, final Object[] m, final T t) {
        int i = 0;
        super(false, t);
        final int length = l.length;
        this.l = l;
        this.j = new int[length];
        this.k = new int[length];
        this.m = m;
        this.n = new HashMap();
        final int length2 = l.length;
        int h = 0;
        int k;
        int j;
        for (j = (k = h); i < length2; ++i, ++k) {
            final I i2 = l[i];
            this.l[k] = i2;
            this.k[k] = h;
            this.j[k] = j;
            h += i2.p();
            j += this.l[k].i();
            this.n.put(m[k], k);
        }
        this.h = h;
        this.i = j;
    }
    
    public static I[] G(final Collection collection) {
        final I[] array = new I[collection.size()];
        final Iterator<F0> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = iterator.next().b();
            ++n;
        }
        return array;
    }
    
    public static Object[] H(final Collection collection) {
        final Object[] array = new Object[collection.size()];
        final Iterator<F0> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = iterator.next().a();
            ++n;
        }
        return array;
    }
    
    @Override
    public int A(final int n) {
        return this.k[n];
    }
    
    @Override
    public I D(final int n) {
        return this.l[n];
    }
    
    public W0 E(final T t) {
        final I[] array = new I[this.l.length];
        int n = 0;
        while (true) {
            final I[] l = this.l;
            if (n >= l.length) {
                break;
            }
            array[n] = new p(l[n]) {
                public final c f = new c();
                
                @Override
                public b g(final int n, final b b, final boolean b2) {
                    final b g = super.g(n, b, b2);
                    if (super.n(g.c, this.f).f()) {
                        g.t(b.a, b.b, b.c, b.d, b.e, d0.a.g, true);
                        return g;
                    }
                    g.f = true;
                    return g;
                }
            };
            ++n;
        }
        return new W0(array, this.m, t);
    }
    
    public List F() {
        return Arrays.asList(this.l);
    }
    
    @Override
    public int i() {
        return this.i;
    }
    
    @Override
    public int p() {
        return this.h;
    }
    
    @Override
    public int s(final Object key) {
        final Integer n = this.n.get(key);
        if (n == null) {
            return -1;
        }
        return n;
    }
    
    @Override
    public int t(final int n) {
        return M.g(this.j, n + 1, false, false);
    }
    
    @Override
    public int u(final int n) {
        return M.g(this.k, n + 1, false, false);
    }
    
    @Override
    public Object x(final int n) {
        return this.m[n];
    }
    
    @Override
    public int z(final int n) {
        return this.j[n];
    }
}
