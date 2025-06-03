// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m1;

import android.util.Pair;
import d0.A;
import g0.M;
import g0.a;
import g0.o;
import g0.z;
import F0.s;

public abstract class d
{
    public static boolean a(final s s) {
        final z z = new z(8);
        final int a = d.a.a(s, z).a;
        if (a != 1380533830 && a != 1380333108) {
            return false;
        }
        s.n(z.e(), 0, 4);
        z.T(0);
        final int p = z.p();
        if (p != 1463899717) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unsupported form type: ");
            sb.append(p);
            o.c("WavHeaderReader", sb.toString());
            return false;
        }
        return true;
    }
    
    public static c b(final s s) {
        final z z = new z(16);
        final a d = d(1718449184, s, z);
        g0.a.f(d.b >= 16L);
        s.n(z.e(), 0, 16);
        z.T(0);
        final int y = z.y();
        final int y2 = z.y();
        final int x = z.x();
        final int x2 = z.x();
        final int y3 = z.y();
        final int y4 = z.y();
        final int n = (int)d.b - 16;
        byte[] f;
        if (n > 0) {
            f = new byte[n];
            s.n(f, 0, n);
        }
        else {
            f = M.f;
        }
        s.i((int)(s.m() - s.p()));
        return new c(y, y2, x, x2, y3, y4, f);
    }
    
    public static long c(final s s) {
        final z z = new z(8);
        final a a = d.a.a(s, z);
        if (a.a != 1685272116) {
            s.h();
            return -1L;
        }
        s.o(8);
        z.T(0);
        s.n(z.e(), 0, 8);
        final long u = z.u();
        s.i((int)a.b + 8);
        return u;
    }
    
    public static a d(final int n, final s s, final z z) {
        while (true) {
            final a a = d.a.a(s, z);
            if (a.a == n) {
                return a;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(a.a);
            o.h("WavHeaderReader", sb.toString());
            final long b = a.b;
            long n2 = 8L + b;
            if (b % 2L != 0L) {
                n2 = 9L + b;
            }
            if (n2 > 2147483647L) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(a.a);
                throw A.d(sb2.toString());
            }
            s.i((int)n2);
        }
    }
    
    public static Pair e(final s s) {
        s.h();
        final a d = d(1684108385, s, new z(8));
        s.i(8);
        return Pair.create((Object)s.p(), (Object)d.b);
    }
    
    public static final class a
    {
        public final int a;
        public final long b;
        
        public a(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public static a a(final s s, final z z) {
            s.n(z.e(), 0, 8);
            z.T(0);
            return new a(z.p(), z.w());
        }
    }
}
