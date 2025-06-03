// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class d0 implements Runnable
{
    public final /* synthetic */ long o;
    public final /* synthetic */ B p;
    
    public d0(final B p2, final long o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        B.x(this.p, this.o);
    }
}
