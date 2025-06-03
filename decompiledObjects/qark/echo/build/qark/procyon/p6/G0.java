// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import V5.o;
import V5.n;
import V5.t;

public final class G0 extends w0
{
    public final m s;
    
    public G0(final m s) {
        this.s = s;
    }
    
    @Override
    public void v(final Throwable t) {
        final Object b0 = this.w().b0();
        m m;
        Object o2;
        if (b0 instanceof z) {
            m = this.s;
            final n.a o = n.o;
            o2 = V5.o.a(((z)b0).a);
        }
        else {
            m = this.s;
            final n.a o3 = n.o;
            o2 = y0.h(b0);
        }
        m.resumeWith(n.a(o2));
    }
}
