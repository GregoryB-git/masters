// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import F0.L;
import F0.Q;
import java.util.UUID;
import java.util.ArrayList;
import d0.m;
import g0.M;
import android.util.Pair;
import d0.A;
import java.util.Arrays;
import h0.d;
import java.util.Collections;
import X2.v;
import java.util.ArrayDeque;
import Q0.c;
import g0.E;
import g0.z;
import android.util.SparseArray;
import java.util.List;
import F0.T;
import F0.t;
import d0.q;
import F0.x;
import F0.r;

public class h implements r
{
    public static final x K;
    public static final byte[] L;
    public static final q M;
    public long A;
    public b B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public t G;
    public T[] H;
    public T[] I;
    public boolean J;
    public final c1.t.a a;
    public final int b;
    public final s c;
    public final List d;
    public final SparseArray e;
    public final z f;
    public final z g;
    public final z h;
    public final byte[] i;
    public final z j;
    public final E k;
    public final c l;
    public final z m;
    public final ArrayDeque n;
    public final ArrayDeque o;
    public final T p;
    public v q;
    public int r;
    public int s;
    public long t;
    public int u;
    public z v;
    public long w;
    public int x;
    public long y;
    public long z;
    
    static {
        K = new f();
        L = new byte[] { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
        M = new q.b().o0("application/x-emsg").K();
    }
    
    public h(final c1.t.a a, final int n) {
        this(a, n, null, null, X2.v.Y(), null);
    }
    
    public h(final c1.t.a a, final int b, final E k, final s c, final List list, final T p6) {
        this.a = a;
        this.b = b;
        this.k = k;
        this.c = c;
        this.d = Collections.unmodifiableList((List<?>)list);
        this.p = p6;
        this.l = new c();
        this.m = new z(16);
        this.f = new z(h0.d.a);
        this.g = new z(5);
        this.h = new z();
        final byte[] i = new byte[16];
        this.i = i;
        this.j = new z(i);
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.e = new SparseArray();
        this.q = X2.v.Y();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.G = F0.t.a;
        this.H = new T[0];
        this.I = new T[0];
    }
    
    public static void A(final Z0.t t, final z z, final u u) {
        final int d = t.d;
        z.T(8);
        final int b = Z0.a.b(z.p());
        boolean val = true;
        if ((b & 0x1) == 0x1) {
            z.U(8);
        }
        final int g = z.G();
        final int k = z.K();
        if (k <= u.f) {
            int n3;
            if (g == 0) {
                final boolean[] m = u.m;
                int n2;
                int n = n2 = 0;
                while (true) {
                    n3 = n2;
                    if (n >= k) {
                        break;
                    }
                    final int g2 = z.G();
                    n2 += g2;
                    m[n] = (g2 > d);
                    ++n;
                }
            }
            else {
                if (g <= d) {
                    val = false;
                }
                n3 = g * k;
                Arrays.fill(u.m, 0, k, val);
            }
            Arrays.fill(u.m, k, u.f, false);
            if (n3 > 0) {
                u.d(n3);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Saiz sample count ");
        sb.append(k);
        sb.append(" is greater than fragment sample count");
        sb.append(u.f);
        throw A.a(sb.toString(), null);
    }
    
    public static void B(final Z0.a.a a, final String s, final u u) {
        final byte[] array = null;
        z z2;
        z z = z2 = null;
        z z3;
        z z4;
        for (int i = 0; i < a.c.size(); ++i, z = z3, z2 = z4) {
            final Z0.a.b b = a.c.get(i);
            final z b2 = b.b;
            final int a2 = b.a;
            if (a2 == 1935828848) {
                b2.T(12);
                z3 = z;
                z4 = z2;
                if (b2.p() == 1936025959) {
                    z3 = b2;
                    z4 = z2;
                }
            }
            else {
                z3 = z;
                z4 = z2;
                if (a2 == 1936158820) {
                    b2.T(12);
                    z3 = z;
                    z4 = z2;
                    if (b2.p() == 1936025959) {
                        z4 = b2;
                        z3 = z;
                    }
                }
            }
        }
        if (z == null) {
            return;
        }
        if (z2 == null) {
            return;
        }
        z.T(8);
        final int c = a.c(z.p());
        z.U(4);
        if (c == 1) {
            z.U(4);
        }
        if (z.p() != 1) {
            throw A.d("Entry count in sbgp != 1 (unsupported).");
        }
        z2.T(8);
        final int c2 = a.c(z2.p());
        z2.U(4);
        if (c2 == 1) {
            if (z2.I() == 0L) {
                throw A.d("Variable length description in sgpd found (unsupported)");
            }
        }
        else if (c2 >= 2) {
            z2.U(4);
        }
        if (z2.I() != 1L) {
            throw A.d("Entry count in sgpd != 1 (unsupported).");
        }
        z2.U(1);
        final int g = z2.G();
        final boolean b3 = z2.G() == 1;
        if (!b3) {
            return;
        }
        final int g2 = z2.G();
        final byte[] array2 = new byte[16];
        z2.l(array2, 0, 16);
        byte[] array3 = array;
        if (g2 == 0) {
            final int g3 = z2.G();
            array3 = new byte[g3];
            z2.l(array3, 0, g3);
        }
        u.l = true;
        u.n = new Z0.t(b3, s, g2, array2, (g & 0xF0) >> 4, g & 0xF, array3);
    }
    
    public static void C(final z z, int n, final u u) {
        z.T(n + 8);
        n = Z0.a.b(z.p());
        if ((n & 0x1) != 0x0) {
            throw A.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        final boolean val = (n & 0x2) != 0x0;
        n = z.K();
        if (n == 0) {
            Arrays.fill(u.m, 0, u.f, false);
            return;
        }
        if (n == u.f) {
            Arrays.fill(u.m, 0, n, val);
            u.d(z.a());
            u.b(z);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Senc sample count ");
        sb.append(n);
        sb.append(" is different from fragment sample count");
        sb.append(u.f);
        throw A.a(sb.toString(), null);
    }
    
    public static void D(final z z, final u u) {
        C(z, 0, u);
    }
    
    public static Pair E(final z z, long n) {
        z.T(8);
        final int c = Z0.a.c(z.p());
        z.U(4);
        final long i = z.I();
        long n2;
        long n3;
        if (c == 0) {
            n2 = z.I();
            n3 = z.I();
        }
        else {
            n2 = z.L();
            n3 = z.L();
        }
        n += n3;
        final long w0 = g0.M.W0(n2, 1000000L, i);
        z.U(2);
        final int m = z.M();
        final int[] array = new int[m];
        final long[] array2 = new long[m];
        final long[] array3 = new long[m];
        final long[] array4 = new long[m];
        long w2 = w0;
        for (int j = 0; j < m; ++j) {
            final int p2 = z.p();
            if ((p2 & Integer.MIN_VALUE) != 0x0) {
                throw A.a("Unhandled indirect reference", null);
            }
            final long k = z.I();
            array[j] = (p2 & Integer.MAX_VALUE);
            array2[j] = n;
            array4[j] = w2;
            n2 += k;
            w2 = g0.M.W0(n2, 1000000L, i);
            array3[j] = w2 - array4[j];
            z.U(4);
            n += array[j];
        }
        return Pair.create((Object)w0, (Object)new F0.h(array, array2, array3, array4));
    }
    
    public static long F(final z z) {
        z.T(8);
        if (Z0.a.c(z.p()) == 1) {
            return z.L();
        }
        return z.I();
    }
    
    public static b G(final z z, final SparseArray sparseArray, final boolean b) {
        z.T(8);
        final int b2 = Z0.a.b(z.p());
        final int p3 = z.p();
        Object o;
        if (b) {
            o = sparseArray.valueAt(0);
        }
        else {
            o = sparseArray.get(p3);
        }
        final b b3 = (b)o;
        if (b3 == null) {
            return null;
        }
        if ((b2 & 0x1) != 0x0) {
            final long l = z.L();
            final u b4 = b3.b;
            b4.c = l;
            b4.d = l;
        }
        final Z0.d e = b3.e;
        int a;
        if ((b2 & 0x2) != 0x0) {
            a = z.p() - 1;
        }
        else {
            a = e.a;
        }
        int n;
        if ((b2 & 0x8) != 0x0) {
            n = z.p();
        }
        else {
            n = e.b;
        }
        int n2;
        if ((b2 & 0x10) != 0x0) {
            n2 = z.p();
        }
        else {
            n2 = e.c;
        }
        int n3;
        if ((b2 & 0x20) != 0x0) {
            n3 = z.p();
        }
        else {
            n3 = e.d;
        }
        b3.b.a = new Z0.d(a, n, n2, n3);
        return b3;
    }
    
    public static void H(final Z0.a.a a, final SparseArray sparseArray, final boolean b, int i, final byte[] array) {
        final b g = G(((Z0.a.b)g0.a.e(a.g(1952868452))).b, sparseArray, b);
        if (g == null) {
            return;
        }
        final u b2 = g.b;
        final long q = b2.q;
        final boolean r = b2.r;
        g.k();
        h.b.b(g, true);
        final Z0.a.b g2 = a.g(1952867444);
        if (g2 != null && (i & 0x2) == 0x0) {
            b2.q = F(g2.b);
            b2.r = true;
        }
        else {
            b2.q = q;
            b2.r = r;
        }
        K(a, g, i);
        final Z0.t a2 = g.d.a.a(((Z0.d)g0.a.e(b2.a)).a);
        final Z0.a.b g3 = a.g(1935763834);
        if (g3 != null) {
            A((Z0.t)g0.a.e(a2), g3.b, b2);
        }
        final Z0.a.b g4 = a.g(1935763823);
        if (g4 != null) {
            z(g4.b, b2);
        }
        final Z0.a.b g5 = a.g(1936027235);
        if (g5 != null) {
            D(g5.b, b2);
        }
        String b3;
        if (a2 != null) {
            b3 = a2.b;
        }
        else {
            b3 = null;
        }
        B(a, b3, b2);
        int size;
        Z0.a.b b4;
        for (size = a.c.size(), i = 0; i < size; ++i) {
            b4 = a.c.get(i);
            if (b4.a == 1970628964) {
                L(b4.b, b2, array);
            }
        }
    }
    
    public static Pair I(final z z) {
        z.T(12);
        return Pair.create((Object)z.p(), (Object)new Z0.d(z.p() - 1, z.p(), z.p(), z.p()));
    }
    
    public static int J(final b b, int n, int n2, final z z, int i) {
        z.T(8);
        final int b2 = Z0.a.b(z.p());
        final s a = b.d.a;
        final u b3 = b.b;
        final Z0.d d = (Z0.d)g0.M.i(b3.a);
        b3.h[n] = z.K();
        final long[] g = b3.g;
        final long c = b3.c;
        g[n] = c;
        if ((b2 & 0x1) != 0x0) {
            g[n] = c + z.p();
        }
        final boolean b4 = (b2 & 0x4) != 0x0;
        int n3 = d.d;
        if (b4) {
            n3 = z.p();
        }
        final boolean b5 = (b2 & 0x100) != 0x0;
        final boolean b6 = (b2 & 0x200) != 0x0;
        final boolean b7 = (b2 & 0x400) != 0x0;
        final boolean b8 = (b2 & 0x800) != 0x0;
        long n4;
        if (o(a)) {
            n4 = ((long[])g0.M.i(a.i))[0];
        }
        else {
            n4 = 0L;
        }
        final int[] j = b3.i;
        final long[] k = b3.j;
        final boolean[] l = b3.k;
        if (a.b == 2 && (n2 & 0x1) != 0x0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final int n5 = i + b3.h[n];
        final long c2 = a.c;
        long q = b3.q;
        while (i < n5) {
            if (b5) {
                n = z.p();
            }
            else {
                n = d.b;
            }
            final int f = f(n);
            if (b6) {
                n = z.p();
            }
            else {
                n = d.c;
            }
            final int f2 = f(n);
            if (b7) {
                n = z.p();
            }
            else if (i == 0 && b4) {
                n = n3;
            }
            else {
                n = d.d;
            }
            int p5;
            if (b8) {
                p5 = z.p();
            }
            else {
                p5 = 0;
            }
            final long w0 = g0.M.W0(p5 + q - n4, 1000000L, c2);
            k[i] = w0;
            if (!b3.r) {
                k[i] = w0 + b.d.h;
            }
            j[i] = f2;
            l[i] = ((n >> 16 & 0x1) == 0x0 && (n2 == 0 || i == 0));
            q += f;
            ++i;
        }
        b3.q = q;
        return n5;
    }
    
    public static void K(final Z0.a.a a, final b b, final int n) {
        final List c = a.c;
        final int size = c.size();
        final int n2 = 0;
        final int n3 = 0;
        int n5;
        int n4 = n5 = n3;
        int n6;
        int n7;
        for (int i = n3; i < size; ++i, n5 = n6, n4 = n7) {
            final Z0.a.b b2 = c.get(i);
            n6 = n5;
            n7 = n4;
            if (b2.a == 1953658222) {
                final z b3 = b2.b;
                b3.T(12);
                final int k = b3.K();
                n6 = n5;
                n7 = n4;
                if (k > 0) {
                    n7 = n4 + k;
                    n6 = n5 + 1;
                }
            }
        }
        b.h = 0;
        b.g = 0;
        b.f = 0;
        b.b.e(n5, n4);
        int n9;
        int n8 = n9 = 0;
        int n10;
        int l;
        for (int j = n2; j < size; ++j, n8 = n10, n9 = l) {
            final Z0.a.b b4 = c.get(j);
            n10 = n8;
            l = n9;
            if (b4.a == 1953658222) {
                l = J(b, n8, n, b4.b, n9);
                n10 = n8 + 1;
            }
        }
    }
    
    public static void L(final z z, final u u, final byte[] a) {
        z.T(8);
        z.l(a, 0, 16);
        if (!Arrays.equals(a, h.L)) {
            return;
        }
        C(z, 16, u);
    }
    
    private void M(final long n) {
        while (!this.n.isEmpty() && this.n.peek().b == n) {
            this.r(this.n.pop());
        }
        this.h();
    }
    
    private boolean N(final F0.s s) {
        if (this.u == 0) {
            if (!s.d(this.m.e(), 0, 8, true)) {
                return false;
            }
            this.u = 8;
            this.m.T(0);
            this.t = this.m.I();
            this.s = this.m.p();
        }
        final long t = this.t;
        Label_0210: {
            long l;
            if (t == 1L) {
                s.readFully(this.m.e(), 8, 8);
                this.u += 8;
                l = this.m.L();
            }
            else {
                if (t != 0L) {
                    break Label_0210;
                }
                long n2;
                final long n = n2 = s.a();
                if (n == -1L) {
                    n2 = n;
                    if (!this.n.isEmpty()) {
                        n2 = this.n.peek().b;
                    }
                }
                if (n2 == -1L) {
                    break Label_0210;
                }
                l = n2 - s.p() + this.u;
            }
            this.t = l;
        }
        if (this.t < this.u) {
            throw d0.A.d("Atom size less than header length (unsupported).");
        }
        final long c = s.p() - this.u;
        final int s2 = this.s;
        if ((s2 == 1836019558 || s2 == 1835295092) && !this.J) {
            this.G.e(new F0.M.b(this.z, c));
            this.J = true;
        }
        if (this.s == 1836019558) {
            for (int size = this.e.size(), i = 0; i < size; ++i) {
                final u b = ((b)this.e.valueAt(i)).b;
                b.b = c;
                b.d = c;
                b.c = c;
            }
        }
        final int s3 = this.s;
        if (s3 == 1835295092) {
            this.B = null;
            this.w = c + this.t;
            this.r = 2;
            return true;
        }
        if (!R(s3)) {
            if (S(this.s)) {
                if (this.u != 8) {
                    throw d0.A.d("Leaf atom defines extended atom size (unsupported).");
                }
                if (this.t > 2147483647L) {
                    throw d0.A.d("Leaf atom with length > 2147483647 (unsupported).");
                }
                final z v = new z((int)this.t);
                System.arraycopy(this.m.e(), 0, v.e(), 0, 8);
                this.v = v;
            }
            else {
                if (this.t > 2147483647L) {
                    throw d0.A.d("Skipping atom with length > 2147483647 (unsupported).");
                }
                this.v = null;
            }
            this.r = 1;
            return true;
        }
        final long n3 = s.p() + this.t - 8L;
        this.n.push(new Z0.a.a(this.s, n3));
        if (this.t == this.u) {
            this.M(n3);
            return true;
        }
        this.h();
        return true;
    }
    
    private static boolean R(final int n) {
        return n == 1836019574 || n == 1953653099 || n == 1835297121 || n == 1835626086 || n == 1937007212 || n == 1836019558 || n == 1953653094 || n == 1836475768 || n == 1701082227;
    }
    
    private static boolean S(final int n) {
        return n == 1751411826 || n == 1835296868 || n == 1836476516 || n == 1936286840 || n == 1937011556 || n == 1937011827 || n == 1668576371 || n == 1937011555 || n == 1937011578 || n == 1937013298 || n == 1937007471 || n == 1668232756 || n == 1937011571 || n == 1952867444 || n == 1952868452 || n == 1953196132 || n == 1953654136 || n == 1953658222 || n == 1886614376 || n == 1935763834 || n == 1935763823 || n == 1936027235 || n == 1970628964 || n == 1935828848 || n == 1936158820 || n == 1701606260 || n == 1835362404 || n == 1701671783;
    }
    
    public static int f(final int i) {
        if (i >= 0) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw A.a(sb.toString(), null);
    }
    
    private void h() {
        this.r = 0;
        this.u = 0;
    }
    
    public static m k(final List list) {
        final int size = list.size();
        int i = 0;
        List<m.b> list2 = null;
        while (i < size) {
            final Z0.a.b b = list.get(i);
            List<m.b> list3 = list2;
            if (b.a == 1886614376) {
                if ((list3 = list2) == null) {
                    list3 = new ArrayList<m.b>();
                }
                final byte[] e = b.b.e();
                final UUID f = o.f(e);
                if (f == null) {
                    g0.o.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList<m.b>)list3).add(new m.b(f, "video/mp4", e));
                }
            }
            ++i;
            list2 = list3;
        }
        if (list2 == null) {
            return null;
        }
        return new m(list2);
    }
    
    public static b l(final SparseArray sparseArray) {
        final int size = sparseArray.size();
        b b = null;
        long n = Long.MAX_VALUE;
        b b3;
        long n2;
        for (int i = 0; i < size; ++i, b = b3, n = n2) {
            final b b2 = (b)sparseArray.valueAt(i);
            if (!h.b.a(b2)) {
                b3 = b;
                n2 = n;
                if (b2.f == b2.d.b) {
                    continue;
                }
            }
            if (h.b.a(b2) && b2.h == b2.b.e) {
                b3 = b;
                n2 = n;
            }
            else {
                final long d = b2.d();
                b3 = b;
                n2 = n;
                if (d < n) {
                    b3 = b2;
                    n2 = d;
                }
            }
        }
        return b;
    }
    
    public static boolean o(final s s) {
        final long[] h = s.h;
        boolean b2;
        final boolean b = b2 = false;
        if (h != null) {
            b2 = b;
            if (h.length == 1) {
                final long[] i = s.i;
                if (i == null) {
                    return false;
                }
                final long n = h[0];
                if (n == 0L) {
                    return true;
                }
                b2 = b;
                if (g0.M.W0(n + i[0], 1000000L, s.d) >= s.e) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static long x(final z z) {
        z.T(8);
        if (Z0.a.c(z.p()) == 0) {
            return z.I();
        }
        return z.L();
    }
    
    public static void y(final Z0.a.a a, final SparseArray sparseArray, final boolean b, final int n, final byte[] array) {
        for (int size = a.d.size(), i = 0; i < size; ++i) {
            final Z0.a.a a2 = a.d.get(i);
            if (a2.a == 1953653094) {
                H(a2, sparseArray, b, n, array);
            }
        }
    }
    
    public static void z(final z z, final u u) {
        z.T(8);
        final int p2 = z.p();
        if ((Z0.a.b(p2) & 0x1) == 0x1) {
            z.U(8);
        }
        final int k = z.K();
        if (k == 1) {
            final int c = Z0.a.c(p2);
            final long d = u.d;
            long n;
            if (c == 0) {
                n = z.I();
            }
            else {
                n = z.L();
            }
            u.d = d + n;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected saio entry count: ");
        sb.append(k);
        throw A.a(sb.toString(), null);
    }
    
    public final void O(final F0.s s) {
        final int n = (int)this.t - this.u;
        final z v = this.v;
        if (v != null) {
            s.readFully(v.e(), 8, n);
            this.t(new Z0.a.b(this.s, v), s.p());
        }
        else {
            s.i(n);
        }
        this.M(s.p());
    }
    
    public final void P(final F0.s s) {
        final int size = this.e.size();
        long n = Long.MAX_VALUE;
        int i = 0;
        b b = null;
        while (i < size) {
            final u b2 = ((b)this.e.valueAt(i)).b;
            long n2 = n;
            b b3 = b;
            if (b2.p) {
                final long d = b2.d;
                n2 = n;
                b3 = b;
                if (d < n) {
                    b3 = (b)this.e.valueAt(i);
                    n2 = d;
                }
            }
            ++i;
            n = n2;
            b = b3;
        }
        if (b == null) {
            this.r = 3;
            return;
        }
        final int n3 = (int)(n - s.p());
        if (n3 >= 0) {
            s.i(n3);
            b.b.a(s);
            return;
        }
        throw d0.A.a("Offset to encryption data was negative.", null);
    }
    
    public final boolean Q(final F0.s s) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public void a(final long n, final long y) {
        for (int size = this.e.size(), i = 0; i < size; ++i) {
            ((b)this.e.valueAt(i)).k();
        }
        this.o.clear();
        this.x = 0;
        this.y = y;
        this.n.clear();
        this.h();
    }
    
    @Override
    public void b(final t t) {
        t g;
        if ((this.b & 0x20) == 0x0) {
            g = new c1.v(t, this.a);
        }
        else {
            g = t;
        }
        this.G = g;
        this.h();
        this.n();
        final s c = this.c;
        if (c != null) {
            this.e.put(0, (Object)new b(t.a(0, c.b), new Z0.v(this.c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new Z0.d(0, 0, 0, 0)));
            this.G.j();
        }
    }
    
    @Override
    public boolean e(final F0.s s) {
        final Q b = Z0.r.b(s);
        v q;
        if (b != null) {
            q = X2.v.Z(b);
        }
        else {
            q = X2.v.Y();
        }
        this.q = q;
        return b == null;
    }
    
    @Override
    public int i(final F0.s s, final L l) {
        while (true) {
            final int r = this.r;
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (this.Q(s)) {
                            return 0;
                        }
                        continue;
                    }
                    else {
                        this.P(s);
                    }
                }
                else {
                    this.O(s);
                }
            }
            else {
                if (!this.N(s)) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    public final Z0.d j(final SparseArray sparseArray, final int n) {
        Object o;
        if (sparseArray.size() == 1) {
            o = sparseArray.valueAt(0);
        }
        else {
            o = g0.a.e(sparseArray.get(n));
        }
        return (Z0.d)o;
    }
    
    public v m() {
        return this.q;
    }
    
    public final void n() {
        final T[] h = new T[2];
        this.H = h;
        final T p = this.p;
        final int n = 0;
        int n2;
        if (p != null) {
            h[0] = p;
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final int b = this.b;
        int n3 = 100;
        int n4 = n2;
        if ((b & 0x4) != 0x0) {
            h[n2] = this.G.a(100, 5);
            n3 = 101;
            n4 = n2 + 1;
        }
        final T[] h2 = (T[])g0.M.O0(this.H, n4);
        this.H = h2;
        for (int length = h2.length, i = 0; i < length; ++i) {
            h2[i].d(Z0.h.M);
        }
        this.I = new T[this.d.size()];
        for (int j = n; j < this.I.length; ++j, ++n3) {
            final T a = this.G.a(n3, 3);
            a.d(this.d.get(j));
            this.I[j] = a;
        }
    }
    
    public s q(final s s) {
        return s;
    }
    
    public final void r(final Z0.a.a a) {
        final int a2 = a.a;
        if (a2 == 1836019574) {
            this.v(a);
            return;
        }
        if (a2 == 1836019558) {
            this.u(a);
            return;
        }
        if (!this.n.isEmpty()) {
            ((Z0.a.a)this.n.peek()).d(a);
        }
    }
    
    @Override
    public void release() {
    }
    
    public final void s(final z z) {
        if (this.H.length == 0) {
            return;
        }
        z.T(8);
        final int c = Z0.a.c(z.p());
        long w0;
        long n;
        long n2;
        String s;
        String s2;
        long w2;
        if (c != 0) {
            if (c != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Skipping unsupported emsg version: ");
                sb.append(c);
                g0.o.h("FragmentedMp4Extractor", sb.toString());
                return;
            }
            final long i = z.I();
            w0 = g0.M.W0(z.L(), 1000000L, i);
            n = g0.M.W0(z.I(), 1000L, i);
            n2 = z.I();
            s = (String)g0.a.e(z.A());
            s2 = (String)g0.a.e(z.A());
            w2 = -9223372036854775807L;
        }
        else {
            s = (String)g0.a.e(z.A());
            s2 = (String)g0.a.e(z.A());
            final long j = z.I();
            w2 = g0.M.W0(z.I(), 1000000L, j);
            final long a = this.A;
            if (a != -9223372036854775807L) {
                w0 = a + w2;
            }
            else {
                w0 = -9223372036854775807L;
            }
            n = g0.M.W0(z.I(), 1000L, j);
            n2 = z.I();
        }
        final byte[] array = new byte[z.a()];
        final int a2 = z.a();
        final int n3 = 0;
        z.l(array, 0, a2);
        final z z2 = new z(this.l.a(new Q0.a(s, s2, n, n2, array)));
        final int a3 = z2.a();
        final T[] h = this.H;
        for (int length = h.length, k = 0; k < length; ++k) {
            final T t = h[k];
            z2.T(0);
            t.e(z2, a3);
        }
        if (w0 == -9223372036854775807L) {
            this.o.addLast(new a(w2, true, a3));
        }
        else {
            ArrayDeque arrayDeque;
            a e;
            if (!this.o.isEmpty()) {
                arrayDeque = this.o;
                e = new a(w0, false, a3);
            }
            else {
                final E l = this.k;
                if (l == null || l.g()) {
                    final E m = this.k;
                    long a4 = w0;
                    if (m != null) {
                        a4 = m.a(w0);
                    }
                    final T[] h2 = this.H;
                    for (int length2 = h2.length, n4 = n3; n4 < length2; ++n4) {
                        h2[n4].b(a4, 1, a3, 0, null);
                    }
                    return;
                }
                arrayDeque = this.o;
                e = new a(w0, false, a3);
            }
            arrayDeque.addLast(e);
        }
        this.x += a3;
    }
    
    public final void t(final Z0.a.b b, final long n) {
        if (!this.n.isEmpty()) {
            ((Z0.a.a)this.n.peek()).e(b);
            return;
        }
        final int a = b.a;
        if (a == 1936286840) {
            final Pair e = E(b.b, n);
            this.A = (long)e.first;
            this.G.e((F0.M)e.second);
            this.J = true;
            return;
        }
        if (a == 1701671783) {
            this.s(b.b);
        }
    }
    
    public final void u(final Z0.a.a a) {
        final SparseArray e = this.e;
        final s c = this.c;
        final int n = 0;
        y(a, e, c != null, this.b, this.i);
        final m k = k(a.c);
        if (k != null) {
            for (int size = this.e.size(), i = 0; i < size; ++i) {
                ((b)this.e.valueAt(i)).n(k);
            }
        }
        if (this.y != -9223372036854775807L) {
            for (int size2 = this.e.size(), j = n; j < size2; ++j) {
                ((b)this.e.valueAt(j)).l(this.y);
            }
            this.y = -9223372036854775807L;
        }
    }
    
    public final void v(final Z0.a.a a) {
        final s c = this.c;
        final int n = 0;
        final int n2 = 0;
        final boolean b = true;
        g0.a.g(c == null, "Unexpected moov box.");
        final m k = k(a.c);
        final Z0.a.a a2 = (Z0.a.a)g0.a.e(a.f(1836475768));
        final SparseArray sparseArray = new SparseArray();
        final int size = a2.c.size();
        long x = -9223372036854775807L;
        for (int i = 0; i < size; ++i) {
            final Z0.a.b b2 = a2.c.get(i);
            final int a3 = b2.a;
            if (a3 == 1953654136) {
                final Pair j = I(b2.b);
                sparseArray.put((int)j.first, (Object)j.second);
            }
            else if (a3 == 1835362404) {
                x = x(b2.b);
            }
        }
        final List b3 = Z0.b.B(a, new F0.E(), x, k, (this.b & 0x10) != 0x0, false, new g(this));
        final int size2 = b3.size();
        if (this.e.size() == 0) {
            for (int l = n2; l < size2; ++l) {
                final Z0.v v = b3.get(l);
                final s a4 = v.a;
                this.e.put(a4.a, (Object)new b(this.G.a(l, a4.b), v, this.j(sparseArray, a4.a)));
                this.z = Math.max(this.z, a4.e);
            }
            this.G.j();
            return;
        }
        g0.a.f(this.e.size() == size2 && b);
        for (int n3 = n; n3 < size2; ++n3) {
            final Z0.v v2 = b3.get(n3);
            final s a5 = v2.a;
            ((b)this.e.get(a5.a)).j(v2, this.j(sparseArray, a5.a));
        }
    }
    
    public final void w(final long n) {
        while (!this.o.isEmpty()) {
            final a a = this.o.removeFirst();
            this.x -= a.c;
            long a2;
            final long n2 = a2 = a.a;
            if (a.b) {
                a2 = n2 + n;
            }
            final E k = this.k;
            long a3 = a2;
            if (k != null) {
                a3 = k.a(a2);
            }
            final T[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                h[i].b(a3, 1, a.c, this.x, null);
            }
        }
    }
    
    public static final class a
    {
        public final long a;
        public final boolean b;
        public final int c;
        
        public a(final long a, final boolean b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class b
    {
        public final T a;
        public final u b;
        public final z c;
        public Z0.v d;
        public Z0.d e;
        public int f;
        public int g;
        public int h;
        public int i;
        public final z j;
        public final z k;
        public boolean l;
        
        public b(final T a, final Z0.v d, final Z0.d e) {
            this.a = a;
            this.d = d;
            this.e = e;
            this.b = new u();
            this.c = new z();
            this.j = new z(1);
            this.k = new z();
            this.j(d, e);
        }
        
        public static /* synthetic */ boolean a(final b b) {
            return b.l;
        }
        
        public static /* synthetic */ boolean b(final b b, final boolean l) {
            return b.l = l;
        }
        
        public int c() {
            int n;
            if (!this.l) {
                n = this.d.g[this.f];
            }
            else if (this.b.k[this.f]) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n2 = n;
            if (this.g() != null) {
                n2 = (n | 0x40000000);
            }
            return n2;
        }
        
        public long d() {
            if (!this.l) {
                return this.d.c[this.f];
            }
            return this.b.g[this.h];
        }
        
        public long e() {
            if (!this.l) {
                return this.d.f[this.f];
            }
            return this.b.c(this.f);
        }
        
        public int f() {
            if (!this.l) {
                return this.d.d[this.f];
            }
            return this.b.i[this.f];
        }
        
        public Z0.t g() {
            final boolean l = this.l;
            final Z0.t t = null;
            if (!l) {
                return null;
            }
            final int a = ((Z0.d)g0.M.i(this.b.a)).a;
            Z0.t t2 = this.b.n;
            if (t2 == null) {
                t2 = this.d.a.a(a);
            }
            Z0.t t3 = t;
            if (t2 != null) {
                t3 = t;
                if (t2.a) {
                    t3 = t2;
                }
            }
            return t3;
        }
        
        public boolean h() {
            ++this.f;
            if (!this.l) {
                return false;
            }
            final int g = this.g + 1;
            this.g = g;
            final int[] h = this.b.h;
            final int h2 = this.h;
            if (g == h[h2]) {
                this.h = h2 + 1;
                this.g = 0;
                return false;
            }
            return true;
        }
        
        public int i(int m, int n) {
            final Z0.t g = this.g();
            if (g == null) {
                return 0;
            }
            int n2 = g.d;
            z z;
            if (n2 != 0) {
                z = this.b.o;
            }
            else {
                final byte[] array = (byte[])g0.M.i(g.e);
                this.k.R(array, array.length);
                z = this.k;
                n2 = array.length;
            }
            final boolean g2 = this.b.g(this.f);
            final boolean b = g2 || n != 0;
            final byte[] e = this.j.e();
            int n3;
            if (b) {
                n3 = 128;
            }
            else {
                n3 = 0;
            }
            e[0] = (byte)(n3 | n2);
            this.j.T(0);
            this.a.a(this.j, 1, 1);
            this.a.a(z, n2, 1);
            if (!b) {
                return n2 + 1;
            }
            if (!g2) {
                this.c.P(8);
                final byte[] e2 = this.c.e();
                e2[0] = 0;
                e2[1] = 1;
                e2[2] = (byte)(n >> 8 & 0xFF);
                e2[3] = (byte)(n & 0xFF);
                e2[4] = (byte)(m >> 24 & 0xFF);
                e2[5] = (byte)(m >> 16 & 0xFF);
                e2[6] = (byte)(m >> 8 & 0xFF);
                e2[7] = (byte)(m & 0xFF);
                this.a.a(this.c, 8, 1);
                return n2 + 9;
            }
            final z o = this.b.o;
            m = o.M();
            o.U(-2);
            m = m * 6 + 2;
            z c = o;
            if (n != 0) {
                this.c.P(m);
                final byte[] e3 = this.c.e();
                o.l(e3, 0, m);
                n += ((e3[2] & 0xFF) << 8 | (e3[3] & 0xFF));
                e3[2] = (byte)(n >> 8 & 0xFF);
                e3[3] = (byte)(n & 0xFF);
                c = this.c;
            }
            this.a.a(c, m, 1);
            return n2 + 1 + m;
        }
        
        public void j(final Z0.v d, final Z0.d e) {
            this.d = d;
            this.e = e;
            this.a.d(d.a.f);
            this.k();
        }
        
        public void k() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }
        
        public void l(final long n) {
            int f = this.f;
            while (true) {
                final u b = this.b;
                if (f >= b.f || b.c(f) > n) {
                    break;
                }
                if (this.b.k[f]) {
                    this.i = f;
                }
                ++f;
            }
        }
        
        public void m() {
            final Z0.t g = this.g();
            if (g == null) {
                return;
            }
            final z o = this.b.o;
            final int d = g.d;
            if (d != 0) {
                o.U(d);
            }
            if (this.b.g(this.f)) {
                o.U(o.M() * 6);
            }
        }
        
        public void n(m c) {
            final Z0.t a = this.d.a.a(((Z0.d)g0.M.i(this.b.a)).a);
            String b;
            if (a != null) {
                b = a.b;
            }
            else {
                b = null;
            }
            c = c.c(b);
            this.a.d(this.d.a.f.a().U(c).K());
        }
    }
}
