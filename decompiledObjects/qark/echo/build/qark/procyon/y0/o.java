// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import F0.T;
import d0.i;
import F0.j;
import i0.k;
import i0.g;
import d0.q;

public final class o extends a
{
    public final int o;
    public final q p;
    public long q;
    public boolean r;
    
    public o(final i0.g g, final k k, final q q, final int n, final Object o, final long n2, final long n3, final long n4, final int o2, final q p10) {
        super(g, k, q, n, o, n2, n3, -9223372036854775807L, -9223372036854775807L, n4);
        this.o = o2;
        this.p = p10;
    }
    
    @Override
    public void b() {
        final y0.c j = this.j();
        j.c(0L);
        final int o = this.o;
        int i = 0;
        final T a = j.a(0, o);
        a.d(this.p);
        while (true) {
            try {
                long e;
                final long n = e = super.i.e(super.b.e(this.q));
                if (n != -1L) {
                    e = n + this.q;
                }
                for (j k = new j(super.i, this.q, e); i != -1; i = a.f(k, Integer.MAX_VALUE, true)) {
                    this.q += i;
                }
                a.b(super.g, 1, (int)this.q, 0, null);
                i0.j.a(super.i);
                this.r = true;
                return;
                i0.j.a(super.i);
            }
            finally {}
            continue;
        }
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public boolean h() {
        return this.r;
    }
}
