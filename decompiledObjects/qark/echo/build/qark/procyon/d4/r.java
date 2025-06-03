// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import Q3.d;
import V3.k;

public abstract class r
{
    public static n a() {
        return g.W();
    }
    
    public static boolean b(final n n) {
        return n.t().isEmpty() && (n.isEmpty() || n instanceof f || n instanceof t || n instanceof e);
    }
    
    public static n c(final k obj, Object o) {
        f a;
        final n n = a = (f)o.a(o);
        if (n instanceof l) {
            a = new f(Double.valueOf((long)n.getValue()), a());
        }
        if (!b(a)) {
            o = new StringBuilder();
            String string;
            if (obj != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Path '");
                sb.append(obj);
                sb.append("'");
                string = sb.toString();
            }
            else {
                string = "Node";
            }
            ((StringBuilder)o).append(string);
            ((StringBuilder)o).append(" contains invalid priority: Must be a string, double, ServerValue, or null");
            throw new d(((StringBuilder)o).toString());
        }
        return a;
    }
    
    public static n d(final Object o) {
        return c(null, o);
    }
}
