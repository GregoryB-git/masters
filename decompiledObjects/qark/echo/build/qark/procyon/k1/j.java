// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k1;

import java.util.Comparator;
import g0.a;
import g0.M;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import c1.k;

public final class j implements k
{
    public final List o;
    public final long[] p;
    public final long[] q;
    
    public j(final List c) {
        this.o = Collections.unmodifiableList((List<?>)new ArrayList<Object>(c));
        this.p = new long[c.size() * 2];
        for (int i = 0; i < c.size(); ++i) {
            final d d = (d)c.get(i);
            final int n = i * 2;
            final long[] p = this.p;
            p[n] = d.b;
            p[n + 1] = d.c;
        }
        final long[] p2 = this.p;
        Arrays.sort(this.q = Arrays.copyOf(p2, p2.length));
    }
    
    @Override
    public int c(final long n) {
        final int d = M.d(this.q, n, false, false);
        if (d < this.q.length) {
            return d;
        }
        return -1;
    }
    
    @Override
    public long e(final int n) {
        final boolean b = false;
        a.a(n >= 0);
        boolean b2 = b;
        if (n < this.q.length) {
            b2 = true;
        }
        a.a(b2);
        return this.q[n];
    }
    
    @Override
    public List h(final long n) {
        final ArrayList<f0.a> list = new ArrayList<f0.a>();
        final ArrayList<d> list2 = new ArrayList<d>();
        final int n2 = 0;
        for (int i = 0; i < this.o.size(); ++i) {
            final long[] p = this.p;
            final int n3 = i * 2;
            if (p[n3] <= n && n < p[n3 + 1]) {
                final d d = this.o.get(i);
                final f0.a a = d.a;
                if (a.e == -3.4028235E38f) {
                    list2.add(d);
                }
                else {
                    list.add(a);
                }
            }
        }
        Collections.sort((List<Object>)list2, new i());
        for (int j = n2; j < list2.size(); ++j) {
            list.add(((d)list2.get(j)).a.a().h((float)(-1 - j), 1).a());
        }
        return list;
    }
    
    @Override
    public int j() {
        return this.q.length;
    }
}
