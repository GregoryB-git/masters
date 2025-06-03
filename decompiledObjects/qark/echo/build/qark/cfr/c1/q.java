/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.util.List
 */
package c1;

import c1.k;
import g0.a;
import j0.j;
import java.util.List;

public abstract class q
extends j
implements k {
    public k s;
    public long t;

    @Override
    public int c(long l8) {
        return ((k)a.e(this.s)).c(l8 - this.t);
    }

    @Override
    public long e(int n8) {
        return ((k)a.e(this.s)).e(n8) + this.t;
    }

    @Override
    public List h(long l8) {
        return ((k)a.e(this.s)).h(l8 - this.t);
    }

    @Override
    public int j() {
        return ((k)a.e(this.s)).j();
    }

    @Override
    public void m() {
        super.m();
        this.s = null;
    }

    public void z(long l8, k k8, long l9) {
        this.p = l8;
        this.s = k8;
        if (l9 != Long.MAX_VALUE) {
            l8 = l9;
        }
        this.t = l8;
    }
}

