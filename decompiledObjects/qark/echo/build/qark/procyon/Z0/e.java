// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import g0.M;

public abstract class e
{
    public static b a(final int n, final long[] array, final int[] array2, final long n2) {
        final int a = 8192 / n;
        final int length = array2.length;
        final int n3 = 0;
        int n4;
        for (int i = n4 = 0; i < length; ++i) {
            n4 += M.k(array2[i], a);
        }
        final long[] array3 = new long[n4];
        final int[] array4 = new int[n4];
        final long[] array5 = new long[n4];
        final int[] array6 = new int[n4];
        int n5 = 0;
        int n6;
        int max = n6 = n5;
        for (int j = n3; j < array2.length; ++j) {
            int k = array2[j];
            long n7 = array[j];
            while (k > 0) {
                final int min = Math.min(a, k);
                array3[n6] = n7;
                final int b = n * min;
                array4[n6] = b;
                max = Math.max(max, b);
                array5[n6] = n5 * n2;
                array6[n6] = 1;
                n7 += array4[n6];
                n5 += min;
                k -= min;
                ++n6;
            }
        }
        return new b(array3, array4, max, array5, array6, n2 * n5, null);
    }
    
    public static final class b
    {
        public final long[] a;
        public final int[] b;
        public final int c;
        public final long[] d;
        public final int[] e;
        public final long f;
        
        public b(final long[] a, final int[] b, final int c, final long[] d, final int[] e, final long f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
}
