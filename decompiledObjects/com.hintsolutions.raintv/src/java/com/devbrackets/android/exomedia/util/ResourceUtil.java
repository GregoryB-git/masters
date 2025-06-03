/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.util.TypedValue
 *  androidx.annotation.AnyRes
 *  androidx.annotation.AttrRes
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DrawableRes
 *  androidx.core.graphics.drawable.DrawableCompat
 *  java.lang.Object
 */
package com.devbrackets.android.exomedia.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.graphics.drawable.DrawableCompat;

public class ResourceUtil {
    @ColorInt
    public static int getColor(Context context, @ColorRes int n) {
        return context.getResources().getColor(n, context.getTheme());
    }

    public static ColorStateList getColorStateList(Context context, @ColorRes int n) {
        return context.getResources().getColorStateList(n, context.getTheme());
    }

    public static Drawable getDrawable(Context context, @DrawableRes int n) {
        return context.getResources().getDrawable(n, context.getTheme());
    }

    @AnyRes
    public static int getResolvedResourceId(Context context, @AttrRes int n) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n, typedValue, true);
        if (typedValue.type == 1) {
            return typedValue.data;
        }
        return typedValue.resourceId;
    }

    public static Drawable tint(Context context, @DrawableRes int n, @ColorRes int n2) {
        return ResourceUtil.tint(context, ResourceUtil.getDrawable(context, n).mutate(), n2);
    }

    public static Drawable tint(Context context, Drawable drawable2, @ColorRes int n) {
        drawable2 = DrawableCompat.wrap((Drawable)drawable2);
        DrawableCompat.setTint((Drawable)drawable2, (int)ResourceUtil.getColor(context, n));
        return drawable2;
    }

    public static Drawable tintList(Context context, @DrawableRes int n, @ColorRes int n2) {
        return ResourceUtil.tintList(context, ResourceUtil.getDrawable(context, n).mutate(), n2);
    }

    public static Drawable tintList(Context context, Drawable drawable2, @ColorRes int n) {
        drawable2 = DrawableCompat.wrap((Drawable)drawable2);
        DrawableCompat.setTintList((Drawable)drawable2, (ColorStateList)ResourceUtil.getColorStateList(context, n));
        return drawable2;
    }
}

