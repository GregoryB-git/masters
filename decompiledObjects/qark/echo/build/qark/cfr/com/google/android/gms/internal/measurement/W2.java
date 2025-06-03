/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.c3;

public final class W2
extends S2 {
    public W2(a3 a32, String string2, Long l8, boolean bl) {
        super(a32, string2, (Object)l8, true, null);
    }

    @Override
    public final /* synthetic */ Object h(Object object) {
        return this.o(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Long o(Object object) {
        if (object instanceof Long) {
            return (Long)object;
        }
        if (object instanceof String) {
            long l8;
            try {
                l8 = Long.parseLong((String)((String)object));
            }
            catch (NumberFormatException numberFormatException) {}
            return l8;
        }
        String string2 = super.k();
        object = String.valueOf((Object)object);
        StringBuilder stringBuilder = new StringBuilder("Invalid long value for ");
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        Log.e((String)"PhenotypeFlag", (String)stringBuilder.toString());
        return null;
    }
}

