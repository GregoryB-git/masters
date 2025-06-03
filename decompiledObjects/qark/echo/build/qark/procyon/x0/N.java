// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import java.io.EOFException;
import g0.a;
import j0.c;
import g0.M;
import F0.T;
import java.util.Arrays;
import j0.i;
import java.nio.ByteBuffer;
import g0.z;
import B0.b;

public class N
{
    public final b a;
    public final int b;
    public final z c;
    public a d;
    public a e;
    public a f;
    public long g;
    
    public N(final b a) {
        this.a = a;
        final int e = a.e();
        this.b = e;
        this.c = new z(32);
        final a f = new a(0L, e);
        this.d = f;
        this.e = f;
        this.f = f;
    }
    
    public static a d(a d, final long n) {
        while (n >= d.b) {
            d = d.d;
        }
        return d;
    }
    
    public static a i(a a, long n, final ByteBuffer byteBuffer, int i) {
        a = d(a, n);
        while (i > 0) {
            final int min = Math.min(i, (int)(a.b - n));
            byteBuffer.put(a.c.a, a.e(n), min);
            final int n2 = i - min;
            final long n3 = n += min;
            i = n2;
            if (n3 == a.b) {
                a = a.d;
                n = n3;
                i = n2;
            }
        }
        return a;
    }
    
    public static a j(a a, long n, final byte[] array, final int n2) {
        a = d(a, n);
        int n3;
        long n4;
        for (int i = n2; i > 0; i = n3, n = n4) {
            final int min = Math.min(i, (int)(a.b - n));
            System.arraycopy(a.c.a, a.e(n), array, n2 - i, min);
            n3 = i - min;
            n4 = n + min;
            i = n3;
            n = n4;
            if (n4 == a.b) {
                a = a.d;
            }
        }
        return a;
    }
    
    public static a k(a a, final i i, final P.b b, final z z) {
        final long b2 = b.b;
        int m = 1;
        z.P(1);
        a = j(a, b2, z.e(), 1);
        final long n = b2 + 1L;
        final byte[] e = z.e();
        final int n2 = 0;
        final byte b3 = e[0];
        final boolean b4 = (b3 & 0x80) != 0x0;
        final int n3 = b3 & 0x7F;
        final c q = i.q;
        final byte[] a2 = q.a;
        if (a2 == null) {
            q.a = new byte[16];
        }
        else {
            Arrays.fill(a2, (byte)0);
        }
        final a j = j(a, n, q.a, n3);
        long n5;
        final long n4 = n5 = n + n3;
        a = j;
        if (b4) {
            z.P(2);
            a = j(j, n4, z.e(), 2);
            n5 = n4 + 2L;
            m = z.M();
        }
        final int[] d = q.d;
        while (true) {
            Label_0198: {
                if (d == null) {
                    break Label_0198;
                }
                final int[] array = d;
                if (d.length < m) {
                    break Label_0198;
                }
                final int[] e2 = q.e;
                while (true) {
                    Label_0236: {
                        if (e2 == null) {
                            break Label_0236;
                        }
                        final int[] array2 = e2;
                        if (e2.length < m) {
                            break Label_0236;
                        }
                        if (b4) {
                            final int n6 = m * 6;
                            z.P(n6);
                            final a k = j(a, n5, z.e(), n6);
                            final long n7 = n5 + n6;
                            z.T(0);
                            int n8 = n2;
                            while (true) {
                                n5 = n7;
                                a = k;
                                if (n8 >= m) {
                                    break;
                                }
                                array[n8] = z.M();
                                array2[n8] = z.K();
                                ++n8;
                            }
                        }
                        else {
                            array2[array[0] = 0] = b.a - (int)(n5 - b.b);
                        }
                        final T.a a3 = (T.a)M.i(b.c);
                        q.c(m, array, array2, a3.b, q.a, a3.a, a3.c, a3.d);
                        final long b5 = b.b;
                        final int n9 = (int)(n5 - b5);
                        b.b = b5 + n9;
                        b.a -= n9;
                        return a;
                    }
                    final int[] array2 = new int[m];
                    continue;
                }
            }
            final int[] array = new int[m];
            continue;
        }
    }
    
