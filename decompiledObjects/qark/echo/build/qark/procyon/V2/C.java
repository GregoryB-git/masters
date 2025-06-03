// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

public final class C implements Runnable
{
    public final /* synthetic */ j o;
    public final /* synthetic */ D p;
    
    public C(final D p2, final j o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final Object b = D.b(this.p);
        // monitorenter(b)
        while (true) {
            try {
                final D p = this.p;
                if (D.a(p) != null) {
                    D.a(p).a(this.o.j());
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
