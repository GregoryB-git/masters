// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import g0.a;
import g0.M;
import X2.B;
import java.util.Collection;
import g0.o;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import X2.v;
import X2.P;

public final class g implements k
{
    public static final P q;
    public final v o;
    public final long[] p;
    
    static {
        q = P.d().f(new f());
    }
    
    public g(final List list) {
        int i = 0;
        if (list.size() != 1) {
            Arrays.fill(this.p = new long[list.size() * 2], Long.MAX_VALUE);
            final ArrayList<v> list2 = new ArrayList<v>();
            final v g0 = v.g0(g.q, list);
            int n = 0;
            while (i < g0.size()) {
                final e e = g0.get(i);
                final long f = f(e.b);
                final long c = e.c;
                int n4 = 0;
                Label_0302: {
                    if (n != 0) {
                        final long[] p = this.p;
                        final int n2 = n - 1;
                        final long n3 = p[n2];
                        if (n3 >= f) {
                            if (n3 != f || !list2.get(n2).isEmpty()) {
                                g0.o.h("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                                this.p[n2] = f;
                            }
                            list2.set(n2, e.a);
                            n4 = n;
                            break Label_0302;
                        }
                    }
                    this.p[n] = f;
                    list2.add(e.a);
                    n4 = n + 1;
                }
                n = n4;
                if (e.c != -9223372036854775807L) {
                    this.p[n4] = c + f;
                    list2.add(v.Y());
                    n = n4 + 1;
                }
                ++i;
            }
            this.o = v.U(list2);
            return;
        }
        final e e2 = (e)B.g(list);
        final long f2 = f(e2.b);
        if (e2.c == -9223372036854775807L) {
            this.o = v.Z(e2.a);
            this.p = new long[] { f2 };
            return;
        }
        this.o = v.a0(e2.a, v.Y());
        this.p = new long[] { f2, e2.c + f2 };
    }
    
    public static long f(final long n) {
        long n2 = n;
        if (n == -9223372036854775807L) {
            n2 = 0L;
        }
        return n2;
    }
    
    public v b(final long n) {
        final int h = M.h(this.p, n, true, false);
        if (h == -1) {
            return v.Y();
        }
        return (v)this.o.get(h);
    }
    
    @Override
    public int c(final long n) {
        final int d = M.d(this.p, n, false, false);
        if (d < this.o.size()) {
            return d;
        }
        return -1;
    }
    
    @Override
    public long e(final int n) {
        a.a(n < this.o.size());
        return this.p[n];
    }
    
    @Override
    public int j() {
        return this.o.size();
    }
}
