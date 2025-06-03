// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import X5.g.b;
import g6.p;
import java.util.concurrent.CancellationException;
import g6.l;
import X5.g;

public interface q0 extends g.b
{
    public static final b n = b.o;
    
    boolean a();
    
    X e(final l p0);
    
    q0 getParent();
    
    r r(final t p0);
    
    CancellationException s();
    
    boolean start();
    
    X v(final boolean p0, final boolean p1, final l p2);
    
    void w(final CancellationException p0);
    
    public abstract static final class a
    {
        public static Object b(final q0 q0, final Object o, final p p3) {
            return g.b.a.a((g.b)q0, o, p3);
        }
        
        public static g.b c(final q0 q0, final c c) {
            return g.b.a.b((g.b)q0, c);
        }
        
        public static g e(final q0 q0, final c c) {
            return g.b.a.c((g.b)q0, c);
        }
        
        public static g f(final q0 q0, final g g) {
            return X5.g.b.a.d((g.b)q0, g);
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
