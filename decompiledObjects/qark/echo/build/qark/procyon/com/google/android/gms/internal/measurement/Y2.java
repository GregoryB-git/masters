// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.util.Log;

public final class Y2 extends S2
{
    public Y2(final a3 a3, final String s, final Double n, final boolean b) {
        super(a3, s, n, true, null);
    }
    
    public final Double o(Object value) {
        if (value instanceof Double) {
            return (Double)value;
        }
        if (value instanceof Float) {
            return (double)value;
        }
        while (true) {
            if (!(value instanceof String)) {
                break Label_0050;
            }
            try {
                return Double.parseDouble((String)value);
                final String k = super.k();
                value = String.valueOf(value);
                final StringBuilder sb = new StringBuilder("Invalid double value for ");
                sb.append(k);
                sb.append(": ");
                sb.append((String)value);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            }
            catch (NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
}
