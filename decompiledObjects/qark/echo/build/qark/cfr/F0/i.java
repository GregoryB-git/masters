/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package F0;

import F0.M;
import F0.N;

public class i
implements M {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    /*
     * Enabled aggressive block sorting
     */
    public i(long l8, long l9, int n8, int n9, boolean bl) {
        this.a = l8;
        this.b = l9;
        int n10 = n9;
        if (n9 == -1) {
            n10 = 1;
        }
        this.c = n10;
        this.e = n8;
        this.g = bl;
        if (l8 == -1L) {
            this.d = -1L;
            l8 = -9223372036854775807L;
        } else {
            this.d = l8 - l9;
            l8 = i.d(l8, l9, n8);
        }
        this.f = l8;
    }

    public static long d(long l8, long l9, int n8) {
        return Math.max((long)0L, (long)(l8 - l9)) * 8000000L / (long)n8;
    }

    public final long a(long l8) {
        l8 = l8 * (long)this.e / 8000000L;
        int n8 = this.c;
        long l9 = l8 / (long)n8 * (long)n8;
        long l10 = this.d;
        l8 = l9;
        if (l10 != -1L) {
            l8 = Math.min((long)l9, (long)(l10 - (long)n8));
        }
        l8 = Math.max((long)l8, (long)0L);
        return this.b + l8;
    }

    public long b(long l8) {
        return i.d(l8, this.b, this.e);
    }

    @Override
    public boolean h() {
        if (this.d == -1L && !this.g) {
            return false;
        }
        return true;
    }

    @Override
    public M.a j(long l8) {
        int n8;
        if (this.d == -1L && !this.g) {
            return new M.a(new N(0L, this.b));
        }
        long l9 = this.a(l8);
        long l10 = this.b(l9);
        N n9 = new N(l10, l9);
        if (this.d != -1L && l10 < l8 && (long)(n8 = this.c) + l9 < this.a) {
            l8 = l9 + (long)n8;
            return new M.a(n9, new N(this.b(l8), l8));
        }
        return new M.a(n9);
    }

    @Override
    public long l() {
        return this.f;
    }
}

