// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

import java.util.List;
import java.util.Comparator;
import java.util.Map;
import java.util.Iterator;

public abstract class c implements Iterable
{
    public abstract c D(final Object p0);
    
    public abstract Iterator P();
    
    public abstract boolean a(final Object p0);
    
    public abstract Object d(final Object p0);
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        if (!this.f().equals(c.f())) {
            return false;
        }
        if (this.size() != c.size()) {
            return false;
        }
        final Iterator iterator = this.iterator();
        final Iterator iterator2 = c.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(iterator2.next())) {
                return false;
            }
        }
        return true;
    }
    
    public abstract Comparator f();
    
    public abstract Object g();
    
    @Override
    public int hashCode() {
        int hashCode = this.f().hashCode();
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            hashCode = hashCode * 31 + iterator.next().hashCode();
        }
        return hashCode;
    }
    
    public abstract Object i();
    
    public abstract boolean isEmpty();
    
    @Override
    public abstract Iterator iterator();
    
    public abstract Object k(final Object p0);
    
    public abstract void q(final h.b p0);
    
    public abstract c s(final Object p0, final Object p1);
    
    public abstract int size();
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        final Iterator iterator = this.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = iterator.next();
            if (n != 0) {
                n = 0;
            }
            else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
    
    public abstract static class a
    {
        public static final c.a.a a;
        
        static {
            a = (c.a.a)new b();
        }
        
        public static c b(final List list, final Map map, final c.a.a a, final Comparator comparator) {
            if (list.size() < 25) {
                return a.U(list, map, a, comparator);
            }
            return k.M(list, map, a, comparator);
        }
        
        public static c c(final Comparator comparator) {
            return new a(comparator);
        }
        
        public static c d(final Map map, final Comparator comparator) {
            if (map.size() < 25) {
                return S3.a.X(map, comparator);
            }
            return k.S(map, comparator);
        }
        
        public static c.a.a e() {
            return c.a.a;
        }
        
        public interface a
        {
            Object a(final Object p0);
        }
    }
}
