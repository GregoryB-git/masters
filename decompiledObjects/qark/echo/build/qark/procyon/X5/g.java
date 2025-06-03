// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X5;

import kotlin.jvm.internal.Intrinsics;
import g6.p;

public interface g
{
    b b(final c p0);
    
    g k(final g p0);
    
    Object u(final Object p0, final p p1);
    
    g x(final c p0);
    
    public abstract static final class a
    {
        public static g a(final g g, final g g2) {
            Intrinsics.checkNotNullParameter(g2, "context");
            if (g2 == h.o) {
                return g;
            }
            return (g)g2.u(g, g$a$a.o);
        }
    }
    
    public interface b extends g
    {
        b b(final c p0);
        
        c getKey();
        
        public abstract static final class a
        {
            public static Object a(final b b, final Object o, final p p3) {
                Intrinsics.checkNotNullParameter(p3, "operation");
                return p3.invoke(o, b);
            }
            
            public static b b(final b b, final c c) {
                Intrinsics.checkNotNullParameter(c, "key");
                if (Intrinsics.a(b.getKey(), c)) {
                    Intrinsics.c(b, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return b;
                }
                return null;
            }
            
            public static g c(final b b, final c c) {
                Intrinsics.checkNotNullParameter(c, "key");
                Object o = b;
                if (Intrinsics.a(b.getKey(), c)) {
                    o = h.o;
                }
                return (g)o;
            }
            
            public static g d(final b b, final g g) {
                Intrinsics.checkNotNullParameter(g, "context");
                return X5.g.a.a(b, g);
            }
        }
    }
    
    public interface c
    {
    }
}
