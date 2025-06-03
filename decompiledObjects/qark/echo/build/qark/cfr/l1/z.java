/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package l1;

import F0.e;
import F0.s;
import g0.E;
import g0.M;
import l1.A;

public final class z
extends e {
    public z(E e8, long l8, long l9) {
        super(new e.b(), new b(e8, null), l8, 0L, l8 + 1L, 0L, l9, 188L, 1000);
    }

    public static int k(byte[] arrby, int n8) {
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        byte by3 = arrby[n8 + 2];
        return arrby[n8 + 3] & 255 | ((by & 255) << 24 | (by2 & 255) << 16 | (by3 & 255) << 8);
    }

    public static final class b
    implements e.f {
        public final E a;
        public final g0.z b;

        public b(E e8) {
            this.a = e8;
            this.b = new g0.z();
        }

        public /* synthetic */ b(E e8,  a8) {
            this(e8);
        }

        public static void d(g0.z z8) {
            int n8 = z8.g();
            if (z8.a() < 10) {
                z8.T(n8);
                return;
            }
            z8.U(9);
            int n9 = z8.G() & 7;
            if (z8.a() < n9) {
                z8.T(n8);
                return;
            }
            z8.U(n9);
            if (z8.a() < 4) {
                z8.T(n8);
                return;
            }
            if (z.k(z8.e(), z8.f()) == 443) {
                z8.U(4);
                n9 = z8.M();
                if (z8.a() < n9) {
                    z8.T(n8);
                    return;
                }
                z8.U(n9);
            }
            while (z8.a() >= 4 && (n9 = z.k(z8.e(), z8.f())) != 442) {
                if (n9 == 441) {
                    return;
                }
                if (n9 >>> 8 != 1) {
                    return;
                }
                z8.U(4);
                if (z8.a() < 2) {
                    z8.T(n8);
                    return;
                }
                n9 = z8.M();
                z8.T(Math.min((int)z8.g(), (int)(z8.f() + n9)));
            }
        }

        @Override
        public e.e a(s s8, long l8) {
            long l9 = s8.p();
            int n8 = (int)Math.min((long)20000L, (long)(s8.a() - l9));
            this.b.P(n8);
            s8.n(this.b.e(), 0, n8);
            return this.c(this.b, l8, l9);
        }

        @Override
        public void b() {
            this.b.Q(M.f);
        }

        public final e.e c(g0.z z8, long l8, long l9) {
            int n8 = -1;
            int n9 = -1;
            long l10 = -9223372036854775807L;
            while (z8.a() >= 4) {
                if (z.k(z8.e(), z8.f()) != 442) {
                    z8.U(1);
                    continue;
                }
                z8.U(4);
                long l11 = A.l(z8);
                int n10 = n9;
                long l12 = l10;
                if (l11 != -9223372036854775807L) {
                    l12 = this.a.b(l11);
                    if (l12 > l8) {
                        if (l10 == -9223372036854775807L) {
                            return e.e.d(l12, l9);
                        }
                        return e.e.e(l9 + (long)n9);
                    }
                    if (100000L + l12 > l8) {
                        return e.e.e(l9 + (long)z8.f());
                    }
                    n10 = z8.f();
                }
                b.d(z8);
                n8 = z8.f();
                n9 = n10;
                l10 = l12;
            }
            if (l10 != -9223372036854775807L) {
                return e.e.f(l10, l9 + (long)n8);
            }
            return e.e.d;
        }
    }

}

