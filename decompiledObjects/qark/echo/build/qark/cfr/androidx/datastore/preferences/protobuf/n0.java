/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.m0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.w;

public class n0
extends l0 {
    public m0 A(Object object) {
        return ((w)object).unknownFields;
    }

    public int B(m0 m02) {
        return m02.f();
    }

    public int C(m0 m02) {
        return m02.g();
    }

    public m0 D(m0 m02, m0 m03) {
        if (m03.equals(m0.e())) {
            return m02;
        }
        return m0.k(m02, m03);
    }

    public m0 E() {
        return m0.l();
    }

    public void F(Object object, m0 m02) {
        this.G(object, m02);
    }

    public void G(Object object, m0 m02) {
        ((w)object).unknownFields = m02;
    }

    public m0 H(m0 m02) {
        m02.j();
        return m02;
    }

    public void I(m0 m02, s0 s02) {
        m02.o(s02);
    }

    public void J(m0 m02, s0 s02) {
        m02.q(s02);
    }

    @Override
    public void j(Object object) {
        this.A(object).j();
    }

    @Override
    public boolean q(d0 d02) {
        return false;
    }

    public void u(m0 m02, int n8, int n9) {
        m02.n(r0.c(n8, 5), n9);
    }

    public void v(m0 m02, int n8, long l8) {
        m02.n(r0.c(n8, 1), l8);
    }

    public void w(m0 m02, int n8, m0 m03) {
        m02.n(r0.c(n8, 3), m03);
    }

    public void x(m0 m02, int n8, g g8) {
        m02.n(r0.c(n8, 2), g8);
    }

    public void y(m0 m02, int n8, long l8) {
        m02.n(r0.c(n8, 0), l8);
    }

    public m0 z(Object object) {
        m0 m02;
        m0 m03 = m02 = this.A(object);
        if (m02 == m0.e()) {
            m03 = m0.l();
            this.G(object, m03);
        }
        return m03;
    }
}

