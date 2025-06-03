// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class k extends c
{
    public h o;
    public Comparator p;
    
    public k(final h o, final Comparator p2) {
        this.o = o;
        this.p = p2;
    }
    
    public static k M(final List list, final Map map, final c.a.a a, final Comparator comparator) {
        return b.b(list, map, a, comparator);
    }
    
    public static k S(final Map map, final Comparator comparator) {
        return b.b(new ArrayList(map.keySet()), map, c.a.e(), comparator);
    }
    
    @Override
    public c D(final Object o) {
        if (!this.a(o)) {
            return this;
        }
        return new k(this.o.g(o, this.p).c(null, null, h.a.p, null, null), this.p);
    }
    
    @Override
    public Iterator P() {
        return new d(this.o, null, this.p, true);
    }
    
    public final h T(final Object o) {
        h h = this.o;
        while (!h.isEmpty()) {
            final int compare = this.p.compare(o, h.getKey());
            if (compare < 0) {
                h = h.a();
            }
            else {
                if (compare == 0) {
                    return h;
                }
                h = h.f();
            }
        }
        return null;
    }
    
    @Override
    public boolean a(final Object o) {
        return this.T(o) != null;
    }
    
    @Override
    public Object d(final Object o) {
        final h t = this.T(o);
        if (t != null) {
            return t.getValue();
        }
        return null;
    }
    
    @Override
    public Comparator f() {
        return this.p;
    }
    
    @Override
    public Object g() {
        return this.o.i().getKey();
    }
    
    @Override
    public Object i() {
        return this.o.h().getKey();
    }
    
    @Override
    public boolean isEmpty() {
        return this.o.isEmpty();
    }
    
    @Override
    public Iterator iterator() {
        return new d(this.o, null, this.p, false);
    }
    
    @Override
    public Object k(final Object obj) {
        h h = this.o;
        h h2 = null;
        while (!h.isEmpty()) {
            final int compare = this.p.compare(obj, h.getKey());
            if (compare == 0) {
                if (!h.a().isEmpty()) {
                    h h3;
                    for (h3 = h.a(); !h3.f().isEmpty(); h3 = h3.f()) {}
                    return h3.getKey();
                }
                if (h2 != null) {
                    return h2.getKey();
                }
                return null;
            }
            else if (compare < 0) {
                h = h.a();
            }
            else {
                final h f = h.f();
                h2 = h;
                h = f;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Couldn't find predecessor key of non-present key: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public void q(final h.b b) {
        this.o.e(b);
    }
    
    @Override
    public c s(final Object o, final Object o2) {
        return new k(this.o.b(o, o2, this.p).c(null, null, h.a.p, null, null), this.p);
    }
    
    @Override
    public int size() {
        return this.o.size();
    }
    
    public static class b
    {
        public final List a;
        public final Map b;
        public final c.a.a c;
        public j d;
        public j e;
        
        public b(final List a, final Map b, final c.a.a c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static k b(final List list, final Map map, final c.a.a a, final Comparator c) {
            final k.b b = new k.b(list, map, a);
            Collections.sort((List<Object>)list, c);
            final Iterator iterator = new a(list.size()).iterator();
            int size = list.size();
            while (iterator.hasNext()) {
                final k.b.b b2 = iterator.next();
                final int b3 = b2.b;
                size -= b3;
                if (b2.a) {
                    b.c(h.a.p, b3, size);
                }
                else {
                    b.c(h.a.p, b3, size);
                    final int b4 = b2.b;
                    size -= b4;
                    b.c(h.a.o, b4, size);
                }
            }
            h h;
            if ((h = b.d) == null) {
                h = g.j();
            }
            return new k(h, c, null);
        }
        
        public final h a(final int n, int n2) {
            if (n2 == 0) {
                return g.j();
            }
            if (n2 == 1) {
                final Object value = this.a.get(n);
                return new f(value, this.d(value), null, null);
            }
            n2 /= 2;
            final int n3 = n + n2;
            final h a = this.a(n, n2);
            final h a2 = this.a(n3 + 1, n2);
            final Object value2 = this.a.get(n3);
            return new f(value2, this.d(value2), a, a2);
        }
        
        public final void c(final h.a a, final int n, final int n2) {
            final h a2 = this.a(n2 + 1, n - 1);
            final Object value = this.a.get(n2);
            j j;
            if (a == h.a.o) {
                j = new i(value, this.d(value), null, a2);
            }
            else {
                j = new f(value, this.d(value), null, a2);
            }
            if (this.d == null) {
                this.d = j;
            }
            else {
                this.e.u(j);
            }
            this.e = j;
        }
        
        public final Object d(final Object o) {
            return this.b.get(this.c.a(o));
        }
        
        public static class a implements Iterable
        {
            public long o;
            public final int p;
            
            public a(int n) {
                ++n;
                final int p = (int)Math.floor(Math.log(n) / Math.log(2.0));
                this.p = p;
                this.o = ((long)Math.pow(2.0, p) - 1L & (long)n);
            }
            
            public static /* synthetic */ int a(final a a) {
                return a.p;
            }
            
            public static /* synthetic */ long d(final a a) {
                return a.o;
            }
            
            @Override
            public Iterator iterator() {
                return new Iterator() {
                    public int o = a.a(a.this) - 1;
                    
                    public k.b.b b() {
                        final long d = a.d(a.this);
                        final long n = 1 << this.o;
                        final k.b.b b = new k.b.b();
                        b.a = ((d & n) == 0x0L);
                        b.b = (int)Math.pow(2.0, this.o);
                        --this.o;
                        return b;
                    }
                    
                    @Override
                    public boolean hasNext() {
                        return this.o >= 0;
                    }
                    
                    @Override
                    public void remove() {
                    }
                };
            }
        }
        
        public static class b
        {
            public boolean a;
            public int b;
        }
    }
}
