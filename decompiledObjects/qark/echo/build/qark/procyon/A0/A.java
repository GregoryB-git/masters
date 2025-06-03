// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A0;

import java.util.Arrays;
import android.util.Pair;
import k0.b1;
import g0.M;
import d0.I;
import x0.x;
import x0.Z;
import k0.Z0;
import d0.J;
import k0.a1;

public abstract class A extends D
{
    public a c;
    
    public static int n(final a1[] array, final J j, final int[] array2, final boolean b) {
        int length = array.length;
        int n;
        int i = n = 0;
        int n2 = 1;
        while (i < array.length) {
            final a1 a1 = array[i];
            int max;
            for (int k = max = 0; k < j.a; ++k) {
                max = Math.max(max, Z0.h(a1.a(j.a(k))));
            }
            final boolean b2 = array2[i] == 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            Label_0179: {
                if (max <= n) {
                    n3 = length;
                    n4 = n;
                    n5 = n2;
                    if (max != n) {
                        break Label_0179;
                    }
                    n3 = length;
                    n4 = n;
                    n5 = n2;
                    if (!b) {
                        break Label_0179;
                    }
                    n3 = length;
                    n4 = n;
                    if ((n5 = n2) != 0) {
                        break Label_0179;
                    }
                    n3 = length;
                    n4 = n;
                    n5 = n2;
                    if (!b2) {
                        break Label_0179;
                    }
                }
                n3 = i;
                n5 = (b2 ? 1 : 0);
                n4 = max;
            }
            ++i;
            length = n3;
            n = n4;
            n2 = n5;
        }
        return length;
    }
    
    public static int[] o(final a1 a1, final J j) {
        final int[] array = new int[j.a];
        for (int i = 0; i < j.a; ++i) {
            array[i] = a1.a(j.a(i));
        }
        return array;
    }
    
    public static int[] p(final a1[] array) {
        final int length = array.length;
        final int[] array2 = new int[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = array[i].s();
        }
        return array2;
    }
    
    @Override
    public final void i(final Object o) {
        this.c = (a)o;
    }
    
    @Override
    public final E k(final a1[] array, final Z z, final x.b b, final I i) {
        final int[] array2 = new int[array.length + 1];
        final int n = array.length + 1;
        final J[][] array3 = new J[n][];
        final int[][][] array4 = new int[array.length + 1][][];
        final int n2 = 0;
        for (int j = 0; j < n; ++j) {
            final int a = z.a;
            array3[j] = new J[a];
            array4[j] = new int[a][];
        }
        final int[] p4 = p(array);
        for (int k = 0; k < z.a; ++k) {
            final J b2 = z.b(k);
            final int n3 = n(array, b2, array2, b2.c == 5);
            int[] o;
            if (n3 == array.length) {
                o = new int[b2.a];
            }
            else {
                o = o(array[n3], b2);
            }
            final int n4 = array2[n3];
            array3[n3][n4] = b2;
            array4[n3][n4] = o;
            array2[n3] = n4 + 1;
        }
        final Z[] array5 = new Z[array.length];
        final String[] array6 = new String[array.length];
        final int[] array7 = new int[array.length];
        for (int l = n2; l < array.length; ++l) {
            final int n5 = array2[l];
            array5[l] = new Z((J[])M.O0(array3[l], n5));
            array4[l] = (int[][])M.O0(array4[l], n5);
            array6[l] = array[l].d();
            array7[l] = array[l].l();
        }
        final a a2 = new a(array6, array7, array5, p4, array4, new Z((J[])M.O0(array3[array.length], array2[array.length])));
        final Pair q = this.q(a2, array4, p4, b, i);
        return new E((b1[])q.first, (y[])q.second, C.a(a2, (B[])q.second), a2);
    }
    
    public abstract Pair q(final a p0, final int[][][] p1, final int[] p2, final x.b p3, final I p4);
    
    public static final class a
    {
        public final int a;
        public final String[] b;
        public final int[] c;
        public final Z[] d;
        public final int[] e;
        public final int[][][] f;
        public final Z g;
        
        public a(final String[] b, final int[] c, final Z[] d, final int[] e, final int[][][] f, final Z g) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.f = f;
            this.e = e;
            this.g = g;
            this.a = c.length;
        }
        
        public int a(final int n, final int n2, final boolean b) {
            final int a = this.d[n].b(n2).a;
            final int[] original = new int[a];
            int i = 0;
            int newLength = 0;
            while (i < a) {
                final int g = this.g(n, n2, i);
                int n3 = 0;
                Label_0081: {
                    if (g != 4) {
                        n3 = newLength;
                        if (!b) {
                            break Label_0081;
                        }
                        n3 = newLength;
                        if (g != 3) {
                            break Label_0081;
                        }
                    }
                    original[newLength] = i;
                    n3 = newLength + 1;
                }
                ++i;
                newLength = n3;
            }
            return this.b(n, n2, Arrays.copyOf(original, newLength));
        }
        
        public int b(final int n, int min, final int[] array) {
            int i = 0;
            int min2 = 16;
            Object o = null;
            int n3;
            int n2;
            for (n2 = (n3 = 0); i < array.length; ++i, ++n3) {
                final String n4 = this.d[n].b(min).a(array[i]).n;
                if (n3 == 0) {
                    o = n4;
                }
                else {
                    n2 |= ((M.c(o, n4) ^ true) ? 1 : 0);
                }
                min2 = Math.min(min2, Z0.e(this.f[n][min][i]));
            }
            min = min2;
            if (n2 != 0) {
                min = Math.min(min2, this.e[n]);
            }
            return min;
        }
        
        public int c(final int n, final int n2, final int n3) {
            return this.f[n][n2][n3];
        }
        
        public int d() {
            return this.a;
        }
        
        public int e(final int n) {
            return this.c[n];
        }
        
        public Z f(final int n) {
            return this.d[n];
        }
        
        public int g(final int n, final int n2, final int n3) {
            return Z0.h(this.c(n, n2, n3));
        }
        
        public Z h() {
            return this.g;
        }
    }
}
