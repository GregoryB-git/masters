/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.B3;
import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.r3;
import com.google.android.gms.internal.measurement.u3;
import java.nio.charset.Charset;

public class A3
extends B3 {
    public final byte[] s;

    public A3(byte[] arrby) {
        arrby.getClass();
        this.s = arrby;
    }

    @Override
    public final void D(r3 r32) {
        r32.a(this.s, this.Y(), this.S());
    }

    @Override
    public byte M(int n8) {
        return this.s[n8];
    }

    @Override
    public int S() {
        return this.s.length;
    }

    @Override
    public final int T(int n8, int n9, int n10) {
        return a4.a(n8, this.s, this.Y(), n10);
    }

    @Override
    public final boolean W() {
        int n8 = this.Y();
        return E5.f(this.s, n8, this.S() + n8);
    }

    @Override
    public final boolean X(q3 q32, int n8, int n9) {
        if (n9 <= q32.S()) {
            if (n9 <= q32.S()) {
                if (q32 instanceof A3) {
                    q32 = (A3)q32;
                    byte[] arrby = this.s;
                    byte[] arrby2 = q32.s;
                    int n10 = this.Y();
                    int n11 = this.Y();
                    n8 = q32.Y();
                    while (n11 < n10 + n9) {
                        if (arrby[n11] != arrby2[n8]) {
                            return false;
                        }
                        ++n11;
                        ++n8;
                    }
                    return true;
                }
                return q32.i(0, n9).equals(this.i(0, n9));
            }
            n8 = q32.S();
            q32 = new StringBuilder("Ran off end of other: ");
            q32.append(0);
            q32.append(", ");
            q32.append(n9);
            q32.append(", ");
            q32.append(n8);
            throw new IllegalArgumentException(q32.toString());
        }
        n8 = this.S();
        q32 = new StringBuilder("Length too large: ");
        q32.append(n9);
        q32.append(n8);
        throw new IllegalArgumentException(q32.toString());
    }

    public int Y() {
        return 0;
    }

    @Override
    public byte a(int n8) {
        return this.s[n8];
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof q3)) {
            return false;
        }
        if (this.S() != ((q3)object).S()) {
            return false;
        }
        if (this.S() == 0) {
            return true;
        }
        if (object instanceof A3) {
            object = (A3)object;
            int n8 = this.d();
            int n9 = object.d();
            if (n8 != 0 && n9 != 0 && n8 != n9) {
                return false;
            }
            return this.X((q3)object, 0, this.S());
        }
        return object.equals((Object)this);
    }

    @Override
    public final q3 i(int n8, int n9) {
        n8 = q3.g(0, n9, this.S());
        if (n8 == 0) {
            return q3.p;
        }
        return new u3(this.s, this.Y(), n8);
    }

    @Override
    public final String s(Charset charset) {
        return new String(this.s, this.Y(), this.S(), charset);
    }
}

