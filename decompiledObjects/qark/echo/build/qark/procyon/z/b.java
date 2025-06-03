// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

import android.graphics.Color;
import A.a;

public abstract class b
{
    public static final float[][] a;
    public static final float[][] b;
    public static final float[] c;
    public static final float[][] d;
    
    static {
        a = new float[][] { { 0.401288f, 0.650173f, -0.051461f }, { -0.250268f, 1.204414f, 0.045854f }, { -0.002079f, 0.048952f, 0.953127f } };
        b = new float[][] { { 1.8620678f, -1.0112547f, 0.14918678f }, { 0.38752654f, 0.62144744f, -0.00897398f }, { -0.0158415f, -0.03412294f, 1.0499644f } };
        c = new float[] { 95.047f, 100.0f, 108.883f };
        d = new float[][] { { 0.41233894f, 0.35762063f, 0.18051042f }, { 0.2126f, 0.7152f, 0.0722f }, { 0.01932141f, 0.11916382f, 0.9503448f } };
    }
    
    public static int a(float n) {
        if (n < 1.0f) {
            return -16777216;
        }
        if (n > 99.0f) {
            return -1;
        }
        final float n2 = (n + 16.0f) / 116.0f;
        if (n > 8.0f) {
            n = n2 * n2 * n2;
        }
        else {
            n /= 903.2963f;
        }
        float n3 = n2 * n2 * n2;
        final boolean b = n3 > 0.008856452f;
        float n4;
        if (b) {
            n4 = n3;
        }
        else {
            n4 = (n2 * 116.0f - 16.0f) / 903.2963f;
        }
        if (!b) {
            n3 = (n2 * 116.0f - 16.0f) / 903.2963f;
        }
        final float[] c = z.b.c;
        return A.a.a(n4 * c[0], n * c[1], n3 * c[2]);
    }
    
    public static float b(final int n) {
        return c(g(n));
    }
    
    public static float c(float n) {
        n /= 100.0f;
        if (n <= 0.008856452f) {
            return n * 903.2963f;
        }
        return (float)Math.cbrt(n) * 116.0f - 16.0f;
    }
    
    public static float d(final float n, final float n2, final float n3) {
        return n + (n2 - n) * n3;
    }
    
    public static float e(final int n) {
        final float n2 = n / 255.0f;
        float n3;
        if (n2 <= 0.04045f) {
            n3 = n2 / 12.92f;
        }
        else {
            n3 = (float)Math.pow((n2 + 0.055f) / 1.055f, 2.4000000953674316);
        }
        return n3 * 100.0f;
    }
    
    public static float[] f(final int n) {
        final float e = e(Color.red(n));
        final float e2 = e(Color.green(n));
        final float e3 = e(Color.blue(n));
        final float[][] d = z.b.d;
        final float[] array = d[0];
        final float n2 = array[0];
        final float n3 = array[1];
        final float n4 = array[2];
        final float[] array2 = d[1];
        final float n5 = array2[0];
        final float n6 = array2[1];
        final float n7 = array2[2];
        final float[] array3 = d[2];
        return new float[] { n2 * e + n3 * e2 + n4 * e3, n5 * e + n6 * e2 + n7 * e3, e * array3[0] + e2 * array3[1] + e3 * array3[2] };
    }
    
    public static float g(final int n) {
        final float e = e(Color.red(n));
        final float e2 = e(Color.green(n));
        final float e3 = e(Color.blue(n));
        final float[] array = z.b.d[1];
        return e * array[0] + e2 * array[1] + e3 * array[2];
    }
    
    public static float h(float n) {
        if (n > 8.0f) {
            n = (float)Math.pow((n + 16.0) / 116.0, 3.0);
        }
        else {
            n /= 903.2963f;
        }
        return n * 100.0f;
    }
}
