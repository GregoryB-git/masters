// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w6;

import u6.n;
import X5.g;
import p6.F;

public final class m extends F
{
    public static final m q;
    
    static {
        q = new m();
    }
    
    @Override
    public void E(final g g, final Runnable runnable) {
        c.w.I(runnable, l.h, false);
    }
    
    @Override
    public F G(final int n) {
        n.a(n);
        if (n >= l.d) {
            return this;
        }
        return super.G(n);
    }
}
