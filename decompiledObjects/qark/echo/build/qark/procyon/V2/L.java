// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Callable;

public final class L implements Runnable
{
    public final /* synthetic */ K o;
    public final /* synthetic */ Callable p;
    
    public L(final K o, final Callable p2) {
        this.o = o;
        this.p = p2;
    }
    
    @Override
    public final void run() {
        final Exception cause;
        Label_0041: {
            try {
                this.o.r(this.p.call());
                return;
            }
            catch (Exception ex) {
                break Label_0041;
            }
            this.o.q(new RuntimeException(cause));
            return;
        }
        this.o.q(cause);
    }
}
