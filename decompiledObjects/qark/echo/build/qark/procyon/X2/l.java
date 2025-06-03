// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Arrays;
import W2.k;

public abstract class l
{
    public static Object a(final int n) {
        if (n < 2 || n > 1073741824 || Integer.highestOneBit(n) != n) {
            final StringBuilder sb = new StringBuilder();
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n <= 256) {
            return new byte[n];
        }
        if (n <= 65536) {
            return new short[n];
        }
        return new int[n];
    }
    
    public static int b(final int n, final int n2) {
        return n & n2;
    }
    
    public static int c(final int n, final int n2) {
        return n & n2;
    }
    
    public static int d(final int n, final int n2, final int n3) {
        return (n & n3) | (n2 & n3);
    }
    
    public static int e(final int n) {
        int n2;
        if (n < 32) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        return n2 * (n + 1);
    }
    
    public static int f(final Object o, final Object o2, final int n, final Object o3, final int[] array, final Object[] array2, final Object[] array3) {
        final int c = s.c(o);
        final int n2 = c & n;
        int h = h(o3, n2);
        if (h == 0) {
            return -1;
        }
        final int b = b(c, n);
        int n3 = -1;
        while (true) {
            final int n4 = h - 1;
            final int n5 = array[n4];
            if (b(n5, n) == b && k.a(o, array2[n4]) && (array3 == null || k.a(o2, array3[n4]))) {
                final int c2 = c(n5, n);
                if (n3 == -1) {
                    i(o3, n2, c2);
                    return n4;
                }
                array[n3] = d(array[n3], c2, n);
                return n4;
            }
            else {
                final int c3 = c(n5, n);
                if (c3 == 0) {
                    return -1;
                }
                n3 = n4;
                h = c3;
            }
        }
    }
    
    public static void g(final Object o) {
        if (o instanceof byte[]) {
            Arrays.fill((byte[])o, (byte)0);
            return;
        }
        if (o instanceof short[]) {
            Arrays.fill((short[])o, (short)0);
            return;
        }
        Arrays.fill((int[])o, 0);
    }
    
    public static int h(final Object o, final int n) {
        if (o instanceof byte[]) {
            return ((byte[])o)[n] & 0xFF;
        }
        if (o instanceof short[]) {
            return ((short[])o)[n] & 0xFFFF;
        }
        return ((int[])o)[n];
    }
    
    public static void i(final Object o, final int n, final int n2) {
        if (o instanceof byte[]) {
            ((byte[])o)[n] = (byte)n2;
            return;
        }
        if (o instanceof short[]) {
            ((short[])o)[n] = (short)n2;
            return;
        }
        ((int[])o)[n] = n2;
    }
    
    public static int j(final int n) {
        return Math.max(4, s.a(n + 1, 1.0));
    }
}
