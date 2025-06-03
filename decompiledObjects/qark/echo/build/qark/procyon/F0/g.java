// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.a;
import g0.o;
import g0.z;

public abstract class g
{
    public static void a(final long n, final z z, final T[] array) {
        while (true) {
            final int a = z.a();
            final boolean b = true;
            if (a <= 1) {
                break;
            }
            final int c = c(z);
            final int c2 = c(z);
            final int n2 = z.f() + c2;
            int g;
            if (c2 != -1 && c2 <= z.a()) {
                g = n2;
                if (c == 4) {
                    g = n2;
                    if (c2 >= 8) {
                        final int g2 = z.G();
                        final int m = z.M();
                        int p3;
                        if (m == 49) {
                            p3 = z.p();
                        }
                        else {
                            p3 = 0;
                        }
                        final int g3 = z.G();
                        if (m == 47) {
                            z.U(1);
                        }
                        boolean b2 = g2 == 181 && (m == 49 || m == 47) && g3 == 3;
                        if (m == 49) {
                            b2 &= (p3 == 1195456820 && b);
                        }
                        g = n2;
                        if (b2) {
                            b(n, z, array);
                            g = n2;
                        }
                    }
                }
            }
            else {
                o.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                g = z.g();
            }
            z.T(g);
        }
    }
    
    public static void b(final long n, final z z, final T[] array) {
        final int g = z.G();
        if ((g & 0x40) != 0x0) {
            z.U(1);
            final int n2 = (g & 0x1F) * 3;
            final int f = z.f();
            for (int length = array.length, i = 0; i < length; ++i) {
                final T t = array[i];
                z.T(f);
                t.e(z, n2);
                a.f(n != -9223372036854775807L);
                t.b(n, 1, n2, 0, null);
            }
        }
    }
    
    public static int c(final z z) {
        int n = 0;
        while (z.a() != 0) {
            final int g = z.G();
            n += g;
            if (g != 255) {
                return n;
            }
        }
        return -1;
    }
}
