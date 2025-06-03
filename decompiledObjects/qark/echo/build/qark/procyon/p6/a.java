// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import g6.l;
import g6.p;
import X5.g;
import X5.d;

public abstract class a extends x0 implements q0, d, I
{
    public final g q;
    
    public a(final g g, final boolean b, final boolean b2) {
        super(b2);
        if (b) {
            this.e0((q0)g.b((g.c)q0.n));
        }
        this.q = g.k(this);
    }
    
    public void G0(final Object o) {
        this.F(o);
    }
    
    public void H0(final Throwable t, final boolean b) {
    }
    
    public void I0(final Object o) {
    }
    
    public final void J0(final K k, final Object o, final p p3) {
        k.e(p3, o, this);
    }
    
    @Override
    public String N() {
        final StringBuilder sb = new StringBuilder();
        sb.append(M.a(this));
        sb.append(" was cancelled");
        return sb.toString();
    }
    
    @Override
    public boolean a() {
        return super.a();
    }
    
    @Override
    public final void d0(final Throwable t) {
        H.a(this.q, t);
    }
    
    @Override
    public g f() {
        return this.q;
    }
    
    @Override
    public final g getContext() {
        return this.q;
    }
    
    @Override
    public String l0() {
        final String b = E.b(this.q);
        if (b == null) {
            return super.l0();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(b);
        sb.append("\":");
        sb.append(super.l0());
        return sb.toString();
    }
    
    @Override
    public final void q0(final Object o) {
        if (o instanceof z) {
            final z z = (z)o;
            this.H0(z.a, z.a());
            return;
        }
        this.I0(o);
    }
    
    @Override
    public final void resumeWith(Object j0) {
        j0 = this.j0(D.d(j0, null, 1, null));
        if (j0 == y0.b) {
            return;
        }
        this.G0(j0);
    }
}
