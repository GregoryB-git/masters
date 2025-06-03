// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.BigInteger;

public abstract class a
{
    public static final BigInteger a;
    public static final double b;
    public static final double c;
    
    static {
        a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
        b = Math.log(10.0);
        c = Math.log(2.0);
    }
    
    public static BigInteger a(final BigInteger val, final BigInteger val2, final RoundingMode roundingMode) {
        return new BigDecimal(val).divide(new BigDecimal(val2), 0, roundingMode).toBigIntegerExact();
    }
}
