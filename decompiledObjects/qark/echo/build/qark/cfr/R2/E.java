/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import A2.n;

public final class E {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public E(String string2, String string3, long l8, long l9, long l10, long l11, long l12, Long l13, Long l14, Long l15, Boolean bl) {
        n.e(string2);
        n.e(string3);
        boolean bl2 = true;
        boolean bl3 = l8 >= 0L;
        n.a(bl3);
        bl3 = l9 >= 0L;
        n.a(bl3);
        bl3 = l10 >= 0L;
        n.a(bl3);
        bl3 = l12 >= 0L ? bl2 : false;
        n.a(bl3);
        this.a = string2;
        this.b = string3;
        this.c = l8;
        this.d = l9;
        this.e = l10;
        this.f = l11;
        this.g = l12;
        this.h = l13;
        this.i = l14;
        this.j = l15;
        this.k = bl;
    }

    public E(String string2, String string3, long l8, long l9, long l10, long l11, Long l12, Long l13, Long l14, Boolean bl) {
        this(string2, string3, 0L, 0L, 0L, l10, 0L, null, null, null, null);
    }

    public final E a(long l8) {
        return new E(this.a, this.b, this.c, this.d, this.e, l8, this.g, this.h, this.i, this.j, this.k);
    }

    public final E b(long l8, long l9) {
        return new E(this.a, this.b, this.c, this.d, this.e, this.f, l8, l9, this.i, this.j, this.k);
    }

    public final E c(Long l8, Long l9, Boolean bl) {
        if (bl != null && !bl.booleanValue()) {
            bl = null;
        }
        return new E(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l8, l9, bl);
    }
}

