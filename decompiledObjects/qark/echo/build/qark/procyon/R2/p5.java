// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class p5 implements Runnable
{
    public long o;
    public long p;
    public final /* synthetic */ q5 q;
    
    public p5(final q5 q, final long o, final long p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        this.q.b.e().D(new s5(this));
    }
}
