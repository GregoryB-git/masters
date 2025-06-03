// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a5;

import b5.i;
import b5.j;
import V4.c;
import b5.l;
import java.util.Map;
import b5.k;
import b5.e;
import h5.b;
import V4.g;

public final class a implements g
{
    public static Y4.b b(final b b, int a, int a2) {
        final int e = b.e();
        final int d = b.d();
        final int max = Math.max(a, e);
        final int max2 = Math.max(a2, d);
        final int min = Math.min(max / e, max2 / d);
        final int n = (max - e * min) / 2;
        final int n2 = (max2 - d * min) / 2;
        Y4.b b2;
        if (a2 >= d && a >= e) {
            b2 = new Y4.b(a, a2);
            a = n;
            a2 = n2;
        }
        else {
            b2 = new Y4.b(e, d);
            a = (a2 = 0);
        }
        b2.b();
        for (int i = 0; i < d; ++i, a2 += min) {
            for (int n3 = a, j = 0; j < e; ++j, n3 += min) {
                if (b.b(j, i) == 1) {
                    b2.n(n3, a2, min, min);
                }
            }
        }
        return b2;
    }
    
    public static Y4.b c(final e e, final k k, final int n, final int n2) {
        final int h = k.h();
        final int g = k.g();
        final b b = new b(k.j(), k.i());
        int n3;
        for (int i = n3 = 0; i < g; ++i) {
            int n4 = n3;
            if (i % k.e == 0) {
                int n5;
                for (int j = n5 = 0; j < k.j(); ++j) {
                    b.g(n5, n3, j % 2 == 0);
                    ++n5;
                }
                n4 = n3 + 1;
            }
            int n6;
            for (int l = n6 = 0; l < h; ++l) {
                int n7 = n6;
                if (l % k.d == 0) {
                    b.g(n6, n4, true);
                    n7 = n6 + 1;
                }
                b.g(n7, n4, e.e(l, i));
                n6 = n7 + 1;
                final int d = k.d;
                if (l % d == d - 1) {
                    b.g(n6, n4, i % 2 == 0);
                    n6 = n7 + 2;
                }
            }
            final int n8 = n4 + 1;
            final int e2 = k.e;
            if (i % e2 == e2 - 1) {
                int n10;
                for (int n9 = n10 = 0; n9 < k.j(); ++n9) {
                    b.g(n10, n8, true);
                    ++n10;
                }
                n3 = n4 + 2;
            }
            else {
                n3 = n8;
            }
        }
        return b(b, n, n2);
    }
    
    @Override
    public Y4.b a(String b, final V4.a obj, final int i, final int j, final Map map) {
        if (b.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (obj != V4.a.t) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(obj)));
        }
        if (i >= 0 && j >= 0) {
            l o;
            l l = o = b5.l.o;
            if (map != null) {
                final l k = map.get(c.q);
                if (k != null) {
                    l = k;
                }
                android.support.v4.media.a.a(map.get(c.r));
                android.support.v4.media.a.a(map.get(c.s));
                o = l;
            }
            b = j.b(b, o, null, null);
            final k m = k.l(b.length(), o, null, null, true);
            final e e = new e(i.c(b, m), m.h(), m.g());
            e.h();
            return c(e, m, i, j);
        }
        final StringBuilder sb = new StringBuilder("Requested dimensions can't be negative: ");
        sb.append(i);
        sb.append('x');
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
