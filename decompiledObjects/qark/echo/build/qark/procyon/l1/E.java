// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.t;
import g0.M;
import g0.z;

public final class E implements K
{
    public final D a;
    public final z b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    
    public E(final D a) {
        this.a = a;
        this.b = new z(32);
    }
    
    @Override
    public void a(final z z, int n) {
        if ((n & 0x1) != 0x0) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n2;
        if (n != 0) {
            n2 = z.f() + z.G();
        }
        else {
            n2 = -1;
        }
        while (true) {
            Label_0056: {
                if (this.f) {
                    if (n == 0) {
                        return;
                    }
                    this.f = false;
                    z.T(n2);
                    break Label_0056;
                }
                while (z.a() > 0) {
                    n = this.d;
                    if (n < 3) {
                        if (n == 0) {
                            n = z.G();
                            z.T(z.f() - 1);
                            if (n == 255) {
                                this.f = true;
                                return;
                            }
                        }
                        n = Math.min(z.a(), 3 - this.d);
                        z.l(this.b.e(), this.d, n);
                        n += this.d;
                        if ((this.d = n) != 3) {
                            continue;
                        }
                        this.b.T(0);
                        this.b.S(3);
                        this.b.U(1);
                        n = this.b.G();
                        final int g = this.b.G();
                        this.e = ((n & 0x80) != 0x0);
                        this.c = ((n & 0xF) << 8 | g) + 3;
                        n = this.b.b();
                        final int c = this.c;
                        if (n >= c) {
                            continue;
                        }
                        n = Math.min(4098, Math.max(c, this.b.b() * 2));
                        this.b.c(n);
                    }
                    else {
                        n = Math.min(z.a(), this.c - this.d);
                        z.l(this.b.e(), this.d, n);
                        n += this.d;
                        this.d = n;
                        final int c2 = this.c;
                        if (n == c2) {
                            if (this.e) {
                                if (M.x(this.b.e(), 0, this.c, -1) != 0) {
                                    this.f = true;
                                    return;
                                }
                                this.b.S(this.c - 4);
                            }
                            else {
                                this.b.S(c2);
                            }
                            this.b.T(0);
                            this.a.a(this.b);
                            break Label_0056;
                        }
                        continue;
                    }
                }
                return;
            }
            this.d = 0;
            continue;
        }
    }
    
    @Override
    public void b() {
        this.f = true;
    }
    
    @Override
    public void c(final g0.E e, final t t, final d d) {
        this.a.c(e, t, d);
        this.f = true;
    }
}
