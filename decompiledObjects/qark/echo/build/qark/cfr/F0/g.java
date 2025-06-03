/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package F0;

import F0.T;
import g0.a;
import g0.o;
import g0.z;

public abstract class g {
    public static void a(long l8, z z8, T[] arrt) {
        do {
            int n8 = z8.a();
            int n9 = 1;
            if (n8 <= 1) break;
            int n10 = g.c(z8);
            int n11 = g.c(z8);
            int n12 = z8.f() + n11;
            if (n11 != -1 && n11 <= z8.a()) {
                n8 = n12;
                if (n10 == 4) {
                    n8 = n12;
                    if (n11 >= 8) {
                        n8 = z8.G();
                        int n13 = z8.M();
                        n10 = n13 == 49 ? z8.p() : 0;
                        n11 = z8.G();
                        if (n13 == 47) {
                            z8.U(1);
                        }
                        n8 = n8 == 181 && (n13 == 49 || n13 == 47) && n11 == 3 ? 1 : 0;
                        n11 = n8;
                        if (n13 == 49) {
                            n10 = n10 == 1195456820 ? n9 : 0;
                            n11 = n8 & n10;
                        }
                        n8 = n12;
                        if (n11 != 0) {
                            g.b(l8, z8, arrt);
                            n8 = n12;
                        }
                    }
                }
            } else {
                o.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                n8 = z8.g();
            }
            z8.T(n8);
        } while (true);
    }

    public static void b(long l8, z z8, T[] arrt) {
        int n8 = z8.G();
        if ((n8 & 64) != 0) {
            z8.U(1);
            int n9 = (n8 & 31) * 3;
            int n10 = z8.f();
            for (T t8 : arrt) {
                z8.T(n10);
                t8.e(z8, n9);
                boolean bl = l8 != -9223372036854775807L;
                a.f(bl);
                t8.b(l8, 1, n9, 0, null);
            }
        }
    }

    public static int c(z z8) {
        int n8;
        int n9;
        int n10 = 0;
        do {
            if (z8.a() == 0) {
                return -1;
            }
            n9 = z8.G();
            n10 = n8 = n10 + n9;
        } while (n9 == 255);
        return n8;
    }
}

