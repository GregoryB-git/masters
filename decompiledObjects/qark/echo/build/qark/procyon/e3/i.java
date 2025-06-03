// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e3;

import java.security.GeneralSecurityException;
import q3.f;
import java.util.Arrays;

public abstract class i
{
    public static byte[] a(byte[] array, final byte[] array2) {
        if (array.length == 32) {
            final long n = c(array, 0, 0) & 0x3FFFFFFL;
            final long n2 = c(array, 3, 2) & 0x3FFFF03L;
            final long n3 = c(array, 6, 4) & 0x3FFC0FFL;
            final long n4 = c(array, 9, 6) & 0x3F03FFFL;
            final long n5 = c(array, 12, 8) & 0xFFFFFL;
            final long n6 = n3 * 5L;
            final long n7 = n4 * 5L;
            final long n8 = n5 * 5L;
            final byte[] array3 = new byte[17];
            final long n9 = 0L;
            int i = 0;
            final long n11;
            long n10 = n11 = 0L;
            long n13;
            long n12 = n13 = n11;
            long n14 = n11;
            long n15 = n9;
            while (i < array2.length) {
                b(array3, array2, i);
                final long n16 = n13 + c(array3, 0, 0);
                final long n17 = n15 + c(array3, 3, 2);
                final long n18 = n10 + c(array3, 6, 4);
                final long n19 = n14 + c(array3, 9, 6);
                final long n20 = n12 + (c(array3, 12, 8) | (long)(array3[16] << 24));
                final long n21 = n16 * n + n17 * n8 + n18 * n7 + n19 * n6 + n20 * (n2 * 5L);
                final long n22 = n16 * n2 + n17 * n + n18 * n8 + n19 * n7 + n20 * n6 + (n21 >> 26);
                final long n23 = n16 * n3 + n17 * n2 + n18 * n + n19 * n8 + n20 * n7 + (n22 >> 26);
                final long n24 = n16 * n4 + n17 * n3 + n18 * n2 + n19 * n + n20 * n8 + (n23 >> 26);
                final long n25 = n16 * n5 + n17 * n4 + n18 * n3 + n19 * n2 + n20 * n + (n24 >> 26);
                final long n26 = (n21 & 0x3FFFFFFL) + (n25 >> 26) * 5L;
                n15 = (n22 & 0x3FFFFFFL) + (n26 >> 26);
                i += 16;
                n10 = (n23 & 0x3FFFFFFL);
                n14 = (n24 & 0x3FFFFFFL);
                n12 = (n25 & 0x3FFFFFFL);
                n13 = (n26 & 0x3FFFFFFL);
            }
            final long n27 = n10 + (n15 >> 26);
            final long n28 = n27 & 0x3FFFFFFL;
            final long n29 = n14 + (n27 >> 26);
            final long n30 = n29 & 0x3FFFFFFL;
            final long n31 = n12 + (n29 >> 26);
            final long n32 = n31 & 0x3FFFFFFL;
            final long n33 = n13 + (n31 >> 26) * 5L;
            final long n34 = n33 & 0x3FFFFFFL;
            final long n35 = (n15 & 0x3FFFFFFL) + (n33 >> 26);
            final long n36 = n34 + 5L;
            final long n37 = (n36 >> 26) + n35;
            final long n38 = n28 + (n37 >> 26);
            final long n39 = n30 + (n38 >> 26);
            final long n40 = n32 + (n39 >> 26) - 67108864L;
            final long n42;
            final long n41 = n42 = n40 >> 63;
            final long n43 = (n37 & 0x3FFFFFFL & n42) | (n35 & n41);
            final long n44 = (n38 & 0x3FFFFFFL & n42) | (n28 & n41);
            final long n45 = (n39 & 0x3FFFFFFL & n42) | (n30 & n41);
            final long n46 = (((n34 & n41) | (n36 & 0x3FFFFFFL & n42) | n43 << 26) & 0xFFFFFFFFL) + d(array, 16);
            final long n47 = ((n43 >> 6 | n44 << 20) & 0xFFFFFFFFL) + d(array, 20) + (n46 >> 32);
            final long n48 = ((n44 >> 12 | n45 << 14) & 0xFFFFFFFFL) + d(array, 24) + (n47 >> 32);
            final long d = d(array, 28);
            array = new byte[16];
            e(array, n46 & 0xFFFFFFFFL, 0);
            e(array, n47 & 0xFFFFFFFFL, 4);
            e(array, n48 & 0xFFFFFFFFL, 8);
            e(array, ((n45 >> 18 | ((n40 & n42) | (n32 & n41)) << 8) & 0xFFFFFFFFL) + d + (n48 >> 32) & 0xFFFFFFFFL, 12);
            return array;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
    
    public static void b(final byte[] a, final byte[] array, final int n) {
        final int min = Math.min(16, array.length - n);
        System.arraycopy(array, n, a, 0, min);
        a[min] = 1;
        if (min != 16) {
            Arrays.fill(a, min + 1, a.length, (byte)0);
        }
    }
    
    public static long c(final byte[] array, final int n, final int n2) {
        return d(array, n) >> n2 & 0x3FFFFFFL;
    }
    
    public static long d(final byte[] array, final int n) {
        return (long)((array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16)) & 0xFFFFFFFFL;
    }
    
    public static void e(final byte[] array, long n, final int n2) {
        for (int i = 0; i < 4; ++i, n >>= 8) {
            array[n2 + i] = (byte)(0xFFL & n);
        }
    }
    
    public static void f(final byte[] array, final byte[] array2, final byte[] array3) {
        if (f.b(a(array, array2), array3)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
