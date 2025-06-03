/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package F0;

import F0.M;
import F0.N;

public final class P
implements M {
    public final long a;
    public final long b;

    public P(long l8) {
        this(l8, 0L);
    }

    public P(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public M.a j(long l8) {
        return new M.a(new N(l8, this.b));
    }

    @Override
    public long l() {
        return this.a;
    }
}

