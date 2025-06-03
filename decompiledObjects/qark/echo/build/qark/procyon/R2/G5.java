// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class G5 implements Runnable
{
    public final /* synthetic */ P5 o;
    public final /* synthetic */ D5 p;
    
    public G5(final D5 p2, final P5 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        D5.t(this.p, this.o);
        this.p.s0();
    }
}
