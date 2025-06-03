// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o6;

import kotlin.text.i;
import kotlin.jvm.internal.Intrinsics;
import x1.j;
import kotlin.jvm.internal.g;

public final class a implements Comparable
{
    public static final a p;
    public static final long q;
    public static final long r;
    public static final long s;
    public final long o = o;
    
    static {
        p = new a(null);
        q = m(0L);
        r = c.b(4611686018427387903L);
        s = c.b(-4611686018427387903L);
    }
    
    public static final int C(final long n) {
        if (S(n)) {
            return 0;
        }
        return (int)(w(n) % 60);
    }
    
    public static final d D(final long n) {
        if (M(n)) {
            return d.p;
        }
        return d.r;
    }
    
    public static final long F(final long n) {
        return n >> 1;
    }
    
    public static int G(final long n) {
        return j.a(n);
    }
    
    public static final boolean H(final long n) {
        return S(n) ^ true;
    }
    
    public static final boolean K(final long n) {
        return ((int)n & 0x1) == 0x1;
    }
    
    public static final boolean M(final long n) {
        return ((int)n & 0x1) == 0x0;
    }
    
    public static final boolean S(final long n) {
        return n == a.r || n == a.s;
    }
    
    public static final boolean T(final long n) {
        return n < 0L;
    }
    
    public static final boolean U(final long n) {
        return n > 0L;
    }
    
    public static final long V(final long n, final long n2) {
        return W(n, Z(n2));
    }
    
