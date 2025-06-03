// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z2;

import java.math.RoundingMode;

public abstract class f
{
    public static void a(final boolean b, final double d, final RoundingMode obj) {
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("rounded value is out of range for input ");
        sb.append(d);
        sb.append(" and rounding mode ");
        sb.append(obj);
        throw new ArithmeticException(sb.toString());
    }
    
    public static void b(final boolean b, final String str, final int i, final int j) {
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }
    
    public static void c(final boolean b, final String str, final long lng, final long lng2) {
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(lng);
        sb.append(", ");
        sb.append(lng2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }
    
    public static long d(final String str, final long lng) {
        if (lng >= 0L) {
            return lng;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(lng);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void e(final boolean b) {
        if (b) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}
