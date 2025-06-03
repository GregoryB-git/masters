// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.a;

public final class U
{
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    
    public U() {
        this.a = new byte[10];
    }
    
    public void a(final T t, final T.a a) {
        if (this.c > 0) {
            t.b(this.d, this.e, this.f, this.g, a);
            this.c = 0;
        }
    }
    
    public void b() {
        this.b = false;
        this.c = 0;
    }
    
    public void c(final T t, final long d, final int e, final int n, final int g, final T.a a) {
        a.g(this.g <= n + g, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (!this.b) {
            return;
        }
        final int c = this.c;
        final int c2 = c + 1;
        this.c = c2;
        if (c == 0) {
            this.d = d;
            this.e = e;
            this.f = 0;
        }
        this.f += n;
        this.g = g;
        if (c2 >= 16) {
            this.a(t, a);
        }
    }
    
    public void d(final s s) {
        if (this.b) {
            return;
        }
        s.n(this.a, 0, 10);
        s.h();
        if (F0.b.j(this.a) == 0) {
            return;
        }
        this.b = true;
    }
}
