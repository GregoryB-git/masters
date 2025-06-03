/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;

public class ThemeUtils {
    private ThemeUtils() {
    }

    public static int getColorFromAttrRes(int n3, int n7, Context context) {
        context = context.obtainStyledAttributes(new int[]{n3});
        try {
            n3 = context.getColor(0, n7);
            return n3;
        }
        finally {
            context.recycle();
        }
    }

    public static float getFloatFromAttrRes(int n3, float f7, Context context) {
        context = context.obtainStyledAttributes(new int[]{n3});
        try {
            f7 = context.getFloat(0, f7);
            return f7;
        }
        finally {
            context.recycle();
        }
    }
}