    public static final long W(final long n, long n2) {
        if (S(n)) {
            if (H(n2)) {
                return n;
            }
            if ((n2 ^ n) >= 0L) {
                return n;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        else {
            if (S(n2)) {
                return n2;
            }
            if (((int)n & 0x1) == ((int)n2 & 0x1)) {
                n2 = F(n) + F(n2);
                if (M(n)) {
                    return c.e(n2);
                }
                return c.c(n2);
            }
            else {
                if (K(n)) {
                    return c(n, F(n), F(n2));
                }
                return c(n, F(n2), F(n));
            }
        }
    }
    
    public static final long X(final long n, final d d) {
        Intrinsics.checkNotNullParameter(d, "unit");
        if (n == a.r) {
            return Long.MAX_VALUE;
        }
        if (n == a.s) {
            return Long.MIN_VALUE;
        }
        return e.a(F(n), D(n), d);
    }
    
    public static String Y(final long n) {
        if (n == 0L) {
            return "0s";
        }
        if (n == a.r) {
            return "Infinity";
        }
        if (n == a.s) {
            return "-Infinity";
        }
        final boolean t = T(n);
        final StringBuilder sb = new StringBuilder();
        if (t) {
            sb.append('-');
        }
        final long o = o(n);
        final long r = r(o);
        final int p = p(o);
        final int x = x(o);
        final int c = C(o);
        final int z = z(o);
        int n2 = 0;
        final boolean b = r != 0L;
        final boolean b2 = p != 0;
        final boolean b3 = x != 0;
        final boolean b4 = c != 0 || z != 0;
        if (b) {
            sb.append(r);
            sb.append('d');
            n2 = 1;
        }
        int n3 = 0;
        Label_0247: {
            if (!b2) {
                n3 = n2;
                if (!b) {
                    break Label_0247;
                }
                if (!b3) {
                    n3 = n2;
                    if (!b4) {
                        break Label_0247;
                    }
                }
            }
            if (n2 > 0) {
                sb.append(' ');
            }
            sb.append(p);
            sb.append('h');
            n3 = n2 + 1;
        }
        int n4 = 0;
        Label_0303: {
            if (!b3) {
                n4 = n3;
                if (!b4) {
                    break Label_0303;
                }
                if (!b2) {
                    n4 = n3;
                    if (!b) {
                        break Label_0303;
                    }
                }
            }
            if (n3 > 0) {
                sb.append(' ');
            }
            sb.append(x);
            sb.append('m');
            n4 = n3 + 1;
        }
        int n5 = n4;
        if (b4) {
            if (n4 > 0) {
                sb.append(' ');
            }
            Label_0460: {
                int n6;
                int n7;
                String s;
                int n8;
                if (c == 0 && !b && !b2 && !b3) {
                    if (z >= 1000000) {
                        n6 = z / 1000000;
                        n7 = z % 1000000;
                        s = "ms";
                        n8 = 6;
                    }
                    else {
                        if (z < 1000) {
                            sb.append(z);
                            sb.append("ns");
                            break Label_0460;
                        }
                        n6 = z / 1000;
                        n7 = z % 1000;
                        s = "us";
                        n8 = 3;
                    }
                }
                else {
                    n8 = 9;
                    n6 = c;
                    n7 = z;
                    s = "s";
                }
                e(n, sb, n6, n7, n8, s, false);
            }
            n5 = n4 + 1;
        }
        if (t && n5 > 1) {
            sb.insert(1, '(').append(')');
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
    
    public static final long Z(final long n) {
        return c.a(-F(n), (int)n & 0x1);
    }
    
    public static final long c(long n, long n2, final long n3) {
        n = c.g(n3);
        n2 += n;
        if (-4611686018426L <= n2 && n2 < 4611686018427L) {
            n = c.f(n);
            return c.d(c.f(n2) + (n3 - n));
        }
        return c.b(l6.d.e(n2, -4611686018427387903L, 4611686018427387903L));
    }
    
    public static final void e(final long n, final StringBuilder sb, int length, int n2, int n3, final String str, final boolean b) {
        sb.append(length);
        if (n2 != 0) {
            sb.append('.');
            final String o = i.O(String.valueOf(n2), n3, '0');
            length = o.length();
            n2 = -1;
            n3 = length - 1;
            length = n2;
            if (n3 >= 0) {
                length = n3;
                while (true) {
                    n3 = length - 1;
                    if (o.charAt(length) != '0') {
                        break;
                    }
                    if (n3 < 0) {
                        length = n2;
                        break;
                    }
                    length = n3;
                }
            }
            n2 = length + 1;
            if (!b && n2 < 3) {
                sb.append(o, 0, n2);
            }
            else {
                sb.append(o, 0, (length + 3) / 3 * 3);
            }
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        }
        sb.append(str);
    }
    
    public static int l(final long n, final long n2) {
        final long n3 = n ^ n2;
        if (n3 >= 0L && ((int)n3 & 0x1) != 0x0) {
            int n4 = ((int)n & 0x1) - ((int)n2 & 0x1);
            if (T(n)) {
                n4 = -n4;
            }
            return n4;
        }
        return Intrinsics.e(n, n2);
    }
    
    public static long m(final long n) {
        if (b.a()) {
            if (M(n)) {
                final long f = F(n);
                if (-4611686018426999999L <= f && f < 4611686018427000000L) {
                    return n;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(F(n));
                sb.append(" ns is out of nanoseconds range");
                throw new AssertionError((Object)sb.toString());
            }
            else {
                final long f2 = F(n);
                if (-4611686018427387903L > f2 || f2 >= 4611686018427387904L) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(F(n));
                    sb2.append(" ms is out of milliseconds range");
                    throw new AssertionError((Object)sb2.toString());
                }
                final long f3 = F(n);
                if (-4611686018426L <= f3) {
                    if (f3 >= 4611686018427L) {
                        return n;
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(F(n));
                    sb3.append(" ms is denormalized");
                    throw new AssertionError((Object)sb3.toString());
                }
            }
        }
        return n;
    }
    
    public static boolean n(final long n, final Object o) {
        return o instanceof a && n == ((a)o).a0();
    }
    
    public static final long o(final long n) {
        long z = n;
        if (T(n)) {
            z = Z(n);
        }
        return z;
    }
    
    public static final int p(final long n) {
        if (S(n)) {
            return 0;
        }
        return (int)(s(n) % 24);
    }
    
    public static final long r(final long n) {
        return X(n, d.v);
    }
    
    public static final long s(final long n) {
        return X(n, d.u);
    }
    
    public static final long u(final long n) {
        return X(n, d.t);
    }
    
    public static final long w(final long n) {
        return X(n, d.s);
    }
    
    public static final int x(final long n) {
        if (S(n)) {
            return 0;
        }
        return (int)(u(n) % 60);
    }
    
    public static final int z(long n) {
        if (S(n)) {
            return 0;
        }
        final boolean k = K(n);
        n = F(n);
        if (k) {
            n = c.f(n % 1000);
        }
        else {
            n %= 1000000000;
        }
        return (int)n;
    }
    
    public final /* synthetic */ long a0() {
        return this.o;
    }
    
    @Override
    public boolean equals(final Object o) {
        return n(this.o, o);
    }
    
    @Override
    public int hashCode() {
        return G(this.o);
    }
    
    public int j(final long n) {
        return l(this.o, n);
    }
    
    @Override
    public String toString() {
        return Y(this.o);
    }
    
    public static final class a
    {
    }
}
