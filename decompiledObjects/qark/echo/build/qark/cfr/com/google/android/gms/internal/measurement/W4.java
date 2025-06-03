/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.G4;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.V4;

public final class W4
implements G4 {
    public final I4 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public W4(I4 i42, String string2, Object[] arrobject) {
        char c8;
        this.a = i42;
        this.b = string2;
        this.c = arrobject;
        int n8 = string2.charAt(0);
        if (n8 < 55296) {
            this.d = n8;
            return;
        }
        int n9 = n8 & 8191;
        int n10 = 13;
        n8 = 1;
        while ((c8 = string2.charAt(n8)) >= '\ud800') {
            n9 |= (c8 & 8191) << n10;
            n10 += 13;
            ++n8;
        }
        this.d = n9 | c8 << n10;
    }

    @Override
    public final I4 a() {
        return this.a;
    }

    @Override
    public final V4 b() {
        int n8 = this.d;
        if ((n8 & 1) != 0) {
            return V4.o;
        }
        if ((n8 & 4) == 4) {
            return V4.q;
        }
        return V4.p;
    }

    @Override
    public final boolean c() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }

    public final String d() {
        return this.b;
    }

    public final Object[] e() {
        return this.c;
    }
}

