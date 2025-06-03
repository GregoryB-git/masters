// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.m;
import java.io.Serializable;

public final class M extends P implements Serializable
{
    public static final M o;
    private static final long serialVersionUID = 0L;
    
    static {
        o = new M();
    }
    
    private Object readResolve() {
        return M.o;
    }
    
    @Override
    public P g() {
        return W.o;
    }
    
    public int h(final Comparable comparable, final Comparable comparable2) {
        m.j(comparable);
        m.j(comparable2);
        return comparable.compareTo(comparable2);
    }
    
    @Override
    public String toString() {
        return "Ordering.natural()";
    }
}
