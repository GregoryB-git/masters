// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b3;

import java.util.concurrent.Executor;

public enum a implements Executor
{
    o("INSTANCE", 0);
    
    static {
        p = c();
    }
    
    public a(final String name, final int ordinal) {
    }
    
    public static /* synthetic */ a[] c() {
        return new a[] { a.o };
    }
    
    @Override
    public void execute(final Runnable runnable) {
        runnable.run();
    }
    
    @Override
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
