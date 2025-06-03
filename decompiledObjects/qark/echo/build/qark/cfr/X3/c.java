/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package X3;

import X3.a;

public class c
implements a {
    public final long a;

    public c(long l8) {
        this.a = l8;
    }

    @Override
    public boolean a(long l8, long l9) {
        if (l8 <= this.a && l9 <= 1000L) {
            return false;
        }
        return true;
    }

    @Override
    public float b() {
        return 0.2f;
    }

    @Override
    public long c() {
        return 1000L;
    }

    @Override
    public boolean d(long l8) {
        if (l8 > 1000L) {
            return true;
        }
        return false;
    }
}

