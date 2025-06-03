// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public abstract class C5 extends z5
{
    public boolean c;
    
    public C5(final D5 d5) {
        super(d5);
        super.b.r0();
    }
    
    public final void u() {
        if (this.w()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void v() {
        if (!this.c) {
            this.x();
            super.b.q0();
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public final boolean w() {
        return this.c;
    }
    
    public abstract boolean x();
}
