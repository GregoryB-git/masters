// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.measurement;

import java.util.Map;
import android.os.Bundle;
import java.util.List;
import A2.n;
import R2.C3;
import R2.N2;

public final class a extends AppMeasurement.a
{
    public final N2 a;
    public final C3 b;
    
    public a(final N2 a) {
        super(null);
        n.i(a);
        this.a = a;
        this.b = a.H();
    }
    
    @Override
    public final long a() {
        return this.a.L().P0();
    }
    
    @Override
    public final List c(final String s, final String s2) {
        return this.b.C(s, s2);
    }
    
    @Override
    public final String g() {
        return this.b.i0();
    }
    
    @Override
    public final String h() {
        return this.b.i0();
    }
    
    @Override
    public final int i(final String s) {
        n.e(s);
        return 25;
    }
    
    @Override
    public final String k() {
        return this.b.k0();
    }
    
    @Override
    public final void l(final Bundle bundle) {
        this.b.w0(bundle);
    }
    
    @Override
    public final String m() {
        return this.b.j0();
    }
    
    @Override
    public final void q(final String s) {
        this.a.y().D(s, this.a.b().b());
    }
    
    @Override
    public final void r(final String s, final String s2, final Bundle bundle) {
        this.a.H().X(s, s2, bundle);
    }
    
    @Override
    public final void s(final String s) {
        this.a.y().z(s, this.a.b().b());
    }
    
    @Override
    public final Map t(final String s, final String s2, final boolean b) {
        return this.b.D(s, s2, b);
    }
    
    @Override
    public final void u(final String s, final String s2, final Bundle bundle) {
        this.b.y0(s, s2, bundle);
    }
}
