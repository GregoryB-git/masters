// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import d0.A;
import java.util.ArrayList;
import g0.z;
import java.util.List;

public final class d
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
    public final int j;
    public final float k;
    public final String l;
    
    public d(final List a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final int i, final int j, final float k, final String l) {
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
    
    public static byte[] a(final z z) {
        final int m = z.M();
        final int f = z.f();
        z.U(m);
        return g0.d.d(z.e(), f, m);
    }
    
    public static d b(final z z) {
        while (true) {
            while (true) {
                Label_0267: {
                    try {
                        z.U(4);
                        final int n = (z.G() & 0x3) + 1;
                        if (n == 3) {
                            throw new IllegalStateException();
                        }
                        final ArrayList<byte[]> list = new ArrayList<byte[]>();
                        final int n2 = z.G() & 0x1F;
                        for (int i = 0; i < n2; ++i) {
                            list.add(a(z));
                        }
                        for (int g = z.G(), j = 0; j < g; ++j) {
                            list.add(a(z));
                        }
                        if (n2 > 0) {
                            final h0.d.c l = h0.d.l(list.get(0), n, ((byte[])list.get(0)).length);
                            final int f = l.f;
                            final int g2 = l.g;
                            final int k = l.i;
                            final int m = l.j;
                            final int q = l.q;
                            final int r = l.r;
                            final int s = l.s;
                            final int t = l.t;
                            final float h = l.h;
                            final String a = g0.d.a(l.a, l.b, l.c);
                            final int n3 = m + 8;
                            final int n4 = k + 8;
                            final int n5 = r;
                            return new d(list, n, f, g2, n4, n3, q, n5, s, t, h, a);
                        }
                        break Label_0267;
                    }
                    catch (ArrayIndexOutOfBoundsException ex) {
                        throw A.a("Error parsing AVC config", ex);
                    }
                }
                final int f = -1;
                int n4;
                final int g2 = n4 = f;
                final int n7;
                final int n6 = n7 = n4;
                final int n8 = n7;
                final float h = 1.0f;
                final String a = null;
                final int n9 = 16;
                final int n3 = n6;
                final int q = n7;
                final int n5 = n8;
                final int s = n8;
                final int t = n9;
                continue;
            }
        }
    }
}
