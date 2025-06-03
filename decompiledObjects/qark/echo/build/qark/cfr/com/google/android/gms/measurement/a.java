/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.measurement;

import A2.n;
import E2.e;
import R2.B;
import R2.C3;
import R2.N2;
import R2.S5;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a
extends AppMeasurement.a {
    public final N2 a;
    public final C3 b;

    public a(N2 n22) {
        super(null);
        n.i(n22);
        this.a = n22;
        this.b = n22.H();
    }

    @Override
    public final long a() {
        return this.a.L().P0();
    }

    @Override
    public final List c(String string2, String string3) {
        return this.b.C(string2, string3);
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
    public final int i(String string2) {
        n.e(string2);
        return 25;
    }

    @Override
    public final String k() {
        return this.b.k0();
    }

    @Override
    public final void l(Bundle bundle) {
        this.b.w0(bundle);
    }

    @Override
    public final String m() {
        return this.b.j0();
    }

    @Override
    public final void q(String string2) {
        this.a.y().D(string2, this.a.b().b());
    }

    @Override
    public final void r(String string2, String string3, Bundle bundle) {
        this.a.H().X(string2, string3, bundle);
    }

    @Override
    public final void s(String string2) {
        this.a.y().z(string2, this.a.b().b());
    }

    @Override
    public final Map t(String string2, String string3, boolean bl) {
        return this.b.D(string2, string3, bl);
    }

    @Override
    public final void u(String string2, String string3, Bundle bundle) {
        this.b.y0(string2, string3, bundle);
    }
}

