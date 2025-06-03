// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import F0.N;
import F0.Q;
import F0.U;
import F0.c;
import d0.i;
import F0.L;
import d0.A;
import W2.g;
import F0.E;
import F0.T;
import d0.q;
import h0.d;
import java.util.ArrayList;
import X2.v;
import java.util.List;
import java.util.ArrayDeque;
import g0.z;
import c1.t;
import U0.a;
import F0.x;
import F0.M;
import F0.r;

public final class m implements r, M
{
    public static final x B;
    public U0.a A;
    public final t.a a;
    public final int b;
    public final z c;
    public final z d;
    public final z e;
    public final z f;
    public final ArrayDeque g;
    public final p h;
    public final List i;
    public v j;
    public int k;
    public int l;
    public long m;
    public int n;
    public z o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public F0.t u;
    public a[] v;
    public long[][] w;
    public int x;
    public long y;
    public int z;
    
    static {
        B = new l();
    }
    
    public m(final t.a a, int n) {
        this.a = a;
        this.b = n;
        this.j = X2.v.Y();
        if ((n & 0x4) != 0x0) {
            n = 3;
        }
        else {
            n = 0;
        }
        this.k = n;
        this.h = new p();
        this.i = new ArrayList();
        this.f = new z(16);
        this.g = new ArrayDeque();
        this.c = new z(h0.d.a);
        this.d = new z(4);
        this.e = new z();
        this.p = -1;
        this.u = F0.t.a;
        this.v = new a[0];
    }
    
    public static int B(final z z) {
        z.T(8);
        final int o = o(z.p());
        if (o != 0) {
            return o;
        }
        z.U(4);
        while (z.a() > 0) {
            final int o2 = o(z.p());
            if (o2 != 0) {
                return o2;
            }
        }
        return 0;
    }
    
    public static boolean I(final int n) {
        return n == 1836019574 || n == 1953653099 || n == 1835297121 || n == 1835626086 || n == 1937007212 || n == 1701082227 || n == 1835365473;
    }
    
    public static boolean J(final int n) {
        return n == 1835296868 || n == 1836476516 || n == 1751411826 || n == 1937011556 || n == 1937011827 || n == 1937011571 || n == 1668576371 || n == 1701606260 || n == 1937011555 || n == 1937011578 || n == 1937013298 || n == 1937007471 || n == 1668232756 || n == 1953196132 || n == 1718909296 || n == 1969517665 || n == 1801812339 || n == 1768715124;
    }
    
    public static int o(final int n) {
        if (n == 1751476579) {
            return 2;
        }
        if (n != 1903435808) {
            return 0;
        }
        return 1;
    }
    
    public static long[][] p(final a[] array) {
        final long[][] array2 = new long[array.length][];
        final int[] array3 = new int[array.length];
        final long[] array4 = new long[array.length];
        final boolean[] array5 = new boolean[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new long[array[i].b.b];
            array4[i] = array[i].b.f[0];
        }
        long n = 0L;
        int j = 0;
        while (j < array.length) {
            long n2 = Long.MAX_VALUE;
            int n3 = -1;
            long n4;
            int n5;
            for (int k = 0; k < array.length; ++k, n2 = n4, n3 = n5) {
                n4 = n2;
                n5 = n3;
                if (!array5[k]) {
                    final long n6 = array4[k];
                    n4 = n2;
                    n5 = n3;
                    if (n6 <= n2) {
                        n5 = k;
                        n4 = n6;
                    }
                }
            }
            final int n7 = array3[n3];
            final long[] array6 = array2[n3];
            array6[n7] = n;
            final Z0.v b = array[n3].b;
            n += b.d[n7];
            final int n8 = n7 + 1;
            if ((array3[n3] = n8) < array6.length) {
                array4[n3] = b.f[n8];
            }
            else {
                array5[n3] = true;
                ++j;
            }
        }
        return array2;
    }
    
    public static int t(final Z0.v v, final long n) {
        int n2;
        if ((n2 = v.a(n)) == -1) {
            n2 = v.b(n);
        }
        return n2;
    }
    
