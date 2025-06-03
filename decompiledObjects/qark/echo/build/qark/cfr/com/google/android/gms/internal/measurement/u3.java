/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A3;
import com.google.android.gms.internal.measurement.q3;

public final class u3
extends A3 {
    public final int t;
    public final int u;

    public u3(byte[] arrby, int n8, int n9) {
        super(arrby);
        q3.g(n8, n8 + n9, arrby.length);
        this.t = n8;
        this.u = n9;
    }

    @Override
    public final byte M(int n8) {
        return this.s[this.t + n8];
    }

    @Override
    public final int S() {
        return this.u;
    }

    @Override
    public final int Y() {
        return this.t;
    }

    @Override
    public final byte a(int n8) {
        int n9 = this.S();
        if ((n9 - (n8 + 1) | n8) < 0) {
            if (n8 < 0) {
                StringBuilder stringBuilder = new StringBuilder("Index < 0: ");
                stringBuilder.append(n8);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder("Index > length: ");
            stringBuilder.append(n8);
            stringBuilder.append(", ");
            stringBuilder.append(n9);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        return this.s[this.t + n8];
    }
}

