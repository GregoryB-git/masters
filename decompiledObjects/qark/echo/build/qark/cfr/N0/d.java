/*
 * Decompiled with CFR 0_124.
 */
package N0;

import F0.C;
import F0.s;
import g0.a;

public final class d
extends C {
    public final long b;

    public d(s s8, long l8) {
        super(s8);
        boolean bl = s8.p() >= l8;
        a.a(bl);
        this.b = l8;
    }

    @Override
    public long a() {
        return super.a() - this.b;
    }

    @Override
    public long m() {
        return super.m() - this.b;
    }

    @Override
    public long p() {
        return super.p() - this.b;
    }
}

