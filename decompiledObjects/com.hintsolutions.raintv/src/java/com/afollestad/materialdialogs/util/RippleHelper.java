/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  androidx.annotation.ColorInt
 *  java.lang.Object
 */
package com.afollestad.materialdialogs.util;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ColorInt;

@TargetApi(value=21)
public class RippleHelper {
    public static void applyColor(Drawable drawable2, @ColorInt int n) {
        if (drawable2 instanceof RippleDrawable) {
            ((RippleDrawable)drawable2).setColor(ColorStateList.valueOf((int)n));
        }
    }
}

