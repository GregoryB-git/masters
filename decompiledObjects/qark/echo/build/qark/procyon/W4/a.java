// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W4;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import X4.c;
import Y4.b;
import java.nio.charset.Charset;
import V4.g;

public final class a implements g
{
    public static b b(final String s, final V4.a obj, final int n, final int n2, final Charset charset, final int n3, final int n4) {
        if (obj == V4.a.o) {
            return c(c.d(s.getBytes(charset), n3, n4), n, n2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(obj)));
    }
    
    public static b c(final X4.a a, int a2, int i) {
        final b a3 = a.a();
        if (a3 != null) {
            final int j = a3.j();
            final int g = a3.g();
            final int max = Math.max(a2, j);
            i = Math.max(i, g);
            final int min = Math.min(max / j, i / g);
            final int n = (max - j * min) / 2;
            a2 = (i - g * min) / 2;
            final b b = new b(max, i);
            int k;
            int n2;
            for (i = 0; i < g; ++i, a2 += min) {
                for (k = 0, n2 = n; k < j; ++k, n2 += min) {
                    if (a3.f(k, i)) {
                        b.n(n2, a2, min, min);
                    }
                }
            }
            return b;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public b a(final String s, final V4.a a, final int n, final int n2, final Map map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int int1 = 33;
        final boolean b = false;
        Charset charset2 = charset;
        int n3 = int1;
        int int2 = b ? 1 : 0;
        if (map != null) {
            final V4.c p5 = V4.c.p;
            if (map.containsKey(p5)) {
                charset = Charset.forName(map.get(p5).toString());
            }
            final V4.c o = V4.c.o;
            if (map.containsKey(o)) {
                int1 = Integer.parseInt(map.get(o).toString());
            }
            final V4.c x = V4.c.x;
            charset2 = charset;
            n3 = int1;
            int2 = (b ? 1 : 0);
            if (map.containsKey(x)) {
                int2 = Integer.parseInt(map.get(x).toString());
                n3 = int1;
                charset2 = charset;
            }
        }
        return b(s, a, n, n2, charset2, n3, int2);
    }
}
