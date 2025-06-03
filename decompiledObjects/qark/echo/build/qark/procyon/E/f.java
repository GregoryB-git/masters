// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E;

import java.util.concurrent.RejectedExecutionException;
import H.e;
import java.util.concurrent.Executor;
import android.os.Handler;

public abstract class f
{
    public static Executor a(final Handler handler) {
        return new a(handler);
    }
    
    public static class a implements Executor
    {
        public final Handler o;
        
        public a(final Handler handler) {
            this.o = (Handler)e.b(handler);
        }
        
        @Override
        public void execute(final Runnable runnable) {
            if (this.o.post((Runnable)e.b(runnable))) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(this.o);
            sb.append(" is shutting down");
            throw new RejectedExecutionException(sb.toString());
        }
    }
}
