// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.t;
import g0.o;
import g0.a;
import g0.z;
import g0.E;

public final class y implements K
{
    public final m a;
    public final g0.y b;
    public int c;
    public int d;
    public E e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    
    public y(final m a) {
        this.a = a;
        this.b = new g0.y(new byte[10]);
        this.c = 0;
    }
    
    @Override
    public void a(final z z, int j) {
        g0.a.h(this.e);
        int n = j;
        while (true) {
            Label_0151: {
                if ((j & 0x1) != 0x0) {
                    final int c = this.c;
                    n = j;
                    if (c == 0) {
                        break Label_0151;
                    }
                    n = j;
                    if (c == 1) {
                        break Label_0151;
                    }
                    if (c == 2) {
                        o.h("PesReader", "Unexpected start indicator reading extended header");
                        n = j;
                        break Label_0151;
                    }
                    if (c == 3) {
                        if (this.j != -1) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected start indicator: expected ");
                            sb.append(this.j);
                            sb.append(" more bytes");
                            o.h("PesReader", sb.toString());
                        }
                        this.a.c(z.g() == 0);
                        n = j;
                        break Label_0151;
                    }
                    throw new IllegalStateException();
                }
                while (z.a() > 0) {
                    j = this.c;
                    if (j != 0) {
                        if (j != 1) {
                            if (j != 2) {
                                if (j != 3) {
                                    throw new IllegalStateException();
                                }
                                final int a = z.a();
                                j = this.j;
                                int n2;
                                if (j == -1) {
                                    n2 = 0;
                                }
                                else {
                                    n2 = a - j;
                                }
                                j = a;
                                if (n2 > 0) {
                                    j = a - n2;
                                    z.S(z.f() + j);
                                }
                                this.a.a(z);
                                final int i = this.j;
                                if (i == -1) {
                                    continue;
                                }
                                j = i - j;
                                if ((this.j = j) == 0) {
                                    this.a.c(false);
                                    break Label_0151;
                                }
                                continue;
                            }
                            else {
                                j = Math.min(10, this.i);
                                if (!this.e(z, this.b.a, j) || !this.e(z, null, this.i)) {
                                    continue;
                                }
                                this.g();
                                if (this.k) {
                                    j = 4;
                                }
                                else {
                                    j = 0;
                                }
                                n |= j;
                                this.a.d(this.l, n);
                                this.h(3);
                            }
                        }
                        else {
                            if (!this.e(z, this.b.a, 9)) {
                                continue;
                            }
                            if (this.f()) {
                                j = 2;
                            }
                            else {
                                j = 0;
                            }
                            this.h(j);
                        }
                    }
                    else {
                        z.U(z.a());
                    }
                }
                return;
            }
            this.h(1);
            continue;
        }
    }
    
    @Override
    public void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }
    
    @Override
    public void c(final E e, final t t, final d d) {
        this.e = e;
        this.a.e(t, d);
    }
    
    public boolean d(final boolean b) {
        return this.c == 3 && this.j == -1 && (!b || !(this.a instanceof n));
    }
    
    public final boolean e(final z z, final byte[] array, final int n) {
        final int min = Math.min(z.a(), n - this.d);
        if (min <= 0) {
            return true;
        }
        if (array == null) {
            z.U(min);
        }
        else {
            z.l(array, this.d, min);
        }
        final int d = this.d + min;
        this.d = d;
        return d == n;
    }
    
    public final boolean f() {
        this.b.p(0);
        final int h = this.b.h(24);
        if (h != 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected start code prefix: ");
            sb.append(h);
            o.h("PesReader", sb.toString());
            this.j = -1;
            return false;
        }
        this.b.r(8);
        final int h2 = this.b.h(16);
        this.b.r(5);
        this.k = this.b.g();
        this.b.r(2);
        this.f = this.b.g();
        this.g = this.b.g();
        this.b.r(6);
        final int h3 = this.b.h(8);
        this.i = h3;
        if (h2 != 0) {
            if ((this.j = h2 - 3 - h3) >= 0) {
                return true;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Found negative packet payload size: ");
            sb2.append(this.j);
            o.h("PesReader", sb2.toString());
        }
        this.j = -1;
        return true;
    }
    
    public final void g() {
        this.b.p(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.r(4);
            final long n = this.b.h(3);
            this.b.r(1);
            final long n2 = this.b.h(15) << 15;
            this.b.r(1);
            final long n3 = this.b.h(15);
            this.b.r(1);
            if (!this.h && this.g) {
                this.b.r(4);
                final long n4 = this.b.h(3);
                this.b.r(1);
                final long n5 = this.b.h(15) << 15;
                this.b.r(1);
                final long n6 = this.b.h(15);
                this.b.r(1);
                this.e.b(n4 << 30 | n5 | n6);
                this.h = true;
            }
            this.l = this.e.b(n << 30 | n2 | n3);
        }
    }
    
    public final void h(final int c) {
        this.c = c;
        this.d = 0;
    }
}
