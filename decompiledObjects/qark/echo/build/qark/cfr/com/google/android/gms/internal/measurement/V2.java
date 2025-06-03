/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.c3;
import com.google.android.gms.internal.measurement.t2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class V2
extends S2 {
    public V2(a3 a32, String string2, Boolean bl, boolean bl2) {
        super(a32, string2, (Object)bl, true, null);
    }

    @Override
    public final /* synthetic */ Object h(Object object) {
        String string2;
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        if (object instanceof String) {
            string2 = (String)object;
            if (t2.c.matcher((CharSequence)string2).matches()) {
                return Boolean.TRUE;
            }
            if (t2.d.matcher((CharSequence)string2).matches()) {
                return Boolean.FALSE;
            }
        }
        string2 = super.k();
        object = String.valueOf((Object)object);
        StringBuilder stringBuilder = new StringBuilder("Invalid boolean value for ");
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        Log.e((String)"PhenotypeFlag", (String)stringBuilder.toString());
        return null;
    }
}

