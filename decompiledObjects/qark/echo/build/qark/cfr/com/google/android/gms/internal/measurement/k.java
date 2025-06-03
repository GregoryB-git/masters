/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.math.RoundingMode
 *  java.text.DecimalFormat
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public final class k
implements s {
    public final Double o;

    public k(Double d8) {
        if (d8 == null) {
            this.o = Double.NaN;
            return;
        }
        this.o = d8;
    }

    @Override
    public final s c() {
        return new k(this.o);
    }

    @Override
    public final Boolean d() {
        boolean bl = !Double.isNaN((double)this.o) && this.o != 0.0;
        return bl;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        object = (k)object;
        return this.o.equals((Object)object.o);
    }

    @Override
    public final Double f() {
        return this.o;
    }

    @Override
    public final String g() {
        if (Double.isNaN((double)this.o)) {
            return "NaN";
        }
        if (Double.isInfinite((double)this.o)) {
            if (this.o > 0.0) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal bigDecimal = BigDecimal.valueOf((double)this.o);
        bigDecimal = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : j.a(bigDecimal);
        Object object = new DecimalFormat("0E0");
        object.setRoundingMode(RoundingMode.HALF_UP);
        int n8 = bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale();
        object.setMinimumFractionDigits(n8 - 1);
        String string2 = object.format((Object)bigDecimal);
        n8 = string2.indexOf("E");
        object = string2;
        if (n8 > 0) {
            if ((n8 = Integer.parseInt((String)string2.substring(n8 + 1))) < 0 && n8 > -7 || n8 >= 0 && n8 < 21) {
                return bigDecimal.toPlainString();
            }
            object = string2.replace((CharSequence)"E-", (CharSequence)"e-").replace((CharSequence)"E", (CharSequence)"e+");
        }
        return object;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override
    public final Iterator k() {
        return null;
    }

    @Override
    public final s s(String string2, f3 f32, List list) {
        if ("toString".equals((Object)string2)) {
            return new u(this.g());
        }
        throw new IllegalArgumentException(String.format((String)"%s.%s is not a function.", (Object[])new Object[]{this.g(), string2}));
    }

    public final String toString() {
        return this.g();
    }
}

