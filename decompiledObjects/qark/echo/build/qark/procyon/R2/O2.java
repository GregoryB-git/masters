// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class O2 implements Runnable
{
    public final /* synthetic */ x3 o;
    public final /* synthetic */ N2 p;
    
    public O2(final N2 p2, final x3 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        N2.g(this.p, this.o);
        this.p.k(this.o.g);
    }
}