    public static long x(final Z0.v v, final long n, final long b) {
        final int t = t(v, n);
        if (t == -1) {
            return b;
        }
        return Math.min(v.c[t], b);
    }
    
    public final void A() {
        if (this.z == 2 && (this.b & 0x2) != 0x0) {
            final T a = this.u.a(0, 4);
            d0.x x;
            if (this.A == null) {
                x = null;
            }
            else {
                x = new d0.x(new d0.x.b[] { this.A });
            }
            a.d(new q.b().h0(x).K());
            this.u.j();
            this.u.e(new b(-9223372036854775807L));
        }
    }
    
    public final void C(final Z0.a.a a) {
        final ArrayList<a> list = new ArrayList<a>();
        final int z = this.z;
        int n = 1;
        final boolean b = z == 1;
        final E e = new E();
        final Z0.a.b g = a.g(1969517665);
        d0.x c;
        if (g != null) {
            c = Z0.b.C(g);
            e.c(c);
        }
        else {
            c = null;
        }
        final Z0.a.a f = a.f(1835365473);
        d0.x p;
        if (f != null) {
            p = Z0.b.p(f);
        }
        else {
            p = null;
        }
        final d0.x x = new d0.x(new d0.x.b[] { Z0.b.r(((Z0.a.b)g0.a.e(a.g(1836476516))).b) });
        final List b2 = Z0.b.B(a, e, -9223372036854775807L, null, (this.b & 0x1) != 0x0, b, new k());
        long max = -9223372036854775807L;
        int n2;
        int i = n2 = 0;
        int x2 = -1;
        while (i < b2.size()) {
            final Z0.v v = b2.get(i);
            if (v.b != 0) {
                final s a2 = v.a;
                long b3 = a2.e;
                if (b3 == -9223372036854775807L) {
                    b3 = v.h;
                }
                max = Math.max(max, b3);
                final a a3 = new a(a2, v, this.u.a(n2, a2.b));
                int n3;
                if ("audio/true-hd".equals(a2.f.n)) {
                    n3 = v.e * 16;
                }
                else {
                    n3 = v.e + 30;
                }
                final q.b a4 = a2.f.a();
                a4.f0(n3);
                if (a2.b == 2) {
                    if ((this.b & 0x8) != 0x0) {
                        final int f2 = a2.f.f;
                        int n4;
                        if (x2 == -1) {
                            n4 = 1;
                        }
                        else {
                            n4 = 2;
                        }
                        a4.m0(f2 | n4);
                    }
                    if (b3 > 0L) {
                        final int b4 = v.b;
                        if (b4 > 0) {
                            a4.X(b4 / (b3 / 1000000.0f));
                        }
                    }
                }
                Z0.j.k(a2.b, e, a4);
                final int b5 = a2.b;
                d0.x x3;
                if (this.i.isEmpty()) {
                    x3 = null;
                }
                else {
                    x3 = new d0.x(this.i);
                }
                Z0.j.l(b5, p, a4, x3, c, x);
                a3.c.d(a4.K());
                int size;
                if (a2.b == 2) {
                    if ((size = x2) == -1) {
                        size = list.size();
                    }
                }
                else {
                    size = x2;
                }
                list.add(a3);
                ++n2;
                final int n5 = 1;
                x2 = size;
                n = n5;
            }
            i += n;
        }
        this.x = x2;
        this.y = max;
        final a[] v2 = list.toArray(new a[0]);
        this.v = v2;
        this.w = p(v2);
        this.u.j();
        this.u.e(this);
    }
    
    public final void D(final long n) {
        if (this.l == 1836086884) {
            final int n2 = this.n;
            this.A = new U0.a(0L, n, -9223372036854775807L, n + n2, this.m - n2);
        }
    }
    
