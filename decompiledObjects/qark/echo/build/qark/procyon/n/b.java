// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b implements Iterable
{
    public c o;
    public c p;
    public WeakHashMap q;
    public int r;
    
    public b() {
        this.q = new WeakHashMap();
        this.r = 0;
    }
    
    public Map.Entry a() {
        return this.o;
    }
    
    public c d(final Object obj) {
        c c;
        for (c = this.o; c != null; c = c.q) {
            if (c.o.equals(obj)) {
                return c;
            }
        }
        return c;
    }
    
    public Iterator descendingIterator() {
        final b key = new b(this.p, this.o);
        this.q.put(key, Boolean.FALSE);
        return key;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        if (this.size() != b.size()) {
            return false;
        }
        final Iterator iterator = this.iterator();
        final Iterator iterator2 = b.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            final Map.Entry entry = iterator.next();
            final Object next = iterator2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !iterator.hasNext() && !iterator2.hasNext();
    }
    
    public d f() {
        final d key = new d();
        this.q.put(key, Boolean.FALSE);
        return key;
    }
    
    public Map.Entry g() {
        return this.p;
    }
    
    @Override
    public int hashCode() {
        final Iterator iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().hashCode();
        }
        return n;
    }
    
    public c i(final Object o, final Object o2) {
        final c p2 = new c(o, o2);
        ++this.r;
        final c p3 = this.p;
        if (p3 == null) {
            this.o = p2;
        }
        else {
            p3.q = p2;
            p2.r = p3;
        }
        return this.p = p2;
    }
    
    @Override
    public Iterator iterator() {
        final a key = new a(this.o, this.p);
        this.q.put(key, Boolean.FALSE);
        return key;
    }
    
    public Object k(final Object o, final Object o2) {
        final c d = this.d(o);
        if (d != null) {
            return d.p;
        }
        this.i(o, o2);
        return null;
    }
    
    public Object q(final Object o) {
        final c d = this.d(o);
        if (d == null) {
            return null;
        }
        --this.r;
        if (!this.q.isEmpty()) {
            final Iterator<f> iterator = this.q.keySet().iterator();
            while (iterator.hasNext()) {
                iterator.next().b(d);
            }
        }
        final c r = d.r;
        final c q = d.q;
        if (r != null) {
            r.q = q;
        }
        else {
            this.o = q;
        }
        final c q2 = d.q;
        if (q2 != null) {
            q2.r = r;
        }
        else {
            this.p = r;
        }
        d.q = null;
        d.r = null;
        return d.p;
    }
    
    public int size() {
        return this.r;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().toString());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static class a extends e
    {
        public a(final c c, final c c2) {
            super(c, c2);
        }
        
        @Override
        public c d(final c c) {
            return c.r;
        }
        
        @Override
        public c e(final c c) {
            return c.q;
        }
    }
    
    public static class b extends e
    {
        public b(final c c, final c c2) {
            super(c, c2);
        }
        
        @Override
        public c d(final c c) {
            return c.q;
        }
        
        @Override
        public c e(final c c) {
            return c.r;
        }
    }
    
    public static class c implements Entry
    {
        public final Object o;
        public final Object p;
        public c q;
        public c r;
        
        public c(final Object o, final Object p2) {
            this.o = o;
            this.p = p2;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return this.o.equals(c.o) && this.p.equals(c.p);
        }
        
        @Override
        public Object getKey() {
            return this.o;
        }
        
        @Override
        public Object getValue() {
            return this.p;
        }
        
        @Override
        public int hashCode() {
            return this.o.hashCode() ^ this.p.hashCode();
        }
        
        @Override
        public Object setValue(final Object o) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.o);
            sb.append("=");
            sb.append(this.p);
            return sb.toString();
        }
    }
    
    public class d implements Iterator, f
    {
        public c o;
        public boolean p;
        
        public d() {
            this.p = true;
        }
        
        @Override
        public void b(c r) {
            final c o = this.o;
            if (r == o) {
                r = o.r;
                this.o = r;
                this.p = (r == null);
            }
        }
        
        public Map.Entry d() {
            Map.Entry o;
            if (this.p) {
                this.p = false;
                o = b.this.o;
            }
            else {
                final c o2 = this.o;
                if (o2 != null) {
                    o = o2.q;
                }
                else {
                    o = null;
                }
            }
            return this.o = (c)o;
        }
        
        @Override
        public boolean hasNext() {
            final boolean p = this.p;
            final boolean b = false;
            boolean b2 = false;
            if (p) {
                if (n.b.this.o != null) {
                    b2 = true;
                }
                return b2;
            }
            final c o = this.o;
            boolean b3 = b;
            if (o != null) {
                b3 = b;
                if (o.q != null) {
                    b3 = true;
                }
            }
            return b3;
        }
    }
    
    public abstract static class e implements Iterator, f
    {
        public c o;
        public c p;
        
        public e(final c p2, final c o) {
            this.o = o;
            this.p = p2;
        }
        
        @Override
        public void b(final c c) {
            if (this.o == c && c == this.p) {
                this.p = null;
                this.o = null;
            }
            final c o = this.o;
            if (o == c) {
                this.o = this.d(o);
            }
            if (this.p == c) {
                this.p = this.g();
            }
        }
        
        public abstract c d(final c p0);
        
        public abstract c e(final c p0);
        
        public Map.Entry f() {
            final c p = this.p;
            this.p = this.g();
            return p;
        }
        
        public final c g() {
            final c p = this.p;
            final c o = this.o;
            if (p != o && o != null) {
                return this.e(p);
            }
            return null;
        }
        
        @Override
        public boolean hasNext() {
            return this.p != null;
        }
    }
    
    public interface f
    {
        void b(final c p0);
    }
}
