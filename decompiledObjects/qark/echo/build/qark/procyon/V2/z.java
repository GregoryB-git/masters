// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;

public final class z implements G
{
    public final Executor a;
    public final Object b;
    public e c;
    
    public z(final Executor a, final e c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void c(final j j) {
        final Object b = this.b;
        // monitorenter(b)
        while (true) {
            try {
                if (this.c == null) {
                    // monitorexit(b)
                    return;
                }
                // monitorexit(b)
                this.a.execute(new y(this, j));
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
