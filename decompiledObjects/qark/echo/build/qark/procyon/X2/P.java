// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.g;
import java.util.Comparator;

public abstract class P implements Comparator
{
    public static P b(final Comparator comparator) {
        if (comparator instanceof P) {
            return (P)comparator;
        }
        return new m(comparator);
    }
    
    public static P d() {
        return M.o;
    }
    
    public P a(final Comparator comparator) {
        return new o(this, (Comparator)W2.m.j(comparator));
    }
    
    public v c(final Iterable iterable) {
        return v.g0(this, iterable);
    }
    
    @Override
    public abstract int compare(final Object p0, final Object p1);
    
    public P e() {
        return this.f(G.e());
    }
    
    public P f(final g g) {
        return new h(g, this);
    }
    
    public P g() {
        return new X(this);
    }
}
