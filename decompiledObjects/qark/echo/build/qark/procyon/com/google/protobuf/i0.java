// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public class i0 extends g0
{
    @Override
    public void d(final Object o) {
        this.i(o).h();
    }
    
    public h0 i(final Object o) {
        return ((r)o).unknownFields;
    }
    
    public int j(final h0 h0) {
        return h0.d();
    }
    
    public int k(final h0 h0) {
        return h0.e();
    }
    
    public h0 l(final h0 h0, final h0 h2) {
        if (h0.c().equals(h2)) {
            return h0;
        }
        if (h0.c().equals(h0)) {
            return h0.j(h0, h2);
        }
        return h0.i(h2);
    }
    
    public void m(final Object o, final h0 unknownFields) {
        ((r)o).unknownFields = unknownFields;
    }
    
    public void n(final h0 h0, final n0 n0) {
        h0.n(n0);
    }
    
    public void o(final h0 h0, final n0 n0) {
        h0.p(n0);
    }
}
