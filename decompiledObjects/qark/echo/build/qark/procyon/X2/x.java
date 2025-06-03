// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.Map;
import java.io.Serializable;

public abstract class x extends g implements Serializable
{
    private static final long serialVersionUID = 0L;
    public final transient w r;
    public final transient int s;
    
    public x(final w r, final int s) {
        this.r = r;
        this.s = s;
    }
    
    @Override
    public boolean b(final Object o) {
        return o != null && super.b(o);
    }
    
    @Override
    public Map c() {
        throw new AssertionError((Object)"should never be called");
    }
    
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Set d() {
        throw new AssertionError((Object)"unreachable");
    }
    
    public w h() {
        return this.r;
    }
    
    public t i() {
        return new d(this);
    }
    
    public g0 j() {
        return new g0() {
            public Iterator o = x.this.r.k().q();
            public Iterator p = C.f();
            
            @Override
            public boolean hasNext() {
                return this.p.hasNext() || this.o.hasNext();
            }
            
            @Override
            public Object next() {
                if (!this.p.hasNext()) {
                    this.p = this.o.next().q();
                }
                return this.p.next();
            }
        };
    }
    
    public t k() {
        return (t)super.values();
    }
    
    @Override
    public final boolean put(final Object o, final Object o2) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public int size() {
        return this.s;
    }
    
    public abstract static class b
    {
        public final Map a;
        public Comparator b;
        public Comparator c;
        
        public b() {
            this.a = Q.c();
        }
    }
    
    public abstract static class c
    {
        public static final Y.b a;
        public static final Y.b b;
        
        static {
            a = Y.a(x.class, "map");
            b = Y.a(x.class, "size");
        }
    }
    
    public static final class d extends t
    {
        private static final long serialVersionUID = 0L;
        public final transient x p;
        
        public d(final x p) {
            this.p = p;
        }
        
        @Override
        public boolean contains(final Object o) {
            return this.p.b(o);
        }
        
        @Override
        public int d(final Object[] array, int d) {
            final g0 q = this.p.r.k().q();
            while (q.hasNext()) {
                d = q.next().d(array, d);
            }
            return d;
        }
        
        @Override
        public g0 q() {
            return this.p.j();
        }
        
        @Override
        public int size() {
            return this.p.size();
        }
        
        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }
}
