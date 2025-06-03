// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.math.BigInteger;
import java.math.BigDecimal;

public final class k implements s
{
    public final Double o;
    
    public k(final Double o) {
        if (o == null) {
            this.o = Double.NaN;
            return;
        }
        this.o = o;
    }
    
    @Override
    public final s c() {
        return new k(this.o);
    }
    
    @Override
    public final Boolean d() {
        return !Double.isNaN(this.o) && this.o != 0.0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof k && this.o.equals(((k)o).o));
    }
    
    @Override
    public final Double f() {
        return this.o;
    }
    
    @Override
    public final String g() {
        if (Double.isNaN(this.o)) {
            return "NaN";
        }
        if (!Double.isInfinite(this.o)) {
            final BigDecimal value = BigDecimal.valueOf(this.o);
            BigDecimal a;
            if (value.signum() == 0) {
                a = new BigDecimal(BigInteger.ZERO, 0);
            }
            else {
                a = com.google.android.gms.internal.measurement.j.a(value);
            }
            final DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            int n;
            if (a.scale() > 0) {
                n = a.precision();
            }
            else {
                n = a.scale();
            }
            decimalFormat.setMinimumFractionDigits(n - 1);
            final String format = decimalFormat.format(a);
            final int index = format.indexOf("E");
            String replace = format;
            if (index > 0) {
                final int int1 = Integer.parseInt(format.substring(index + 1));
                if ((int1 < 0 && int1 > -7) || (int1 >= 0 && int1 < 21)) {
                    return a.toPlainString();
                }
                replace = format.replace("E-", "e-").replace("E", "e+");
            }
            return replace;
        }
        if (this.o > 0.0) {
            return "Infinity";
        }
        return "-Infinity";
    }
    
    @Override
    public final int hashCode() {
        return this.o.hashCode();
    }
    
    @Override
    public final Iterator k() {
        return null;
    }
    
    @Override
    public final s s(final String anObject, final f3 f3, final List list) {
        if ("toString".equals(anObject)) {
            return new u(this.g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", this.g(), anObject));
    }
    
    @Override
    public final String toString() {
        return this.g();
    }
}
