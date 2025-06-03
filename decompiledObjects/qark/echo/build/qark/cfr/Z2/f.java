/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArithmeticException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.RoundingMode
 */
package Z2;

import java.math.RoundingMode;

public abstract class f {
    public static void a(boolean bl, double d8, RoundingMode roundingMode) {
        if (bl) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rounded value is out of range for input ");
        stringBuilder.append(d8);
        stringBuilder.append(" and rounding mode ");
        stringBuilder.append((Object)roundingMode);
        throw new ArithmeticException(stringBuilder.toString());
    }

    public static void b(boolean bl, String string2, int n8, int n9) {
        if (bl) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("overflow: ");
        stringBuilder.append(string2);
        stringBuilder.append("(");
        stringBuilder.append(n8);
        stringBuilder.append(", ");
        stringBuilder.append(n9);
        stringBuilder.append(")");
        throw new ArithmeticException(stringBuilder.toString());
    }

    public static void c(boolean bl, String string2, long l8, long l9) {
        if (bl) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("overflow: ");
        stringBuilder.append(string2);
        stringBuilder.append("(");
        stringBuilder.append(l8);
        stringBuilder.append(", ");
        stringBuilder.append(l9);
        stringBuilder.append(")");
        throw new ArithmeticException(stringBuilder.toString());
    }

    public static long d(String string2, long l8) {
        if (l8 >= 0L) {
            return l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(l8);
        stringBuilder.append(") must be >= 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void e(boolean bl) {
        if (bl) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}

