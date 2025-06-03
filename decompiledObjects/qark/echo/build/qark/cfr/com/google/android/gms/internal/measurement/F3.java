/*
 * Decompiled with CFR 0_124.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.G3;
import com.google.android.gms.internal.measurement.H3;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.k4;

public final class F3
extends G3 {
    public final byte[] e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public F3(byte[] arrby, int n8, int n9, boolean bl) {
        super(null);
        this.e = arrby;
        this.g = n9 + n8;
        this.i = n8;
        this.j = n8;
        this.f = bl;
    }

    public /* synthetic */ F3(byte[] arrby, int n8, int n9, boolean bl, I3 i32) {
        this(arrby, 0, n9, false);
    }

    @Override
    public final int a(int n8) {
        if (n8 >= 0) {
            if ((n8 += this.d()) >= 0) {
                int n9 = this.k;
                if (n8 <= n9) {
                    this.k = n8;
                    this.f();
                    return n9;
                }
                throw k4.f();
            }
            throw k4.e();
        }
        throw k4.d();
    }

    @Override
    public final int d() {
        return this.i - this.j;
    }

    public final void f() {
        int n8;
        this.g = n8 = this.g + this.h;
        int n9 = n8 - this.j;
        int n10 = this.k;
        if (n9 > n10) {
            this.h = n9 -= n10;
            this.g = n8 - n9;
            return;
        }
        this.h = 0;
    }
}

