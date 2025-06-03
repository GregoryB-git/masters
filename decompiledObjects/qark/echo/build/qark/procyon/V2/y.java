// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

public final class y implements Runnable
{
    public final /* synthetic */ j o;
    public final /* synthetic */ z p;
    
    public y(final z p2, final j o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final Object b = z.b(this.p);
        // monitorenter(b)
        while (true) {
            try {
                final z p = this.p;
                if (z.a(p) != null) {
                    z.a(p).a(this.o);
                }
                // monitorexit(b)
                return;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
