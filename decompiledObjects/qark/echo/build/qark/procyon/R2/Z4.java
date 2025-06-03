// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class Z4 implements Runnable
{
    public final /* synthetic */ R1 o;
    public final /* synthetic */ a5 p;
    
    public Z4(final a5 p2, final R1 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final a5 p = this.p;
        // monitorenter(p)
        while (true) {
            try {
                a5.b(this.p, false);
                if (!this.p.c.c0()) {
                    this.p.c.j().K().a("Connected to service");
                    this.p.c.E(this.o);
                }
                // monitorexit(p)
                return;
                // monitorexit(p)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
