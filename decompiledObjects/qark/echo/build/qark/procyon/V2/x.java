// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;

public final class x implements G
{
    public final Executor a;
    public final Object b;
    public d c;
    
    public x(final Executor a, final d c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void c(j b) {
        if (b.l()) {
            b = (j)this.b;
            // monitorenter(b)
            while (true) {
                try {
                    if (this.c == null) {
                        // monitorexit(b)
                        return;
                    }
                    // monitorexit(b)
                    this.a.execute(new w(this));
                    return;
                    // monitorexit(b)
                    return;
                }
                finally {}
                continue;
            }
        }
    }
}
