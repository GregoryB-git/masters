// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class B4 implements Runnable
{
    public final /* synthetic */ w4 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ v4 q;
    
    public B4(final v4 q, final w4 o, final long p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        v4.G(this.q, this.o, false, this.p);
        final v4 q = this.q;
        q.e = null;
        q.t().G(null);
    }
}
