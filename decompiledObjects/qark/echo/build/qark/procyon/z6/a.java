// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z6;

import java.util.concurrent.Executor;

public final class a implements Executor
{
    public static final a o;
    
    static {
        o = new a();
    }
    
    @Override
    public void execute(final Runnable runnable) {
        runnable.run();
    }
}
