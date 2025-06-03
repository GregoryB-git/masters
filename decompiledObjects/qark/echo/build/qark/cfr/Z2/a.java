/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.math.RoundingMode
 */
package Z2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public abstract class a {
    public static final BigInteger a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    public static final double b = Math.log((double)10.0);
    public static final double c = Math.log((double)2.0);

    public static BigInteger a(BigInteger bigInteger2, BigInteger bigInteger3, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger2).divide(new BigDecimal(bigInteger3), 0, roundingMode).toBigIntegerExact();
    }
}

