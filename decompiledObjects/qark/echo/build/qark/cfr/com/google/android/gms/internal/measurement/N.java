/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.s;

public final class N
implements P {
    public final f3 a;
    public final String b;

    public N(f3 f32, String string2) {
        this.a = f32;
        this.b = string2;
    }

    @Override
    public final f3 a(s s8) {
        f3 f32 = this.a.d();
        f32.f(this.b, s8);
        return f32;
    }
}

