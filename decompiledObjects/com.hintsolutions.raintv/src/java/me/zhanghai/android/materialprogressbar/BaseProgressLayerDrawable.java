/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.util.Log
 *  androidx.annotation.ColorInt
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.core.graphics.ColorUtils
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable;
import me.zhanghai.android.materialprogressbar.MaterialProgressDrawable;
import me.zhanghai.android.materialprogressbar.R;
import me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;
import me.zhanghai.android.materialprogressbar.TintableDrawable;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

class BaseProgressLayerDrawable<ProgressDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable, BackgroundDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable>
extends LayerDrawable
implements IntrinsicPaddingDrawable,
MaterialProgressDrawable,
ShowBackgroundDrawable,
TintableDrawable {
    private float mBackgroundAlpha;
    private BackgroundDrawableType mBackgroundDrawable;
    private ProgressDrawableType mProgressDrawable;
    private ProgressDrawableType mSecondaryProgressDrawable;

    public BaseProgressLayerDrawable(Drawable[] drawableArray, Context context) {
        super(drawableArray);
        this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes(0x1010033, 0.0f, context);
        this.setId(0, 0x1020000);
        this.mBackgroundDrawable = (IntrinsicPaddingDrawable)this.getDrawable(0);
        this.setId(1, 16908303);
        this.mSecondaryProgressDrawable = (IntrinsicPaddingDrawable)this.getDrawable(1);
        this.setId(2, 16908301);
        this.mProgressDrawable = (IntrinsicPaddingDrawable)this.getDrawable(2);
        this.setTint(ThemeUtils.getColorFromAttrRes(R.attr.colorControlActivated, -16777216, context));
    }

    @Override
    public boolean getShowBackground() {
        return ((ShowBackgroundDrawable)this.mBackgroundDrawable).getShowBackground();
    }

    @Override
    public boolean getUseIntrinsicPadding() {
        return this.mBackgroundDrawable.getUseIntrinsicPadding();
    }

    @Override
    public void setShowBackground(boolean bl2) {
        if (((ShowBackgroundDrawable)this.mBackgroundDrawable).getShowBackground() != bl2) {
            ((ShowBackgroundDrawable)this.mBackgroundDrawable).setShowBackground(bl2);
            ((ShowBackgroundDrawable)this.mSecondaryProgressDrawable).setShowBackground(bl2 ^ true);
        }
    }

    @Override
    @SuppressLint(value={"NewApi"})
    public void setTint(@ColorInt int n2) {
        int n6 = ColorUtils.setAlphaComponent((int)n2, (int)Math.round((float)((float)Color.alpha((int)n2) * this.mBackgroundAlpha)));
        ((TintableDrawable)this.mBackgroundDrawable).setTint(n6);
        ((TintableDrawable)this.mSecondaryProgressDrawable).setTint(n6);
        ((TintableDrawable)this.mProgressDrawable).setTint(n2);
    }

    @Override
    @SuppressLint(value={"NewApi"})
    public void setTintList(@Nullable ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w((String)this.getClass().getSimpleName(), (String)"setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateList2 = colorStateList.withAlpha(Math.round((float)(this.mBackgroundAlpha * 255.0f)));
        } else {
            colorStateList2 = null;
        }
        ((TintableDrawable)this.mBackgroundDrawable).setTintList(colorStateList2);
        ((TintableDrawable)this.mSecondaryProgressDrawable).setTintList(colorStateList2);
        ((TintableDrawable)this.mProgressDrawable).setTintList(colorStateList);
    }

    @Override
    @SuppressLint(value={"NewApi"})
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        ((TintableDrawable)this.mBackgroundDrawable).setTintMode(mode);
        ((TintableDrawable)this.mSecondaryProgressDrawable).setTintMode(mode);
        ((TintableDrawable)this.mProgressDrawable).setTintMode(mode);
    }

    @Override
    public void setUseIntrinsicPadding(boolean bl2) {
        this.mBackgroundDrawable.setUseIntrinsicPadding(bl2);
        this.mSecondaryProgressDrawable.setUseIntrinsicPadding(bl2);
        this.mProgressDrawable.setUseIntrinsicPadding(bl2);
    }
}

