/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.protobuf;

import com.google.protobuf.g0;
import com.google.protobuf.h0;
import com.google.protobuf.n0;
import com.google.protobuf.r;

public class i0
extends g0 {
    @Override
    public void d(Object object) {
        this.i(object).h();
    }

    public h0 i(Object object) {
        return ((r)object).unknownFields;
    }

    public int j(h0 h02) {
        return h02.d();
    }

    public int k(h0 h02) {
        return h02.e();
    }

    public h0 l(h0 h02, h0 h03) {
        if (h0.c().equals(h03)) {
            return h02;
        }
        if (h0.c().equals(h02)) {
            return h0.j(h02, h03);
        }
        return h02.i(h03);
    }

    public void m(Object object, h0 h02) {
        ((r)object).unknownFields = h02;
    }

    public void n(h0 h02, n0 n02) {
        h02.n(n02);
    }

    public void o(h0 h02, n0 n02) {
        h02.p(n02);
    }
}