    public final boolean E(final F0.s s) {
        if (this.n == 0) {
            if (!s.d(this.f.e(), 0, 8, true)) {
                this.A();
                return false;
            }
            this.n = 8;
            this.f.T(0);
            this.m = this.f.I();
            this.l = this.f.p();
        }
        final long m = this.m;
        Label_0202: {
            long l;
            if (m == 1L) {
                s.readFully(this.f.e(), 8, 8);
                this.n += 8;
                l = this.f.L();
            }
            else {
                if (m != 0L) {
                    break Label_0202;
                }
                long n2;
                final long n = n2 = s.a();
                if (n == -1L) {
                    final Z0.a.a a = this.g.peek();
                    n2 = n;
                    if (a != null) {
                        n2 = a.b;
                    }
                }
                if (n2 == -1L) {
                    break Label_0202;
                }
                l = n2 - s.p() + this.n;
            }
            this.m = l;
        }
        if (this.m < this.n) {
            throw d0.A.d("Atom size less than header length (unsupported).");
        }
        if (!I(this.l)) {
            z o;
            if (J(this.l)) {
                g0.a.f(this.n == 8);
                g0.a.f(this.m <= 2147483647L);
                o = new z((int)this.m);
                System.arraycopy(this.f.e(), 0, o.e(), 0, 8);
            }
            else {
                this.D(s.p() - this.n);
                o = null;
            }
            this.o = o;
            this.k = 1;
            return true;
        }
        final long p = s.p();
        final long i = this.m;
        final int n3 = this.n;
        final long n4 = p + i - n3;
        if (i != n3 && this.l == 1835365473) {
            this.y(s);
        }
        this.g.push(new Z0.a.a(this.l, n4));
        if (this.m == this.n) {
            this.z(n4);
            return true;
        }
        this.q();
        return true;
    }
    
    public final boolean F(final F0.s s, final L l) {
        final long n = this.m - this.n;
        final long p2 = s.p();
        final z o = this.o;
        boolean b = false;
        Label_0174: {
            if (o != null) {
                s.readFully(o.e(), this.n, (int)n);
                if (this.l == 1718909296) {
                    this.t = true;
                    this.z = B(o);
                }
                else if (!this.g.isEmpty()) {
                    ((Z0.a.a)this.g.peek()).e(new Z0.a.b(this.l, o));
                }
            }
            else {
                if (!this.t && this.l == 1835295092) {
                    this.z = 1;
                }
                if (n >= 262144L) {
                    l.a = s.p() + n;
                    b = true;
                    break Label_0174;
                }
                s.i((int)n);
            }
            b = false;
        }
        this.z(p2 + n);
        return b && this.k != 2;
    }
    
    public final int G(final F0.s s, final L l) {
        final long p2 = s.p();
        if (this.p == -1 && (this.p = this.u(p2)) == -1) {
            return -1;
        }
        final a a = this.v[this.p];
        final T c = a.c;
        final int e = a.e;
        final Z0.v b = a.b;
        final long a2 = b.c[e];
        final int n = b.d[e];
        final U d = a.d;
        final long n2 = a2 - p2 + this.q;
        if (n2 >= 0L && n2 < 262144L) {
            long n3 = n2;
            int n4 = n;
            if (a.a.g == 1) {
                n3 = n2 + 8L;
                n4 = n - 8;
            }
            s.i((int)n3);
            final s a3 = a.a;
            int n6;
            if (a3.j != 0) {
                final byte[] e2 = this.d.e();
                e2[0] = 0;
                e2[2] = (e2[1] = 0);
                final int j = a.a.j;
                final int n5 = 4 - j;
                while (true) {
                    n6 = n4;
                    if (this.r >= n4) {
                        break;
                    }
                    final int s2 = this.s;
                    if (s2 == 0) {
                        s.readFully(e2, n5, j);
                        this.q += j;
                        this.d.T(0);
                        final int p3 = this.d.p();
                        if (p3 < 0) {
                            throw d0.A.a("Invalid NAL length", null);
                        }
                        this.s = p3;
                        this.c.T(0);
                        c.e(this.c, 4);
                        this.r += 4;
                        n4 += n5;
                    }
                    else {
                        final int f = c.f(s, s2, false);
                        this.q += f;
                        this.r += f;
                        this.s -= f;
                    }
                }
            }
            else {
                int n7;
                if ("audio/ac4".equals(a3.f.n)) {
                    if (this.r == 0) {
                        F0.c.a(n4, this.e);
                        c.e(this.e, 7);
                        this.r += 7;
                    }
                    n7 = n4 + 7;
                }
                else {
                    n7 = n4;
                    if (d != null) {
                        d.d(s);
                        n7 = n4;
                    }
                }
                while (true) {
                    final int r = this.r;
                    if (r >= (n6 = n7)) {
                        break;
                    }
                    final int f2 = c.f(s, n7 - r, false);
                    this.q += f2;
                    this.r += f2;
                    this.s -= f2;
                }
            }
            final Z0.v b2 = a.b;
            final long n8 = b2.f[e];
            final int n9 = b2.g[e];
            if (d != null) {
                d.c(c, n8, n9, n6, 0, null);
                if (e + 1 == a.b.b) {
                    d.a(c, null);
                }
            }
            else {
                c.b(n8, n9, n6, 0, null);
            }
            ++a.e;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            return this.s = 0;
        }
        l.a = a2;
        return 1;
    }
    
