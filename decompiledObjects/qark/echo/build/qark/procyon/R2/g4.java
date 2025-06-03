// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class g4 implements Runnable
{
    public final /* synthetic */ Boolean o;
    public final /* synthetic */ C3 p;
    
    public g4(final C3 p2, final Boolean o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        C3.M(this.p, this.o, true);
    }
}
