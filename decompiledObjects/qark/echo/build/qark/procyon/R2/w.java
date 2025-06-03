// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class w implements Runnable
{
    public final /* synthetic */ o3 o;
    public final /* synthetic */ x p;
    
    public w(final x p2, final o3 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        this.o.d();
        if (f.a()) {
            this.o.e().D(this);
            return;
        }
        final boolean e = this.p.e();
        x.c(this.p, 0L);
        if (e) {
            this.p.d();
        }
    }
}