    public final int H(final F0.s s, final L l) {
        final int c = this.h.c(s, l, this.i);
        if (c == 1 && l.a == 0L) {
            this.q();
        }
        return c;
    }
    
    public final void K(final a a, final long n) {
        final Z0.v b = a.b;
        int e;
        if ((e = b.a(n)) == -1) {
            e = b.b(n);
        }
        a.e = e;
    }
    
    @Override
    public void a(final long n, final long n2) {
        this.g.clear();
        int i = 0;
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        if (n != 0L) {
            for (a[] v = this.v; i < v.length; ++i) {
                final a a = v[i];
                this.K(a, n2);
                final U d = a.d;
                if (d != null) {
                    d.b();
                }
            }
            return;
        }
        if (this.k != 3) {
            this.q();
            return;
        }
        this.h.g();
        this.i.clear();
    }
    
    @Override
    public void b(final F0.t t) {
        F0.t u = t;
        if ((this.b & 0x10) == 0x0) {
            u = new c1.v(t, this.a);
        }
        this.u = u;
    }
    
    @Override
    public boolean e(final F0.s s) {
        final int b = this.b;
        final boolean b2 = false;
        final Q d = Z0.r.d(s, (b & 0x2) != 0x0);
        v j;
        if (d != null) {
            j = X2.v.Z(d);
        }
        else {
            j = X2.v.Y();
        }
        this.j = j;
        boolean b3 = b2;
        if (d == null) {
            b3 = true;
        }
        return b3;
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    @Override
    public int i(final F0.s s, final L l) {
        while (true) {
            final int k = this.k;
            if (k != 0) {
                if (k != 1) {
                    if (k == 2) {
                        return this.G(s, l);
                    }
                    if (k == 3) {
                        return this.H(s, l);
                    }
                    throw new IllegalStateException();
                }
                else {
                    if (this.F(s, l)) {
                        return 1;
                    }
                    continue;
                }
            }
            else {
                if (!this.E(s)) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    @Override
    public M.a j(final long n) {
        return this.r(n, -1);
    }
    
    @Override
    public long l() {
        return this.y;
    }
    
    public final void q() {
        this.k = 0;
        this.n = 0;
    }
    
    public M.a r(long n, int n2) {
        final a[] v = this.v;
        if (v.length == 0) {
            return new M.a(N.c);
        }
        int x;
        if (n2 != -1) {
            x = n2;
        }
        else {
            x = this.x;
        }
        long n3 = 0L;
        long n6 = 0L;
        long n7 = 0L;
        Label_0224: {
            long n5;
            if (x != -1) {
                final Z0.v b = v[x].b;
                final int t = t(b, n);
                if (t == -1) {
                    return new M.a(N.c);
                }
                n3 = b.f[t];
                final long n4 = b.c[t];
                n5 = n3;
                n6 = n4;
                if (n3 < n) {
                    n5 = n3;
                    n6 = n4;
                    if (t < b.b - 1) {
                        final int b2 = b.b(n);
                        n5 = n3;
                        n6 = n4;
                        if (b2 != -1) {
                            n5 = n3;
                            n6 = n4;
                            if (b2 != t) {
                                n7 = b.f[b2];
                                n = b.c[b2];
                                n6 = n4;
                                break Label_0224;
                            }
                        }
                    }
                }
            }
            else {
                n6 = Long.MAX_VALUE;
                n5 = n;
            }
            n = -1L;
            final long n8 = -9223372036854775807L;
            n3 = n5;
            n7 = n8;
        }
        long n9 = n;
        long n10 = n6;
        if (n2 == -1) {
            n2 = 0;
            while (true) {
                final a[] v2 = this.v;
                n9 = n;
                n10 = n6;
                if (n2 >= v2.length) {
                    break;
                }
                long n11 = n;
                long x2 = n6;
                if (n2 != this.x) {
                    final Z0.v b3 = v2[n2].b;
                    x2 = x(b3, n3, n6);
                    long x3 = n;
                    if (n7 != -9223372036854775807L) {
                        x3 = x(b3, n7, n);
                    }
                    n11 = x3;
                }
                ++n2;
                n = n11;
                n6 = x2;
            }
        }
        final N n12 = new N(n3, n10);
        if (n7 == -9223372036854775807L) {
            return new M.a(n12);
        }
        return new M.a(n12, new N(n7, n9));
    }
    
    @Override
    public void release() {
    }
    
    public v s() {
        return this.j;
    }
    
    public final int u(final long n) {
        int n2 = -1;
        int n3 = -1;
        int n4 = 0;
        long n5 = Long.MAX_VALUE;
        boolean b = true;
        long n6 = Long.MAX_VALUE;
        boolean b2 = true;
        long n7 = Long.MAX_VALUE;
        while (true) {
            final a[] v = this.v;
            if (n4 >= v.length) {
                break;
            }
            final a a = v[n4];
            final int e = a.e;
            final Z0.v b3 = a.b;
            long n8;
            if (e == b3.b) {
                n8 = n5;
            }
            else {
                final long n9 = b3.c[e];
                final long n10 = ((long[][])g0.M.i(this.w))[n4][e];
                final long n11 = n9 - n;
                final boolean b4 = n11 < 0L || n11 >= 262144L;
                int n12 = 0;
                long n13 = 0L;
                boolean b5 = false;
                long n14 = 0L;
                Label_0212: {
                    if (b4 || !b2) {
                        n12 = n3;
                        n13 = n6;
                        b5 = b2;
                        n14 = n7;
                        if (b4 != b2) {
                            break Label_0212;
                        }
                        n12 = n3;
                        n13 = n6;
                        b5 = b2;
                        n14 = n7;
                        if (n11 >= n7) {
                            break Label_0212;
                        }
                    }
                    b5 = b4;
                    n14 = n11;
                    n12 = n4;
                    n13 = n10;
                }
                n3 = n12;
                n8 = n5;
                n6 = n13;
                b2 = b5;
                n7 = n14;
                if (n10 < n5) {
                    n2 = n4;
                    n7 = n14;
                    b2 = b5;
                    n6 = n13;
                    b = b4;
                    n8 = n10;
                    n3 = n12;
                }
            }
            ++n4;
            n5 = n8;
        }
        if (n5 == Long.MAX_VALUE || !b || n6 < n5 + 10485760L) {
            n2 = n3;
        }
        return n2;
    }
    
    public final void y(final F0.s s) {
        this.e.P(8);
        s.n(this.e.e(), 0, 8);
        Z0.b.f(this.e);
        s.i(this.e.f());
        s.h();
    }
    
    public final void z(final long n) {
        while (!this.g.isEmpty() && this.g.peek().b == n) {
            final Z0.a.a a = this.g.pop();
            if (a.a == 1836019574) {
                this.C(a);
                this.g.clear();
                this.k = 2;
            }
            else {
                if (this.g.isEmpty()) {
                    continue;
                }
                ((Z0.a.a)this.g.peek()).d(a);
            }
        }
        if (this.k != 2) {
            this.q();
        }
    }
    
    public static final class a
    {
        public final s a;
        public final Z0.v b;
        public final T c;
        public final U d;
        public int e;
        
        public a(final s a, final Z0.v b, final T c) {
            this.a = a;
            this.b = b;
            this.c = c;
            U d;
            if ("audio/true-hd".equals(a.f.n)) {
                d = new U();
            }
            else {
                d = null;
            }
            this.d = d;
        }
    }
}
