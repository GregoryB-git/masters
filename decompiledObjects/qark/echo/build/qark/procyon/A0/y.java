// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A0;

import d0.I;
import x0.x;
import g0.o;
import d0.J;
import y0.n;
import y0.e;
import d0.q;
import java.util.List;

public interface y extends B
{
    void g();
    
    void h(final boolean p0);
    
    boolean i(final int p0, final long p1);
    
    void j();
    
    int k(final long p0, final List p1);
    
    int l();
    
    q m();
    
    int n();
    
    int o();
    
    boolean p(final int p0, final long p1);
    
    boolean q(final long p0, final e p1, final List p2);
    
    void r(final float p0);
    
    Object s();
    
    void t();
    
    void u();
    
    void v(final long p0, final long p1, final long p2, final List p3, final n[] p4);
    
    public static final class a
    {
        public final J a;
        public final int[] b;
        public final int c;
        
        public a(final J j, final int... array) {
            this(j, array, 0);
        }
        
        public a(final J a, final int[] b, final int c) {
            if (b.length == 0) {
                o.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public interface b
    {
        y[] a(final a[] p0, final B0.e p1, final x.b p2, final I p3);
    }
}
