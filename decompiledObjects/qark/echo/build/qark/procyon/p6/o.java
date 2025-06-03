// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import u6.j;
import X5.d;

public abstract class o
{
    public static final void a(final l l, final X x) {
        l.d(new Y(x));
    }
    
    public static final m b(final d d) {
        if (!(d instanceof j)) {
            return new m(d, 1);
        }
        m l = ((j)d).l();
        if (l != null) {
            if (!l.J()) {
                l = null;
            }
            if (l != null) {
                return l;
            }
        }
        return new m(d, 2);
    }
}
