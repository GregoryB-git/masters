// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import android.graphics.Color;

public abstract class a
{
    public static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    public static int a(double n, double n2, double a) {
        final double a2 = (3.2406 * n + -1.5372 * n2 + -0.4986 * a) / 100.0;
        final double a3 = (-0.9689 * n + 1.8758 * n2 + 0.0415 * a) / 100.0;
        a = (0.0557 * n + -0.204 * n2 + 1.057 * a) / 100.0;
        if (a2 > 0.0031308) {
            n = Math.pow(a2, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n = a2 * 12.92;
        }
        if (a3 > 0.0031308) {
            n2 = Math.pow(a3, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n2 = a3 * 12.92;
        }
        if (a > 0.0031308) {
            a = Math.pow(a, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            a *= 12.92;
        }
        return Color.rgb(e((int)Math.round(n * 255.0), 0, 255), e((int)Math.round(n2 * 255.0), 0, 255), e((int)Math.round(a * 255.0), 0, 255));
    }
    
    public static int b(final int n, final int n2) {
        return 255 - (255 - n2) * (255 - n) / 255;
    }
    
    public static int c(final int n, final int n2) {
        final int alpha = Color.alpha(n2);
        final int alpha2 = Color.alpha(n);
        final int b = b(alpha2, alpha);
        return Color.argb(b, d(Color.red(n), alpha2, Color.red(n2), alpha, b), d(Color.green(n), alpha2, Color.green(n2), alpha, b), d(Color.blue(n), alpha2, Color.blue(n2), alpha, b));
    }
    
    public static int d(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return 0;
        }
        return (n * 255 * n2 + n3 * n4 * (255 - n2)) / (n5 * 255);
    }
    
    public static int e(final int a, final int n, final int b) {
        if (a < n) {
            return n;
        }
        return Math.min(a, b);
    }
    
    public static int f(final int n, final int n2) {
        if (n2 >= 0 && n2 <= 255) {
            return (n & 0xFFFFFF) | n2 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
