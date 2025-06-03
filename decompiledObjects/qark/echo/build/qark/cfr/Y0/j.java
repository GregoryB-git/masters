/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package Y0;

import F0.I;
import F0.M;
import F0.N;
import Y0.g;
import Y0.i;
import g0.M;
import g0.a;

public final class j
implements g {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public j(long l8, int n8, long l9, int n9) {
        this(l8, n8, l9, n9, -1L, null);
    }

    public j(long l8, int n8, long l9, int n9, long l10, long[] arrl) {
        this.a = l8;
        this.b = n8;
        this.c = l9;
        this.d = n9;
        this.e = l10;
        this.g = arrl;
        l9 = -1L;
        l8 = l10 == -1L ? l9 : (l8 += l10);
        this.f = l8;
    }

    public static j a(i object, long l8) {
        long[] arrl;
        long l9 = object.a();
        if (l9 == -9223372036854775807L) {
            return null;
        }
        long l10 = object.c;
        if (l10 != -1L && (arrl = object.f) != null) {
            object = object.a;
            return new j(l8, object.c, l9, object.f, l10, arrl);
        }
        object = object.a;
        return new j(l8, object.c, l9, object.f);
    }

    public final long b(int n8) {
        return this.c * (long)n8 / 100L;
    }

    @Override
    public long c(long l8) {
        if (this.h() && (l8 -= this.a) > (long)this.b) {
            long[] arrl = (long[])a.h(this.g);
            double d8 = (double)l8 * 256.0 / (double)this.e;
            int n8 = M.h(arrl, (long)d8, true, true);
            long l9 = this.b(n8);
            long l10 = arrl[n8];
            int n9 = n8 + 1;
            long l11 = this.b(n9);
            l8 = n8 == 99 ? 256L : arrl[n9];
            d8 = l10 == l8 ? 0.0 : (d8 - (double)l10) / (double)(l8 - l10);
            return l9 + Math.round((double)(d8 * (double)(l11 - l9)));
        }
        return 0L;
    }

    @Override
    public long f() {
        return this.f;
    }

    @Override
    public boolean h() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    @Override
    public M.a j(long l8) {
        if (!this.h()) {
            return new M.a(new N(0L, this.a + (long)this.b));
        }
        l8 = M.q(l8, 0L, this.c);
        double d8 = (double)l8 * 100.0 / (double)this.c;
        double d9 = 0.0;
        if (d8 > 0.0) {
            if (d8 >= 100.0) {
                d9 = 256.0;
            } else {
                int n8 = (int)d8;
                long[] arrl = (long[])a.h(this.g);
                double d10 = arrl[n8];
                d9 = n8 == 99 ? 256.0 : (double)arrl[n8 + 1];
                d9 = d10 + (d8 - (double)n8) * (d9 - d10);
            }
        }
        long l9 = M.q(Math.round((double)(d9 / 256.0 * (double)this.e)), this.b, this.e - 1L);
        return new M.a(new N(l8, this.a + l9));
    }

    @Override
    public int k() {
        return this.d;
    }

    @Override
    public long l() {
        return this.c;
    }
}

