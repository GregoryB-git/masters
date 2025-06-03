// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import V4.c;
import java.util.Map;
import V4.a;
import Y4.b;
import V4.g;

public abstract class n implements g
{
    public static int b(final boolean[] array, int i, final int[] array2, boolean b) {
        final int length = array2.length;
        int n2;
        final int n = n2 = 0;
        int n3 = i;
        int n4;
        int j;
        for (i = n; i < length; ++i) {
            for (n4 = array2[i], j = 0; j < n4; ++j, ++n3) {
                array[n3] = b;
            }
            n2 += n4;
            b ^= true;
        }
        return n2;
    }
    
    public static b e(final boolean[] array, int a, int i, int max) {
        final int length = array.length;
        final int b = max + length;
        final int max2 = Math.max(a, b);
        max = Math.max(1, i);
        final int n = max2 / b;
        a = (max2 - length * n) / 2;
        final b b2 = new b(max2, max);
        for (i = 0; i < length; ++i, a += n) {
            if (array[i]) {
                b2.n(a, 0, n, max);
            }
        }
        return b2;
    }
    
    @Override
    public b a(final String s, final a a, final int i, final int j, final Map map) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i >= 0 && j >= 0) {
            int n = this.d();
            if (map != null) {
                final c t = c.t;
                n = n;
                if (map.containsKey(t)) {
                    n = Integer.parseInt(map.get(t).toString());
                }
            }
            return e(this.c(s), i, j, n);
        }
        final StringBuilder sb = new StringBuilder("Negative size is not allowed. Input: ");
        sb.append(i);
        sb.append('x');
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public abstract boolean[] c(final String p0);
    
    public int d() {
        return 10;
    }
}
