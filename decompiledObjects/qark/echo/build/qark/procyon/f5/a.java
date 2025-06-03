// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f5;

import V4.c;
import java.util.Map;
import Y4.b;
import h5.f;
import V4.g;

public final class a implements g
{
    public static b b(final f f, int a, int i, int max) {
        final h5.b a2 = f.a();
        if (a2 != null) {
            final int e = a2.e();
            final int d = a2.d();
            max <<= 1;
            final int b = e + max;
            final int b2 = max + d;
            max = Math.max(a, b);
            i = Math.max(i, b2);
            final int min = Math.min(max / b, i / b2);
            final int n = (max - e * min) / 2;
            a = (i - d * min) / 2;
            final b b3 = new b(max, i);
            int j;
            for (i = 0; i < d; ++i, a += min) {
                for (j = 0, max = n; j < e; ++j, max += min) {
                    if (a2.b(j, i) == 1) {
                        b3.n(max, a, min, min);
                    }
                }
            }
            return b3;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public b a(final String s, final V4.a obj, final int i, final int j, final Map map) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (obj != V4.a.z) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(obj)));
        }
        if (i >= 0 && j >= 0) {
            g5.a a = g5.a.p;
            int int1 = 4;
            g5.a a2 = a;
            if (map != null) {
                final c o = c.o;
                if (map.containsKey(o)) {
                    a = g5.a.valueOf(map.get(o).toString());
                }
                final c t = c.t;
                int1 = int1;
                a2 = a;
                if (map.containsKey(t)) {
                    int1 = Integer.parseInt(map.get(t).toString());
                    a2 = a;
                }
            }
            return b(h5.c.n(s, a2, map), i, j, int1);
        }
        final StringBuilder sb = new StringBuilder("Requested dimensions are too small: ");
        sb.append(i);
        sb.append('x');
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
