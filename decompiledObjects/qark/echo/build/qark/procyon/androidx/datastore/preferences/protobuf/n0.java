// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

public class n0 extends l0
{
    public m0 A(final Object o) {
        return ((w)o).unknownFields;
    }
    
    public int B(final m0 m0) {
        return m0.f();
    }
    
    public int C(final m0 m0) {
        return m0.g();
    }
    
    public m0 D(final m0 m0, final m0 m2) {
        if (m2.equals(m0.e())) {
            return m0;
        }
        return m0.k(m0, m2);
    }
    
    public m0 E() {
        return m0.l();
    }
    
    public void F(final Object o, final m0 m0) {
        this.G(o, m0);
    }
    
    public void G(final Object o, final m0 unknownFields) {
        ((w)o).unknownFields = unknownFields;
    }
    
    public m0 H(final m0 m0) {
        m0.j();
        return m0;
    }
    
    public void I(final m0 m0, final s0 s0) {
        m0.o(s0);
    }
    
    public void J(final m0 m0, final s0 s0) {
        m0.q(s0);
    }
    
    @Override
    public void j(final Object o) {
        this.A(o).j();
    }
    
    @Override
    public boolean q(final d0 d0) {
        return false;
    }
    
    public void u(final m0 m0, final int n, final int i) {
        m0.n(r0.c(n, 5), i);
    }
    
    public void v(final m0 m0, final int n, final long l) {
        m0.n(r0.c(n, 1), l);
    }
    
    public void w(final m0 m0, final int n, final m0 m2) {
        m0.n(r0.c(n, 3), m2);
    }
    
    public void x(final m0 m0, final int n, final g g) {
        m0.n(r0.c(n, 2), g);
    }
    
    public void y(final m0 m0, final int n, final long l) {
        m0.n(r0.c(n, 0), l);
    }
    
    public m0 z(final Object o) {
        m0 m0;
        if ((m0 = this.A(o)) == androidx.datastore.preferences.protobuf.m0.e()) {
            m0 = androidx.datastore.preferences.protobuf.m0.l();
            this.G(o, m0);
        }
        return m0;
    }
}