    public static a l(a j, final i i, final P.b b, final z z) {
        a a = j;
        if (i.D()) {
            a = k(j, i, b, z);
        }
        long n;
        ByteBuffer byteBuffer;
        if (i.o()) {
            z.P(4);
            j = j(a, b.b, z.e(), 4);
            final int k = z.K();
            b.b += 4L;
            b.a -= 4;
            i.z(k);
            a = i(j, b.b, i.r, k);
            b.b += k;
            i.G(b.a -= k);
            n = b.b;
            byteBuffer = i.u;
        }
        else {
            i.z(b.a);
            n = b.b;
            byteBuffer = i.r;
        }
        return i(a, n, byteBuffer, b.a);
    }
    
    public final void a(final a a) {
        if (a.c == null) {
            return;
        }
        this.a.b((b.a)a);
        a.b();
    }
    
    public void b(final long n) {
        if (n == -1L) {
            return;
        }
        a d;
        while (true) {
            d = this.d;
            if (n < d.b) {
                break;
            }
            this.a.c(d.c);
            this.d = this.d.b();
        }
        if (this.e.a < d.a) {
            this.e = d;
        }
    }
    
    public void c(final long g) {
        g0.a.a(g <= this.g);
        this.g = g;
        a a;
        if (g != 0L && g != (a = this.d).a) {
            while (this.g > a.b) {
                a = a.d;
            }
            final a a2 = (a)g0.a.e(a.d);
            this.a(a2);
            final a a3 = new a(a.b, this.b);
            a.d = a3;
            a f = a;
            if (this.g == a.b) {
                f = a3;
            }
            this.f = f;
            if (this.e == a2) {
                this.e = a3;
            }
        }
        else {
            this.a(this.d);
            final a f2 = new a(this.g, this.b);
            this.d = f2;
            this.e = f2;
            this.f = f2;
        }
    }
    
    public long e() {
        return this.g;
    }
    
    public void f(final i i, final P.b b) {
        l(this.e, i, b, this.c);
    }
    
    public final void g(final int n) {
        final long g = this.g + n;
        this.g = g;
        final a f = this.f;
        if (g == f.b) {
            this.f = f.d;
        }
    }
    
    public final int h(final int a) {
        final a f = this.f;
        if (f.c == null) {
            f.c(this.a.d(), new a(this.f.b, this.b));
        }
        return Math.min(a, (int)(this.f.b - this.g));
    }
    
    public void m(final i i, final P.b b) {
        this.e = l(this.e, i, b, this.c);
    }
    
    public void n() {
        this.a(this.d);
        this.d.d(0L, this.b);
        final a d = this.d;
        this.e = d;
        this.f = d;
        this.g = 0L;
        this.a.a();
    }
    
    public void o() {
        this.e = this.d;
    }
    
    public int p(final d0.i i, int n, final boolean b) {
        n = this.h(n);
        final a f = this.f;
        n = i.read(f.c.a, f.e(this.g), n);
        if (n != -1) {
            this.g(n);
            return n;
        }
        if (b) {
            return -1;
        }
        throw new EOFException();
    }
    
    public void q(final z z, int i) {
        while (i > 0) {
            final int h = this.h(i);
            final a f = this.f;
            z.l(f.c.a, f.e(this.g), h);
            i -= h;
            this.g(h);
        }
    }
    
    public static final class a implements b.a
    {
        public long a;
        public long b;
        public B0.a c;
        public a d;
        
        public a(final long n, final int n2) {
            this.d(n, n2);
        }
        
        @Override
        public B0.a a() {
            return (B0.a)g0.a.e(this.c);
        }
        
        public a b() {
            this.c = null;
            final a d = this.d;
            this.d = null;
            return d;
        }
        
        public void c(final B0.a c, final a d) {
            this.c = c;
            this.d = d;
        }
        
        public void d(final long a, final int n) {
            a.f(this.c == null);
            this.a = a;
            this.b = a + n;
        }
        
        public int e(final long n) {
            return (int)(n - this.a) + this.c.b;
        }
        
        @Override
        public b.a next() {
            final a d = this.d;
            if (d != null && d.c != null) {
                return d;
            }
            return null;
        }
    }
}
