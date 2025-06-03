// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import j2.a;
import java.util.concurrent.Executor;

public class n implements Executor
{
    public final Executor o;
    
    public n(final Executor o) {
        this.o = o;
    }
    
    @Override
    public void execute(final Runnable runnable) {
        this.o.execute(new a(runnable));
    }
    
    public static class a implements Runnable
    {
        public final Runnable o;
        
        public a(final Runnable o) {
            this.o = o;
        }
        
        @Override
        public void run() {
            try {
                this.o.run();
            }
            catch (Exception ex) {
                j2.a.d("Executor", "Background execution failure.", ex);
            }
        }
    }
}
