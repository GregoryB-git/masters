// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import U0.d;
import d0.x;
import g0.z;

public abstract class q
{
    public static int a(int p3, final z z, int p4) {
        if (p3 == 12) {
            return 240;
        }
        if (p3 == 13) {
            return 120;
        }
        if (p3 != 21) {
            return -2147483647;
        }
        if (z.a() >= 8) {
            if (z.f() + 8 > p4) {
                return -2147483647;
            }
            p3 = z.p();
            p4 = z.p();
            if (p3 >= 12) {
                if (p4 != 1936877170) {
                    return -2147483647;
                }
                return z.H();
            }
        }
        return -2147483647;
    }
    
    public static x b(final z z, int a) {
        z.U(12);
        while (z.f() < a) {
            final int f = z.f();
            final int p2 = z.p();
            if (z.p() == 1935766900) {
                if (p2 < 16) {
                    return null;
                }
                z.U(4);
                int n = -1;
                int n2;
                int n3;
                for (int i = n2 = 0; i < 2; ++i, n = n3) {
                    final int g = z.G();
                    final int g2 = z.G();
                    if (g == 0) {
                        n3 = g2;
                    }
                    else {
                        n3 = n;
                        if (g == 1) {
                            n2 = g2;
                            n3 = n;
                        }
                    }
                }
                a = a(n, z, a);
                if (a == -2147483647) {
                    return null;
                }
                return new x(new x.b[] { new d((float)a, n2) });
            }
            else {
                z.T(f + p2);
            }
        }
        return null;
    }
}
