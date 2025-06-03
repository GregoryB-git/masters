// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import java.util.Iterator;
import V5.a;
import p6.H;
import p6.G;
import X5.g;

public abstract class h
{
    public static final void a(final g g, final Throwable t) {
        for (final G g2 : g.a()) {
            try {
                g2.h(g, t);
            }
            finally {
                final Throwable t2;
                g.b(H.b(t, t2));
            }
        }
        while (true) {
            try {
                a.a(t, new i(g));
                g.b(t);
            }
            finally {
                continue;
            }
            break;
        }
    }
}
