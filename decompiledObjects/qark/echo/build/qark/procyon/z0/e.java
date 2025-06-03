// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z0;

import X2.v;
import java.util.ArrayList;
import java.util.Comparator;
import W2.g;
import java.util.List;
import X2.P;

public final class e implements a
{
    public static final P b;
    public final List a;
    
    static {
        b = P.d().f(new c()).a(P.d().g().f(new d()));
    }
    
    public e() {
        this.a = new ArrayList();
    }
    
    @Override
    public v a(final long n) {
        if (!this.a.isEmpty()) {
            final List a = this.a;
            final int n2 = 0;
            if (n >= a.get(0).b) {
                final ArrayList<c1.e> list = new ArrayList<c1.e>();
                for (int i = 0; i < this.a.size(); ++i) {
                    final c1.e e = this.a.get(i);
                    if (n >= e.b && n < e.d) {
                        list.add(e);
                    }
                    if (n < e.b) {
                        break;
                    }
                }
                final v g0 = v.g0(e.b, list);
                final v.a m = v.M();
                for (int j = n2; j < g0.size(); ++j) {
                    m.j(g0.get(j).a);
                }
                return m.k();
            }
        }
        return v.Y();
    }
    
    @Override
    public long b(final long n) {
        int n2 = 0;
        long n3 = -9223372036854775807L;
        long b;
        while (true) {
            b = n3;
            if (n2 >= this.a.size()) {
                break;
            }
            b = this.a.get(n2).b;
            final long d = this.a.get(n2).d;
            if (n < b) {
                if (n3 == -9223372036854775807L) {
                    break;
                }
                b = Math.min(n3, b);
                break;
            }
            else {
                long min = n3;
                if (n < d) {
                    if (n3 == -9223372036854775807L) {
                        min = d;
                    }
                    else {
                        min = Math.min(n3, d);
                    }
                }
                ++n2;
                n3 = min;
            }
        }
        if (b != -9223372036854775807L) {
            return b;
        }
        return Long.MIN_VALUE;
    }
    
    @Override
    public boolean c(final c1.e e, final long n) {
        g0.a.a(e.b != -9223372036854775807L);
        g0.a.a(e.c != -9223372036854775807L);
        final boolean b = e.b <= n && n < e.d;
        for (int i = this.a.size() - 1; i >= 0; --i) {
            if (e.b >= ((c1.e)this.a.get(i)).b) {
                this.a.add(i + 1, e);
                return b;
            }
        }
        this.a.add(0, e);
        return b;
    }
    
    @Override
    public void clear() {
        this.a.clear();
    }
    
    @Override
    public long d(final long n) {
        if (!this.a.isEmpty()) {
            final List a = this.a;
            int i = 0;
            if (n >= a.get(0).b) {
                long n2 = this.a.get(0).b;
                while (i < this.a.size()) {
                    final long b = this.a.get(i).b;
                    final long d = this.a.get(i).d;
                    if (d <= n) {
                        n2 = Math.max(n2, d);
                    }
                    else {
                        if (b > n) {
                            break;
                        }
                        n2 = Math.max(n2, b);
                    }
                    ++i;
                }
                return n2;
            }
        }
        return -9223372036854775807L;
    }
    
    @Override
    public void e(final long n) {
        for (int i = 0; i < this.a.size(); ++i) {
            final long n2 = lcmp(n, this.a.get(i).b);
            if (n2 > 0 && n > this.a.get(i).d) {
                this.a.remove(i);
                --i;
            }
            else if (n2 < 0) {
                return;
            }
        }
    }
}
