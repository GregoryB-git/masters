// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import g0.a;
import F0.L;
import java.util.List;
import java.io.EOFException;
import d0.A;
import F0.s;
import F0.q;
import F0.M;
import F0.t;
import g0.y;
import g0.z;
import F0.x;
import F0.r;

public final class h implements r
{
    public static final x m;
    public final int a;
    public final i b;
    public final z c;
    public final z d;
    public final y e;
    public t f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    
    static {
        m = new g();
    }
    
    public h() {
        this(0);
    }
    
    public h(final int n) {
        int a = n;
        if ((n & 0x2) != 0x0) {
            a = (n | 0x1);
        }
        this.a = a;
        this.b = new i(true);
        this.c = new z(2048);
        this.i = -1;
        this.h = -1L;
        final z d = new z(10);
        this.d = d;
        this.e = new y(d.e());
    }
    
    private static int h(final int n, final long n2) {
        return (int)(n * 8000000L / n2);
    }
    
    private M j(final long n, final boolean b) {
        return new F0.i(n, this.h, h(this.i, this.b.k()), this.i, b);
    }
    
    @Override
    public void a(final long n, final long g) {
        this.k = false;
        this.b.b();
        this.g = g;
    }
    
    @Override
    public void b(final t f) {
        this.f = f;
        this.b.e(f, new K.d(0, 1));
        f.j();
    }
    
    @Override
    public boolean e(final s s) {
        int m;
        final int n = m = this.m(s);
        int n3;
        int n2 = n3 = 0;
        int n4 = 0;
        do {
            s.n(this.d.e(), 0, 2);
            this.d.T(0);
            int n6 = 0;
            Label_0170: {
                if (l1.i.m(this.d.M())) {
                    final int n5 = n3 + 1;
                    if (n5 >= 4 && n2 > 188) {
                        return true;
                    }
                    s.n(this.d.e(), 0, 4);
                    this.e.p(14);
                    final int h = this.e.h(13);
                    if (h > 6) {
                        s.o(h - 6);
                        n2 += h;
                        n4 = m;
                        n6 = n5;
                        break Label_0170;
                    }
                }
                n4 = m + 1;
                s.h();
                s.o(n4);
                n6 = (n2 = 0);
            }
            n3 = n6;
            m = n4;
        } while (n4 - n < 8192);
        return false;
    }
    
    public final void f(final s s) {
        if (this.j) {
            return;
        }
        this.i = -1;
        s.h();
        final long p = s.p();
        long n = 0L;
        if (p == 0L) {
            this.m(s);
        }
        final int n2 = 0;
        int n3 = 0;
    Label_0276_Outer:
        while (true) {
            int n4 = n3;
            long n5 = n;
            int n6 = n3;
            long n7 = n;
            while (true) {
                Label_0326: {
                    try {
                        Label_0280: {
                            if (s.l(this.d.e(), 0, 2, true)) {
                                n6 = n3;
                                n7 = n;
                                this.d.T(0);
                                n6 = n3;
                                n7 = n;
                                if (!l1.i.m(this.d.M())) {
                                    n4 = n2;
                                    break Label_0280;
                                }
                                n6 = n3;
                                n7 = n;
                                if (!s.l(this.d.e(), 0, 4, true)) {
                                    n4 = n3;
                                    n5 = n;
                                }
                                else {
                                    n6 = n3;
                                    n7 = n;
                                    this.e.p(14);
                                    n6 = n3;
                                    n7 = n;
                                    final int h = this.e.h(13);
                                    if (h <= 6) {
                                        n6 = n3;
                                        n7 = n;
                                        this.j = true;
                                        n6 = n3;
                                        n7 = n;
                                        throw A.a("Malformed ADTS stream", null);
                                    }
                                    n5 = n + h;
                                    n4 = n3 + 1;
                                    if (n4 == 1000) {
                                        break Label_0326;
                                    }
                                    n3 = n4;
                                    n = n5;
                                    n6 = n4;
                                    n7 = n5;
                                    if (!s.j(h - 6, true)) {
                                        break Label_0326;
                                    }
                                    continue Label_0276_Outer;
                                }
                            }
                            n = n5;
                        }
                        s.h();
                        if (n4 > 0) {
                            this.i = (int)(n / n4);
                        }
                        else {
                            this.i = -1;
                        }
                        this.j = true;
                        return;
                    }
                    catch (EOFException ex) {
                        n4 = n6;
                        n5 = n7;
                        continue;
                    }
                }
                continue;
            }
        }
    }
    
    @Override
    public int i(final s s, final L l) {
        g0.a.h(this.f);
        final long a = s.a();
        final int a2 = this.a;
        if ((a2 & 0x2) != 0x0 || ((a2 & 0x1) != 0x0 && a != -1L)) {
            this.f(s);
        }
        final int read = s.read(this.c.e(), 0, 2048);
        final boolean b = read == -1;
        this.l(a, b);
        if (b) {
            return -1;
        }
        this.c.T(0);
        this.c.S(read);
        if (!this.k) {
            this.b.d(this.g, 4);
            this.k = true;
        }
        this.b.a(this.c);
        return 0;
    }
    
    public final void l(final long n, final boolean b) {
        if (this.l) {
            return;
        }
        final int a = this.a;
        final boolean b2 = false;
        final boolean b3 = (a & 0x1) != 0x0 && this.i > 0;
        if (b3 && this.b.k() == -9223372036854775807L && !b) {
            return;
        }
        if (b3 && this.b.k() != -9223372036854775807L) {
            final t f = this.f;
            boolean b4 = b2;
            if ((this.a & 0x2) != 0x0) {
                b4 = true;
            }
            f.e(this.j(n, b4));
        }
        else {
            this.f.e(new M.b(-9223372036854775807L));
        }
        this.l = true;
    }
    
    public final int m(final s s) {
        int n = 0;
        while (true) {
            s.n(this.d.e(), 0, 10);
            this.d.T(0);
            if (this.d.J() != 4801587) {
                break;
            }
            this.d.U(3);
            final int f = this.d.F();
            n += f + 10;
            s.o(f);
        }
        s.h();
        s.o(n);
        if (this.h == -1L) {
            this.h = n;
        }
        return n;
    }
    
    @Override
    public void release() {
    }
}
