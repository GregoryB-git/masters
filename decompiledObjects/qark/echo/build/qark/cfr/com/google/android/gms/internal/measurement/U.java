/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import java.util.List;

public final class U
extends A {
    @Override
    public final s b(String string2, f3 f32, List list) {
        if (string2 != null && !string2.isEmpty() && f32.g(string2)) {
            s s8 = f32.c(string2);
            if (s8 instanceof n) {
                return ((n)s8).b(f32, list);
            }
            throw new IllegalArgumentException(String.format((String)"Function %s is not defined", (Object[])new Object[]{string2}));
        }
        throw new IllegalArgumentException(String.format((String)"Command not found: %s", (Object[])new Object[]{string2}));
    }
}

