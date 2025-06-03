// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import java.util.Iterator;
import n6.c;
import java.util.ServiceLoader;
import p6.G;
import java.util.List;
import java.util.Collection;

public abstract class g
{
    public static final Collection a;
    
    static {
        a = c.e(c.a(ServiceLoader.load(G.class, G.class.getClassLoader()).iterator()));
    }
    
    public static final Collection a() {
        return g.a;
    }
    
    public static final void b(final Throwable t) {
        final Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
    }
}
