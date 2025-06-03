// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n5;

import java.util.ListIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.LinkedList;

public class s implements q
{
    public final String a;
    public final int b;
    public final int c;
    public final LinkedList d;
    public final Set e;
    public final Set f;
    public final Map g;
    
    public s(final String a, final int b, final int c) {
        this.d = new LinkedList();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashMap();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a() {
        // monitorenter(this)
        while (true) {
            try {
                final Iterator<o> iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    iterator.next().f();
                }
                final Iterator<o> iterator2 = this.f.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().f();
                }
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
    public void c(final m e) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0060: {
            try {
                this.d.add(e);
                final Iterator<o> iterator = new HashSet<o>(this.e).iterator();
                while (iterator.hasNext()) {
                    this.i(iterator.next());
                }
            }
            finally {
                break Label_0060;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public o e(final String s, final int n) {
        return new o(s, n);
    }
    
    public final m f(final o o) {
    Label_0066_Outer:
        while (true) {
            // monitorenter(this)
            while (true) {
                while (true) {
                    Object o2 = null;
                    final Throwable t;
                    Label_0090: {
                        while (true) {
                            try {
                                final ListIterator listIterator = this.d.listIterator();
                                final boolean hasNext = listIterator.hasNext();
                                o2 = null;
                                if (!hasNext) {
                                    // monitorexit(this)
                                    return null;
                                }
                                final m m = listIterator.next();
                                if (m.a() != null) {
                                    o2 = this.g.get(m.a());
                                }
                                break Label_0090;
                                // monitorexit(this)
                                throw t;
                                listIterator.remove();
                                // monitorexit(this)
                                return m;
                            }
                            finally {
                                continue Label_0066_Outer;
                            }
                            break;
                        }
                    }
                    if (o2 != null && o2 != t) {
                        continue Label_0066_Outer;
                    }
                    break;
                }
                continue;
            }
        }
    }
    
    public final void h(final o o) {
        // monitorenter(this)
        while (true) {
            try {
                final HashSet<o> set = (HashSet<o>)new HashSet<Object>(this.e);
                this.f.remove(o);
                this.e.add(o);
                if (!o.b() && o.d() != null) {
                    this.g.remove(o.d());
                }
                this.i(o);
                final Iterator<Object> iterator = set.iterator();
                while (iterator.hasNext()) {
                    this.i(iterator.next());
                }
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
    
    public final void i(final o o) {
        // monitorenter(this)
        while (true) {
            try {
                final m f = this.f(o);
                if (f != null) {
                    this.f.add(o);
                    this.e.remove(o);
                    if (f.a() != null) {
                        this.g.put(f.a(), o);
                    }
                    o.e(f);
                }
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
    public void start() {
        // monitorenter(this)
        int i = 0;
        // monitorexit(this)
        Label_0086: {
            try {
                while (i < this.b) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.a);
                    sb.append(i);
                    final o e = this.e(sb.toString(), this.c);
                    e.g(new r(this, e));
                    this.e.add(e);
                    ++i;
                }
            }
            finally {
                break Label_0086;
            }
            return;
        }
    }
    // monitorexit(this)
}
