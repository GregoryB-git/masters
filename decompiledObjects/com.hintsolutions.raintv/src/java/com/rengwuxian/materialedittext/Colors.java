/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  java.lang.Math
 *  java.lang.Object
 */
package com.rengwuxian.materialedittext;

import android.graphics.Color;

public class Colors {
    public static boolean isLight(int n) {
        int n2 = Color.red((int)n);
        double d = Color.red((int)n) * n2;
        n2 = Color.green((int)n);
        double d2 = Color.green((int)n) * n2;
        n2 = Color.blue((int)n);
        boolean bl = Math.sqrt((double)((double)(Color.blue((int)n) * n2) * 0.068 + (d2 * 0.691 + d * 0.241))) > 130.0;
        return bl;
    }
}

