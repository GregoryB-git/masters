// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import V4.d;

public abstract class p extends m
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[][] d;
    public static final int[][] e;
    
    static {
        a = new int[] { 1, 1, 1 };
        b = new int[] { 1, 1, 1, 1, 1 };
        c = new int[] { 1, 1, 1, 1, 1, 1 };
        System.arraycopy(d = new int[][] { { 3, 2, 1, 1 }, { 2, 2, 2, 1 }, { 2, 1, 2, 2 }, { 1, 4, 1, 1 }, { 1, 1, 3, 2 }, { 1, 2, 3, 1 }, { 1, 1, 1, 4 }, { 1, 3, 1, 2 }, { 1, 2, 1, 3 }, { 3, 1, 1, 2 } }, 0, e = new int[20][], 0, 10);
        for (int i = 10; i < 20; ++i) {
            final int[] array = p.d[i - 10];
            final int[] array2 = new int[array.length];
            for (int j = 0; j < array.length; ++j) {
                array2[j] = array[array.length - j - 1];
            }
            p.e[i] = array2;
        }
    }
    
    public static boolean a(final CharSequence charSequence) {
        final int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        final int n = length - 1;
        return b(charSequence.subSequence(0, n)) == Character.digit(charSequence.charAt(n), 10);
    }
    
    public static int b(final CharSequence charSequence) {
        final int length = charSequence.length();
        int i = length - 1;
        int n = 0;
        while (i >= 0) {
            final int n2 = charSequence.charAt(i) - '0';
            if (n2 < 0 || n2 > 9) {
                throw V4.d.a();
            }
            n += n2;
            i -= 2;
        }
        int n3 = n * 3;
        for (int j = length - 2; j >= 0; j -= 2) {
            final int n4 = charSequence.charAt(j) - '0';
            if (n4 < 0 || n4 > 9) {
                throw V4.d.a();
            }
            n3 += n4;
        }
        return (1000 - n3) % 10;
    }
}
