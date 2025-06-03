// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import V5.n;

public abstract class w
{
    public static final u a(final q0 q0) {
        return new v(q0);
    }
    
    public static final boolean c(final u u, final Object o) {
        final Throwable b = n.b(o);
        if (b == null) {
            return u.n(o);
        }
        return u.l(b);
    }
}
