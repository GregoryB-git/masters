/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.measurement;

import A2.n;
import P2.a;
import R2.m4;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;

public final class b
extends AppMeasurement.a {
    public final m4 a;

    public b(m4 m42) {
        super(null);
        n.i(m42);
        this.a = m42;
    }

    @Override
    public final long a() {
        return this.a.a();
    }

    @Override
    public final List c(String string2, String string3) {
        return this.a.c(string2, string3);
    }

    @Override
    public final String g() {
        return this.a.g();
    }

    @Override
    public final String h() {
        return this.a.h();
    }

    @Override
    public final int i(String string2) {
        return this.a.i(string2);
    }

    @Override
    public final String k() {
        return this.a.k();
    }

    @Override
    public final void l(Bundle bundle) {
        this.a.l(bundle);
    }

    @Override
    public final String m() {
        return this.a.m();
    }

    @Override
    public final void q(String string2) {
        this.a.q(string2);
    }

    @Override
    public final void r(String string2, String string3, Bundle bundle) {
        this.a.r(string2, string3, bundle);
    }

    @Override
    public final void s(String string2) {
        this.a.s(string2);
    }

    @Override
    public final Map t(String string2, String string3, boolean bl) {
        return this.a.t(string2, string3, bl);
    }

    @Override
    public final void u(String string2, String string3, Bundle bundle) {
        this.a.u(string2, string3, bundle);
    }
}

