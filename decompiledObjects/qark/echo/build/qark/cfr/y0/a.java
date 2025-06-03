/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package y0;

import d0.q;
import i0.g;
import i0.k;
import y0.c;
import y0.m;

public abstract class a
extends m {
    public final long k;
    public final long l;
    public c m;
    public int[] n;

    public a(g g8, k k8, q q8, int n8, Object object, long l8, long l9, long l10, long l11, long l12) {
        super(g8, k8, q8, n8, object, l8, l9, l12);
        this.k = l10;
        this.l = l11;
    }

    public final int i(int n8) {
        return ((int[])g0.a.h(this.n))[n8];
    }

    public final c j() {
        return (c)g0.a.h(this.m);
    }

    public void k(c c8) {
        this.m = c8;
        this.n = c8.b();
    }
}

