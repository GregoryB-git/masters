/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D5;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.t4;
import com.google.android.gms.internal.measurement.u4;
import java.util.Collection;

public final class r4
extends q4 {
    public r4() {
        super(null);
    }

    public /* synthetic */ r4(u4 u42) {
        this();
    }

    public static h4 e(Object object, long l8) {
        return (h4)D5.B(object, l8);
    }

    @Override
    public final void b(Object object, Object object2, long l8) {
        Object object3 = r4.e(object, l8);
        h4 h42 = r4.e(object2, l8);
        int n8 = object3.size();
        int n9 = h42.size();
        object2 = object3;
        if (n8 > 0) {
            object2 = object3;
            if (n9 > 0) {
                object2 = object3;
                if (!object3.c()) {
                    object2 = object3.e(n9 + n8);
                }
                object2.addAll((Collection)h42);
            }
        }
        object3 = h42;
        if (n8 > 0) {
            object3 = object2;
        }
        D5.j(object, l8, object3);
    }

    @Override
    public final void d(Object object, long l8) {
        r4.e(object, l8).G();
    }
}

