/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigInteger
 *  java.math.RoundingMode
 *  java.util.List
 */
package o0;

import d0.q;
import g0.M;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import o0.i;
import o0.j;
import o0.n;

public abstract class k {
    public final i a;
    public final long b;
    public final long c;

    public k(i i8, long l8, long l9) {
        this.a = i8;
        this.b = l8;
        this.c = l9;
    }

    public i a(j j8) {
        return this.a;
    }

    public long b() {
        return M.W0(this.c, 1000000L, this.b);
    }

    public static abstract class a
    extends k {
        public final long d;
        public final long e;
        public final List f;
        public final long g;
        public final long h;
        public final long i;

        public a(i i8, long l8, long l9, long l10, long l11, List list, long l12, long l13, long l14) {
            super(i8, l8, l9);
            this.d = l10;
            this.e = l11;
            this.f = list;
            this.i = l12;
            this.g = l13;
            this.h = l14;
        }

        public long c(long l8, long l9) {
            long l10 = this.g(l8);
            if (l10 != -1L) {
                return l10;
            }
            return (int)(this.i(l9 - this.h + this.i, l8) - this.d(l8, l9));
        }

        public long d(long l8, long l9) {
            long l10;
            if (this.g(l8) == -1L && (l10 = this.g) != -9223372036854775807L) {
                l8 = this.i(l9 - this.h - l10, l8);
                return Math.max((long)this.e(), (long)l8);
            }
            return this.e();
        }

        public long e() {
            return this.d;
        }

        public long f(long l8, long l9) {
            if (this.f != null) {
                return -9223372036854775807L;
            }
            l9 = this.d(l8, l9) + this.c(l8, l9);
            return this.j(l9) + this.h(l9, l8) - this.i;
        }

        public abstract long g(long var1);

        public final long h(long l8, long l9) {
            List list = this.f;
            if (list != null) {
                return ((d)list.get((int)((int)(l8 - this.d)))).b * 1000000L / this.b;
            }
            long l10 = this.g(l9);
            if (l10 != -1L && l8 == this.e() + l10 - 1L) {
                return l9 - this.j(l8);
            }
            return this.e * 1000000L / this.b;
        }

        public long i(long l8, long l9) {
            long l10 = this.e();
            if ((l9 = this.g(l9)) == 0L) {
                return l10;
            }
            if (this.f == null) {
                long l11 = this.e * 1000000L / this.b;
                if ((l8 = this.d + l8 / l11) < l10) {
                    return l10;
                }
                if (l9 == -1L) {
                    return l8;
                }
                return Math.min((long)l8, (long)(l10 + l9 - 1L));
            }
            long l12 = l9 + l10 - 1L;
            l9 = l10;
            while (l9 <= l12) {
                long l13 = (l12 - l9) / 2L + l9;
                long l14 = this.j(l13) LCMP l8;
                if (l14 < 0) {
                    l9 = l13 + 1L;
                    continue;
                }
                if (l14 > 0) {
                    l12 = l13 - 1L;
                    continue;
                }
                return l13;
            }
            if (l9 == l10) {
                l12 = l9;
            }
            return l12;
        }

        public final long j(long l8) {
            List list = this.f;
            l8 = list != null ? ((d)list.get((int)((int)(l8 - this.d)))).a - this.c : (l8 - this.d) * this.e;
            return M.W0(l8, 1000000L, this.b);
        }

        public abstract i k(j var1, long var2);

        public boolean l() {
            if (this.f != null) {
                return true;
            }
            return false;
        }
    }

    public static final class b
    extends a {
        public final List j;

        public b(i i8, long l8, long l9, long l10, long l11, List list, long l12, List list2, long l13, long l14) {
            super(i8, l8, l9, l10, l11, list, l12, l13, l14);
            this.j = list2;
        }

        @Override
        public long g(long l8) {
            return this.j.size();
        }

        @Override
        public i k(j j8, long l8) {
            return (i)this.j.get((int)(l8 - this.d));
        }

        @Override
        public boolean l() {
            return true;
        }
    }

    public static final class c
    extends a {
        public final n j;
        public final n k;
        public final long l;

        public c(i i8, long l8, long l9, long l10, long l11, long l12, List list, long l13, n n8, n n9, long l14, long l15) {
            super(i8, l8, l9, l10, l12, list, l13, l14, l15);
            this.j = n8;
            this.k = n9;
            this.l = l11;
        }

        @Override
        public i a(j object) {
            n n8 = this.j;
            if (n8 != null) {
                object = object.b;
                return new i(n8.a(object.a, 0L, object.i, 0L), 0L, -1L);
            }
            return k.super.a((j)object);
        }

        @Override
        public long g(long l8) {
            List list = this.f;
            if (list != null) {
                return list.size();
            }
            long l9 = this.l;
            if (l9 != -1L) {
                return l9 - this.d + 1L;
            }
            if (l8 != -9223372036854775807L) {
                return Z2.a.a(BigInteger.valueOf((long)l8).multiply(BigInteger.valueOf((long)this.b)), BigInteger.valueOf((long)this.e).multiply(BigInteger.valueOf((long)1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override
        public i k(j object, long l8) {
            Object object2 = this.f;
            long l9 = object2 != null ? ((d)object2.get((int)((int)(l8 - this.d)))).a : (l8 - this.d) * this.e;
            object2 = this.k;
            object = object.b;
            return new i(object2.a(object.a, l8, object.i, l9), 0L, -1L);
        }
    }

    public static final class d {
        public final long a;
        public final long b;

        public d(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (d.class != object.getClass()) {
                    return false;
                }
                object = (d)object;
                if (this.a == object.a && this.b == object.b) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (int)this.a * 31 + (int)this.b;
        }
    }

    public static class e
    extends k {
        public final long d;
        public final long e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(i i8, long l8, long l9, long l10, long l11) {
            super(i8, l8, l9);
            this.d = l10;
            this.e = l11;
        }

        public i c() {
            long l8 = this.e;
            if (l8 <= 0L) {
                return null;
            }
            return new i(null, this.d, l8);
        }
    }

}

