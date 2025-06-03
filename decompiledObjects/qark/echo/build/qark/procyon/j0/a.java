// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j0;

public abstract class a
{
    public int o;
    
    public final void l(final int n) {
        this.o |= n;
    }
    
    public void m() {
        this.o = 0;
    }
    
    public final boolean n(final int n) {
        return (this.o & n) == n;
    }
    
    public final boolean o() {
        return this.n(268435456);
    }
    
    public final boolean p() {
        return this.n(4);
    }
    
    public final boolean r() {
        return this.n(134217728);
    }
    
    public final boolean s() {
        return this.n(1);
    }
    
    public final boolean u() {
        return this.n(536870912);
    }
    
    public final void w(final int o) {
        this.o = o;
    }
}
