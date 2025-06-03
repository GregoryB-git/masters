// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

public final class w implements Runnable
{
    public final /* synthetic */ x o;
    
    public w(final x o) {
        this.o = o;
    }
    
    @Override
    public final void run() {
        final Object b = x.b(this.o);
        // monitorenter(b)
        while (true) {
            try {
                final x o = this.o;
                if (x.a(o) != null) {
                    x.a(o).b();
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
