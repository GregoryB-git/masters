/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.StateListDrawable
 *  android.util.StateSet
 *  androidx.appcompat.content.res.AppCompatResources
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.model.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import androidx.appcompat.content.res.AppCompatResources;
import com.mikepenz.materialdrawer.holder.BadgeStyle;
import com.mikepenz.materialize.holder.ColorHolder;

public class BadgeDrawableBuilder {
    private BadgeStyle mStyle;

    public BadgeDrawableBuilder(BadgeStyle badgeStyle) {
        this.mStyle = badgeStyle;
    }

    public StateListDrawable build(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = (GradientDrawable)AppCompatResources.getDrawable((Context)context, (int)this.mStyle.getGradientDrawable());
        GradientDrawable gradientDrawable2 = (GradientDrawable)gradientDrawable.getConstantState().newDrawable().mutate();
        ColorHolder.applyToOrTransparent((ColorHolder)this.mStyle.getColor(), context, gradientDrawable);
        if (this.mStyle.getColorPressed() == null) {
            ColorHolder.applyToOrTransparent((ColorHolder)this.mStyle.getColor(), context, gradientDrawable2);
        } else {
            ColorHolder.applyToOrTransparent((ColorHolder)this.mStyle.getColorPressed(), context, gradientDrawable2);
        }
        if (this.mStyle.getCorners() != null) {
            gradientDrawable.setCornerRadius((float)this.mStyle.getCorners().asPixel(context));
            gradientDrawable2.setCornerRadius((float)this.mStyle.getCorners().asPixel(context));
        }
        stateListDrawable.addState(new int[]{16842919}, (Drawable)gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, (Drawable)gradientDrawable);
        return stateListDrawable;
    }
}

