/*
 * Decompiled with CFR 0_124.
 */
package Y0;

import F0.I;
import F0.i;
import Y0.g;

public final class a
extends i
implements g {
    public final int h;
    public final long i;

    public a(long l8, long l9, int n8, int n9, boolean bl) {
        super(l8, l9, n8, n9, bl);
        this.h = n8;
        if (l8 == -1L) {
            l8 = -1L;
        }
        this.i = l8;
    }

    public a(long l8, long l9, I.a a8, boolean bl) {
        this(l8, l9, a8.f, a8.c, bl);
    }

    @Override
    public long c(long l8) {
        return this.b(l8);
    }

    @Override
    public long f() {
        return this.i;
    }

    @Override
    public int k() {
        return this.h;
    }
}

