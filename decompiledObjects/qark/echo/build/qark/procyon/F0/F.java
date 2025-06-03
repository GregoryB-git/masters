// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import d0.A;
import java.util.Collections;
import h0.d;
import g0.z;
import java.util.List;

public final class F
{
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final String l;
    
    public F(final List a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final int i, final float j, final int k, final String l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public static F a(final z z) {
        int g;
        int g2;
        int f;
        int n2;
        int n = 0;
        int j;
        byte[] o;
        int n3;
        int k;
        int n5;
        int n4;
        int n7;
        int n6;
        int n9;
        int n8;
        float l;
        String c;
        int n11;
        int n10;
        int q;
        int o2;
        int l2;
        int n12 = 0;
        int n13;
        int n14;
        int m2;
        int n15;
        int n16 = 0;
        int p = 0;
        int n17 = 0;
        int n18 = 0;
        int n19;
        int n20;
        int n21;
        int m3;
        byte[] a;
        int n22;
        d.a h;
        Object o3;
        Label_0151_Outer:Label_0431_Outer:
        while (true) {
            while (true) {
            Label_0388_Outer:
                while (true) {
                Label_0487:
                    while (true) {
                    Label_0484:
                        while (true) {
                            Label_0477: {
                                try {
                                    z.U(21);
                                    g = z.G();
                                    g2 = z.G();
                                    f = z.f();
                                    n = (n2 = 0);
                                    if (n < g2) {
                                        z.U(1);
                                        for (int m = z.M(), i = 0; i < m; ++i) {
                                            j = z.M();
                                            n2 += j + 4;
                                            z.U(j);
                                        }
                                        break Label_0477;
                                    }
                                    z.T(f);
                                    o = new byte[n2];
                                    k = (n3 = -1);
                                    n4 = (n5 = n3);
                                    n6 = (n7 = n5);
                                    n8 = (n9 = n7);
                                    l = 1.0f;
                                    c = null;
                                    n10 = (n11 = 0);
                                    q = n8;
                                    o2 = n6;
                                    l2 = n3;
                                    n12 = n10;
                                    n13 = g2;
                                    if (n12 < n13) {
                                        n14 = (z.G() & 0x3F);
                                        m2 = z.M();
                                        n15 = 0;
                                        n16 = n9;
                                        p = n7;
                                        n17 = n5;
                                        n18 = n4;
                                        n19 = n15;
                                        n20 = m2;
                                        n21 = n14;
                                        while (n19 < n20) {
                                            m3 = z.M();
                                            a = d.a;
                                            System.arraycopy(a, 0, o, n11, a.length);
                                            n22 = n11 + a.length;
                                            System.arraycopy(z.e(), z.f(), o, n22, m3);
                                            if (n21 != 33 || n19 != 0) {
                                                break Label_0484;
                                            }
                                            h = d.h(o, n22, n22 + m3);
                                            k = h.k;
                                            l2 = h.l;
                                            n18 = h.f + 8;
                                            n17 = h.g + 8;
                                            o2 = h.o;
                                            p = h.p;
                                            q = h.q;
                                            l = h.m;
                                            n16 = h.n;
                                            c = g0.d.c(h.a, h.b, h.c, h.d, h.h, h.i);
                                            n11 = n22 + m3;
                                            z.U(m3);
                                            ++n19;
                                        }
                                        break Label_0487;
                                    }
                                    if (n2 == 0) {
                                        o3 = Collections.emptyList();
                                        break Label_0388_Outer;
                                    }
                                    o3 = Collections.singletonList(o);
                                    break Label_0388_Outer;
                                    return new F((List)o3, (g & 0x3) + 1, k, l2, n4, n5, o2, n7, q, l, n9, c);
                                }
                                catch (ArrayIndexOutOfBoundsException ex) {
                                    throw A.a("Error parsing HEVC config", ex);
                                }
                            }
                            ++n;
                            continue Label_0151_Outer;
                        }
                        continue Label_0431_Outer;
                    }
                    ++n12;
                    n4 = n18;
                    n5 = n17;
                    n7 = p;
                    n9 = n16;
                    continue Label_0388_Outer;
                }
                continue;
            }
        }
    }
}
