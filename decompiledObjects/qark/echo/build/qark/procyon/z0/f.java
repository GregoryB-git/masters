// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z0;

import X2.B;
import c1.e;
import X2.v;
import java.util.ArrayList;

public final class f implements a
{
    public final ArrayList a;
    
    public f() {
        this.a = new ArrayList();
    }
    
    @Override
    public v a(final long n) {
        final int f = this.f(n);
        if (f == 0) {
            return v.Y();
        }
        final e e = this.a.get(f - 1);
        final long d = e.d;
        if (d != -9223372036854775807L && n >= d) {
            return v.Y();
        }
        return e.a;
    }
    
    @Override
    public long b(final long n) {
        final boolean empty = this.a.isEmpty();
        final long n2 = Long.MIN_VALUE;
        if (empty) {
            return Long.MIN_VALUE;
        }
        if (n < this.a.get(0).b) {
            return this.a.get(0).b;
        }
        int i = 1;
        while (i < this.a.size()) {
            final e e = this.a.get(i);
            if (n < e.b) {
                final long d = this.a.get(i - 1).d;
                if (d != -9223372036854775807L && d > n && d < e.b) {
                    return d;
                }
                return e.b;
            }
            else {
                ++i;
            }
        }
        final long d2 = ((e)B.d(this.a)).d;
        long n3 = n2;
        if (d2 != -9223372036854775807L) {
            n3 = n2;
            if (n < d2) {
                n3 = d2;
            }
        }
        return n3;
    }
    
    @Override
    public boolean c(final e e, final long n) {
        g0.a.a(e.b != -9223372036854775807L);
        boolean b = false;
        Label_0065: {
            if (e.b <= n) {
                final long d = e.d;
                if (d == -9223372036854775807L || n < d) {
                    b = true;
                    break Label_0065;
                }
            }
            b = false;
        }
        for (int i = this.a.size() - 1; i >= 0; --i) {
            if (e.b >= ((e)this.a.get(i)).b) {
                this.a.add(i + 1, e);
                return b;
            }
            if (((e)this.a.get(i)).b <= n) {
                b = false;
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
        if (this.a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (n < this.a.get(0).b) {
            return -9223372036854775807L;
        }
        int i = 1;
        while (i < this.a.size()) {
            final long b = this.a.get(i).b;
            final long n2 = lcmp(n, b);
            if (n2 == 0) {
                return b;
            }
            if (n2 < 0) {
                final e e = this.a.get(i - 1);
                final long d = e.d;
                if (d != -9223372036854775807L && d <= n) {
                    return d;
                }
                return e.b;
            }
            else {
                ++i;
            }
        }
        final e e2 = (e)B.d(this.a);
        final long d2 = e2.d;
        if (d2 != -9223372036854775807L) {
            final long b2 = d2;
            if (n >= d2) {
                return b2;
            }
        }
        return e2.b;
    }
    
    @Override
    public void e(final long n) {
        final int f = this.f(n);
        if (f > 0) {
            this.a.subList(0, f).clear();
        }
    }
    
    public final int f(final long n) {
        for (int i = 0; i < this.a.size(); ++i) {
            if (n < ((e)this.a.get(i)).b) {
                return i;
            }
        }
        return this.a.size();
    }
}
