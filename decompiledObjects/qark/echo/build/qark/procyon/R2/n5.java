// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class n5 implements Runnable
{
    public final /* synthetic */ long o;
    public final /* synthetic */ l5 p;
    
    public n5(final l5 p2, final long o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        l5.C(this.p, this.o);
    }
}
