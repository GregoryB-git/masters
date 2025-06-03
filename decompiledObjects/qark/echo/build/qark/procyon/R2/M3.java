// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.concurrent.Executor;

public final class M3 implements Executor
{
    public final /* synthetic */ C3 o;
    
    public M3(final C3 o) {
        this.o = o;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.o.e().D(runnable);
    }
}
