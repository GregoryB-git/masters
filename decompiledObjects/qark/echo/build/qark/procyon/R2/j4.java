// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class j4 implements Runnable
{
    public final /* synthetic */ z o;
    public final /* synthetic */ C3 p;
    
    public j4(final C3 p2, final z o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        if (this.p.i().z(this.o)) {
            this.p.t().U(false);
            return;
        }
        this.p.j().J().b("Lower precedence consent source ignored, proposed source", this.o.a());
    }
}
