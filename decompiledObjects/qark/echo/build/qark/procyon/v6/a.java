// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v6;

import g6.p;
import g6.l;
import u6.k;
import V5.t;
import Y5.b;
import V5.o;
import V5.n;
import X5.d;

public abstract class a
{
    public static final void a(final d d, final Throwable t) {
        final n.a o = n.o;
        d.resumeWith(n.a(V5.o.a(t)));
        throw t;
    }
    
    public static final void b(d b, final d d) {
        try {
            b = b.b(b);
            final n.a o = n.o;
            k.c(b, n.a(t.a), null, 2, null);
        }
        finally {
            final Throwable t;
            a(d, t);
        }
    }
    
    public static final void c(final p p4, final Object o, final d d, final l l) {
        try {
            final d b = Y5.b.b(Y5.b.a(p4, o, d));
            final n.a o2 = n.o;
            k.b(b, n.a(t.a), l);
        }
        finally {
            final Throwable t;
            a(d, t);
        }
    }
}
