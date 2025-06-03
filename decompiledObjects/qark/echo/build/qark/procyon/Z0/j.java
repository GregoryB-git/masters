// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import d0.q;
import F0.E;
import T0.k;
import java.util.List;
import X2.v;
import T0.i;
import T0.n;
import d0.x;
import g0.o;
import T0.e;
import g0.z;

public abstract class j
{
    public static e a(final int n, final z z) {
        final int p2 = z.p();
        if (z.p() == 1684108385) {
            z.U(8);
            final String b = z.B(p2 - 16);
            return new e("und", b, b);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse comment attribute: ");
        sb.append(a.a(n));
        o.h("MetadataUtil", sb.toString());
        return null;
    }
    
    public static T0.a b(final z z) {
        final int p = z.p();
        String string;
        if (z.p() == 1684108385) {
            final int b = a.b(z.p());
            String s;
            if (b == 13) {
                s = "image/jpeg";
            }
            else if (b == 14) {
                s = "image/png";
            }
            else {
                s = null;
            }
            if (s != null) {
                z.U(4);
                final int n = p - 16;
                final byte[] array = new byte[n];
                z.l(array, 0, n);
                return new T0.a(s, null, 3, array);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized cover art flags: ");
            sb.append(b);
            string = sb.toString();
        }
        else {
            string = "Failed to parse cover art attribute";
        }
        o.h("MetadataUtil", string);
        return null;
    }
    
    public static x.b c(final z z) {
        final int n = z.f() + z.p();
        final int p = z.p();
        final int n2 = p >> 24 & 0xFF;
        if (n2 != 169 && n2 != 253) {
            Label_0066: {
                if (p == 1735291493) {
                    Label_0732: {
                        try {
                            final n i = i(z);
                            z.T(n);
                            return i;
                        }
                        finally {
                            break Label_0732;
                        }
                        break Label_0066;
                    }
                    z.T(n);
                }
            }
            if (p == 1684632427) {
                final n d = d(p, "TPOS", z);
                z.T(n);
                return d;
            }
            if (p == 1953655662) {
                final n d2 = d(p, "TRCK", z);
                z.T(n);
                return d2;
            }
            if (p == 1953329263) {
                final i f = f(p, "TBPM", z, true, false);
                z.T(n);
                return f;
            }
            if (p == 1668311404) {
                final i f2 = f(p, "TCMP", z, true, true);
                z.T(n);
                return f2;
            }
            if (p == 1668249202) {
                final T0.a b = b(z);
                z.T(n);
                return b;
            }
            if (p == 1631670868) {
                final n j = j(p, "TPE2", z);
                z.T(n);
                return j;
            }
            if (p == 1936682605) {
                final n k = j(p, "TSOT", z);
                z.T(n);
                return k;
            }
            if (p == 1936679276) {
                final n l = j(p, "TSOA", z);
                z.T(n);
                return l;
            }
            if (p == 1936679282) {
                final n m = j(p, "TSOP", z);
                z.T(n);
                return m;
            }
            if (p == 1936679265) {
                final n j2 = j(p, "TSO2", z);
                z.T(n);
                return j2;
            }
            if (p == 1936679791) {
                final n j3 = j(p, "TSOC", z);
                z.T(n);
                return j3;
            }
            if (p == 1920233063) {
                final i f3 = f(p, "ITUNESADVISORY", z, false, false);
                z.T(n);
                return f3;
            }
            if (p == 1885823344) {
                final i f4 = f(p, "ITUNESGAPLESS", z, false, true);
                z.T(n);
                return f4;
            }
            if (p == 1936683886) {
                final n j4 = j(p, "TVSHOWSORT", z);
                z.T(n);
                return j4;
            }
            if (p == 1953919848) {
                final n j5 = j(p, "TVSHOW", z);
                z.T(n);
                return j5;
            }
            if (p == 757935405) {
                final i g = g(z, n);
                z.T(n);
                return g;
            }
        }
        else {
            final int n3 = 0xFFFFFF & p;
            if (n3 == 6516084) {
                final e a = a(p, z);
                z.T(n);
                return a;
            }
            if (n3 == 7233901 || n3 == 7631467) {
                final n j6 = j(p, "TIT2", z);
                z.T(n);
                return j6;
            }
            if (n3 == 6516589 || n3 == 7828084) {
                final n j7 = j(p, "TCOM", z);
                z.T(n);
                return j7;
            }
            if (n3 == 6578553) {
                final n j8 = j(p, "TDRC", z);
                z.T(n);
                return j8;
            }
            if (n3 == 4280916) {
                final n j9 = j(p, "TPE1", z);
                z.T(n);
                return j9;
            }
            if (n3 == 7630703) {
                final n j10 = j(p, "TSSE", z);
                z.T(n);
                return j10;
            }
            if (n3 == 6384738) {
                final n j11 = j(p, "TALB", z);
                z.T(n);
                return j11;
            }
            if (n3 == 7108978) {
                final n j12 = j(p, "USLT", z);
                z.T(n);
                return j12;
            }
            if (n3 == 6776174) {
                final n j13 = j(p, "TCON", z);
                z.T(n);
                return j13;
            }
            if (n3 == 6779504) {
                final n j14 = j(p, "TIT1", z);
                z.T(n);
                return j14;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Skipped unknown metadata entry: ");
        sb.append(a.a(p));
        o.b("MetadataUtil", sb.toString());
        z.T(n);
        return null;
    }
    
    public static n d(int m, final String s, final z z) {
        final int p3 = z.p();
        if (z.p() == 1684108385 && p3 >= 22) {
            z.U(10);
            final int i = z.M();
            if (i > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(i);
                final String string = sb.toString();
                m = z.M();
                String string2 = string;
                if (m > 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(m);
                    string2 = sb2.toString();
                }
                return new n(s, null, v.Z(string2));
            }
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Failed to parse index/count attribute: ");
        sb3.append(a.a(m));
        o.h("MetadataUtil", sb3.toString());
        return null;
    }
    
    public static int e(final z z) {
        final int p = z.p();
        if (z.p() == 1684108385) {
            z.U(8);
            final int n = p - 16;
            if (n == 1) {
                return z.G();
            }
            if (n == 2) {
                return z.M();
            }
            if (n == 3) {
                return z.J();
            }
            if (n == 4) {
                if ((z.j() & 0x80) == 0x0) {
                    return z.K();
                }
            }
        }
        o.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }
    
    public static i f(final int n, final String s, final z z, final boolean b, final boolean b2) {
        int n2;
        final int b3 = n2 = e(z);
        if (b2) {
            n2 = Math.min(1, b3);
        }
        if (n2 < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse uint8 attribute: ");
            sb.append(a.a(n));
            o.h("MetadataUtil", sb.toString());
            return null;
        }
        if (b) {
            return new n(s, null, v.Z(Integer.toString(n2)));
        }
        return new e("und", s, Integer.toString(n2));
    }
    
    public static i g(final z z, final int n) {
        String b2;
        String b = b2 = null;
        int n3;
        int n2 = n3 = -1;
        while (z.f() < n) {
            final int f = z.f();
            final int p2 = z.p();
            final int p3 = z.p();
            z.U(4);
            if (p3 == 1835360622) {
                b = z.B(p2 - 12);
            }
            else if (p3 == 1851878757) {
                b2 = z.B(p2 - 12);
            }
            else {
                if (p3 == 1684108385) {
                    n2 = f;
                    n3 = p2;
                }
                z.U(p2 - 12);
            }
        }
        if (b == null || b2 == null) {
            return null;
        }
        if (n2 == -1) {
            return null;
        }
        z.T(n2);
        z.U(16);
        return new k(b, b2, z.B(n3 - 16));
    }
    
    public static h0.a h(final z z, int p3, final String s) {
        while (true) {
            final int f = z.f();
            if (f >= p3) {
                return null;
            }
            final int p4 = z.p();
            if (z.p() == 1684108385) {
                p3 = z.p();
                final int p5 = z.p();
                final int n = p4 - 16;
                final byte[] array = new byte[n];
                z.l(array, 0, n);
                return new h0.a(s, array, p5, p3);
            }
            z.T(f + p4);
        }
    }
    
    public static n i(final z z) {
        final String a = T0.j.a(e(z) - 1);
        if (a != null) {
            return new n("TCON", null, v.Z(a));
        }
        o.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }
    
    public static n j(final int n, final String s, final z z) {
        final int p3 = z.p();
        if (z.p() == 1684108385) {
            z.U(8);
            return new n(s, null, v.Z(z.B(p3 - 16)));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse text attribute: ");
        sb.append(a.a(n));
        o.h("MetadataUtil", sb.toString());
        return null;
    }
    
    public static void k(final int n, final E e, final q.b b) {
        if (n == 1 && e.a()) {
            b.V(e.a).W(e.b);
        }
    }
    
    public static void l(int i, final x x, final q.b b, final x... array) {
        final int n = 0;
        x b2;
        x x2 = b2 = new x(new x.b[0]);
        if (x != null) {
            int n2 = 0;
            while (true) {
                b2 = x2;
                if (n2 >= x.e()) {
                    break;
                }
                final x.b d = x.d(n2);
                x x3 = x2;
                if (d instanceof h0.a) {
                    final h0.a a = (h0.a)d;
                    if (a.o.equals("com.android.capture.fps")) {
                        x3 = x2;
                        if (i == 2) {
                            x3 = x2.a(a);
                        }
                    }
                    else {
                        x3 = x2.a(a);
                    }
                }
                ++n2;
                x2 = x3;
            }
        }
        int length;
        for (length = array.length, i = n; i < length; ++i) {
            b2 = b2.b(array[i]);
        }
        if (b2.e() > 0) {
            b.h0(b2);
        }
    }
}
