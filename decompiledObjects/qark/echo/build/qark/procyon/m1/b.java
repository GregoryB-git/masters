// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m1;

import d0.i;
import g0.z;
import android.util.Pair;
import g0.o;
import F0.X;
import d0.A;
import F0.L;
import java.util.List;
import F0.s;
import F0.q;
import g0.M;
import F0.T;
import F0.t;
import F0.x;
import F0.r;

public final class b implements r
{
    public static final x h;
    public t a;
    public T b;
    public int c;
    public long d;
    public b e;
    public int f;
    public long g;
    
    static {
        h = new m1.a();
    }
    
    public b() {
        this.c = 0;
        this.d = -1L;
        this.f = -1;
        this.g = -1L;
    }
    
    private void f() {
        g0.a.h(this.b);
        M.i(this.a);
    }
    
    @Override
    public void a(final long n, final long n2) {
        int c;
        if (n == 0L) {
            c = 0;
        }
        else {
            c = 4;
        }
        this.c = c;
        final b e = this.e;
        if (e != null) {
            e.c(n2);
        }
    }
    
    @Override
    public void b(final t a) {
        this.a = a;
        this.b = a.a(0, 1);
        a.j();
    }
    
    @Override
    public boolean e(final s s) {
        return m1.d.a(s);
    }
    
    @Override
    public int i(final s s, final L l) {
        this.f();
        final int c = this.c;
        if (c == 0) {
            this.j(s);
            return 0;
        }
        if (c == 1) {
            this.l(s);
            return 0;
        }
        if (c == 2) {
            this.k(s);
            return 0;
        }
        if (c == 3) {
            this.n(s);
            return 0;
        }
        if (c == 4) {
            return this.m(s);
        }
        throw new IllegalStateException();
    }
    
    public final void j(final s s) {
        g0.a.f(s.p() == 0L);
        final int f = this.f;
        if (f != -1) {
            s.i(f);
            this.c = 4;
            return;
        }
        if (m1.d.a(s)) {
            s.i((int)(s.m() - s.p()));
            this.c = 1;
            return;
        }
        throw A.a("Unsupported or unrecognized wav file type.", null);
    }
    
    public final void k(final s s) {
        final m1.c b = m1.d.b(s);
        final int a = b.a;
        b e;
        if (a == 17) {
            e = new a(this.a, this.b, b);
        }
        else if (a == 6) {
            e = new c(this.a, this.b, b, "audio/g711-alaw", -1);
        }
        else if (a == 7) {
            e = new c(this.a, this.b, b, "audio/g711-mlaw", -1);
        }
        else {
            final int a2 = X.a(a, b.f);
            if (a2 == 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported WAV format type: ");
                sb.append(b.a);
                throw A.d(sb.toString());
            }
            e = new c(this.a, this.b, b, "audio/raw", a2);
        }
        this.e = e;
        this.c = 3;
    }
    
    public final void l(final s s) {
        this.d = m1.d.c(s);
        this.c = 2;
    }
    
    public final int m(final s s) {
        final long g = this.g;
        int n = 0;
        g0.a.f(g != -1L);
        if (((b)g0.a.e(this.e)).a(s, this.g - s.p())) {
            n = -1;
        }
        return n;
    }
    
