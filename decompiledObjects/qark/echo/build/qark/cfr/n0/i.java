/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package n0;

import F0.h;
import n0.g;

public final class i
implements g {
    public final h a;
    public final long b;

    public i(h h8, long l8) {
        this.a = h8;
        this.b = l8;
    }

    @Override
    public long a(long l8, long l9) {
        return this.a.a(l8 + this.b);
    }

    @Override
    public long b(long l8, long l9) {
        return this.a.d[(int)l8];
    }

    @Override
    public long c(long l8) {
        return this.a.e[(int)l8] - this.b;
    }

    @Override
    public long d(long l8, long l9) {
        return 0L;
    }

    @Override
    public long e(long l8, long l9) {
        return -9223372036854775807L;
    }

    @Override
    public o0.i f(long l8) {
        h h8 = this.a;
        long[] arrl = h8.c;
        int n8 = (int)l8;
        return new o0.i(null, arrl[n8], h8.b[n8]);
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public long h() {
        return 0L;
    }

    @Override
    public long i(long l8) {
        return this.a.a;
    }

    @Override
    public long j(long l8, long l9) {
        return this.a.a;
    }
}

