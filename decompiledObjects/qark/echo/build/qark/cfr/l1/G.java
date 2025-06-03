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
import g0.z;
import l1.L;

public final class G
extends e {
    public G(E e8, long l8, long l9, int n8, int n9) {
        super(new e.b(), new a(n8, e8, n9), l8, 0L, l8 + 1L, 0L, l9, 188L, 940);
    }

    public static final class a
    implements e.f {
        public final E a;
        public final z b;
        public final int c;
        public final int d;

        public a(int n8, E e8, int n9) {
            this.c = n8;
            this.a = e8;
            this.d = n9;
            this.b = new z();
        }

        @Override
        public e.e a(s s8, long l8) {
            long l9 = s8.p();
            int n8 = (int)Math.min((long)this.d, (long)(s8.a() - l9));
            this.b.P(n8);
            s8.n(this.b.e(), 0, n8);
            return this.c(this.b, l8, l9);
        }

        @Override
        public void b() {
            this.b.Q(M.f);
        }

        public final e.e c(z z8, long l8, long l9) {
            int n8;
            int n9;
            int n10 = z8.g();
            long l10 = -1L;
            long l11 = -1L;
            long l12 = -9223372036854775807L;
            while (z8.a() >= 188 && (n9 = (n8 = L.a(z8.e(), z8.f(), n10)) + 188) <= n10) {
                l10 = L.c(z8, n8, this.c);
                long l13 = l11;
                long l14 = l12;
                if (l10 != -9223372036854775807L) {
                    l14 = this.a.b(l10);
                    if (l14 > l8) {
                        if (l12 == -9223372036854775807L) {
                            return e.e.d(l14, l9);
                        }
                        return e.e.e(l9 + l11);
                    }
                    if (100000L + l14 > l8) {
                        return e.e.e(l9 + (long)n8);
                    }
                    l13 = n8;
                }
                z8.T(n9);
                l10 = n9;
                l11 = l13;
                l12 = l14;
            }
            if (l12 != -9223372036854775807L) {
                return e.e.f(l12, l9 + l10);
            }
            return e.e.d;
        }
    }

}

