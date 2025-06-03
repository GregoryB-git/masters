/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package y0;

import d0.q;
import g0.a;
import i0.g;
import i0.k;
import y0.e;

public abstract class m
extends e {
    public final long j;

    public m(g g8, k k8, q q8, int n8, Object object, long l8, long l9, long l10) {
        super(g8, k8, 1, q8, n8, object, l8, l9);
        a.e(q8);
        this.j = l10;
    }

    public long g() {
        long l8 = this.j;
        long l9 = -1L;
        if (l8 != -1L) {
            l9 = 1L + l8;
        }
        return l9;
    }

    public abstract boolean h();
}

