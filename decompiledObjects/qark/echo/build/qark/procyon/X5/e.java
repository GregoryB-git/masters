// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X5;

import kotlin.jvm.internal.Intrinsics;

public interface e extends g.b
{
    public static final b c = b.o;
    
    void C(final d p0);
    
    d i(final d p0);
    
    public abstract static final class a
    {
        public static g.b a(final e e, final c c) {
            Intrinsics.checkNotNullParameter(c, "key");
            final boolean b = c instanceof X5.b;
            final g.b b2 = null;
            if (b) {
                final X5.b b3 = (X5.b)c;
                g.b b4 = b2;
                if (b3.a(((g.b)e).getKey())) {
                    final g.b b5 = b3.b(e);
                    b4 = b2;
                    if (b5 instanceof g.b) {
                        b4 = b5;
                    }
                }
                return b4;
            }
            if (e.c == c) {
                Intrinsics.c(e, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return e;
            }
            return null;
        }
        
        public static g b(e o, final c c) {
            Intrinsics.checkNotNullParameter(c, "key");
            if (c instanceof X5.b) {
                final X5.b b = (X5.b)c;
                Object o2 = o;
                if (b.a(((g.b)o).getKey())) {
                    o2 = o;
                    if (b.b(o) != null) {
                        o2 = h.o;
                    }
                }
                return (g)o2;
            }
            if (e.c == c) {
                o = (e)h.o;
            }
            return o;
        }
    }
    
    public static final class b implements c
    {
        public static final /* synthetic */ b o;
        
        static {
            o = new b();
        }
    }
}
