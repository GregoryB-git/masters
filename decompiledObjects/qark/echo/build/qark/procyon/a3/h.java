// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a3;

import java.util.Arrays;
import W2.m;

public abstract class h
{
    public static int a(final long n, final long n2) {
        final long n3 = lcmp(n, n2);
        if (n3 < 0) {
            return -1;
        }
        if (n3 > 0) {
            return 1;
        }
        return 0;
    }
    
    public static int b(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static long c(final long... array) {
        final int length = array.length;
        int i = 1;
        m.d(length > 0);
        long n = array[0];
        while (i < array.length) {
            final long n2 = array[i];
            long n3 = n;
            if (n2 > n) {
                n3 = n2;
            }
            ++i;
            n = n3;
        }
        return n;
    }
    
    public static Long d(final String s, final int i) {
        if (((String)m.j(s)).isEmpty()) {
            return null;
        }
        if (i < 2 || i > 36) {
            final StringBuilder sb = new StringBuilder();
            sb.append("radix must be between MIN_RADIX and MAX_RADIX but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int index = 0;
        if (s.charAt(0) == '-') {
            index = 1;
        }
        if (index == s.length()) {
            return null;
        }
        int j = index + 1;
        final int a = h.a.a(s.charAt(index));
        if (a < 0) {
            return null;
        }
        if (a >= i) {
            return null;
        }
        long l = -a;
        final long n = i;
        final long n2 = Long.MIN_VALUE / n;
        while (j < s.length()) {
            final int a2 = h.a.a(s.charAt(j));
            if (a2 < 0 || a2 >= i) {
                return null;
            }
            if (l < n2) {
                return null;
            }
            final long n3 = l * n;
            final long n4 = a2;
            if (n3 < n4 - Long.MIN_VALUE) {
                return null;
            }
            l = n3 - n4;
            ++j;
        }
        if (index != 0) {
            return l;
        }
        if (l == Long.MIN_VALUE) {
            return null;
        }
        return -l;
    }
    
    public abstract static final class a
    {
        public static final byte[] a;
        
        static {
            final byte[] array = new byte[128];
            Arrays.fill(array, (byte)(-1));
            final int n = 0;
            int n2 = 0;
            int i;
            while (true) {
                i = n;
                if (n2 >= 10) {
                    break;
                }
                array[n2 + 48] = (byte)n2;
                ++n2;
            }
            while (i < 26) {
                array[i + 97] = (array[i + 65] = (byte)(i + 10));
                ++i;
            }
            a = array;
        }
        
        public static int a(final char c) {
            if (c < '\u0080') {
                return h.a.a[c];
            }
            return -1;
        }
    }
}
