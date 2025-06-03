// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import V5.a;
import u6.h;
import X5.g;

public abstract class H
{
    public static final void a(final g g, final Throwable t) {
        Label_0036: {
            try {
                final G g2 = (G)g.b((g.c)G.m);
                if (g2 != null) {
                    g2.h(g, t);
                    return;
                }
            }
            finally {
                break Label_0036;
            }
            h.a(g, t);
            return;
        }
        final Throwable t2;
        h.a(g, b(t, t2));
    }
    
    public static final Throwable b(final Throwable t, final Throwable cause) {
        if (t == cause) {
            return t;
        }
        final RuntimeException ex = new RuntimeException("Exception while trying to handle coroutine exception", cause);
        a.a(ex, t);
        return ex;
    }
}
