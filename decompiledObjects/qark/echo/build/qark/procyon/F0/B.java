// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.util.Collections;
import g0.M;
import d0.q;
import java.util.List;
import g0.y;
import d0.x;

public final class B
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    public final x l;
    
    public B(final int a, final int b, final int c, final int d, final int e, final int g, final int h, final long j, final a k, final x l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = j(e);
        this.g = g;
        this.h = h;
        this.i = e(h);
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public B(final byte[] array, int h) {
        final y y = new y(array);
        y.p(h * 8);
        this.a = y.h(16);
        this.b = y.h(16);
        this.c = y.h(24);
        this.d = y.h(24);
        h = y.h(20);
        this.e = h;
        this.f = j(h);
        this.g = y.h(3) + 1;
        h = y.h(5) + 1;
        this.h = h;
        this.i = e(h);
        this.j = y.j(36);
        this.k = null;
        this.l = null;
    }
    
    public static int e(final int n) {
        if (n == 8) {
            return 1;
        }
        if (n == 12) {
            return 2;
        }
        if (n == 16) {
            return 4;
        }
        if (n == 20) {
            return 5;
        }
        if (n != 24) {
            return -1;
        }
        return 6;
    }
    
    public static int j(final int n) {
        switch (n) {
            default: {
                return -1;
            }
            case 192000: {
                return 3;
            }
            case 176400: {
                return 2;
            }
            case 96000: {
                return 11;
            }
            case 88200: {
                return 1;
            }
            case 48000: {
                return 10;
            }
            case 44100: {
                return 9;
            }
            case 32000: {
                return 8;
            }
            case 24000: {
                return 7;
            }
            case 22050: {
                return 6;
            }
            case 16000: {
                return 5;
            }
            case 8000: {
                return 4;
            }
        }
    }
    
    public B a(final List list) {
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, this.h(new x(list)));
    }
    
    public B b(final a a) {
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, a, this.l);
    }
    
    public B c(final List list) {
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, this.h(W.d(list)));
    }
    
    public long d() {
        final int d = this.d;
        long n;
        long n2;
        if (d > 0) {
            n = (d + (long)this.c) / 2L;
            n2 = 1L;
        }
        else {
            final int a = this.a;
            long n3;
            if (a == this.b && a > 0) {
                n3 = a;
            }
            else {
                n3 = 4096L;
            }
            n = n3 * this.g * this.h / 8L;
            n2 = 64L;
        }
        return n + n2;
    }
    
    public long f() {
        final long j = this.j;
        if (j == 0L) {
            return -9223372036854775807L;
        }
        return j * 1000000L / this.e;
    }
    
    public q g(final byte[] o, x h) {
        o[4] = -128;
        int d = this.d;
        if (d <= 0) {
            d = -1;
        }
        h = this.h(h);
        return new q.b().o0("audio/flac").f0(d).N(this.g).p0(this.e).i0(M.e0(this.h)).b0(Collections.singletonList(o)).h0(h).K();
    }
    
    public x h(final x x) {
        final x l = this.l;
        if (l == null) {
            return x;
        }
        return l.b(x);
    }
    
    public long i(final long n) {
        return M.q(n * this.e / 1000000L, 0L, this.j - 1L);
    }
    
    public static class a
    {
        public final long[] a;
        public final long[] b;
        
        public a(final long[] a, final long[] b) {
            this.a = a;
            this.b = b;
        }
    }
}
