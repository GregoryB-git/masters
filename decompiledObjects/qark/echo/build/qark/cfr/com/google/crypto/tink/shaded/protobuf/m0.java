/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.x;

public class m0
extends k0 {
    public l0 A(Object object) {
        return ((x)object).unknownFields;
    }

    public int B(l0 l02) {
        return l02.d();
    }

    public int C(l0 l02) {
        return l02.e();
    }

    public l0 D(l0 l02, l0 l03) {
        if (l0.c().equals(l03)) {
            return l02;
        }
        if (l0.c().equals(l02)) {
            return l0.j(l02, l03);
        }
        return l02.i(l03);
    }

    public l0 E() {
        return l0.k();
    }

    public void F(Object object, l0 l02) {
        this.G(object, l02);
    }

    public void G(Object object, l0 l02) {
        ((x)object).unknownFields = l02;
    }

    public l0 H(l0 l02) {
        l02.h();
        return l02;
    }

    public void I(l0 l02, r0 r02) {
        l02.p(r02);
    }

    public void J(l0 l02, r0 r02) {
        l02.r(r02);
    }

    @Override
    public void j(Object object) {
        this.A(object).h();
    }

    @Override
    public boolean q(d0 d02) {
        return false;
    }

    public void u(l0 l02, int n8, int n9) {
        l02.n(q0.c(n8, 5), n9);
    }

    public void v(l0 l02, int n8, long l8) {
        l02.n(q0.c(n8, 1), l8);
    }

    public void w(l0 l02, int n8, l0 l03) {
        l02.n(q0.c(n8, 3), l03);
    }

    public void x(l0 l02, int n8, h h8) {
        l02.n(q0.c(n8, 2), h8);
    }

    public void y(l0 l02, int n8, long l8) {
        l02.n(q0.c(n8, 0), l8);
    }

    public l0 z(Object object) {
        l0 l02;
        l0 l03 = l02 = this.A(object);
        if (l02 == l0.c()) {
            l03 = l0.k();
            this.G(object, l03);
        }
        return l03;
    }
}

