/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  java.lang.Object
 */
package com.github.vipulasri.timelineview;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Utils {
    public static int dpToPx(float f2, Context context) {
        return Utils.dpToPx(f2, context.getResources());
    }

    public static int dpToPx(float f2, Resources resources) {
        return (int)TypedValue.applyDimension((int)1, (float)f2, (DisplayMetrics)resources.getDisplayMetrics());
    }
}

