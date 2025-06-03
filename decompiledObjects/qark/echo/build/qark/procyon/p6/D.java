// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import kotlin.jvm.internal.g;
import g6.l;
import V5.o;
import V5.n;
import X5.d;

public abstract class D
{
    public static final Object a(final Object o, final d d) {
        Object a = o;
        if (o instanceof z) {
            final n.a o2 = n.o;
            a = o.a(((z)o).a);
        }
        return n.a(a);
    }
    
    public static final Object b(final Object o, final l l) {
        final Throwable b = n.b(o);
        Object o2;
        if (b == null) {
            o2 = o;
            if (l != null) {
                return new A(o, l);
            }
        }
        else {
            o2 = new z(b, false, 2, null);
        }
        return o2;
    }
    
    public static final Object c(final Object o, final p6.l l) {
        final Throwable b = n.b(o);
        if (b == null) {
            return o;
        }
        return new z(b, false, 2, null);
    }
}
