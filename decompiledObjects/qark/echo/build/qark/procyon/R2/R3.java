// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class R3 implements Runnable
{
    public final /* synthetic */ long o;
    public final /* synthetic */ C3 p;
    
    public R3(final C3 p2, final long o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        this.p.i().k.b(this.o);
        this.p.j().F().b("Session timeout duration set", this.o);
    }
}
