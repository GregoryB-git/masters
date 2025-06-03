/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package Z0;

import U0.d;
import d0.x;
import g0.z;

public abstract class q {
    public static int a(int n8, z z8, int n9) {
        if (n8 == 12) {
            return 240;
        }
        if (n8 == 13) {
            return 120;
        }
        if (n8 != 21) {
            return -2147483647;
        }
        if (z8.a() >= 8) {
            if (z8.f() + 8 > n9) {
                return -2147483647;
            }
            n8 = z8.p();
            n9 = z8.p();
            if (n8 >= 12) {
                if (n9 != 1936877170) {
                    return -2147483647;
                }
                return z8.H();
            }
        }
        return -2147483647;
    }

    public static x b(z z8, int n8) {
        z8.U(12);
        while (z8.f() < n8) {
            int n9 = z8.f();
            int n10 = z8.p();
            if (z8.p() == 1935766900) {
                if (n10 < 16) {
                    return null;
                }
                z8.U(4);
                int n11 = -1;
                n10 = n9 = 0;
                while (n9 < 2) {
                    int n12;
                    int n13 = z8.G();
                    int n14 = z8.G();
                    if (n13 == 0) {
                        n12 = n14;
                    } else {
                        n12 = n11;
                        if (n13 == 1) {
                            n10 = n14;
                            n12 = n11;
                        }
                    }
                    ++n9;
                    n11 = n12;
                }
                if ((n8 = q.a(n11, z8, n8)) == -2147483647) {
                    return null;
                }
                return new x(new d(n8, n10));
            }
            z8.T(n9 + n10);
        }
        return null;
    }
}

