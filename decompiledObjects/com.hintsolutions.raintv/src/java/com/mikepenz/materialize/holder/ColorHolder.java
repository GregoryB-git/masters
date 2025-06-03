/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.GradientDrawable
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.AttrRes
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.core.content.ContextCompat
 *  java.lang.Object
 */
package com.mikepenz.materialize.holder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.mikepenz.materialize.util.UIUtils;

public class ColorHolder {
    private int mColorInt = 0;
    private int mColorRes = -1;

    public static void applyToOr(ColorHolder colorHolder, TextView textView, ColorStateList colorStateList) {
        if (colorHolder != null && textView != null) {
            colorHolder.applyToOr(textView, colorStateList);
        } else if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static void applyToOrTransparent(ColorHolder colorHolder, Context context, GradientDrawable gradientDrawable) {
        if (colorHolder != null && gradientDrawable != null) {
            colorHolder.applyTo(context, gradientDrawable);
        } else if (gradientDrawable != null) {
            gradientDrawable.setColor(0);
        }
    }

    public static int color(ColorHolder colorHolder, Context context) {
        if (colorHolder == null) {
            return 0;
        }
        return colorHolder.color(context);
    }

    public static int color(ColorHolder colorHolder, Context context, @AttrRes int n, @ColorRes int n2) {
        if (colorHolder == null) {
            return UIUtils.getThemeColorFromAttrOrRes(context, n, n2);
        }
        return colorHolder.color(context, n, n2);
    }

    public static ColorHolder fromColor(@ColorInt int n) {
        ColorHolder colorHolder = new ColorHolder();
        colorHolder.mColorInt = n;
        return colorHolder;
    }

    public static ColorHolder fromColorRes(@ColorRes int n) {
        ColorHolder colorHolder = new ColorHolder();
        colorHolder.mColorRes = n;
        return colorHolder;
    }

    public void applyTo(Context context, GradientDrawable gradientDrawable) {
        int n = this.mColorInt;
        if (n != 0) {
            gradientDrawable.setColor(n);
        } else {
            n = this.mColorRes;
            if (n != -1) {
                gradientDrawable.setColor(ContextCompat.getColor((Context)context, (int)n));
            }
        }
    }

    public void applyToBackground(View view) {
        int n = this.mColorInt;
        if (n != 0) {
            view.setBackgroundColor(n);
        } else {
            n = this.mColorRes;
            if (n != -1) {
                view.setBackgroundResource(n);
            }
        }
    }

    public void applyToOr(TextView textView, ColorStateList colorStateList) {
        int n = this.mColorInt;
        if (n != 0) {
            textView.setTextColor(n);
        } else if (this.mColorRes != -1) {
            textView.setTextColor(ContextCompat.getColor((Context)textView.getContext(), (int)this.mColorRes));
        } else if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public int color(Context context) {
        int n;
        if (this.mColorInt == 0 && (n = this.mColorRes) != -1) {
            this.mColorInt = ContextCompat.getColor((Context)context, (int)n);
        }
        return this.mColorInt;
    }

    public int color(Context context, @AttrRes int n, @ColorRes int n2) {
        int n3 = this.color(context);
        if (n3 == 0) {
            return UIUtils.getThemeColorFromAttrOrRes(context, n, n2);
        }
        return n3;
    }

    public int getColorInt() {
        return this.mColorInt;
    }

    public int getColorRes() {
        return this.mColorRes;
    }

    public void setColorInt(int n) {
        this.mColorInt = n;
    }

    public void setColorRes(int n) {
        this.mColorRes = n;
    }
}

