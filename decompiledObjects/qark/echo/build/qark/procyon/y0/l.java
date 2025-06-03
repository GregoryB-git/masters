// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import i0.x;
import F0.s;
import d0.i;
import F0.j;
import d0.q;
import i0.k;
import i0.g;

public final class l extends e
{
    public final y0.f j;
    public y0.f.b k;
    public long l;
    public volatile boolean m;
    
    public l(final i0.g g, final k k, final q q, final int n, final Object o, final y0.f j) {
        super(g, k, 2, q, n, o, -9223372036854775807L, -9223372036854775807L);
        this.j = j;
    }
    
    @Override
    public void b() {
        if (this.l == 0L) {
            this.j.b(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        Label_0142: {
            x i = null;
            Label_0122: {
                try {
                    final k e = super.b.e(this.l);
                    i = super.i;
                    final j j = new j(i, e.g, i.e(e));
                    try {
                        while (!this.m && this.j.c(j)) {}
                    }
                    finally {
                        break Label_0122;
                    }
                    this.l = j.p() - super.b.g;
                    i0.j.a(super.i);
                    return;
                }
                finally {
                    break Label_0142;
                }
            }
            final s s;
            this.l = s.p() - super.b.g;
            throw i;
        }
        i0.j.a(super.i);
    }
    
    @Override
    public void c() {
        this.m = true;
    }
    
    public void g(final y0.f.b k) {
        this.k = k;
    }
}
