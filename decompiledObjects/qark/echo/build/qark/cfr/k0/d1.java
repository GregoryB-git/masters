/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.Object
 */
package k0;

import g0.M;
import g0.a;

public final class d1 {
    public static final d1 c;
    public static final d1 d;
    public static final d1 e;
    public static final d1 f;
    public static final d1 g;
    public final long a;
    public final long b;

    static {
        d1 d12;
        c = d12 = new d1(0L, 0L);
        d = new d1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new d1(Long.MAX_VALUE, 0L);
        f = new d1(0L, Long.MAX_VALUE);
        g = d12;
    }

    public d1(long l8, long l9) {
        boolean bl = true;
        boolean bl2 = l8 >= 0L;
        a.a(bl2);
        bl2 = l9 >= 0L ? bl : false;
        a.a(bl2);
        this.a = l8;
        this.b = l9;
    }

    public long a(long l8, long l9, long l10) {
        long l11 = this.a;
        if (l11 == 0L && this.b == 0L) {
            return l8;
        }
        l11 = M.e1(l8, l11, Long.MIN_VALUE);
        long l12 = M.b(l8, this.b, Long.MAX_VALUE);
        boolean bl = false;
        boolean bl2 = l11 <= l9 && l9 <= l12;
        boolean bl3 = bl;
        if (l11 <= l10) {
            bl3 = bl;
            if (l10 <= l12) {
                bl3 = true;
            }
        }
        if (bl2 && bl3) {
            if (Math.abs((long)(l9 - l8)) <= Math.abs((long)(l10 - l8))) {
                return l9;
            }
            return l10;
        }
        if (bl2) {
            return l9;
        }
        if (bl3) {
            return l10;
        }
        return l11;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (d1.class != object.getClass()) {
                return false;
            }
            object = (d1)object;
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

