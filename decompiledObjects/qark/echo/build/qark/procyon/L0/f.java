// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L0;

import d0.q;
import h0.d;
import F0.T;
import g0.z;

public final class f extends e
{
    public final z b;
    public final z c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    
    public f(final T t) {
        super(t);
        this.b = new z(h0.d.a);
        this.c = new z(4);
    }
    
    @Override
    public boolean b(final z z) {
        final int g = z.G();
        final int g2 = g >> 4 & 0xF;
        final int i = g & 0xF;
        if (i == 7) {
            this.g = g2;
            return g2 != 5;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Video format not supported: ");
        sb.append(i);
        throw new a(sb.toString());
    }
    
    @Override
    public boolean c(final z z, final long n) {
        final int g = z.G();
        final long n2 = z.q();
        if (g == 0 && !this.e) {
            final z z2 = new z(new byte[z.a()]);
            z.l(z2.e(), 0, z.a());
            final F0.d b = F0.d.b(z2);
            this.d = b.b;
            super.a.d(new q.b().o0("video/avc").O(b.l).v0(b.c).Y(b.d).k0(b.k).b0(b.a).K());
            this.e = true;
            return false;
        }
        if (g != 1 || !this.e) {
            return false;
        }
        int n3;
        if (this.g == 1) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (!this.f && n3 == 0) {
            return false;
        }
        final byte[] e = this.c.e();
        e[0] = 0;
        e[2] = (e[1] = 0);
        final int d = this.d;
        int n4 = 0;
        while (z.a() > 0) {
            z.l(this.c.e(), 4 - d, this.d);
            this.c.T(0);
            final int k = this.c.K();
            this.b.T(0);
            super.a.e(this.b, 4);
            super.a.e(z, k);
            n4 = n4 + 4 + k;
        }
        super.a.b(n + n2 * 1000L, n3, n4, 0, null);
        return this.f = true;
    }
}
