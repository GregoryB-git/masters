// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.m;
import java.io.Serializable;

public final class W extends P implements Serializable
{
    public static final W o;
    private static final long serialVersionUID = 0L;
    
    static {
        o = new W();
    }
    
    private Object readResolve() {
        return W.o;
    }
    
    @Override
    public P g() {
        return P.d();
    }
    
    public int h(final Comparable comparable, final Comparable comparable2) {
        m.j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }
    
    @Override
    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
