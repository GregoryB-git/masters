// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public abstract class n3
{
    public static double a(final byte[] array, final int n) {
        return Double.longBitsToDouble(q(array, n));
    }
    
    public static int b(final int n, final byte[] array, int n2, final int n3, final h4 h4, final p3 p6) {
        final c4 c4 = (c4)h4;
        n2 = o(array, n2, p6);
        while (true) {
            c4.g(p6.a);
            if (n2 >= n3) {
                break;
            }
            final int o = o(array, n2, p6);
            if (n != p6.a) {
                break;
            }
            n2 = o(array, o, p6);
        }
        return n2;
    }
    
    public static int c(final int n, final byte[] array, int n2, int a, final v5 v5, final p3 p6) {
        if (n >>> 3 == 0) {
            throw k4.b();
        }
        final int n3 = n & 0x7;
        if (n3 == 0) {
            n2 = p(array, n2, p6);
            v5.e(n, p6.b);
            return n2;
        }
        if (n3 == 1) {
            v5.e(n, q(array, n2));
            return n2 + 8;
        }
        if (n3 != 2) {
            if (n3 != 3) {
                if (n3 == 5) {
                    v5.e(n, n(array, n2));
                    return n2 + 4;
                }
                throw k4.b();
            }
            else {
                final v5 l = v5.l();
                final int n4 = (n & 0xFFFFFFF8) | 0x4;
                int a2 = 0;
                int n5;
                int n6;
                while (true) {
                    n5 = a2;
                    n6 = n2;
                    if (n2 >= a) {
                        break;
                    }
                    final int o = o(array, n2, p6);
                    a2 = p6.a;
                    if ((n2 = a2) == n4) {
                        n6 = o;
                        n5 = n2;
                        break;
                    }
                    n2 = c(n2, array, o, a, l, p6);
                }
                if (n6 <= a && n5 == n4) {
                    v5.e(n, l);
                    return n6;
                }
                throw k4.e();
            }
        }
        else {
            n2 = o(array, n2, p6);
            a = p6.a;
            if (a < 0) {
                throw k4.d();
            }
            if (a <= array.length - n2) {
                q3 q3;
                if (a == 0) {
                    q3 = com.google.android.gms.internal.measurement.q3.p;
                }
                else {
                    q3 = com.google.android.gms.internal.measurement.q3.q(array, n2, a);
                }
                v5.e(n, q3);
                return n2 + a;
            }
            throw k4.f();
        }
    }
    
    public static int d(int n, final byte[] array, int n2, final p3 p4) {
        final int n3 = n & 0x7F;
        n = n2 + 1;
        final byte b = array[n2];
        int n4;
        if (b >= 0) {
            n4 = b << 7;
            n2 = n3;
        }
        else {
            final int n5 = n3 | (b & 0x7F) << 7;
            final int n6 = n2 + 2;
            n = array[n];
            if (n >= 0) {
                p4.a = (n5 | n << 14);
                return n6;
            }
            final int n7 = n5 | (n & 0x7F) << 14;
            n = n2 + 3;
            final byte b2 = array[n6];
            if (b2 >= 0) {
                final int n8 = b2 << 21;
                n2 = n7;
                n4 = n8;
            }
            else {
                final int n9 = n7 | (b2 & 0x7F) << 21;
                n2 += 4;
                final byte b3 = array[n];
                if (b3 >= 0) {
                    p4.a = (n9 | b3 << 28);
                    return n2;
                }
                n = n2;
                while (true) {
                    n2 = n + 1;
                    if (array[n] >= 0) {
                        break;
                    }
                    n = n2;
                }
                p4.a = (n9 | (b3 & 0x7F) << 28);
                return n2;
            }
        }
        p4.a = (n2 | n4);
        return n;
    }
    
    public static int e(final Z4 z4, final int n, final byte[] array, int n2, final int n3, final h4 h4, final p3 p7) {
        n2 = g(z4, array, n2, n3, p7);
        while (true) {
            h4.add(p7.c);
            if (n2 >= n3) {
                break;
            }
            final int o = o(array, n2, p7);
            if (n != p7.a) {
                break;
            }
            n2 = g(z4, array, o, n3, p7);
        }
        return n2;
    }
    
    public static int f(final Z4 z4, final byte[] array, int h, final int n, final int n2, final p3 p6) {
        final Object a = z4.a();
        h = h(a, z4, array, h, n, n2, p6);
        z4.e(a);
        p6.c = a;
        return h;
    }
    
    public static int g(final Z4 z4, final byte[] array, int i, final int n, final p3 p5) {
        final Object a = z4.a();
        i = i(a, z4, array, i, n, p5);
        z4.e(a);
        p5.c = a;
        return i;
    }
    
    public static int h(final Object c, final Z4 z4, final byte[] array, int m, final int n, final int n2, final p3 p7) {
        m = ((M4)z4).m(c, array, m, n, n2, p7);
        p7.c = c;
        return m;
    }
    
    public static int i(final Object c, final Z4 z4, final byte[] array, int d, int n, final p3 p6) {
        final int n2 = d + 1;
        final byte b = array[d];
        d = n2;
        int a = b;
        if (b < 0) {
            d = d(b, array, n2, p6);
            a = p6.a;
        }
        if (a >= 0 && a <= n - d) {
            n = a + d;
            z4.g(c, array, d, n, p6);
            p6.c = c;
            return n;
        }
        throw k4.f();
    }
    
    public static int j(final byte[] array, int o, final p3 p3) {
        o = o(array, o, p3);
        final int a = p3.a;
        if (a < 0) {
            throw k4.d();
        }
        if (a > array.length - o) {
            throw k4.f();
        }
        if (a == 0) {
            p3.c = q3.p;
            return o;
        }
        p3.c = q3.q(array, o, a);
        return o + a;
    }
    
    public static int k(final byte[] array, int i, final h4 h4, final p3 p4) {
        final c4 c4 = (c4)h4;
        i = o(array, i, p4);
        final int n = p4.a + i;
        while (i < n) {
            i = o(array, i, p4);
            c4.g(p4.a);
        }
        if (i == n) {
            return i;
        }
        throw k4.f();
    }
    
    public static float l(final byte[] array, final int n) {
        return Float.intBitsToFloat(n(array, n));
    }
    
    public static int m(final byte[] array, int o, final p3 p3) {
        o = o(array, o, p3);
        final int a = p3.a;
        if (a < 0) {
            throw k4.d();
        }
        if (a == 0) {
            p3.c = "";
            return o;
        }
        p3.c = E5.e(array, o, a);
        return o + a;
    }
    
    public static int n(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    public static int o(final byte[] array, int a, final p3 p3) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            p3.a = a;
            return n;
        }
        return d(a, array, n, p3);
    }
    
    public static int p(final byte[] array, int n, final p3 p3) {
        final int n2 = n + 1;
        final long b = array[n];
        if (b >= 0L) {
            p3.b = b;
            return n2;
        }
        n += 2;
        byte b2 = array[n2];
        long b3 = (b & 0x7FL) | (long)(b2 & 0x7F) << 7;
        for (int n3 = 7; b2 < 0; b2 = array[n], n3 += 7, b3 |= (long)(b2 & 0x7F) << n3, ++n) {}
        p3.b = b3;
        return n;
    }
    
    public static long q(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
}
