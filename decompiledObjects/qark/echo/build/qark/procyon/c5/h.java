// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import Y4.b;
import java.util.Map;
import V4.a;

public class h extends n
{
    public static int f(final boolean[] array, int n, final int[] array2) {
        for (int length = array2.length, i = 0; i < length; ++i, ++n) {
            array[n] = (array2[i] != 0);
        }
        return 9;
    }
    
    public static int g(final String s, final int n) {
        int i = s.length() - 1;
        int n2 = 0;
        int n3 = 1;
        while (i >= 0) {
            n2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(s.charAt(i)) * n3;
            if (++n3 > n) {
                n3 = 1;
            }
            --i;
        }
        return n2 % 47;
    }
    
    private static void h(final int n, final int[] array) {
        for (int i = 0; i < 9; ++i) {
            int n2 = 1;
            if ((1 << 8 - i & n) == 0x0) {
                n2 = 0;
            }
            array[i] = n2;
        }
    }
    
    @Override
    public b a(final String s, final a obj, final int n, final int n2, final Map map) {
        if (obj == a.r) {
            return super.a(s, obj, n, n2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(obj)));
    }
    
    @Override
    public boolean[] c(final String str) {
        final int length = str.length();
        if (length <= 80) {
            final int[] array = new int[9];
            final int length2 = str.length();
            h(c5.g.b[47], array);
            final boolean[] array2 = new boolean[(length2 + 4) * 9 + 1];
            int i = 0;
            int f = f(array2, 0, array);
            while (i < length) {
                h(c5.g.b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], array);
                f += f(array2, f, array);
                ++i;
            }
            final int g = g(str, 20);
            final int[] b = c5.g.b;
            h(b[g], array);
            final int n = f + f(array2, f, array);
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(g));
            h(b[g(sb.toString(), 15)], array);
            final int n2 = n + f(array2, n, array);
            h(b[47], array);
            array2[n2 + f(array2, n2, array)] = true;
            return array2;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
