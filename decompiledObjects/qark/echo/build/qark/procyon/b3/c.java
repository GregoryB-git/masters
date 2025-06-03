// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b3;

import W2.i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import W2.m;
import java.util.concurrent.Executor;

public abstract class c extends d
{
    public static void a(final e e, final b b, final Executor executor) {
        m.j(b);
        e.c(new a(e, b), executor);
    }
    
    public static Object b(final Future future) {
        m.q(future.isDone(), "Future was expected to be done: %s", future);
        return g.a(future);
    }
    
    public static final class a implements Runnable
    {
        public final Future o;
        public final b p;
        
        public a(final Future o, final b p2) {
            this.o = o;
            this.p = p2;
        }
        
        @Override
        public void run() {
            final Future o = this.o;
            try {
                this.p.a(c.b(o));
            }
            catch (ExecutionException ex) {
                this.p.onFailure(ex.getCause());
            }
            finally {
                final Throwable t;
                this.p.onFailure(t);
            }
        }
        
        @Override
        public String toString() {
            return i.a(this).c(this.p).toString();
        }
    }
}
