/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  java.lang.Math
 *  java.lang.Object
 */
package z;

import A.a;
import android.graphics.Color;

public abstract class b {
    public static final float[][] a;
    public static final float[][] b;
    public static final float[] c;
    public static final float[][] d;

    static {
        float[] arrf = new float[]{0.401288f, 0.650173f, -0.051461f};
        float[] arrf2 = new float[]{-0.002079f, 0.048952f, 0.953127f};
        a = new float[][]{arrf, {-0.250268f, 1.204414f, 0.045854f}, arrf2};
        b = new float[][]{{1.8620678f, -1.0112547f, 0.14918678f}, {0.38752654f, 0.62144744f, -0.00897398f}, {-0.0158415f, -0.03412294f, 1.0499644f}};
        c = new float[]{95.047f, 100.0f, 108.883f};
        arrf = new float[]{0.41233894f, 0.35762063f, 0.18051042f};
        arrf2 = new float[]{0.01932141f, 0.11916382f, 0.9503448f};
        d = new float[][]{arrf, {0.2126f, 0.7152f, 0.0722f}, arrf2};
    }

    public static int a(float f8) {
        if (f8 < 1.0f) {
            return -16777216;
        }
        if (f8 > 99.0f) {
            return -1;
        }
        float f9 = (f8 + 16.0f) / 116.0f;
        f8 = f8 > 8.0f ? f9 * f9 * f9 : (f8 /= 903.2963f);
        float f10 = f9 * f9 * f9;
        boolean bl = f10 > 0.008856452f;
        float f11 = bl ? f10 : (f9 * 116.0f - 16.0f) / 903.2963f;
        if (!bl) {
            f10 = (f9 * 116.0f - 16.0f) / 903.2963f;
        }
        float[] arrf = c;
        return a.a(f11 * arrf[0], f8 * arrf[1], f10 * arrf[2]);
    }

    public static float b(int n8) {
        return b.c(b.g(n8));
    }

    public static float c(float f8) {
        if ((f8 /= 100.0f) <= 0.008856452f) {
            return f8 * 903.2963f;
        }
        return (float)Math.cbrt((double)f8) * 116.0f - 16.0f;
    }

    public static float d(float f8, float f9, float f10) {
        return f8 + (f9 - f8) * f10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float e(int n8) {
        float f8 = (float)n8 / 255.0f;
        if (f8 <= 0.04045f) {
            f8 /= 12.92f;
            do {
                return f8 * 100.0f;
                break;
            } while (true);
        }
        f8 = (float)Math.pow((double)((f8 + 0.055f) / 1.055f), (double)2.4000000953674316);
        return f8 * 100.0f;
    }

    public static float[] f(int n8) {
        float f8 = b.e(Color.red((int)n8));
        float f9 = b.e(Color.green((int)n8));
        float f10 = b.e(Color.blue((int)n8));
        float[][] arrf = d;
        float[] arrf2 = arrf[0];
        float f11 = arrf2[0];
        float f12 = arrf2[1];
        float f13 = arrf2[2];
        arrf2 = arrf[1];
        float f14 = arrf2[0];
        float f15 = arrf2[1];
        float f16 = arrf2[2];
        arrf = arrf[2];
        return new float[]{f11 * f8 + f12 * f9 + f13 * f10, f14 * f8 + f15 * f9 + f16 * f10, f8 * arrf[0] + f9 * arrf[1] + f10 * arrf[2]};
    }

    public static float g(int n8) {
        float f8 = b.e(Color.red((int)n8));
        float f9 = b.e(Color.green((int)n8));
        float f10 = b.e(Color.blue((int)n8));
        float[] arrf = d[1];
        return f8 * arrf[0] + f9 * arrf[1] + f10 * arrf[2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float h(float f8) {
        if (f8 > 8.0f) {
            f8 = (float)Math.pow((double)(((double)f8 + 16.0) / 116.0), (double)3.0);
            do {
                return f8 * 100.0f;
                break;
            } while (true);
        }
        f8 /= 903.2963f;
        return f8 * 100.0f;
    }
}

