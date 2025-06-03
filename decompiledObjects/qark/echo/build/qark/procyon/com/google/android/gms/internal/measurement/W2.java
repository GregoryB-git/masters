// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.util.Log;

public final class W2 extends S2
{
    public W2(final a3 a3, final String s, final Long n, final boolean b) {
        super(a3, s, n, true, null);
    }
    
    public final Long o(Object value) {
        if (value instanceof Long) {
            return (Long)value;
        }
        while (true) {
            if (!(value instanceof String)) {
                break Label_0032;
            }
            try {
                return Long.parseLong((String)value);
                final String k = super.k();
                value = String.valueOf(value);
                final StringBuilder sb = new StringBuilder("Invalid long value for ");
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
