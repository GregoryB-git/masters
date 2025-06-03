// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public abstract class o
{
    public static n b(final n n, final n n2) {
        return new b(c((n)m.j(n), (n)m.j(n2)), null);
    }
    
    public static List c(final n n, final n n2) {
        return Arrays.asList(n, n2);
    }
    
    public static String d(final String str, final Iterable iterable) {
        final StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        final Iterator<Object> iterator = iterable.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n == 0) {
                sb.append(',');
            }
            sb.append(next);
            n = 0;
        }
        sb.append(')');
        return sb.toString();
    }
    
    public static class b implements n, Serializable
    {
        private static final long serialVersionUID = 0L;
        public final List o;
        
        public b(final List o) {
            this.o = o;
        }
        
        @Override
        public boolean apply(final Object o) {
            for (int i = 0; i < this.o.size(); ++i) {
                if (!((n)this.o.get(i)).apply(o)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof b && this.o.equals(((b)o).o);
        }
        
        @Override
        public int hashCode() {
            return this.o.hashCode() + 306654252;
        }
        
        @Override
        public String toString() {
            return d("and", this.o);
        }
    }
}
