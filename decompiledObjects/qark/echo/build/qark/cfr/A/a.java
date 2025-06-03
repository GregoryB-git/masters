/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ThreadLocal
 */
package A;

import android.graphics.Color;

public abstract class a {
    public static final ThreadLocal a = new ThreadLocal();

    public static int a(double d8, double d9, double d10) {
        double d11 = (3.2406 * d8 + -1.5372 * d9 + -0.4986 * d10) / 100.0;
        double d12 = (-0.9689 * d8 + 1.8758 * d9 + 0.0415 * d10) / 100.0;
        d10 = (0.0557 * d8 + -0.204 * d9 + 1.057 * d10) / 100.0;
        d8 = d11 > 0.0031308 ? Math.pow((double)d11, (double)0.4166666666666667) * 1.055 - 0.055 : d11 * 12.92;
        d9 = d12 > 0.0031308 ? Math.pow((double)d12, (double)0.4166666666666667) * 1.055 - 0.055 : d12 * 12.92;
        d10 = d10 > 0.0031308 ? Math.pow((double)d10, (double)0.4166666666666667) * 1.055 - 0.055 : (d10 *= 12.92);
        return Color.rgb((int)a.e((int)Math.round((double)(d8 * 255.0)), 0, 255), (int)a.e((int)Math.round((double)(d9 * 255.0)), 0, 255), (int)a.e((int)Math.round((double)(d10 * 255.0)), 0, 255));
    }

    public static int b(int n8, int n9) {
        return 255 - (255 - n9) * (255 - n8) / 255;
    }

    public static int c(int n8, int n9) {
        int n10 = Color.alpha((int)n9);
        int n11 = Color.alpha((int)n8);
        int n12 = a.b(n11, n10);
        return Color.argb((int)n12, (int)a.d(Color.red((int)n8), n11, Color.red((int)n9), n10, n12), (int)a.d(Color.green((int)n8), n11, Color.green((int)n9), n10, n12), (int)a.d(Color.blue((int)n8), n11, Color.blue((int)n9), n10, n12));
    }

    public static int d(int n8, int n9, int n10, int n11, int n12) {
        if (n12 == 0) {
            return 0;
        }
        return (n8 * 255 * n9 + n10 * n11 * (255 - n9)) / (n12 * 255);
    }

    public static int e(int n8, int n9, int n10) {
        if (n8 < n9) {
            return n9;
        }
        return Math.min((int)n8, (int)n10);
    }

    public static int f(int n8, int n9) {
        if (n9 >= 0 && n9 <= 255) {
            return n8 & 16777215 | n9 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}

