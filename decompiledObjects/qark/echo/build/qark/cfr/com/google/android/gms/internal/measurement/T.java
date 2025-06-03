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

public final class T
implements P {
    public final f3 a;
    public final String b;

    public T(f3 f32, String string2) {
        this.a = f32;
        this.b = string2;
    }

    @Override
    public final f3 a(s s8) {
        this.a.e(this.b, s8);
        return this.a;
    }
}

