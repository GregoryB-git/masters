// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H0;

import X2.g0;
import g0.z;
import X2.v;

public final class f implements a
{
    public final v a;
    public final int b;
    
    public f(final int b, final v a) {
        this.b = b;
        this.a = a;
    }
    
    public static a b(final int n, final int n2, final z z) {
        switch (n) {
            default: {
                return null;
            }
            case 1852994675: {
                return h.b(z);
            }
            case 1752331379: {
                return d.d(z);
            }
            case 1751742049: {
                return c.c(z);
            }
            case 1718776947: {
                return g.e(n2, z);
            }
        }
    }
    
    public static f d(final int n, final z z) {
        final v.a a = new v.a();
        final int g = z.g();
        int c = -2;
        while (z.a() > 8) {
            final int t = z.t();
            final int n2 = z.f() + z.t();
            z.S(n2);
            a a2;
            if (t == 1414744396) {
                a2 = d(z.t(), z);
            }
            else {
                a2 = b(t, c, z);
            }
            int n3 = c;
            if (a2 != null) {
                if (a2.a() == 1752331379) {
                    c = ((d)a2).c();
                }
                a.h(a2);
                n3 = c;
            }
            z.T(n2);
            z.S(g);
            c = n3;
        }
        return new f(n, a.k());
    }
    
    @Override
    public int a() {
        return this.b;
    }
    
    public a c(final Class clazz) {
        final g0 q = this.a.q();
        while (q.hasNext()) {
            final a a = q.next();
            if (a.getClass() == clazz) {
                return a;
            }
        }
        return null;
    }
}
