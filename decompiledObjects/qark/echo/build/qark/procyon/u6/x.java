// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import V5.a;
import p6.H;
import V5.t;
import X5.g;
import g6.l;

public abstract class x
{
    public static final l a(final l l, final Object o, final g g) {
        return new l() {
            public final void a(final Throwable t) {
                x.b(l, o, g);
            }
        };
    }
    
    public static final void b(final l l, final Object o, final g g) {
        final O c = c(l, o, null);
        if (c != null) {
            H.a(g, c);
        }
    }
    
    public static final O c(final l l, final Object obj, final O o) {
        try {
            l.invoke(obj);
            return o;
        }
        finally {
            final Throwable t;
            if (o != null && o.getCause() != t) {
                a.a(o, t);
                return o;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in undelivered element handler for ");
            sb.append(obj);
            return new O(sb.toString(), t);
        }
    }
}
