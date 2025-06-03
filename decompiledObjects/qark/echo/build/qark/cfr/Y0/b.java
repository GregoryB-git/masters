/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.math.RoundingMode
 */
package Y0;

import F0.M;
import F0.N;
import Y0.g;
import g0.M;
import g0.p;
import java.math.RoundingMode;

public final class b
implements g {
    public final long a;
    public final p b;
    public final p c;
    public final int d;
    public long e;

    public b(long l8, long l9, long l10) {
        int n8;
        p p8;
        p p9;
        this.e = l8;
        this.a = l10;
        this.b = p8 = new p();
        this.c = p9 = new p();
        p8.a(0L);
        p9.a(l9);
        int n9 = n8 = -2147483647;
        if (l8 != -9223372036854775807L) {
            l8 = M.Y0(l9 - l10, 8L, l8, RoundingMode.HALF_UP);
            n9 = n8;
            if (l8 > 0L) {
                n9 = n8;
                if (l8 <= Integer.MAX_VALUE) {
                    n9 = (int)l8;
                }
            }
        }
        this.d = n9;
    }

    public boolean a(long l8) {
        p p8 = this.b;
        if (l8 - p8.b(p8.c() - 1) < 100000L) {
            return true;
        }
        return false;
    }

    public void b(long l8, long l9) {
        if (this.a(l8)) {
            return;
        }
        this.b.a(l8);
        this.c.a(l9);
    }

    @Override
    public long c(long l8) {
        int n8 = M.e(this.c, l8, true, true);
        return this.b.b(n8);
    }

    public void d(long l8) {
        this.e = l8;
    }

    @Override
    public long f() {
        return this.a;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public M.a j(long l8) {
        int n8 = M.e(this.b, l8, true, true);
        N n9 = new N(this.b.b(n8), this.c.b(n8));
        if (n9.a != l8 && n8 != this.b.c() - 1) {
            p p8 = this.b;
            return new M.a(n9, new N(p8.b(n8), this.c.b(++n8)));
        }
        return new M.a(n9);
    }

    @Override
    public int k() {
        return this.d;
    }

    @Override
    public long l() {
        return this.e;
    }
}

