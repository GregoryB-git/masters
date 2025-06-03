// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import i0.y;
import d0.u;
import d0.I;

public abstract class b0 extends h
{
    public static final Void l;
    public final x k;
    
    public b0(final x k) {
        this.k = k;
    }
    
    public final x.b M(final Void void1, final x.b b) {
        return this.N(b);
    }
    
    public x.b N(final x.b b) {
        return b;
    }
    
    public long O(final long n, final x.b b) {
        return n;
    }
    
    public final long P(final Void void1, final long n, final x.b b) {
        return this.O(n, b);
    }
    
    public int Q(final int n) {
        return n;
    }
    
    public final int R(final Void void1, final int n) {
        return this.Q(n);
    }
    
    public abstract void S(final I p0);
    
    public final void T(final Void void1, final x x, final I i) {
        this.S(i);
    }
    
    public final void U() {
        this.K(b0.l, this.k);
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
    public void l(final u u) {
        this.k.l(u);
    }
    
    @Override
    public final void z(final y y) {
        super.z(y);
        this.V();
    }
}
