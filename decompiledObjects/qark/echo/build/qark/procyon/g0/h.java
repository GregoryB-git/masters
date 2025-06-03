// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public final class h implements Iterable
{
    public final Object o;
    public final Map p;
    public Set q;
    public List r;
    
    public h() {
        this.o = new Object();
        this.p = new HashMap();
        this.q = Collections.emptySet();
        this.r = Collections.emptyList();
    }
    
    public void a(final Object o) {
        final Object o2 = this.o;
        // monitorenter(o2)
        while (true) {
            try {
                final ArrayList<Object> list = new ArrayList<Object>(this.r);
                list.add(o);
                this.r = Collections.unmodifiableList((List<?>)list);
                final Integer n = this.p.get(o);
                if (n == null) {
                    final HashSet<Object> s = new HashSet<Object>(this.q);
                    s.add(o);
                    this.q = Collections.unmodifiableSet((Set<?>)s);
                }
                final Map p = this.p;
                int i = 1;
                if (n != null) {
                    i = 1 + n;
                }
                p.put(o, i);
                // monitorexit(o2)
                return;
                // monitorexit(o2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public int d(final Object o) {
        while (true) {
            final Object o2 = this.o;
            // monitorenter(o2)
            while (true) {
                Label_0052: {
                    while (true) {
                        try {
                            if (this.p.containsKey(o)) {
                                // monitorexit(o2)
                                return this.p.get(o);
                            }
                            break Label_0052;
                            // monitorexit(o2)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final int intValue = 0;
                continue;
            }
        }
    }
    
    public void f(final Object o) {
        final Object o2 = this.o;
        // monitorenter(o2)
        while (true) {
            try {
                final Integer n = this.p.get(o);
                if (n == null) {
                    // monitorexit(o2)
                    return;
                }
                final ArrayList<Object> list = new ArrayList<Object>(this.r);
                list.remove(o);
                this.r = Collections.unmodifiableList((List<?>)list);
                if (n == 1) {
                    this.p.remove(o);
                    final HashSet<Object> s = new HashSet<Object>(this.q);
                    s.remove(o);
                    this.q = Collections.unmodifiableSet((Set<?>)s);
                }
                else {
                    this.p.put(o, n - 1);
                }
                // monitorexit(o2)
                return;
                // monitorexit(o2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public Iterator iterator() {
        synchronized (this.o) {
            return this.r.iterator();
        }
    }
    
    public Set u() {
        synchronized (this.o) {
            return this.q;
        }
    }
}
