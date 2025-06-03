// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import java.io.Serializable;
import g0.y;
import F0.W;
import F0.K;
import java.util.Arrays;
import F0.c;
import java.util.Objects;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import a3.f;
import F0.F;
import d0.h;
import F0.o;
import F0.d;
import F0.u;
import g0.z;
import d0.x;
import java.util.ArrayList;
import java.util.List;
import W2.g;
import F0.E;
import android.util.Pair;
import d0.A;
import d0.m;
import g0.M;

public abstract class b
{
    public static final byte[] a;
    
    static {
        a = M.r0("OpusHead");
    }
    
    public static s A(Z0.a.a f, Z0.a.b g, long n, final m m, final boolean b, final boolean b2) {
        final Z0.a.a a = (Z0.a.a)g0.a.e(f.f(1835297121));
        final int e = e(m(((Z0.a.b)g0.a.e(a.g(1751411826))).b));
        if (e == -1) {
            return null;
        }
        final g z = z(((Z0.a.b)g0.a.e(f.g(1953196132))).b);
        final long n2 = -9223372036854775807L;
        if (n == -9223372036854775807L) {
            n = g.a(z);
        }
        final long q = r(g.b).q;
        if (n == -9223372036854775807L) {
            n = n2;
        }
        else {
            n = M.W0(n, 1000000L, q);
        }
        final Z0.a.a a2 = (Z0.a.a)g0.a.e(((Z0.a.a)g0.a.e(a.f(1835626086))).f(1937007212));
        final Pair o = o(((Z0.a.b)g0.a.e(a.g(1835296868))).b);
        g = a2.g(1937011556);
        if (g == null) {
            throw A.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        final d x = x(g.b, g.b(z), g.c(z), (String)o.second, m, b2);
        long[] array = null;
        long[] array2 = null;
        Label_0263: {
            if (!b) {
                f = f.f(1701082227);
                if (f != null) {
                    final Pair j = j(f);
                    if (j != null) {
                        array = (long[])j.first;
                        array2 = (long[])j.second;
                        break Label_0263;
                    }
                }
            }
            array = (array2 = null);
        }
        if (x.b == null) {
            return null;
        }
        return new s(g.b(z), e, (long)o.first, q, n, x.b, x.d, x.a, x.c, array, array2);
    }
    
    public static List B(final Z0.a.a a, final E e, final long n, final m m, final boolean b, final boolean b2, final W2.g g) {
        final ArrayList<v> list = new ArrayList<v>();
        for (int i = 0; i < a.d.size(); ++i) {
            final Z0.a.a a2 = a.d.get(i);
            if (a2.a == 1953653099) {
                final s s = (s)g.apply(A(a2, (Z0.a.b)g0.a.e(a.g(1836476516)), n, m, b, b2));
                if (s != null) {
                    list.add(w(s, (Z0.a.a)g0.a.e(((Z0.a.a)g0.a.e(((Z0.a.a)g0.a.e(a2.f(1835297121))).f(1835626086))).f(1937007212)), e));
                }
            }
        }
        return list;
    }
    
    public static x C(final Z0.a.b b) {
        final z b2 = b.b;
        b2.T(8);
        x x = new x(new x.b[0]);
        while (b2.a() >= 8) {
            final int f = b2.f();
            final int p = b2.p();
            final int p2 = b2.p();
            x b3 = null;
            Label_0127: {
                x x2;
                if (p2 == 1835365473) {
                    b2.T(f);
                    x2 = D(b2, f + p);
                }
                else if (p2 == 1936553057) {
                    b2.T(f);
                    x2 = q.b(b2, f + p);
                }
                else {
                    b3 = x;
                    if (p2 != -1451722374) {
                        break Label_0127;
                    }
                    x2 = F(b2);
                }
                b3 = x.b(x2);
            }
            b2.T(f + p);
            x = b3;
        }
        return x;
    }
    
    public static x D(final z z, final int n) {
        z.U(8);
        f(z);
        while (z.f() < n) {
            final int f = z.f();
            final int p2 = z.p();
            if (z.p() == 1768715124) {
                z.T(f);
                return n(z, f + p2);
            }
            z.T(f + p2);
        }
        return null;
    }
    
    public static void E(final z z, int n, final int n2, final int n3, final int n4, final int n5, final m m, final d d, int n6) {
        z.T(n2 + 16);
        z.U(16);
        final int i = z.M();
        final int j = z.M();
        z.U(50);
        int f = z.f();
        m c = m;
        int n7 = n;
        if (n == 1701733238) {
            final Pair u = u(z, n2, n3);
            c = m;
            if (u != null) {
                n = (int)u.first;
                if (m == null) {
                    c = null;
                }
                else {
                    c = m.c(((t)u.second).b);
                }
                d.a[n6] = (t)u.second;
            }
            z.T(f);
            n7 = n;
        }
        final String s = "video/3gpp";
        String s2;
        if (n7 == 1831958048) {
            s2 = "video/mpeg";
        }
        else if (n7 == 1211250227) {
            s2 = "video/3gpp";
        }
        else {
            s2 = null;
        }
        float n8 = 1.0f;
        n = 8;
        int n9 = 8;
        List list = null;
        String s3 = null;
        byte[] array = null;
        int n10 = -1;
        int n11 = -1;
        n6 = -1;
        int n12 = -1;
        int n13 = -1;
        ByteBuffer byteBuffer = null;
        b b = null;
        int n14 = 0;
        final int n15 = n7;
        final m k = c;
        while (f - n2 < n3) {
            z.T(f);
            final int f2 = z.f();
            final int p9 = z.p();
            if (p9 == 0 && z.f() - n2 == n3) {
                break;
            }
            u.a(p9 > 0, "childAtomSize must be positive");
            final int p10 = z.p();
            int n16 = 0;
            Label_1707: {
                if (p10 == 1635148611) {
                    u.a(s2 == null, null);
                    z.T(f2 + 8);
                    final F0.d b2 = d.b(z);
                    list = b2.a;
                    d.c = b2.b;
                    if (n14 == 0) {
                        n8 = b2.k;
                    }
                    s3 = b2.l;
                    n11 = b2.j;
                    n6 = b2.g;
                    n12 = b2.h;
                    n13 = b2.i;
                    n = b2.e;
                    n16 = b2.f;
                    s2 = "video/avc";
                }
                else {
                    if (p10 != 1752589123) {
                        while (true) {
                            String s4 = null;
                            String c2 = null;
                            Label_1662: {
                                if (p10 == 1685480259 || p10 == 1685485123) {
                                    final o a = o.a(z);
                                    s4 = s2;
                                    c2 = s3;
                                    if (a != null) {
                                        c2 = a.c;
                                        s4 = "video/dolby-vision";
                                    }
                                    break Label_1662;
                                }
                                else {
                                    if (p10 == 1987076931) {
                                        u.a(s2 == null, null);
                                        if (n15 == 1987063864) {
                                            s2 = "video/x-vnd.on2.vp8";
                                        }
                                        else {
                                            s2 = "video/x-vnd.on2.vp9";
                                        }
                                        z.T(f2 + 12);
                                        z.U(2);
                                        final int g = z.G();
                                        if ((g & 0x1) != 0x0) {
                                            n = 1;
                                        }
                                        else {
                                            n = 0;
                                        }
                                        n6 = z.G();
                                        final int g2 = z.G();
                                        n6 = h.j(n6);
                                        if (n != 0) {
                                            n12 = 1;
                                        }
                                        else {
                                            n12 = 2;
                                        }
                                        n13 = h.k(g2);
                                        n = (n16 = g >> 4);
                                        break Label_1707;
                                    }
                                    if (p10 == 1635135811) {
                                        n = p9 - 8;
                                        final byte[] array2 = new byte[n];
                                        z.l(array2, 0, n);
                                        list = X2.v.Z(array2);
                                        z.T(f2 + 8);
                                        final h h = h(z);
                                        n = h.e;
                                        n16 = h.f;
                                        n6 = h.a;
                                        n12 = h.b;
                                        n13 = h.c;
                                        s2 = "video/av01";
                                        break Label_1707;
                                    }
                                    int n17 = 0;
                                    Label_0875: {
                                        if (p10 == 1668050025) {
                                            ByteBuffer a2;
                                            if ((a2 = byteBuffer) == null) {
                                                a2 = a();
                                            }
                                            a2.position(21);
                                            a2.putShort(z.C());
                                            a2.putShort(z.C());
                                            byteBuffer = a2;
                                        }
                                        else {
                                            if (p10 != 1835295606) {
                                                n17 = n;
                                                String a3;
                                                b l;
                                                byte[] t;
                                                X2.v v;
                                                if (p10 == 1681012275) {
                                                    u.a(s2 == null, null);
                                                    a3 = s;
                                                    l = b;
                                                    n = n10;
                                                    t = array;
                                                    v = (X2.v)list;
                                                }
                                                else if (p10 == 1702061171) {
                                                    u.a(s2 == null, null);
                                                    l = k(z, f2);
                                                    a3 = Z0.b.b.a(l);
                                                    final byte[] b3 = Z0.b.b.b(l);
                                                    if (b3 != null) {
                                                        list = X2.v.Z(b3);
                                                    }
                                                    v = (X2.v)list;
                                                    t = array;
                                                    n = n10;
                                                }
                                                else {
                                                    if (p10 == 1885434736) {
                                                        n8 = s(z, f2);
                                                        n = n17;
                                                        n14 = 1;
                                                        n16 = n9;
                                                        break Label_1707;
                                                    }
                                                    if (p10 == 1937126244) {
                                                        t = t(z, f2, p9);
                                                        a3 = s2;
                                                        v = (X2.v)list;
                                                        n = n10;
                                                        l = b;
                                                    }
                                                    else if (p10 == 1936995172) {
                                                        final int g3 = z.G();
                                                        z.U(3);
                                                        a3 = s2;
                                                        v = (X2.v)list;
                                                        t = array;
                                                        n = n10;
                                                        l = b;
                                                        if (g3 == 0) {
                                                            n = z.G();
                                                            if (n != 0) {
                                                                if (n != 1) {
                                                                    if (n != 2) {
                                                                        if (n != 3) {
                                                                            a3 = s2;
                                                                            v = (X2.v)list;
                                                                            t = array;
                                                                            n = n10;
                                                                            l = b;
                                                                        }
                                                                        else {
                                                                            n = 3;
                                                                            a3 = s2;
                                                                            v = (X2.v)list;
                                                                            t = array;
                                                                            l = b;
                                                                        }
                                                                    }
                                                                    else {
                                                                        n = 2;
                                                                        a3 = s2;
                                                                        v = (X2.v)list;
                                                                        t = array;
                                                                        l = b;
                                                                    }
                                                                }
                                                                else {
                                                                    n = 1;
                                                                    a3 = s2;
                                                                    v = (X2.v)list;
                                                                    t = array;
                                                                    l = b;
                                                                }
                                                            }
                                                            else {
                                                                n = 0;
                                                                a3 = s2;
                                                                v = (X2.v)list;
                                                                t = array;
                                                                l = b;
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        if (p10 != 1668246642) {
                                                            c2 = s3;
                                                            s4 = s2;
                                                            break Label_1662;
                                                        }
                                                        s4 = s2;
                                                        c2 = s3;
                                                        if (n6 != -1) {
                                                            break Label_1662;
                                                        }
                                                        s4 = s2;
                                                        c2 = s3;
                                                        if (n13 != -1) {
                                                            break Label_1662;
                                                        }
                                                        final int p11 = z.p();
                                                        if (p11 != 1852009592 && p11 != 1852009571) {
                                                            final StringBuilder sb = new StringBuilder();
                                                            sb.append("Unsupported color type: ");
                                                            sb.append(Z0.a.a(p11));
                                                            g0.o.h("AtomParsers", sb.toString());
                                                            s4 = s2;
                                                            c2 = s3;
                                                            break Label_1662;
                                                        }
                                                        final int m2 = z.M();
                                                        final int m3 = z.M();
                                                        z.U(2);
                                                        if (p9 == 19 && (z.G() & 0x80) != 0x0) {
                                                            n6 = 1;
                                                        }
                                                        else {
                                                            n6 = 0;
                                                        }
                                                        final int j2 = h.j(m2);
                                                        if (n6 != 0) {
                                                            n12 = 1;
                                                        }
                                                        else {
                                                            n12 = 2;
                                                        }
                                                        n13 = h.k(m3);
                                                        n6 = j2;
                                                        break Label_1647;
                                                    }
                                                }
                                                s2 = a3;
                                                list = v;
                                                array = t;
                                                n10 = n;
                                                b = l;
                                                break Label_0875;
                                            }
                                            ByteBuffer a4;
                                            if ((a4 = byteBuffer) == null) {
                                                a4 = a();
                                            }
                                            final short c3 = z.C();
                                            final short c4 = z.C();
                                            final short c5 = z.C();
                                            final short c6 = z.C();
                                            final short c7 = z.C();
                                            final short c8 = z.C();
                                            final short c9 = z.C();
                                            final short c10 = z.C();
                                            final long i2 = z.I();
                                            final long i3 = z.I();
                                            a4.position(1);
                                            a4.putShort(c7);
                                            a4.putShort(c8);
                                            a4.putShort(c3);
                                            a4.putShort(c4);
                                            a4.putShort(c5);
                                            a4.putShort(c6);
                                            a4.putShort(c9);
                                            a4.putShort(c10);
                                            a4.putShort((short)(i2 / 10000L));
                                            a4.putShort((short)(i3 / 10000L));
                                            byteBuffer = a4;
                                        }
                                        n17 = n;
                                    }
                                    n = n17;
                                    n16 = n9;
                                    break Label_1707;
                                }
                                n16 = n9;
                                break Label_1707;
                            }
                            s2 = s4;
                            s3 = c2;
                            continue;
                        }
                    }
                    u.a(s2 == null, null);
                    z.T(f2 + 8);
                    final F a5 = F.a(z);
                    list = a5.a;
                    d.c = a5.b;
                    if (n14 == 0) {
                        n8 = a5.j;
                    }
                    n11 = a5.k;
                    s3 = a5.l;
                    n6 = a5.g;
                    n12 = a5.h;
                    n13 = a5.i;
                    n = a5.e;
                    n16 = a5.f;
                    s2 = "video/hevc";
                }
            }
            f += p9;
            n9 = n16;
        }
        if (s2 == null) {
            return;
        }
        final d0.q.b u2 = new d0.q.b().Z(n4).o0(s2).O(s3).v0(i).Y(j).k0(n8).n0(n5).l0(array).r0(n10).b0(list).g0(n11).U(k);
        final h.b e = new h.b().d(n6).c(n12).e(n13);
        byte[] array3;
        if (byteBuffer != null) {
            array3 = byteBuffer.array();
        }
        else {
            array3 = null;
        }
        final d0.q.b p12 = u2.P(e.f(array3).g(n).b(n9).a());
        if (b != null) {
            p12.M(a3.f.m(Z0.b.b.d(b))).j0(a3.f.m(Z0.b.b.c(b)));
        }
        d.b = p12.K();
    }
    
    public static x F(final z z) {
        final short c = z.C();
        z.U(2);
        final String d = z.D(c);
        final int max = Math.max(d.lastIndexOf(43), d.lastIndexOf(45));
        try {
            return new x(new x.b[] { new b(Float.parseFloat(d.substring(0, max)), Float.parseFloat(d.substring(max, d.length() - 1))) });
        }
        catch (IndexOutOfBoundsException | NumberFormatException ex) {
            return null;
        }
    }
    
    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    public static boolean b(final long[] array, final long n, final long n2, final long n3) {
        final int n4 = array.length - 1;
        final int p4 = M.p(4, 0, n4);
        final int p5 = M.p(array.length - 4, 0, n4);
        return array[0] <= n2 && n2 < array[p4] && array[p5] < n3 && n3 <= n;
    }
    
    public static boolean c(final int n) {
        return n != 1;
    }
    
    public static int d(final z z, final int n, final int n2, final int n3) {
        int f = z.f();
        u.a(f >= n2, null);
        while (f - n2 < n3) {
            z.T(f);
            final int p4 = z.p();
            u.a(p4 > 0, "childAtomSize must be positive");
            if (z.p() == n) {
                return f;
            }
            f += p4;
        }
        return -1;
    }
    
    public static int e(final int n) {
        if (n == 1936684398) {
            return 1;
        }
        if (n == 1986618469) {
            return 2;
        }
        if (n == 1952807028 || n == 1935832172 || n == 1937072756 || n == 1668047728) {
            return 3;
        }
        if (n == 1835365473) {
            return 5;
        }
        return -1;
    }
    
    public static void f(final z z) {
        final int f = z.f();
        z.U(4);
        int n = f;
        if (z.p() != 1751411826) {
            n = f + 4;
        }
        z.T(n);
    }
    
    public static void g(final z z, int n, final int n2, final int n3, final int i, final String s, final boolean b, final m m, final d d, int a) {
        z.T(n2 + 16);
        int j;
        if (b) {
            j = z.M();
            z.U(6);
        }
        else {
            z.U(8);
            j = 0;
        }
        int n7;
        int n8;
        int m2;
        int p10;
        if (j != 0 && j != 1) {
            if (j != 2) {
                return;
            }
            z.U(16);
            final int n4 = (int)Math.round(z.o());
            final int k = z.K();
            z.U(4);
            final int l = z.K();
            final int k2 = z.K();
            final boolean b2 = (k2 & 0x1) != 0x0;
            final boolean b3 = (k2 & 0x2) != 0x0;
            int n5 = 0;
            Label_0246: {
                if (!b2) {
                    if (l == 8) {
                        n5 = 3;
                        break Label_0246;
                    }
                    if (l == 16) {
                        if (b3) {
                            n5 = 268435456;
                            break Label_0246;
                        }
                        n5 = 2;
                        break Label_0246;
                    }
                    else if (l == 24) {
                        if (b3) {
                            n5 = 1342177280;
                            break Label_0246;
                        }
                        n5 = 21;
                        break Label_0246;
                    }
                    else if (l == 32) {
                        if (b3) {
                            n5 = 1610612736;
                            break Label_0246;
                        }
                        n5 = 22;
                        break Label_0246;
                    }
                }
                else if (l == 32) {
                    n5 = 4;
                    break Label_0246;
                }
                n5 = -1;
            }
            z.U(8);
            final int n6 = 0;
            n7 = n5;
            n8 = n4;
            m2 = k;
            p10 = n6;
        }
        else {
            m2 = z.M();
            z.U(6);
            final int h = z.H();
            z.T(z.f() - 4);
            p10 = z.p();
            if (j == 1) {
                z.U(16);
            }
            final int n9 = -1;
            n8 = h;
            n7 = n9;
        }
        final int f = z.f();
        m m3 = m;
        int n10 = n;
        if (n == 1701733217) {
            final Pair u = u(z, n2, n3);
            m c = m;
            if (u != null) {
                n = (int)u.first;
                if (m == null) {
                    c = null;
                }
                else {
                    c = m.c(((t)u.second).b);
                }
                d.a[a] = (t)u.second;
            }
            z.T(f);
            n10 = n;
            m3 = c;
        }
        final String b4 = "audio/mhm1";
        String s2 = null;
        Label_0823: {
            if (n10 == 1633889587) {
                s2 = "audio/ac3";
            }
            else if (n10 == 1700998451) {
                s2 = "audio/eac3";
            }
            else if (n10 == 1633889588) {
                s2 = "audio/ac4";
            }
            else if (n10 == 1685353315) {
                s2 = "audio/vnd.dts";
            }
            else if (n10 != 1685353320 && n10 != 1685353324) {
                if (n10 == 1685353317) {
                    s2 = "audio/vnd.dts.hd;profile=lbr";
                }
                else if (n10 == 1685353336) {
                    s2 = "audio/vnd.dts.uhd;profile=p2";
                }
                else if (n10 == 1935764850) {
                    s2 = "audio/3gpp";
                }
                else if (n10 == 1935767394) {
                    s2 = "audio/amr-wb";
                }
                else {
                    if (n10 != 1936684916) {
                        if (n10 == 1953984371) {
                            s2 = "audio/raw";
                            n7 = 268435456;
                            break Label_0823;
                        }
                        if (n10 == 1819304813) {
                            if (n7 != -1) {
                                s2 = "audio/raw";
                                break Label_0823;
                            }
                        }
                        else {
                            if (n10 == 778924082 || n10 == 778924083) {
                                s2 = "audio/mpeg";
                                break Label_0823;
                            }
                            if (n10 == 1835557169) {
                                s2 = "audio/mha1";
                                break Label_0823;
                            }
                            if (n10 == 1835560241) {
                                s2 = "audio/mhm1";
                                break Label_0823;
                            }
                            if (n10 == 1634492771) {
                                s2 = "audio/alac";
                                break Label_0823;
                            }
                            if (n10 == 1634492791) {
                                s2 = "audio/g711-alaw";
                                break Label_0823;
                            }
                            if (n10 == 1970037111) {
                                s2 = "audio/g711-mlaw";
                                break Label_0823;
                            }
                            if (n10 == 1332770163) {
                                s2 = "audio/opus";
                                break Label_0823;
                            }
                            if (n10 == 1716281667) {
                                s2 = "audio/flac";
                                break Label_0823;
                            }
                            if (n10 == 1835823201) {
                                s2 = "audio/true-hd";
                                break Label_0823;
                            }
                            s2 = null;
                            break Label_0823;
                        }
                    }
                    s2 = "audio/raw";
                    n7 = 2;
                }
            }
            else {
                s2 = "audio/vnd.dts.hd";
            }
        }
        String c2 = null;
        List<byte[]> list = null;
        b b5 = null;
        int n11 = f;
        n = m2;
        a = n8;
        String a2 = s2;
        while (n11 - n2 < n3) {
            z.T(n11);
            final int p11 = z.p();
            u.a(p11 > 0, "childAtomSize must be positive");
            final int p12 = z.p();
            List<byte[]> list2 = null;
            int intValue = 0;
            String s4 = null;
            int intValue2 = 0;
            Label_1875: {
                Label_1039: {
                    String s3;
                    if (p12 == 1835557187) {
                        z.T(n11 + 8);
                        z.U(1);
                        final int g = z.G();
                        z.U(1);
                        if (Objects.equals(a2, b4)) {
                            s3 = String.format("mhm1.%02X", g);
                        }
                        else {
                            s3 = String.format("mha1.%02X", g);
                        }
                        final int m4 = z.M();
                        final byte[] array = new byte[m4];
                        z.l(array, 0, m4);
                        if (list == null) {
                            list2 = (List<byte[]>)X2.v.Z(array);
                        }
                        else {
                            list2 = (List<byte[]>)X2.v.a0(array, list.get(0));
                        }
                    }
                    else if (p12 == 1835557200) {
                        z.T(n11 + 8);
                        final int g2 = z.G();
                        s3 = c2;
                        list2 = list;
                        if (g2 > 0) {
                            final byte[] array2 = new byte[g2];
                            z.l(array2, 0, g2);
                            if (list == null) {
                                list2 = (List<byte[]>)X2.v.Z(array2);
                                s3 = c2;
                            }
                            else {
                                list2 = (List<byte[]>)X2.v.a0(list.get(0), array2);
                                s3 = c2;
                            }
                        }
                    }
                    else {
                        if (p12 != 1702061171 && (!b || p12 != 2002876005)) {
                            Label_1651: {
                                d0.q b6;
                                if (p12 == 1684103987) {
                                    z.T(n11 + 8);
                                    b6 = F0.b.d(z, Integer.toString(i), s, m3);
                                }
                                else if (p12 == 1684366131) {
                                    z.T(n11 + 8);
                                    b6 = F0.b.h(z, Integer.toString(i), s, m3);
                                }
                                else {
                                    if (p12 == 1684103988) {
                                        z.T(n11 + 8);
                                        d.b = F0.c.b(z, Integer.toString(i), s, m3);
                                        break Label_1651;
                                    }
                                    if (p12 == 1684892784) {
                                        if (p10 > 0) {
                                            a = p10;
                                            n = 2;
                                            list2 = list;
                                            break Label_1039;
                                        }
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                        sb.append(p10);
                                        throw A.a(sb.toString(), null);
                                    }
                                    else {
                                        if (p12 == 1684305011 || p12 == 1969517683) {
                                            d.b = new d0.q.b().Z(i).o0(a2).N(n).p0(a).U(m3).e0(s).K();
                                            break Label_1651;
                                        }
                                        if (p12 == 1682927731) {
                                            final int n12 = p11 - 8;
                                            final byte[] a3 = b.a;
                                            final byte[] copy = Arrays.copyOf(a3, a3.length + n12);
                                            z.T(n11 + 8);
                                            z.l(copy, a3.length, n12);
                                            list2 = (List<byte[]>)K.a(copy);
                                            intValue = a;
                                            s4 = c2;
                                            intValue2 = n;
                                            break Label_1875;
                                        }
                                        if (p12 == 1684425825) {
                                            final byte[] array3 = new byte[p11 - 8];
                                            array3[0] = 102;
                                            array3[1] = 76;
                                            array3[2] = 97;
                                            array3[3] = 67;
                                            z.T(n11 + 12);
                                            z.l(array3, 4, p11 - 12);
                                            list2 = (List<byte[]>)X2.v.Z(array3);
                                            intValue = a;
                                            s4 = c2;
                                            intValue2 = n;
                                            break Label_1875;
                                        }
                                        if (p12 == 1634492771) {
                                            n = p11 - 12;
                                            final byte[] array4 = new byte[n];
                                            z.T(n11 + 12);
                                            z.l(array4, 0, n);
                                            final Pair e = g0.d.e(array4);
                                            intValue = (int)e.first;
                                            intValue2 = (int)e.second;
                                            list2 = (List<byte[]>)X2.v.Z(array4);
                                            s4 = c2;
                                            break Label_1875;
                                        }
                                        break Label_1651;
                                    }
                                }
                                d.b = b6;
                            }
                            intValue = a;
                            s4 = c2;
                            intValue2 = n;
                            list2 = list;
                            break Label_1875;
                        }
                        int d2;
                        if (p12 == 1702061171) {
                            d2 = n11;
                        }
                        else {
                            d2 = d(z, 1702061171, n11, p11);
                        }
                        intValue = a;
                        s4 = c2;
                        intValue2 = n;
                        list2 = list;
                        if (d2 == -1) {
                            break Label_1875;
                        }
                        final b k3 = k(z, d2);
                        final String a4 = b.a(k3);
                        final byte[] b7 = b.b(k3);
                        a2 = a4;
                        intValue = a;
                        s4 = c2;
                        intValue2 = n;
                        list2 = list;
                        b5 = k3;
                        if (b7 == null) {
                            break Label_1875;
                        }
                        if ("audio/vorbis".equals(a4)) {
                            list2 = (List<byte[]>)W.e(b7);
                            a2 = a4;
                            intValue = a;
                            s4 = c2;
                            intValue2 = n;
                            b5 = k3;
                            break Label_1875;
                        }
                        if ("audio/mp4a-latm".equals(a4)) {
                            final F0.a.b e2 = F0.a.e(b7);
                            a = e2.a;
                            n = e2.b;
                            c2 = e2.c;
                        }
                        list2 = (List<byte[]>)X2.v.Z(b7);
                        b5 = k3;
                        intValue2 = n;
                        s4 = c2;
                        intValue = a;
                        a2 = a4;
                        break Label_1875;
                    }
                    c2 = s3;
                }
                intValue = a;
                s4 = c2;
                intValue2 = n;
            }
            n11 += p11;
            a = intValue;
            c2 = s4;
            n = intValue2;
            list = list2;
        }
        if (d.b == null && a2 != null) {
            final d0.q.b e3 = new d0.q.b().Z(i).o0(a2).O(c2).N(n).p0(a).i0(n7).b0(list).U(m3).e0(s);
            if (b5 != null) {
                e3.M(a3.f.m(b.d(b5))).j0(a3.f.m(b.c(b5)));
            }
            d.b = e3.K();
        }
    }
    
    public static h h(final z z) {
        final h.b b = new h.b();
        final y y = new y(z.e());
        y.p(z.f() * 8);
        final int n = 1;
        y.s(1);
        final int h = y.h(3);
        y.r(6);
        final boolean g = y.g();
        final boolean g2 = y.g();
        final int n2 = 10;
        Label_0166: {
            int n4;
            if (h == 2 && g) {
                int n3;
                if (g2) {
                    n3 = 12;
                }
                else {
                    n3 = 10;
                }
                b.g(n3);
                n4 = n2;
                if (g2) {
                    n4 = 12;
                }
            }
            else {
                if (h > 2) {
                    break Label_0166;
                }
                int n5;
                if (g) {
                    n5 = 10;
                }
                else {
                    n5 = 8;
                }
                b.g(n5);
                if (g) {
                    n4 = n2;
                }
                else {
                    n4 = 8;
                }
            }
            b.b(n4);
        }
        y.r(13);
        y.q();
        final int h2 = y.h(4);
        String string;
        if (h2 != 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unsupported obu_type: ");
            sb.append(h2);
            string = sb.toString();
        }
        else if (y.g()) {
            string = "Unsupported obu_extension_flag";
        }
        else {
            final boolean g3 = y.g();
            y.q();
            if (g3 && y.h(8) > 127) {
                string = "Excessive obu_size";
            }
            else {
                final int h3 = y.h(3);
                y.q();
                if (y.g()) {
                    string = "Unsupported reduced_still_picture_header";
                }
                else if (y.g()) {
                    string = "Unsupported timing_info_present_flag";
                }
                else {
                    if (!y.g()) {
                        final int h4 = y.h(5);
                        final boolean b2 = false;
                        for (int i = 0; i <= h4; ++i) {
                            y.r(12);
                            if (y.h(5) > 7) {
                                y.q();
                            }
                        }
                        final int h5 = y.h(4);
                        final int h6 = y.h(4);
                        y.r(h5 + 1);
                        y.r(h6 + 1);
                        if (y.g()) {
                            y.r(7);
                        }
                        y.r(7);
                        final boolean g4 = y.g();
                        if (g4) {
                            y.r(2);
                        }
                        Label_0493: {
                            if (!y.g()) {
                                if (y.h(1) <= 0) {
                                    break Label_0493;
                                }
                            }
                            if (!y.g()) {
                                y.r(1);
                            }
                        }
                        if (g4) {
                            y.r(3);
                        }
                        y.r(3);
                        final boolean g5 = y.g();
                        if (h3 == 2 && g5) {
                            y.q();
                        }
                        boolean b3 = b2;
                        if (h3 != 1) {
                            b3 = b2;
                            if (y.g()) {
                                b3 = true;
                            }
                        }
                        if (y.g()) {
                            final int h7 = y.h(8);
                            final int h8 = y.h(8);
                            final int h9 = y.h(8);
                            int h10;
                            if (!b3 && h7 == 1 && h8 == 13 && h9 == 0) {
                                h10 = 1;
                            }
                            else {
                                h10 = y.h(1);
                            }
                            final h.b d = b.d(d0.h.j(h7));
                            int n6;
                            if (h10 == 1) {
                                n6 = n;
                            }
                            else {
                                n6 = 2;
                            }
                            d.c(n6).e(d0.h.k(h8));
                        }
                        return b.a();
                    }
                    string = "Unsupported initial_display_delay_present_flag";
                }
            }
        }
        g0.o.f("AtomParsers", string);
        return b.a();
    }
    
    public static Pair i(final z z, final int n, final int n2) {
        int n3 = n + 8;
        final boolean b = false;
        int n4 = -1;
        int n5 = 0;
        Integer n6;
        Serializable s = n6 = null;
        while (n3 - n < n2) {
            z.T(n3);
            final int p3 = z.p();
            final int p4 = z.p();
            Integer value;
            String d;
            if (p4 == 1718775137) {
                value = z.p();
                d = (String)s;
            }
            else if (p4 == 1935894637) {
                z.U(4);
                d = z.D(4);
                value = n6;
            }
            else {
                d = (String)s;
                value = n6;
                if (p4 == 1935894633) {
                    n4 = n3;
                    n5 = p3;
                    value = n6;
                    d = (String)s;
                }
            }
            n3 += p3;
            s = d;
            n6 = value;
        }
        if (!"cenc".equals(s) && !"cbc1".equals(s) && !"cens".equals(s) && !"cbcs".equals(s)) {
            return null;
        }
        u.a(n6 != null, "frma atom is mandatory");
        u.a(n4 != -1, "schi atom is mandatory");
        final t v = v(z, n4, n5, (String)s);
        boolean b2 = b;
        if (v != null) {
            b2 = true;
        }
        u.a(b2, "tenc atom is mandatory");
        return Pair.create((Object)n6, (Object)M.i(v));
    }
    
    public static Pair j(final Z0.a.a a) {
        final Z0.a.b g = a.g(1701606260);
        if (g == null) {
            return null;
        }
        final z b = g.b;
        b.T(8);
        final int c = a.c(b.p());
        final int k = b.K();
        final long[] array = new long[k];
        final long[] array2 = new long[k];
        for (int i = 0; i < k; ++i) {
            long n;
            if (c == 1) {
                n = b.L();
            }
            else {
                n = b.I();
            }
            array[i] = n;
            long z;
            if (c == 1) {
                z = b.z();
            }
            else {
                z = b.p();
            }
            array2[i] = z;
            if (b.C() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            b.U(2);
        }
        return Pair.create((Object)array, (Object)array2);
    }
    
    public static b k(final z z, int n) {
        z.T(n + 12);
        z.U(1);
        l(z);
        z.U(2);
        n = z.G();
        if ((n & 0x80) != 0x0) {
            z.U(2);
        }
        if ((n & 0x40) != 0x0) {
            z.U(z.G());
        }
        if ((n & 0x20) != 0x0) {
            z.U(2);
        }
        z.U(1);
        l(z);
        final String h = d0.z.h(z.G());
        if (!"audio/mpeg".equals(h) && !"audio/vnd.dts".equals(h) && !"audio/vnd.dts.hd".equals(h)) {
            z.U(4);
            long i = z.I();
            long j = z.I();
            z.U(1);
            n = l(z);
            final byte[] array = new byte[n];
            z.l(array, 0, n);
            if (j <= 0L) {
                j = -1L;
            }
            if (i <= 0L) {
                i = -1L;
            }
            return new b(h, array, j, i);
        }
        return new b(h, null, -1L, -1L);
    }
    
    public static int l(final z z) {
        int n;
        int n2;
        for (n = z.G(), n2 = (n & 0x7F); (n & 0x80) == 0x80; n = z.G(), n2 = (n2 << 7 | (n & 0x7F))) {}
        return n2;
    }
    
    public static int m(final z z) {
        z.T(16);
        return z.p();
    }
    
    public static x n(final z z, final int n) {
        z.U(8);
        final ArrayList<x.b> list = new ArrayList<x.b>();
        while (z.f() < n) {
            final x.b c = j.c(z);
            if (c != null) {
                list.add(c);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new x(list);
    }
    
    public static Pair o(final z z) {
        final int n = 8;
        z.T(8);
        final int c = Z0.a.c(z.p());
        int n2;
        if (c == 0) {
            n2 = 8;
        }
        else {
            n2 = 16;
        }
        z.U(n2);
        final long i = z.I();
        int n3 = n;
        if (c == 0) {
            n3 = 4;
        }
        z.U(n3);
        final int m = z.M();
        final StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char)((m >> 10 & 0x1F) + 96));
        sb.append((char)((m >> 5 & 0x1F) + 96));
        sb.append((char)((m & 0x1F) + 96));
        return Pair.create((Object)i, (Object)sb.toString());
    }
    
    public static x p(final Z0.a.a a) {
        final Z0.a.b g = a.g(1751411826);
        final Z0.a.b g2 = a.g(1801812339);
        final Z0.a.b g3 = a.g(1768715124);
        x x2;
        final x x = x2 = null;
        if (g != null) {
            x2 = x;
            if (g2 != null) {
                x2 = x;
                if (g3 != null) {
                    if (m(g.b) != 1835299937) {
                        return null;
                    }
                    final z b = g2.b;
                    b.T(12);
                    final int p = b.p();
                    final String[] array = new String[p];
                    for (int i = 0; i < p; ++i) {
                        final int p2 = b.p();
                        b.U(4);
                        array[i] = b.D(p2 - 8);
                    }
                    final z b2 = g3.b;
                    b2.T(8);
                    final ArrayList<h0.a> list = new ArrayList<h0.a>();
                    while (b2.a() > 8) {
                        final int f = b2.f();
                        final int p3 = b2.p();
                        final int j = b2.p() - 1;
                        if (j >= 0 && j < p) {
                            final h0.a h = Z0.j.h(b2, f + p3, array[j]);
                            if (h != null) {
                                list.add(h);
                            }
                        }
                        else {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Skipped metadata with unknown key index: ");
                            sb.append(j);
                            g0.o.h("AtomParsers", sb.toString());
                        }
                        b2.T(f + p3);
                    }
                    if (list.isEmpty()) {
                        return null;
                    }
                    x2 = new x(list);
                }
            }
        }
        return x2;
    }
    
    public static void q(final z z, final int n, final int n2, final int n3, final d d) {
        z.T(n2 + 16);
        if (n == 1835365492) {
            z.A();
            final String a = z.A();
            if (a != null) {
                d.b = new d0.q.b().Z(n3).o0(a).K();
            }
        }
    }
    
    public static h0.c r(final z z) {
        z.T(8);
        long n;
        long n2;
        if (Z0.a.c(z.p()) == 0) {
            n = z.I();
            n2 = z.I();
        }
        else {
            n = z.z();
            n2 = z.z();
        }
        return new h0.c(n, n2, z.I());
    }
    
    public static float s(final z z, int k) {
        z.T(k + 8);
        k = z.K();
        return k / (float)z.K();
    }
    
    public static byte[] t(final z z, final int n, final int n2) {
        int p3;
        for (int from = n + 8; from - n < n2; from += p3) {
            z.T(from);
            p3 = z.p();
            if (z.p() == 1886547818) {
                return Arrays.copyOfRange(z.e(), from, p3 + from);
            }
        }
        return null;
    }
    
    public static Pair u(final z z, final int n, final int n2) {
        int p3;
        for (int f = z.f(); f - n < n2; f += p3) {
            z.T(f);
            p3 = z.p();
            u.a(p3 > 0, "childAtomSize must be positive");
            if (z.p() == 1936289382) {
                final Pair i = i(z, f, p3);
                if (i != null) {
                    return i;
                }
            }
        }
        return null;
    }
    
    public static t v(final z z, int n, int n2, final String s) {
        int n3 = n + 8;
        while (true) {
            final byte[] array = null;
            if (n3 - n >= n2) {
                return null;
            }
            z.T(n3);
            final int p4 = z.p();
            if (z.p() == 1952804451) {
                n = Z0.a.c(z.p());
                z.U(1);
                if (n == 0) {
                    z.U(1);
                    n = (n2 = 0);
                }
                else {
                    n = z.G();
                    n2 = (n & 0xF);
                    n = (n & 0xF0) >> 4;
                }
                final boolean b = z.G() == 1;
                final int g = z.G();
                final byte[] array2 = new byte[16];
                z.l(array2, 0, 16);
                byte[] array3 = array;
                if (b) {
                    array3 = array;
                    if (g == 0) {
                        final int g2 = z.G();
                        array3 = new byte[g2];
                        z.l(array3, 0, g2);
                    }
                }
                return new t(b, s, g, array2, n, n2, array3);
            }
            n3 += p4;
        }
    }
    
    public static v w(final s s, final Z0.a.a a, final E e) {
        final Z0.a.b g = a.g(1937011578);
        c c;
        if (g != null) {
            c = new e(g, s.f);
        }
        else {
            final Z0.a.b g2 = a.g(1937013298);
            if (g2 == null) {
                throw A.a("Track has no sample table size information", null);
            }
            c = new f(g2);
        }
        final int b = c.b();
        if (b == 0) {
            return new v(s, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Z0.a.b g3 = a.g(1937007471);
        boolean b2;
        if (g3 == null) {
            g3 = (Z0.a.b)g0.a.e(a.g(1668232756));
            b2 = true;
        }
        else {
            b2 = false;
        }
        final z b3 = g3.b;
        final z b4 = ((Z0.a.b)g0.a.e(a.g(1937011555))).b;
        final z b5 = ((Z0.a.b)g0.a.e(a.g(1937011827))).b;
        final Z0.a.b g4 = a.g(1937011571);
        z b6;
        if (g4 != null) {
            b6 = g4.b;
        }
        else {
            b6 = null;
        }
        final Z0.a.b g5 = a.g(1668576371);
        z b7;
        if (g5 != null) {
            b7 = g5.b;
        }
        else {
            b7 = null;
        }
        final a a2 = new a(b4, b3, b2);
        b5.T(12);
        int i = b5.K() - 1;
        final int k = b5.K();
        int j = b5.K();
        int l;
        if (b7 != null) {
            b7.T(12);
            l = b7.K();
        }
        else {
            l = 0;
        }
        int m;
        int n;
        if (b6 != null) {
            b6.T(12);
            m = b6.K();
            if (m > 0) {
                n = b6.K() - 1;
            }
            else {
                n = -1;
                b6 = null;
            }
        }
        else {
            n = -1;
            m = 0;
        }
        final int a3 = c.a();
        final String n2 = s.f.n;
        int[] original3 = null;
        long[] array = null;
        int c3 = 0;
        long f = 0L;
        int[] b11 = null;
        long[] a5 = null;
        int n13 = 0;
        Label_1286: {
            if (a3 == -1 || (!"audio/raw".equals(n2) && !"audio/g711-mlaw".equals(n2) && !"audio/g711-alaw".equals(n2)) || i != 0 || l != 0 || m != 0) {
                long[] copy = new long[b];
                final int[] original = new int[b];
                final long[] original2 = new long[b];
                original3 = new int[b];
                int n3 = n;
                final int n4 = 0;
                int n5 = 0;
                final int n6 = 0;
                final boolean b8 = false;
                int k2 = 0;
                long n7 = 0L;
                long d = 0L;
                int n8 = l;
                int n9 = k;
                int i2 = m;
                int p3 = b8 ? 1 : 0;
                int c2 = n6;
                while (true) {
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int k3;
                    int p4;
                    long n21;
                    int n22;
                    for (int n10 = b, n11 = n4; n11 < n10; ++n11, d += n21, j = p4, --c2, n22 = n15, n3 = n18, i2 = n19, n5 = n17, n9 = k3, n8 = n14, p3 = n22, k2 = n16) {
                        boolean a4 = true;
                        boolean b9;
                        while (true) {
                            b9 = a4;
                            if (c2 != 0) {
                                break;
                            }
                            a4 = a2.a();
                            if (!(b9 = a4)) {
                                break;
                            }
                            d = a2.d;
                            c2 = a2.c;
                        }
                        final int i3 = n9;
                        if (!b9) {
                            g0.o.h("AtomParsers", "Unexpected end of chunk data");
                            copy = Arrays.copyOf(copy, n11);
                            final int[] copy2 = Arrays.copyOf(original, n11);
                            array = Arrays.copyOf(original2, n11);
                            original3 = Arrays.copyOf(original3, n11);
                            n10 = n11;
                            final int i4 = c2;
                            final long n12 = p3;
                            boolean b10 = false;
                            Label_1076: {
                                if (b7 != null) {
                                    while (n8 > 0) {
                                        if (b7.K() != 0) {
                                            b10 = false;
                                            break Label_1076;
                                        }
                                        b7.p();
                                        --n8;
                                    }
                                }
                                b10 = true;
                            }
                            if (i2 != 0 || i3 != 0 || i4 != 0 || i != 0 || k2 != 0 || !b10) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Inconsistent stbl box for track ");
                                sb.append(s.a);
                                sb.append(": remainingSynchronizationSamples ");
                                sb.append(i2);
                                sb.append(", remainingSamplesAtTimestampDelta ");
                                sb.append(i3);
                                sb.append(", remainingSamplesInChunk ");
                                sb.append(i4);
                                sb.append(", remainingTimestampDeltaChanges ");
                                sb.append(i);
                                sb.append(", remainingSamplesAtTimestampOffset ");
                                sb.append(k2);
                                String str;
                                if (!b10) {
                                    str = ", ctts invalid";
                                }
                                else {
                                    str = "";
                                }
                                sb.append(str);
                                g0.o.h("AtomParsers", sb.toString());
                            }
                            final long[] array2 = copy;
                            c3 = n5;
                            f = n7 + n12;
                            b11 = copy2;
                            a5 = array2;
                            n13 = n10;
                            break Label_1286;
                        }
                        n14 = n8;
                        n15 = p3;
                        n16 = k2;
                        if (b7 != null) {
                            while (k2 == 0 && n8 > 0) {
                                k2 = b7.K();
                                p3 = b7.p();
                                --n8;
                            }
                            n16 = k2 - 1;
                            n15 = p3;
                            n14 = n8;
                        }
                        copy[n11] = d;
                        final int c4 = c.c();
                        if ((original[n11] = c4) > (n17 = n5)) {
                            n17 = c4;
                        }
                        original2[n11] = n7 + n15;
                        original3[n11] = ((b6 == null) ? 1 : 0);
                        n18 = n3;
                        n19 = i2;
                        if (n11 == n3) {
                            original3[n11] = 1;
                            final int n20 = i2 - 1;
                            n18 = n3;
                            if ((n19 = n20) > 0) {
                                n18 = ((z)g0.a.e(b6)).K() - 1;
                                n19 = n20;
                            }
                        }
                        n7 += j;
                        k3 = i3 - 1;
                        if (k3 == 0 && i > 0) {
                            k3 = b5.K();
                            p4 = b5.p();
                            --i;
                        }
                        else {
                            p4 = j;
                        }
                        n21 = original[n11];
                    }
                    final int i3 = n9;
                    final int i4 = c2;
                    array = original2;
                    final int[] copy2 = original;
                    continue;
                }
            }
            final int a6 = a2.a;
            final long[] array3 = new long[a6];
            final int[] array4 = new int[a6];
            while (a2.a()) {
                final int b12 = a2.b;
                array3[b12] = a2.d;
                array4[b12] = a2.c;
            }
            final Z0.e.b a7 = e.a(a3, array3, array4, j);
            a5 = a7.a;
            b11 = a7.b;
            c3 = a7.c;
            array = a7.d;
            original3 = a7.e;
            f = a7.f;
            n13 = b;
        }
        final long w0 = M.W0(f, 1000000L, s.c);
        final long[] h = s.h;
        if (h == null) {
            M.X0(array, 1000000L, s.c);
            return new v(s, a5, b11, c3, array, original3, w0);
        }
        if (h.length == 1 && s.b == 1 && array.length >= 2) {
            final long n23 = ((long[])g0.a.e(s.i))[0];
            final long n24 = n23 + M.W0(s.h[0], s.c, s.d);
            if (b(array, f, n23, n24)) {
                final long w2 = M.W0(n23 - array[0], s.f.C, s.c);
                final long w3 = M.W0(f - n24, s.f.C, s.c);
                if ((w2 != 0L || w3 != 0L) && w2 <= 2147483647L && w3 <= 2147483647L) {
                    e.a = (int)w2;
                    e.b = (int)w3;
                    M.X0(array, 1000000L, s.c);
                    return new v(s, a5, b11, c3, array, original3, M.W0(s.h[0], 1000000L, s.d));
                }
            }
        }
        final int n25 = c3;
        final long[] h2 = s.h;
        if (h2.length == 1 && h2[0] == 0L) {
            final long n26 = ((long[])g0.a.e(s.i))[0];
            for (int n27 = 0; n27 < array.length; ++n27) {
                array[n27] = M.W0(array[n27] - n26, 1000000L, s.c);
            }
            return new v(s, a5, b11, n25, array, original3, M.W0(f - n26, 1000000L, s.c));
        }
        final boolean b13 = s.b == 1;
        final int[] array5 = new int[h2.length];
        final int[] array6 = new int[h2.length];
        final long[] array7 = (long[])g0.a.e(s.i);
        int n28 = 0;
        boolean b14 = false;
        int n29 = 0;
        int n30 = 0;
        final int[] array8 = b11;
        while (true) {
            final long[] h3 = s.h;
            if (n28 >= h3.length) {
                break;
            }
            final long n31 = array7[n28];
            boolean b15;
            int n34;
            if (n31 != -1L) {
                final long w4 = M.W0(h3[n28], s.c, s.d);
                array5[n28] = M.h(array, n31, true, true);
                array6[n28] = M.d(array, n31 + w4, b13, false);
                int n32;
                int n33;
                while (true) {
                    n32 = array5[n28];
                    n33 = array6[n28];
                    if (n32 >= n33 || (original3[n32] & 0x1) != 0x0) {
                        break;
                    }
                    array5[n28] = n32 + 1;
                }
                n29 += n33 - n32;
                b15 = (b14 | n30 != n32);
                n34 = n33;
            }
            else {
                final boolean b16 = b14;
                n34 = n30;
                b15 = b16;
            }
            ++n28;
            final boolean b17 = b15;
            n30 = n34;
            b14 = b17;
        }
        final int n35 = 0;
        boolean b18 = true;
        if (n29 == n13) {
            b18 = false;
        }
        final boolean b19 = b14 | b18;
        long[] array9;
        if (b19) {
            array9 = new long[n29];
        }
        else {
            array9 = a5;
        }
        int[] array10;
        if (b19) {
            array10 = new int[n29];
        }
        else {
            array10 = array8;
        }
        int n36;
        if (b19) {
            n36 = 0;
        }
        else {
            n36 = n25;
        }
        int[] array11;
        if (b19) {
            array11 = new int[n29];
        }
        else {
            array11 = original3;
        }
        final long[] array12 = new long[n29];
        long n37 = 0L;
        int n38 = 0;
        final int[] array13 = array8;
        final int[] array14 = original3;
        final int[] array15 = array11;
        int n39 = n35;
        final int[] array16 = array6;
        while (n39 < s.h.length) {
            final long n40 = s.i[n39];
            int n41 = array5[n39];
            final int n42 = array16[n39];
            if (b19) {
                final int n43 = n42 - n41;
                System.arraycopy(a5, n41, array9, n38, n43);
                System.arraycopy(array13, n41, array10, n38, n43);
                System.arraycopy(array14, n41, array15, n38, n43);
            }
            while (n41 < n42) {
                final long w5 = M.W0(n37, 1000000L, s.d);
                long b20 = M.W0(array[n41] - n40, 1000000L, s.c);
                if (c(s.b)) {
                    b20 = Math.max(0L, b20);
                }
                array12[n38] = w5 + b20;
                if (b19 && array10[n38] > n36) {
                    n36 = array13[n41];
                }
                ++n38;
                ++n41;
            }
            final long n44 = s.h[n39];
            ++n39;
            n37 += n44;
        }
        return new v(s, array9, array10, n36, array12, array15, M.W0(n37, 1000000L, s.d));
    }
    
    public static d x(final z z, final int n, final int n2, final String s, final m m, final boolean b) {
        z.T(12);
        final int p6 = z.p();
        final d d = new d(p6);
        for (int i = 0; i < p6; ++i) {
            final int f = z.f();
            final int p7 = z.p();
            u.a(p7 > 0, "childAtomSize must be positive");
            final int p8 = z.p();
            if (p8 == 1635148593 || p8 == 1635148595 || p8 == 1701733238 || p8 == 1831958048 || p8 == 1836070006 || p8 == 1752589105 || p8 == 1751479857 || p8 == 1932670515 || p8 == 1211250227 || p8 == 1987063864 || p8 == 1987063865 || p8 == 1635135537 || p8 == 1685479798 || p8 == 1685479729 || p8 == 1685481573 || p8 == 1685481521) {
                E(z, p8, f, p7, n, n2, m, d, i);
            }
            else if (p8 != 1836069985 && p8 != 1701733217 && p8 != 1633889587 && p8 != 1700998451 && p8 != 1633889588 && p8 != 1835823201 && p8 != 1685353315 && p8 != 1685353317 && p8 != 1685353320 && p8 != 1685353324 && p8 != 1685353336 && p8 != 1935764850 && p8 != 1935767394 && p8 != 1819304813 && p8 != 1936684916 && p8 != 1953984371 && p8 != 778924082 && p8 != 778924083 && p8 != 1835557169 && p8 != 1835560241 && p8 != 1634492771 && p8 != 1634492791 && p8 != 1970037111 && p8 != 1332770163 && p8 != 1716281667) {
                if (p8 != 1414810956 && p8 != 1954034535 && p8 != 2004251764 && p8 != 1937010800 && p8 != 1664495672) {
                    if (p8 == 1835365492) {
                        q(z, p8, f, n, d);
                    }
                    else if (p8 == 1667329389) {
                        d.b = new d0.q.b().Z(n).o0("application/x-camera-motion").K();
                    }
                }
                else {
                    y(z, p8, f, p7, n, s, d);
                }
            }
            else {
                g(z, p8, f, p7, n, s, b, m, d, i);
            }
            z.T(f + p7);
        }
        return d;
    }
    
    public static void y(final z z, int n, final int n2, final int n3, final int n4, final String s, final d d) {
        z.T(n2 + 16);
        final String s2 = "application/ttml+xml";
        List z2 = null;
        long n5 = Long.MAX_VALUE;
        String s3;
        if (n == 1414810956) {
            s3 = s2;
        }
        else if (n == 1954034535) {
            n = n3 - 16;
            final byte[] array = new byte[n];
            z.l(array, 0, n);
            z2 = X2.v.Z(array);
            s3 = "application/x-quicktime-tx3g";
        }
        else if (n == 2004251764) {
            s3 = "application/x-mp4-vtt";
        }
        else if (n == 1937010800) {
            n5 = 0L;
            s3 = s2;
        }
        else {
            if (n != 1664495672) {
                throw new IllegalStateException();
            }
            d.d = 1;
            s3 = "application/x-mp4-cea-608";
        }
        d.b = new d0.q.b().Z(n4).o0(s3).e0(s).s0(n5).b0(z2).K();
    }
    
    public static g z(final z z) {
        final int n = 8;
        z.T(8);
        final int c = Z0.a.c(z.p());
        int n2;
        if (c == 0) {
            n2 = 8;
        }
        else {
            n2 = 16;
        }
        z.U(n2);
        final int p = z.p();
        z.U(4);
        final int f = z.f();
        int n3 = n;
        if (c == 0) {
            n3 = 4;
        }
        final boolean b = false;
        int n4 = 0;
        long n6;
        while (true) {
            final long n5 = -9223372036854775807L;
            if (n4 >= n3) {
                z.U(n3);
                n6 = n5;
                break;
            }
            if (z.e()[f + n4] != -1) {
                if (c == 0) {
                    n6 = z.I();
                }
                else {
                    n6 = z.L();
                }
                if (n6 == 0L) {
                    n6 = n5;
                    break;
                }
                break;
            }
            else {
                ++n4;
            }
        }
        z.U(16);
        final int p2 = z.p();
        final int p3 = z.p();
        z.U(4);
        final int p4 = z.p();
        final int p5 = z.p();
        int n7;
        if (p2 == 0 && p3 == 65536 && p4 == -65536 && p5 == 0) {
            n7 = 90;
        }
        else if (p2 == 0 && p3 == -65536 && p4 == 65536 && p5 == 0) {
            n7 = 270;
        }
        else {
            n7 = (b ? 1 : 0);
            if (p2 == -65536) {
                n7 = (b ? 1 : 0);
                if (p3 == 0) {
                    n7 = (b ? 1 : 0);
                    if (p4 == 0) {
                        n7 = (b ? 1 : 0);
                        if (p5 == -65536) {
                            n7 = 180;
                        }
                    }
                }
            }
        }
        return new g(p, n6, n7);
    }
    
    public static final class a
    {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final z f;
        public final z g;
        public int h;
        public int i;
        
        public a(final z g, final z f, final boolean e) {
            this.g = g;
            this.f = f;
            this.e = e;
            f.T(12);
            this.a = f.K();
            g.T(12);
            this.i = g.K();
            final int p3 = g.p();
            boolean b = true;
            if (p3 != 1) {
                b = false;
            }
            u.a(b, "first_chunk must be 1");
            this.b = -1;
        }
        
        public boolean a() {
            final int b = this.b + 1;
            this.b = b;
            if (b == this.a) {
                return false;
            }
            long d;
            if (this.e) {
                d = this.f.L();
            }
            else {
                d = this.f.I();
            }
            this.d = d;
            if (this.b == this.h) {
                this.c = this.g.K();
                this.g.U(4);
                int h;
                if (--this.i > 0) {
                    h = this.g.K() - 1;
                }
                else {
                    h = -1;
                }
                this.h = h;
            }
            return true;
        }
    }
    
    public static final class b
    {
        public final String a;
        public final byte[] b;
        public final long c;
        public final long d;
        
        public b(final String a, final byte[] b, final long c, final long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static /* synthetic */ String a(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ byte[] b(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ long c(final b b) {
            return b.d;
        }
        
        public static /* synthetic */ long d(final b b) {
            return b.c;
        }
    }
    
    public interface c
    {
        int a();
        
        int b();
        
        int c();
    }
    
    public static final class d
    {
        public final t[] a;
        public d0.q b;
        public int c;
        public int d;
        
        public d(final int n) {
            this.a = new t[n];
            this.d = 0;
        }
    }
    
    public static final class e implements c
    {
        public final int a;
        public final int b;
        public final z c;
        
        public e(final Z0.a.b b, final d0.q q) {
            final z b2 = b.b;
            (this.c = b2).T(12);
            int k;
            final int i = k = b2.K();
            Label_0118: {
                if ("audio/raw".equals(q.n)) {
                    final int g0 = M.g0(q.D, q.B);
                    if (i != 0) {
                        k = i;
                        if (i % g0 == 0) {
                            break Label_0118;
                        }
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Audio sample size mismatch. stsd sample size: ");
                    sb.append(g0);
                    sb.append(", stsz sample size: ");
                    sb.append(i);
                    g0.o.h("AtomParsers", sb.toString());
                    k = g0;
                }
            }
            int a;
            if ((a = k) == 0) {
                a = -1;
            }
            this.a = a;
            this.b = b2.K();
        }
        
        @Override
        public int a() {
            return this.a;
        }
        
        @Override
        public int b() {
            return this.b;
        }
        
        @Override
        public int c() {
            int n;
            if ((n = this.a) == -1) {
                n = this.c.K();
            }
            return n;
        }
    }
    
    public static final class f implements c
    {
        public final z a;
        public final int b;
        public final int c;
        public int d;
        public int e;
        
        public f(final Z0.a.b b) {
            final z b2 = b.b;
            (this.a = b2).T(12);
            this.c = (b2.K() & 0xFF);
            this.b = b2.K();
        }
        
        @Override
        public int a() {
            return -1;
        }
        
        @Override
        public int b() {
            return this.b;
        }
        
        @Override
        public int c() {
            final int c = this.c;
            if (c == 8) {
                return this.a.G();
            }
            if (c == 16) {
                return this.a.M();
            }
            if (this.d++ % 2 == 0) {
                return ((this.e = this.a.G()) & 0xF0) >> 4;
            }
            return this.e & 0xF;
        }
    }
    
    public static final class g
    {
        public final int a;
        public final long b;
        public final int c;
        
        public g(final int a, final long b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static /* synthetic */ long a(final g g) {
            return g.b;
        }
        
        public static /* synthetic */ int b(final g g) {
            return g.a;
        }
        
        public static /* synthetic */ int c(final g g) {
            return g.c;
        }
    }
}
