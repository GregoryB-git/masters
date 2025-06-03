// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class a implements Runnable
{
    public final /* synthetic */ String o;
    public final /* synthetic */ long p;
    public final /* synthetic */ B q;
    
    public a(final B q, final String o, final long p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        B.y(this.q, this.o, this.p);
    }
}
