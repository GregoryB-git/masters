/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Void
 */
package x0;

import d0.I;
import d0.u;
import i0.y;
import x0.h;
import x0.x;

public abstract class b0
extends h {
    public static final Void l;
    public final x k;

    public b0(x x8) {
        this.k = x8;
    }

    public final x.b M(Void void_, x.b b8) {
        return this.N(b8);
    }

    public x.b N(x.b b8) {
        return b8;
    }

    public long O(long l8, x.b b8) {
        return l8;
    }

    public final long P(Void void_, long l8, x.b b8) {
        return this.O(l8, b8);
    }

    public int Q(int n8) {
        return n8;
    }

    public final int R(Void void_, int n8) {
        return this.Q(n8);
    }

    public abstract void S(I var1);

    public final void T(Void void_, x x8, I i8) {
        this.S(i8);
    }

    public final void U() {
        this.K((Object)l, this.k);
    }

    public void V() {
        this.U();
    }

    @Override
    public u a() {
        return this.k.a();
    }

    @Override
    public boolean i() {
        return this.k.i();
    }

    @Override
    public I j() {
        return this.k.j();
    }

    @Override
    public void l(u u8) {
        this.k.l(u8);
    }

    @Override
    public final void z(y y8) {
        super.z(y8);
        this.V();
    }
}

