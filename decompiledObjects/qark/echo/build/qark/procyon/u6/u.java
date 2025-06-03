// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import java.util.List;
import java.util.Iterator;
import n6.c;
import java.util.ServiceLoader;
import p6.B0;

public final class u
{
    public static final u a;
    public static final B0 b;
    
    static {
        final u u = a = new u();
        G.f("kotlinx.coroutines.fast.service.loader", true);
        b = u.a();
    }
    
    public final B0 a() {
        while (true) {
            try {
                final List e = c.e(c.a(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
                final Iterator<Object> iterator = ((List<Object>)e).iterator();
                t next;
                if (!iterator.hasNext()) {
                    next = null;
                }
                else {
                    next = iterator.next();
                    if (iterator.hasNext()) {
                        int c = next.c();
                        t t = next;
                        do {
                            final t next2 = iterator.next();
                            final int c2 = next2.c();
                            next = t;
                            int n;
                            if ((n = c) < c2) {
                                next = next2;
                                n = c2;
                            }
                            t = next;
                            c = n;
                        } while (iterator.hasNext());
                    }
                }
                final t t2 = next;
                B0 b0;
                if (t2 == null || (b0 = v.e(t2, e)) == null) {
                    return v.b(null, null, 3, null);
                }
                return b0;
                final Throwable t3;
                b0 = v.b(t3, null, 2, null);
                return b0;
            }
            finally {}
            final Throwable t4;
            final Throwable t3 = t4;
            continue;
        }
    }
}
