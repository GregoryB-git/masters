// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class C4 implements Runnable
{
    public final /* synthetic */ long o;
    public final /* synthetic */ v4 p;
    
    public C4(final v4 p2, final long o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        this.p.o().v(this.o);
        this.p.e = null;
    }
}
