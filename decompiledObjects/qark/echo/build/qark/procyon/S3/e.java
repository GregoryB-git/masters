// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class e implements Iterable
{
    public final c o;
    
    public e(final c o) {
        this.o = o;
    }
    
    public e(final List list, final Comparator comparator) {
        this.o = c.a.b(list, Collections.emptyMap(), c.a.e(), comparator);
    }
    
    public Iterator P() {
        return new a(this.o.P());
    }
    
    public Object a() {
        return this.o.g();
    }
    
    public Object d() {
        return this.o.i();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof e && this.o.equals(((e)o).o));
    }
    
    public Object f(final Object o) {
        return this.o.k(o);
    }
    
    public e g(final Object o) {
        return new e(this.o.s(o, null));
    }
    
    @Override
    public int hashCode() {
        return this.o.hashCode();
    }
    
    public e i(final Object o) {
        final c d = this.o.D(o);
        if (d == this.o) {
            return this;
        }
        return new e(d);
    }
    
    @Override
    public Iterator iterator() {
        return new a(this.o.iterator());
    }
    
    public static class a implements Iterator
    {
        public final Iterator o;
        
        public a(final Iterator o) {
            this.o = o;
        }
        
        @Override
        public boolean hasNext() {
            return this.o.hasNext();
        }
        
        @Override
        public Object next() {
            return this.o.next().getKey();
        }
        
        @Override
        public void remove() {
            this.o.remove();
        }
    }
}
