// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import java.util.Iterator;
import java.io.IOException;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

public abstract class r
{
    public final Map a;
    public volatile boolean b;
    
    public r() {
        this.a = new HashMap();
        this.b = false;
    }
    
    public static void b(final Object o) {
        if (o instanceof Closeable) {
            try {
                ((Closeable)o).close();
            }
            catch (IOException cause) {
                throw new RuntimeException(cause);
            }
        }
    }
    
    public final void a() {
        this.b = true;
        final Map a = this.a;
        while (true) {
            if (a != null) {
                // monitorenter(a)
                while (true) {
                    try {
                        final Iterator<Object> iterator = this.a.values().iterator();
                        while (iterator.hasNext()) {
                            b(iterator.next());
                        }
                        // monitorexit(a)
                        this.d();
                        return;
                    }
                    // monitorexit(a)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public Object c(final String s) {
        final Map a = this.a;
        if (a == null) {
            return null;
        }
        synchronized (a) {
            return this.a.get(s);
        }
    }
    
    public void d() {
    }
}
