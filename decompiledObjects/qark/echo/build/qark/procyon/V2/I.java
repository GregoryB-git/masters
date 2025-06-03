// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;

public final class I implements Executor
{
    @Override
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
}
