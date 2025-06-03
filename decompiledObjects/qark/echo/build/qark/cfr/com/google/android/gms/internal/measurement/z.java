/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.s;
import java.util.Iterator;
import java.util.List;

public final class z
implements s {
    @Override
    public final s c() {
        return s.d;
    }

    @Override
    public final Boolean d() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof z;
    }

    @Override
    public final Double f() {
        return Double.NaN;
    }

    @Override
    public final String g() {
        return "undefined";
    }

    @Override
    public final Iterator k() {
        return null;
    }

    @Override
    public final s s(String string2, f3 f32, List list) {
        throw new IllegalStateException(String.format((String)"Undefined has no function %s", (Object[])new Object[]{string2}));
    }
}

