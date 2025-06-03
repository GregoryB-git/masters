// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F2;

import A2.n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a implements ThreadFactory
{
    public final String a;
    public final ThreadFactory b;
    
    public a(final String a) {
        this.b = Executors.defaultThreadFactory();
        n.j(a, "Name must not be null");
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.b.newThread(new b(runnable, 0));
        thread.setName(this.a);
        return thread;
    }
}
