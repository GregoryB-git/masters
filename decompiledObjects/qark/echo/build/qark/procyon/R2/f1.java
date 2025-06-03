// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public abstract class f1 extends G1
{
    public boolean b;
    
    public f1(final N2 n2) {
        super(n2);
        super.a.n();
    }
    
    public abstract boolean A();
    
    public final void v() {
        if (this.z()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void w() {
        if (!this.b) {
            if (!this.A()) {
                super.a.R();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public final void x() {
        if (!this.b) {
            this.y();
            super.a.R();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public void y() {
    }
    
    public final boolean z() {
        return this.b;
    }
}
