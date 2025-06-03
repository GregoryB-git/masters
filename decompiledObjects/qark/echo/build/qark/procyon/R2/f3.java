// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class f3 implements Runnable
{
    public final /* synthetic */ I o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ R2 q;
    
    public f3(final R2 q, final I o, final W5 p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        this.q.d1(this.q.b1(this.o, this.p), this.p);
    }
}
