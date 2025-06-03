// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Set;
import r4.b;

public class y implements b
{
    public volatile Set a;
    public volatile Set b;
    
    public y(final Collection collection) {
        this.b = null;
        (this.a = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>())).addAll(collection);
    }
    
    public static y b(final Collection collection) {
        return new y(collection);
    }
    
    public void a(final b b) {
        // monitorenter(this)
        while (true) {
            try {
                b b2;
                Set<b> set;
                if (this.b == null) {
                    final Set a = this.a;
                    b2 = b;
                    set = (Set<b>)a;
                }
                else {
                    final Set b3 = this.b;
                    final Object value = b.get();
                    set = (Set<b>)b3;
                    b2 = (b)value;
                }
                set.add(b2);
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public Set c() {
        while (true) {
            if (this.b == null) {
                // monitorenter(this)
                while (true) {
                    try {
                        if (this.b == null) {
                            this.b = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
                            this.d();
                        }
                        // monitorexit(this)
                        return Collections.unmodifiableSet((Set<?>)this.b);
                    }
                    // monitorexit(this)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public final void d() {
        // monitorenter(this)
        while (true) {
            try {
                final Iterator<b> iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    this.b.add(iterator.next().get());
                }
                this.a = null;
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
