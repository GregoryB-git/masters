// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;

public final class B implements G
{
    public final Executor a;
    public final Object b;
    public f c;
    
    public B(final Executor a, final f c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void c(final j j) {
        if (!j.n() && !j.l()) {
            final Object b = this.b;
            // monitorenter(b)
            while (true) {
                try {
                    if (this.c == null) {
                        // monitorexit(b)
                        return;
                    }
                    // monitorexit(b)
                    this.a.execute(new A(this, j));
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
