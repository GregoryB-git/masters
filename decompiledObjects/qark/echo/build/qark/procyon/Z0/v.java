// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import g0.M;
import g0.a;

public final class v
{
    public final s a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;
    
    public v(final s a, final long[] c, final int[] d, int e, final long[] f, final int[] g, final long h) {
        final int length = d.length;
        final int length2 = f.length;
        final boolean b = false;
        g0.a.a(length == length2);
        g0.a.a(c.length == f.length);
        boolean b2 = b;
        if (g.length == f.length) {
            b2 = true;
        }
        g0.a.a(b2);
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.b = c.length;
        if (g.length > 0) {
            e = g.length - 1;
            g[e] |= 0x20000000;
        }
    }
    
    public int a(final long n) {
        for (int i = M.h(this.f, n, true, false); i >= 0; --i) {
            if ((this.g[i] & 0x1) != 0x0) {
                return i;
            }
        }
        return -1;
    }
    
    public int b(final long n) {
        for (int i = M.d(this.f, n, true, false); i < this.f.length; ++i) {
            if ((this.g[i] & 0x1) != 0x0) {
                return i;
            }
        }
        return -1;
    }
}
