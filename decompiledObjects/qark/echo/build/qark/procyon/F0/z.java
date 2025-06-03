// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.util.Arrays;
import java.util.List;
import X2.v;
import R0.a;
import g0.y;
import T0.h;
import d0.x;
import d0.A;

public abstract class z
{
    public static boolean a(final s s) {
        final g0.z z = new g0.z(4);
        final byte[] e = z.e();
        boolean b = false;
        s.n(e, 0, 4);
        if (z.I() == 1716281667L) {
            b = true;
        }
        return b;
    }
    
    public static int b(final s s) {
        s.h();
        final g0.z z = new g0.z(2);
        s.n(z.e(), 0, 2);
        final int m = z.M();
        s.h();
        if (m >> 2 == 16382) {
            return m;
        }
        throw A.a("First frame does not start with sync code.", null);
    }
    
    public static x c(final s s, final boolean b) {
        final x x = null;
        Object b2;
        if (b) {
            b2 = null;
        }
        else {
            b2 = h.b;
        }
        final x a = new G().a(s, (h.a)b2);
        x x2 = x;
        if (a != null) {
            if (a.e() == 0) {
                return null;
            }
            x2 = a;
        }
        return x2;
    }
    
    public static x d(final s s, final boolean b) {
        s.h();
        final long m = s.m();
        final x c = c(s, b);
        s.i((int)(s.m() - m));
        return c;
    }
    
    public static boolean e(final s s, final a a) {
        s.h();
        final y y = new y(new byte[4]);
        s.n(y.a, 0, 4);
        final boolean g = y.g();
        final int h = y.h(7);
        final int n = y.h(24) + 4;
        B a2;
        if (h == 0) {
            a2 = h(s);
        }
        else {
            final B a3 = a.a;
            if (a3 == null) {
                throw new IllegalArgumentException();
            }
            if (h == 3) {
                a2 = a3.b(f(s, n));
            }
            else if (h == 4) {
                a2 = a3.c(j(s, n));
            }
            else {
                if (h != 6) {
                    s.i(n);
                    return g;
                }
                final g0.z z = new g0.z(n);
                s.readFully(z.e(), 0, n);
                z.U(4);
                a2 = a3.a(v.Z(a.a(z)));
            }
        }
        a.a = a2;
        return g;
    }
    
    public static B.a f(final s s, final int n) {
        final g0.z z = new g0.z(n);
        s.readFully(z.e(), 0, n);
        return g(z);
    }
    
    public static B.a g(final g0.z z) {
        z.U(1);
        final int j = z.J();
        final long n = z.f();
        final long n2 = j;
        final int n3 = j / 18;
        final long[] original = new long[n3];
        final long[] original2 = new long[n3];
        int n4 = 0;
        long[] copy;
        long[] copy2;
        while (true) {
            copy = original;
            copy2 = original2;
            if (n4 >= n3) {
                break;
            }
            final long z2 = z.z();
            if (z2 == -1L) {
                copy = Arrays.copyOf(original, n4);
                copy2 = Arrays.copyOf(original2, n4);
                break;
            }
            original[n4] = z2;
            original2[n4] = z.z();
            z.U(2);
            ++n4;
        }
        z.U((int)(n + n2 - z.f()));
        return new B.a(copy, copy2);
    }
    
    public static B h(final s s) {
        final byte[] array = new byte[38];
        s.readFully(array, 0, 38);
        return new B(array, 4);
    }
    
    public static void i(final s s) {
        final g0.z z = new g0.z(4);
        s.readFully(z.e(), 0, 4);
        if (z.I() == 1716281667L) {
            return;
        }
        throw A.a("Failed to read FLAC stream marker.", null);
    }
    
    public static List j(final s s, final int n) {
        final g0.z z = new g0.z(n);
        s.readFully(z.e(), 0, n);
        z.U(4);
        return Arrays.asList(W.k(z, false, false).b);
    }
    
    public static final class a
    {
        public B a;
        
        public a(final B a) {
            this.a = a;
        }
    }
}
