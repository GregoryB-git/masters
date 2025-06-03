// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C3;

import java.util.concurrent.Executor;

public abstract class z
{
    public static Executor a() {
        return a.o;
    }
    
    public static Executor b(final Executor executor) {
        return new A(executor);
    }
    
    public enum a implements Executor
    {
        o("INSTANCE", 0);
        
        public a(final String name, final int ordinal) {
        }
        
        @Override
        public void execute(final Runnable runnable) {
            runnable.run();
        }
    }
}
