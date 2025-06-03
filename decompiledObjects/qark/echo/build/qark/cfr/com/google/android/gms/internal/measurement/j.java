/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.math.BigDecimal
 *  java.math.BigInteger
 */
package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class j {
    public static /* synthetic */ BigDecimal a(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return new BigDecimal(BigInteger.ZERO, 0);
        }
        return bigDecimal.stripTrailingZeros();
    }
}

