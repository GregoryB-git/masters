// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import java.util.Collections;
import java.util.Set;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import n4.b;
import n4.a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.Queue;
import java.util.Map;
import n4.c;
import n4.d;

public class v implements d, c
{
    public final Map a;
    public Queue b;
    public final Executor c;
    
    public v(final Executor c) {
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = c;
    }
    
    @Override
    public void a(final a a) {
        E.b(a);
        // monitorenter(this)
        while (true) {
            try {
                final Queue b = this.b;
                if (b != null) {
                    b.add(a);
                    // monitorexit(this)
                    return;
                }
                // monitorexit(this)
                for (final Map.Entry<K, Executor> entry : this.g(a)) {
                    entry.getValue().execute(new u((Map.Entry)entry, a));
                }
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
    
    @Override
    public void b(final Class clazz, final Executor value, final b key) {
        // monitorenter(this)
        while (true) {
            try {
                E.b(clazz);
                E.b(key);
                E.b(value);
                if (!this.a.containsKey(clazz)) {
                    this.a.put(clazz, new ConcurrentHashMap());
                }
                this.a.get(clazz).put(key, value);
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
    
    @Override
    public void c(final Class clazz, final b b) {
        this.b(clazz, this.c, b);
    }
    
    @Override
    public void d(final Class clazz, final b key) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0081: {
            try {
                E.b(clazz);
                E.b(key);
                if (!this.a.containsKey(clazz)) {
                    // monitorexit(this)
                    return;
                }
                final ConcurrentHashMap concurrentHashMap = this.a.get(clazz);
                concurrentHashMap.remove(key);
                if (concurrentHashMap.isEmpty()) {
                    this.a.remove(clazz);
                }
            }
            finally {
                break Label_0081;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void f() {
        while (true) {
            // monitorenter(this)
            while (true) {
                Label_0066: {
                    while (true) {
                        try {
                            final Collection<a> b = (Collection<a>)this.b;
                            if (b != null) {
                                this.b = null;
                                // monitorexit(this)
                                if (b != null) {
                                    final Iterator<a> iterator = b.iterator();
                                    while (iterator.hasNext()) {
                                        this.a(iterator.next());
                                    }
                                }
                                return;
                            }
                            break Label_0066;
                            // monitorexit(this)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final Collection<a> b = null;
                continue;
            }
        }
    }
    
    public final Set g(final a a) {
        // monitorenter(this)
        while (true) {
            try {
                final Map map = this.a.get(a.b());
                Set<Object> set;
                if (map == null) {
                    set = Collections.emptySet();
                }
                else {
                    set = (Set<Object>)map.entrySet();
                }
                // monitorexit(this)
                return set;
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