    public final void n(final s s) {
        final Pair e = m1.d.e(s);
        this.f = ((Long)e.first).intValue();
        final long longValue = (long)e.second;
        final long d = this.d;
        long n = longValue;
        if (d != -1L) {
            n = longValue;
            if (longValue == 4294967295L) {
                n = d;
            }
        }
        this.g = this.f + n;
        final long a = s.a();
        if (a != -1L && this.g > a) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Data exceeds input length: ");
            sb.append(this.g);
            sb.append(", ");
            sb.append(a);
            o.h("WavExtractor", sb.toString());
            this.g = a;
        }
        ((b)g0.a.e(this.e)).b(this.f, this.g);
        this.c = 4;
    }
    
    @Override
    public void release() {
    }
    
    public static final class a implements b
    {
        public static final int[] m;
        public static final int[] n;
        public final t a;
        public final T b;
        public final m1.c c;
        public final int d;
        public final byte[] e;
        public final z f;
        public final int g;
        public final d0.q h;
        public int i;
        public long j;
        public int k;
        public long l;
        
        static {
            m = new int[] { -1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8 };
            n = new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
        }
        
        public a(final t a, final T b, final m1.c c) {
            this.a = a;
            this.b = b;
            this.c = c;
            final int max = Math.max(1, c.c / 10);
            this.g = max;
            final z z = new z(c.g);
            z.y();
            final int y = z.y();
            this.d = y;
            final int b2 = c.b;
            final int i = (c.e - b2 * 4) * 8 / (c.f * b2) + 1;
            if (y == i) {
                final int k = M.k(max, y);
                this.e = new byte[c.e * k];
                this.f = new z(k * h(y, b2));
                final int n = c.c * c.e * 8 / y;
                this.h = new d0.q.b().o0("audio/raw").M(n).j0(n).f0(h(max, b2)).N(c.b).p0(c.c).i0(2).K();
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected frames per block: ");
            sb.append(i);
            sb.append("; got: ");
            sb.append(y);
            throw A.a(sb.toString(), null);
        }
        
        public static int h(final int n, final int n2) {
            return n * 2 * n2;
        }
        
        @Override
        public boolean a(final s s, final long b) {
            final int n = M.k(this.g - this.f(this.k), this.d) * this.c.e;
            while (true) {
                Label_0036: {
                    if (b == 0L) {
                        break Label_0036;
                    }
                    final boolean b2 = false;
                    while (!b2) {
                        final int i = this.i;
                        if (i >= n) {
                            break;
                        }
                        final int read = s.read(this.e, this.i, (int)Math.min(n - i, b));
                        if (read == -1) {
                            break Label_0036;
                        }
                        this.i += read;
                    }
                    final int n2 = this.i / this.c.e;
                    if (n2 > 0) {
                        this.d(this.e, n2, this.f);
                        this.i -= n2 * this.c.e;
                        final int g = this.f.g();
                        this.b.e(this.f, g);
                        final int k = this.k + g;
                        this.k = k;
                        final int f = this.f(k);
                        final int g2 = this.g;
                        if (f >= g2) {
                            this.i(g2);
                        }
                    }
                    if (b2) {
                        final int f2 = this.f(this.k);
                        if (f2 > 0) {
                            this.i(f2);
                        }
                    }
                    return b2;
                }
                final boolean b2 = true;
                continue;
            }
        }
        
        @Override
        public void b(final int n, final long n2) {
            this.a.e(new e(this.c, this.d, n, n2));
            this.b.d(this.h);
        }
        
        @Override
        public void c(final long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }
        
        public final void d(final byte[] array, int g, final z z) {
            for (int i = 0; i < g; ++i) {
                for (int j = 0; j < this.c.b; ++j) {
                    this.e(array, i, j, z.e());
                }
            }
            g = this.g(this.d * g);
            z.T(0);
            z.S(g);
        }
        
        public final void e(final byte[] array, int i, int p4, final byte[] array2) {
            final m1.c c = this.c;
            final int e = c.e;
            final int b = c.b;
            final int n = i * e + p4 * 4;
            final int n2 = e / b;
            int p5 = (short)((array[n + 1] & 0xFF) << 8 | (array[n] & 0xFF));
            final int min = Math.min(array[n + 2] & 0xFF, 88);
            int n3 = m1.b.a.n[min];
            int n4 = (i * this.d * b + p4) * 2;
            array2[n4] = (byte)(p5 & 0xFF);
            array2[n4 + 1] = (byte)(p5 >> 8);
            i = 0;
            p4 = min;
            while (i < (n2 - 4) * 2) {
                final byte b2 = array[i / 8 * b * 4 + (b * 4 + n) + i / 2 % 4];
                int n5;
                if (i % 2 == 0) {
                    n5 = (b2 & 0xF);
                }
                else {
                    n5 = (b2 & 0xFF) >> 4;
                }
                int n6 = ((n5 & 0x7) * 2 + 1) * n3 >> 3;
                if ((n5 & 0x8) != 0x0) {
                    n6 = -n6;
                }
                p5 = M.p(p5 + n6, -32768, 32767);
                n4 += b * 2;
                array2[n4] = (byte)(p5 & 0xFF);
                array2[n4 + 1] = (byte)(p5 >> 8);
                final int n7 = m1.b.a.m[n5];
                final int[] n8 = m1.b.a.n;
                p4 = M.p(p4 + n7, 0, n8.length - 1);
                n3 = n8[p4];
                ++i;
            }
        }
        
        public final int f(final int n) {
            return n / (this.c.b * 2);
        }
        
        public final int g(final int n) {
            return h(n, this.c.b);
        }
        
        public final void i(final int n) {
            final long j = this.j;
            final long w0 = M.W0(this.l, 1000000L, this.c.c);
            final int g = this.g(n);
            this.b.b(j + w0, 1, g, this.k - g, null);
            this.l += n;
            this.k -= g;
        }
    }
    
    public interface b
    {
        boolean a(final s p0, final long p1);
        
        void b(final int p0, final long p1);
        
        void c(final long p0);
    }
    
    public static final class c implements b
    {
        public final t a;
        public final T b;
        public final m1.c c;
        public final d0.q d;
        public final int e;
        public long f;
        public int g;
        public long h;
        
        public c(final t a, final T b, final m1.c c, final String s, final int n) {
            this.a = a;
            this.b = b;
            this.c = c;
            final int n2 = c.b * c.f / 8;
            if (c.e == n2) {
                final int c2 = c.c;
                final int n3 = c2 * n2 * 8;
                final int max = Math.max(n2, c2 * n2 / 10);
                this.e = max;
                this.d = new d0.q.b().o0(s).M(n3).j0(n3).f0(max).N(c.b).p0(c.c).i0(n).K();
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected block size: ");
            sb.append(n2);
            sb.append("; got: ");
            sb.append(c.e);
            throw A.a(sb.toString(), null);
        }
        
        @Override
        public boolean a(final s s, long f) {
            long n;
            while (true) {
                n = lcmp(f, 0L);
                if (n <= 0) {
                    break;
                }
                final int g = this.g;
                final int e = this.e;
                if (g >= e) {
                    break;
                }
                final int f2 = this.b.f(s, (int)Math.min(e - g, f), true);
                if (f2 == -1) {
                    f = 0L;
                }
                else {
                    this.g += f2;
                    f -= f2;
                }
            }
            final m1.c c = this.c;
            final int e2 = c.e;
            final int n2 = this.g / e2;
            if (n2 > 0) {
                f = this.f;
                final long w0 = M.W0(this.h, 1000000L, c.c);
                final int n3 = n2 * e2;
                final int g2 = this.g - n3;
                this.b.b(f + w0, 1, n3, g2, null);
                this.h += n2;
                this.g = g2;
            }
            return n <= 0;
        }
        
        @Override
        public void b(final int n, final long n2) {
            this.a.e(new e(this.c, 1, n, n2));
            this.b.d(this.d);
        }
        
        @Override
        public void c(final long f) {
            this.f = f;
            this.g = 0;
            this.h = 0L;
        }
    }
}
