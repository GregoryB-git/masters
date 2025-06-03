// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

public abstract class f implements H
{
    public transient Set o;
    public transient Collection p;
    public transient Map q;
    
    @Override
    public Map a() {
        Map q;
        if ((q = this.q) == null) {
            q = this.c();
            this.q = q;
        }
        return q;
    }
    
    public boolean b(final Object o) {
        final Iterator<Collection> iterator = this.a().values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains(o)) {
                return true;
            }
        }
        return false;
    }
    
    public abstract Map c();
    
    public abstract Set d();
    
    public abstract Collection e();
    
    @Override
    public boolean equals(final Object o) {
        return K.a(this, o);
    }
    
    public Set f() {
        Set o;
        if ((o = this.o) == null) {
            o = this.d();
            this.o = o;
        }
        return o;
    }
    
    public abstract Iterator g();
    
    @Override
    public int hashCode() {
        return this.a().hashCode();
    }
    
    @Override
    public String toString() {
        return this.a().toString();
    }
    
    @Override
    public Collection values() {
        Collection p;
        if ((p = this.p) == null) {
            p = this.e();
            this.p = p;
        }
        return p;
    }
    
    public class a extends AbstractCollection
    {
        @Override
        public void clear() {
            f.this.clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            return f.this.b(o);
        }
        
        @Override
        public Iterator iterator() {
            return f.this.g();
        }
        
        @Override
        public int size() {
            return f.this.size();
        }
    }
}
