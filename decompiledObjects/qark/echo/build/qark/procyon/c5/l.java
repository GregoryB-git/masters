// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import Y4.b;
import java.util.Map;
import V4.a;

public final class l extends n
{
    public static final int[] a;
    public static final int[] b;
    public static final int[][] c;
    
    static {
        a = new int[] { 1, 1, 1, 1 };
        b = new int[] { 3, 1, 1 };
        c = new int[][] { { 1, 1, 3, 3, 1 }, { 3, 1, 1, 1, 3 }, { 1, 3, 1, 1, 3 }, { 3, 3, 1, 1, 1 }, { 1, 1, 3, 1, 3 }, { 3, 1, 3, 1, 1 }, { 1, 3, 3, 1, 1 }, { 1, 1, 1, 3, 3 }, { 3, 1, 1, 3, 1 }, { 1, 3, 1, 3, 1 } };
    }
    
    @Override
    public b a(final String s, final a obj, final int n, final int n2, final Map map) {
        if (obj == V4.a.w) {
            return super.a(s, obj, n, n2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(obj)));
    }
    
    @Override
    public boolean[] c(final String s) {
        final int length = s.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length <= 80) {
            final boolean[] array = new boolean[length * 9 + 9];
            int b = n.b(array, 0, l.a, true);
            for (int i = 0; i < length; i += 2) {
                final int digit = Character.digit(s.charAt(i), 10);
                final int digit2 = Character.digit(s.charAt(i + 1), 10);
                final int[] array2 = new int[10];
                for (int j = 0; j < 5; ++j) {
                    final int n = j * 2;
                    final int[][] c = l.c;
                    array2[n] = c[digit][j];
                    array2[n + 1] = c[digit2][j];
                }
                b += n.b(array, b, array2, true);
            }
            n.b(array, b, l.b, true);
            return array;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
