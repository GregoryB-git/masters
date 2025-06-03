package Z2;

import W2.m;

/* loaded from: classes.dex */
public abstract class c {
    public static long a(double d7) {
        m.e(b(d7), "not a normal value");
        int exponent = Math.getExponent(d7);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d7) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d7) {
        return Math.getExponent(d7) <= 1023;
    }
}
