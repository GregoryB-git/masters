// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

public final class u implements Runnable
{
    public final /* synthetic */ int o;
    public final /* synthetic */ x p;
    
    public u(final x p2, final int o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        x.z(this.p, this.o);
    }
}
