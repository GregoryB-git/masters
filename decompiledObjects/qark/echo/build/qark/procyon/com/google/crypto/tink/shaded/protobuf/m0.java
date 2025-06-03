// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public class m0 extends k0
{
    public l0 A(final Object o) {
        return ((x)o).unknownFields;
    }
    
    public int B(final l0 l0) {
        return l0.d();
    }
    
    public int C(final l0 l0) {
        return l0.e();
    }
    
    public l0 D(final l0 l0, final l0 l2) {
        if (l0.c().equals(l2)) {
            return l0;
        }
        if (l0.c().equals(l0)) {
            return l0.j(l0, l2);
        }
        return l0.i(l2);
    }
    
    public l0 E() {
        return l0.k();
    }
    
    public void F(final Object o, final l0 l0) {
        this.G(o, l0);
    }
    
    public void G(final Object o, final l0 unknownFields) {
        ((x)o).unknownFields = unknownFields;
    }
    
    public l0 H(final l0 l0) {
        l0.h();
        return l0;
    }
    
    public void I(final l0 l0, final r0 r0) {
        l0.p(r0);
    }
    
    public void J(final l0 l0, final r0 r0) {
        l0.r(r0);
    }
    
    @Override
    public void j(final Object o) {
        this.A(o).h();
    }
    
    @Override
    public boolean q(final d0 d0) {
        return false;
    }
    
    public void u(final l0 l0, final int n, final int i) {
        l0.n(q0.c(n, 5), i);
    }
    
    public void v(final l0 l0, final int n, final long i) {
        l0.n(q0.c(n, 1), i);
    }
    
    public void w(final l0 l0, final int n, final l0 l2) {
        l0.n(q0.c(n, 3), l2);
    }
    
    public void x(final l0 l0, final int n, final h h) {
        l0.n(q0.c(n, 2), h);
    }
    
    public void y(final l0 l0, final int n, final long i) {
        l0.n(q0.c(n, 0), i);
    }
    
    public l0 z(final Object o) {
        l0 l0;
        if ((l0 = this.A(o)) == com.google.crypto.tink.shaded.protobuf.l0.c()) {
            l0 = com.google.crypto.tink.shaded.protobuf.l0.k();
            this.G(o, l0);
        }
        return l0;
    }
}
