/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Double
 *  java.lang.Float
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

public final class Y2
extends S2 {
    public Y2(a3 a32, String string2, Double d8, boolean bl) {
        super(a32, string2, (Object)d8, true, null);
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
    public final Double o(Object object) {
        if (object instanceof Double) {
            return (Double)object;
        }
        if (object instanceof Float) {
            return ((Float)object).doubleValue();
        }
        if (object instanceof String) {
            double d8;
            try {
                d8 = Double.parseDouble((String)((String)object));
            }
            catch (NumberFormatException numberFormatException) {}
            return d8;
        }
        String string2 = super.k();
        object = String.valueOf((Object)object);
        StringBuilder stringBuilder = new StringBuilder("Invalid double value for ");
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        Log.e((String)"PhenotypeFlag", (String)stringBuilder.toString());
        return null;
    }
}

