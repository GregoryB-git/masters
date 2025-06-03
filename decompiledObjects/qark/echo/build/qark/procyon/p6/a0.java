// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import W5.f;

public abstract class a0 extends F
{
    public long q;
    public boolean r;
    public f s;
    
    public final void H(final boolean b) {
        final long q = this.q - this.J(b);
        this.q = q;
        if (q > 0L) {
            return;
        }
        if (this.r) {
            this.shutdown();
        }
    }
    
    public final long J(final boolean b) {
        if (b) {
            return 4294967296L;
        }
        return 1L;
    }
    
    public final void K(final U u) {
        f s;
        if ((s = this.s) == null) {
            s = new f();
            this.s = s;
        }
        s.g(u);
    }
    
    public long L() {
        final f s = this.s;
        if (s == null) {
            return Long.MAX_VALUE;
        }
        if (s.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }
    
    public final void M(final boolean b) {
        this.q += this.J(b);
        if (!b) {
            this.r = true;
        }
    }
    
    public final boolean O() {
        return this.q >= this.J(true);
    }
    
    public final boolean P() {
        final f s = this.s;
        return s == null || s.isEmpty();
    }
    
    public abstract long Q();
    
    public final boolean R() {
        final f s = this.s;
        if (s == null) {
            return false;
        }
        final U u = (U)s.W();
        if (u == null) {
            return false;
        }
        u.run();
        return true;
    }
    
    public boolean S() {
        return false;
    }
    
    public abstract void shutdown();
}
