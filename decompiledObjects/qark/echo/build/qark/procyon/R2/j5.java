// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class j5 implements Runnable
{
    public final /* synthetic */ D5 o;
    public final /* synthetic */ Runnable p;
    
    public j5(final i5 i5, final D5 o, final Runnable p3) {
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        this.o.o0();
        this.o.y(this.p);
        this.o.t0();
    }
}
