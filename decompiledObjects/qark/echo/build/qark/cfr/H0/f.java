/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package H0;

import H0.a;
import H0.c;
import H0.d;
import H0.g;
import H0.h;
import X2.g0;
import X2.v;
import g0.z;

public final class f
implements a {
    public final v a;
    public final int b;

    public f(int n8, v v8) {
        this.b = n8;
        this.a = v8;
    }

    public static a b(int n8, int n9, z z8) {
        switch (n8) {
            default: {
                return null;
            }
            case 1852994675: {
                return h.b(z8);
            }
            case 1752331379: {
                return d.d(z8);
            }
            case 1751742049: {
                return c.c(z8);
            }
            case 1718776947: 
        }
        return g.e(n9, z8);
    }

    public static f d(int n8, z z8) {
        v.a a8 = new v.a();
        int n9 = z8.g();
        int n10 = -2;
        while (z8.a() > 8) {
            int n11 = z8.t();
            int n12 = z8.t();
            n12 = z8.f() + n12;
            z8.S(n12);
            a a9 = n11 == 1414744396 ? f.d(z8.t(), z8) : f.b(n11, n10, z8);
            n11 = n10;
            if (a9 != null) {
                if (a9.a() == 1752331379) {
                    n10 = ((d)a9).c();
                }
                a8.h(a9);
                n11 = n10;
            }
            z8.T(n12);
            z8.S(n9);
            n10 = n11;
        }
        return new f(n8, a8.k());
    }

    @Override
    public int a() {
        return this.b;
    }

    public a c(Class class_) {
        g0 g02 = this.a.q();
        while (g02.hasNext()) {
            a a8 = (a)g02.next();
            if (a8.getClass() != class_) continue;
            return a8;
        }
        return null;
    }
}

