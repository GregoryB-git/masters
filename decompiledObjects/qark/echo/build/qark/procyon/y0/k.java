// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import java.util.Arrays;
import i0.j;
import g0.M;
import d0.q;
import i0.g;

public abstract class k extends e
{
    public byte[] j;
    public volatile boolean k;
    
    public k(final i0.g g, final i0.k k, final int n, final q q, final int n2, final Object o, byte[] f) {
        super(g, k, n, q, n2, o, -9223372036854775807L, -9223372036854775807L);
        if (f == null) {
            f = M.f;
        }
        this.j = f;
    }
    
    @Override
    public final void b() {
        while (true) {
            try {
                super.i.e(super.b);
                int n = 0;
                int n2 = 0;
                while (n != -1 && !this.k) {
                    this.i(n2);
                    final int read = super.i.read(this.j, n2, 16384);
                    if ((n = read) != -1) {
                        n2 += read;
                        n = read;
                    }
                }
                if (!this.k) {
                    this.g(this.j, n2);
                }
                i0.j.a(super.i);
                return;
                i0.j.a(super.i);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final void c() {
        this.k = true;
    }
    
    public abstract void g(final byte[] p0, final int p1);
    
    public byte[] h() {
        return this.j;
    }
    
    public final void i(final int n) {
        final byte[] j = this.j;
        if (j.length < n + 16384) {
            this.j = Arrays.copyOf(j, j.length + 16384);
        }
    }
}
