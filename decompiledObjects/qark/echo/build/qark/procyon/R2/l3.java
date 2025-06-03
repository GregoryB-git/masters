// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public abstract class l3 extends m3
{
    public boolean b;
    
    public l3(final N2 n2) {
        super(n2);
        super.a.n();
    }
    
    public final void o() {
        if (this.r()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void p() {
        if (!this.b) {
            if (!this.s()) {
                super.a.R();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public final void q() {
        if (!this.b) {
            this.t();
            super.a.R();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public final boolean r() {
        return this.b;
    }
    
    public abstract boolean s();
    
    public void t() {
    }
}
