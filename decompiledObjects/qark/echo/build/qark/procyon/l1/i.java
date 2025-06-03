// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import java.util.List;
import java.util.Collections;
import g0.o;
import g0.M;
import g0.a;
import F0.n;
import d0.q;
import F0.t;
import java.util.Arrays;
import F0.T;
import g0.z;
import g0.y;

public final class i implements m
{
    public static final byte[] w;
    public final boolean a;
    public final y b;
    public final z c;
    public final String d;
    public final int e;
    public String f;
    public T g;
    public T h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public T u;
    public long v;
    
    static {
        w = new byte[] { 73, 68, 51 };
    }
    
    public i(final boolean b) {
        this(b, null, 0);
    }
    
    public i(final boolean a, final String d, final int e) {
        this.b = new y(new byte[7]);
        this.c = new z(Arrays.copyOf(l1.i.w, 10));
        this.s();
        this.n = -1;
        this.o = -1;
        this.r = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    private boolean i(final z z, final byte[] array, final int n) {
        final int min = Math.min(z.a(), n - this.j);
        z.l(array, this.j, min);
        final int j = this.j + min;
        this.j = j;
        return j == n;
    }
    
    public static boolean m(final int n) {
        return (n & 0xFFF6) == 0xFFF0;
    }
    
    @Override
    public void a(final z z) {
        this.f();
        while (z.a() > 0) {
            final int i = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException();
                            }
                            this.p(z);
                        }
                        else {
                            int n;
                            if (this.l) {
                                n = 7;
                            }
                            else {
                                n = 5;
                            }
                            if (!this.i(z, this.b.a, n)) {
                                continue;
                            }
                            this.n();
                        }
                    }
                    else {
                        if (!this.i(z, this.c.e(), 10)) {
                            continue;
                        }
                        this.o();
                    }
                }
                else {
                    this.g(z);
                }
            }
            else {
                this.j(z);
            }
        }
    }
    
    @Override
    public void b() {
        this.t = -9223372036854775807L;
        this.q();
    }
    
    @Override
    public void c(final boolean b) {
    }
    
    @Override
    public void d(final long t, final int n) {
        this.t = t;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.f = d.b();
        final T a = t.a(d.c(), 1);
        this.g = a;
        this.u = a;
        if (this.a) {
            d.a();
            (this.h = t.a(d.c(), 5)).d(new q.b().a0(d.b()).o0("application/id3").K());
            return;
        }
        this.h = new n();
    }
    
    public final void f() {
        g0.a.e(this.g);
        M.i(this.u);
        M.i(this.h);
    }
    
    public final void g(final z z) {
        if (z.a() == 0) {
            return;
        }
        this.b.a[0] = z.e()[z.f()];
        this.b.p(2);
        final int h = this.b.h(4);
        final int o = this.o;
        if (o != -1 && h != o) {
            this.q();
            return;
        }
        if (!this.m) {
            this.m = true;
            this.n = this.p;
            this.o = h;
        }
        this.t();
    }
    
    public final boolean h(final z z, int n) {
        z.T(n + 1);
        if (!this.w(z, this.b.a, 1)) {
            return false;
        }
        this.b.p(4);
        final int h = this.b.h(1);
        final int n2 = this.n;
        if (n2 != -1 && h != n2) {
            return false;
        }
        if (this.o != -1) {
            if (!this.w(z, this.b.a, 1)) {
                return true;
            }
            this.b.p(2);
            if (this.b.h(4) != this.o) {
                return false;
            }
            z.T(n + 2);
        }
        if (!this.w(z, this.b.a, 4)) {
            return true;
        }
        this.b.p(14);
        final int h2 = this.b.h(13);
        if (h2 < 7) {
            return false;
        }
        final byte[] e = z.e();
        final int g = z.g();
        n += h2;
        if (n >= g) {
            return true;
        }
        final byte b = e[n];
        if (b == -1) {
            ++n;
            return n == g || (this.l((byte)(-1), e[n]) && (e[n] & 0x8) >> 3 == h);
        }
        if (b != 73) {
            return false;
        }
        final int n3 = n + 1;
        if (n3 == g) {
            return true;
        }
        if (e[n3] != 68) {
            return false;
        }
        n += 2;
        return n == g || e[n] == 51;
    }
    
    public final void j(final z z) {
        final byte[] e = z.e();
        int i = z.f();
        while (i < z.g()) {
            final int n = i + 1;
            final byte b = e[i];
            final int n2 = b & 0xFF;
            if (this.k == 512 && this.l((byte)(-1), (byte)n2) && (this.m || this.h(z, i - 1))) {
                this.p = (b & 0x8) >> 3;
                boolean l = true;
                if ((b & 0x1) != 0x0) {
                    l = false;
                }
                this.l = l;
                if (!this.m) {
                    this.r();
                }
                else {
                    this.t();
                }
                z.T(n);
                return;
            }
            final int k = this.k;
            final int n3 = n2 | k;
            Label_0239: {
                int j;
                if (n3 != 329) {
                    if (n3 == 511) {
                        this.k = 512;
                        break Label_0239;
                    }
                    if (n3 != 836) {
                        if (n3 == 1075) {
                            this.u();
                            z.T(n);
                            return;
                        }
                        if (k != 256) {
                            this.k = 256;
                            continue;
                        }
                        break Label_0239;
                    }
                    else {
                        j = 1024;
                    }
                }
                else {
                    j = 768;
                }
                this.k = j;
            }
            i = n;
        }
        z.T(i);
    }
    
    public long k() {
        return this.r;
    }
    
    public final boolean l(final byte b, final byte b2) {
        return m((b & 0xFF) << 8 | (b2 & 0xFF));
    }
    
    public final void n() {
        this.b.p(0);
        if (!this.q) {
            final y b = this.b;
            int n = 2;
            final int i = b.h(2) + 1;
            if (i != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Detected audio object type: ");
                sb.append(i);
                sb.append(", but assuming AAC LC.");
                g0.o.h("AdtsReader", sb.toString());
            }
            else {
                n = i;
            }
            this.b.r(5);
            final byte[] a = F0.a.a(n, this.o, this.b.h(3));
            final F0.a.b e = F0.a.e(a);
            final q k = new q.b().a0(this.f).o0("audio/mp4a-latm").O(e.c).N(e.b).p0(e.a).b0(Collections.singletonList(a)).e0(this.d).m0(this.e).K();
            this.r = 1024000000L / k.C;
            this.g.d(k);
            this.q = true;
        }
        else {
            this.b.r(10);
        }
        this.b.r(4);
        final int h = this.b.h(13);
        int n2 = h - 7;
        if (this.l) {
            n2 = h - 9;
        }
        this.v(this.g, this.r, 0, n2);
    }
    
    public final void o() {
        this.h.e(this.c, 10);
        this.c.T(6);
        this.v(this.h, 0L, 10, this.c.F() + 10);
    }
    
    public final void p(final z z) {
        final int min = Math.min(z.a(), this.s - this.j);
        this.u.e(z, min);
        final int j = this.j + min;
        this.j = j;
        if (j == this.s) {
            g0.a.f(this.t != -9223372036854775807L);
            this.u.b(this.t, 1, this.s, 0, null);
            this.t += this.v;
            this.s();
        }
    }
    
    public final void q() {
        this.m = false;
        this.s();
    }
    
    public final void r() {
        this.i = 1;
        this.j = 0;
    }
    
    public final void s() {
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }
    
    public final void t() {
        this.i = 3;
        this.j = 0;
    }
    
    public final void u() {
        this.i = 2;
        this.j = l1.i.w.length;
        this.s = 0;
        this.c.T(0);
    }
    
    public final void v(final T u, final long v, final int j, final int s) {
        this.i = 4;
        this.j = j;
        this.u = u;
        this.v = v;
        this.s = s;
    }
    
    public final boolean w(final z z, final byte[] array, final int n) {
        if (z.a() < n) {
            return false;
        }
        z.l(array, 0, n);
        return true;
    }
}
