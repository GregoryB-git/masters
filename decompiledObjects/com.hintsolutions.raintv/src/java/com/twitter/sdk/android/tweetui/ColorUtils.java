/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui;

import android.graphics.Color;

final class ColorUtils {
    private ColorUtils() {
    }

    public static int calculateOpacityTransform(double d, int n, int n2) {
        int n3 = Color.red((int)n2);
        int n4 = Color.red((int)n);
        int n5 = Color.green((int)n2);
        int n6 = Color.green((int)n);
        n2 = Color.blue((int)n2);
        n = Color.blue((int)n);
        double d2 = 1.0 - d;
        double d3 = n3;
        n4 = (int)((double)n4 * d + d3 * d2);
        d3 = n5;
        n5 = (int)((double)n6 * d + d3 * d2);
        d3 = n2;
        return Color.rgb((int)n4, (int)n5, (int)((int)(d * (double)n + d2 * d3)));
    }

    public static boolean isLightColor(int n) {
        double d;
        double d2;
        int n2 = Color.red((int)n);
        int n3 = Color.green((int)n);
        boolean bl = (double)(n = Color.blue((int)n)) * 0.07 + ((d2 = (double)n3) * 0.72 + (d = (double)n2) * 0.21) > 128.0;
        return bl;
    }
}

